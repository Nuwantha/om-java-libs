package nl.wur.fbr.om.core.impl.points;

import nl.wur.fbr.om.core.impl.measures.ScalarMeasureImpl;
import nl.wur.fbr.om.model.measures.ScalarMeasure;
import nl.wur.fbr.om.model.points.VectorPoint;
import nl.wur.fbr.om.model.scales.Scale;

/**
 * The core implementation for a point that has a vector as numerical value.
 *
 * @author Don Willems on 28/07/15.
 */
public class VectorPointImpl extends PointImpl implements VectorPoint {

    /**
     * Creates a new {@link VectorPoint} with the specified numerical vector value in the specified scale and
     * expressed in the unit associated with teh scale.
     *
     * @param value The vector as an array of numbers.
     * @param scale The scale.
     */
    public VectorPointImpl(Number[] value, Scale scale){
        super(value,scale);
    }

    /**
     * Creates a new {@link VectorPoint} with the specified numerical double vector value in the specified scale and
     * expressed in the unit associated with teh scale.
     *
     * @param value The vector as an array of doubles.
     * @param scale The scale.
     */
    public VectorPointImpl(double[] value, Scale scale){
        super(value,scale);
    }

    /**
     * Returns the numerical value (as a vector) of this point.
     *
     * @return The vector value.
     */
    @Override
    public Number[] getVectorValue() {
        return (Number[]) getNumericalValue();
    }

    /**
     * Returns the numerical value (as a vector of doubles) of this point.
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
     * the numerical value of the magnitude and the same units in which this point is expressed.
     *
     * @return The magnitude of the vector.
     */
    @Override
    public ScalarMeasure getMagnitude() {
        Number[] val = this.getVectorValue();
        double magn = 0;
        for(int i=0;i<val.length;i++) magn+=Math.pow(val[i].doubleValue(),2);
        magn = Math.sqrt(magn);
        ScalarMeasure magnitude = new ScalarMeasureImpl(magn,this.getScale().getUnit());
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
        Number[] val = this.getVectorValue();
        double magn = 0;
        for(int i=0;i<val.length;i++) magn+=Math.pow(val[i].doubleValue(),2);
        magn = Math.sqrt(magn);
        double[] uvec = new double[val.length];
        for(int i=0;i<val.length;i++) uvec[i] = val[i].doubleValue()/magn;
        return uvec;
    }
}
