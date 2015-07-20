package nl.wur.fbr.om.model.measures;

import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.values.Vector;

/**
 * This interface defines the specific methods for measures that have a vector as numerical value.
 * @author Don Willems on 21/07/15.
 */
public interface VectorMeasure extends Measure {

    /**
     * Returns the numerical value (as a vector) of this measure.
     * @return The vector value.
     */
    public Vector getVectorValue();

    /**
     * Returns the magnitude of the vector value as a measure that contains a scalar as
     * the numerical value of the magnitude and the same units in which this measure is expressed.
     * @return
     */
    public Measure getMagnitude();
}
