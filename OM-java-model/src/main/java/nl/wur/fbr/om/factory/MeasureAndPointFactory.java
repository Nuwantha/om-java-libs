package nl.wur.fbr.om.factory;

import nl.wur.fbr.om.exceptions.MeasureOrPointCreationException;
import nl.wur.fbr.om.model.measures.ScalarMeasure;
import nl.wur.fbr.om.model.measures.TensorMeasure;
import nl.wur.fbr.om.model.measures.VectorMeasure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.values.Vector;

/**
 * This interface defines methods that can be used to create measures and points on a measurement scale.
 * Each library that implements the model classes should also provide an implementation of the
 * <code>MeasureAndPointFactory</code> to create instances from its own implementation classes.
 *
 * @author Don Willems on 21/07/15.
 */
public interface MeasureAndPointFactory {

    /**
     * Creates a new scalar measure with the specified numerical value expressed in the specified unit.
     * @param value The scalar value of the measure.
     * @param unit The unit in which the scalar is expressed.
     * @return The scalar measure.
     */
    public ScalarMeasure createScalarMeasure(Number value, Unit unit);

    /**
     * Creates a new vector measure with the specified vector value expressed int the specified unit.
     * @param vector The vector value of the measure expressed as an array of doubles.
     * @param unit The unit in which the vector is expressed.
     * @return The vector measure.
     * @throws MeasureOrPointCreationException When the vector could not be created from the array.
     */
    public VectorMeasure createVectorMeasure(Double[] vector, Unit unit) throws MeasureOrPointCreationException;

    /**
     * Creates a new vector measure with the specified vector value expressed int the specified unit.
     * @param value The vector value of the measure.
     * @param unit The unit in which the vector is expressed.
     * @return The vector measure.
     */
    public VectorMeasure createVectorMeasure(Vector value, Unit unit);

    /**
     * Creates a new tensor measure with the specified tensor value expressed int the specified unit.
     * @param value The tensor value of the measure.
     * @param unit The unit in which the tensor is expressed.
     * @return The tensor measure.
     */
    public TensorMeasure createTensorMeasure(Vector value, Unit unit);

    /**
     * Creates a new scalar point on a measurement scale with the specified numerical value on the specified measurement
     * scale and using the unit associated with that scale.
     * @param value The scalar value of the scale.
     * @param scale The scale in which this point is defined.
     * @return The scalar measure.
     */
    public Point createScalarMeasure(Number value, Scale scale);

}
