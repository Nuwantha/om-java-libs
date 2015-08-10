package nl.wur.fbr.om.om18;

import javafx.util.Pair;
import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.core.impl.points.ScalarPointImpl;
import nl.wur.fbr.om.core.impl.points.ScalarRangePointImpl;
import nl.wur.fbr.om.exceptions.InsufficientDataException;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.NamedObject;
import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.points.ScalarPoint;
import nl.wur.fbr.om.model.points.ScalarRangePoint;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.*;
import nl.wur.fbr.om.om18.vocabulary.OMMeta;
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
import java.util.ArrayList;
import java.util.List;

/**
 * This implementation of {@link UnitAndScaleFactory} can be used to create unit and scale instances
 * from an ontology that uses the OM ontology to define the different units and scales. The OM ontology
 * itself does not have to be accesses via this factory as the units and scales are fully initialised in
 * the OM set library.
 * @author Don Willems on 03/08/15.
 */
public class OMUnitAndScaleFactory extends DefaultUnitAndScaleFactory{

    /**
     * The Sesame SAIL in-memory repository that will contain the OM RDF file.
     * OM can be queried through this repository.
     */
    private Repository repository = null;

    /**
     * Creates a new factory initialised with the specified repository. This repository should contain the
     * OM ontology but may be available from for instance an HTTP server. The repository should be fully
     * initialised.
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
            List<URI> types = this.getTypeOfResource(uri,connection);
            NamedObject nobject = null;
            if(types.contains(OMMeta.SINGULAR_UNIT)){
                nobject = this.createSingularUnit(uri,connection);
            }else if(types.contains(OMMeta.UNIT_MULTIPLE_OR_SUBMULTIPLE)){
                nobject = this.createUnitMultiple(uri,connection);
            }else if(types.contains(OMMeta.UNIT_MULTIPLICATION)){
                nobject = this.createUnitMultiplication(uri, connection);
            }else if(types.contains(OMMeta.UNIT_DIVISION)){
                nobject = this.createUnitDivision(uri, connection);
            }else if(types.contains(OMMeta.UNIT_EXPONENTIATION)){
                nobject = this.createUnitExponentiation(uri, connection);
            }else if(types.contains(OMMeta.INTERVAL_SCALE)){
                nobject = this.createScale(uri, connection);
            }else if(types.contains(OMMeta.NOMINAL_SCALE)){
                throw new UnsupportedOperationException("Nominal scales are not yet supported.");
            }else if(types.contains(OMMeta.ORDINAL_SCALE)){
                throw new UnsupportedOperationException("Ordinal scales are not yet supported.");
            }else if(types.contains(OMMeta.RATIO_SCALE)){
                nobject = this.createScale(uri, connection);
            }else if(types.contains(OMMeta.CARDINAL_SCALE)){
                nobject = this.createScale(uri, connection);
            }else {
                throw new UnitOrScaleCreationException("The type of the requested resource with identifier <"+uri+"> " +
                        "is not one of the expected unit or scale types (types = "+types+".");
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
                "       <"+uri+"> <"+ OMMeta.HAS_DIMENSION+ "> ?dimension.\n" +
                "       ?dimension <"+ OMMeta.HAS_SI_LENGTH_DIMENSION_EXPONENT + "> ?length. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_MASS_DIMENSION_EXPONENT + "> ?mass. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_TIME_DIMENSION_EXPONENT + "> ?time. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_ELECTRIC_CURRENT_DIMENSION_EXPONENT + "> ?current. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_THERMODYNAMIC_TEMPERATURE_DIMENSION_EXPONENT + "> ?temperature. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_AMOUNT_OF_SUBSTANCE_DIMENSION_EXPONENT + "> ?amount. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_LUMINOUS_INTENSITY_DIMENSION_EXPONENT + "> ?intensity. \n"+
                "   } \n" +
                "   OPTIONAL{ \n" +
                "       <"+uri+"> <"+ OMMeta.HAS_DEFINITION+ "> ?definition.\n" +
                "       ?definition <"+ OMMeta.HAS_UNIT_OF_MEASURE_OR_MEASUREMENT_SCALE+ "> ?definitionUnit.\n" +
                "       ?definition <"+ OMMeta.HAS_NUMERICAL_VALUE+ "> ?factor.\n" +
                "   }\n"+
                "   OPTIONAL{ \n" +
                "       <"+uri+"> <"+ OMMeta.HAS_DEFINITION+ "> ?definitionUnit.\n" +
                "       ?definitionUnit a ?definitionType.\n" +
                "       ?definitionType <"+ RDFS.SUBCLASSOF+ ">* <"+OMMeta.UNIT_OF_MEASURE+">.\n" +
                "   }\n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()){
            URI gramURI = connection.getValueFactory().createURI(OMMeta.NAMESPACE, "gram");
            BindingSet bs = result.next();
            URI definitionUnitURI = null;
            double factor = 1;
            BaseDimension dimension = this.getBaseDimension(uri,connection);
            if(bs.hasBinding("definitionUnit")) {
                definitionUnitURI = (URI) bs.getValue("definitionUnit");
            }
            if(bs.hasBinding("factor")){
                factor = new Double(((Literal) bs.getValue("factor")).stringValue());
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
                "   <"+uri+"> <"+ OMMeta.HAS_SINGULAR_UNIT+"> ?sunit.\n"+
                "   <"+uri+"> <"+ OMMeta.HAS_PREFIX+"> ?prefix.\n"+
                "   OPTIONAL{ \n" +
                "       <"+uri+"> <"+ OMMeta.HAS_DIMENSION+ "> ?dimension.\n" +
                "       ?dimension <"+ OMMeta.HAS_SI_LENGTH_DIMENSION_EXPONENT + "> ?length. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_MASS_DIMENSION_EXPONENT + "> ?mass. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_TIME_DIMENSION_EXPONENT + "> ?time. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_ELECTRIC_CURRENT_DIMENSION_EXPONENT + "> ?current. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_THERMODYNAMIC_TEMPERATURE_DIMENSION_EXPONENT + "> ?temperature. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_AMOUNT_OF_SUBSTANCE_DIMENSION_EXPONENT + "> ?amount. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_LUMINOUS_INTENSITY_DIMENSION_EXPONENT + "> ?intensity. \n"+
                "   } \n" +
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()){
            BindingSet bs = result.next();
            try {
                // prefixed units can also be base units (e.g. kilogram)
                URI kilogramURI = connection.getValueFactory().createURI(OMMeta.NAMESPACE, "kilogram");
                SingularUnit sunit = (SingularUnit) this.getUnitOrScale(bs.getValue("sunit").stringValue());
                URI prefixuri = (URI) bs.getValue("prefix");
                Prefix prefix = null;
                if(prefixuri.equals(OMMeta.YOCTO)) prefix = DecimalPrefix.YOCTO;
                else if(prefixuri.equals(OMMeta.ZEPTO)) prefix = DecimalPrefix.ZEPTO;
                else if(prefixuri.equals(OMMeta.ATTO)) prefix = DecimalPrefix.ATTO;
                else if(prefixuri.equals(OMMeta.PICO)) prefix = DecimalPrefix.PICO;
                else if(prefixuri.equals(OMMeta.FEMTO)) prefix = DecimalPrefix.FEMTO;
                else if(prefixuri.equals(OMMeta.NANO)) prefix = DecimalPrefix.NANO;
                else if(prefixuri.equals(OMMeta.MICRO)) prefix = DecimalPrefix.MICRO;
                else if(prefixuri.equals(OMMeta.MILLI)) prefix = DecimalPrefix.MILLI;
                else if(prefixuri.equals(OMMeta.CENTI)) prefix = DecimalPrefix.CENTI;
                else if(prefixuri.equals(OMMeta.DECI)) prefix = DecimalPrefix.DECI;
                else if(prefixuri.equals(OMMeta.DECA)) prefix = DecimalPrefix.DECA;
                else if(prefixuri.equals(OMMeta.HECTO)) prefix = DecimalPrefix.HECTO;
                else if(prefixuri.equals(OMMeta.KILO)) prefix = DecimalPrefix.KILO;
                else if(prefixuri.equals(OMMeta.MEGA)) prefix = DecimalPrefix.MEGA;
                else if(prefixuri.equals(OMMeta.GIGA)) prefix = DecimalPrefix.GIGA;
                else if(prefixuri.equals(OMMeta.TERA)) prefix = DecimalPrefix.TERA;
                else if(prefixuri.equals(OMMeta.PETA)) prefix = DecimalPrefix.PETA;
                else if(prefixuri.equals(OMMeta.EXA)) prefix = DecimalPrefix.EXA;
                else if(prefixuri.equals(OMMeta.ZETTA)) prefix = DecimalPrefix.ZETTA;
                else if(prefixuri.equals(OMMeta.YOTTA)) prefix = DecimalPrefix.YOTTA;
                else if(prefixuri.equals(OMMeta.KIBI)) prefix = BinaryPrefix.KIBI;
                else if(prefixuri.equals(OMMeta.MEBI)) prefix = BinaryPrefix.MEBI;
                else if(prefixuri.equals(OMMeta.GIBI)) prefix = BinaryPrefix.GIBI;
                else if(prefixuri.equals(OMMeta.TEBI)) prefix = BinaryPrefix.TEBI;
                else if(prefixuri.equals(OMMeta.PEBI)) prefix = BinaryPrefix.PEBI;
                else if(prefixuri.equals(OMMeta.EXBI)) prefix = BinaryPrefix.EXBI;
                else if(prefixuri.equals(OMMeta.ZEBI)) prefix = BinaryPrefix.ZEBI;
                else if(prefixuri.equals(OMMeta.YOBI)) prefix = BinaryPrefix.YOBI;
                if(uri.equals(kilogramURI)){
                    PrefixedUnit prefixedUnit = (PrefixedUnit)this.createPrefixedBaseUnit(uri.stringValue(), (String) null, (String) null, SIBaseDimension.MASS, sunit, prefix);
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
     * @return The unit multiplication.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit,
     * or when one of the parent units could not be created.
     */
    private UnitMultiplication createUnitMultiplication(URI uri, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+uri+"> <"+ OMMeta.HAS_TERM1+"> ?term1.\n"+
                "   <"+uri+"> <"+ OMMeta.HAS_TERM2+"> ?term2.\n"+
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
     * Creates a unit division identified by the specified OM URI. The type of unit should already be
     * determined to be a unit division.
     * @param uri The URI (identifier) of the unit.
     * @param connection The connection to the repository.
     * @return The unit division.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit,
     * or when one of the parent units could not be created.
     */
    private UnitDivision createUnitDivision(URI uri, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+uri+"> <"+ OMMeta.HAS_NUMERATOR+"> ?numerator.\n"+
                "   <"+uri+"> <"+ OMMeta.HAS_DENOMINATOR+"> ?denominator.\n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()) {
            BindingSet bs = result.next();
            URI numeratorURI = (URI) bs.getValue("numerator");
            URI denominatorURI = (URI) bs.getValue("denominator");
            Unit numerator = (Unit) this.getUnitOrScale(numeratorURI.stringValue());
            Unit denominator = (Unit) this.getUnitOrScale(denominatorURI.stringValue());
            UnitDivision unit = this.createUnitDivision(uri.stringValue(), null, null, numerator, denominator);
            return unit;
        }
        throw new InsufficientDataException("Could not acquire the data of the unit division identified by <"+uri+">",uri.stringValue());
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
                "   <"+uri+"> <"+ OMMeta.HAS_BASE+"> ?base.\n"+
                "   <"+uri+"> <"+ OMMeta.HAS_EXPONENT+"> ?exponent.\n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()) {
            BindingSet bs = result.next();
            URI baseURI = (URI) bs.getValue("base");
            int exponent = ((Literal) bs.getValue("exponent")).intValue();
            Unit unit = (Unit) this.getUnitOrScale(baseURI.stringValue());
            UnitExponentiation unitExponentiation = this.createUnitExponentiation(uri.stringValue(), null, null, unit, exponent);
            return unitExponentiation;
        }
        throw new InsufficientDataException("Could not acquire the data of the unit exponentiation identified by <"+uri+">",uri.stringValue());
    }

    /**
     * Creates a measurement scale identified by the specified OM URI. The type of scale should already be
     * determined to be a unit exponentiation.
     * @param uri The URI (identifier) of the unit.
     * @param connection The connection to the repository.
     * @return The unit exponentiation.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit, or when the parent scale could not be created.
     */
    private Scale createScale(URI uri, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   OPTIONAL{ \n" +
                "       <"+uri+"> <"+ OMMeta.HAS_DEFINITION_RELATIVE_TO+"> ?parent.\n"+
                "       <"+uri+"> <"+ OMMeta.HAS_DEFINITION_FACTOR+"> ?factor.\n"+
                "       <"+uri+"> <"+ OMMeta.HAS_DEFINITION_OFFSET+"> ?offset.\n" +
                "   }\n"+
                "   OPTIONAL{ <"+uri+"> <"+ OMMeta.HAS_UNIT_OF_MEASURE+"> ?unit.}\n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()) {
            BindingSet bs = result.next();
            URI unitURI = (URI) bs.getValue("unit");
            Unit unit = (Unit) this.getUnitOrScale(unitURI.stringValue());
            if (bs.hasBinding("parent")) {
                URI parentURI = (URI) bs.getValue("parent");
                double factor = new Double(((Literal) bs.getValue("factor")).stringValue());
                double offset = new Double(((Literal) bs.getValue("offset")).stringValue());
                Scale parentscale = (Scale) this.getUnitOrScale(parentURI.stringValue());
                Scale scale = this.createScale(uri.stringValue(), null, null, parentscale, offset, factor, unit);
                this.addFixedPointsToScale(scale, connection);
                return scale;
            } else { // top scales such as Kelvin with not parent scale
                Scale scale = this.createScale(uri.stringValue(), null, null,unit);
                this.addFixedPointsToScale(scale, connection);
                return scale;
            }
        }
        throw new InsufficientDataException("Could not acquire the data of the measurement scale identified by <"+uri+">",uri.stringValue());
    }

    /**
     * Retrieves the fixed points that define the measurement scale.
     * @param scale The scale.
     * @param connection The connection to the repository.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     */
    private void addFixedPointsToScale(Scale scale, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+scale.getIdentifier()+"> <"+ OMMeta.HAS_ELEMENT+ "> ?element.\n" +
                "   ?element a <"+ OMMeta.FIXED_POINT+">.\n" +
                "   ?element <"+ OMMeta.HAS_NUMERICAL_VALUE+"> ?value." +
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        while(result.hasNext()) {
            BindingSet bs = result.next();
            URI elementURI = (URI) bs.getValue("element");
            try {
                String nvalue = ((Literal) bs.getValue("value")).stringValue();
                if (nvalue.contains(" to ")) {
                    int pos = nvalue.indexOf(" to ");
                    double minv = new Double(nvalue.substring(0, pos));
                    double maxv = new Double(nvalue.substring(pos + 4));
                    ScalarRangePoint point = new ScalarRangePointImpl(minv, maxv, scale);
                    scale.addDefinitionPoint(point);
                } else {
                    double value = new Double(nvalue);
                    ScalarPoint point = new ScalarPointImpl(value, scale);
                    scale.addDefinitionPoint(point);
                }
            }catch (NumberFormatException e){
                // todo logging of warnings
            }
        }
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
    private BaseDimension getBaseDimension(URI uri,RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+uri+"> <"+ OMMeta.HAS_DIMENSION+ "> ?dimension.\n" +
                "   ?dimension <"+ OMMeta.HAS_SI_LENGTH_DIMENSION_EXPONENT + "> ?length. \n"+
                "   ?dimension <"+ OMMeta.HAS_SI_MASS_DIMENSION_EXPONENT + "> ?mass. \n"+
                "   ?dimension <"+ OMMeta.HAS_SI_TIME_DIMENSION_EXPONENT + "> ?time. \n"+
                "   ?dimension <"+ OMMeta.HAS_SI_ELECTRIC_CURRENT_DIMENSION_EXPONENT + "> ?current. \n"+
                "   ?dimension <"+ OMMeta.HAS_SI_THERMODYNAMIC_TEMPERATURE_DIMENSION_EXPONENT + "> ?temperature. \n"+
                "   ?dimension <"+ OMMeta.HAS_SI_AMOUNT_OF_SUBSTANCE_DIMENSION_EXPONENT + "> ?amount. \n"+
                "   ?dimension <"+ OMMeta.HAS_SI_LUMINOUS_INTENSITY_DIMENSION_EXPONENT + "> ?intensity. \n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()) {
            BindingSet bs = result.next();
            BaseDimension dimension = null;
            if(bs.hasBinding("dimension")) {
                int length = ((Literal) bs.getValue("length")).intValue();
                int mass = ((Literal) bs.getValue("mass")).intValue();
                int time = ((Literal) bs.getValue("time")).intValue();
                int current = ((Literal) bs.getValue("current")).intValue();
                int temperature = ((Literal) bs.getValue("temperature")).intValue();
                int amount = ((Literal) bs.getValue("amount")).intValue();
                int intensity = ((Literal) bs.getValue("intensity")).intValue();
                if(length==1 && mass==0 && time==0 && current==0 && temperature==0 && amount==0 && intensity==0){
                    dimension = SIBaseDimension.LENGTH;
                }else if(length==0 && mass==1 && time==0 && current==0 && temperature==0 && amount==0 && intensity==0){
                    dimension = SIBaseDimension.MASS;
                }else if(length==0 && mass==0 && time==1 && current==0 && temperature==0 && amount==0 && intensity==0){
                    dimension = SIBaseDimension.TIME;
                }else if(length==0 && mass==0 && time==0 && current==1 && temperature==0 && amount==0 && intensity==0){
                    dimension = SIBaseDimension.ELECTRIC_CURRENT;
                }else if(length==0 && mass==0 && time==0 && current==0 && temperature==1 && amount==0 && intensity==0){
                    dimension = SIBaseDimension.THERMODYNAMIC_TEMPERATURE;
                }else if(length==0 && mass==0 && time==0 && current==0 && temperature==0 && amount==1 && intensity==0){
                    dimension = SIBaseDimension.AMOUNT_OF_SUBSTANCE;
                }else if(length==0 && mass==0 && time==0 && current==0 && temperature==0 && amount==0 && intensity==1){
                    dimension = SIBaseDimension.LUMINOUS_INTENSITY;
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
                "    <"+uri.stringValue()+"> <"+ OMMeta.HAS_ALTERNATIVE_LABEL+"> ?label.\n" +
                "    BIND (<"+ OMMeta.HAS_ALTERNATIVE_LABEL+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+uri.stringValue()+"> <"+ OMMeta.HAS_SYMBOL+"> ?label.\n" +
                "    BIND (<"+ OMMeta.HAS_SYMBOL+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+uri.stringValue()+"> <"+ OMMeta.HAS_ALTERNATIVE_SYMBOL+"> ?label.\n" +
                "    BIND (<"+ OMMeta.HAS_ALTERNATIVE_SYMBOL+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+uri.stringValue()+"> <"+ OMMeta.HAS_UNOFFICIAL_ABBREVIATION+"> ?label.\n" +
                "    BIND (<"+ OMMeta.HAS_UNOFFICIAL_ABBREVIATION+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+uri.stringValue()+"> <"+ OMMeta.HAS_ABBREVIATION+"> ?label.\n" +
                "    BIND (<"+ OMMeta.HAS_ABBREVIATION+"> AS ?prop)\n" +
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
            }else if(prop.equals(OMMeta.HAS_ALTERNATIVE_LABEL)){
                altnames.add(0,new Pair<>(label.getLanguage(),label.stringValue()));
            }else if(prop.equals(OMMeta.HAS_ABBREVIATION)){
                altnames.add(new Pair<>(label.getLanguage(),label.stringValue()));
            }else if(prop.equals(OMMeta.HAS_UNOFFICIAL_ABBREVIATION)){
                altnames.add(new Pair<>(label.getLanguage(),label.stringValue()));
            }else if(prop.equals(OMMeta.HAS_SYMBOL)){
                symbols.add(0,label.stringValue());
            }else if(prop.equals(OMMeta.HAS_ALTERNATIVE_SYMBOL)){
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
     * Returns the OM type as a URI of the specified resource. The different types can be accessed in {@link OMMeta}.
     * @param resourceURI The URI of the unit or scale whose type needs to be determined.
     * @param connection The connection to the repository.
     * @return The type of unit that should be created.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When type of the resource could not be found.
     */
    private List<URI> getTypeOfResource(URI resourceURI,RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT ?type WHERE {\n" +
                "   <"+resourceURI+"> <"+ RDF.TYPE+"> ?dtype. \n"+
                "   ?dtype <"+ RDFS.SUBCLASSOF+">* ?type. \n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        List<URI> types = new ArrayList<>();
        while(result.hasNext()){
            BindingSet bs = result.next();
            if(bs.getValue("type") instanceof URI) types.add((URI)bs.getValue("type"));
        }
        if(types.size()>0) return types;
        throw new InsufficientDataException("Could not acquire the type of the resource identified by <"+resourceURI+">",resourceURI.stringValue());
    }
}
