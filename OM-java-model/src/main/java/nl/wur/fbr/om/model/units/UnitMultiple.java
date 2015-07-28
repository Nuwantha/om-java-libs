package nl.wur.fbr.om.model.units;

import nl.wur.fbr.om.prefixes.Prefix;

/**
 * A unit multiple or a prefixed unit is a singular unit that is multiplied by a standard factor specified by the
 * prefix or by a custom factor. For instance, the unit kilometre (km) has a prefix kilo (k) which implies a conversion factor of 1000
 * to convert from metre to kilometre. If you would want to create a unit of 125 gram, than
 * the factor is 125 and the unit is gram.
 * @author Don Willems on 14/07/15.
 */
public interface UnitMultiple extends Unit {

    /**
     * The unit that is prefixed or that has a multiple.
     * For instance, the unit km has a base unit of m, or the unit
     * 125 g has a base unit of g.
     * @return The base unit.
     */
    public Unit getUnit();

    /**
     * Returns the @link{Prefix Prefix} used for this unit.
     * Prefixes can be both decimal (see {@link nl.wur.fbr.om.prefixes.DecimalPrefix DecimalPrefix}) or
     * binary (see {@link nl.wur.fbr.om.prefixes.BinaryPrefix BinaryPrefix} or
     * {@link nl.wur.fbr.om.prefixes.JEDECBinaryPrefix JEDEXBinaryPrefix}).
     * If a custom multiple value is used, e.g. 125 in the unit multiple 125 g, null
     * is returned.
     * @return The prefix.
     */
    public Prefix getPrefix();

    /**
     * Returns the value with which measures need to be multiplied when converting to this prefixed unit and its
     * singular unit.
     * For instance, the unit km has a prefix factor of 1000, and the unit multiple 125 g has a
     * factor of 125.
     * @return The factor.
     */
    public double getFactor();
}
