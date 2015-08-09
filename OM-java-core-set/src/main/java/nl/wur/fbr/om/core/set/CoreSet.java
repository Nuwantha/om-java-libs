package nl.wur.fbr.om.core.set;

import nl.wur.fbr.om.core.impl.scales.ScaleImpl;
import nl.wur.fbr.om.core.impl.units.*;
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
public class CoreSet implements UnitAndScaleSet {

    /** The namespace of the core unit set.*/
    public final static String NAMESPACE;

    /** The identifier in the core unit set for the SI base unit of length Metre.*/
    public final static Unit METRE;

    /** The identifier in the core unit set for the prefixed unit of length Kilometre.*/
    public final static Unit KILOMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Decimetre.*/
    public final static Unit DECIMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Centimetre.*/
    public final static Unit CENTIMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Millimetre.*/
    public final static Unit MILLIMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Micrometre.*/
    public final static Unit MICROMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Nanometre.*/
    public final static Unit NANOMETRE;

    /** The identifier in the core unit set for the unit of length Ångström.*/
    public final static Unit ANGSTROM;

    /** The identifier in the core unit set for the unit of length Inch.*/
    public final static Unit INCH;

    /** The identifier in the core unit set for the unit of length Feet.*/
    public final static Unit FEET;

    /** The identifier in the core unit set for the unit of length Yard.*/
    public final static Unit YARD;

    /** The identifier in the core unit set for the unit of length Mile.*/
    public final static Unit MILE;

    /** The identifier in the core unit set for the unit of length Nautical mile.*/
    public final static Unit NAUTICAL_MILE;

    /** The identifier in the core unit set for the unit of length Fathom.*/
    public final static Unit FATHOM;



    /** The identifier in the core unit set for the unit of mass Gram.*/
    public final static Unit GRAM;

    /** The identifier in the core unit set for the SI unit of mass Kilogram.*/
    public final static Unit KILOGRAM;

    /** The identifier in the core unit set for the prefixed unit of mass Milligram.*/
    public final static Unit MILLIGRAM;

    /** The identifier in the core unit set for the prefixed unit of mass Microgram.*/
    public final static Unit MICROGRAM;



    /** The identifier in the core unit set for the SI unit of time Second.*/
    public final static Unit SECOND;

    /** The identifier in the core unit set for the prefixed unit of time Millisecond.*/
    public final static Unit MILLISECOND;

    /** The identifier in the core unit set for the prefixed unit of time Microsecond.*/
    public final static Unit MICROSECOND;

    /** The identifier in the core unit set for the prefixed unit of time Nanosecond.*/
    public final static Unit NANOSECOND;

    /** The identifier in the core unit set for the unit of time Minute.*/
    public final static Unit MINUTE;

    /** The identifier in the core unit set for the unit of time Hour.*/
    public final static Unit HOUR;

    /** The identifier in the core unit set for the unit of time Year.*/
    public final static Unit YEAR;

    /** The identifier in the core unit set for the unit of time Day.*/
    public final static Unit DAY;



    /** The identifier in the core unit set for the SI unit of electical current Ampere.*/
    public final static Unit AMPERE;



    /** The identifier in the core unit set for the SI unit of temperature Kelvin.*/
    public final static Unit KELVIN;

    /** The identifier in the core unit set for the unit of temperature Celsius.*/
    public final static Unit CELSIUS;

    /** The identifier in the core unit set for the unit of temperature Fahrenheit.*/
    public final static Unit FAHRENHEIT;

    /** The identifier in the core unit set for the SI unit of ammount of substance Mole.*/
    public final static Unit MOLE;



    /** The identifier in the core unit set for the SI unit of luminous intensity Candela.*/
    public final static Unit CANDELA;



    /** The identifier in the core unit set for the unit of area Square metre.*/
    public final static Unit SQUARE_METRE;

    /** The identifier in the core unit set for the unit of area Square kilometre.*/
    public final static Unit SQUARE_KILOMETRE;

    /** The identifier in the core unit set for the unit of area Hectare.*/
    public final static Unit HECTARE;

    /** The identifier in the core unit set for the unit of area Square mile.*/
    public final static Unit SQUARE_MILE;

    /** The identifier in the core unit set for the unit of area Square feet.*/
    public final static Unit SQUARE_FEET;

    /** The identifier in the core unit set for the unit of area Acre.*/
    public final static Unit ACRE;



    /** The identifier in the core unit set for the unit of volume Cubic metre.*/
    public final static Unit CUBIC_METRE;

