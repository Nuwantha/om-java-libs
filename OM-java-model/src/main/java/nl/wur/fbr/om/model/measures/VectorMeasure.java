package nl.wur.fbr.om.model.measures;

/**
 * This interface defines the specific methods for measures that have a vector as numerical value.
 *
 * @author Don Willems on 21/07/15.
 */
public interface VectorMeasure extends Measure {

    /**
     * Returns the numerical value (as a vector) of this measure.
     * @return The vector value.
     */
    public Number[] getVectorValue();

    /**
     * Returns the numerical value (as a vector of doubles) of this measure.
     * @return The vector value.
     */
    public double[] doubleValue();

    /**
     * Returns the magnitude of the vector value as a measure that contains a scalar as
     * the numerical value of the magnitude and the same units in which this measure is expressed.
     * @return The magnitude of the vector.
     */
    public ScalarMeasure getMagnitude();

    /**
     * Returns the unit vector of this vector measure. The unit vector is the normalised vector, i.e.
     * all values in the vector are divided by the magnitude of the vector. No unit is associated with
     * the unit vector.
     * @return The unit vector.
     */
    public double[] getUnitVector();
}
