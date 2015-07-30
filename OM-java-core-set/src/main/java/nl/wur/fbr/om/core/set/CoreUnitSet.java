package nl.wur.fbr.om.core.set;

/**
 * This class contains the identifier for the core set of units. All SI base and derived units are included in this set.
 * Other frequently used units that are not part of the SI set are also included.
 *
 * @author Don Willems on 29/07/15.
 */
public abstract class CoreUnitSet {

    public final static String NAMESPACE;

    // CoreUnitSet of Length 
    public final static String METRE;
    public final static String KILOMETRE;
    public final static String DECIMETRE;
    public final static String CENTIMETRE;
    public final static String MILLIMETRE;
    public final static String MICROMETRE;
    public final static String NANOMETRE;
    public final static String ANGSTROM;
    public final static String INCH;
    public final static String FEET;
    public final static String YARD;
    public final static String MILE;
    public final static String NAUTICAL_MILE;
    public final static String FATHOM;

    // Corefinal static StringSet of mass 
    public final static String GRAM;
    public final static String KILOGRAM;
    public final static String MILLIGRAM;
    public final static String MICROGRAM;

    // Corefinal static StringSet of time 
    public final static String SECOND;
    public final static String MILLISECOND;
    public final static String MICROSECOND;
    public final static String NANOSECOND;
    public final static String MINUTE;
    public final static String HOUR;
    public final static String YEAR;
    public final static String DAY;

    // Corefinal static StringSet of electrical current 
    public final static String AMPERE;

    // Corefinal static StringSet of temperature 
    public final static String KELVIN;
    public final static String CELSIUS;
    public final static String FAHRENHEIT;

    // Corefinal static StringSet of amount of substance 
    public final static String MOLE;

    // Corefinal static StringSet of amount of luminous intensity 
    public final static String CANDELA;

    // Corefinal static StringSet of area 
    public final static String SQUARE_METRE;
    public final static String SQUARE_KILOMETRE;
    public final static String HECTARE;
    public final static String SQUARE_MILE;
    public final static String SQUARE_FEET;
    public final static String ACRE;

    // Corefinal static StringSet of volume 
    public final static String CUBIC_METRE;
    public final static String LITRE;
    public final static String MILLILITRE;
    public final static String PINT_IMPERIAL;
    public final static String GALLON_IMPERIAL;
    public final static String CUP;
    public final static String TEASPOON;
    public final static String TABLESPOON;

    // Corefinal static StringSet of angle 
    public final static String RADIAN;
    public final static String DEGREE;

    // Corefinal static StringSet of solid angle 
    public final static String STERADIAN;

    // Corefinal static StringSet of frequency 
    public final static String HERTZ;

    // Corefinal static StringSet of velocity 
    public final static String METRE_PER_SECOND;
    public final static String KILOMETRE_PER_SECOND;
    public final static String KILOMETRE_PER_HOUR;
    public final static String MILE_PER_HOUR;
    public final static String KNOT;

    // Corefinal static StringSet of acceleration 
    public final static String METRE_PER_SECOND_SQUARED;

    // Corefinal static StringSet of force 
    public final static String NEWTON;

    // Corefinal static StringSet of pressure 
    public final static String NEWTON_PER_SQUARE_METRE;
    public final static String PASCAL;
    public final static String ATMOSPHERE;
    public final static String BAR;
    public final static String MILLIBAR;
    public final static String PSI;

    // Corefinal static StringSet of energy 
    public final static String JOULE;
    public final static String CALORIE;
    public final static String KILOCALORIE;

    // Corefinal static StringSet of power 
    public final static String WATT;

    // Corefinal static StringSet of electrical fields 
    public final static String COULOMB;
    public final static String VOLT;
    public final static String FARAD;
    public final static String OHM;
    public final static String SIEMENS;

    // Corefinal static StringSet of magnetic fields
    public final static String WEBER;
    public final static String TESLA;
    public final static String HENRY;

    // Corefinal static StringSet of electromagnetic radiation
    public final static String LUMEN;
    public final static String LUX;

    // Corefinal static StringSet of radioactivity
    public final static String BECQUEREL;
    public final static String GRAY;
    public final static String SIEVERT;

    // final static String of Catalytic activity
    public final static String KATAL;



