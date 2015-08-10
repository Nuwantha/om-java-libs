package nl.wur.fbr.om.model.points;

import org.apache.commons.lang3.Range;

/**
 * This interface defines a scalar range on a measurement scale. These are for instance used in the definition
 * points of temperature scales, e.g. the point range -270.15 to -268.15 is defined for the Celsius scale.
 * @author Don Willems on 05/08/15.
 */
public interface ScalarRangePoint extends Point {

    /**
     * Returns the numerical value (as a range) of this point.
     * @return The double value.
     */
    public Range getScalarRange();
}
