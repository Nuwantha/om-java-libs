package nl.wur.fbr.om.core.instances;

import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.prefixes.DecimalPrefix;

/**
 * @author Don Willems on 27/07/15.
 */
public abstract class Units {

    // Units of Length
    public static final Unit METRE;
    public static final Unit KILOMETRE;
    public static final Unit DECIMETRE;
    public static final Unit CENTIMETRE;
    public static final Unit MILLIMETRE;
    public static final Unit MICROMETRE;
    public static final Unit NANOMETRE;
    public static final Unit ANGSTROM;
    public static final Unit INCH;
    public static final Unit FEET;
    public static final Unit YARD;
    public static final Unit MILE;
    public static final Unit NAUTICAL_MILE;
    public static final Unit FATHOM;

    // Units of mass
    public static final Unit GRAM;
    public static final Unit KILOGRAM;
    public static final Unit MILLIGRAM;
    public static final Unit MICROGRAM;

    // Units of time
    public static final Unit SECOND;
    public static final Unit MILLISECOND;
    public static final Unit MICROSECOND;
    public static final Unit NANOSECOND;
    public static final Unit MINUTE;
    public static final Unit HOUR;
    public static final Unit YEAR;
    public static final Unit DAY;

    // Units of electrical current
    public static final Unit AMPERE;

    // Units of temperature
    public static final Unit KELVIN;
    public static final Unit CELSIUS;
    public static final Unit FAHRENHEIT;

    // Units of amount of substance
    public static final Unit MOLE;

    // Units of amount of luminous intensity
    public static final Unit CANDELA;

    // Units of area
    public static final Unit SQUARE_METRE;
    public static final Unit SQUARE_KILOMETRE;
    public static final Unit HECTARE;
    public static final Unit SQUARE_MILE;
    public static final Unit SQUARE_FEET;
    public static final Unit ACRE;

    // Units of volume
    public static final Unit CUBIC_METRE;
    public static final Unit LITRE;
    public static final Unit MILLILITRE;
    public static final Unit PINT_IMPERIAL;
    public static final Unit GALLON_IMPERIAL;
    public static final Unit CUP;
    public static final Unit TEASPOON;
    public static final Unit TABLESPOON;

    // Units of angle
    public static final Unit RADIAN;
    public static final Unit DEGREE;

    // Units of solid angle
    public static final Unit STERADIAN;

    // Units of frequency
    public static final Unit HERTZ;

    // Units of velocity
    public static final Unit METRE_PER_SECOND;
    public static final Unit KILOMETRE_PER_SECOND;
    public static final Unit KILOMETRE_PER_HOUR;
    public static final Unit MILE_PER_HOUR;
    public static final Unit KNOT;

    // Units of acceleration
    public static final Unit METRE_PER_SECOND_SQUARED;

    // Units of force
    public static final Unit NEWTON;

    // Units of pressure
    public static final Unit NEWTON_PER_SQUARE_METRE;
    public static final Unit PASCAL;
    public static final Unit ATMOSPHERE;
    public static final Unit BAR;
    public static final Unit MILLIBAR;
    public static final Unit PSI;

    // Units of energy
    public static final Unit JOULE;
    public static final Unit CALORIE;
    public static final Unit KILOCALORIE;

    // Units of power
    public static final Unit WATT;

    // Units of electrical charge
    public static final Unit COULOMB;

    // Units of voltage
    public static final Unit VOLT;

    // Units of electrical capacitance
    public static final Unit FARAD;

    // Units of electrical resistance
    public static final Unit OHM;

    // Units of electrical conductance
    public static final Unit SIEMENS;

