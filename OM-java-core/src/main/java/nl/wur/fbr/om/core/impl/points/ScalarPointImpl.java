package nl.wur.fbr.om.core.impl.points;

import nl.wur.fbr.om.model.points.ScalarPoint;
import nl.wur.fbr.om.model.scales.Scale;

/**
 * The core implementation for a point that has a scalar as numerical value.
 *
 * @author Don Willems on 28/07/15.
 */
public class ScalarPointImpl extends PointImpl implements ScalarPoint {

    /**
     * Creates a new <code>Point</code> with the specified numerical value on the specified scale.
     * @param numericalValue The numerical value.
     * @param scale The scale.
     */
    public ScalarPointImpl(Number numericalValue, Scale scale){
        super(numericalValue,scale);
    }

    /**
     * Returns the numerical value (as a {@link Number}) of this point.
     *
     * @return The number value.
     */
    @Override
    public Number getScalarValue() {
        return (Number)this.getNumericalValue();
    }

    /**
     * Returns the numerical value (as a scalar) of this point.
     *
     * @return The double value.
     */
    @Override
    public double doubleValue() {
        return getScalarValue().doubleValue();
    }
}
