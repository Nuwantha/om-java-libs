package nl.wur.fbr.om.model;

/**
 * A compound unit that is the division of two other units. For instance, the unit used for denstiy kilogram per
 * cubic metre is a unit division of the numerator kilogram and the denominator cubic metre.
 * @author Don Willems on 14/07/15.
 */
public interface UnitDivision extends Unit {

    /**
     * The Unit used in the numerator of the compound unit.
     * For instance, for the unit kg/m^3, the numerator unit is kg.
     * @return The numerator.
     */
    public Unit getNumerator();


    /**
     * The Unit used in the denominator of the compound unit.
     * For instance, for the unit kg/m^3, the denominator unit is m^3.
     * @return The denominator.
     */
    public Unit getDenominator();
}
