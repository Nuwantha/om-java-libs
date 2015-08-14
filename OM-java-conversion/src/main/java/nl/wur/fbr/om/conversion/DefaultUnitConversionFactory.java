package nl.wur.fbr.om.conversion;

import nl.wur.fbr.om.exceptions.ConversionException;
import nl.wur.fbr.om.factory.MeasureAndPointFactory;
import nl.wur.fbr.om.factory.UnitAndScaleConversionFactory;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.Unit;
import org.apache.commons.lang3.Range;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the default unit conversion factory that implements the public methods for {@link UnitAndScaleConversionFactory}.
 * It extends the {@link AbstractUnitConversionFactory} which implements the actual conversion algorithm.
 * @author Don Willems on 01/08/15.
 */
public class DefaultUnitConversionFactory extends AbstractUnitConversionFactory implements UnitAndScaleConversionFactory {

    private MeasureAndPointFactory creationFactory;

    /**
     * Creates a new default conversion factory.
     * @param creationFactory The measure and scale creation factory used in the creation of the converted
     *                        measures or scales.
     */
    public DefaultUnitConversionFactory(MeasureAndPointFactory creationFactory){
        this.creationFactory = creationFactory;
    }

    /**
     * Converts a double value expressed in the specified unit to the target unit.
     *
     * @param value      The double value.
     * @param unit       The unit in which the double is expressed.
     * @param targetUnit The target unit into which the double should be converted.
     * @return The converted value expressed in the target unit.
     * @throws ConversionException When the double could not be converted to the specified target unit.
     */
    @Override
    public double convert(double value, Unit unit, Unit targetUnit) throws ConversionException {
        double cvalue = this.convertDoubleValueToUnit(value,unit,targetUnit);
        return cvalue;
    }

    /**
     * Converts a double value on the specified measurement scalte to the target measurement scale.
     *
     * @param value       The double value.
     * @param scale       The unit in which the double is expressed.
     * @param targetScale The target unit into which the double should be converted.
     * @return The converted value expressed in the target unit.
     * @throws ConversionException When the double could not be converted to the specified target unit.
     */
    @Override
    public double convert(double value, Scale scale, Scale targetScale) throws ConversionException {
        double cvalue = this.convertDoubleValueToScale(value, scale, targetScale);
        return cvalue;
    }

    /**
     * Converts a measure (a numerical value expressed in a specific unit) to a target unit.
     *
     * @param measure    The measure to be converted to the target unit.
     * @param targetUnit The target unit to which the measurement is to be converted.
     * @return The converted measure.
     * @throws ConversionException When the measure could not be converted to the specified target unit.
     */
    @Override
    public Measure convertToUnit(Measure measure, Unit targetUnit) throws ConversionException {
        Measure cmeasure = null;
        if(measure.getNumericalValue() instanceof Number){
            double value = measure.getScalarValue();
            double cvalue = this.convertDoubleValueToUnit(value,measure.getUnit(),targetUnit);
            cmeasure = creationFactory.createScalarMeasure(cvalue,targetUnit);
        } else if(measure.getNumericalValue() instanceof double[]){
            double[] value = measure.getVectorValue();
            double[] cvalue = new double[value.length];
            for(int i=0;i<value.length;i++) cvalue[i] =this.convertDoubleValueToUnit(value[i],measure.getUnit(),targetUnit);
            cmeasure = creationFactory.createVectorMeasure(cvalue, targetUnit);
        } else if(measure.getNumericalValue() instanceof Range){
            Range value = measure.getScalarRange();
            double minvalue = (double)value.getMinimum();
            double cminvalue = this.convertDoubleValueToUnit(minvalue, measure.getUnit(), targetUnit);
            double maxvalue = (double)value.getMinimum();
            double cmaxvalue = this.convertDoubleValueToUnit(maxvalue,measure.getUnit(),targetUnit);
            cmeasure = creationFactory.createScalarRangeMeasure(minvalue,maxvalue, targetUnit);
        } else{
            throw new ConversionException("Could not convert measure with numerical value of unkown type.");
        }
        return cmeasure;
    }

