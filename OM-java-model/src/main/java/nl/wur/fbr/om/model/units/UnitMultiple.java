package nl.wur.fbr.om.model.units;

import nl.wur.fbr.om.prefixes.Prefix;

/**
 * A unit multiple is a unit that is multiplied by a standard factor. For instance, if you want to create a unit of 125 gram,
 * then the factor is 125 and the unit is gram. Special cases of unit multiples are prefixed units, defined in the
 * interface {@link PrefixedUnit}, where the multiplication factor is defined by the prefix to the unit (for instance
 * kilo in kilometre).
 *
 *
 * @author Don Willems on 14/07/15.
 */
public interface UnitMultiple extends Unit {

    /**
     * The unit from which the unit multiple is created.
     * For instance, the unit 125 g has a base unit of g.
     * @return The base unit.
     */
    public Unit getUnit();

    /**
     * Returns the value with which measures need to be multiplied when converting to this unit multiple.
     * For instance, the unit multiple 125 g has a factor of 125.
     * @return The factor.
     */
    public double getFactor();
}