    /** The identifier in the core unit set for the unit of volume Litre.*/
    public final static Unit LITRE;

    /** The identifier in the core unit set for the unit of volume Millilitre.*/
    public final static Unit MILLILITRE;

    /** The identifier in the core unit set for the imperial unit of volume Pint.*/
    public final static Unit PINT_IMPERIAL;

    /** The identifier in the core unit set for the imperial unit of volume Gallon.*/
    public final static Unit GALLON_IMPERIAL;

    /** The identifier in the core unit set for the unit of volume Cup.*/
    public final static Unit CUP;

    /** The identifier in the core unit set for the unit of volume Teaspoon.*/
    public final static Unit TEASPOON;

    /** The identifier in the core unit set for the unit of volume Tablespoon.*/
    public final static Unit TABLESPOON;



    /** The identifier in the core unit set for the SI unit of angle Radian.*/
    public final static Unit RADIAN;

    /** The identifier in the core unit set for the unit of angle Degree.*/
    public final static Unit DEGREE;



    /** The identifier in the core unit set for the SI unit of solid angle Steradian.*/
    public final static Unit STERADIAN;



    /** The identifier in the core unit set for the unit of frequency Hertz.*/
    public final static Unit HERTZ;



    /** The identifier in the core unit set for the unit of velocity Metre per second.*/
    public final static Unit METRE_PER_SECOND;

    /** The identifier in the core unit set for the unit of velocity Kilometre per second.*/
    public final static Unit KILOMETRE_PER_SECOND;

    /** The identifier in the core unit set for the unit of velocity Kilometre per hour.*/
    public final static Unit KILOMETRE_PER_HOUR;

    /** The identifier in the core unit set for the unit of velocity Mile per hour.*/
    public final static Unit MILE_PER_HOUR;

    /** The identifier in the core unit set for the unit of velocity Knot.*/
    public final static Unit KNOT;



    /** The identifier in the core unit set for the unit of acceleration Metre per second squared.*/
    public final static Unit METRE_PER_SECOND_SQUARED;



    /** The identifier in the core unit set for the unit of force Newton.*/
    public final static Unit NEWTON;



    /** The identifier in the core unit set for the unit of pressure Newton per square metre.*/
    public final static Unit NEWTON_PER_SQUARE_METRE;

    /** The identifier in the core unit set for the unit of pressure Pascal.*/
    public final static Unit PASCAL;

    /** The identifier in the core unit set for the unit of pressure Atmosphere.*/
    public final static Unit ATMOSPHERE;

    /** The identifier in the core unit set for the unit of pressure Bar.*/
    public final static Unit BAR;

    /** The identifier in the core unit set for the prefixed unit of pressure Millibar.*/
    public final static Unit MILLIBAR;

    /** The identifier in the core unit set for the unit of pressure Pound per square inch.*/
    public final static Unit PSI;



    /** The identifier in the core unit set for the unit of energy Joule.*/
    public final static Unit JOULE;

    /** The identifier in the core unit set for the unit of energy Calorie.*/
    public final static Unit CALORIE;

    /** The identifier in the core unit set for the unit of energy Kilocalorie.*/
    public final static Unit KILOCALORIE;



    /** The identifier in the core unit set for the unit of power Watt.*/
    public final static Unit WATT;



    /** The identifier in the core unit set for the unit of electric charge Coulomb.*/
    public final static Unit COULOMB;

    /** The identifier in the core unit set for the unit of voltage Volt.*/
    public final static Unit VOLT;

    /** The identifier in the core unit set for the unit of electric capacitance Farad.*/
    public final static Unit FARAD;

    /** The identifier in the core unit set for the unit of electric resistance Ohm.*/
    public final static Unit OHM;

    /** The identifier in the core unit set for the unit of electrical conductance Siemens.*/
    public final static Unit SIEMENS;



    /** The identifier in the core unit set for the unit of magnetic flux Weber.*/
    public final static Unit WEBER;

    /** The identifier in the core unit set for the unit of magnetic field strength Tesla.*/
    public final static Unit TESLA;

    /** The identifier in the core unit set for the unit of inductance Henry.*/
    public final static Unit HENRY;



    /** The identifier in the core unit set for the unit of luminous flux Lumen.*/
    public final static Unit LUMEN;

    /** The identifier in the core unit set for the unit of illuminance Lux.*/
    public final static Unit LUX;



