package nl.wur.fbr.om.core.impl.quantities;

import javafx.util.Pair;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.quantities.Quantity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * An abstract implementation of the {@link Quantity} interface.
 * To use quantities, specific implementation classes need to be created. For instance the quantity length should
 * have its own class, e.g.  <code>Length</code>.
 *
 * @author Don Willems on 20/07/15.
 */
public abstract class AbstractQuantity implements Quantity {

    /** The measure (numerical value expressed in a unit) which is the value of the quantity. */
    private Measure measureValue = null;

    /** The point (numerical value on a measurement scale) which is the value of the quantity. */
    private Point pointValue = null;

    /**
     * Creates an unnamed quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the quantity.
     */
    public AbstractQuantity(Measure measure){
        this.measureValue = measure;
    }

    /**
     * Creates an unnamed quantity with the specified point on a measurement scale as value.
     * An identifier will be automatically generated.
     *
     * @param point The value of the quantity.
     */
    public AbstractQuantity(Point point){
        this.pointValue = point;
    }

    /**
     * Returns the value of the quantity if the value is a measure, or null if the value is a
     * point on a measurement scale.
     * @return The value of the quantity.
     */
    @Override
    public Measure getMeasureValue(){
        return measureValue;
    }

    /**
     * Returns the value of the quantity if the value is a point on a measurement scale or null if
     * the value is a measure.
     * @return The value of the quantity.
     */
    @Override
    public Point getPointValue(){
        return pointValue;
    }

    /**
     * Returns the value of the quantity.
     * @return The value of the quantity.
     */
    @Override
    public Object getValue(){
        if(measureValue!=null) return measureValue;
        else return pointValue;
    }
}
