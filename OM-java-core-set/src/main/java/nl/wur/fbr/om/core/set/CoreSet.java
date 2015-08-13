package nl.wur.fbr.om.core.set;

import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.UnitAndScaleSet;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.prefixes.DecimalPrefix;

import java.util.HashSet;
import java.util.Set;

/**
 * This class contains the identifiers for the core set of units. All SI base and derived units are included in this set.
 * Other frequently used units that are not part of the SI set are also included.
 *
 * @author Don Willems on 29/07/15.
 */
public class CoreSet extends UnitAndScaleSet {

    /** The namespace of the core unit set.*/
    public static String NAMESPACE;

    /** The identifier in the core unit set for the SI base unit of length Metre.*/
    public static Unit METRE;

    /** The identifier in the core unit set for the prefixed unit of length Kilometre.*/
    public static Unit KILOMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Decimetre.*/
    public static Unit DECIMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Centimetre.*/
    public static Unit CENTIMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Millimetre.*/
    public static Unit MILLIMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Micrometre.*/
    public static Unit MICROMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Nanometre.*/
    public static Unit NANOMETRE;

    /** The identifier in the core unit set for the unit of length Ångström.*/
    public static Unit ANGSTROM;

    /** The identifier in the core unit set for the unit of length Inch.*/
    public static Unit INCH;

    /** The identifier in the core unit set for the unit of length Feet.*/
    public static Unit FEET;

    /** The identifier in the core unit set for the unit of length Yard.*/
    public static Unit YARD;

    /** The identifier in the core unit set for the unit of length Mile.*/
    public static Unit MILE;

    /** The identifier in the core unit set for the unit of length Nautical mile.*/
    public static Unit NAUTICAL_MILE;

    /** The identifier in the core unit set for the unit of length Fathom.*/
    public static Unit FATHOM;



    /** The identifier in the core unit set for the unit of mass Gram.*/
    public static Unit GRAM;

    /** The identifier in the core unit set for the SI unit of mass Kilogram.*/
    public static Unit KILOGRAM;

    /** The identifier in the core unit set for the prefixed unit of mass Milligram.*/
    public static Unit MILLIGRAM;

    /** The identifier in the core unit set for the prefixed unit of mass Microgram.*/
    public static Unit MICROGRAM;



    /** The identifier in the core unit set for the SI unit of time Second.*/
    public static Unit SECOND;

    /** The identifier in the core unit set for the prefixed unit of time Millisecond.*/
    public static Unit MILLISECOND;

    /** The identifier in the core unit set for the prefixed unit of time Microsecond.*/
    public static Unit MICROSECOND;

    /** The identifier in the core unit set for the prefixed unit of time Nanosecond.*/
    public static Unit NANOSECOND;

    /** The identifier in the core unit set for the unit of time Minute.*/
    public static Unit MINUTE;

    /** The identifier in the core unit set for the unit of time Hour.*/
    public static Unit HOUR;

    /** The identifier in the core unit set for the unit of time Year.*/
    public static Unit YEAR;

    /** The identifier in the core unit set for the unit of time Day.*/
    public static Unit DAY;



    /** The identifier in the core unit set for the SI unit of electical current Ampere.*/
    public static Unit AMPERE;



    /** The identifier in the core unit set for the SI unit of temperature Kelvin.*/
    public static Unit KELVIN;

    /** The identifier in the core unit set for the unit of temperature Celsius.*/
    public static Unit CELSIUS;

    /** The identifier in the core unit set for the unit of temperature Fahrenheit.*/
    public static Unit FAHRENHEIT;

    /** The identifier in the core unit set for the SI unit of ammount of substance Mole.*/
    public static Unit MOLE;



    /** The identifier in the core unit set for the SI unit of luminous intensity Candela.*/
    public static Unit CANDELA;



    /** The identifier in the core unit set for the unit of area Square metre.*/
    public static Unit SQUARE_METRE;

    /** The identifier in the core unit set for the unit of area Square kilometre.*/
    public static Unit SQUARE_KILOMETRE;

    /** The identifier in the core unit set for the unit of area Hectare.*/
    public static Unit HECTARE;

    /** The identifier in the core unit set for the unit of area Square mile.*/
    public static Unit SQUARE_MILE;

