package nl.wur.fbr.om.core.set;

/**
 * This class contains the identifier for the core set of units. All SI base and derived units are included in this set.
 * Other frequently used units that are not part of the SI set are also included.
 *
 * @author Don Willems on 29/07/15.
 */
public abstract class CoreUnitSet {

    /** The namespace of the core unit set.*/
    public final static String NAMESPACE;

    /** The identifier in the core unit set for the SI base unit of length Metre.*/
    public final static String METRE;

    /** The identifier in the core unit set for the prefixed unit of length Kilometre.*/
    public final static String KILOMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Decimetre.*/
    public final static String DECIMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Centimetre.*/
    public final static String CENTIMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Millimetre.*/
    public final static String MILLIMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Micrometre.*/
    public final static String MICROMETRE;

    /** The identifier in the core unit set for the prefixed unit of length Nanometre.*/
    public final static String NANOMETRE;

    /** The identifier in the core unit set for the unit of length Ångström.*/
    public final static String ANGSTROM;

    /** The identifier in the core unit set for the unit of length Inch.*/
    public final static String INCH;

    /** The identifier in the core unit set for the unit of length Feet.*/
    public final static String FEET;

    /** The identifier in the core unit set for the unit of length Yard.*/
    public final static String YARD;

    /** The identifier in the core unit set for the unit of length Mile.*/
    public final static String MILE;

    /** The identifier in the core unit set for the unit of length Nautical mile.*/
    public final static String NAUTICAL_MILE;

    /** The identifier in the core unit set for the unit of length Fathom.*/
    public final static String FATHOM;



    /** The identifier in the core unit set for the unit of mass Gram.*/
    public final static String GRAM;

    /** The identifier in the core unit set for the SI unit of mass Kilogram.*/
    public final static String KILOGRAM;

    /** The identifier in the core unit set for the prefixed unit of mass Milligram.*/
    public final static String MILLIGRAM;

    /** The identifier in the core unit set for the prefixed unit of mass Microgram.*/
    public final static String MICROGRAM;



    /** The identifier in the core unit set for the SI unit of time Second.*/
    public final static String SECOND;

    /** The identifier in the core unit set for the prefixed unit of time Millisecond.*/
    public final static String MILLISECOND;

    /** The identifier in the core unit set for the prefixed unit of time Microsecond.*/
    public final static String MICROSECOND;

    /** The identifier in the core unit set for the prefixed unit of time Nanosecond.*/
    public final static String NANOSECOND;

    /** The identifier in the core unit set for the unit of time Minute.*/
    public final static String MINUTE;

    /** The identifier in the core unit set for the unit of time Hour.*/
    public final static String HOUR;

    /** The identifier in the core unit set for the unit of time Year.*/
    public final static String YEAR;

    /** The identifier in the core unit set for the unit of time Day.*/
    public final static String DAY;



    /** The identifier in the core unit set for the SI unit of electical current Ampere.*/
    public final static String AMPERE;



    /** The identifier in the core unit set for the SI unit of temperature Kelvin.*/
    public final static String KELVIN;

    /** The identifier in the core unit set for the unit of temperature Celsius.*/
    public final static String CELSIUS;

    /** The identifier in the core unit set for the unit of temperature Fahrenheit.*/
    public final static String FAHRENHEIT;

    /** The identifier in the core unit set for the SI unit of ammount of substance Mole.*/
    public final static String MOLE;



    /** The identifier in the core unit set for the SI unit of luminous intensity Candela.*/
    public final static String CANDELA;



    /** The identifier in the core unit set for the unit of area Square metre.*/
    public final static String SQUARE_METRE;

    /** The identifier in the core unit set for the unit of area Square kilometre.*/
    public final static String SQUARE_KILOMETRE;

    /** The identifier in the core unit set for the unit of area Hectare.*/
    public final static String HECTARE;

    /** The identifier in the core unit set for the unit of area Square mile.*/
    public final static String SQUARE_MILE;

    /** The identifier in the core unit set for the unit of area Square feet.*/
    public final static String SQUARE_FEET;

    /** The identifier in the core unit set for the unit of area Acre.*/
    public final static String ACRE;



    /** The identifier in the core unit set for the unit of volume Cubic metre.*/
    public final static String CUBIC_METRE;

    /** The identifier in the core unit set for the unit of volume Litre.*/
    public final static String LITRE;

    /** The identifier in the core unit set for the unit of volume Millilitre.*/
    public final static String MILLILITRE;

