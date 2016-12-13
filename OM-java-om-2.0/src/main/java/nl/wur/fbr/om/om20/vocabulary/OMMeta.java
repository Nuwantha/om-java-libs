package nl.wur.fbr.om.om20.vocabulary;


import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

/**
 * This class defines static IRIs used in the OM vocabulary. These IRIs are all part of the OM model, not of
 * individual units, scales, or quantities. The namespace is: http://www.wurvoc.org/vocabulary/om-1.8/.
 */
public class OMMeta {
	public static final String NAMESPACE;

    // units and prefixes
    public final static IRI SINGULAR_UNIT;
    public final static IRI COMPOUND_UNIT;
    public final static IRI PREFIXED_UNIT;
    public final static IRI UNIT_MULTIPLE;
    public final static IRI UNIT_MULTIPLICATION;
    public final static IRI UNIT_DIVISION;
    public final static IRI UNIT_EXPONENTIATION;
    public final static IRI UNIT;
    public final static IRI SI_PREFIX;
    public final static IRI BINARY_PREFIX;
    public final static IRI PREFIX;

    // SI prefixes
    public final static IRI YOCTO;
    public final static IRI ZEPTO;
    public final static IRI ATTO;
    public final static IRI PICO;
    public final static IRI FEMTO;
    public final static IRI NANO;
    public final static IRI MICRO;
    public final static IRI MILLI;
    public final static IRI CENTI;
    public final static IRI DECI;
    public final static IRI DECA;
    public final static IRI HECTO;
    public final static IRI KILO;
    public final static IRI MEGA;
    public final static IRI GIGA;
    public final static IRI TERA;
    public final static IRI PETA;
    public final static IRI EXA;
    public final static IRI ZETTA;
    public final static IRI YOTTA;

    // Binary prefixes
    public final static IRI KIBI;
    public final static IRI MEBI;
    public final static IRI GIBI;
    public final static IRI TEBI;
    public final static IRI PEBI;
    public final static IRI EXBI;
    public final static IRI ZEBI;
    public final static IRI YOBI;

    // measurement scales
    public final static IRI SCALE;
    public final static IRI INTERVAL_SCALE;
    public final static IRI RATIO_SCALE;

	// other concepts
	public final static IRI QUANTITY;
    public final static IRI MEASURE;
    public final static IRI SYSTEM_OF_UNITS;
    public final static IRI APPLICATION_AREA;
    public final static IRI DIMENSION;
	public final static IRI PHENOMENON;
    public final static IRI POINT;
    public final static IRI FIXED_POINT;

    // properties (prefixed with HAS_ as there are many properties having the same name as a concept)
    public final static IRI HAS_QUANTITY;
    public final static IRI HAS_UNIT;
    public final static IRI HAS_SCALE;
    public final static IRI HAS_NUMERICAL_VALUE;
    public final static IRI HAS_PHENOMENON;
    public final static IRI HAS_POINT;

    // properties for compound units and prefixes
    public final static IRI HAS_FACTOR;
    public final static IRI HAS_PREFIX;
    public final static IRI HAS_NUMERATOR;
    public final static IRI HAS_DENOMINATOR;
    public final static IRI HAS_DIMENSION;
    public final static IRI HAS_TERM1;
    public final static IRI HAS_TERM2;
    public final static IRI HAS_BASE;
    public final static IRI HAS_EXPONENT;

    // general properties
    public final static IRI HAS_LONG_COMMENT;
    public final static IRI HAS_ABBREVIATION;
    public final static IRI HAS_UNOFFICIAL_LABEL;
    public final static IRI HAS_UNOFFICIAL_ABBREVIATION;
    public final static IRI HAS_SYMBOL;
    public final static IRI HAS_ALTERNATIVE_SYMBOL;
    public final static IRI HAS_ALTERNATIVE_LABEL;
    public final static IRI USES_UNIT;

    // properties for quantities
    public final static IRI COMMONLY_HAS_UNIT;

    // properties for systems of units
    public final static IRI HAS_BASE_UNIT;
    public final static IRI HAS_DERIVED_UNIT;

