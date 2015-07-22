package nl.wur.fbr.om.core.impl.measures;

import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.measures.ScalarMeasure;
import nl.wur.fbr.om.model.units.Unit;

/**
 * This class implements the specific methods for measures that have a scalar as numerical value.
 * @author Don Willems on 22/07/15.
 */
public class ScalarMeasureImpl extends MeasureImpl implements ScalarMeasure {

    /**
     * Creates a new {@link ScalarMeasure} with the specified numerical scalar value expressed in the specified Unit.
     * The numerical value is an instance of {@link Number} and is therefore a scalar.
     * @param numericalValue The numerical value.
     * @param unit The unit.
     */
    public ScalarMeasureImpl(Number numericalValue, Unit unit){
        super(numericalValue,unit);
    }

    /**
     * Returns the numerical value (as a scalar) of this measure.
     *
     * @return The scalar value.
     */
    @Override
    public Number getScalarValue() {
        return (Number) getNumericalValue();
    }
}
