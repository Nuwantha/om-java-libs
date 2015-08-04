package nl.wur.fbr.om.om18.set;

import javafx.util.Pair;
import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.exceptions.InsufficientDataException;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.model.NamedObject;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.dimensions.SIDimension;
import nl.wur.fbr.om.model.units.*;
import nl.wur.fbr.om.om18.vocabulary.OM;
import nl.wur.fbr.om.prefixes.BinaryPrefix;
import nl.wur.fbr.om.prefixes.DecimalPrefix;
import nl.wur.fbr.om.prefixes.Prefix;
import org.openrdf.model.Literal;
import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.vocabulary.RDF;
import org.openrdf.model.vocabulary.RDFS;
import org.openrdf.query.*;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.sail.SailRepository;
import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.RDFParseException;
import org.openrdf.sail.memory.MemoryStore;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * This is an extension of the {@link DefaultUnitAndScaleFactory} that includes
 * the units and measurement scales defined in the OM ontology (v1.8). The Identifiers for these units and scales
 * are defined as URIs.
 * Use these identifiers as parameter to {@link #getUnitOrScale(String)} to access the
 * OM set of units and scales.
 * @author Don Willems on 03/08/15.
 */
public class OMUnitAndScaleFactory extends DefaultUnitAndScaleFactory{

    /**
     * The Sesame SAIL in-memory repository that will contain the OM RDF file.
     * OM can be queried through this repository.
     */
    private Repository repository = null;

    /**
     * Constructs the default {@link OMUnitAndScaleFactory}. This constructor creates a new in-memory repository
     * with the RDF data contained in this release of the om-1.8-set library.
     * @throws UnitOrScaleCreationException When the in-memory repository could not be created.
     */
    public OMUnitAndScaleFactory() throws UnitOrScaleCreationException {
        repository = new SailRepository(new MemoryStore());
        try {
            repository.initialize();
        } catch (RepositoryException e) {
            throw new UnitOrScaleCreationException("Could not initialise the repository containing the OM ontology.",e);
        }
        InputStream in = OMUnitAndScaleFactory.class.getResourceAsStream("/om.owl");
        System.out.println("RDF file: "+in);
        RepositoryConnection connection = null;
        try{
            connection = repository.getConnection();
            ValueFactory factory = connection.getValueFactory();
            URI fileContext = factory.createURI("http://www.wurvoc.org/contexts/om");
            connection.add(in,OM.NAMESPACE, RDFFormat.RDFXML,fileContext);
        } catch (RepositoryException e) {
            throw new UnitOrScaleCreationException("Could not add the OM ontology to the in-memory repository.",e);
        } catch (RDFParseException e) {
            throw new UnitOrScaleCreationException("Could not parse the OM ontology file into the in-memory repository.",e);
        } catch (IOException e) {
            throw new UnitOrScaleCreationException("Could not access the OM ontology file.",e);
        } finally {
            if(connection!=null){
                try {
                    connection.close();
                } catch (RepositoryException e) {
                }
            }
        }
    }

    /**
     * Creates a new factory initialised with the specified repository. This repository should contain the
     * OM ontology but may be available from for instance an HTTP server.
     * @param repository The repository containing the OM ontology.
     */
    public OMUnitAndScaleFactory(Repository repository){
        this.repository = repository;
    }

    /**
     * Returns the Unit or Scale identified by the specified identifier (either the full URI or the local name)
     * within the OM ontology. <br>
     * If the Unit or Scale with the same identifier has been created previously, this method should return the
     * same instance.
     *
     * If the Unit or Scale has not been created previously, this method should create the
     * unit or scale and set the identifier (URI) of the unit or scale to the specified identifier.
     * If the data for creating a new instance is not available, e.g. is not part of the core set, or the identifier does not
     * represent a unit or scale, this method will throw a {@link UnitOrScaleCreationException}.
     * @param identifier The identifier of the unit or scale, in OM the string representation of a URI.
     * @return The unit or scale identified by the specified identifier.
     * @throws UnitOrScaleCreationException When the unit could not be created from the specified identifier.
     */
    @Override
    public Object getUnitOrScale(String identifier) throws UnitOrScaleCreationException {
        Object uos = null;
        try{
            uos = super.getUnitOrScale(identifier);
        } catch (Exception e){ } // no memory of unit or scale
        if(uos==null){
            ValueFactory vf = repository.getValueFactory();
            URI uri = null;
            if(identifier.startsWith("http://")){
                uri = vf.createURI(identifier);
            }else{
                uri = vf.createURI("http://www.wurvoc.org/vocabularies/om-1.8/",identifier);
            }
            RepositoryConnection connection = null;
            try{
                connection = repository.getConnection();
                uos = createUnitOrScaleFromURI(uri,connection);
            } catch (RepositoryException e) {
                throw new UnitOrScaleCreationException("Could not create unit or scale <"+uri+"> because the repository" +
                        " could not be accessed.",identifier,e);
            } finally {
                if(connection!=null){
                    try {
                        connection.close();
                    } catch (RepositoryException e) {
                    }
                }
            }
        }
        return uos;
    }

    /**
     * Creates an instance of the unit or scale identified by the specified URI.
     * @param uri The URI in OM of the unit or scale to be created.
     * @param connection The connection to the repository.
     * @return The Unit or Scale.
     * @throws UnitOrScaleCreationException If the unit or scale could not be created.
     */
    private Object createUnitOrScaleFromURI(URI uri,RepositoryConnection connection) throws UnitOrScaleCreationException {
        try {
            URI type = this.getTypeOfResource(uri,connection);
            NamedObject nobject = null;
            if(type.equals(OM.SINGULAR_UNIT)){
                nobject = this.createSingularUnit(uri,connection);
            }else if(type.equals(OM.UNIT_MULTIPLE_OR_SUBMULTIPLE)){
                nobject = this.createUnitMultiple(uri,connection);
            }else if(type.equals(OM.UNIT_MULTIPLICATION)){
                nobject = this.createUnitMultiplication(uri, connection);
            }else if(type.equals(OM.UNIT_DIVISION)){

            }else if(type.equals(OM.UNIT_EXPONENTIATION)){
                nobject = this.createUnitExponentiation(uri, connection);
            }else if(type.equals(OM.MEASUREMENT_SCALE)){

            }else if(type.equals(OM.CARDINAL_SCALE)){

            }else if(type.equals(OM.INTERVAL_SCALE)){

            }else if(type.equals(OM.NOMINAL_SCALE)){

            }else if(type.equals(OM.ORDINAL_SCALE)){

            }else if(type.equals(OM.RATIO_SCALE)){

            }else {
                throw new UnitOrScaleCreationException("The type of the requested resource with identifier <"+uri+"> " +
                        "is not one of the expected unit or scale types (type = <"+type+">.");
            }
            this.addNamesAndSymbols(uri,nobject,connection);
            return nobject;
        } catch (MalformedQueryException e) { // SHOULD NOT HAPPEN AS THE SPARQL IS PREDEFINED.
            throw new UnitOrScaleCreationException("Could not create unit or scale <"+uri+"> because the repository" +
                    " was accessed with an invalid SPARQL query.",uri.stringValue(),e);
        } catch (RepositoryException e) {
            throw new UnitOrScaleCreationException("Could not create unit or scale <"+uri+"> because the repository" +
                    " could not be accessed.",uri.stringValue(),e);
        } catch (QueryEvaluationException e) {// SHOULD NOT HAPPEN AS THE SPARQL IS PREDEFINED.
            throw new UnitOrScaleCreationException("Could not create unit or scale <"+uri+"> because the repository" +
                    " was accessed with an invalid SPARQL query.",uri.stringValue(),e);
        } catch (Throwable e){
            throw new UnitOrScaleCreationException("Could not create unit or scale <"+uri+">.",uri.stringValue(),e);
        }
    }

    /**
     * Creates a singular (or base) unit from the specified URI. The type of unit should already be determined to be
     * a singular unit.
     * @param uri The URI (identifier) of the unit.
     * @param connection The connection to the repository.
     * @return The singular unit.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit, or when the definition unit could not be created.
     */
    private SingularUnit createSingularUnit(URI uri, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT ?dimension ?length ?mass ?time ?current ?temperature ?amount ?intensity ?definitionUnit ?factor WHERE {\n" +
                "   OPTIONAL{ \n" +
                "       <"+uri+"> <"+ OM.HAS_DIMENSION+ "> ?dimension.\n" +
                "       ?dimension <"+OM.HAS_SI_LENGTH_DIMENSION_EXPONENT + "> ?length. \n"+
                "       ?dimension <"+OM.HAS_SI_MASS_DIMENSION_EXPONENT + "> ?mass. \n"+
                "       ?dimension <"+OM.HAS_SI_TIME_DIMENSION_EXPONENT + "> ?time. \n"+
                "       ?dimension <"+OM.HAS_SI_ELECTRIC_CURRENT_DIMENSION_EXPONENT + "> ?current. \n"+
                "       ?dimension <"+OM.HAS_SI_THERMODYNAMIC_TEMPERATURE_DIMENSION_EXPONENT + "> ?temperature. \n"+
                "       ?dimension <"+OM.HAS_SI_AMOUNT_OF_SUBSTANCE_DIMENSION_EXPONENT + "> ?amount. \n"+
                "       ?dimension <"+OM.HAS_SI_LUMINOUS_INTENSITY_DIMENSION_EXPONENT + "> ?intensity. \n"+
                "   } \n" +
                "   OPTIONAL{ \n" +
                "       <"+uri+"> <"+ OM.HAS_DEFINITION+ "> ?definition.\n" +
                "       ?definition <"+ OM.HAS_UNIT_OF_MEASURE_OR_MEASUREMENT_SCALE+ "> ?definitionUnit.\n" +
                "       ?definition <"+ OM.HAS_NUMERICAL_VALUE+ "> ?factor.\n" +
                "   }\n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()){
            URI gramURI = connection.getValueFactory().createURI(OM.NAMESPACE, "gram");
            BindingSet bs = result.next();
            URI definitionUnitURI = null;
            double factor = 1;
            Dimension dimension = this.getDimension(uri,connection);
            if(bs.hasBinding("definitionUnit")) {
                definitionUnitURI = (URI) bs.getValue("definitionUnit");
            }
            if(bs.hasBinding("factor")){
                factor = ((Literal) bs.getValue("factor")).doubleValue();
            }
            if(definitionUnitURI!=null && !uri.equals(gramURI)){
                Unit defUnit = null;
                try {
                    defUnit = (Unit)getUnitOrScale(definitionUnitURI.stringValue());
                } catch (UnitOrScaleCreationException e) {
                    throw new UnitOrScaleCreationException("The definition unit with uri <"+definitionUnitURI.stringValue()+"> of the singular unit <"+uri+"> could not be created.",uri.stringValue(),e);
                }
                SingularUnit singularUnit = this.createSingularUnit(uri.stringValue(), (String) null, (String) null, defUnit,factor);
                return singularUnit;
            } else if(uri.equals(gramURI)){
                SingularUnit singularUnit = this.createSingularUnit(uri.stringValue(),(String)null,(String)null);
                this.getUnitOrScale(definitionUnitURI.stringValue());
                return singularUnit;
            } else {
                BaseUnit baseUnit = this.createBaseUnit(uri.stringValue(), (String) null, (String) null, dimension);
                return (SingularUnit)baseUnit;
            }
        }
        throw new InsufficientDataException("Could not acquire the data of the singular unit identified by <"+uri+">",uri.stringValue());
    }

    /**
     * Creates a unit multiple or prefixed unit identified by the specified OM URI. The type of unit should already be
     * determined to be a unit multiple.
     * @param uri The URI (identifier) of the unit.
     * @param connection The connection to the repository.
     * @return The unit multiple.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit, or when the parent unit could not be created.
     */
    private UnitMultiple createUnitMultiple(URI uri, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+uri+"> <"+OM.HAS_SINGULAR_UNIT+"> ?sunit.\n"+
                "   <"+uri+"> <"+OM.HAS_PREFIX+"> ?prefix.\n"+
                "   OPTIONAL{ \n" +
                "       <"+uri+"> <"+ OM.HAS_DIMENSION+ "> ?dimension.\n" +
                "       ?dimension <"+OM.HAS_SI_LENGTH_DIMENSION_EXPONENT + "> ?length. \n"+
                "       ?dimension <"+OM.HAS_SI_MASS_DIMENSION_EXPONENT + "> ?mass. \n"+
                "       ?dimension <"+OM.HAS_SI_TIME_DIMENSION_EXPONENT + "> ?time. \n"+
                "       ?dimension <"+OM.HAS_SI_ELECTRIC_CURRENT_DIMENSION_EXPONENT + "> ?current. \n"+
                "       ?dimension <"+OM.HAS_SI_THERMODYNAMIC_TEMPERATURE_DIMENSION_EXPONENT + "> ?temperature. \n"+
                "       ?dimension <"+OM.HAS_SI_AMOUNT_OF_SUBSTANCE_DIMENSION_EXPONENT + "> ?amount. \n"+
                "       ?dimension <"+OM.HAS_SI_LUMINOUS_INTENSITY_DIMENSION_EXPONENT + "> ?intensity. \n"+
                "   } \n" +
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()){
            BindingSet bs = result.next();
            try {
                // prefixed units can also be base units (e.g. kilogram)
                URI kilogramURI = connection.getValueFactory().createURI(OM.NAMESPACE, "kilogram");
                SingularUnit sunit = (SingularUnit) this.getUnitOrScale(bs.getValue("sunit").stringValue());
                URI prefixuri = (URI) bs.getValue("prefix");
                Prefix prefix = null;
                if(prefixuri.equals(OM.YOCTO)) prefix = DecimalPrefix.YOCTO;
                else if(prefixuri.equals(OM.ZEPTO)) prefix = DecimalPrefix.ZEPTO;
                else if(prefixuri.equals(OM.ATTO)) prefix = DecimalPrefix.ATTO;
                else if(prefixuri.equals(OM.PICO)) prefix = DecimalPrefix.PICO;
                else if(prefixuri.equals(OM.FEMTO)) prefix = DecimalPrefix.FEMTO;
                else if(prefixuri.equals(OM.NANO)) prefix = DecimalPrefix.NANO;
                else if(prefixuri.equals(OM.MICRO)) prefix = DecimalPrefix.MICRO;
                else if(prefixuri.equals(OM.MILLI)) prefix = DecimalPrefix.MILLI;
                else if(prefixuri.equals(OM.CENTI)) prefix = DecimalPrefix.CENTI;
                else if(prefixuri.equals(OM.DECI)) prefix = DecimalPrefix.DECI;
                else if(prefixuri.equals(OM.DECA)) prefix = DecimalPrefix.DECA;
                else if(prefixuri.equals(OM.HECTO)) prefix = DecimalPrefix.HECTO;
                else if(prefixuri.equals(OM.KILO)) prefix = DecimalPrefix.KILO;
                else if(prefixuri.equals(OM.MEGA)) prefix = DecimalPrefix.MEGA;
                else if(prefixuri.equals(OM.GIGA)) prefix = DecimalPrefix.GIGA;
                else if(prefixuri.equals(OM.TERA)) prefix = DecimalPrefix.TERA;
                else if(prefixuri.equals(OM.PETA)) prefix = DecimalPrefix.PETA;
                else if(prefixuri.equals(OM.EXA)) prefix = DecimalPrefix.EXA;
                else if(prefixuri.equals(OM.ZETTA)) prefix = DecimalPrefix.ZETTA;
                else if(prefixuri.equals(OM.YOTTA)) prefix = DecimalPrefix.YOTTA;
                else if(prefixuri.equals(OM.KIBI)) prefix = BinaryPrefix.KIBI;
                else if(prefixuri.equals(OM.MEBI)) prefix = BinaryPrefix.MEBI;
                else if(prefixuri.equals(OM.GIBI)) prefix = BinaryPrefix.GIBI;
                else if(prefixuri.equals(OM.TEBI)) prefix = BinaryPrefix.TEBI;
                else if(prefixuri.equals(OM.PEBI)) prefix = BinaryPrefix.PEBI;
                else if(prefixuri.equals(OM.EXBI)) prefix = BinaryPrefix.EXBI;
                else if(prefixuri.equals(OM.ZEBI)) prefix = BinaryPrefix.ZEBI;
                else if(prefixuri.equals(OM.YOBI)) prefix = BinaryPrefix.YOBI;
                if(uri.equals(kilogramURI)){
                    PrefixedUnit prefixedUnit = (PrefixedUnit)this.createPrefixedBaseUnit(uri.stringValue(), (String) null, (String) null, SIDimension.MASS, sunit, prefix);
                    return prefixedUnit;
                }else{
                    PrefixedUnit prefixedUnit = this.createPrefixedUnit(uri.stringValue(), (String) null, (String) null, sunit,prefix);
                    return prefixedUnit;
                }
            } catch (UnitOrScaleCreationException e) {
                throw new UnitOrScaleCreationException("The parent unit with uri <"+bs.getValue("sunit").stringValue()+"> of the unit multiple <"+uri+"> could not be created.",uri.stringValue(),e);
            }
        }
        throw new InsufficientDataException("Could not acquire the data of the unit multiple identified by <"+uri+">",uri.stringValue());
    }

    /**
     * Creates a unit multiplication identified by the specified OM URI. The type of unit should already be
     * determined to be a unit multiplication.
     * @param uri The URI (identifier) of the unit.
     * @param connection The connection to the repository.
     * @return The unit exponentiation.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit,
     * or when one of the parent units could not be created.
     */
    private UnitMultiplication createUnitMultiplication(URI uri, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+uri+"> <"+OM.HAS_TERM1+"> ?term1.\n"+
                "   <"+uri+"> <"+OM.HAS_TERM2+"> ?term2.\n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()) {
            BindingSet bs = result.next();
            URI term1URI = (URI) bs.getValue("term1");
            URI term2URI = (URI) bs.getValue("term2");
            Unit term1 = (Unit) this.getUnitOrScale(term1URI.stringValue());
            Unit term2 = (Unit) this.getUnitOrScale(term2URI.stringValue());
            UnitMultiplication unit = this.createUnitMultiplication(uri.stringValue(), null, null, term1, term2);
            return unit;
        }
        throw new InsufficientDataException("Could not acquire the data of the unit multiplication identified by <"+uri+">",uri.stringValue());
    }

    /**
     * Creates a unit exponentiation identified by the specified OM URI. The type of unit should already be
     * determined to be a unit exponentiation.
     * @param uri The URI (identifier) of the unit.
     * @param connection The connection to the repository.
     * @return The unit exponentiation.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit, or when the parent unit could not be created.
     */
    private UnitExponentiation createUnitExponentiation(URI uri, RepositoryConnection connection) throws UnitOrScaleCreationException, MalformedQueryException, RepositoryException, QueryEvaluationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+uri+"> <"+OM.HAS_BASE+"> ?base.\n"+
                "   <"+uri+"> <"+OM.HAS_EXPONENT+"> ?exponent.\n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()) {
            BindingSet bs = result.next();
            URI baseURI = (URI) bs.getValue("base");
            int exponent = ((Literal) bs.getValue("exponent")).intValue();
            Unit unit = (Unit) this.getUnitOrScale(baseURI.stringValue());
            UnitExponentiation unitExponentiation = this.createUnitExponentiation(uri.stringValue(),null,null,unit,exponent);
            return unitExponentiation;
        }
        throw new InsufficientDataException("Could not acquire the data of the unit exponentiation identified by <"+uri+">",uri.stringValue());
    }

    /**
     * Retrieves the dimension of the unit if it has only one dimension. Only used for base units.
     * @param uri The uri of the unit.
     * @param connection The connection to the repository.
     * @return The dimension of the unit.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     */
    private Dimension getDimension(URI uri,RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+uri+"> <"+ OM.HAS_DIMENSION+ "> ?dimension.\n" +
                "   ?dimension <"+OM.HAS_SI_LENGTH_DIMENSION_EXPONENT + "> ?length. \n"+
                "   ?dimension <"+OM.HAS_SI_MASS_DIMENSION_EXPONENT + "> ?mass. \n"+
                "   ?dimension <"+OM.HAS_SI_TIME_DIMENSION_EXPONENT + "> ?time. \n"+
                "   ?dimension <"+OM.HAS_SI_ELECTRIC_CURRENT_DIMENSION_EXPONENT + "> ?current. \n"+
                "   ?dimension <"+OM.HAS_SI_THERMODYNAMIC_TEMPERATURE_DIMENSION_EXPONENT + "> ?temperature. \n"+
                "   ?dimension <"+OM.HAS_SI_AMOUNT_OF_SUBSTANCE_DIMENSION_EXPONENT + "> ?amount. \n"+
                "   ?dimension <"+OM.HAS_SI_LUMINOUS_INTENSITY_DIMENSION_EXPONENT + "> ?intensity. \n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()) {
            BindingSet bs = result.next();
            Dimension dimension = null;
            if(bs.hasBinding("dimension")) {
                int length = ((Literal) bs.getValue("length")).intValue();
                int mass = ((Literal) bs.getValue("mass")).intValue();
                int time = ((Literal) bs.getValue("time")).intValue();
                int current = ((Literal) bs.getValue("current")).intValue();
                int temperature = ((Literal) bs.getValue("temperature")).intValue();
                int amount = ((Literal) bs.getValue("amount")).intValue();
                int intensity = ((Literal) bs.getValue("intensity")).intValue();
                if(length==1 && mass==0 && time==0 && current==0 && temperature==0 && amount==0 && intensity==0){
                    dimension = SIDimension.LENGTH;
                }else if(length==0 && mass==1 && time==0 && current==0 && temperature==0 && amount==0 && intensity==0){
                    dimension = SIDimension.MASS;
                }else if(length==0 && mass==0 && time==1 && current==0 && temperature==0 && amount==0 && intensity==0){
                    dimension = SIDimension.TIME;
                }else if(length==0 && mass==0 && time==0 && current==1 && temperature==0 && amount==0 && intensity==0){
                    dimension = SIDimension.ELECTRIC_CURRENT;
                }else if(length==0 && mass==0 && time==0 && current==0 && temperature==1 && amount==0 && intensity==0){
                    dimension = SIDimension.THERMODYNAMIC_TEMPERATURE;
                }else if(length==0 && mass==0 && time==0 && current==0 && temperature==0 && amount==1 && intensity==0){
                    dimension = SIDimension.AMOUNT_OF_SUBSTANCE;
                }else if(length==0 && mass==0 && time==0 && current==0 && temperature==0 && amount==0 && intensity==1){
                    dimension = SIDimension.LUMINOUS_INTENSITY;
                }
            }
            return dimension;
        }
        return null;
    }

    /**
     * Adds names and symbols to the Unit or Scale.
     * @param uri The URI of the unit or scale.
     * @param nobject The unit or scale object to which the names and symbols are added.
     * @param connection The connection to the repository.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws InsufficientDataException When not enough data could be found in the OM repository to create the unit.
     */
    private void addNamesAndSymbols(URI uri, NamedObject nobject, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException {
        String sparql = "" +
                "SELECT ?label ?prop WHERE {\n" +
                "  {\n" +
                "    <"+uri.stringValue()+"> <"+ RDFS.LABEL+"> ?label.\n" +
                "    BIND (<"+ RDFS.LABEL+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+uri.stringValue()+"> <"+OM.HAS_ALTERNATIVE_LABEL+"> ?label.\n" +
                "    BIND (<"+OM.HAS_ALTERNATIVE_LABEL+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+uri.stringValue()+"> <"+OM.HAS_SYMBOL+"> ?label.\n" +
                "    BIND (<"+OM.HAS_SYMBOL+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+uri.stringValue()+"> <"+OM.HAS_ALTERNATIVE_SYMBOL+"> ?label.\n" +
                "    BIND (<"+OM.HAS_ALTERNATIVE_SYMBOL+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+uri.stringValue()+"> <"+OM.HAS_UNOFFICIAL_ABBREVIATION+"> ?label.\n" +
                "    BIND (<"+OM.HAS_UNOFFICIAL_ABBREVIATION+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+uri.stringValue()+"> <"+OM.HAS_ABBREVIATION+"> ?label.\n" +
                "    BIND (<"+OM.HAS_ABBREVIATION+"> AS ?prop)\n" +
                "  }\n" +
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        List<Pair<String,String>> names = new ArrayList<>();
        List<Pair<String,String>> altnames = new ArrayList<>();
        List<String> symbols = new ArrayList<>();
        while (result.hasNext()) {
            BindingSet bs = result.next();
            URI prop = (URI) bs.getValue("prop");
            Literal label = (Literal) bs.getValue("label");
            if(prop.equals(RDFS.LABEL)){
                if(label.getLanguage()==null || label.getLanguage().equals("en")){
                    names.add(0,new Pair<>(label.getLanguage(),label.stringValue()));
                }else{
                    names.add(new Pair<>(label.getLanguage(),label.stringValue()));
                }
            }else if(prop.equals(OM.HAS_ALTERNATIVE_LABEL)){
                altnames.add(0,new Pair<>(label.getLanguage(),label.stringValue()));
            }else if(prop.equals(OM.HAS_ABBREVIATION)){
                altnames.add(new Pair<>(label.getLanguage(),label.stringValue()));
            }else if(prop.equals(OM.HAS_UNOFFICIAL_ABBREVIATION)){
                altnames.add(new Pair<>(label.getLanguage(),label.stringValue()));
            }else if(prop.equals(OM.HAS_SYMBOL)){
                symbols.add(0,label.stringValue());
            }else if(prop.equals(OM.HAS_ALTERNATIVE_SYMBOL)){
                symbols.add(label.stringValue());
            }
        }
        for(Pair<String,String> name : names){
            nobject.addAlternativeName(name.getValue(),name.getKey());
        }
        for(Pair<String,String> name : altnames){
            nobject.addAlternativeName(name.getValue(),name.getKey());
        }
        for(String symbol : symbols){
            nobject.addAlternativeSymbol(symbol);
        }
    }

    /**
     * Returns the OM type as a URI of the specified resource. The different types can be accessed in {@link OM}.
     * @param resourceURI The URI of the unit or scale whose type needs to be determined.
     * @param connection The connection to the repository.
     * @return The type of unit that should be created.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When type of the resource could not be found.
     */
    private URI getTypeOfResource(URI resourceURI,RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT ?type WHERE {\n" +
                "   <"+resourceURI+"> <"+ RDF.TYPE+"> ?type. \n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()){
            return (URI)result.next().getValue("type");
        }
        throw new InsufficientDataException("Could not acquire the type of the resource identified by <"+resourceURI+">",resourceURI.stringValue());
    }
}
