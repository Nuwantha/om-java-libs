package nl.wur.fbr.om.math.impl;

import nl.wur.fbr.om.exceptions.ConversionException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.math.MathException;
import nl.wur.fbr.om.math.MathProcessor;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.units.UnitDivision;
import nl.wur.fbr.om.model.units.UnitExponentiation;
import nl.wur.fbr.om.model.units.UnitMultiplication;


/**
 * This class implements the default {@link MathProcessor} with implementations for a set of mathematical
 * operations on measures and points.
 *
 * @author Don Willems on 11/08/15.
 */
public class MathProcessorImpl implements MathProcessor {

    private InstanceFactory factory;

    /**
     * Creates the default implementation of a {@link MathProcessor}.
     * @param factory The instance factory used for creating and converting measures and points.
     */
    public MathProcessorImpl(InstanceFactory factory){
        this.factory = factory;
    }

    /**
     * Returns the instance factory that is used to create new measures and points and is used for conversion
     * between units and scales.
     *
     * @return The instance factory.
     */
    @Override
    public InstanceFactory getInstanceFactory() {
        return factory;
    }

    /**
     * Returns the sum of the two measures as a measure in the same unit as the augend measure.
     * The measures can only be added together when their units have the same
     * dimension. If their dimensions are dissimilar, an exception is thrown.
     *
     * @param augend The measure to which the addend measure is added.
     * @param addend The measure that is added to the augend measure.
     * @return The sum as a measure expressed in the unit of the augend measure.
     * @throws MathException When the two measures could not be added, for instance when the units could not be
     *                       converted to each other, i.e. have dissimilar dimensions, or when a scalar measure is added to a vector
     *                       measure.
     */
    @Override
    public Measure add(Measure augend, Measure addend) {
        double[] v1 = augend.getVectorValue();
        double[] v2 = addend.getVectorValue();
        if(v1.length == v2.length){
            try {
                v2 = factory.convertToUnit(addend, augend.getUnit()).getVectorValue();
            } catch (ConversionException e) {
                throw new MathException("Could not add "+addend+" to "+augend+" because the units could not be aligned.",e);
            }
            double[] a = new double[v1.length];
            for(int i=0;i<v1.length;i++){
                a[i] = v1[i]+v2[i];
            }
            return factory.createVectorMeasure(a, augend.getUnit());
        }
        throw new MathException("The measure could not be added to the point because the dimensions are not equal (e.g if they are vectors, they have a different size).");
    }

    /**
     * Returns the sum of the point on a measurement scale and a measure as a point on the same measurement scale as
     * the augend point.
     * The measure is seen as a difference measure
     * on the measurement scale, e.g. when adding the point at 10C on the Celsius scale and the measure 5K, which is not
     * a point on the Kelvin scale, but a temperature difference of 5 kelvin, the result will be 15C on the Celsius
     * scale.
     * The point and measure can only be added together when their units have the same
     * dimension. If their dimensions are dissimilar, an exception is thrown.
     *
     * @param augend The point to which the addend measure is added.
     * @param addend The measure that is added to the augend point.
     * @return The sum as a point on the same measurement scale as the augend point.
     * @throws MathException When the point and the measure could not be added, for instance when the units could not be
     *                       converted to each other, i.e. have dissimilar dimensions, or when a scalar measure is added to a vector point.
     */
    @Override
    public Point add(Point augend, Measure addend) {
        double[] v1 = augend.getVectorValue();
        double[] v2 = addend.getVectorValue();
        if(v1.length == v2.length){
            try {
                System.out.println("Converting: "+addend+ " to "+augend.getScale().getUnit()+" = "+ factory.convertToUnit(addend, augend.getScale().getUnit()));
                v2 = factory.convertToUnit(addend, augend.getScale().getUnit()).getVectorValue();
            } catch (ConversionException e) {
                throw new MathException("Could not add "+addend+" to "+augend+" because the units could not be aligned.",e);
            }
            double[] a = new double[v1.length];
            for(int i=0;i<v1.length;i++){
                a[i] = v1[i]+v2[i];
            }
            return factory.createVectorPoint(a, augend.getScale());
        }
        throw new MathException("The measure could not be added to the point because the dimensions are not equal (e.g if they are vectors, they have a different size).");
    }