    /**
     * Converts a point (a numerical value expressed on a specific scale) to a target scale.
     * This method can be used to convert, for instance, between degrees Celsius and Fahrenheit if the temperature
     * is absolute (i.e. not a temperature difference).
     *
     * @param point       The point to be converted to the target scale.
     * @param targetScale The target scale to which the point is to be converted.
     * @return The converted point.
     * @throws ConversionException When the point could not be converted to the specified target scale.
     */
    @Override
    public Point convertToScale(Point point, Scale targetScale) throws ConversionException {
        Point cpoint = null;
        if(point.getNumericalValue() instanceof Number){
            double value = point.getScalarValue();
            double cvalue = this.convertDoubleValueToScale(value, point.getScale(), targetScale);
            cpoint = creationFactory.createScalarPoint(cvalue, targetScale);
        } else if(point.getNumericalValue() instanceof double[]){
            double[] value = point.getVectorValue();
            double[] cvalue = new double[value.length];
            for(int i=0;i<value.length;i++) cvalue[i] =this.convertDoubleValueToScale(value[i], point.getScale(),targetScale);
            cpoint = creationFactory.createVectorPoint(cvalue, targetScale);
        } else if(point.getNumericalValue() instanceof Range){
            Range value = point.getScalarRange();
            double minvalue = (double)value.getMinimum();
            double cminvalue = this.convertDoubleValueToScale(minvalue, point.getScale(), targetScale);
            double maxvalue = (double)value.getMinimum();
            double cmaxvalue = this.convertDoubleValueToScale(maxvalue,point.getScale(), targetScale);
            cpoint = creationFactory.createScalarRangePoint(minvalue, maxvalue, targetScale);
        } else{
            throw new ConversionException("Could not convert measure with numerical value of unkown type.");
        }
        return cpoint;
    }

    /**
     * Compares the two scalar measures and returns a negative integer if the first measure is smaller than the
     * second measure, 0 if the two measures are equal, or a positive integer if the first measure is
     * larger than the second measure.
     *
     * @param measure1 The first measure to compare.
     * @param measure2 The second measure to compare.
     * @return A negative integer if the first measure is smaller than the second measure, 0 if the measures
     * are equal, and a positive integer if the first measure is larger.
     * @throws ConversionException When the units of the measures are in different dimensions.
     */
    @Override
    public int compare(Measure measure1, Measure measure2) throws ConversionException {
        double cvalue = this.convertDoubleValueToUnit(measure2.getScalarValue(),measure2.getUnit(),measure1.getUnit());
        return (int)(measure1.getScalarValue()-cvalue);
    }

    /**
     * Compares the two measures and returns a true when they are equal. This includes the conversion of units,
     * e.g. 1 km is equal to 1000000 mm. If the compared measures are vectors
     * each of the components of the vector should be equal to the same component of the other vector (including
     * unit comversion). When the measures cannot be compared because the units cannot be converted into each other,
     * this method returns false.
     *
     * @param measure1 The first measure to compare.
     * @param measure2 The second measure to compare.
     * @param diff The maximum difference between the two values for the method to return true.
     * @return True when the measures are equal, or false otherwise.
     */
    @Override
    public boolean equals(Measure measure1, Measure measure2,double diff) {
        if(measure1.getNumericalValue() instanceof Number && measure2.getNumericalValue() instanceof Number){
            try {
                double cvalue = this.convertDoubleValueToUnit(measure2.getScalarValue(),measure2.getUnit(),measure1.getUnit());
                double value = measure1.getScalarValue();
                double vdiff = Math.abs(cvalue - value);
                return vdiff<=diff;
            } catch (ConversionException e) {
                return false;
            }
        } else if(measure1.getNumericalValue() instanceof double[] && measure2.getNumericalValue() instanceof double[]){
            try {
                double[] value = measure1.getVectorValue();
                double[] value2 = measure2.getVectorValue();
                if(value.length!=value2.length) return false;
                for(int i=0;i<value.length;i++){
                    double cvalue = this.convertDoubleValueToUnit(value2[i], measure2.getUnit(), measure1.getUnit());
                    double vdiff = Math.abs(cvalue - value[i]);
                    if(vdiff>diff) return false;
                }
                return true;
            } catch (ConversionException e) {
                return false;
            }
        } else if(measure1.getNumericalValue() instanceof Range && measure2.getNumericalValue() instanceof Range){
            try {
                Range value = measure1.getScalarRange();
                Range value2 = measure2.getScalarRange();
                double vv1 = this.convertDoubleValueToUnit((Double) value2.getMinimum(), measure2.getUnit(), measure1.getUnit());
                double vv2 = this.convertDoubleValueToUnit((Double) value2.getMaximum(), measure2.getUnit(), measure1.getUnit());
                double vdiff1 = Math.abs(vv1 - (double)value.getMinimum());
                double vdiff2 = Math.abs(vv1 - (double)value.getMaximum());
                return vdiff1<=diff && vdiff2<diff;
            } catch (ConversionException e) {
                return false;
            }
        }
        return false;
    }

