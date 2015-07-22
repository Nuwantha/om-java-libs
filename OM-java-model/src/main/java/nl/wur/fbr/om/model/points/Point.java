package nl.wur.fbr.om.model.points;

import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.scales.Scale;

/**
 * This interface represents a point (value and unit) on a measurement scale.
 * These points can be used to define a measurement scale as in the Celsius scale, which is defined by
 * <code>Point</code>s such as the boiling point of water, or they can be used to specify measurements on a scale,
 * for instance the temperature in degree celsius. For measurements like temperature, a <code>Point</code> needs
 * to be used, e.g. the temperature is 10 degrees Celsius, while temperature differences need to be expressed as
 * {@link Measure Measure}s as these values are relative.
 *
 * @author Don Willems on 16/07/15.
 */
public interface Point {

    /**
     * The scale in which this point is defined.
     * @return The measurement scale in which the point is defined.
     */
    public Scale getScale();

    /**
     * The numerical value of the point on the scale.
     * The return type is an Object but can be of type Number, or (in the future) of Vector or Tensor types.
     * @return The numerical value.
     */
    public Object getNumericalValue();

    /**
     * The numerical double value of the point on the scale.
     * The return type is a double.
     * @return The numerical value.
     */
    public double doubleValue();
}
