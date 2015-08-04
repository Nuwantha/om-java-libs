package nl.wur.fbr.om.core.set;

import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.model.dimensions.SIDimension;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.prefixes.DecimalPrefix;

/**
 * This is an extension of the {@link DefaultUnitAndScaleFactory} that includes
 * the core units and measurement scales. The Identifiers for these units and scales
 * are defined as static strings in the {@link nl.wur.fbr.om.core.set.CoreUnitSet} class.
 * Use these identifiers as parameter to {@link #getUnitOrScale(String)} to access the
 * core set of units and scales.
 *
 * @author Don Willems on 30/07/15.
 */
public class CoreUnitAndScaleFactory extends DefaultUnitAndScaleFactory {

    /**
     * Creates a new unit and scale factory and initialises all units and scales in the core set.
     */
    public CoreUnitAndScaleFactory(){
        // units
        Unit metre = this.createBaseUnit(CoreUnitSet.METRE, "metre", "m", SIDimension.LENGTH);
        Unit kilometre = this.createPrefixedUnit(CoreUnitSet.KILOMETRE,"kilometre", "km", (SingularUnit) metre, DecimalPrefix.KILO);
        this.createPrefixedUnit(CoreUnitSet.CENTIMETRE, "centimetre", "cm", (SingularUnit) metre, DecimalPrefix.CENTI);
        this.createPrefixedUnit(CoreUnitSet.DECIMETRE, "decimetre", "dm", (SingularUnit) metre, DecimalPrefix.DECI);
        this.createPrefixedUnit(CoreUnitSet.MILLIMETRE, "millimetre", "mm", (SingularUnit) metre, DecimalPrefix.MILLI);
        this.createPrefixedUnit(CoreUnitSet.MICROMETRE, "micrometre", "μm", (SingularUnit) metre, DecimalPrefix.MICRO);
        this.createPrefixedUnit(CoreUnitSet.NANOMETRE, "nanometre", "nm", (SingularUnit) metre, DecimalPrefix.NANO);
        this.createSingularUnit(CoreUnitSet.ANGSTROM, "Ångström", "Å", metre, 1e-10);
        this.createSingularUnit(CoreUnitSet.INCH, "inch", "in", metre, 0.0254);
        Unit feet = this.createSingularUnit(CoreUnitSet.FEET, "feet", "ft", metre, 0.3048);
        this.createSingularUnit(CoreUnitSet.YARD, "yard", "yd", metre, 0.9144);
        Unit mile = this.createSingularUnit(CoreUnitSet.MILE, "mile", "mi", metre, 1609.344);
        Unit nauticalMile = this.createSingularUnit(CoreUnitSet.NAUTICAL_MILE, "nautical mile", "M", metre, 1853.184);
        this.createSingularUnit(CoreUnitSet.FATHOM, "fathom", null, feet, 6);
        Unit gram = this.createSingularUnit(CoreUnitSet.GRAM, "gram", "g");
        Unit kilogram = this.createPrefixedBaseUnit(CoreUnitSet.KILOGRAM, "kilogram", SIDimension.MASS, (SingularUnit)gram, DecimalPrefix.KILO);
        this.createPrefixedUnit(CoreUnitSet.MILLIGRAM, "milligram", "mg", (SingularUnit) gram, DecimalPrefix.MILLI);
        this.createPrefixedUnit(CoreUnitSet.MICROGRAM, "microgram", "μg", (SingularUnit) gram, DecimalPrefix.MICRO);
        Unit second = this.createBaseUnit(CoreUnitSet.SECOND, "second", "s", SIDimension.TIME);
        this.createPrefixedUnit(CoreUnitSet.MILLISECOND, "millisecond", "ms", (SingularUnit) second, DecimalPrefix.MILLI);
        this.createPrefixedUnit(CoreUnitSet.MICROSECOND, "microsecond", "μs", (SingularUnit) second, DecimalPrefix.MICRO);
        this.createPrefixedUnit(CoreUnitSet.NANOSECOND, "nanosecond", "ns", (SingularUnit) second, DecimalPrefix.NANO);
        this.createSingularUnit(CoreUnitSet.MINUTE, "minute", "m", second, 60);
        Unit hour = this.createSingularUnit(CoreUnitSet.HOUR, "hour", "h", second, 3600);
        this.createSingularUnit(CoreUnitSet.DAY, "day", "d", second, 86400);
        this.createSingularUnit(CoreUnitSet.YEAR, "year", "yr", second, 31556925.9747);
        Unit ampere = this.createBaseUnit(CoreUnitSet.AMPERE, "ampere", "A",SIDimension.ELECTRIC_CURRENT);
        Unit kelvin = this.createBaseUnit(CoreUnitSet.KELVIN, "kelvin", "K", SIDimension.TEMPERATURE);
        Unit celsius = this.createSingularUnit(CoreUnitSet.CELSIUS,"celsius", "°C", kelvin);
        Unit fahrenheit = this.createSingularUnit(CoreUnitSet.FAHRENHEIT,"fahrenheit", "°F", kelvin, 1.8);
        Unit mole = this.createBaseUnit(CoreUnitSet.MOLE, "mole", "mol", SIDimension.AMOUNT);
        Unit candela = this.createBaseUnit(CoreUnitSet.CANDELA, "candela", "cd", SIDimension.LUMINOUS_INTENSITY);
        Unit squareMetre = this.createUnitExponentiation(CoreUnitSet.SQUARE_METRE,"square metre", "m^2", metre, 2);
        this.createUnitExponentiation(CoreUnitSet.SQUARE_KILOMETRE,"square kilometre", "km^2", kilometre, 2);
        this.createUnitExponentiation(CoreUnitSet.SQUARE_MILE,"square mile", "sq mi", mile, 2);
        this.createUnitExponentiation(CoreUnitSet.SQUARE_FEET, "square feet", "sq ft", feet, 2);
        this.createSingularUnit(CoreUnitSet.HECTARE,"hectare", "ha", squareMetre, 1e4);
        this.createSingularUnit(CoreUnitSet.ACRE,"acre", "ac", squareMetre, 4046.856);
        Unit cubicMetre = this.createUnitExponentiation(CoreUnitSet.CUBIC_METRE,"cubic metre", "m^3", metre, 3);
        Unit litre = this.createSingularUnit(CoreUnitSet.LITRE, "litre", "l", cubicMetre, 1e-3);
        Unit millilitre = this.createPrefixedUnit(CoreUnitSet.MILLILITRE, "millilitre", "ml", (SingularUnit) litre, DecimalPrefix.MILLI);
        this.createSingularUnit(CoreUnitSet.PINT_IMPERIAL, "pint", "pint", litre, 0.56826125);
        this.createSingularUnit(CoreUnitSet.GALLON_IMPERIAL, "gallon", "gallon", litre, 4.54609);
        this.createSingularUnit(CoreUnitSet.CUP,"cup", "cup", millilitre, 250);
        this.createSingularUnit(CoreUnitSet.TABLESPOON,"tablespoon", "Tbsp", millilitre, 15);
        this.createSingularUnit(CoreUnitSet.TEASPOON, "teaspoon", "tsp", millilitre, 5);
        Unit radian = this.createUnitMultiplication(CoreUnitSet.RADIAN,"radian", "rad", metre, this.createUnitExponentiation(metre, -1));
        this.createSingularUnit(CoreUnitSet.DEGREE, "degree", "°", radian, Math.PI / 180.);
        Unit steradian = this.createUnitMultiplication(CoreUnitSet.STERADIAN, "steradian", "sr", squareMetre, this.createUnitExponentiation(metre, -1));
        this.createUnitExponentiation(CoreUnitSet.HERTZ, "Hertz", "Hz", second, -1);
        this.createUnitDivision(CoreUnitSet.METRE_PER_SECOND,"metre per second", "m/s", metre, second);
        this.createUnitDivision(CoreUnitSet.KILOMETRE_PER_SECOND,"kilometre per second", "km/s", kilometre, second);
        this.createUnitDivision(CoreUnitSet.KILOMETRE_PER_HOUR,"kilometre per hour", "km/h", kilometre, hour);
        this.createUnitDivision(CoreUnitSet.MILE_PER_HOUR,"mile per hour", "mi/h", mile, hour);
        this.createUnitDivision(CoreUnitSet.KNOT,"knot", "kn", nauticalMile, hour);
        Unit metrePerSecondSquared = this.createUnitDivision(CoreUnitSet.METRE_PER_SECOND_SQUARED,"metre per second squared", "m/s^2", metre, this.createUnitExponentiation(second, 2));
        Unit newton = this.createUnitMultiplication(CoreUnitSet.NEWTON, "newton", "N", kilogram, metrePerSecondSquared);
        Unit newtonPerSquareMetre = this.createUnitDivision(CoreUnitSet.NEWTON_PER_SQUARE_METRE, "newton per metre squared", "N/m^2", newton, squareMetre);
        Unit pascal = this.createSingularUnit(CoreUnitSet.PASCAL, "pascal", "Pa", newtonPerSquareMetre);
        Unit bar = this.createSingularUnit(CoreUnitSet.BAR,"bar","bar",pascal,1e5);
        this.createSingularUnit(CoreUnitSet.ATMOSPHERE, "atmosphere", "atm", pascal, 1.01325e5);
        this.createPrefixedUnit(CoreUnitSet.MILLIBAR, "millibar", "mbar", (SingularUnit) bar, DecimalPrefix.MILLI);
        this.createSingularUnit(CoreUnitSet.PSI, "Pounds per square inch", "psi", pascal, 6894.757293168);
        Unit joule = this.createUnitMultiplication(CoreUnitSet.JOULE,"joule", "J", newton, metre);
        Unit calorie = this.createSingularUnit(CoreUnitSet.CALORIE,"calorie", "cal", joule, 4.184);
        this.createPrefixedUnit(CoreUnitSet.KILOCALORIE, "kilocalorie", "kcal", (SingularUnit) calorie, DecimalPrefix.KILO);
        Unit watt = this.createUnitDivision(CoreUnitSet.WATT,"watt", "W", joule, second);
        Unit coulomb = this.createUnitMultiplication(CoreUnitSet.COULOMB,"coulomb", "C", second, ampere);
        Unit volt = this.createUnitDivision(CoreUnitSet.VOLT,"volt", "V", watt, ampere);
        this.createUnitDivision(CoreUnitSet.FARAD,"farad", "F", coulomb, volt);
        this.createUnitDivision(CoreUnitSet.OHM,"ohm", "Ω", volt, ampere);
        this.createUnitDivision(CoreUnitSet.SIEMENS,"siemens", "S", ampere, volt);
        Unit weber = this.createUnitMultiplication(CoreUnitSet.WEBER,"weber", "Wb", volt, second);
        this.createUnitDivision(CoreUnitSet.TESLA,"tesla", "T", weber, squareMetre);
        this.createUnitDivision(CoreUnitSet.HENRY,"henry", "H", weber, ampere);
        Unit lumen = this.createUnitMultiplication(CoreUnitSet.LUMEN,"lumen", "lm", candela, steradian);
        this.createUnitDivision(CoreUnitSet.LUX,"lux", "lx", lumen, squareMetre);
        this.createUnitExponentiation(CoreUnitSet.BECQUEREL,"becquerel", "Bq", second, -1);
        this.createUnitDivision(CoreUnitSet.GRAY,"gray", "Gy", joule, kilogram);
        this.createUnitDivision(CoreUnitSet.SIEVERT,"sievert", "Sv", joule, kilogram);
        this.createUnitDivision(CoreUnitSet.KATAL,"katal", "kat", mole, second);

        // scales
        Scale kelvinScale = this.createScale(CoreScaleSet.KELVIN,"Kelvin temperature scale",null,kelvin);
        this.createScale(CoreScaleSet.CELSIUS,"Celsius temperature scale",null,kelvinScale,-273.15,1.0,celsius);
        this.createScale(CoreScaleSet.FAHRENHEIT,"Fahrenheit temperature scale",null,kelvinScale,-459.67,1.8,fahrenheit);
    }

    /**
     * Returns the Unit or Scale identified by the specified identifier. <br>
     * If the Unit or Scale with the same identifier has been created previously, this method should return the
     * same instance. All core units and scales with the identifiers defined in
     * {@link CoreUnitSet} are created during initialisation of this factory and should be available.
     *
     * If the Unit or Scale has not been created previously, this method should create the
     * unit or scale and set the identifier of the unit or scale to the specified identifier.
     * If the data for creating a new instance is not available, e.g. is not part of the core set, or the identifier does not
     * represent a unit or scale, this method will throw a {@link UnitOrScaleCreationException}.
     * @param identifier The identifier of the unit or scale.
     * @return The unit or scale identified by the specified identifier.
     * @throws UnitOrScaleCreationException When the unit could not be created from the specified identifier.
     */
    @Override
    public Object getUnitOrScale(String identifier) throws UnitOrScaleCreationException {
        return super.getUnitOrScale(identifier);
    }
}
