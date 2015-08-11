package nl.wur.fbr.om.om20.vocabulary;

import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * This class defines static URIs used in the OM vocabulary. These URIs are all part of the OM model, not of
 * individual units, scales, or quantities. The namespace is: http://www.wurvoc.org/vocabulary/om-1.8/.
 */
public class OMMeta {
	public static final String NAMESPACE;

    // units and prefixes
    public final static URI SINGULAR_UNIT;
    public final static URI COMPOUND_UNIT;
    public final static URI PREFIXED_UNIT;
    public final static URI UNIT_MULTIPLE;
    public final static URI UNIT_MULTIPLICATION;
    public final static URI UNIT_DIVISION;
    public final static URI UNIT_EXPONENTIATION;
    public final static URI UNIT;
    public final static URI SI_PREFIX;
    public final static URI BINARY_PREFIX;
    public final static URI PREFIX;

    // SI prefixes
    public final static URI YOCTO;
    public final static URI ZEPTO;
    public final static URI ATTO;
    public final static URI PICO;
    public final static URI FEMTO;
    public final static URI NANO;
    public final static URI MICRO;
    public final static URI MILLI;
    public final static URI CENTI;
    public final static URI DECI;
    public final static URI DECA;
    public final static URI HECTO;
    public final static URI KILO;
    public final static URI MEGA;
    public final static URI GIGA;
    public final static URI TERA;
    public final static URI PETA;
    public final static URI EXA;
    public final static URI ZETTA;
    public final static URI YOTTA;

    // Binary prefixes
    public final static URI KIBI;
    public final static URI MEBI;
    public final static URI GIBI;
    public final static URI TEBI;
    public final static URI PEBI;
    public final static URI EXBI;
    public final static URI ZEBI;
    public final static URI YOBI;

    // measurement scales
    public final static URI SCALE;
    public final static URI INTERVAL_SCALE;
    public final static URI RATIO_SCALE;

	// other concepts
	public final static URI QUANTITY;
    public final static URI MEASURE;
    public final static URI SYSTEM_OF_UNITS;
    public final static URI APPLICATION_AREA;
    public final static URI DIMENSION;
	public final static URI PHENOMENON;
    public final static URI POINT;
    public final static URI FIXED_POINT;

    // properties (prefixed with HAS_ as there are many properties having the same name as a concept)
    public final static URI HAS_QUANTITY;
    public final static URI HAS_UNIT;
    public final static URI HAS_SCALE;
    public final static URI HAS_NUMERICAL_VALUE;
    public final static URI HAS_PHENOMENON;
    public final static URI HAS_POINT;

    // properties for compound units and prefixes
    public final static URI HAS_FACTOR;
    public final static URI HAS_PREFIX;
    public final static URI HAS_NUMERATOR;
    public final static URI HAS_DENOMINATOR;
    public final static URI HAS_DIMENSION;
    public final static URI HAS_TERM1;
    public final static URI HAS_TERM2;
    public final static URI HAS_BASE;
    public final static URI HAS_EXPONENT;

    // general properties
    public final static URI HAS_LONG_COMMENT;
    public final static URI HAS_ABBREVIATION;
    public final static URI HAS_UNOFFICIAL_LABEL;
    public final static URI HAS_UNOFFICIAL_ABBREVIATION;
    public final static URI HAS_SYMBOL;
    public final static URI HAS_ALTERNATIVE_SYMBOL;
    public final static URI HAS_ALTERNATIVE_LABEL;

    // properties for quantities
    public final static URI COMMONLY_HAS_UNIT;

    // properties for systems of units
    public final static URI HAS_BASE_UNIT;
    public final static URI HAS_DERIVED_UNIT;

    // properties for dimensions
    public final static URI HAS_SI_LENGTH_DIMENSION_EXPONENT;
    public final static URI HAS_SI_MASS_DIMENSION_EXPONENT;
    public final static URI HAS_SI_TIME_DIMENSION_EXPONENT;
    public final static URI HAS_SI_ELECTRIC_CURRENT_DIMENSION_EXPONENT;
    public final static URI HAS_SI_THERMODYNAMIC_TEMPERATURE_DIMENSION_EXPONENT;
    public final static URI HAS_SI_AMOUNT_OF_SUBSTANCE_DIMENSION_EXPONENT;
    public final static URI HAS_SI_LUMINOUS_INTENSITY_DIMENSION_EXPONENT;

