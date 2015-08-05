package nl.wur.fbr.om.model.units;

/**
 * A unit that is defined as an exponentiation of a base unit.
 * For instance, the unit exponentiation cubic metre (m^3) is the exponentiation (with exponent 3) of the base unit
 * metre.
 *
 * @author Don Willems on 14/07/15.
 */
public interface UnitExponentiation extends Unit {

    /**
     * Returns the base unit of the compound unit.
     * For instance, for the unit m^3, the base unit is m.
     * @return The base unit.
     */
    public Unit getBase();

    /**
     * Returns the exponent of the unit exponentiation.
     * For instance, for the unit m^3, the exponent is 3.
     * @return The exponent.
     */
    public double getExponent();
}
