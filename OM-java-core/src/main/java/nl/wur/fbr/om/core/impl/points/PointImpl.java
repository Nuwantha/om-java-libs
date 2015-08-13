package nl.wur.fbr.om.core.impl.points;


import nl.wur.fbr.om.core.impl.measures.MeasureImpl;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.Unit;
import org.apache.commons.lang3.Range;

/**
 * This class implements the {@link Point Point} interface that represents a point (value and scale) on a measurement scale.
 * The unit in which the value is expressed in defined in the measurement scale.
 *
 * These points can be used to define a measurement scale as in the Celsius scale, which is defined by
 * <code>Point</code>s such as the boiling point of water, or they can be used to specify measurements on a scale,
 * for instance the temperature in degree celsius. For measurements like temperature, a <code>Point</code> needs
 * to be used, e.g. the temperature is 10 degrees Celsius, while temperature differences need to be expressed as
 * {@link Measure Measure}s as these values are relative.
 *
 *
 * @author Don Willems on 20/07/15.
 */
public class PointImpl implements Point{

    /** The scale in which this point is defined. */
    private Scale scale;

    /** The numerical value of this point on the scale. */
    private Object numericalValue;


    /**
     * Creates a new {@link Point} with the specified scalar value on the specified measurement scale.
     *
     * @param numericalValue The scalar value.
     * @param scale The scale.
     */
    public PointImpl(double numericalValue,Scale scale){
        this.scale = scale;
        this.numericalValue = numericalValue;
    }

    /**
     * Creates a new {@link Point} with the specified vector value on the specified measurement scale.
     *
     * @param numericalValue The vector value.
     * @param scale The scale.
     */
    public PointImpl(double[] numericalValue, Scale scale){
        this.scale = scale;
        if(numericalValue.length==1) this.numericalValue = numericalValue[0];
        else this.numericalValue = numericalValue;
    }

    /**
     * Creates a new {@link Point} with the specified scalar range value on the specified measurement scale.
     *
     * @param numericalValue The scalar range value.
     * @param scale The scale.
     */
    public PointImpl(Range numericalValue, Scale scale){
        this.scale = scale;
        this.numericalValue = numericalValue;
    }

    /**
     * The scale in which this point is defined.
     *
     * @return The measurement scale in which the point is defined.
     */
    @Override
    public Scale getScale() {
        return scale;
    }

    /**
     * The numerical value of the point.
     * The return type is an Object but can be of type Number, or (in the future) of Vector or Tensor types.
     *
     * @return The numerical value.
     */
    @Override
    public Object getNumericalValue() {
        return numericalValue;
    }

    /**
     * Returns the difference of the point with the zero point on the scale.
     *
     * @return The difference from zero point.
     */
    @Override
    public Measure getDifferenceFromZero() {
        if(numericalValue instanceof Number)
            return new MeasureImpl((double)this.getNumericalValue(),this.getScale().getUnit());
        if(numericalValue instanceof double[])
            return new MeasureImpl((double[])this.getNumericalValue(),this.getScale().getUnit());
        if(numericalValue instanceof Range)
            return new MeasureImpl((Range)this.getNumericalValue(),this.getScale().getUnit());
        throw new NumberFormatException("THe difference to the zero point could not be determined as the numerical value" +
                "is not of a known numerical value type.");
    }

    /**
     * Returns the numerical value (as a scalar) of this point.
     *
     * @return The double value.
     */
    @Override
    public double getScalarValue() {
        if(!(numericalValue instanceof Number)) throw new NumberFormatException("The numerical value of "+this+" is not a scalar.");
        return (double) numericalValue;
    }

    /**
     * Returns the numerical value (as a scalar range) of this point.
     *
     * @return The range value.
     */
    @Override
    public Range getScalarRange() {
        if(!(numericalValue instanceof Range)) throw new NumberFormatException("The numerical value of "+this+" is not a scalar range.");
        return (Range)numericalValue;
    }

    /**
     * Returns the numerical value (as a vector of doubles) of this point.
     *
     * @return The vector value.
     */
    @Override
    public double[] getVectorValue() {
        if(numericalValue instanceof Number){
            double[] vec = {(double) numericalValue};
            return vec;
        }
        if(!(numericalValue instanceof double[])) throw new NumberFormatException("The numerical value of "+this+" is not a vector.");
        return (double[]) numericalValue;
    }

    /**
     * Returns the magnitude of the vector value as a measure that contains a scalar as
     * the numerical value of the magnitude and in the same units in which this point is expressed.
     *
     * @return The magnitude of the vector.
     */
    @Override
    public Measure getMagnitude() {
        double[] val = this.getVectorValue();
        double magn = 0;
        for(int i=0;i<val.length;i++) magn+=Math.pow(val[i],2);
        magn = Math.sqrt(magn);
        Measure magnitude = new MeasureImpl(magn,this.getScale().getUnit());
        return magnitude;
    }

    /**
     * Returns the unit vector of this vector point. The unit vector is the normalised vector, i.e.
     * all values in the vector are divided by the magnitude of the vector. No unit is associated with
     * the unit vector.
     *
     * @return The unit vector.
     */
    @Override
    public double[] getUnitVector() {
        double[] val = this.getVectorValue();
        double magn = 0;
        for(int i=0;i<val.length;i++) magn+=Math.pow(val[i],2);
        magn = Math.sqrt(magn);
        double[] uvec = new double[val.length];
        for(int i=0;i<val.length;i++) uvec[i] = val[i]/magn;
        return uvec;
    }

    /**
     * A string representation of this point, the string representation of the numerical value followed by the
     * symbol of the unit defined in the scale if not null. For instance, a point with value 15 in the kelvin scale,
     * will be represented as 15 K.
     * @return The
     */
    @Override
    public String toString(){
        String str = "";
        if(this.getNumericalValue() instanceof Number){
            str += ""+this.getScalarValue();
        }else if(this.getNumericalValue() instanceof double[]){
            double[] vec = this.getVectorValue();
            str += "[";
            for(int i=0;i<vec.length;i++){
                if(i>0) str+=",";
                str+=""+vec[i];
            }
            str+="]";
        }else{
            str+= ""+numericalValue;
        }
        if(this.getScale().getUnit()!=null && this.getScale().getUnit().getSymbol()!=null){
            str+= " " + this.getScale().getUnit().getSymbol();
        }
        str+= " (scale)";
        return str;
    }
}
