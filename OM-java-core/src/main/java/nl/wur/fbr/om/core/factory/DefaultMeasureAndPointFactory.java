package nl.wur.fbr.om.core.factory;

import nl.wur.fbr.om.core.impl.measures.MeasureImpl;
import nl.wur.fbr.om.core.impl.measures.ScalarMeasureImpl;
import nl.wur.fbr.om.core.impl.measures.VectorMeasureImpl;
import nl.wur.fbr.om.core.impl.points.PointImpl;
import nl.wur.fbr.om.core.impl.points.ScalarPointImpl;
import nl.wur.fbr.om.core.impl.points.VectorPointImpl;
import nl.wur.fbr.om.factory.MeasureAndPointFactory;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.measures.ScalarMeasure;
import nl.wur.fbr.om.model.measures.VectorMeasure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.points.ScalarPoint;
import nl.wur.fbr.om.model.points.VectorPoint;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.Unit;

/**
 * This core class implements methods that can be used to create measures and points on a measurement scale.
 *
 *
 * @author Don Willems on 22/07/15.
 */
public class DefaultMeasureAndPointFactory implements MeasureAndPointFactory {

    /**
     * Creates a new measure with the specified numerical value expressed in the specified unit.
     * If the numerical value is of type Number, a ScalarMeasure will be created, if the numerical
     * value is an array of numbers, a VectorMeasure will be created. If the type of the value is neither
     * a Measure will be created with the specified numerical value.
     *
     * @param numericalValue The numerical value.
     * @param unit           The unit.
     * @return A measure with the specified value expressed in the specified unit.
     */
    @Override
    public Measure createMeasure(Object numericalValue, Unit unit) {
        if(numericalValue instanceof Number) return this.createScalarMeasure((Number)numericalValue,unit);
        if(numericalValue instanceof Number[]) return this.createVectorMeasure((Number[])numericalValue,unit);
        return new MeasureImpl(numericalValue,unit);
    }

    /**
     * Creates a new scalar measure with the specified numerical value expressed in the specified unit.
     *
     * @param value The scalar value of the measure.
     * @param unit  The unit in which the scalar is expressed.
     * @return The scalar measure.
     */
    @Override
    public ScalarMeasure createScalarMeasure(double value, Unit unit) {
        return new ScalarMeasureImpl(value,unit);
    }

    /**
     * Creates a new scalar measure with the specified numerical value expressed in the specified unit.
     *
     * @param value The scalar value of the measure.
     * @param unit  The unit in which the scalar is expressed.
     * @return The scalar measure.
     */
    @Override
    public ScalarMeasure createScalarMeasure(Number value, Unit unit) {
        return new ScalarMeasureImpl(value,unit);
    }

    /**
     * Creates a new vector measure with the specified vector value expressed int the specified unit.
     *
     * @param vector The vector value of the measure expressed as an array of numbers.
     * @param unit   The unit in which the vector is expressed.
     * @return The vector measure.
     */
    @Override
    public VectorMeasure createVectorMeasure(double[] vector, Unit unit) {
        return new VectorMeasureImpl(vector,unit);
    }

    /**
     * Creates a new vector measure with the specified vector value expressed int the specified unit.
     *
     * @param vector The vector value of the measure expressed as an array of numbers.
     * @param unit   The unit in which the vector is expressed.
     * @return The vector measure.
     */
    @Override
    public VectorMeasure createVectorMeasure(Number[] vector, Unit unit){
        return new VectorMeasureImpl(vector,unit);
    }

    /**
     * Creates a new scalar point on a measurement scale with the specified numerical value on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param value The numerical value on the scale.
     * @param scale The scale in which this point is defined.
     * @return The point.
     */
    @Override
    public Point createPoint(Object value, Scale scale) {
        if(value instanceof Number) return this.createScalarPoint((Number) value, scale);
        if(value instanceof Number[]) return this.createVectorPoint((Number[]) value, scale);
        return new PointImpl(value,scale);
    }

    /**
     * Creates a new scalar point on a measurement scale with the specified scalar value on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param value The scalar value of the point.
     * @param scale The scale in which this point is defined.
     * @return The scalar point.
     */
    @Override
    public ScalarPoint createScalarPoint(double value, Scale scale) {
        return new ScalarPointImpl(value,scale);
    }

    /**
     * Creates a new scalar point on a measurement scale with the specified scalar value on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param value The scalar value of the point.
     * @param scale The scale in which this point is defined.
     * @return The scalar point.
     */
    @Override
    public ScalarPoint createScalarPoint(Number value, Scale scale) {
        return new ScalarPointImpl(value,scale);
    }

    /**
     * Creates a new vector point on a measurement scale with the specified vector value on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param vector The vector value of the point expressed as an array of numbers.
     * @param scale The scale in which this point is defined.
     * @return The vector point.
     */
    @Override
    public VectorPoint createVectorPoint(double[] vector, Scale scale) {
        return new VectorPointImpl(vector,scale);
    }

    /**
     * Creates a new vector point on a measurement scale with the specified vector value on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param vector The vector value of the point expressed as an array of numbers.
     * @param scale The scale in which this point is defined.
     * @return The vector point.
     */
    @Override
    public VectorPoint createVectorPoint(Number[] vector, Scale scale) {
        return new VectorPointImpl(vector,scale);
    }
}
