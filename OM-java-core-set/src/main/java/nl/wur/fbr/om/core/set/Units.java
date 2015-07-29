package nl.wur.fbr.om.core.set;

import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.prefixes.DecimalPrefix;
import nl.wur.fbr.om.set.UnitOrScaleSet;

/**
 * This class contains a core set of units. All SI base and derived units are included in this set.
 * Other frequently used units that are not part of the SI set are also included.
 * The units are available after the first call to {@link #initialiseSet(UnitAndScaleFactory)}.
 *
 * @author Don Willems on 29/07/15.
 */
public class Units implements UnitOrScaleSet {

    // Units of Length     
    public Unit METRE;
    public Unit KILOMETRE;
    public Unit DECIMETRE;
    public Unit CENTIMETRE;
    public Unit MILLIMETRE;
    public Unit MICROMETRE;
    public Unit NANOMETRE;
    public Unit ANGSTROM;
    public Unit INCH;
    public Unit FEET;
    public Unit YARD;
    public Unit MILE;
    public Unit NAUTICAL_MILE;
    public Unit FATHOM;

    // Units of mass     
    public Unit GRAM;
    public Unit KILOGRAM;
    public Unit MILLIGRAM;
    public Unit MICROGRAM;

    // Units of time     
    public Unit SECOND;
    public Unit MILLISECOND;
    public Unit MICROSECOND;
    public Unit NANOSECOND;
    public Unit MINUTE;
    public Unit HOUR;
    public Unit YEAR;
    public Unit DAY;

    // Units of electrical current     
    public Unit AMPERE;

    // Units of temperature     
    public Unit KELVIN;
    public Unit CELSIUS;
    public Unit FAHRENHEIT;

    // Units of amount of substance     
    public Unit MOLE;

    // Units of amount of luminous intensity     
    public Unit CANDELA;

    // Units of area     
    public Unit SQUARE_METRE;
    public Unit SQUARE_KILOMETRE;
    public Unit HECTARE;
    public Unit SQUARE_MILE;
    public Unit SQUARE_FEET;
    public Unit ACRE;

    // Units of volume     
    public Unit CUBIC_METRE;
    public Unit LITRE;
    public Unit MILLILITRE;
    public Unit PINT_IMPERIAL;
    public Unit GALLON_IMPERIAL;
    public Unit CUP;
    public Unit TEASPOON;
    public Unit TABLESPOON;

    // Units of angle     
    public Unit RADIAN;
    public Unit DEGREE;

    // Units of solid angle     
    public Unit STERADIAN;

    // Units of frequency     
    public Unit HERTZ;

    // Units of velocity     
    public Unit METRE_PER_SECOND;
    public Unit KILOMETRE_PER_SECOND;
    public Unit KILOMETRE_PER_HOUR;
    public Unit MILE_PER_HOUR;
    public Unit KNOT;

    // Units of acceleration     
    public Unit METRE_PER_SECOND_SQUARED;

    // Units of force     
    public Unit NEWTON;

    // Units of pressure     
    public Unit NEWTON_PER_SQUARE_METRE;
    public Unit PASCAL;
    public Unit ATMOSPHERE;
    public Unit BAR;
    public Unit MILLIBAR;
    public Unit PSI;

    // Units of energy     
    public Unit JOULE;
    public Unit CALORIE;
    public Unit KILOCALORIE;

    // Units of power     
    public Unit WATT;

    // Units of electrical fields 
    public Unit COULOMB;
    public Unit VOLT;
    public Unit FARAD;
    public Unit OHM;
    public Unit SIEMENS;

    // Units of magnetic fields
    public Unit WEBER;
    public Unit TESLA;
    public Unit HENRY;

    // Units of electromagnetic radiation
    public Unit LUMEN;
    public Unit LUX;

    // Units of radioactivity
    public Unit BECQUEREL;
    public Unit GRAY;
    public Unit SIEVERT;

    // Unit of Catalytic activity
    public Unit KATAL;

    /**
     * Initialises the set by creating the different units and/or measurement scales using the provided
     * {@link UnitAndScaleFactory}.
     *
     * @param factory The factory used for the creation of units or measurement scales.
     * @throws UnitOrScaleCreationException When one of the units or scales in the set could not be created.
     */
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
}