    /**
     * Returns the difference between the two measures expressed in the unit of the minuend measure. The measures
     * can only be subtracted when their units have the same dimension. If their dimensions are dissimilar an
     * exception is thrown.
     *
     * @param minuend    The measure from which the subtrahend measure is to be subtracted.
     * @param subtrahend The measure that is to be subtracted from the minuend measure.
     * @return The difference as a measure expressed in the same unit as the minuend measure.
     * @throws MathException When the two measures could not be subtracted, for instance when the units could not be
     *                       converted to each other, i.e. have dissimilar dimensions, or when a scalar measure is subtracted from a vector
     *                       measure.
     */
    @Override
    public Measure subtract(Measure minuend, Measure subtrahend) {
        double[] v1 = minuend.getVectorValue();
        double[] v2 = subtrahend.getVectorValue();
        if(v1.length == v2.length){
            try {
                v2 = factory.convertToUnit(subtrahend, minuend.getUnit()).getVectorValue();
            } catch (ConversionException e) {
                throw new MathException("Could not subtract "+subtrahend+" from "+minuend+" because the units could not be aligned.",e);
            }
            double[] a = new double[v1.length];
            for(int i=0;i<v1.length;i++){
                a[i] = v1[i]-v2[i];
            }
            return factory.createVectorMeasure(a, minuend.getUnit());
        }
        throw new MathException("The measures could not be subtracted because the dimensions are not equal (e.g if they are vectors, they have a different size).");
    }

    /**
     * Returns a new point on the same measurement scale as the minuend point with the subtrahend measure subtracted.
     * The point and the measure can only be subtracted when their units have the same dimension.
     * If their dimensions are dissimilar an exception is thrown.
     *
     * @param minuend    The point from which the subtrahend measure is to be subtracted.
     * @param subtrahend The measure that is to be subtracted from the minuend point.
     * @return The difference as a measure expressed in the same unit as the minuend point.
     * @throws MathException When the measure could not be subtracted from the point, for instance when the units could not be
     *                       converted to each other, i.e. have dissimilar dimensions, or when a scalar measure is subtracted from a vector
     *                       point.
     */
    @Override
    public Point subtract(Point minuend, Measure subtrahend) {
        double[] v1 = minuend.getVectorValue();
        double[] v2 = subtrahend.getVectorValue();
        if(v1.length == v2.length){
            try {
                v2 = factory.convertToUnit(subtrahend, minuend.getScale().getUnit()).getVectorValue();
            } catch (ConversionException e) {
                throw new MathException("Could not subtract "+subtrahend+" from "+minuend+" because the units could not be aligned.",e);
            }
            double[] a = new double[v1.length];
            for(int i=0;i<v1.length;i++){
                a[i] = v1[i]-v2[i];
            }
            return factory.createVectorPoint(a, minuend.getScale());
        }
        throw new MathException("The measure could not be subtracted from the point because the dimensions are not equal (e.g if they are vectors, they have a different size).");
    }

    /**
     * Returns the difference between two points as a difference measure expressed in the units od the minuend point.
     * For instance the difference between 15C and 280.15K is 8C.
     * The point and the measure can only be subtracted when their units have the same dimension.
     * If their dimensions are dissimilar an exception is thrown.
     * <br>
     * For the difference between two measures or a point and a measure, use {@link #subtract(Measure, Measure)} or
     * {@link #subtract(Point, Measure)}.
     *
     * @param minuend    The point from which the subtrahend point is to be subtracted.
     * @param subtrahend The point that is to be subtracted from the minuend point.
     * @return The difference as a measure expressed in the same unit as the minuend point.
     * @throws MathException When the two point could not be subtracted, for instance when the units could not be
     *                       converted to each other, i.e. have dissimilar dimensions, or when a scalar point is subtracted from a vector
     *                       point.
     */
    @Override
    public Measure difference(Point minuend, Point subtrahend) {
        double[] v1 = minuend.getVectorValue();
        double[] v2 = subtrahend.getVectorValue();
        if(v1.length == v2.length){
            try {
                v2 = factory.convertToScale(subtrahend, minuend.getScale()).getVectorValue();
            } catch (ConversionException e) {
                throw new MathException("Could not subtract "+subtrahend+" from "+minuend+" because the units could not be aligned.",e);
            }
            double[] a = new double[v1.length];
            for(int i=0;i<v1.length;i++){
                a[i] = v1[i]-v2[i];
            }
            return factory.createVectorMeasure(a, minuend.getScale().getUnit());
        }
        throw new MathException("The points could not be subtracted because the dimensions are not equal (e.g if they are vectors, they have a different size).");
    }

