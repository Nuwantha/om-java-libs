package nl.wur.fbr.om.model.measures;


import nl.wur.fbr.om.model.measures.Measure;

/**
 * This interface defines the specific methods for measures that have a scalar as numerical value.
 * @author Don Willems on 21/07/15.
 */
public interface ScalarMeasure extends Measure {

    /**
     * Returns the numerical value (as a {@link Number}) of this measure.
     * @return The number value.
     */
    public Number getScalarValue();

    /**
     * Returns the numerical value (as a scalar) of this measure.
     * @return The double value.
     */
    public double doubleValue();
}