    /** The identifier in the core unit set for the unit of area Square feet.*/
    public static Unit SQUARE_FEET;

    /** The identifier in the core unit set for the unit of area Acre.*/
    public static Unit ACRE;



    /** The identifier in the core unit set for the unit of volume Cubic metre.*/
    public static Unit CUBIC_METRE;

    /** The identifier in the core unit set for the unit of volume Litre.*/
    public static Unit LITRE;

    /** The identifier in the core unit set for the unit of volume Millilitre.*/
    public static Unit MILLILITRE;

    /** The identifier in the core unit set for the imperial unit of volume Pint.*/
    public static Unit PINT_IMPERIAL;

    /** The identifier in the core unit set for the imperial unit of volume Gallon.*/
    public static Unit GALLON_IMPERIAL;

    /** The identifier in the core unit set for the unit of volume Cup.*/
    public static Unit CUP;

    /** The identifier in the core unit set for the unit of volume Teaspoon.*/
    public static Unit TEASPOON;

    /** The identifier in the core unit set for the unit of volume Tablespoon.*/
    public static Unit TABLESPOON;



    /** The identifier in the core unit set for the SI unit of angle Radian.*/
    public static Unit RADIAN;

    /** The identifier in the core unit set for the unit of angle Degree.*/
    public static Unit DEGREE;



    /** The identifier in the core unit set for the SI unit of solid angle Steradian.*/
    public static Unit STERADIAN;



    /** The identifier in the core unit set for the unit of frequency Hertz.*/
    public static Unit HERTZ;



    /** The identifier in the core unit set for the unit of velocity Metre per second.*/
    public static Unit METRE_PER_SECOND;

    /** The identifier in the core unit set for the unit of velocity Kilometre per second.*/
    public static Unit KILOMETRE_PER_SECOND;

    /** The identifier in the core unit set for the unit of velocity Kilometre per hour.*/
    public static Unit KILOMETRE_PER_HOUR;

    /** The identifier in the core unit set for the unit of velocity Mile per hour.*/
    public static Unit MILE_PER_HOUR;

    /** The identifier in the core unit set for the unit of velocity Knot.*/
    public static Unit KNOT;



    /** The identifier in the core unit set for the unit of acceleration Metre per second squared.*/
    public static Unit METRE_PER_SECOND_SQUARED;



    /** The identifier in the core unit set for the unit of force Newton.*/
    public static Unit NEWTON;



    /** The identifier in the core unit set for the unit of pressure Newton per square metre.*/
    public static Unit NEWTON_PER_SQUARE_METRE;

    /** The identifier in the core unit set for the unit of pressure Pascal.*/
    public static Unit PASCAL;

    /** The identifier in the core unit set for the unit of pressure Atmosphere.*/
    public static Unit ATMOSPHERE;

    /** The identifier in the core unit set for the unit of pressure Bar.*/
    public static Unit BAR;

    /** The identifier in the core unit set for the prefixed unit of pressure Millibar.*/
    public static Unit MILLIBAR;

    /** The identifier in the core unit set for the unit of pressure Pound per square inch.*/
    public static Unit PSI;



    /** The identifier in the core unit set for the unit of energy Joule.*/
    public static Unit JOULE;

    /** The identifier in the core unit set for the unit of energy Calorie.*/
    public static Unit CALORIE;

    /** The identifier in the core unit set for the unit of energy Kilocalorie.*/
    public static Unit KILOCALORIE;



    /** The identifier in the core unit set for the unit of power Watt.*/
    public static Unit WATT;



    /** The identifier in the core unit set for the unit of electric charge Coulomb.*/
    public static Unit COULOMB;

    /** The identifier in the core unit set for the unit of voltage Volt.*/
    public static Unit VOLT;

    /** The identifier in the core unit set for the unit of electric capacitance Farad.*/
    public static Unit FARAD;

    /** The identifier in the core unit set for the unit of electric resistance Ohm.*/
    public static Unit OHM;

    /** The identifier in the core unit set for the unit of electrical conductance Siemens.*/
    public static Unit SIEMENS;



    /** The identifier in the core unit set for the unit of magnetic flux Weber.*/
    public static Unit WEBER;

    /** The identifier in the core unit set for the unit of magnetic field strength Tesla.*/
    public static Unit TESLA;

    /** The identifier in the core unit set for the unit of inductance Henry.*/
    public static Unit HENRY;



