package nl.wur.fbr.om.core.impl.measures;


import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.units.Unit;
import org.apache.commons.lang3.Range;

/**
 * This class implements the {@link Measure Measure} interface that represents a value expressed in a unit.
 * For some measurements like temperature (if it is not relative, i.e. difference between temperatures),
 * {@link Point Point} should be used instead of <code>Measure</code> as these measurements are defined on a
 * measurement scale.
 *
 * @author Don Willems on 20/07/15.
 */
public class MeasureImpl implements Measure {

    /** The unit in which the numerical value for this measure is expressed. */
    private Unit unit;

    /** The numerical value. This may be a number, or a tensor or vector. */
    private Object numericalValue;

    /**
     * Creates a new {@link Measure} with the specified scalar value expressed in the specified Unit.
     *
     * @param numericalValue The scalar value.
     * @param unit The unit.
     */
    public MeasureImpl(double numericalValue, Unit unit){
        this.unit = unit;
        this.numericalValue = numericalValue;
    }

    /**
     * Creates a new {@link Measure} with the specified vector value expressed in the specified Unit.
     *
     * @param numericalValue The vector value.
     * @param unit The unit.
     */
    public MeasureImpl(double[] numericalValue, Unit unit){
        this.unit = unit;
        if(numericalValue.length==1) this.numericalValue = numericalValue[0];
        else this.numericalValue = numericalValue;
    }

    /**
     * Creates a new {@link Measure} with the specified scalar range value expressed in the specified Unit.
     *
     * @param numericalValue The scalar range value.
     * @param unit The unit.
     */
    public MeasureImpl(Range numericalValue, Unit unit){
        this.unit = unit;
        this.numericalValue = numericalValue;
    }

    /**
     * The unit in which the measure is epressed.
     *
     * @return The unit or measurement scale.
     */
    @Override
    public Unit getUnit() {
        return unit;
    }

    /**
     * The numerical value of the measure.
     * The return type is an Object but can be of type Number, or (in the future) of Vector or Tensor types.
     *
     * @return The numerical value.
     */
    @Override
    public Object getNumericalValue() {
        return numericalValue;
    }

    /**
     * Returns the numerical value (as a scalar) of this measure.
     *
     * @return The double value.
     */
    @Override
    public double getScalarValue() {
        if(!(numericalValue instanceof Number)) throw new NumberFormatException("The numerical value of "+this+" is not a scalar.");
        return (double) numericalValue;
    }

    /**
     * Returns the numerical value (as a scalar range) of this measure.
     *
     * @return The range value.
     */
    @Override
    public Range getScalarRange() {
        if(!(numericalValue instanceof Range)) throw new NumberFormatException("The numerical value of "+this+" is not a scalar range.");
        return (Range)numericalValue;
    }

    /**
     * Returns the numerical value (as a vector of doubles) of this measure.
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
     * the numerical value of the magnitude and the same units in which this measure is expressed.
     *
     * @return The magnitude of the vector.
     */
    @Override
    public Measure getMagnitude() {
        double[] val = this.getVectorValue();
        double magn = 0;
        for(int i=0;i<val.length;i++) magn+=Math.pow(val[i],2);
        magn = Math.sqrt(magn);
        Measure magnitude = new MeasureImpl(magn,this.getUnit());
        return magnitude;
    }

    /**
     * Returns the unit vector of this vector measure. The unit vector is the normalised vector, i.e.
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
     * A string representation of this measure, the string representation of the numerical value followed by the
     * symbol of the unit if not null. For instance, a measure with value 15 and unit metre,
     * will be represented as 15 m.
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
        if(getUnit()!=null && getUnit().getSymbol()!=null){
            str+= " " + getUnit().getSymbol();
        }
        return str;
    }
}
