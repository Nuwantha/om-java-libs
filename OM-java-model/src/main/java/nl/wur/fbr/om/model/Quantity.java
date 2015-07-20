package nl.wur.fbr.om.model;


/**
 * This interface represents a quantity.
 *
 * @author Don Willems on 14/07/15.
 */
public interface Quantity extends NamedObject {


    /**
     * Returns the value of the quantity if the value is a measure, or null if the value is a
     * point on a measurement scale.
     * @return The value of the quantity.
     */
    public Measure getMeasureValue();

    /**
     * Returns the value of the quantity if the value is a point on a measurement scale or null if
     * the value is a measure.
     * @return The value of the quantity.
     */
    public Point getPointValue();

    /**
     * Returns the value of the quantity.
     * @return The value of the quantity.
     */
    public Object getValue();
}
