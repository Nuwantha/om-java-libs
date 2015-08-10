package nl.wur.fbr.om.vocabularytool;

import nl.wur.fbr.om.core.impl.units.PrefixedBaseUnitImpl;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.*;
import nl.wur.fbr.om.om18.set.OMUnitAndScaleFactory;
import nl.wur.fbr.om.prefixes.DecimalPrefix;
import org.openrdf.model.Literal;
import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.query.*;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.sail.SailRepository;
import org.openrdf.rio.RDFFormat;
import org.openrdf.sail.memory.MemoryStore;

import java.io.*;
import java.util.*;

/**
 * This class is the main class for the OM vocabulary creation tool, which can be used to create classes
 * with static strings for each of the unit and scale identifiers. These static strings can be used to create
 * instances of units and scales.
 *
 * @author Don Willems on 09/08/15.
 */
public class OMVocabularyCreationTool {

    private static OMUnitAndScaleFactory factory;


    /**
     * Gets the input from the System.in stream, i.e. the user is requested to type the input in to the console.
     * @param question The question posed to the user.
     * @return The input of the user in the console.
     */
    private static String getInput(String question){
        return OMVocabularyCreationTool.getInput(question,null);
    }

    /**
     * Gets the input from the System.in stream, i.e. the user is requested to type the input in to the console.
     * @param question The question posed to the user.
     * @param prefix A possible prefix to the user input.
     * @return The input of the user in the console.
     */
    private static String getInput(String question,String prefix){
        if(prefix==null) prefix = "";
        System.out.print(question + ": " + prefix);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            input = br.readLine();
        } catch (IOException ioe) {
            System.out.println("IO ERROR trying to read input to "+question+"!");
            System.exit(1);
        }
        return input;
    }

    /**
     * Creates the OM vocabulary from the OM ontology file in the specified target package in the specified
     * output directory.
     * @param inputOM The path to the OM ontology file/
     * @param targetPackage The target java package.
     * @param outputDir The output directory to which the files are written.
     * @throws Exception When the vocabulary could not be created.
     */
    private static void createVocabulary(String inputOM, String targetPackage, String outputDir) throws Exception {
        System.out.println("\nCreating vocabulary:");
        System.out.println("    OM file: "+inputOM);
        System.out.println("    target Java package: "+targetPackage);
        System.out.println("    output directory: "+outputDir);

        File omfile = new File(inputOM);
        if(!omfile.exists()) {
            throw new Exception("OM file at: "+inputOM+" does not exist!");
        }
        if(!omfile.canRead()) {
            throw new Exception("Cannot read OM file at: "+inputOM);
        }
        File outdir = new File(outputDir);
        if(outdir.exists() && !outdir.isDirectory()){
            throw new Exception("Output directory at "+outputDir+" is not a directory.");
        }
        if(!outdir.exists()) {
            outdir.mkdirs();
        }

        // Create in memory triple store for querying
        Repository repository = new SailRepository(new MemoryStore());
        factory = new OMUnitAndScaleFactory(repository);
        try {
            repository.initialize();
        } catch (RepositoryException e) {
            throw new UnitOrScaleCreationException("Could not initialise the repository containing the OM ontology.",e);
        }
        // Add OM ontology file to store
        InputStream in = new FileInputStream(omfile);
        RepositoryConnection connection = null;
        try {
            connection= repository.getConnection();
            ValueFactory factory = connection.getValueFactory();
            URI fileContext = factory.createURI("http://www.wurvoc.org/contexts/om");
            connection.add(in,"http://www.wurvoc.org/vocabularies/om-1.8/", RDFFormat.RDFXML,fileContext);
            OMVocabularyCreationTool.createVocabularyClass("OM",targetPackage,(URI)null, outdir,connection);
            List<URI> applicationAreas = OMVocabularyCreationTool.getApplicationAreas(connection);
            for(URI apparea : applicationAreas){
                OMVocabularyCreationTool.createVocabularyClass(getCamelCase(apparea.getLocalName()),targetPackage,apparea, outdir,connection);
            }
        } finally {
            if(connection!=null){
                connection.close();
            }
        }
    }

    private static void createVocabularyClass(String className,String targetPackage, URI apparea, File outDir, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, IOException {
        System.out.println("Creating class file: "+targetPackage+"."+className);
        Map<String,String> unitsAndScales = new HashMap<>();
        Map<String,String> comments = new HashMap<>();
        String sparql = "" +
                "PREFIX om: <http://www.wurvoc.org/vocabularies/om-1.8/> \n" +
                "\n" +
                "SELECT ?unitOrScale ?description WHERE {\n" +
                "   ?unitOrScale rdf:type ?type.\n" +
                "   OPTIONAL {?unitOrScale rdfs:comment ?description.}\n" +
                "   {\n" +
                "       ?type rdfs:subClassOf* om:Unit_of_measure.\n";
        if(apparea!=null) {
            sparql += "" +
                    "       <"+apparea.stringValue()+"> om:unit_of_measure ?unitOrScale.\n";
        }else {
            sparql += "" +
                    "   } UNION {\n" +
                    "       ?type rdfs:subClassOf* om:Measurement_scale.\n";
        }
        sparql+= ""+
                "   }\n" +
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        while(result.hasNext()){
            BindingSet bs = result.next();
            URI unitOrScale = (URI) bs.getValue("unitOrScale");
            String ccn = OMVocabularyCreationTool.getCamelCase(unitOrScale.getLocalName());
            String run = ccn;
            int count = 0;
            while(unitsAndScales.containsKey(run)){
                System.err.println("Double identifier for " + run);
                count++;
                run = ccn+"_"+count;
            }
            unitsAndScales.put(run, unitOrScale.stringValue());
            if(bs.hasBinding("description")){
                String description = ((Literal)bs.getValue("description")).stringValue();
                comments.put(run,description);
            }
        }

        if(unitsAndScales.size()>0) { // only create class when there are units or scales
            Set<String> varNames = unitsAndScales.keySet();
            String contents = "package "+targetPackage+";\n\n";
            contents+= "" +
                    "import nl.wur.fbr.om.model.scales.Scale;\n" +
                    "import nl.wur.fbr.om.model.units.*;\n" +
                    "import nl.wur.fbr.om.core.impl.scales.ScaleImpl;\n" +
                    "import nl.wur.fbr.om.core.impl.units.*;\n" +
                    "import nl.wur.fbr.om.model.UnitAndScaleSet;\n" +
                    "import nl.wur.fbr.om.model.dimensions.SIBaseDimension;\n" +
                    "import nl.wur.fbr.om.model.scales.Scale;\n" +
                    "import nl.wur.fbr.om.model.units.SingularUnit;\n" +
                    "import nl.wur.fbr.om.model.units.Unit;\n" +
                    "import nl.wur.fbr.om.prefixes.DecimalPrefix;\n\n";
            if(apparea!=null) {
                contents += "/**\n" +
                        " * This class contains the identifiers for the units and scales defined for the\n" +
                        " * <code>om:"+apparea.getLocalName()+"</code> application area in the OM ontology.\n" +
                        " * The identifiers are all defined as <code>final static String</code> and contain the\n" +
                        " * URIs of the concepts as strings.\n" +
                        " * <br>NB. This code has been automatically generated.\n" +
                        " * @author OM Vocabulary Creation tool at "+(new Date())+".\n" +
                        " */\n";
            }else{
                contents += "/**\n" +
                        " * This class contains all identifiers for units and scales defined in the OM ontology.\n" +
                        " * The identifiers are all defined as <code>final static String</code> and contain the\n" +
                        " * URIs of the concepts as strings.\n" +
                        " * <br>NB. This code has been automatically generated.\n" +
                        " * @author OM Vocabulary Creation tool at "+(new Date())+".\n" +
                        " */\n";
            }
            contents+= "public class "+className+" {\n\n";
            for(String varName : varNames) {
                String description = comments.get(varName);
                if(description!=null){
                    description = description.replace('\n',' ');
                    contents += "\t/** "+description+" */\n";
                }
                String type = "Unit";
                if(varName.contains("Scale")){
                    type = "Scale";
                }
                if(className.equals("OM")){
                    contents += "\tpublic final static "+type+" "+varName+";\n\n";
                }else {
                    contents += "\tpublic final static "+type+" "+varName+" = OM."+varName+";\n\n";
                }
            }
            if(className.equals("OM")) {
                contents += "\n\n" +
                        "\tstatic {\n";

                // Add constructors
                ValueFactory vf = connection.getValueFactory();
                List<String> urisDone = new ArrayList<>();
                for (String varName : varNames) {
                    try {
                        contents += OMVocabularyCreationTool.createConstructor(varName, unitsAndScales, unitsAndScales.get(varName), vf, urisDone);
                    } catch (UnitOrScaleCreationException e) {
                        System.err.println("Could not create variable " + varName);
                        e.printStackTrace();
                        contents += "\t\t" + varName + " = null;\n";
                    }
                }
                contents += "\t}\n";
            }
            contents += "}";

            // write to file
            File outfile = new File(outDir,className+".java");
            FileWriter writer = new FileWriter(outfile);
            writer.write(contents);
            writer.flush();
            writer.close();

            System.out.println("Wrote file: "+outfile);
        }
    }

    /**
     * Escapes the string literals '"' in a string and returns the escaped string.
     * @param string The input string.
     * @return The escaped string.
     */
    private static String escapeStringLiterals(String string){
        if(string !=null){
            int pos = string.indexOf("\"");
            while (pos>=0){
                string = string.substring(0,pos)+"\\"+string.substring(pos);
                pos = string.indexOf("\"",pos+2);
            }
        }
        return string;
    }

    /**
     * Creates the Java code to construct the unit or scale specified.
     * @param varName The Java name of the unit or scale.
     * @param varNames The Map of Java names (key) with URIs as string.
     * @param uri The URI as string of the unit or scale.
     * @param vf The value factory.
     * @param urisDone The set of already created units and scales.
     */
    private static String createConstructor(String varName, Map<String,String> varNames, String uri, ValueFactory vf, List<String> urisDone) throws UnitOrScaleCreationException {
        if(urisDone.contains(uri)) return "";
        Object unitOrScale = factory.getUnitOrScale(uri);
        String contents = "";
        if(unitOrScale instanceof PrefixedUnit && unitOrScale instanceof BaseUnit){
            urisDone.add(uri);
            PrefixedUnit prefixedUnit = (PrefixedUnit)unitOrScale;
            Unit bunit = prefixedUnit.getUnit();
            String newVarName = OMVocabularyCreationTool.getVariableNameForURI(bunit.getIdentifier(),varNames);
            if(!urisDone.contains(bunit.getIdentifier())){
                contents +=OMVocabularyCreationTool.createConstructor(newVarName,varNames,bunit.getIdentifier(),vf,urisDone);
            }
            String prefix = ""+prefixedUnit.getPrefix().getClass().getTypeName()+"."+prefixedUnit.getPrefix().toString();
            BaseUnit baseUnit = (BaseUnit)unitOrScale;
            String dim = "null";
            if(baseUnit.getDefinitionDimension()!=null) {
                dim = ""+baseUnit.getDefinitionDimension().getClass().getTypeName()+"."+baseUnit.getDefinitionDimension().toString();
            }
            contents+= "\t\t"+varName+" = new PrefixedBaseUnitImpl(\""+prefixedUnit.getIdentifier()+"\",\""+prefixedUnit.getName()+"\",\""+prefixedUnit.getSymbol()+"\",(SingularUnit)"+newVarName+", "+prefix+", "+dim+");\n";
        }else if(unitOrScale instanceof SingularUnit && unitOrScale instanceof BaseUnit){
            urisDone.add(uri);
            BaseUnit unit = (BaseUnit)unitOrScale;
            String dim = "null";
            if(unit.getDefinitionDimension()!=null) {
                dim = ""+unit.getDefinitionDimension().getClass().getTypeName()+"."+unit.getDefinitionDimension().toString();
            }
            contents += "\t\t"+varName+" = new BaseUnitImpl(\""+uri+"\", \""+OMVocabularyCreationTool.escapeStringLiterals(unit.getName())+"\", \""+OMVocabularyCreationTool.escapeStringLiterals(unit.getSymbol())+"\", "+dim+");\n";
        }else if(unitOrScale instanceof SingularUnit){
            urisDone.add(uri);
            SingularUnit unit = (SingularUnit)unitOrScale;
            if(varName.equals("Gram")){
                contents += "\t\t"+varName+" =  new SingularUnitImpl(\""+uri+"\", \""+OMVocabularyCreationTool.escapeStringLiterals(unit.getName())+"\", \""+OMVocabularyCreationTool.escapeStringLiterals(unit.getSymbol())+"\" );\n";
            }else{
                Unit defunit = unit.getDefinitionUnit();
                String defVarName = OMVocabularyCreationTool.getVariableNameForURI(defunit.getIdentifier(), varNames);
                double factor = unit.getDefinitionNumericalValue();
                if(defunit!=null && !urisDone.contains(defunit.getIdentifier())){
                    contents +=OMVocabularyCreationTool.createConstructor(defVarName,varNames,defunit.getIdentifier(),vf,urisDone);
                }
                contents += "\t\t"+varName+" =  new SingularUnitImpl(\""+uri+"\", \""+OMVocabularyCreationTool.escapeStringLiterals(unit.getName())+"\", \""+OMVocabularyCreationTool.escapeStringLiterals(unit.getSymbol())+"\", "+defVarName+", "+factor+" );\n";
            }
        }else if(unitOrScale instanceof PrefixedUnit){
            urisDone.add(uri);
            PrefixedUnit unit = (PrefixedUnit)unitOrScale;
            Unit bunit = unit.getUnit();
            String newVarName = OMVocabularyCreationTool.getVariableNameForURI(bunit.getIdentifier(),varNames);
            if(!urisDone.contains(bunit.getIdentifier())){
                contents +=OMVocabularyCreationTool.createConstructor(newVarName,varNames,bunit.getIdentifier(),vf,urisDone);
            }
            String prefix = ""+unit.getPrefix().getClass().getTypeName()+"."+unit.getPrefix().toString();
            contents+= "\t\t"+varName+" = new PrefixedUnitImpl(\""+unit.getIdentifier()+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(unit.getName())+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(unit.getSymbol())+"\",(SingularUnit)"+newVarName+", "+prefix+");\n";
        }else if(unitOrScale instanceof UnitMultiple){
            urisDone.add(uri);
            UnitMultiple unit = (UnitMultiple)unitOrScale;
            double factor = unit.getFactor();
            Unit bunit = unit.getUnit();
            String newVarName = OMVocabularyCreationTool.getVariableNameForURI(bunit.getIdentifier(),varNames);
            if(!urisDone.contains(bunit.getIdentifier())){
                contents +=OMVocabularyCreationTool.createConstructor(newVarName,varNames,bunit.getIdentifier(),vf,urisDone);
            }
            contents+= "\t\t"+varName+" = new UnitMultipleImpl(\""+unit.getIdentifier()+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(unit.getName())+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(unit.getSymbol())+"\",(SingularUnit)"+newVarName+", "+factor+");\n";
        }else if(unitOrScale instanceof UnitMultiplication) {
            urisDone.add(uri);
            UnitMultiplication unit = (UnitMultiplication)unitOrScale;
            Unit term1 = unit.getTerm1();
            Unit term2 = unit.getTerm2();
            String term1Name = OMVocabularyCreationTool.getVariableNameForURI(term1.getIdentifier(), varNames);
            if(!urisDone.contains(term1.getIdentifier())){
                contents +=OMVocabularyCreationTool.createConstructor(term1Name,varNames,term1.getIdentifier(),vf,urisDone);
            }
            String term2Name = OMVocabularyCreationTool.getVariableNameForURI(term2.getIdentifier(), varNames);
            if(!urisDone.contains(term2.getIdentifier())){
                contents +=OMVocabularyCreationTool.createConstructor(term2Name,varNames,term2.getIdentifier(),vf,urisDone);
            }
            contents+= "\t\t"+varName+" = new UnitMultiplicationImpl(\""+unit.getIdentifier()+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(unit.getName())+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(unit.getSymbol())+"\","+term1Name+", "+term2Name+");\n";
        }else if(unitOrScale instanceof UnitDivision) {
            urisDone.add(uri);
            UnitDivision unit = (UnitDivision)unitOrScale;
            Unit numerator = unit.getNumerator();
            Unit denominator = unit.getDenominator();
            String numeratorName = OMVocabularyCreationTool.getVariableNameForURI(numerator.getIdentifier(), varNames);
            if(!urisDone.contains(numerator.getIdentifier())){
                contents +=OMVocabularyCreationTool.createConstructor(numeratorName,varNames,numerator.getIdentifier(),vf,urisDone);
            }
            String denominatorName = OMVocabularyCreationTool.getVariableNameForURI(denominator.getIdentifier(), varNames);
            if(!urisDone.contains(denominator.getIdentifier())){
                contents +=OMVocabularyCreationTool.createConstructor(denominatorName,varNames,denominator.getIdentifier(),vf,urisDone);
            }
            contents+= "\t\t"+varName+" = new UnitDivisionImpl(\""+unit.getIdentifier()+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(unit.getName())+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(unit.getSymbol())+"\","+numeratorName+", "+denominatorName+");\n";
        }else if(unitOrScale instanceof UnitExponentiation) {
            urisDone.add(uri);
            UnitExponentiation unit = (UnitExponentiation)unitOrScale;
            Unit base = unit.getBase();
            double exponent = unit.getExponent();
            String baseName = OMVocabularyCreationTool.getVariableNameForURI(base.getIdentifier(), varNames);
            if(!urisDone.contains(base.getIdentifier())){
                contents +=OMVocabularyCreationTool.createConstructor(baseName,varNames,base.getIdentifier(),vf,urisDone);
            }
            contents+= "\t\t"+varName+" = new UnitExponentiationImpl(\""+unit.getIdentifier()+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(unit.getName())+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(unit.getSymbol())+"\","+baseName+", "+exponent+");\n";
        }else if(unitOrScale instanceof Scale) {
            urisDone.add(uri);
            Scale scale = (Scale)unitOrScale;
            Unit unit = scale.getUnit();
            String unitName = OMVocabularyCreationTool.getVariableNameForURI(unit.getIdentifier(), varNames);
            if(!urisDone.contains(unit.getIdentifier())){
                contents +=OMVocabularyCreationTool.createConstructor(unitName,varNames,unit.getIdentifier(),vf,urisDone);
            }
            Scale defscale = scale.getDefinitionScale();
            if(defscale!=null){
                String defscaleName = OMVocabularyCreationTool.getVariableNameForURI(defscale.getIdentifier(), varNames);
                if(!urisDone.contains(defscale.getIdentifier())){
                    contents +=OMVocabularyCreationTool.createConstructor(defscaleName,varNames,defscale.getIdentifier(),vf,urisDone);
                }
                double offset = scale.getOffsetFromDefinitionScale();
                double factor = scale.getFactorFromDefinitionScale();
                contents+= "\t\t"+varName+" = new ScaleImpl(\""+scale.getIdentifier()+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(scale.getName())+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(scale.getSymbol())+"\","+defscaleName+", "+offset+", "+factor+", "+unitName+");\n";
            }else{
                contents+= "\t\t"+varName+" = new ScaleImpl(\""+scale.getIdentifier()+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(scale.getName())+"\",\""+OMVocabularyCreationTool.escapeStringLiterals(scale.getSymbol())+"\", "+unitName+");\n";
            }
            // todo definition points
        }
        return contents;
    }

    /**
     * Returns the name of the variable that defines the unit or scale with the specified URI.
     * @param uri The URI of the unit or scale.
     * @param varNames A map with variable names as key and uri as value.
     * @return The name of the variable or null if not specified in the map.
     */
    private static String getVariableNameForURI(String uri, Map<String,String> varNames){
        String varName = null;
        Set<String> vns = varNames.keySet();
        for(String vn : vns){
            String vnuir = varNames.get(vn);
            if(vnuir.equals(uri)) {
                varName = vn;
                break;
            }
        }
        return varName;
    }

    /**
     * Returns a camel case of the specified string.
     * @param string The input string.
     * @return CamelCased string version.
     */
    private static String getCamelCase(String string) {
        string = (""+string.charAt(0)).toUpperCase()+string.substring(1);
        string = getCamelCase(string,' ');
        string = getCamelCase(string,'-');
        string = getCamelCase(string,'_');
        if(string.charAt(0)>='0' && string.charAt(0)<='9') string = "N"+string;
        return string;
    }

    /**
     * Replaces all characters <code>wschar</code> with camel case.
     * @param string The input string.
     * @param wschar The character to be replaced, e.g. space " ", hyphen "-",...
     * @return CamelCased string version.
     */
    private static String getCamelCase(String string,char wschar) {
        int pos = string.indexOf(wschar);
        while(pos>=0){
            if(pos<string.length()-1){
                char next = string.charAt(pos + 1);
                String nextstr = (""+next).toUpperCase();
                string = string.substring(0,pos)+nextstr+string.substring(pos+2);
                pos = string.indexOf(wschar,pos);
            }
        }
        return string;
    }

    /**
     * Gets the application areas defined in the OM ontology.
     * @param connection The connection to the triple store.
     * @return A list of application areas.
     */
    private static List<URI> getApplicationAreas(RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException {
        List<URI> appareas = new ArrayList<>();
        String sparql = "" +
                "PREFIX om: <http://www.wurvoc.org/vocabularies/om-1.8/> \n" +
                "\n" +
                "SELECT ?applicationArea WHERE {\n" +
                "   ?applicationArea a om:Application_area.\n" +
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        while(result.hasNext()){
            BindingSet bs = result.next();
            URI apparea = (URI) bs.getValue("applicationArea");
            if(!appareas.contains(apparea)) appareas.add(apparea);
        }
        return appareas;
    }

    /**
     * The main method called when starting the tool.
     * The tool expects three arguments: first the path to the RDF file containing the OM ontology,
     * second, the target package of the generated classes,
     * third, the output directory.
     * @param args The command line arguments.
     */
    public static void main(String[] args){
        System.out.println("The OM vocabulary creation tool.");
        try {
            if(args.length!=3 && args.length!=0){
                System.out.println("Usage: java OMVocabularyCreationTool [path to OM ontology] [target package] [output directory]");
            }else if(args.length==0){
                String inputOM = OMVocabularyCreationTool.getInput("Path to OM vocabulary (RDF or OWL file)");
                String targetPackage = OMVocabularyCreationTool.getInput("Java target package");
                String outputDir = OMVocabularyCreationTool.getInput("Output directory");
                OMVocabularyCreationTool.createVocabulary(inputOM,targetPackage,outputDir);
            }else {
                OMVocabularyCreationTool.createVocabulary(args[0],args[1],args[2]);
            }
        }catch (Throwable e){
            e.printStackTrace();
        }
    }
}
