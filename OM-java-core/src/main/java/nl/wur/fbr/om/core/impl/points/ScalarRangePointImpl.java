package nl.wur.fbr.om.core.impl.points;

import nl.wur.fbr.om.model.points.ScalarRangePoint;
import nl.wur.fbr.om.model.scales.Scale;
import org.apache.commons.lang3.Range;

/**
 * The core implementation for a point that has a scalar range as numerical value.
 * @author Don Willems on 05/08/15.
 */
public class ScalarRangePointImpl extends PointImpl implements ScalarRangePoint {

    /**
     * Creates a new <code>ScalarRangePoint</code> with the specified range (from <code>minimumValue</code>
     * to <code>maximumValue</code>) in double types on the specified scale.
     *
     * @param minimumValue The minimum numerical value.
     * @param maximumValue The maximum numerical value.
     * @param scale          The scale.
     */
    public ScalarRangePointImpl(double minimumValue, double maximumValue, Scale scale) {
        super(Range.between(minimumValue,maximumValue), scale);
    }

    /**
     * Creates a new <code>ScalarRangePoint</code> with the specified range (from <code>minimumValue</code>
     * to <code>maximumValue</code>) in Number types on the specified scale.
     *
     * @param minimumValue The minimum numerical value.
     * @param maximumValue The maximum numerical value.
     * @param scale          The scale.
     */
    public ScalarRangePointImpl(Number minimumValue, Number maximumValue, Scale scale) {
        super(Range.between(minimumValue.doubleValue(),maximumValue.doubleValue()), scale);
    }

    /**
     * Creates a new <code>ScalarRangePoint</code> with the specified range on the specified scale.
     *
     * @param scalarRange The scalar range.
     * @param scale          The scale.
     */
    public ScalarRangePointImpl(Range scalarRange, Scale scale) {
        super(scalarRange, scale);
    }

    /**
     * Returns the numerical value (as a range) of this point.
     *
     * @return The double value.
     */
    @Override
    public Range getScalarRange() {
        return (Range)getNumericalValue();
    }
}
