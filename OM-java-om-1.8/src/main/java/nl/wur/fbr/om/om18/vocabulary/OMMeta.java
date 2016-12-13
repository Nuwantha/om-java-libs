package nl.wur.fbr.om.om18.vocabulary;


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
    public final static IRI UNIT_MULTIPLE_OR_SUBMULTIPLE;
    public final static IRI UNIT_MULTIPLICATION;
    public final static IRI UNIT_DIVISION;
    public final static IRI UNIT_EXPONENTIATION;
    public final static IRI UNIT_OF_MEASURE;
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
    public final static IRI MEASUREMENT_SCALE;
    public final static IRI ORDINAL_SCALE;
    public final static IRI CARDINAL_SCALE;
    public final static IRI NOMINAL_SCALE;
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
    public final static IRI HAS_UNIT_OF_MEASURE;
    public final static IRI HAS_MEASUREMENT_SCALE;
    public final static IRI HAS_NUMERICAL_VALUE;
    public final static IRI HAS_UNIT_OF_MEASURE_OR_MEASUREMENT_SCALE;
    public final static IRI HAS_PHENOMENON;
    public final static IRI HAS_ELEMENT;

    // properties for compound units and prefixes
    public final static IRI HAS_FACTOR;
    public final static IRI HAS_PREFIX;
    public final static IRI HAS_SINGULAR_UNIT;
    public final static IRI HAS_NUMERATOR;
    public final static IRI HAS_DENOMINATOR;
    public final static IRI HAS_DIMENSION;
    public final static IRI HAS_TERM1;
    public final static IRI HAS_TERM2;
    public final static IRI HAS_BASE;
    public final static IRI HAS_EXPONENT;

    // general properties
    public final static IRI HAS_DEFINITION;
    public final static IRI HAS_LONG_COMMENT;
    public final static IRI HAS_ABBREVIATION;
    public final static IRI HAS_UNOFFICIAL_ABBREVIATION;
    public final static IRI HAS_SYMBOL;
    public final static IRI HAS_ALTERNATIVE_SYMBOL;
    public final static IRI HAS_ALTERNATIVE_LABEL;

    // properties for quantities
    public final static IRI HAS_VECTORIAL_OR_TENSORIAL_CHARACTER;

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

    // properties for definition elements of a measurement scale
    public final static IRI HAS_DEFINITION_FACTOR;
    public final static IRI HAS_DEFINITION_OFFSET;
    public final static IRI HAS_DEFINITION_RELATIVE_TO;



	public final static IRI HAS_VALUE;

	static {
		NAMESPACE = "http://www.wurvoc.org/vocabularies/om-1.8/";

		ValueFactory factory = SimpleValueFactory.getInstance();

        // units and prefixes
        SINGULAR_UNIT = factory.createIRI(NAMESPACE, "Singular_unit");
        COMPOUND_UNIT = factory.createIRI(NAMESPACE, "Compound_unit");
        UNIT_MULTIPLE_OR_SUBMULTIPLE = factory.createIRI(NAMESPACE, "Unit_multiple_or_submultiple");
        UNIT_MULTIPLICATION = factory.createIRI(NAMESPACE, "Unit_multiplication");
        UNIT_DIVISION = factory.createIRI(NAMESPACE, "Unit_division");
        UNIT_EXPONENTIATION = factory.createIRI(NAMESPACE, "Unit_exponentiation");
        UNIT_OF_MEASURE = factory.createIRI(NAMESPACE, "Unit_of_measure");
        SI_PREFIX = factory.createIRI(NAMESPACE, "SI_prefix");
        BINARY_PREFIX = factory.createIRI(NAMESPACE, "Binary_prefix");
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
        MEASUREMENT_SCALE = factory.createIRI(NAMESPACE, "Measurement_scale");
        ORDINAL_SCALE = factory.createIRI(NAMESPACE, "Ordinal_scale");
        CARDINAL_SCALE = factory.createIRI(NAMESPACE, "Cardinal_scale");
        NOMINAL_SCALE = factory.createIRI(NAMESPACE, "Nominal_scale");
        INTERVAL_SCALE = factory.createIRI(NAMESPACE, "Interval_scale");
        RATIO_SCALE = factory.createIRI(NAMESPACE, "Ratio_scale");

		// other concepts
        QUANTITY = factory.createIRI(NAMESPACE, "Quantity");
        MEASURE = factory.createIRI(NAMESPACE, "Measure");
        SYSTEM_OF_UNITS = factory.createIRI(NAMESPACE, "Systen_of_units");
        APPLICATION_AREA = factory.createIRI(NAMESPACE, "Application_area");
        DIMENSION = factory.createIRI(NAMESPACE, "Dimension");
        PHENOMENON = factory.createIRI(NAMESPACE, "Phenomenon");
        POINT = factory.createIRI(NAMESPACE, "Point");
        FIXED_POINT = factory.createIRI(NAMESPACE, "Fixed_point");

        // properties (prefixed with HAS_ as there are many properties having the same name as a concept)
        HAS_QUANTITY = factory.createIRI(NAMESPACE, "quantity");
        HAS_UNIT_OF_MEASURE = factory.createIRI(NAMESPACE, "unit_of_measure");
        HAS_MEASUREMENT_SCALE = factory.createIRI(NAMESPACE, "measurement_scale");
        HAS_NUMERICAL_VALUE = factory.createIRI(NAMESPACE, "numerical_value");
        HAS_UNIT_OF_MEASURE_OR_MEASUREMENT_SCALE = factory.createIRI(NAMESPACE, "unit_of_measure_or_measurement_scale");
        HAS_PHENOMENON = factory.createIRI(NAMESPACE, "phenomenon");
        HAS_ELEMENT = factory.createIRI(NAMESPACE, "element");

        // properties for compound units and prefixes
        HAS_FACTOR = factory.createIRI(NAMESPACE, "factor");
        HAS_PREFIX = factory.createIRI(NAMESPACE, "prefix");
        HAS_SINGULAR_UNIT = factory.createIRI(NAMESPACE, "singular_unit");
        HAS_NUMERATOR = factory.createIRI(NAMESPACE, "numerator");
        HAS_DENOMINATOR = factory.createIRI(NAMESPACE, "denominator");
        HAS_DIMENSION = factory.createIRI(NAMESPACE, "dimension");
        HAS_TERM1 = factory.createIRI(NAMESPACE, "term_1");
        HAS_TERM2 = factory.createIRI(NAMESPACE, "term_2");
        HAS_BASE = factory.createIRI(NAMESPACE, "base");
        HAS_EXPONENT = factory.createIRI(NAMESPACE, "exponent");

        // general properties
        HAS_DEFINITION = factory.createIRI(NAMESPACE, "definition");
        HAS_LONG_COMMENT = factory.createIRI(NAMESPACE, "longcomment");
        HAS_ABBREVIATION = factory.createIRI(NAMESPACE, "abbreviation");
        HAS_UNOFFICIAL_ABBREVIATION = factory.createIRI(NAMESPACE,"unofficial_abbreviation");
        HAS_SYMBOL = factory.createIRI(NAMESPACE, "symbol");
        HAS_ALTERNATIVE_SYMBOL = factory.createIRI(NAMESPACE, "alternative_symbol");
        HAS_ALTERNATIVE_LABEL = factory.createIRI(NAMESPACE, "alternative_label");

        // properties for quantities
        HAS_VECTORIAL_OR_TENSORIAL_CHARACTER = factory.createIRI(NAMESPACE, "vectorial_or_tensorial_character");

        // properties for systems of units
        HAS_BASE_UNIT = factory.createIRI(NAMESPACE, "base_unit");
        HAS_DERIVED_UNIT = factory.createIRI(NAMESPACE, "derived_unit");

        // properties for dimensions
        HAS_SI_LENGTH_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "SI_length_dimension_exponent");
        HAS_SI_MASS_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "SI_mass_dimension_exponent");
        HAS_SI_TIME_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "SI_time_dimension_exponent");
        HAS_SI_ELECTRIC_CURRENT_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "SI_electric_current_dimension_exponent");
        HAS_SI_THERMODYNAMIC_TEMPERATURE_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "SI_thermodynamic_temperature_dimension_exponent");
        HAS_SI_AMOUNT_OF_SUBSTANCE_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "SI_amount_of_substance_dimension_exponent");
        HAS_SI_LUMINOUS_INTENSITY_DIMENSION_EXPONENT = factory.createIRI(NAMESPACE, "SI_luminous_intensity_dimension_exponent");

        // properties for definition elements of a measurement scale
        HAS_DEFINITION_FACTOR = factory.createIRI(NAMESPACE, "definition_factor");
        HAS_DEFINITION_OFFSET = factory.createIRI(NAMESPACE, "definition_off-set");
        HAS_DEFINITION_RELATIVE_TO = factory.createIRI(NAMESPACE, "definition_relative_to");

        HAS_VALUE = factory.createIRI(NAMESPACE, "value");
	}
}