    /**
     * Compares the two points and returns a negative integer if the first point is smaller than the
     * second point, 0 if the two points are equal, or a positive integer if the first point is
     * larger than the second point.
     *
     * @param point1 The first point to compare.
     * @param point2 The second point to compare.
     * @return A negative integer if the first point is smaller than the second point, 0 if the points
     * are equal, and a positive integer if the first point is larger.
     * @throws ConversionException When the units of the points are in different dimensions, or if the measures
     *                             have incompatible numerical values, e.g. a scalar and a vector.
     */
    @Override
    public int compare(Point point1, Point point2) throws ConversionException {
        double cvalue = this.convertDoubleValueToScale(point2.getScalarValue(), point2.getScale(), point1.getScale());
        return (int)(point1.getScalarValue()-cvalue);
    }

    /**
     * Compares the two point and returns a true when they are equal. This includes the conversion of units,
     * e.g. 1 K is equal to 1.8 F. If the compared points are vectors
     * each of the components of the vector should be equal to the same component of the other vector (including
     * unit comversion and scale conversion). When the points cannot be compared because the units cannot be converted into each other,
     * this method returns false.
     *
     * @param point1 The first point to compare.
     * @param point2 The second point to compare.
     * @param diff The maximum difference between the two values for the method to return true.
     * @return True when the points are equal, or false otherwise.
     */
    @Override
    public boolean equals(Point point1, Point point2,double diff) {
        if(point1.getNumericalValue() instanceof Number && point2.getNumericalValue() instanceof Number){
            try {
                double cvalue = this.convertDoubleValueToScale(point2.getScalarValue(), point2.getScale(), point1.getScale());
                double value = point1.getScalarValue();
                double vdiff = Math.abs(cvalue - value);
                return vdiff<=diff;
            } catch (ConversionException e) {
                return false;
            }
        } else if(point1.getNumericalValue() instanceof double[] && point2.getNumericalValue() instanceof double[]){
            try {
                double[] value = point1.getVectorValue();
                double[] value2 = point2.getVectorValue();
                if(value.length!=value2.length) return false;
                for(int i=0;i<value.length;i++){
                    double cvalue = this.convertDoubleValueToScale(value2[i], point2.getScale(), point1.getScale());
                    double vdiff = Math.abs(cvalue - value[i]);
                    if(vdiff>diff) return false;
                }
                return true;
            } catch (ConversionException e) {
                return false;
            }
        } else if(point1.getNumericalValue() instanceof Range && point2.getNumericalValue() instanceof Range){
            try {
                Range value = point1.getScalarRange();
                Range value2 = point2.getScalarRange();
                double vv1 = this.convertDoubleValueToScale((Double) value2.getMinimum(), point2.getScale(), point1.getScale());
                double vv2 = this.convertDoubleValueToScale((Double) value2.getMaximum(), point2.getScale(), point1.getScale());
                double vdiff1 = Math.abs(vv1 - (double)value.getMinimum());
                double vdiff2 = Math.abs(vv1 - (double)value.getMaximum());
                return vdiff1<=diff && vdiff2<diff;
            } catch (ConversionException e) {
                return false;
            }
        }
        return false;
    }
}
