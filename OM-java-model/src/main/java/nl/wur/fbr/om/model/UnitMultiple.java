package nl.wur.fbr.om.model;

/**
 * Created by Don Willems on 14/07/15.
 */
public interface UnitMultiple extends Unit {

    /**
     * The singular unit that is prefixed.
     * For instance, the unit km has a base unit of m.
     * @return The base unit.
     */
    public SingularUnit getBaseUnit();

    /**
     * Returns the value with which measures need to be multiplied when converting to this prefixed unit and its
     * base unit.
     * For instance, the unit km has a prefix factor of 1000.
     * @return The prefix factor.
     */
    public double getPrefixFactor();
}
