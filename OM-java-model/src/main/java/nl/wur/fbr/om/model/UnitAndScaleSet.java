package nl.wur.fbr.om.model;

import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.Unit;

import java.util.Set;

/**
 * Implementations of this interface should define a set of initialised {@link Unit Units} and {@link Scale Scales}.
 * Methods in this interface provide access to the full set of units and scales to be added as a set to different
 * instances of {@link nl.wur.fbr.om.factory.UnitAndScaleFactory}.
 *
 * @author Don Willems on 09/08/15.
 */
public interface UnitAndScaleSet {

    /**
     * Returns all units in this set.
     * @return All units.
     */
    public Set<Unit> getAllUnits();

    /**
     * Returns all measurement scales in this set.
     * @return All scales.
     */
    public Set<Scale> getAllScales();
}