    /** The identifier in the core unit set for the unit of radioactivity Becquerel.*/
    public final static Unit BECQUEREL;

    /** The identifier in the core unit set for the unit of absorbed dose of ionising radiation Gray.*/
    public final static Unit GRAY;

    /** The identifier in the core unit set for the unit of equivalent dose of ionising radiation Sievert.*/
    public final static Unit SIEVERT;



    /** The identifier in the core unit set for the unit of catalitic activity Katal.*/
    public final static Unit KATAL;


    /** The identifier for the Kelvin temperature scale.*/
    public final static Scale KELVIN_SCALE;

    /** The identifier for the Celsius temperature scale.*/
    public final static Scale CELSIUS_SCALE;

    /** The identifier for the Fahrenheit temperature scale.*/
    public final static Scale FAHRENHEIT_SCALE;



    static {
        NAMESPACE = "nl.wur.fbr.om.core.set.unit.";
        METRE = new BaseUnitImpl(NAMESPACE+"metre", "metre", "m", SIBaseDimension.LENGTH);
        KILOMETRE = new PrefixedUnitImpl(NAMESPACE+"kilometre","kilometre", "km", (SingularUnit)METRE, DecimalPrefix.KILO);
        CENTIMETRE = new PrefixedUnitImpl(NAMESPACE+"centimetre", "centimetre", "cm", (SingularUnit) METRE, DecimalPrefix.CENTI);
        DECIMETRE = new PrefixedUnitImpl(NAMESPACE+"decimetre", "decimetre", "dm", (SingularUnit) METRE, DecimalPrefix.DECI);
        MILLIMETRE = new PrefixedUnitImpl(NAMESPACE+"millimetre", "millimetre", "mm", (SingularUnit) METRE, DecimalPrefix.MILLI);
        MICROMETRE = new PrefixedUnitImpl(NAMESPACE+"micrometre", "micrometre", "μm", (SingularUnit) METRE, DecimalPrefix.MICRO);
        NANOMETRE = new PrefixedUnitImpl(NAMESPACE+"nanometre", "nanometre", "nm", (SingularUnit) METRE, DecimalPrefix.NANO);
        ANGSTROM = new SingularUnitImpl(NAMESPACE+"angstrom", "Ångström", "Å", METRE, 1e-10);
        INCH =  new SingularUnitImpl(NAMESPACE+"inch","inch", "in", METRE, 0.0254);
        FEET =  new SingularUnitImpl(NAMESPACE+"feet","feet", "ft", METRE, 0.3048);
        YARD =  new SingularUnitImpl(NAMESPACE+"yard","yard", "yd", METRE, 0.9144);
        MILE =  new SingularUnitImpl(NAMESPACE+"mile","mile", "mi", METRE, 1609.344);
        NAUTICAL_MILE =  new SingularUnitImpl(NAMESPACE+"nauticalmile","nautical mile", "M", METRE, 1853.184);
        FATHOM =  new SingularUnitImpl(NAMESPACE+"fathom","fathom", null, FEET, 6);

        GRAM = new SingularUnitImpl(NAMESPACE+"gram","gram","g");
        KILOGRAM = new PrefixedBaseUnitImpl(NAMESPACE+"kilogram","kilogram","kg",(SingularUnit)GRAM,DecimalPrefix.KILO,SIBaseDimension.MASS);
        MILLIGRAM = new PrefixedUnitImpl(NAMESPACE+"milligram", "milligram", "mg", (SingularUnit) GRAM, DecimalPrefix.MILLI);
        MICROGRAM = new PrefixedUnitImpl(NAMESPACE+"microgram", "microgram", "μg", (SingularUnit) GRAM, DecimalPrefix.MICRO);

        SECOND = new BaseUnitImpl(NAMESPACE+"second","second","s",SIBaseDimension.TIME);
        MILLISECOND = new PrefixedUnitImpl(NAMESPACE+"millisecond","millisecond","ms",(SingularUnit)SECOND,DecimalPrefix.MILLI);
        MICROSECOND = new PrefixedUnitImpl(NAMESPACE+"microsecond","microsecond","μs",(SingularUnit)SECOND,DecimalPrefix.MICRO);
        NANOSECOND = new PrefixedUnitImpl(NAMESPACE+"nanosecond","nanosecond","ns",(SingularUnit)SECOND,DecimalPrefix.NANO);
        MINUTE = new SingularUnitImpl(NAMESPACE+"minute","minute","m",SECOND,60);
        HOUR = new SingularUnitImpl(NAMESPACE+"hour","hour","h",SECOND,3600);
        DAY = new SingularUnitImpl(NAMESPACE+"day","day","d",SECOND,86400);
        YEAR = new SingularUnitImpl(NAMESPACE+"year","year","yr",SECOND,31556925.9747);

        AMPERE = new BaseUnitImpl(NAMESPACE+"ampere", "ampere", "A",SIBaseDimension.ELECTRIC_CURRENT);

        KELVIN = new BaseUnitImpl(NAMESPACE+"kelvin", "kelvin", "K", SIBaseDimension.THERMODYNAMIC_TEMPERATURE);
        CELSIUS = new SingularUnitImpl(NAMESPACE+"celsius", "celsius","°C",KELVIN);
        FAHRENHEIT = new SingularUnitImpl(NAMESPACE+"fahrenheit", "fahrenheit","°F",KELVIN,1.8);

        MOLE = new BaseUnitImpl(NAMESPACE+"mole", "mole", "mol", SIBaseDimension.AMOUNT_OF_SUBSTANCE);

        CANDELA = new BaseUnitImpl(NAMESPACE+"candela", "candela", "cd", SIBaseDimension.LUMINOUS_INTENSITY);

        SQUARE_METRE = new UnitExponentiationImpl(NAMESPACE+"squaremetre","square metre", "m^2", METRE, 2);
        SQUARE_KILOMETRE = new UnitExponentiationImpl(NAMESPACE+"squarekilometre","square kilometre", "km^2", KILOMETRE, 2);
        SQUARE_MILE = new UnitExponentiationImpl(NAMESPACE+"squaremile","square mile", "sq mi", MILE, 2);
        SQUARE_FEET = new UnitExponentiationImpl(NAMESPACE+"squarefeet","square feet", "sq ft", FEET, 2);
        HECTARE = new SingularUnitImpl(NAMESPACE+"hectare","hectare","ha",SQUARE_METRE,1e4);
        ACRE = new SingularUnitImpl(NAMESPACE+"acre","acre","ac",SQUARE_METRE,4046.856);

        CUBIC_METRE = new UnitExponentiationImpl(NAMESPACE+"cubicmetre","cubic metre", "m^3", METRE, 3);
        LITRE = new SingularUnitImpl(NAMESPACE+"litre","litre","l",CUBIC_METRE,1e-3);
        MILLILITRE = new PrefixedUnitImpl(NAMESPACE+"millilitre","millilitre","ml",(SingularUnit)LITRE,DecimalPrefix.MILLI);
        PINT_IMPERIAL = new SingularUnitImpl(NAMESPACE+"pintimperial","pint","pint",LITRE,0.56826125);
        GALLON_IMPERIAL = new SingularUnitImpl(NAMESPACE+"gallonimperial","gallon","gallon",LITRE,4.54609);
        CUP = new SingularUnitImpl(NAMESPACE+"cup","cup","cup",MILLILITRE,250);
        TABLESPOON = new SingularUnitImpl(NAMESPACE+"tablespoon","tablespoon", "Tbsp",MILLILITRE,15);
        TEASPOON = new SingularUnitImpl(NAMESPACE+"teaspoon","teaspoon", "tsp",MILLILITRE,5);

        RADIAN = new UnitMultiplicationImpl(NAMESPACE+"radian","radian", "rad", METRE, new UnitExponentiationImpl(METRE, -1));
        DEGREE = new SingularUnitImpl(NAMESPACE+"degree", "degree", "°", RADIAN, Math.PI / 180.);

        STERADIAN = new UnitMultiplicationImpl(NAMESPACE+"steradian","steradian", "sr", SQUARE_METRE, new UnitExponentiationImpl(METRE, -1));

        HERTZ = new UnitExponentiationImpl(NAMESPACE+"hertz", "Hertz", "Hz", SECOND, -1);

        METRE_PER_SECOND = new UnitDivisionImpl(NAMESPACE+"metrepersecond","metre per second", "m/s", METRE, SECOND);
        KILOMETRE_PER_SECOND = new UnitDivisionImpl(NAMESPACE+"kilometrepersecond","kilometre per second", "km/s", KILOMETRE, SECOND);
        KILOMETRE_PER_HOUR = new UnitDivisionImpl(NAMESPACE+"kilometreperhour","kilometre per hour", "km/h", KILOMETRE, HOUR);
        MILE_PER_HOUR = new UnitDivisionImpl(NAMESPACE+"mileperhour","mile per hour", "mi/h", MILE, HOUR);
        KNOT = new UnitDivisionImpl(NAMESPACE+"knot","knot", "kn", NAUTICAL_MILE, HOUR);

        METRE_PER_SECOND_SQUARED = new UnitDivisionImpl(NAMESPACE+"metrepersecondsquared","metre per second squares", "m/s^2", METRE, new UnitExponentiationImpl(SECOND,2));

        NEWTON = new UnitMultiplicationImpl(NAMESPACE+"newton", "newton", "N", KILOGRAM, METRE_PER_SECOND_SQUARED);

        NEWTON_PER_SQUARE_METRE = new UnitDivisionImpl(NAMESPACE+"newtonpersquaremetre","newton per metre squared", "N/m^2", NEWTON, SQUARE_METRE);
        PASCAL = new SingularUnitImpl(NAMESPACE+"pascal","pascal", "Pa", NEWTON_PER_SQUARE_METRE);
        BAR = new SingularUnitImpl(NAMESPACE+"bar","bar","bar",PASCAL,1e5);
        ATMOSPHERE = new SingularUnitImpl(NAMESPACE+"atmosphere","atmosphere", "atm", PASCAL, 1.01325e5);
        MILLIBAR = new PrefixedUnitImpl(NAMESPACE+"millibar","millibar", "mbar", (SingularUnit) BAR, DecimalPrefix.MILLI);
        PSI = new SingularUnitImpl(NAMESPACE+"psi","Pounds per square inch", "psi", PASCAL, 6894.757293168);

        JOULE = new UnitMultiplicationImpl(NAMESPACE+"joule","joule", "J", NEWTON, METRE);
        CALORIE = new SingularUnitImpl(NAMESPACE+"calorie","calorie", "cal", JOULE, 4.184);
        KILOCALORIE = new PrefixedUnitImpl(NAMESPACE+"kilocalorie","kilocalorie", "kcal", (SingularUnit) CALORIE, DecimalPrefix.KILO);

        WATT = new UnitDivisionImpl(NAMESPACE+"watt","watt", "W", JOULE, SECOND);

        COULOMB = new UnitMultiplicationImpl(NAMESPACE+"coulomb","coulomb", "C", SECOND, AMPERE);
        VOLT = new UnitDivisionImpl(NAMESPACE+"volt","volt", "V", WATT, AMPERE);
        FARAD = new UnitDivisionImpl(NAMESPACE+"farad","farad", "F", COULOMB, VOLT);
        OHM = new UnitDivisionImpl(NAMESPACE+"ohm", "Ω", VOLT, AMPERE);
        SIEMENS = new UnitDivisionImpl(NAMESPACE+"siemens","S", AMPERE, VOLT);

        WEBER = new UnitMultiplicationImpl(NAMESPACE+"weber","weber", "Wb", VOLT, SECOND);
        TESLA = new UnitDivisionImpl(NAMESPACE+"tesla","tesla", "T", WEBER, SQUARE_METRE);
        HENRY = new UnitDivisionImpl(NAMESPACE+"henry","henry", "H", WEBER, AMPERE);

        LUMEN = new UnitMultiplicationImpl(NAMESPACE+"lumen","lumen", "lm", CANDELA, STERADIAN);
        LUX  = new UnitDivisionImpl(NAMESPACE+"lux","lux", "lx", LUMEN, SQUARE_METRE);

        BECQUEREL = new UnitExponentiationImpl(NAMESPACE+"becquerel","becquerel", "Bq", SECOND, -1);
        GRAY = new UnitDivisionImpl(NAMESPACE+"gray","gray", "Gy", JOULE, KILOCALORIE);
        SIEVERT = new UnitDivisionImpl(NAMESPACE+"sievert","sievert", "Sv", JOULE, KILOCALORIE);

        KATAL = new UnitDivisionImpl(NAMESPACE+"katal","katal", "kat", MOLE, SECOND);

        KELVIN_SCALE = new ScaleImpl(NAMESPACE+"kelvinScale","Kelvin temperature scale",null,KELVIN);
        CELSIUS_SCALE = new ScaleImpl(NAMESPACE+"celsiusScale","Celsius temperature scale",null,KELVIN_SCALE,-273.15,1.0,CELSIUS);
        FAHRENHEIT_SCALE = new ScaleImpl(NAMESPACE+"fahrenheit","Fahrenheit temperature scale",null,KELVIN_SCALE,-459.67,1.8,FAHRENHEIT);
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