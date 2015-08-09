package nl.wur.fbr.om.om18.vocabulary;

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
    public final static URI UNIT_MULTIPLE_OR_SUBMULTIPLE;
    public final static URI UNIT_MULTIPLICATION;
    public final static URI UNIT_DIVISION;
    public final static URI UNIT_EXPONENTIATION;
    public final static URI UNIT_OF_MEASURE;
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
    public final static URI MEASUREMENT_SCALE;
    public final static URI ORDINAL_SCALE;
    public final static URI CARDINAL_SCALE;
    public final static URI NOMINAL_SCALE;
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
    public final static URI HAS_UNIT_OF_MEASURE;
    public final static URI HAS_MEASUREMENT_SCALE;
    public final static URI HAS_NUMERICAL_VALUE;
    public final static URI HAS_UNIT_OF_MEASURE_OR_MEASUREMENT_SCALE;
    public final static URI HAS_PHENOMENON;
    public final static URI HAS_ELEMENT;

    // properties for compound units and prefixes
    public final static URI HAS_FACTOR;
    public final static URI HAS_PREFIX;
    public final static URI HAS_SINGULAR_UNIT;
    public final static URI HAS_NUMERATOR;
    public final static URI HAS_DENOMINATOR;
    public final static URI HAS_DIMENSION;
    public final static URI HAS_TERM1;
    public final static URI HAS_TERM2;
    public final static URI HAS_BASE;
    public final static URI HAS_EXPONENT;

    // general properties
    public final static URI HAS_DEFINITION;
    public final static URI HAS_LONG_COMMENT;
    public final static URI HAS_ABBREVIATION;
    public final static URI HAS_UNOFFICIAL_ABBREVIATION;
    public final static URI HAS_SYMBOL;
    public final static URI HAS_ALTERNATIVE_SYMBOL;
    public final static URI HAS_ALTERNATIVE_LABEL;

    // properties for quantities
    public final static URI HAS_VECTORIAL_OR_TENSORIAL_CHARACTER;

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

    // properties for definition elements of a measurement scale
    public final static URI HAS_DEFINITION_FACTOR;
    public final static URI HAS_DEFINITION_OFFSET;
    public final static URI HAS_DEFINITION_RELATIVE_TO;



	public final static URI HAS_VALUE;

	static {
		NAMESPACE = "http://www.wurvoc.org/vocabularies/om-1.8/";

		ValueFactory factory = new ValueFactoryImpl();

        // units and prefixes
        SINGULAR_UNIT = factory.createURI(NAMESPACE, "Singular_unit");
        COMPOUND_UNIT = factory.createURI(NAMESPACE, "Compound_unit");
        UNIT_MULTIPLE_OR_SUBMULTIPLE = factory.createURI(NAMESPACE, "Unit_multiple_or_submultiple");
        UNIT_MULTIPLICATION = factory.createURI(NAMESPACE, "Unit_multiplication");
        UNIT_DIVISION = factory.createURI(NAMESPACE, "Unit_division");
        UNIT_EXPONENTIATION = factory.createURI(NAMESPACE, "Unit_exponentiation");
        UNIT_OF_MEASURE = factory.createURI(NAMESPACE, "Unit_of_measure");
        SI_PREFIX = factory.createURI(NAMESPACE, "SI_prefix");
        BINARY_PREFIX = factory.createURI(NAMESPACE, "Binary_prefix");
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
        MEASUREMENT_SCALE = factory.createURI(NAMESPACE, "Measurement_scale");
        ORDINAL_SCALE = factory.createURI(NAMESPACE, "Ordinal_scale");
        CARDINAL_SCALE = factory.createURI(NAMESPACE, "Cardinal_scale");
        NOMINAL_SCALE = factory.createURI(NAMESPACE, "Nominal_scale");
        INTERVAL_SCALE = factory.createURI(NAMESPACE, "Interval_scale");
        RATIO_SCALE = factory.createURI(NAMESPACE, "Ratio_scale");

		// other concepts
        QUANTITY = factory.createURI(NAMESPACE, "Quantity");
        MEASURE = factory.createURI(NAMESPACE, "Measure");
        SYSTEM_OF_UNITS = factory.createURI(NAMESPACE, "Systen_of_units");
        APPLICATION_AREA = factory.createURI(NAMESPACE, "Application_area");
        DIMENSION = factory.createURI(NAMESPACE, "Dimension");
        PHENOMENON = factory.createURI(NAMESPACE, "Phenomenon");
        POINT = factory.createURI(NAMESPACE, "Point");
        FIXED_POINT = factory.createURI(NAMESPACE, "Fixed_point");

        // properties (prefixed with HAS_ as there are many properties having the same name as a concept)
        HAS_QUANTITY = factory.createURI(NAMESPACE, "quantity");
        HAS_UNIT_OF_MEASURE = factory.createURI(NAMESPACE, "unit_of_measure");
        HAS_MEASUREMENT_SCALE = factory.createURI(NAMESPACE, "measurement_scale");
        HAS_NUMERICAL_VALUE = factory.createURI(NAMESPACE, "numerical_value");
        HAS_UNIT_OF_MEASURE_OR_MEASUREMENT_SCALE = factory.createURI(NAMESPACE, "unit_of_measure_or_measurement_scale");
        HAS_PHENOMENON = factory.createURI(NAMESPACE, "phenomenon");
        HAS_ELEMENT = factory.createURI(NAMESPACE, "element");

        // properties for compound units and prefixes
        HAS_FACTOR = factory.createURI(NAMESPACE, "factor");
        HAS_PREFIX = factory.createURI(NAMESPACE, "prefix");
        HAS_SINGULAR_UNIT = factory.createURI(NAMESPACE, "singular_unit");
        HAS_NUMERATOR = factory.createURI(NAMESPACE, "numerator");
        HAS_DENOMINATOR = factory.createURI(NAMESPACE, "denominator");
        HAS_DIMENSION = factory.createURI(NAMESPACE, "dimension");
        HAS_TERM1 = factory.createURI(NAMESPACE, "term_1");
        HAS_TERM2 = factory.createURI(NAMESPACE, "term_2");
        HAS_BASE = factory.createURI(NAMESPACE, "base");
        HAS_EXPONENT = factory.createURI(NAMESPACE, "exponent");

        // general properties
        HAS_DEFINITION = factory.createURI(NAMESPACE, "definition");
        HAS_LONG_COMMENT = factory.createURI(NAMESPACE, "longcomment");
        HAS_ABBREVIATION = factory.createURI(NAMESPACE, "abbreviation");
        HAS_UNOFFICIAL_ABBREVIATION = factory.createURI(NAMESPACE,"unofficial_abbreviation");
        HAS_SYMBOL = factory.createURI(NAMESPACE, "symbol");
        HAS_ALTERNATIVE_SYMBOL = factory.createURI(NAMESPACE, "alternative_symbol");
        HAS_ALTERNATIVE_LABEL = factory.createURI(NAMESPACE, "alternative_label");

        // properties for quantities
        HAS_VECTORIAL_OR_TENSORIAL_CHARACTER = factory.createURI(NAMESPACE, "vectorial_or_tensorial_character");

        // properties for systems of units
        HAS_BASE_UNIT = factory.createURI(NAMESPACE, "base_unit");
        HAS_DERIVED_UNIT = factory.createURI(NAMESPACE, "derived_unit");

        // properties for dimensions
        HAS_SI_LENGTH_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "SI_length_dimension_exponent");
        HAS_SI_MASS_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "SI_mass_dimension_exponent");
        HAS_SI_TIME_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "SI_time_dimension_exponent");
        HAS_SI_ELECTRIC_CURRENT_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "SI_electric_current_dimension_exponent");
        HAS_SI_THERMODYNAMIC_TEMPERATURE_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "SI_thermodynamic_temperature_dimension_exponent");
        HAS_SI_AMOUNT_OF_SUBSTANCE_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "SI_amount_of_substance_dimension_exponent");
        HAS_SI_LUMINOUS_INTENSITY_DIMENSION_EXPONENT = factory.createURI(NAMESPACE, "SI_luminous_intensity_dimension_exponent");

        // properties for definition elements of a measurement scale
        HAS_DEFINITION_FACTOR = factory.createURI(NAMESPACE, "definition_factor");
        HAS_DEFINITION_OFFSET = factory.createURI(NAMESPACE, "definition_off-set");
        HAS_DEFINITION_RELATIVE_TO = factory.createURI(NAMESPACE, "definition_relative_to");

        HAS_VALUE = factory.createURI(NAMESPACE, "value");
	}
}