    /** The identifier in the core unit set for the imperial unit of volume Pint.*/
    public final static String PINT_IMPERIAL;

    /** The identifier in the core unit set for the imperial unit of volume Gallon.*/
    public final static String GALLON_IMPERIAL;

    /** The identifier in the core unit set for the unit of volume Cup.*/
    public final static String CUP;

    /** The identifier in the core unit set for the unit of volume Teaspoon.*/
    public final static String TEASPOON;

    /** The identifier in the core unit set for the unit of volume Tablespoon.*/
    public final static String TABLESPOON;



    /** The identifier in the core unit set for the SI unit of angle Radian.*/
    public final static String RADIAN;

    /** The identifier in the core unit set for the unit of angle Degree.*/
    public final static String DEGREE;



    /** The identifier in the core unit set for the SI unit of solid angle Steradian.*/
    public final static String STERADIAN;



    /** The identifier in the core unit set for the unit of frequency Hertz.*/
    public final static String HERTZ;



    /** The identifier in the core unit set for the unit of velocity Metre per second.*/
    public final static String METRE_PER_SECOND;

    /** The identifier in the core unit set for the unit of velocity Kilometre per second.*/
    public final static String KILOMETRE_PER_SECOND;

    /** The identifier in the core unit set for the unit of velocity Kilometre per hour.*/
    public final static String KILOMETRE_PER_HOUR;

    /** The identifier in the core unit set for the unit of velocity Mile per hour.*/
    public final static String MILE_PER_HOUR;

    /** The identifier in the core unit set for the unit of velocity Knot.*/
    public final static String KNOT;



    /** The identifier in the core unit set for the unit of acceleration Metre per second squared.*/
    public final static String METRE_PER_SECOND_SQUARED;



    /** The identifier in the core unit set for the unit of force Newton.*/
    public final static String NEWTON;



    /** The identifier in the core unit set for the unit of pressure Newton per square metre.*/
    public final static String NEWTON_PER_SQUARE_METRE;

    /** The identifier in the core unit set for the unit of pressure Pascal.*/
    public final static String PASCAL;

    /** The identifier in the core unit set for the unit of pressure Atmosphere.*/
    public final static String ATMOSPHERE;

    /** The identifier in the core unit set for the unit of pressure Bar.*/
    public final static String BAR;

    /** The identifier in the core unit set for the prefixed unit of pressure Millibar.*/
    public final static String MILLIBAR;

    /** The identifier in the core unit set for the unit of pressure Pound per square inch.*/
    public final static String PSI;



    /** The identifier in the core unit set for the unit of energy Joule.*/
    public final static String JOULE;

    /** The identifier in the core unit set for the unit of energy Calorie.*/
    public final static String CALORIE;

    /** The identifier in the core unit set for the unit of energy Kilocalorie.*/
    public final static String KILOCALORIE;



    /** The identifier in the core unit set for the unit of power Watt.*/
    public final static String WATT;



    /** The identifier in the core unit set for the unit of electric charge Coulomb.*/
    public final static String COULOMB;

    /** The identifier in the core unit set for the unit of voltage Volt.*/
    public final static String VOLT;

    /** The identifier in the core unit set for the unit of electric capacitance Farad.*/
    public final static String FARAD;

    /** The identifier in the core unit set for the unit of electric resistance Ohm.*/
    public final static String OHM;

    /** The identifier in the core unit set for the unit of electrical conductance Siemens.*/
    public final static String SIEMENS;



    /** The identifier in the core unit set for the unit of magnetic flux Weber.*/
    public final static String WEBER;

    /** The identifier in the core unit set for the unit of magnetic field strength Tesla.*/
    public final static String TESLA;

    /** The identifier in the core unit set for the unit of inductance Henry.*/
    public final static String HENRY;



    /** The identifier in the core unit set for the unit of luminous flux Lumen.*/
    public final static String LUMEN;

    /** The identifier in the core unit set for the unit of illuminance Lux.*/
    public final static String LUX;



    /** The identifier in the core unit set for the unit of radioactivity Becquerel.*/
    public final static String BECQUEREL;

    /** The identifier in the core unit set for the unit of absorbed dose of ionising radiation Gray.*/
    public final static String GRAY;

    /** The identifier in the core unit set for the unit of equivalent dose of ionising radiation Sievert.*/
    public final static String SIEVERT;



    /** The identifier in the core unit set for the unit of catalitic activity Katal.*/
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
}