    static {
        NAMESPACE = "nl.wur.fbr.om.core.set.";
        METRE = NAMESPACE+"metre";
        KILOMETRE = NAMESPACE+"kilometre";
        CENTIMETRE = NAMESPACE+"centimetre";
        DECIMETRE = NAMESPACE+"decimetre";
        MILLIMETRE = NAMESPACE+"millimetre";
        MICROMETRE = NAMESPACE+"micrometre";
        NANOMETRE = NAMESPACE+"nanometre";
        ANGSTROM = NAMESPACE+"angstrom";
        INCH = NAMESPACE+"inch";
        FEET = NAMESPACE+"feet";
        YARD = NAMESPACE+"yard";
        MILE = NAMESPACE+"mile";
        NAUTICAL_MILE = NAMESPACE+"nauticalmile";
        FATHOM = NAMESPACE+"fathom";

        GRAM = NAMESPACE+"gram";
        KILOGRAM = NAMESPACE+"kilogram";
        MILLIGRAM = NAMESPACE+"milligram";
        MICROGRAM = NAMESPACE+"microgram";

        SECOND = NAMESPACE+"second";
        MILLISECOND = NAMESPACE+"millisecond";
        MICROSECOND = NAMESPACE+"microsecond";
        NANOSECOND = NAMESPACE+"nanosecond";
        MINUTE = NAMESPACE+"minute";
        HOUR = NAMESPACE+"hour";
        DAY = NAMESPACE+"day";
        YEAR = NAMESPACE+"year";

        AMPERE = NAMESPACE+"ampere";
        KELVIN = NAMESPACE+"kelvin";
        CELSIUS = NAMESPACE+"celcius";
        FAHRENHEIT = NAMESPACE+"fahrenheit";
        MOLE = NAMESPACE+"mole";

        CANDELA = NAMESPACE+"candela";

        SQUARE_METRE = NAMESPACE+"squaremetre";
        SQUARE_KILOMETRE = NAMESPACE+"squarekilometre";
        HECTARE = NAMESPACE+"hectare";
        SQUARE_MILE = NAMESPACE+"squaremile";
        SQUARE_FEET = NAMESPACE+"squarefeet";
        ACRE = NAMESPACE+"acre";

        CUBIC_METRE = NAMESPACE+"cubicmetre";
        LITRE = NAMESPACE+"liter";
        MILLILITRE = NAMESPACE+"millilitre";
        PINT_IMPERIAL = NAMESPACE+"pintimperial";
        GALLON_IMPERIAL = NAMESPACE+"gallonimperial";
        CUP = NAMESPACE+"cup";
        TEASPOON = NAMESPACE+"teaspoon";
        TABLESPOON = NAMESPACE+"tablespoon";

        RADIAN = NAMESPACE+"radian";
        DEGREE = NAMESPACE+"degree";

        STERADIAN = NAMESPACE+"steradian";

        HERTZ = NAMESPACE+"steradian";

        METRE_PER_SECOND = NAMESPACE+"metrepersecond";
        KILOMETRE_PER_SECOND = NAMESPACE+"kilometrepersecond";
        KILOMETRE_PER_HOUR = NAMESPACE+"kilometreperhour";
        MILE_PER_HOUR = NAMESPACE+"mileperhour";
        KNOT = NAMESPACE+"knot";

        METRE_PER_SECOND_SQUARED = NAMESPACE+"metrepersecondsquared";

        NEWTON = NAMESPACE+"knot";

        NEWTON_PER_SQUARE_METRE = NAMESPACE+"newtonpersquaremetre";
        PASCAL = NAMESPACE+"pascal";
        ATMOSPHERE = NAMESPACE+"atmosphere";
        BAR = NAMESPACE+"bar";
        MILLIBAR = NAMESPACE+"millibar";
        PSI = NAMESPACE+"psi";

        JOULE = NAMESPACE+"joule";
        CALORIE = NAMESPACE+"calorie";
        KILOCALORIE = NAMESPACE+"kilocalorie";

        WATT = NAMESPACE+"watt";

        COULOMB = NAMESPACE+"coulomb";
        VOLT = NAMESPACE+"volt";
        FARAD = NAMESPACE+"farad";
        OHM = NAMESPACE+"ohm";
        SIEMENS = NAMESPACE+"siemens";

        WEBER = NAMESPACE+"weber";
        TESLA = NAMESPACE+"tesla";
        HENRY = NAMESPACE+"henry";

        LUMEN = NAMESPACE+"lumen";
        LUX = NAMESPACE+"lux";

        BECQUEREL = NAMESPACE+"becquerel";
        GRAY = NAMESPACE+"gray";
        SIEVERT = NAMESPACE+"sievert";

        KATAL = NAMESPACE+"katal";
    }