    // properties for dimensions
    public final static IRI HAS_SI_LENGTH_DIMENSION_EXPONENT;
    public final static IRI HAS_SI_MASS_DIMENSION_EXPONENT;
    public final static IRI HAS_SI_TIME_DIMENSION_EXPONENT;
    public final static IRI HAS_SI_ELECTRIC_CURRENT_DIMENSION_EXPONENT;
    public final static IRI HAS_SI_THERMODYNAMIC_TEMPERATURE_DIMENSION_EXPONENT;
    public final static IRI HAS_SI_AMOUNT_OF_SUBSTANCE_DIMENSION_EXPONENT;
    public final static IRI HAS_SI_LUMINOUS_INTENSITY_DIMENSION_EXPONENT;

    // properties for definition elements of a measurement scale;
    public final static IRI HAS_OFFSET;

	public final static IRI HAS_VALUE;

	static {
		NAMESPACE = "http://www.ontology-of-units-of-measure.org/vocabularies/om-2/";

		ValueFactory factory = SimpleValueFactory.getInstance();

        // units and prefixes
        SINGULAR_UNIT = factory.createIRI(NAMESPACE, "SingularUnit");
        COMPOUND_UNIT = factory.createIRI(NAMESPACE, "CompoundUnit");
        UNIT_MULTIPLE = factory.createIRI(NAMESPACE, "UnitMultiple");
        PREFIXED_UNIT = factory.createIRI(NAMESPACE, "PrefixedUnit");
        UNIT_MULTIPLICATION = factory.createIRI(NAMESPACE, "UnitMultiplication");
        UNIT_DIVISION = factory.createIRI(NAMESPACE, "UnitDivision");
        UNIT_EXPONENTIATION = factory.createIRI(NAMESPACE, "UnitExponentiation");
        UNIT = factory.createIRI(NAMESPACE, "Unit");
        SI_PREFIX = factory.createIRI(NAMESPACE, "SIPrefix");
        BINARY_PREFIX = factory.createIRI(NAMESPACE, "BinaryPrefix");
        PREFIX = factory.createIRI(NAMESPACE, "Prefix");

        // SI prefixes
        YOCTO = factory.createIRI(NAMESPACE,"yocto");
        ZEPTO = factory.createIRI(NAMESPACE,"zepto");
        ATTO = factory.createIRI(NAMESPACE,"atto");
        PICO = factory.createIRI(NAMESPACE,"pico");
        FEMTO = factory.createIRI(NAMESPACE,"femto");
        NANO = factory.createIRI(NAMESPACE,"nano");
        MICRO = factory.createIRI(NAMESPACE,"micro");
        MILLI = factory.createIRI(NAMESPACE,"milli");
        CENTI = factory.createIRI(NAMESPACE,"centi");
        DECI = factory.createIRI(NAMESPACE,"deci");
        DECA = factory.createIRI(NAMESPACE,"deca");
        HECTO = factory.createIRI(NAMESPACE,"hecto");
        KILO = factory.createIRI(NAMESPACE,"kilo");
        MEGA = factory.createIRI(NAMESPACE,"mega");
        GIGA = factory.createIRI(NAMESPACE,"giga");
        TERA = factory.createIRI(NAMESPACE,"tera");
        PETA = factory.createIRI(NAMESPACE,"peta");
        EXA = factory.createIRI(NAMESPACE,"exa");
        ZETTA = factory.createIRI(NAMESPACE,"zetta");
        YOTTA = factory.createIRI(NAMESPACE,"yotta");

        // Binary prefixes
        KIBI = factory.createIRI(NAMESPACE,"kibi");
        MEBI = factory.createIRI(NAMESPACE,"mebi");
        GIBI = factory.createIRI(NAMESPACE,"gibi");
        TEBI = factory.createIRI(NAMESPACE,"tebi");
        PEBI = factory.createIRI(NAMESPACE,"pebi");
        EXBI = factory.createIRI(NAMESPACE,"exbi");
        ZEBI = factory.createIRI(NAMESPACE,"zebi");
        YOBI = factory.createIRI(NAMESPACE,"yobi");

        // measurement scales
        SCALE = factory.createIRI(NAMESPACE, "Scale");
        INTERVAL_SCALE = factory.createIRI(NAMESPACE, "IntervalScale");
        RATIO_SCALE = factory.createIRI(NAMESPACE, "RatioScale");

		// other concepts
        QUANTITY = factory.createIRI(NAMESPACE, "Quantity");
        MEASURE = factory.createIRI(NAMESPACE, "Measure");
        SYSTEM_OF_UNITS = factory.createIRI(NAMESPACE, "SystenOfUnits");
        APPLICATION_AREA = factory.createIRI(NAMESPACE, "ApplicationArea");
        DIMENSION = factory.createIRI(NAMESPACE, "Dimension");
        PHENOMENON = factory.createIRI(NAMESPACE, "Phenomenon");
        POINT = factory.createIRI(NAMESPACE, "Point");
        FIXED_POINT = factory.createIRI(NAMESPACE, "FixedPoint");

        // properties (prefixed with HAS_ as there are many properties having the same name as a concept)
        HAS_QUANTITY = factory.createIRI(NAMESPACE, "hasQuantity");
        HAS_UNIT = factory.createIRI(NAMESPACE, "hasUnit");
        HAS_SCALE = factory.createIRI(NAMESPACE, "hasScale");
        HAS_NUMERICAL_VALUE = factory.createIRI(NAMESPACE, "hasNumericalValue");
        HAS_PHENOMENON = factory.createIRI(NAMESPACE, "hasPhenomenon");
        HAS_POINT = factory.createIRI(NAMESPACE, "hasPoint");

        // properties for compound units and prefixes
        HAS_FACTOR = factory.createIRI(NAMESPACE, "hasFactor");
        HAS_PREFIX = factory.createIRI(NAMESPACE, "hasPrefix");
        HAS_NUMERATOR = factory.createIRI(NAMESPACE, "hasNumerator");
        HAS_DENOMINATOR = factory.createIRI(NAMESPACE, "hasDenominator");
        HAS_DIMENSION = factory.createIRI(NAMESPACE, "hasDimension");
        HAS_TERM1 = factory.createIRI(NAMESPACE, "hasTerm1");
        HAS_TERM2 = factory.createIRI(NAMESPACE, "hasTerm2");
        HAS_BASE = factory.createIRI(NAMESPACE, "hasBase");
        HAS_EXPONENT = factory.createIRI(NAMESPACE, "hasExponent");

        // general properties
        HAS_LONG_COMMENT = factory.createIRI(NAMESPACE, "longcomment");
        HAS_ABBREVIATION = factory.createIRI(NAMESPACE, "abbreviation");
        HAS_UNOFFICIAL_LABEL = factory.createIRI(NAMESPACE,"unofficialLabel");
        HAS_UNOFFICIAL_ABBREVIATION = factory.createIRI(NAMESPACE,"unofficialAbbreviation");
        HAS_SYMBOL = factory.createIRI(NAMESPACE, "symbol");
        HAS_ALTERNATIVE_SYMBOL = factory.createIRI(NAMESPACE, "alternativeSymbol");
        HAS_ALTERNATIVE_LABEL = factory.createIRI(NAMESPACE, "alternativeLabel");
        USES_UNIT = factory.createIRI(NAMESPACE, "usesUnit");

        // properties for quantities
        COMMONLY_HAS_UNIT = factory.createIRI(NAMESPACE, "commonlyHasUnit");

        // properties for systems of units
        HAS_BASE_UNIT = factory.createIRI(NAMESPACE, "hasBaseUnit");
        HAS_DERIVED_UNIT = factory.createIRI(NAMESPACE, "hasDerivedUnit");

        // properties for dimensions
        HAS_SI_LENGTH_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "hasSILengthDimensionExponent");
        HAS_SI_MASS_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "hasSIMassDimensionExponent");
        HAS_SI_TIME_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "hasSITimeDimensionExponent");
        HAS_SI_ELECTRIC_CURRENT_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "hasSIElectricCurrentDimensionExponent");
        HAS_SI_THERMODYNAMIC_TEMPERATURE_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "hasSIThermodynamicTemperatureDimensionExponent");
        HAS_SI_AMOUNT_OF_SUBSTANCE_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "hasSIAmountOfSubstanceDimensionExponent");
        HAS_SI_LUMINOUS_INTENSITY_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "hasSILuminousIntensityDimensionExponent");

        // properties for definition elements of a measurement scale
        HAS_OFFSET = factory.createIRI(NAMESPACE, "hasOff-Set");

        HAS_VALUE = factory.createIRI(NAMESPACE, "hasValue");
	}
}
