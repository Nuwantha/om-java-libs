package nl.wur.fbr.om.model;

import nl.wur.fbr.om.prefixes.Prefix;

/**
 * A unit multiple or a prefixed unit is a singular unit that is multiplied by a standard factor specified by the
 * prefix. For instance, the unit kilometre (km) has a prefix kilo (k) which implies a conversion factor of 1000
 * to convert from metre to kilometre.
 * @author Don Willems on 14/07/15.
 */
public interface UnitMultiple extends Unit {

    /**
     * The singular unit that is prefixed.
     * For instance, the unit km has a base unit of m.
     * @return The base unit.
     */
    public SingularUnit getSingularUnit();

    /**
     * Returns the @link{Prefix Prefix} used for this unit.
     * Prefixes can be both decimal (see {@link nl.wur.fbr.om.prefixes.DecimalPrefix DecimalPrefix}) or
     * binary (see {@link nl.wur.fbr.om.prefixes.BinaryPrefix BinaryPrefix} or
     * {@link nl.wur.fbr.om.prefixes.JEDECBinaryPrefix JEDEXBinaryPrefix}).
     * @return The prefix.
     */
    public Prefix getPrefix();

    /**
     * Returns the value with which measures need to be multiplied when converting to this prefixed unit and its
     * base unit.
     * For instance, the unit km has a prefix factor of 1000.
     * @return The prefix factor.
     */
    public double getPrefixFactor();
}