    /**
     * Returns the product of the two measures as a measure expressed in a unit multiplication
     * {@link UnitMultiplication}. If the unit multiplication is not a known unit, the
     * processor will try to find a known unit with the same dimension as the unit multiplication. For instance,
     * when multiplying 2 N  with 12 AU, we get a measure 24 N.AU = 3.6e12 N.m.
     * <br>
     * NB. {@link Point Points} cannot be multiplied with {@link Measure measures}, as the result would be meaningless.
     * However, for instance in Planck's law j = sigma.T the absolute temperature is used as a difference measure
     * between the point on the temperature scale and absolute zero. You can use {@link Point#getDifferenceFromZero()}
     * as a measure.
     *
     * @param multiplicand The measure that is to be multiplied by the multiplier measure.
     * @param multiplier   The measure with which the multiplicand measure is to be multiplied.
     * @return The product of the two measures expressed in a unit that is a
     * {@link UnitMultiplication} of the units of the two measures.
     * @throws MathException When the two point could not be multiplied, for instance when both measures are vector
     *                       measures.
     */
    @Override
    public Measure multiply(Measure multiplicand, Measure multiplier) {
        double[] v1 = multiplicand.getVectorValue();
        double[] v2 = multiplier.getVectorValue();
        if(v1.length==1 || v2.length==1){
            Unit newUnit = factory.createUnitMultiplication(multiplicand.getUnit(),multiplier.getUnit()); //todo Find existing units
            if(v1.length==1 && v2.length>1){ //multiplication of scalar with vector
                double v[] = new double[v2.length];
                for(int i=0;i<v2.length;i++){
                    v[i] = v1[0]*v2[i];
                }
                return factory.createVectorMeasure(v,newUnit);
            }else if(v1.length>1 && v2.length==1){ //multiplication of vector with scalar.
                double v[] = new double[v1.length];
                for(int i=0;i<v1.length;i++){
                    v[i] = v1[i]*v2[0];
                }
                return factory.createVectorMeasure(v,newUnit);
            }else if(v1.length==1 && v2.length==1){ //multiplication of two scalars.
                return factory.createScalarMeasure(v1[0]*v2[0],newUnit);
            }
        }
        if(v1.length!=v2.length) throw new MathException("Cannot multiply two vectors of different size.");
        throw new MathException("Cannot multiply two vectors using multiply, use dotProduct or crossProduct for vector multiplication.");
    }

    /**
     * Returns the product of the a double and a measure as a measure expressed in the unit of the specified
     * parameter measure.
     *
     * @param multiplicand The measure that is to be multiplied by the multiplier measure.
     * @param multiplier   The double with which the multiplicand measure is to be multiplied.
     * @return The product of the double and the measure expressed in the same unit as the unit of the
     * <code>multiplicand</code>.
     */
    @Override
    public Measure multiply(Measure multiplicand, double multiplier) {
        double[] v1 = multiplicand.getVectorValue();
        if(v1.length>1){ //multiplication of vector with scalar.
            double v[] = new double[v1.length];
            for(int i=0;i<v1.length;i++){
                v[i] = v1[i]*multiplier;
            }
            return factory.createVectorMeasure(v,multiplicand.getUnit());
        }
        return factory.createScalarMeasure(v1[0] * multiplier, multiplicand.getUnit()); //multiplication of two scalars.
    }