    // properties for definition elements of a measurement scale;
    public final static URI HAS_OFFSET;

	public final static URI HAS_VALUE;

	static {
		NAMESPACE = "http://www.wurvoc.org/vocabularies/om-1.8/";

		ValueFactory factory = new ValueFactoryImpl();

        // units and prefixes
        SINGULAR_UNIT = factory.createURI(NAMESPACE, "SingularUnit");
        COMPOUND_UNIT = factory.createURI(NAMESPACE, "CompoundUnit");
        UNIT_MULTIPLE = factory.createURI(NAMESPACE, "UnitMultiple");
        PREFIXED_UNIT = factory.createURI(NAMESPACE, "PrefixedUnit");
        UNIT_MULTIPLICATION = factory.createURI(NAMESPACE, "UnitMultiplication");
        UNIT_DIVISION = factory.createURI(NAMESPACE, "UnitDivision");
        UNIT_EXPONENTIATION = factory.createURI(NAMESPACE, "UnitExponentiation");
        UNIT = factory.createURI(NAMESPACE, "Unit");
        SI_PREFIX = factory.createURI(NAMESPACE, "SIPrefix");
        BINARY_PREFIX = factory.createURI(NAMESPACE, "BinaryPrefix");
        PREFIX = factory.createURI(NAMESPACE, "Prefix");

        // SI prefixes
        YOCTO = factory.createURI(NAMESPACE,"yocto");
        ZEPTO = factory.createURI(NAMESPACE,"zepto");
        ATTO = factory.createURI(NAMESPACE,"atto");
        PICO = factory.createURI(NAMESPACE,"pico");
        FEMTO = factory.createURI(NAMESPACE,"femto");
        NANO = factory.createURI(NAMESPACE,"nano");
        MICRO = factory.createURI(NAMESPACE,"micro");
        MILLI = factory.createURI(NAMESPACE,"milli");
        CENTI = factory.createURI(NAMESPACE,"centi");
        DECI = factory.createURI(NAMESPACE,"deci");
        DECA = factory.createURI(NAMESPACE,"deca");
        HECTO = factory.createURI(NAMESPACE,"hecto");
        KILO = factory.createURI(NAMESPACE,"kilo");
        MEGA = factory.createURI(NAMESPACE,"mega");
        GIGA = factory.createURI(NAMESPACE,"giga");
        TERA = factory.createURI(NAMESPACE,"tera");
        PETA = factory.createURI(NAMESPACE,"peta");
        EXA = factory.createURI(NAMESPACE,"exa");
        ZETTA = factory.createURI(NAMESPACE,"zetta");
        YOTTA = factory.createURI(NAMESPACE,"yotta");

        // Binary prefixes
        KIBI = factory.createURI(NAMESPACE,"kibi");
        MEBI = factory.createURI(NAMESPACE,"mebi");
        GIBI = factory.createURI(NAMESPACE,"gibi");
        TEBI = factory.createURI(NAMESPACE,"tebi");
        PEBI = factory.createURI(NAMESPACE,"pebi");
        EXBI = factory.createURI(NAMESPACE,"exbi");
        ZEBI = factory.createURI(NAMESPACE,"zebi");
        YOBI = factory.createURI(NAMESPACE,"yobi");

        // measurement scales
        SCALE = factory.createURI(NAMESPACE, "Scale");
        INTERVAL_SCALE = factory.createURI(NAMESPACE, "IntervalScale");
        RATIO_SCALE = factory.createURI(NAMESPACE, "RatioScale");

		// other concepts
        QUANTITY = factory.createURI(NAMESPACE, "Quantity");
        MEASURE = factory.createURI(NAMESPACE, "Measure");
        SYSTEM_OF_UNITS = factory.createURI(NAMESPACE, "SystenOfUnits");
        APPLICATION_AREA = factory.createURI(NAMESPACE, "ApplicationArea");
        DIMENSION = factory.createURI(NAMESPACE, "Dimension");
        PHENOMENON = factory.createURI(NAMESPACE, "Phenomenon");
        POINT = factory.createURI(NAMESPACE, "Point");
        FIXED_POINT = factory.createURI(NAMESPACE, "FixedPoint");

        // properties (prefixed with HAS_ as there are many properties having the same name as a concept)
        HAS_QUANTITY = factory.createURI(NAMESPACE, "hasQuantity");
        HAS_UNIT = factory.createURI(NAMESPACE, "hasUnit");
        HAS_SCALE = factory.createURI(NAMESPACE, "hasScale");
        HAS_NUMERICAL_VALUE = factory.createURI(NAMESPACE, "hasNumericalValue");
        HAS_PHENOMENON = factory.createURI(NAMESPACE, "hasPhenomenon");
        HAS_POINT = factory.createURI(NAMESPACE, "hasPoint");

        // properties for compound units and prefixes
        HAS_FACTOR = factory.createURI(NAMESPACE, "hasFactor");
        HAS_PREFIX = factory.createURI(NAMESPACE, "hasPrefix");
        HAS_NUMERATOR = factory.createURI(NAMESPACE, "hasNumerator");
        HAS_DENOMINATOR = factory.createURI(NAMESPACE, "hasDenominator");
        HAS_DIMENSION = factory.createURI(NAMESPACE, "hasDimension");
        HAS_TERM1 = factory.createURI(NAMESPACE, "hasTerm1");
        HAS_TERM2 = factory.createURI(NAMESPACE, "hasTerm2");
        HAS_BASE = factory.createURI(NAMESPACE, "hasBase");
        HAS_EXPONENT = factory.createURI(NAMESPACE, "hasExponent");

        // general properties
        HAS_LONG_COMMENT = factory.createURI(NAMESPACE, "longcomment");
        HAS_ABBREVIATION = factory.createURI(NAMESPACE, "abbreviation");
        HAS_UNOFFICIAL_LABEL = factory.createURI(NAMESPACE,"unofficialLabel");
        HAS_UNOFFICIAL_ABBREVIATION = factory.createURI(NAMESPACE,"unofficialAbbreviation");
        HAS_SYMBOL = factory.createURI(NAMESPACE, "symbol");
        HAS_ALTERNATIVE_SYMBOL = factory.createURI(NAMESPACE, "alternativeSymbol");
        HAS_ALTERNATIVE_LABEL = factory.createURI(NAMESPACE, "alternativeLabel");

        // properties for quantities
        COMMONLY_HAS_UNIT = factory.createURI(NAMESPACE, "commonlyHasUnit");

        // properties for systems of units
        HAS_BASE_UNIT = factory.createURI(NAMESPACE, "hasBaseUnit");
        HAS_DERIVED_UNIT = factory.createURI(NAMESPACE, "hasDerivedUnit");

        // properties for dimensions
        HAS_SI_LENGTH_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "hasSILengthDimensionExponent");
        HAS_SI_MASS_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "hasSIMassDimensionExponent");
        HAS_SI_TIME_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "hasSITimeDimensionExponent");
        HAS_SI_ELECTRIC_CURRENT_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "hasSIElectricCurrentDimensionExponent");
        HAS_SI_THERMODYNAMIC_TEMPERATURE_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "hasSIThermodynamicTemperatureDimensionExponent");
        HAS_SI_AMOUNT_OF_SUBSTANCE_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "hasSIAmountOfSubstanceDimensionExponent");
        HAS_SI_LUMINOUS_INTENSITY_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "hasSILuminousIntensityDimensionExponent");

        // properties for definition elements of a measurement scale
        HAS_OFFSET = factory.createURI(NAMESPACE, "hasOff-Set");

        HAS_VALUE = factory.createURI(NAMESPACE, "hasValue");
	}
}
