package nl.wur.fbr.om.om20;

import javafx.util.Pair;
import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.core.impl.points.PointImpl;
import nl.wur.fbr.om.exceptions.InsufficientDataException;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.NamedObject;
import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.*;
import nl.wur.fbr.om.om20.vocabulary.OMMeta;
import nl.wur.fbr.om.prefixes.BinaryPrefix;
import nl.wur.fbr.om.prefixes.DecimalPrefix;
import nl.wur.fbr.om.prefixes.Prefix;
import org.apache.commons.lang3.Range;
import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.model.vocabulary.RDFS;
import org.eclipse.rdf4j.query.*;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryException;

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
     * Returns the Unit or Scale identified by the specified identifier (either the full IRI or the local name)
     * within the OM ontology. <br>
     * If the Unit or Scale with the same identifier has been created previously, this method should return the
     * same instance.
     *
     * If the Unit or Scale has not been created previously, this method should create the
     * unit or scale and set the identifier (IRI) of the unit or scale to the specified identifier.
     * If the data for creating a new instance is not available, e.g. is not part of the core set, or the identifier does not
     * represent a unit or scale, this method will throw a {@link UnitOrScaleCreationException}.
     * @param identifier The identifier of the unit or scale, in OM the string representation of a IRI.
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
            IRI IRI = null;
            if(identifier.startsWith("http://")){
                IRI = vf.createIRI(identifier);
            }else{
                IRI = vf.createIRI("http://www.wurvoc.org/vocabularies/om-1.8/",identifier);
            }
            RepositoryConnection connection = null;
            try{
                connection = repository.getConnection();
                uos = createUnitOrScaleFromIRI(IRI,connection);
            } catch (RepositoryException e) {
                throw new UnitOrScaleCreationException("Could not create unit or scale <"+IRI+"> because the repository" +
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
     * Creates an instance of the unit or scale identified by the specified IRI.
     * @param IRI The IRI in OM of the unit or scale to be created.
     * @param connection The connection to the repository.
     * @return The Unit or Scale.
     * @throws UnitOrScaleCreationException If the unit or scale could not be created.
     */
    private Object createUnitOrScaleFromIRI(IRI IRI,RepositoryConnection connection) throws UnitOrScaleCreationException {
        try {
            List<IRI> types = this.getTypeOfResource(IRI,connection);
            NamedObject nobject = null;
            if(types.contains(OMMeta.SINGULAR_UNIT)){
                nobject = this.createSingularUnit(IRI,connection);
            }else if(types.contains(OMMeta.PREFIXED_UNIT)){
                nobject = this.createPrefixedUnit(IRI, connection);
            }else if(types.contains(OMMeta.UNIT_MULTIPLE)){
                nobject = this.createUnitMultiple(IRI, connection);
            }else if(types.contains(OMMeta.UNIT_MULTIPLICATION)){
                nobject = this.createUnitMultiplication(IRI, connection);
            }else if(types.contains(OMMeta.UNIT_DIVISION)){
                nobject = this.createUnitDivision(IRI, connection);
            }else if(types.contains(OMMeta.UNIT_EXPONENTIATION)){
                nobject = this.createUnitExponentiation(IRI, connection);
            }else if(types.contains(OMMeta.INTERVAL_SCALE)){
                nobject = this.createScale(IRI, connection);
            }else if(types.contains(OMMeta.RATIO_SCALE)){
                nobject = this.createScale(IRI, connection);
            }else if(types.contains(OMMeta.SCALE)){
                nobject = this.createScale(IRI, connection);
            }else {
                throw new UnitOrScaleCreationException("The type of the requested resource with identifier <"+IRI+"> " +
                        "is not one of the expected unit or scale types (types = "+types+".");
            }
            this.addNamesAndSymbols(IRI,nobject,connection);
            return nobject;
        } catch (MalformedQueryException e) { // SHOULD NOT HAPPEN AS THE SPARQL IS PREDEFINED.
            throw new UnitOrScaleCreationException("Could not create unit or scale <"+IRI+"> because the repository" +
                    " was accessed with an invalid SPARQL query.",IRI.stringValue(),e);
        } catch (RepositoryException e) {
            throw new UnitOrScaleCreationException("Could not create unit or scale <"+IRI+"> because the repository" +
                    " could not be accessed.",IRI.stringValue(),e);
        } catch (QueryEvaluationException e) {// SHOULD NOT HAPPEN AS THE SPARQL IS PREDEFINED.
            throw new UnitOrScaleCreationException("Could not create unit or scale <"+IRI+"> because the repository" +
                    " was accessed with an invalid SPARQL query.",IRI.stringValue(),e);
        } catch (Throwable e){
            throw new UnitOrScaleCreationException("Could not create unit or scale <"+IRI+">.",IRI.stringValue(),e);
        }
    }

    /**
     * Creates a singular (or base) unit from the specified IRI. The type of unit should already be determined to be
     * a singular unit.
     * @param IRI The IRI (identifier) of the unit.
     * @param connection The connection to the repository.
     * @return The singular unit.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit, or when the definition unit could not be created.
     */
    private SingularUnit createSingularUnit(IRI IRI, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT * WHERE {\n" +
                "   OPTIONAL{ \n" +
                "       <"+IRI+"> <"+ OMMeta.HAS_DIMENSION+ "> ?dimension.\n" +
                "       ?dimension <"+ OMMeta.HAS_SI_LENGTH_DIMENSION_EXPONENT + "> ?length. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_MASS_DIMENSION_EXPONENT + "> ?mass. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_TIME_DIMENSION_EXPONENT + "> ?time. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_ELECTRIC_CURRENT_DIMENSION_EXPONENT + "> ?current. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_THERMODYNAMIC_TEMPERATURE_DIMENSION_EXPONENT + "> ?temperature. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_AMOUNT_OF_SUBSTANCE_DIMENSION_EXPONENT + "> ?amount. \n"+
                "       ?dimension <"+ OMMeta.HAS_SI_LUMINOUS_INTENSITY_DIMENSION_EXPONENT + "> ?intensity. \n"+
                "   } \n" +
                "   OPTIONAL{ \n" +
                "       <"+IRI+"> <"+ OMMeta.HAS_UNIT+ "> ?definitionUnit.\n" +
                "   }\n"+
                "   OPTIONAL{ \n" +
                "       <"+IRI+"> <"+ OMMeta.HAS_FACTOR+ "> ?factor.\n" +
                "   }\n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()){
            IRI gramIRI = connection.getValueFactory().createIRI(OMMeta.NAMESPACE, "gram");
            BindingSet bs = result.next();
            IRI definitionUnitIRI = null;
            double factor = 1;
            BaseDimension dimension = this.getBaseDimension(IRI,connection);
            if(bs.hasBinding("definitionUnit")) {
                definitionUnitIRI = (IRI) bs.getValue("definitionUnit");
            }
            if(bs.hasBinding("factor")){
                factor = new Double(((Literal) bs.getValue("factor")).stringValue());
            }
            if(definitionUnitIRI!=null && !IRI.equals(gramIRI)){
                Unit defUnit = null;
                try {
                    defUnit = (Unit)getUnitOrScale(definitionUnitIRI.stringValue());
                } catch (UnitOrScaleCreationException e) {
                    throw new UnitOrScaleCreationException("The definition unit with IRI <"+definitionUnitIRI.stringValue()+"> of the singular unit <"+IRI+"> could not be created.",IRI.stringValue(),e);
                }
                SingularUnit singularUnit = this.createSingularUnit(IRI.stringValue(), (String) null, (String) null, defUnit,factor);
                return singularUnit;
            } else if(IRI.equals(gramIRI)){
                SingularUnit singularUnit = this.createSingularUnit(IRI.stringValue(),(String)null,(String)null);
                this.getUnitOrScale(definitionUnitIRI.stringValue());
                return singularUnit;
            } else {
                BaseUnit baseUnit = this.createBaseUnit(IRI.stringValue(), (String) null, (String) null, dimension);
                return (SingularUnit)baseUnit;
            }
        }
        throw new InsufficientDataException("Could not acquire the data of the singular unit identified by <"+IRI+">",IRI.stringValue());
    }


    /**
     * Creates a prefixed unit identified by the specified OM IRI. The type of unit should already be
     * determined to be a unit multiple.
     * @param IRI The IRI (identifier) of the unit.
     * @param connection The connection to the repository.
     * @return The prefixed unit.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit, or when the parent unit could not be created.
     */
    private PrefixedUnit createPrefixedUnit(IRI IRI, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+IRI+"> <"+ OMMeta.HAS_UNIT+"> ?sunit.\n"+
                "   <"+IRI+"> <"+ OMMeta.HAS_PREFIX+"> ?prefix.\n"+
                "   OPTIONAL{ \n" +
                "       <"+IRI+"> <"+ OMMeta.HAS_DIMENSION+ "> ?dimension.\n" +
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
                IRI kilogramIRI = connection.getValueFactory().createIRI(OMMeta.NAMESPACE, "kilogram");
                SingularUnit sunit = (SingularUnit) this.getUnitOrScale(bs.getValue("sunit").stringValue());
                IRI prefixIRI = (IRI) bs.getValue("prefix");
                Prefix prefix = null;
                if(prefixIRI.equals(OMMeta.YOCTO)) prefix = DecimalPrefix.YOCTO;
                else if(prefixIRI.equals(OMMeta.ZEPTO)) prefix = DecimalPrefix.ZEPTO;
                else if(prefixIRI.equals(OMMeta.ATTO)) prefix = DecimalPrefix.ATTO;
                else if(prefixIRI.equals(OMMeta.PICO)) prefix = DecimalPrefix.PICO;
                else if(prefixIRI.equals(OMMeta.FEMTO)) prefix = DecimalPrefix.FEMTO;
                else if(prefixIRI.equals(OMMeta.NANO)) prefix = DecimalPrefix.NANO;
                else if(prefixIRI.equals(OMMeta.MICRO)) prefix = DecimalPrefix.MICRO;
                else if(prefixIRI.equals(OMMeta.MILLI)) prefix = DecimalPrefix.MILLI;
                else if(prefixIRI.equals(OMMeta.CENTI)) prefix = DecimalPrefix.CENTI;
                else if(prefixIRI.equals(OMMeta.DECI)) prefix = DecimalPrefix.DECI;
                else if(prefixIRI.equals(OMMeta.DECA)) prefix = DecimalPrefix.DECA;
                else if(prefixIRI.equals(OMMeta.HECTO)) prefix = DecimalPrefix.HECTO;
                else if(prefixIRI.equals(OMMeta.KILO)) prefix = DecimalPrefix.KILO;
                else if(prefixIRI.equals(OMMeta.MEGA)) prefix = DecimalPrefix.MEGA;
                else if(prefixIRI.equals(OMMeta.GIGA)) prefix = DecimalPrefix.GIGA;
                else if(prefixIRI.equals(OMMeta.TERA)) prefix = DecimalPrefix.TERA;
                else if(prefixIRI.equals(OMMeta.PETA)) prefix = DecimalPrefix.PETA;
                else if(prefixIRI.equals(OMMeta.EXA)) prefix = DecimalPrefix.EXA;
                else if(prefixIRI.equals(OMMeta.ZETTA)) prefix = DecimalPrefix.ZETTA;
                else if(prefixIRI.equals(OMMeta.YOTTA)) prefix = DecimalPrefix.YOTTA;
                else if(prefixIRI.equals(OMMeta.KIBI)) prefix = BinaryPrefix.KIBI;
                else if(prefixIRI.equals(OMMeta.MEBI)) prefix = BinaryPrefix.MEBI;
                else if(prefixIRI.equals(OMMeta.GIBI)) prefix = BinaryPrefix.GIBI;
                else if(prefixIRI.equals(OMMeta.TEBI)) prefix = BinaryPrefix.TEBI;
                else if(prefixIRI.equals(OMMeta.PEBI)) prefix = BinaryPrefix.PEBI;
                else if(prefixIRI.equals(OMMeta.EXBI)) prefix = BinaryPrefix.EXBI;
                else if(prefixIRI.equals(OMMeta.ZEBI)) prefix = BinaryPrefix.ZEBI;
                else if(prefixIRI.equals(OMMeta.YOBI)) prefix = BinaryPrefix.YOBI;
                if(IRI.equals(kilogramIRI)){
                    PrefixedUnit prefixedUnit = (PrefixedUnit)this.createPrefixedBaseUnit(IRI.stringValue(), (String) null, (String) null, SIBaseDimension.MASS, sunit, prefix);
                    return prefixedUnit;
                }else{
                    PrefixedUnit prefixedUnit = this.createPrefixedUnit(IRI.stringValue(), (String) null, (String) null, sunit,prefix);
                    return prefixedUnit;
                }
            } catch (UnitOrScaleCreationException e) {
                throw new UnitOrScaleCreationException("The parent unit with IRI <"+bs.getValue("sunit").stringValue()+"> of the unit multiple <"+IRI+"> could not be created.",IRI.stringValue(),e);
            }
        }
        throw new InsufficientDataException("Could not acquire the data of the unit multiple identified by <"+IRI+">",IRI.stringValue());
    }

    /**
     * Creates a unit multiple or prefixed unit identified by the specified OM IRI. The type of unit should already be
     * determined to be a unit multiple.
     * @param IRI The IRI (identifier) of the unit.
     * @param connection The connection to the repository.
     * @return The unit multiple.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit, or when the parent unit could not be created.
     */
    private UnitMultiple createUnitMultiple(IRI IRI, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+IRI+"> <"+ OMMeta.HAS_UNIT+"> ?sunit.\n"+
                "   <"+IRI+"> <"+ OMMeta.HAS_FACTOR+"> ?factor.\n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()){
            BindingSet bs = result.next();
            try {
                double factor = 1;
                Unit sunit = (Unit) this.getUnitOrScale(bs.getValue("sunit").stringValue());
                if(bs.hasBinding("factor")){
                    factor = new Double(((Literal) bs.getValue("factor")).stringValue());
                }
                UnitMultiple unitMultiple = (UnitMultiple)this.createUnitMultiple(IRI.stringValue(),null,null,sunit,factor);
                return unitMultiple;
            } catch (UnitOrScaleCreationException e) {
                throw new UnitOrScaleCreationException("The parent unit with IRI <"+bs.getValue("sunit").stringValue()+"> of the unit multiple <"+IRI+"> could not be created.",IRI.stringValue(),e);
            }
        }
        throw new InsufficientDataException("Could not acquire the data of the unit multiple identified by <"+IRI+">",IRI.stringValue());
    }

    /**
     * Creates a unit multiplication identified by the specified OM IRI. The type of unit should already be
     * determined to be a unit multiplication.
     * @param IRI The IRI (identifier) of the unit.
     * @param connection The connection to the repository.
     * @return The unit multiplication.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit,
     * or when one of the parent units could not be created.
     */
    private UnitMultiplication createUnitMultiplication(IRI IRI, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+IRI+"> <"+ OMMeta.HAS_TERM1+"> ?term1.\n"+
                "   <"+IRI+"> <"+ OMMeta.HAS_TERM2+"> ?term2.\n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()) {
            BindingSet bs = result.next();
            IRI term1IRI = (IRI) bs.getValue("term1");
            IRI term2IRI = (IRI) bs.getValue("term2");
            Unit term1 = (Unit) this.getUnitOrScale(term1IRI.stringValue());
            Unit term2 = (Unit) this.getUnitOrScale(term2IRI.stringValue());
            UnitMultiplication unit = this.createUnitMultiplication(IRI.stringValue(), null, null, term1, term2);
            return unit;
        }
        throw new InsufficientDataException("Could not acquire the data of the unit multiplication identified by <"+IRI+">",IRI.stringValue());
    }

    /**
     * Creates a unit division identified by the specified OM IRI. The type of unit should already be
     * determined to be a unit division.
     * @param IRI The IRI (identifier) of the unit.
     * @param connection The connection to the repository.
     * @return The unit division.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit,
     * or when one of the parent units could not be created.
     */
    private UnitDivision createUnitDivision(IRI IRI, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+IRI+"> <"+ OMMeta.HAS_NUMERATOR+"> ?numerator.\n"+
                "   <"+IRI+"> <"+ OMMeta.HAS_DENOMINATOR+"> ?denominator.\n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()) {
            BindingSet bs = result.next();
            IRI numeratorIRI = (IRI) bs.getValue("numerator");
            IRI denominatorIRI = (IRI) bs.getValue("denominator");
            Unit numerator = (Unit) this.getUnitOrScale(numeratorIRI.stringValue());
            Unit denominator = (Unit) this.getUnitOrScale(denominatorIRI.stringValue());
            UnitDivision unit = this.createUnitDivision(IRI.stringValue(), null, null, numerator, denominator);
            return unit;
        }
        throw new InsufficientDataException("Could not acquire the data of the unit division identified by <"+IRI+">",IRI.stringValue());
    }

    /**
     * Creates a unit exponentiation identified by the specified OM IRI. The type of unit should already be
     * determined to be a unit exponentiation.
     * @param IRI The IRI (identifier) of the unit.
     * @param connection The connection to the repository.
     * @return The unit exponentiation.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit, or when the parent unit could not be created.
     */
    private UnitExponentiation createUnitExponentiation(IRI IRI, RepositoryConnection connection) throws UnitOrScaleCreationException, MalformedQueryException, RepositoryException, QueryEvaluationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+IRI+"> <"+ OMMeta.HAS_BASE+"> ?base.\n"+
                "   <"+IRI+"> <"+ OMMeta.HAS_EXPONENT+"> ?exponent.\n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()) {
            BindingSet bs = result.next();
            IRI baseIRI = (IRI) bs.getValue("base");
            int exponent = ((Literal) bs.getValue("exponent")).intValue();
            Unit unit = (Unit) this.getUnitOrScale(baseIRI.stringValue());
            UnitExponentiation unitExponentiation = this.createUnitExponentiation(IRI.stringValue(), null, null, unit, exponent);
            return unitExponentiation;
        }
        throw new InsufficientDataException("Could not acquire the data of the unit exponentiation identified by <"+IRI+">",IRI.stringValue());
    }

    /**
     * Creates a measurement scale identified by the specified OM IRI. The type of scale should already be
     * determined to be a unit exponentiation.
     * @param IRI The IRI (identifier) of the unit.
     * @param connection The connection to the repository.
     * @return The unit exponentiation.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When not enough data could be found in the OM repository to create the unit, or when the parent scale could not be created.
     */
    private Scale createScale(IRI IRI, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   OPTIONAL{ \n" +
                "       <"+IRI+"> <"+ OMMeta.HAS_SCALE+"> ?parent.\n"+
                "       <"+IRI+"> <"+ OMMeta.HAS_FACTOR+"> ?factor.\n"+
                "       <"+IRI+"> <"+ OMMeta.HAS_OFFSET+"> ?offset.\n" +
                "   }\n"+
                "   OPTIONAL{ <"+IRI+"> <"+ OMMeta.HAS_UNIT+"> ?unit.}\n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        if(result.hasNext()) {
            BindingSet bs = result.next();
            IRI unitIRI = (IRI) bs.getValue("unit");
            Unit unit = (Unit) this.getUnitOrScale(unitIRI.stringValue());
            if (bs.hasBinding("parent")) {
                IRI parentIRI = (IRI) bs.getValue("parent");
                double factor = new Double(((Literal) bs.getValue("factor")).stringValue());
                double offset = new Double(((Literal) bs.getValue("offset")).stringValue());
                Scale parentscale = (Scale) this.getUnitOrScale(parentIRI.stringValue());
                Scale scale = this.createScale(IRI.stringValue(), null, null, parentscale, offset, factor, unit);
                this.addFixedPointsToScale(scale, connection);
                return scale;
            } else { // top scales such as Kelvin with not parent scale
                Scale scale = this.createScale(IRI.stringValue(), null, null,unit);
                this.addFixedPointsToScale(scale, connection);
                return scale;
            }
        }
        throw new InsufficientDataException("Could not acquire the data of the measurement scale identified by <"+IRI+">",IRI.stringValue());
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
                "   <"+scale.getIdentifier()+"> <"+ OMMeta.HAS_POINT+ "> ?element.\n" +
                "   ?element a <"+ OMMeta.FIXED_POINT+">.\n" +
                "   ?element <"+ OMMeta.HAS_NUMERICAL_VALUE+"> ?value." +
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        while(result.hasNext()) {
            BindingSet bs = result.next();
            IRI elementIRI = (IRI) bs.getValue("element");
            try {
                String nvalue = ((Literal) bs.getValue("value")).stringValue();
                if (nvalue.contains(" to ")) {
                    int pos = nvalue.indexOf(" to ");
                    double minv = new Double(nvalue.substring(0, pos));
                    double maxv = new Double(nvalue.substring(pos + 4));
                    Point point = new PointImpl(Range.between(minv, maxv), scale);
                    scale.addDefinitionPoint(point);
                } else {
                    double value = new Double(nvalue);
                    Point point = new PointImpl(value, scale);
                    scale.addDefinitionPoint(point);
                }
            }catch (NumberFormatException e){
                // todo logging of warnings
            }
        }
    }

    /**
     * Retrieves the dimension of the unit if it has only one dimension. Only used for base units.
     * @param IRI The IRI of the unit.
     * @param connection The connection to the repository.
     * @return The dimension of the unit.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     */
    private BaseDimension getBaseDimension(IRI IRI,RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException {
        String sparql = "" +
                "SELECT * WHERE{\n" +
                "   <"+IRI+"> <"+ OMMeta.HAS_DIMENSION+ "> ?dimension.\n" +
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
     * @param IRI The IRI of the unit or scale.
     * @param nobject The unit or scale object to which the names and symbols are added.
     * @param connection The connection to the repository.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws InsufficientDataException When not enough data could be found in the OM repository to create the unit.
     */
    private void addNamesAndSymbols(IRI IRI, NamedObject nobject, RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException {
        String sparql = "" +
                "SELECT ?label ?prop WHERE {\n" +
                "  {\n" +
                "    <"+IRI.stringValue()+"> <"+ RDFS.LABEL+"> ?label.\n" +
                "    BIND (<"+ RDFS.LABEL+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+IRI.stringValue()+"> <"+ OMMeta.HAS_ALTERNATIVE_LABEL+"> ?label.\n" +
                "    BIND (<"+ OMMeta.HAS_ALTERNATIVE_LABEL+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+IRI.stringValue()+"> <"+ OMMeta.HAS_SYMBOL+"> ?label.\n" +
                "    BIND (<"+ OMMeta.HAS_SYMBOL+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+IRI.stringValue()+"> <"+ OMMeta.HAS_ALTERNATIVE_SYMBOL+"> ?label.\n" +
                "    BIND (<"+ OMMeta.HAS_ALTERNATIVE_SYMBOL+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+IRI.stringValue()+"> <"+ OMMeta.HAS_UNOFFICIAL_ABBREVIATION+"> ?label.\n" +
                "    BIND (<"+ OMMeta.HAS_UNOFFICIAL_ABBREVIATION+"> AS ?prop)\n" +
                "  } UNION {\n" +
                "    <"+IRI.stringValue()+"> <"+ OMMeta.HAS_ABBREVIATION+"> ?label.\n" +
                "    BIND (<"+ OMMeta.HAS_ABBREVIATION+"> AS ?prop)\n" +
                "  }\n" +
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        List<Pair<String,String>> names = new ArrayList<>();
        List<Pair<String,String>> altnames = new ArrayList<>();
        List<String> symbols = new ArrayList<>();
        while (result.hasNext()) {
            BindingSet bs = result.next();
            IRI prop = (IRI) bs.getValue("prop");
            Literal label = (Literal) bs.getValue("label");
            if(prop.equals(RDFS.LABEL)){
                if(label.getLanguage()==null || label.getLanguage().equals("en")){
                    names.add(0,new Pair<>(label.getLanguage().toString(),label.stringValue()));
                }else{
                    names.add(new Pair<>(label.getLanguage().toString(),label.stringValue()));
                }
            }else if(prop.equals(OMMeta.HAS_ALTERNATIVE_LABEL)){
                altnames.add(0,new Pair<>(label.getLanguage().toString(),label.stringValue()));
            }else if(prop.equals(OMMeta.HAS_ABBREVIATION)){
                altnames.add(new Pair<>(label.getLanguage().toString(),label.stringValue()));
            }else if(prop.equals(OMMeta.HAS_UNOFFICIAL_ABBREVIATION)){
                altnames.add(new Pair<>(label.getLanguage().toString(),label.stringValue()));
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
     * Returns the OM type as a IRI of the specified resource. The different types can be accessed in {@link OMMeta}.
     * @param resourceIRI The IRI of the unit or scale whose type needs to be determined.
     * @param connection The connection to the repository.
     * @return The type of unit that should be created.
     * @throws MalformedQueryException When the query was malformed.
     * @throws RepositoryException When the repository could not be accessed.
     * @throws QueryEvaluationException When the query could not be evaluated.
     * @throws UnitOrScaleCreationException When type of the resource could not be found.
     */
    private List<IRI> getTypeOfResource(IRI resourceIRI,RepositoryConnection connection) throws MalformedQueryException, RepositoryException, QueryEvaluationException, UnitOrScaleCreationException {
        String sparql = "" +
                "SELECT ?type WHERE {\n" +
                "   <"+resourceIRI+"> <"+ RDF.TYPE+"> ?dtype. \n"+
                "   ?dtype <"+ RDFS.SUBCLASSOF+">* ?type. \n"+
                "}";
        TupleQueryResult result = connection.prepareTupleQuery(QueryLanguage.SPARQL,sparql).evaluate();
        List<IRI> types = new ArrayList<>();
        while(result.hasNext()){
            BindingSet bs = result.next();
            if(bs.getValue("type") instanceof IRI) types.add((IRI)bs.getValue("type"));
        }
        if(types.size()>0) return types;
        throw new InsufficientDataException("Could not acquire the type of the resource identified by <"+resourceIRI+">",resourceIRI.stringValue());
    }
}
