package nl.wur.fbr.om.model.points;

/**
 * This interface defines the specific methods for point that have a scalar as numerical value.
 * @author Don Willems on 28/07/15.
 */
public interface ScalarPoint extends Point {

    /**
     * Returns the numerical value (as a {@link Number}) of this point.
     * @return The number value.
     */
    public Number getScalarValue();

    /**
     * Returns the numerical value (as a scalar) of this point.
     * @return The double value.
     */
    public double doubleValue();
}
