package nl.wur.fbr.om.model.units;

import nl.wur.fbr.om.prefixes.Prefix;

/**
 * A Prefixed unit is a special case of a unit multiple where the multiplication factor is defined by the prefix to
 * the unit, e.g. the prefix kilo in kilometre. Prefixes can be both decimal
 * (see {@link nl.wur.fbr.om.prefixes.DecimalPrefix DecimalPrefix}) or
 * binary (see {@link nl.wur.fbr.om.prefixes.BinaryPrefix BinaryPrefix} or
 * {@link nl.wur.fbr.om.prefixes.JEDECBinaryPrefix JEDEXBinaryPrefix}).
 *
 * @author Don Willems on 28/07/15.
 */
public interface PrefixedUnit extends UnitMultiple {

    /**
     * Returns the @link{Prefix Prefix} used for this unit.
     * Prefixes can be both decimal (see {@link nl.wur.fbr.om.prefixes.DecimalPrefix DecimalPrefix}) or
     * binary (see {@link nl.wur.fbr.om.prefixes.BinaryPrefix BinaryPrefix} or
     * {@link nl.wur.fbr.om.prefixes.JEDECBinaryPrefix JEDEXBinaryPrefix}).
     * @return The prefix.
     */
    public Prefix getPrefix();
}
