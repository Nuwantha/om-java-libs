package nl.wur.fbr.om.model.measures;

import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.values.Tensor;

/**
 * This interface defines the specific methods for measures that have a tensor as numerical value.
 * @author Don Willems on 21/07/15.
 */
public interface TensorMeasure extends Measure {

    /**
     * Returns the numerical value (as a tensor) of this measure.
     * @return The tensor value.
     */
    public Tensor getTensorValue();
}
