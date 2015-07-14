package nl.wur.fbr.om.model;

/**
 * This interface represents a value expressed in a unit or measurement scale and optionally associated with a
 * quantity.
 * Created by Don Willems on 14/07/15.
 */
public interface Measure {

    /**
     * The unit in which the measure is epressed.
     * @return The unit or measurement scale.
     */
    public UnitOrMeasurementScale getUnitOrMeasurementScale();

    /**
     * The numerical value of the measure.
     * The return type is an Object but can be of type Number, or (in the future) of Vector or Tensor types.
     * @return The numerical value.
     */
    public Object getNumericalValue();

    /**
     * The quantity for which this measure expresses a value.
     * The return value is null when no quantity is specified.
     * @return The quantity.
     */
    public Quantity getQuantity();
}
