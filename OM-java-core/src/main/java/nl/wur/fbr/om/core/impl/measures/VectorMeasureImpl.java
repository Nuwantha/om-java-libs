package nl.wur.fbr.om.core.impl.measures;

import nl.wur.fbr.om.model.measures.ScalarMeasure;
import nl.wur.fbr.om.model.measures.VectorMeasure;
import nl.wur.fbr.om.model.units.Unit;

/**
 * This class implements the specific methods for measures that have a vector as numerical value.
 *
 * @author Don Willems on 22/07/15.
 */
public class VectorMeasureImpl extends MeasureImpl implements VectorMeasure {

    /**
     * Creates a new {@link VectorMeasure} with the specified numerical vector value expressed in the specified Unit.
     *
     * @param value The vector as an array of numbers.
     * @param unit The unit.
     */
    public VectorMeasureImpl(Number[] value, Unit unit){
        super(value,unit);
    }

    /**
     * Creates a new {@link VectorMeasure} with the specified numerical double vector value expressed in the specified Unit.
     *
     * @param value The vector as an array of doubles.
     * @param unit The unit.
     */
    public VectorMeasureImpl(double[] value, Unit unit){
        super(value,unit);
    }

    /**
     * Returns the numerical value (as a vector) of this measure.
     *
     * @return The vector value.
     */
    @Override
    public Number[] getVectorValue() {
        return (Number[]) getNumericalValue();
    }

    /**
     * Returns the numerical value (as a vector of doubles) of this measure.
     *
     * @return The vector value.
     */
    @Override
    public double[] doubleValue() {
        Number[] vv = getVectorValue();
        double[] doublevalue = new double[vv.length];
        for(int i=0;i<doublevalue.length;i++) doublevalue[i] = vv[i].doubleValue();
        return doublevalue;
    }

    /**
     * Returns the magnitude of the vector value as a measure that contains a scalar as
     * the numerical value of the magnitude and the same units in which this measure is expressed.
     *
     * @return The magnitude of the vector.
     */
    @Override
    public ScalarMeasure getMagnitude() {
        Number[] val = this.getVectorValue();
        double magn = 0;
        for(int i=0;i<val.length;i++) magn+=Math.pow(val[i].doubleValue(),2);
        magn = Math.sqrt(magn);
        ScalarMeasure magnitude = new ScalarMeasureImpl(magn,this.getUnit());
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
        Number[] val = this.getVectorValue();
        double magn = 0;
        for(int i=0;i<val.length;i++) magn+=Math.pow(val[i].doubleValue(),2);
        magn = Math.sqrt(magn);
        double[] uvec = new double[val.length];
        for(int i=0;i<val.length;i++) uvec[i] = val[i].doubleValue()/magn;
        return uvec;
    }
}