    /** The identifier in the core unit set for the unit of luminous flux Lumen.*/
    public static Unit LUMEN;

    /** The identifier in the core unit set for the unit of illuminance Lux.*/
    public static Unit LUX;



    /** The identifier in the core unit set for the unit of radioactivity Becquerel.*/
    public static Unit BECQUEREL;

    /** The identifier in the core unit set for the unit of absorbed dose of ionising radiation Gray.*/
    public static Unit GRAY;

    /** The identifier in the core unit set for the unit of equivalent dose of ionising radiation Sievert.*/
    public static Unit SIEVERT;



    /** The identifier in the core unit set for the unit of catalitic activity Katal.*/
    public static Unit KATAL;


    /** The identifier for the Kelvin temperature scale.*/
    public static Scale KELVIN_SCALE;

    /** The identifier for the Celsius temperature scale.*/
    public static Scale CELSIUS_SCALE;

    /** The identifier for the Fahrenheit temperature scale.*/
    public static Scale FAHRENHEIT_SCALE;

    /**
     * Initializes the set by creating all units and scales in the set using the specified factory.
     * @param factory The factory to create units and scales.
     */
    @Override
    public void initialize(UnitAndScaleFactory factory) {
        if(METRE!=null) return; // has already been initialised!
        NAMESPACE = "nl.wur.fbr.om.core.set.unit.";
        
        METRE = factory.createBaseUnit(NAMESPACE+"metre", "metre", "m", SIBaseDimension.LENGTH);
        KILOMETRE = factory.createPrefixedUnit(NAMESPACE+"kilometre","kilometre", "km", (SingularUnit)METRE, DecimalPrefix.KILO);
        CENTIMETRE = factory.createPrefixedUnit(NAMESPACE+"centimetre", "centimetre", "cm", (SingularUnit) METRE, DecimalPrefix.CENTI);
        DECIMETRE = factory.createPrefixedUnit(NAMESPACE+"decimetre", "decimetre", "dm", (SingularUnit) METRE, DecimalPrefix.DECI);
        MILLIMETRE = factory.createPrefixedUnit(NAMESPACE+"millimetre", "millimetre", "mm", (SingularUnit) METRE, DecimalPrefix.MILLI);
        MICROMETRE = factory.createPrefixedUnit(NAMESPACE+"micrometre", "micrometre", "μm", (SingularUnit) METRE, DecimalPrefix.MICRO);
        NANOMETRE = factory.createPrefixedUnit(NAMESPACE+"nanometre", "nanometre", "nm", (SingularUnit) METRE, DecimalPrefix.NANO);
        ANGSTROM = factory.createSingularUnit(NAMESPACE+"angstrom", "Ångström", "Å", METRE, 1e-10);
        INCH =  factory.createSingularUnit(NAMESPACE+"inch","inch", "in", METRE, 0.0254);
        FEET =  factory.createSingularUnit(NAMESPACE+"feet","feet", "ft", METRE, 0.3048);
        YARD =  factory.createSingularUnit(NAMESPACE+"yard","yard", "yd", METRE, 0.9144);
        MILE =  factory.createSingularUnit(NAMESPACE+"mile","mile", "mi", METRE, 1609.344);
        NAUTICAL_MILE =  factory.createSingularUnit(NAMESPACE+"nauticalmile","nautical mile", "M", METRE, 1853.184);
        FATHOM =  factory.createSingularUnit(NAMESPACE+"fathom","fathom", null, FEET, 6);

        GRAM = factory.createSingularUnit(NAMESPACE+"gram","gram","g");
        KILOGRAM = factory.createPrefixedBaseUnit(NAMESPACE+"kilogram","kilogram","kg",SIBaseDimension.MASS,(SingularUnit)GRAM,DecimalPrefix.KILO);
        MILLIGRAM = factory.createPrefixedUnit(NAMESPACE+"milligram", "milligram", "mg", (SingularUnit) GRAM, DecimalPrefix.MILLI);
        MICROGRAM = factory.createPrefixedUnit(NAMESPACE+"microgram", "microgram", "μg", (SingularUnit) GRAM, DecimalPrefix.MICRO);

        SECOND = factory.createBaseUnit(NAMESPACE+"second","second","s",SIBaseDimension.TIME);
        MILLISECOND = factory.createPrefixedUnit(NAMESPACE+"millisecond","millisecond","ms",(SingularUnit)SECOND,DecimalPrefix.MILLI);
        MICROSECOND = factory.createPrefixedUnit(NAMESPACE+"microsecond","microsecond","μs",(SingularUnit)SECOND,DecimalPrefix.MICRO);
        NANOSECOND = factory.createPrefixedUnit(NAMESPACE+"nanosecond","nanosecond","ns",(SingularUnit)SECOND,DecimalPrefix.NANO);
        MINUTE = factory.createSingularUnit(NAMESPACE+"minute","minute","m",SECOND,60);
        HOUR = factory.createSingularUnit(NAMESPACE+"hour","hour","h",SECOND,3600);
        DAY = factory.createSingularUnit(NAMESPACE+"day","day","d",SECOND,86400);
        YEAR = factory.createSingularUnit(NAMESPACE+"year","year","yr",SECOND,31556925.9747);

        AMPERE = factory.createBaseUnit(NAMESPACE+"ampere", "ampere", "A",SIBaseDimension.ELECTRIC_CURRENT);

        KELVIN = factory.createBaseUnit(NAMESPACE+"kelvin", "kelvin", "K", SIBaseDimension.THERMODYNAMIC_TEMPERATURE);
        CELSIUS = factory.createSingularUnit(NAMESPACE+"celsius", "celsius","°C",KELVIN);
        FAHRENHEIT = factory.createSingularUnit(NAMESPACE+"fahrenheit", "fahrenheit","°F",KELVIN,1/1.8);

        MOLE = factory.createBaseUnit(NAMESPACE+"mole", "mole", "mol", SIBaseDimension.AMOUNT_OF_SUBSTANCE);

        CANDELA = factory.createBaseUnit(NAMESPACE+"candela", "candela", "cd", SIBaseDimension.LUMINOUS_INTENSITY);

        SQUARE_METRE = factory.createUnitExponentiation(NAMESPACE+"squaremetre","square metre", "m^2", METRE, 2);
        SQUARE_KILOMETRE = factory.createUnitExponentiation(NAMESPACE+"squarekilometre","square kilometre", "km^2", KILOMETRE, 2);
        SQUARE_MILE = factory.createUnitExponentiation(NAMESPACE+"squaremile","square mile", "sq mi", MILE, 2);
        SQUARE_FEET = factory.createUnitExponentiation(NAMESPACE+"squarefeet","square feet", "sq ft", FEET, 2);
        HECTARE = factory.createSingularUnit(NAMESPACE+"hectare","hectare","ha",SQUARE_METRE,1e4);
        ACRE = factory.createSingularUnit(NAMESPACE+"acre","acre","ac",SQUARE_METRE,4046.856);

        CUBIC_METRE = factory.createUnitExponentiation(NAMESPACE+"cubicmetre","cubic metre", "m^3", METRE, 3);
        LITRE = factory.createSingularUnit(NAMESPACE+"litre","litre","l",CUBIC_METRE,1e-3);
        MILLILITRE = factory.createPrefixedUnit(NAMESPACE+"millilitre","millilitre","ml",(SingularUnit)LITRE,DecimalPrefix.MILLI);
        PINT_IMPERIAL = factory.createSingularUnit(NAMESPACE+"pintimperial","pint","pint",LITRE,0.56826125);
        GALLON_IMPERIAL = factory.createSingularUnit(NAMESPACE+"gallonimperial","gallon","gallon",LITRE,4.54609);
        CUP = factory.createSingularUnit(NAMESPACE+"cup","cup","cup",MILLILITRE,250);
        TABLESPOON = factory.createSingularUnit(NAMESPACE+"tablespoon","tablespoon", "Tbsp",MILLILITRE,15);
        TEASPOON = factory.createSingularUnit(NAMESPACE+"teaspoon","teaspoon", "tsp",MILLILITRE,5);

        RADIAN = factory.createUnitMultiplication(NAMESPACE+"radian","radian", "rad", METRE, factory.createUnitExponentiation(METRE, -1));
        DEGREE = factory.createSingularUnit(NAMESPACE+"degree", "degree", "°", RADIAN, Math.PI / 180.);

        STERADIAN = factory.createUnitMultiplication(NAMESPACE+"steradian","steradian", "sr", SQUARE_METRE, factory.createUnitExponentiation(METRE, -1));

        HERTZ = factory.createUnitExponentiation(NAMESPACE+"hertz", "Hertz", "Hz", SECOND, -1);

        METRE_PER_SECOND = factory.createUnitDivision(NAMESPACE+"metrepersecond","metre per second", "m/s", METRE, SECOND);
        KILOMETRE_PER_SECOND = factory.createUnitDivision(NAMESPACE+"kilometrepersecond","kilometre per second", "km/s", KILOMETRE, SECOND);
        KILOMETRE_PER_HOUR = factory.createUnitDivision(NAMESPACE+"kilometreperhour","kilometre per hour", "km/h", KILOMETRE, HOUR);
        MILE_PER_HOUR = factory.createUnitDivision(NAMESPACE+"mileperhour","mile per hour", "mi/h", MILE, HOUR);
        KNOT = factory.createUnitDivision(NAMESPACE+"knot","knot", "kn", NAUTICAL_MILE, HOUR);

        METRE_PER_SECOND_SQUARED = factory.createUnitDivision(NAMESPACE+"metrepersecondsquared","metre per second squares", "m/s^2", METRE, factory.createUnitExponentiation(SECOND,2));

        NEWTON = factory.createUnitMultiplication(NAMESPACE+"newton", "newton", "N", KILOGRAM, METRE_PER_SECOND_SQUARED);

        NEWTON_PER_SQUARE_METRE = factory.createUnitDivision(NAMESPACE+"newtonpersquaremetre","newton per metre squared", "N/m^2", NEWTON, SQUARE_METRE);
        PASCAL = factory.createSingularUnit(NAMESPACE+"pascal","pascal", "Pa", NEWTON_PER_SQUARE_METRE);
        BAR = factory.createSingularUnit(NAMESPACE+"bar","bar","bar",PASCAL,1e5);
        ATMOSPHERE = factory.createSingularUnit(NAMESPACE+"atmosphere","atmosphere", "atm", PASCAL, 1.01325e5);
        MILLIBAR = factory.createPrefixedUnit(NAMESPACE+"millibar","millibar", "mbar", (SingularUnit) BAR, DecimalPrefix.MILLI);
        PSI = factory.createSingularUnit(NAMESPACE+"psi","Pounds per square inch", "psi", PASCAL, 6894.757293168);

        JOULE = factory.createUnitMultiplication(NAMESPACE+"joule","joule", "J", NEWTON, METRE);
        CALORIE = factory.createSingularUnit(NAMESPACE+"calorie","calorie", "cal", JOULE, 4.184);
        KILOCALORIE = factory.createPrefixedUnit(NAMESPACE+"kilocalorie","kilocalorie", "kcal", (SingularUnit) CALORIE, DecimalPrefix.KILO);

        WATT = factory.createUnitDivision(NAMESPACE+"watt","watt", "W", JOULE, SECOND);

        COULOMB = factory.createUnitMultiplication(NAMESPACE+"coulomb","coulomb", "C", SECOND, AMPERE);
        VOLT = factory.createUnitDivision(NAMESPACE+"volt","volt", "V", WATT, AMPERE);
        FARAD = factory.createUnitDivision(NAMESPACE+"farad","farad", "F", COULOMB, VOLT);
        OHM = factory.createUnitDivision(NAMESPACE+"ohm", "Ω", VOLT, AMPERE);
        SIEMENS = factory.createUnitDivision(NAMESPACE+"siemens","S", AMPERE, VOLT);

        WEBER = factory.createUnitMultiplication(NAMESPACE+"weber","weber", "Wb", VOLT, SECOND);
        TESLA = factory.createUnitDivision(NAMESPACE+"tesla","tesla", "T", WEBER, SQUARE_METRE);
        HENRY = factory.createUnitDivision(NAMESPACE+"henry","henry", "H", WEBER, AMPERE);

        LUMEN = factory.createUnitMultiplication(NAMESPACE+"lumen","lumen", "lm", CANDELA, STERADIAN);
        LUX  = factory.createUnitDivision(NAMESPACE+"lux","lux", "lx", LUMEN, SQUARE_METRE);

        BECQUEREL = factory.createUnitExponentiation(NAMESPACE+"becquerel","becquerel", "Bq", SECOND, -1);
        GRAY = factory.createUnitDivision(NAMESPACE+"gray","gray", "Gy", JOULE, KILOCALORIE);
        SIEVERT = factory.createUnitDivision(NAMESPACE+"sievert","sievert", "Sv", JOULE, KILOCALORIE);

        KATAL = factory.createUnitDivision(NAMESPACE+"katal","katal", "kat", MOLE, SECOND);

        KELVIN_SCALE = factory.createScale(NAMESPACE+"kelvinScale","Kelvin temperature scale",null,KELVIN);
        CELSIUS_SCALE = factory.createScale(NAMESPACE+"celsiusScale","Celsius temperature scale",null,KELVIN_SCALE,-273.15,1.0,CELSIUS);
        FAHRENHEIT_SCALE = factory.createScale(NAMESPACE+"fahrenheit","Fahrenheit temperature scale",null,KELVIN_SCALE,-459.67,1.8,FAHRENHEIT);
    }

