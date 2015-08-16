package nl.wur.fbr.om.core.factory;

import nl.wur.fbr.om.core.impl.measures.MeasureImpl;
import nl.wur.fbr.om.core.impl.points.PointImpl;
import nl.wur.fbr.om.factory.MeasureAndPointFactory;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.Unit;
import org.apache.commons.lang3.Range;

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
     * value is an array of numbers, a VectorMeasure will be created.
     *
     * @param numericalValue The numerical value.
     * @param unit           The unit.
     * @return A measure with the specified value expressed in the specified unit.
     */
    @Override
    public Measure createMeasure(Object numericalValue, Unit unit) {
        if(numericalValue instanceof Number) return new MeasureImpl(((Number) numericalValue).doubleValue(),unit);
        if(numericalValue instanceof double[]) return new MeasureImpl((double[])numericalValue,unit);
        if(numericalValue instanceof Range) return new MeasureImpl((Range)numericalValue,unit);
        throw new NumberFormatException("The numerical value is not one of the known number types.");
    }

    /**
     * Creates a new scalar measure with the specified numerical value expressed in the specified unit.
     *
     * @param value The scalar value of the measure.
     * @param unit  The unit in which the scalar is expressed.
     * @return The scalar measure.
     */
    @Override
    public Measure createScalarMeasure(double value, Unit unit) {
        return new MeasureImpl(value,unit);
    }

    /**
     * Creates a new scalar measure with a range with the specified minimum and maximum values
     * expressed in the specified unit.
     *
     * @param minimumValue The minimum value of the measure.
     * @param maximumValue The maximum value of the measure.
     * @param unit         The unit in which the scalar is expressed.
     * @return The scalar measure.
     */
    @Override
    public Measure createScalarRangeMeasure(double minimumValue, double maximumValue, Unit unit) {
        return new MeasureImpl(Range.between(minimumValue,minimumValue),unit);
    }

    /**
     * Creates a new scalar measure with the specified range in the specified unit.
     *
     * @param range The scalar range of the measure.
     * @param unit  The unit in which the scalar is expressed.
     * @return The scalar measure.
     */
    @Override
    public Measure createScalarRangeMeasure(Range range, Unit unit) {
        return new MeasureImpl(range,unit);
    }

    /**
     * Creates a new vector measure with the specified vector value expressed int the specified unit.
     *
     * @param vector The vector value of the measure expressed as an array of numbers.
     * @param unit   The unit in which the vector is expressed.
     * @return The vector measure.
     */
    @Override
    public Measure createVectorMeasure(double[] vector, Unit unit) {
        return new MeasureImpl(vector,unit);
    }

    /**
     * Creates a new scalar point on a measurement scale with the specified numerical value on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param numericalValue The value of the scale.
     * @param scale The scale in which this point is defined.
     * @return The point.
     */
    @Override
    public Point createPoint(Object numericalValue, Scale scale) {
        if(numericalValue instanceof Number) return new PointImpl(((Number) numericalValue).doubleValue(),scale);
        if(numericalValue instanceof double[]) return new PointImpl((double[])numericalValue,scale);
        if(numericalValue instanceof Range) return new PointImpl((Range)numericalValue,scale);
        throw new NumberFormatException("The numerical value is not one of the known number types.");
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
    public Point createScalarPoint(double value, Scale scale) {
        return new PointImpl(value,scale);
    }

    /**
     * Creates a new scalar point with a range with the specified minimum and maximum values
     * expressed on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param minimumValue The minimum value of the point.
     * @param maximumValue The maximum value of the point.
     * @param scale        The scale in which this point is defined.
     * @return The scalar range point.
     */
    @Override
    public Point createScalarRangePoint(double minimumValue, double maximumValue, Scale scale) {
        return new PointImpl(Range.between(minimumValue,maximumValue),scale);
    }

    /**
     * Creates a new scalar point with the specified range on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param range The scalar range of the point.
     * @param scale The scale in which this point is defined.
     * @return The scalar range point.
     */
    @Override
    public Point createScalarRangePoint(Range range, Scale scale) {
        return new PointImpl(range,scale);
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
    public Point createVectorPoint(double[] vector, Scale scale) {
        return new PointImpl(vector,scale);
    }
}
