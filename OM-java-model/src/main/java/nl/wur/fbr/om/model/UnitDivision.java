package nl.wur.fbr.om.model;

/**
 * Created by Don Willems on 14/07/15.
 */
public interface UnitDivision extends Unit {

    /**
     * The Unit used in the numerator of the complex unit.
     * For instance, for the unit kg/m^3, the numerator unit is kg.
     * @return The numerator.
     */
    public Unit getNumerator();


    /**
     * The Unit used in the denominator of the complex unit.
     * For instance, for the unit kg/m^3, the denominator unit is m^3.
     * @return The denominator.
     */
    public Unit getDenominator();
}
