package nl.wur.fbr.om.conversion;

import nl.wur.fbr.om.exceptions.ConversionException;
import nl.wur.fbr.om.factory.MeasureAndPointFactory;
import nl.wur.fbr.om.factory.UnitAndScaleConversionFactory;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.measures.ScalarMeasure;
import nl.wur.fbr.om.model.measures.VectorMeasure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.points.ScalarPoint;
import nl.wur.fbr.om.model.points.VectorPoint;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.Unit;

/**
 * @author Don Willems on 01/08/15.
 */
public class DefaultUnitConversionFactory extends AbstractUnitConversionFactory implements UnitAndScaleConversionFactory {

    private MeasureAndPointFactory creationFactory;

    public DefaultUnitConversionFactory(MeasureAndPointFactory creationFactory){
        this.creationFactory = creationFactory;
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
        if(measure instanceof ScalarMeasure){
            double value = ((ScalarMeasure) measure).doubleValue();
            double cvalue = this.convertDoubleValueToUnit(value,measure.getUnit(),targetUnit);
            cmeasure = creationFactory.createScalarMeasure(cvalue,targetUnit);
        } else if(measure instanceof VectorMeasure){
            double[] value = ((VectorMeasure) measure).doubleValue();
            double[] cvalue = new double[value.length];
            for(int i=0;i<value.length;i++) cvalue[i] =this.convertDoubleValueToUnit(value[i],measure.getUnit(),targetUnit);
            cmeasure = creationFactory.createVectorMeasure(cvalue, targetUnit);
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
        if(point instanceof ScalarPoint){
            double value = ((ScalarPoint) point).doubleValue();
            double cvalue = this.convertDoubleValueToScale(value, point.getScale(), targetScale);
            cpoint = creationFactory.createScalarPoint(cvalue, targetScale);
        } else if(point instanceof VectorPoint){
            double[] value = ((VectorPoint) point).doubleValue();
            double[] cvalue = new double[value.length];
            for(int i=0;i<value.length;i++) cvalue[i] =this.convertDoubleValueToScale(value[i], point.getScale(), targetScale);
            cpoint = creationFactory.createVectorPoint(cvalue, targetScale);
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
    public int compare(ScalarMeasure measure1, ScalarMeasure measure2) throws ConversionException {
        double cvalue = this.convertDoubleValueToUnit(measure2.doubleValue(),measure2.getUnit(),measure1.getUnit());
        return (int)(measure1.doubleValue()-cvalue);
    }

    /**
     * Compares the two measures and returns a true when they are equal. This includes the conversion of units,
     * e.g. 1 km is equal to 1000000 mm. If the compared measures are {@link VectorMeasure VectorMeasures}
     * each of the components of the vector should be equals to the same component of the other vector (including
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
        if(measure1 instanceof ScalarMeasure && measure2 instanceof ScalarMeasure){
            try {
                double cvalue = this.convertDoubleValueToUnit(((ScalarMeasure) measure2).doubleValue(),measure2.getUnit(),measure1.getUnit());
                double value = ((ScalarMeasure) measure1).doubleValue();
                double vdiff = Math.abs(cvalue - value);
                return vdiff<=diff;
            } catch (ConversionException e) {
                return false;
            }
        } else if(measure1 instanceof VectorMeasure && measure2 instanceof VectorMeasure){
            try {
                double[] value = ((VectorMeasure) measure1).doubleValue();
                double[] value2 = ((VectorMeasure) measure2).doubleValue();
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
    public int compare(ScalarPoint point1, ScalarPoint point2) throws ConversionException {
        double cvalue = this.convertDoubleValueToScale(point2.doubleValue(), point2.getScale(), point1.getScale());
        return (int)(point1.doubleValue()-cvalue);
    }

    /**
     * Compares the two point and returns a true when they are equal. This includes the conversion of units,
     * e.g. 1 K is equal to 1.8 F. If the compared points are {@link VectorPoint VectorPoints}
     * each of the components of the vector should be equals to the same component of the other vector (including
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
        if(point1 instanceof ScalarPoint && point2 instanceof ScalarPoint){
            try {
                double cvalue = this.convertDoubleValueToScale(((ScalarPoint) point2).doubleValue(),point2.getScale(),point1.getScale());
                double value = ((ScalarPoint) point1).doubleValue();
                double vdiff = Math.abs(cvalue-value);
                return vdiff<=diff;
            } catch (ConversionException e) {
                return false;
            }
        } else if(point1 instanceof VectorMeasure && point2 instanceof VectorMeasure){
            try {
                double[] value = ((VectorPoint) point1).doubleValue();
                double[] value2 = ((VectorPoint) point2).doubleValue();
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
        }
        return false;
    }
}
