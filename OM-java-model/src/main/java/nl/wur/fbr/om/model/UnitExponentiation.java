package nl.wur.fbr.om.model;

/**
 * Created by Don Willems on 14/07/15.
 */
public interface UnitExponentiation extends Unit {

    /**
     * Returns the base unit of the complex unit.
     * For instance, for the unit m^3, the base unit is m.
     * @return The base unit.
     */
    public Unit getBaseUnit();

    /**
     * Returns the exponent of the unit exponentiation.
     * For instance, for the unit m^3, the exponent is 3.
     * @return The exponent.
     */
    public double getExponent();
}