    /*
    @Override
    public void initialiseSet(UnitAndScaleFactory factory) throws UnitOrScaleCreationException {
        METRE = factory.createSingularUnit("metre", "m");
        KILOMETRE = factory.createPrefixedUnit("kilometre", "km", (SingularUnit) METRE, DecimalPrefix.KILO);
        CENTIMETRE = factory.createPrefixedUnit("centimetre", "cm", (SingularUnit) METRE, DecimalPrefix.CENTI);
        DECIMETRE = factory.createPrefixedUnit("decimetre", "dm", (SingularUnit) METRE, DecimalPrefix.DECI);
        MILLIMETRE = factory.createPrefixedUnit("millimetre", "mm", (SingularUnit) METRE, DecimalPrefix.MILLI);
        MICROMETRE = factory.createPrefixedUnit("micrometre", "μm", (SingularUnit) METRE, DecimalPrefix.MICRO);
        NANOMETRE = factory.createPrefixedUnit("nanometre", "nm", (SingularUnit) METRE, DecimalPrefix.NANO);
        ANGSTROM = factory.createSingularUnit("Ångström", "Å", METRE, 1e-10);
        INCH = factory.createSingularUnit("inch", "in", METRE, 0.0254);
        FEET = factory.createSingularUnit("feet", "ft", METRE, 0.3048);
        YARD = factory.createSingularUnit("yard", "yd", METRE, 0.9144);
        MILE = factory.createSingularUnit("mile", "mi", METRE, 1609.344);
        NAUTICAL_MILE = factory.createSingularUnit("nautical mile", "M", METRE, 1853.184);
        FATHOM = factory.createSingularUnit("fathom", null, FEET, 6);
        GRAM = factory.createSingularUnit("gram", "g");
        KILOGRAM = factory.createPrefixedUnit("kilogram", "kg", (SingularUnit) GRAM, DecimalPrefix.KILO);
        MILLIGRAM = factory.createPrefixedUnit("milligram", "mg", (SingularUnit) GRAM, DecimalPrefix.MILLI);
        MICROGRAM = factory.createPrefixedUnit("microgram", "μg", (SingularUnit) GRAM, DecimalPrefix.MICRO);
        SECOND = factory.createSingularUnit("second", "s");
        MILLISECOND = factory.createPrefixedUnit("millisecond", "ms", (SingularUnit) SECOND, DecimalPrefix.MILLI);
        MICROSECOND = factory.createPrefixedUnit("microsecond", "μs", (SingularUnit) SECOND, DecimalPrefix.MICRO);
        NANOSECOND = factory.createPrefixedUnit("nanosecond", "ns", (SingularUnit) SECOND, DecimalPrefix.NANO);
        MINUTE = factory.createSingularUnit("minute", "m", SECOND, 60);
        HOUR = factory.createSingularUnit("hour", "h", SECOND, 3600);
        DAY = factory.createSingularUnit("day", "d", SECOND, 86400);
        YEAR = factory.createSingularUnit("year", "yr", SECOND, 31556925.9747);
        AMPERE = factory.createSingularUnit("ampere", "A");
        KELVIN = factory.createSingularUnit("kelvin", "K");
        CELSIUS = factory.createSingularUnit("celsius", "°C", KELVIN);
        FAHRENHEIT = factory.createSingularUnit("fahrenheit", "°F", KELVIN, 1.8);
        MOLE = factory.createSingularUnit("mole", "mol");
        CANDELA = factory.createSingularUnit("candela", "cd");
        SQUARE_METRE = factory.createUnitExponentiation("square metre", "m^2", METRE, 2);
        SQUARE_KILOMETRE = factory.createUnitExponentiation("square kilometre", "km^2", KILOMETRE, 2);
        SQUARE_MILE = factory.createUnitExponentiation("square mile", "sq mi", MILE, 2);
        SQUARE_FEET = factory.createUnitExponentiation("square feet", "sq ft", FEET, 2);
        HECTARE = factory.createSingularUnit("hectare", "ha", SQUARE_METRE, 1e4);
        ACRE = factory.createSingularUnit("hectare", "ha", SQUARE_METRE, 4046.856);
        CUBIC_METRE = factory.createUnitExponentiation("cubic metre", "m^3", METRE, 3);
        LITRE = factory.createSingularUnit("litre", "l", CUBIC_METRE, 1e-3);
        MILLILITRE = factory.createPrefixedUnit("millilitre", "ml", (SingularUnit) LITRE, DecimalPrefix.MILLI);
        PINT_IMPERIAL = factory.createSingularUnit("pint", "pint", LITRE, 0.56826125);
        GALLON_IMPERIAL = factory.createSingularUnit("gallon", "gallon", LITRE, 4.54609);
        CUP = factory.createSingularUnit("cup", "cup", MILLILITRE, 250);
        TABLESPOON = factory.createSingularUnit("tablespoon", "Tbsp", MILLILITRE, 15);
        TEASPOON = factory.createSingularUnit("teaspoon", "tsp", MILLILITRE, 5);
        RADIAN = factory.createUnitMultiplication("radian", "rad", METRE, factory.createUnitExponentiation(METRE, -1));
        DEGREE = factory.createSingularUnit("degree", "°", RADIAN, Math.PI / 180.);
        STERADIAN = factory.createUnitMultiplication("steradian", "sr", SQUARE_METRE, factory.createUnitExponentiation(METRE, -1));
        HERTZ = factory.createUnitExponentiation("Hertz", "Hz", SECOND, -1);
        METRE_PER_SECOND = factory.createUnitDivision("metre per second", "m/s", METRE, SECOND);
        KILOMETRE_PER_SECOND = factory.createUnitDivision("kilometre per second", "km/s", KILOMETRE, SECOND);
        KILOMETRE_PER_HOUR = factory.createUnitDivision("kilometre per hour", "km/h", KILOMETRE, HOUR);
        MILE_PER_HOUR = factory.createUnitDivision("mile per hour", "mi/h", HOUR, HOUR);
        KNOT = factory.createUnitDivision("knot", "kn", NAUTICAL_MILE, HOUR);
        METRE_PER_SECOND_SQUARED = factory.createUnitDivision("metre per second squared", "m/s^2", METRE, factory.createUnitExponentiation(SECOND, 2));
        NEWTON = factory.createUnitMultiplication("Newton", "N", KILOGRAM, METRE_PER_SECOND_SQUARED);
        NEWTON_PER_SQUARE_METRE = factory.createUnitDivision("Newton per metre squared", "N/m^2", NEWTON, SQUARE_METRE);
        PASCAL = factory.createSingularUnit("Pascal", "Pa", NEWTON_PER_SQUARE_METRE);
        ATMOSPHERE = factory.createSingularUnit("atmosphere", "atm", PASCAL, 1.01325e5);
        MILLIBAR = factory.createPrefixedUnit("millibar", "mbar", (SingularUnit) BAR, DecimalPrefix.MILLI);
        PSI = factory.createSingularUnit("Pounds per square inch", "psi", PASCAL, 6894.757293168);
        JOULE = factory.createUnitMultiplication("Joule", "J", NEWTON, METRE);
        CALORIE = factory.createSingularUnit("calorie", "cal", JOULE, 4.2);
        KILOCALORIE = factory.createPrefixedUnit("kilocalorie", "kcal", (SingularUnit) CALORIE, DecimalPrefix.KILO);
        WATT = factory.createUnitDivision("watt", "W", JOULE, SECOND);
        COULOMB = factory.createUnitMultiplication("coulomb", "C", SECOND, AMPERE);
        VOLT = factory.createUnitDivision("volt", "V", WATT, AMPERE);
        FARAD = factory.createUnitDivision("farad", "F", COULOMB, VOLT);
        OHM = factory.createUnitDivision("ohm", "Ω", VOLT, AMPERE);
        SIEMENS = factory.createUnitDivision("siemens", "S", AMPERE, VOLT);
        WEBER = factory.createUnitMultiplication("weber", "Wb", VOLT, SECOND);
        TESLA = factory.createUnitDivision("tesla", "T", WEBER, SQUARE_METRE);
        HENRY = factory.createUnitDivision("henry", "H", WEBER, AMPERE);
        LUMEN = factory.createUnitMultiplication("lumen", "lm", CANDELA, STERADIAN);
        LUX = factory.createUnitDivision("lux", "lx", LUMEN, SQUARE_METRE);
        BECQUEREL = factory.createUnitExponentiation("becquerel", "Bq", SECOND, -1);
        GRAY = factory.createUnitDivision("gray","Gy",JOULE,KILOGRAM);
        SIEVERT = factory.createUnitDivision("sievert","Sv",JOULE,KILOGRAM);
        KATAL = factory.createUnitDivision("katal","kat",MOLE,SECOND);
    }
    */
}