    /**
     * Returns all units in this set.
     *
     * @return All units.
     */
    @Override
    public Set<Unit> getAllUnits() {
        Set<Unit> units = new HashSet<>();
        units.add(METRE);
        units.add(KILOMETRE);
        units.add(DECIMETRE);
        units.add(CENTIMETRE);
        units.add(MILLIMETRE);
        units.add(MICROMETRE);
        units.add(NANOMETRE);
        units.add(ANGSTROM);
        units.add(INCH);
        units.add(FEET);
        units.add(YARD);
        units.add(MILE);
        units.add(NAUTICAL_MILE);
        units.add(FATHOM);
        units.add(GRAM);
        units.add(KILOGRAM);
        units.add(MILLIGRAM);
        units.add(MICROGRAM);
        units.add(SECOND);
        units.add(MILLISECOND);
        units.add(MICROSECOND);
        units.add(NANOSECOND);
        units.add(MINUTE);
        units.add(HOUR);
        units.add(YEAR);
        units.add(DAY);
        units.add(AMPERE);
        units.add(KELVIN);
        units.add(CELSIUS);
        units.add(FAHRENHEIT);
        units.add(MOLE);
        units.add(CANDELA);
        units.add(SQUARE_METRE);
        units.add(SQUARE_KILOMETRE);
        units.add(HECTARE);
        units.add(SQUARE_MILE);
        units.add(SQUARE_FEET);
        units.add(ACRE);
        units.add(CUBIC_METRE);
        units.add(LITRE);
        units.add(MILLILITRE);
        units.add(PINT_IMPERIAL);
        units.add(GALLON_IMPERIAL);
        units.add(CUP);
        units.add(TEASPOON);
        units.add(TABLESPOON);
        units.add(RADIAN);
        units.add(DEGREE);
        units.add(STERADIAN);
        units.add(HERTZ);
        units.add(METRE_PER_SECOND);
        units.add(KILOMETRE_PER_SECOND);
        units.add(KILOMETRE_PER_HOUR);
        units.add(MILE_PER_HOUR);
        units.add(KNOT);
        units.add(METRE_PER_SECOND_SQUARED);
        units.add(NEWTON);
        units.add(NEWTON_PER_SQUARE_METRE);
        units.add(PASCAL);
        units.add(ATMOSPHERE);
        units.add(BAR);
        units.add(MILLIBAR);
        units.add(PSI);
        units.add(JOULE);
        units.add(CALORIE);
        units.add(KILOCALORIE);
        units.add(WATT);
        units.add(COULOMB);
        units.add(VOLT);
        units.add(FARAD);
        units.add(OHM);
        units.add(SIEMENS);
        units.add(WEBER);
        units.add(TESLA);
        units.add(HENRY);
        units.add(LUMEN);
        units.add(LUX);
        units.add(BECQUEREL);
        units.add(GRAY);
        units.add(SIEVERT);
        units.add(KATAL);
        return units;
    }

    /**
     * Returns all measurement scales in this set.
     *
     * @return All scales.
     */
    @Override
    public Set<Scale> getAllScales() {
        Set<Scale> scales = new HashSet<>();
        scales.add(KELVIN_SCALE);
        scales.add(CELSIUS_SCALE);
        scales.add(FAHRENHEIT_SCALE);
        return scales;
    }
}