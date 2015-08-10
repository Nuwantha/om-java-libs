package nl.wur.fbr.om.model.measures;

import org.apache.commons.lang3.Range;

/**
 * This interface defines the specific methods for measures that have a range as numerical value.
 * @author Don Willems on 05/08/15.
 */
public interface ScalarRangeMeasure extends Measure {

    /**
     * Returns the numerical value (as a range) of this measure.
     * @return The range value.
     */
    public Range getScalarRange();
}