    /**
     * Returns the quotient of the two measures as a measure expressed in a unit division
     * {@link UnitDivision}. If the unit division is not a known unit, the
     * processor will try to find a known unit with the same dimension as the unit division. For instance,
     * when dividing 20 AU by 5 s , we get a measure 4 AU/s = 3.6e12 m/s.
     * <br>
     * NB. {@link Point Points} cannot be divide by {@link Measure measures}, as the result would be meaningless.
     * However, for instance in Planck's law j = sigma.T the absolute temperature is used as a difference measure
     * between the point on the temperature scale and absolute zero. You can use {@link Point#getDifferenceFromZero()}
     * as a measure.
     *
     * @param numerator   The measure to be divided by the denominator measure.
     * @param denominator The measure used to divide the numerator measure.
     * @return The quotient of the two measures expressed in a unit that is a
     * {@link UnitDivision} of the units of the two measures.
     * @throws MathException When the two point could not be divided, for instance when both measures are vector
     *                       measures.
     */
    @Override
    public Measure divide(Measure numerator, Measure denominator) {
        double[] v1 = numerator.getVectorValue();
        double[] v2 = denominator.getVectorValue();
        if(v2.length==1){
            Unit newUnit = factory.createUnitDivision(numerator.getUnit(), denominator.getUnit()); //todo Find existing units
            if(v1.length>1 && v2.length==1){ //division of a vector with scalar.
                double v[] = new double[v1.length];
                for(int i=0;i<v1.length;i++){
                    v[i] = v1[i]/v2[0];
                }
                return factory.createVectorMeasure(v,newUnit);
            }else if(v1.length==1 && v2.length==1){ //division of two scalars.
                return factory.createScalarMeasure(v1[0]/v2[0],newUnit);
            }
        }
        if(v1.length!=v2.length) throw new MathException("Cannot multiply two vectors of different size.");
        throw new MathException("Cannot multiply two vectors using multiply, use dotProduct or crossProduct for vector multiplication.");
    }

    /**
     * Returns the quotient of the two measure and the double as a measure expressed in the same unit as the specified
     * parameter measure <code>numerator</code>.
     *
     * @param numerator   The measure to be divided by the denominator measure.
     * @param denominator The double used to divide the numerator measure.
     * @return The quotient of the measure and the double expressed in the same unit as the <code>numerator</code>.
     */
    @Override
    public Measure divide(Measure numerator, double denominator) {
        double[] v1 = numerator.getVectorValue();
        if(v1.length>1){ //division of a vector with scalar.
            double v[] = new double[v1.length];
            for(int i=0;i<v1.length;i++){
                v[i] = v1[i]/denominator;
            }
            return factory.createVectorMeasure(v,numerator.getUnit());
        }
        return factory.createScalarMeasure(v1[0]/denominator,numerator.getUnit()); //division of two scalars.
    }

    /**
     * Returns the sine of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose sine is to be determined.
     * @return The sine of the measure.
     */
    @Override
    public Measure sin(Measure measure) {
        return null;
    }

    /**
     * Returns the cosine of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose cosine is to be determined.
     * @return The cosine of the measure.
     */
    @Override
    public Measure cos(Measure measure) {
        return null;
    }

    /**
     * Returns the tangent of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose tangent is to be determined.
     * @return The tangent of the measure.
     */
    @Override
    public Measure tan(Measure measure) {
        return null;
    }

    /**
     * Returns the arc sine of the measure. The unit of the parameter should be dimensionless (for instance a unit
     * division of metre over metre). The resulting measure will have radians as a unit.
     *
     * @param measure The measure whose arc sine is to be determined.
     * @return The arc sine of the measure.
     */
    @Override
    public Measure asin(Measure measure) {
        return null;
    }

    /**
     * Returns the arc cosine of the measure. The unit of the parameter should be dimensionless (for instance a unit
     * division of metre over metre). The resulting measure will have radians as a unit.
     *
     * @param measure The measure whose arc cosine is to be determined.
     * @return The arc cosine of the measure.
     */
    @Override
    public Measure acos(Measure measure) {
        return null;
    }

