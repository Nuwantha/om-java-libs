package nl.wur.fbr.om.model.quantities;


import nl.wur.fbr.om.model.NamedObject;
import nl.wur.fbr.om.model.UnitAndScaleSet;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.units.BaseUnit;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.units.UnitDivision;

import java.util.List;
import java.util.Set;

/**
 * This interface represents a quantity with an associated measure or point.
 * Properties of the quantity <b>class</b> can be accessed via {@link #getQuantityClass()}.
 *
 * @author Don Willems on 14/07/15.
 */
public interface Quantity extends NamedObject {

    /**
     * Returns the {@link QuantityClass} for which this quantity is an instance.
     * @return The quantity class.
     */
    public QuantityClass getQuantityClass();

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
