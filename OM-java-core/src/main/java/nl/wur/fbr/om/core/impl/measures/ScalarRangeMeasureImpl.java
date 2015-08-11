package nl.wur.fbr.om.core.impl.measures;

import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.measures.ScalarRangeMeasure;
import nl.wur.fbr.om.model.units.Unit;
import org.apache.commons.lang3.Range;

/**
 * This class implements the specific methods for measures that have a scalar range as numerical value.
 * @author Don Willems on 05/08/15.
 */
public class ScalarRangeMeasureImpl extends MeasureImpl implements ScalarRangeMeasure {

    /**
     * Creates a new <code>ScalarRangeMeasure</code> with the specified range (from <code>minimumValue</code>
     * to <code>maximumValue</code>) in double types in the specified unit.
     *
     * @param minimumValue The minimum numerical value.
     * @param maximumValue The maximum numerical value.
     * @param unit          The unit.
     */
    public ScalarRangeMeasureImpl(double minimumValue, double maximumValue, Unit unit) {
        super(Range.between(minimumValue,maximumValue), unit);
    }

    /**
     * Creates a new <code>ScalarRangeMeasure</code> with the specified range (from <code>minimumValue</code>
     * to <code>maximumValue</code>) in Number types in the specified unit.
     *
     * @param minimumValue The minimum numerical value.
     * @param maximumValue The maximum numerical value.
     * @param unit          The unit.
     */
    public ScalarRangeMeasureImpl(Number minimumValue, Number maximumValue, Unit unit) {
        super(Range.between(minimumValue.doubleValue(),maximumValue.doubleValue()), unit);
    }
    /**
     * Creates a new {@link Measure} with the specified scalar range expressed in the specified Unit.
     *
     * @param scalarRange The scalar range.
     * @param unit           The unit.
     */
    public ScalarRangeMeasureImpl(Range scalarRange, Unit unit) {
        super(scalarRange, unit);
    }

    /**
     * Returns the numerical value (as a range) of this measure.
     *
     * @return The range value.
     */
    @Override
    public Range getScalarRange() {
        return (Range)getNumericalValue();
    }
}