    static {
        DefaultUnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();

        METRE = factory.createSingularUnit("metre", "m");
        KILOMETRE = factory.createUnitMultiple("kilometre", "km", (SingularUnit) METRE, DecimalPrefix.KILO);
        CENTIMETRE = factory.createUnitMultiple("centimetre", "cm", (SingularUnit) METRE, DecimalPrefix.CENTI);
        DECIMETRE = factory.createUnitMultiple("decimetre", "dm", (SingularUnit) METRE, DecimalPrefix.DECI);
        MILLIMETRE = factory.createUnitMultiple("millimetre", "mm", (SingularUnit) METRE, DecimalPrefix.MILLI);
        MICROMETRE = factory.createUnitMultiple("micrometre", "μm", (SingularUnit) METRE, DecimalPrefix.MICRO);
        NANOMETRE = factory.createUnitMultiple("nanometre", "nm", (SingularUnit) METRE, DecimalPrefix.NANO);
        ANGSTROM = factory.createSingularUnit("Ångström", "Å", METRE, 1e-10);
        INCH = factory.createSingularUnit("inch", "in", METRE, 0.0254);
        FEET = factory.createSingularUnit("feet","ft",METRE,0.3048);
        YARD = factory.createSingularUnit("yard","yd",METRE,0.9144);
        MILE = factory.createSingularUnit("mile","mi",METRE,1609.344);
        NAUTICAL_MILE = factory.createSingularUnit("nautical mile","M",METRE,1853.184);
        FATHOM = factory.createSingularUnit("fathom",null,FEET,6);

        GRAM = factory.createSingularUnit("gram", "g");
        KILOGRAM = factory.createUnitMultiple("kilogram", "kg", (SingularUnit) GRAM, DecimalPrefix.KILO);
        MILLIGRAM = factory.createUnitMultiple("milligram", "mg", (SingularUnit) GRAM, DecimalPrefix.MILLI);
        MICROGRAM = factory.createUnitMultiple("microgram", "μg", (SingularUnit) GRAM, DecimalPrefix.MICRO);

        SECOND = factory.createSingularUnit("second", "s");
        MILLISECOND = factory.createUnitMultiple("millisecond", "ms", (SingularUnit) SECOND, DecimalPrefix.MILLI);
        MICROSECOND = factory.createUnitMultiple("microsecond", "μs", (SingularUnit) SECOND, DecimalPrefix.MICRO);
        NANOSECOND = factory.createUnitMultiple("nanosecond", "ns", (SingularUnit) SECOND, DecimalPrefix.NANO);
        MINUTE = factory.createSingularUnit("minute", "m", SECOND, 60);
        HOUR = factory.createSingularUnit("hour", "h", SECOND, 3600);
        DAY = factory.createSingularUnit("day", "d",SECOND,86400);
        YEAR = factory.createSingularUnit("year", "yr",SECOND,31556925.9747);

        AMPERE = factory.createSingularUnit("ampere", "A");

        KELVIN = factory.createSingularUnit("kelvin", "K");
        CELSIUS = factory.createSingularUnit("celsius", "°C",KELVIN);
        FAHRENHEIT = factory.createSingularUnit("fahrenheit", "°F",KELVIN,1.8);

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
        MILLILITRE = factory.createUnitMultiple("millilitre", "ml", (SingularUnit) LITRE, DecimalPrefix.MILLI);
        PINT_IMPERIAL = factory.createSingularUnit("pint", "pint", LITRE, 0.56826125);
        GALLON_IMPERIAL = factory.createSingularUnit("gallon", "gallon", LITRE, 4.54609);
        CUP = factory.createSingularUnit("cup","cup",MILLILITRE,250);
        TABLESPOON = factory.createSingularUnit("tablespoon","Tbsp",MILLILITRE,15);
        TEASPOON = factory.createSingularUnit("teaspoon", "tsp", MILLILITRE, 5);

        RADIAN = factory.createUnitMultiplication("radian", "rad", METRE, factory.createUnitExponentiation(METRE, -1));
        DEGREE = factory.createSingularUnit("degree", "°", RADIAN, Math.PI / 180.);

        STERADIAN = factory.createUnitMultiplication("steradian", "sr", SQUARE_METRE, factory.createUnitExponentiation(METRE, -1));

        HERTZ = factory.createUnitExponentiation("Hertz", "Hz", SECOND, -1);

        METRE_PER_SECOND = factory.createUnitDivision("metre per second", "m/s", METRE, SECOND);
        KILOMETRE_PER_SECOND = factory.createUnitDivision("kilometre per second", "km/s", KILOMETRE, SECOND);
        KILOMETRE_PER_HOUR = factory.createUnitDivision("kilometre per hour","km/h",KILOMETRE,HOUR);
        MILE_PER_HOUR = factory.createUnitDivision("mile per hour","mi/h",HOUR,HOUR);
        KNOT = factory.createUnitDivision("knot","kn",NAUTICAL_MILE,HOUR);

        METRE_PER_SECOND_SQUARED = factory.createUnitDivision("metre per second squared", "m/s^2", METRE, factory.createUnitExponentiation(SECOND, 2));

        NEWTON = factory.createUnitMultiplication("Newton", "N", KILOGRAM, METRE_PER_SECOND_SQUARED);

        NEWTON_PER_SQUARE_METRE = factory.createUnitDivision("Newton per metre squared", "N/m^2", NEWTON, SQUARE_METRE);
        PASCAL = factory.createSingularUnit("Pascal", "Pa", NEWTON_PER_SQUARE_METRE);
        ATMOSPHERE = factory.createSingularUnit("atmosphere", "atm", PASCAL, 1.01325e5);
        BAR = factory.createSingularUnit("bar", "bar", PASCAL, 1e5);
        MILLIBAR = factory.createUnitMultiple("millibar", "mbar", (SingularUnit) BAR, DecimalPrefix.MILLI);
        PSI = factory.createSingularUnit("Pounds per square inch", "psi", PASCAL, 6894.757293168);

        JOULE = factory.createUnitMultiplication("Joule", "J", NEWTON, METRE);
        CALORIE = factory.createSingularUnit("calorie", "cal", JOULE, 4.2);
        KILOCALORIE = factory.createUnitMultiple("kilocalorie", "kcal", (SingularUnit) CALORIE, DecimalPrefix.KILO);

        WATT = factory.createUnitDivision("Watt", "W", JOULE, SECOND);

        COULOMB = factory.createUnitMultiplication("Coulomb", "C", SECOND, AMPERE);

        VOLT = factory.createUnitDivision("Volt", "V", WATT, AMPERE);

        FARAD = factory.createUnitDivision("Farad", "F", COULOMB, VOLT);

        OHM = factory.createUnitDivision("Ohm", "Ω", VOLT, AMPERE);

        SIEMENS = factory.createUnitDivision("Siemens", "S", AMPERE, VOLT);
    }
}
