package nl.wur.fbr.om.model;

/**
 * Unit multiplication is a compound unit consisting of two base units that are multiplied.
 * For instance, the unit Newton metre (N.m) is a multiplication of Newton (N) and metre (m).
 *
 * @author Don Willems on 14/07/15.
 */
public interface UnitMultiplication extends Unit{

    /**
     * Returns the first unit used in the unit multiplication.
     * The order (first and second) does not matter.
     * For instance, for the unit multiplication N.m, the first unit is N.
     * @return The first unit in the multiplication.
     */
    public Unit getUnit1();

    /**
     * Returns the second unit used in the unit multiplication.
     * The order (first and second) does not matter.
     * For instance, for the unit multiplication N.m, the second unit is m.
     * @return The second unit in the multiplication.
     */
    public Unit getUnit2();
}