    /**
     * Returns the arc tangent of the measure. The unit of the parameter should be dimensionless (for instance a unit
     * division of metre over metre). The resulting measure will have radians as a unit.
     *
     * @param measure The measure whose arc tangent is to be determined.
     * @return The arc tangent of the measure.
     */
    @Override
    public Measure atan(Measure measure) {
        return null;
    }

    /**
     * Returns Euler's number raised to the power of the parameter. The unit of the parameter should be dimensionless.
     * The resulting measure will also be dimensionless.
     *
     * @param measure The measure to raise e to.
     * @return The value of e<sup>measure</sup>.
     */
    @Override
    public Measure exp(Measure measure) {
        return null;
    }

    /**
     * Returns the natural logarithm of the parameter. The unit of the parameter should be dimensionless.
     * The resulting measure will also be dimensionless.
     *
     * @param measure The measure for which the logarithm needs to be determined.
     * @return The natural logarithm of the parameter.
     */
    @Override
    public Measure log(Measure measure) {
        return null;
    }

    /**
     * Returns the base 10 logarithm of the parameter. The unit of the parameter should be dimensionless.
     * The resulting measure will also be dimensionless.
     *
     * @param measure The measure for which the logarithm needs to be determined.
     * @return The base 10 logarithm of the parameter.
     */
    @Override
    public Measure log10(Measure measure) {
        return null;
    }

    /**
     * Returns the square root of the parameter. The unit of the resulting measure will be the square root of
     * the unit of the parameter. For instance, the square root of 16 m^2 will be 4 m.
     *
     * @param measure The measure for which the square root needs to be determined.
     * @return The square root of the parameter.
     */
    @Override
    public Measure sqrt(Measure measure) {
        double[] m = measure.getVectorValue();
        double[] sqrt = new double[m.length];
        for(int i=0;i<m.length;i++){
            sqrt[i] = Math.sqrt(m[i]);
        }
        Unit newUnit = null;
        if(measure.getUnit() instanceof UnitExponentiation){
            UnitExponentiation ue = (UnitExponentiation)measure.getUnit();
            if(Math.abs(ue.getExponent()-2.0)<0.0000001) newUnit = ue.getBase();
            else{
                newUnit = factory.createUnitExponentiation(ue.getBase(),ue.getExponent()/2.); // todo find existing unit
            }
        }else{
            newUnit = factory.createUnitExponentiation(measure.getUnit(),0.5); // todo find existing unit
        }
        return factory.createVectorMeasure(sqrt,newUnit);
    }

    /**
     * Returns the cubic root of the parameter. The unit of the resulting measure will be the cubic root of
     * the unit of the parameter. For instance, the cubic root of 64 m^3 will be 4 m.
     *
     * @param measure The measure for which the cubic root needs to be determined.
     * @return The cubic root of the parameter.
     */
    @Override
    public Measure cbrt(Measure measure) {
        double[] m = measure.getVectorValue();
        double[] cbrt = new double[m.length];
        for(int i=0;i<m.length;i++){
            cbrt[i] = Math.cbrt(m[i]);
        }
        Unit newUnit = null;
        if(measure.getUnit() instanceof UnitExponentiation){
            UnitExponentiation ue = (UnitExponentiation)measure.getUnit();
            if(Math.abs(ue.getExponent()-3.0)<0.0000001) newUnit = ue.getBase();
            else{
                newUnit = factory.createUnitExponentiation(ue.getBase(),ue.getExponent()/3.); // todo find existing unit
            }
        }else{
            newUnit = factory.createUnitExponentiation(measure.getUnit(),1./3.); // todo find existing unit
        }
        return factory.createVectorMeasure(cbrt,newUnit);
    }

    /**
     * Returns the absolute value of the specified measure expressed in the same unit as the parameter.
     *
     * @param measure The measurement whose absolute value is to be determined.
     * @return The absolute value.
     */
    @Override
    public Measure abs(Measure measure) {
        double[] m = measure.getVectorValue();
        double[] abs = new double[m.length];
        for(int i=0;i<m.length;i++){
            abs[i] = Math.abs(m[i]);
        }
        return factory.createVectorMeasure(abs,measure.getUnit());
    }
}
