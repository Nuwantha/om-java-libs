package nl.wur.fbr.om.math;

import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;

/**
 * This class provides static access to mathematical operators which can handle measures and points on a measurement
 * scale. The actual mathematical processing should be done in implementations of {@link MathProcessor}. An instance of
 * a {@link MathProcessor} needs to be provided with {@link #setMathProcessor(MathProcessor)}.
 * @author Don Willems on 11/08/15.
 */
public class Math {

    /** The math processor used in the calculations. */
    private static MathProcessor processor;

    /**
     * Returns the math processor currently used when performing mathematical operations on measures or points on a
     * measurement scale.
     * @return The math processor.
     */
    public static MathProcessor getMathProcessor(){
        return processor;
    }

    /**
     * Sets the math processor to be used when performing mathematical operations on measures or points on a
     * measurement scale.
     * @param mathProcessor The math processor.
     */
    public static void setMathProcessor(MathProcessor mathProcessor){
        Math.processor = mathProcessor;
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
     * converted to each other, i.e. have dissimilar dimensions, or when a scalar measure is added to a vector
     * measure.
     */
    public static Measure add(Measure augend,Measure addend){
        return processor.add(augend,addend);
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
     * converted to each other, i.e. have dissimilar dimensions, or when a scalar measure is added to a vector point.
     */
    public static Point add(Point augend,Measure addend){
        return processor.add(augend, addend);
    }

    /**
     * Returns the difference between the two measures expressed in the unit of the minuend measure. The measures
     * can only be subtracted when their units have the same dimension. If their dimensions are dissimilar an
     * exception is thrown.
     * <br>
     * To subtract two points on a measurement scale (i.e. find the difference) use {@link #difference(Point, Point)}.
     *
     * @param minuend The measure from which the subtrahend measure is to be subtracted.
     * @param subtrahend The measure that is to be subtracted from the minuend measure.
     * @return The difference as a measure expressed in the same unit as the minuend measure.
     * @throws MathException When the two measures could not be subtracted, for instance when the units could not be
     * converted to each other, i.e. have dissimilar dimensions, or when a scalar measure is subtracted from a vector
     * measure.
     */
    public static Measure subtract(Measure minuend, Measure subtrahend){
        return processor.subtract(minuend, subtrahend);
    }

    /**
     * Returns a new point on the same measurement scale as the minuend point with the subtrahend measure subtracted.
     * The point and the measure can only be subtracted when their units have the same dimension.
     * If their dimensions are dissimilar an exception is thrown.
     * <br>
     * To subtract two points on a measurement scale (i.e. find the difference) use {@link #difference(Point, Point)}.
     *
     * @param minuend The point from which the subtrahend measure is to be subtracted.
     * @param subtrahend The measure that is to be subtracted from the minuend point.
     * @return The difference as a measure expressed in the same unit as the minuend point.
     * @throws MathException When the measure could not be subtracted from the point, for instance when the units could not be
     * converted to each other, i.e. have dissimilar dimensions, or when a scalar measure is subtracted from a vector
     * point.
     */
    public static Point subtract(Point minuend, Measure subtrahend){
        return processor.subtract(minuend, subtrahend);
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
     * @param minuend The point from which the subtrahend point is to be subtracted.
     * @param subtrahend The point that is to be subtracted from the minuend point.
     * @return The difference as a measure expressed in the same unit as the minuend point.
     * @throws MathException When the two point could not be subtracted, for instance when the units could not be
     * converted to each other, i.e. have dissimilar dimensions, or when a scalar point is subtracted from a vector
     * point.
     */
    public static Measure difference(Point minuend, Point subtrahend){
        return processor.difference(minuend, subtrahend);
    }

    /**
     * Returns the product of the two measures as a measure expressed in a unit multiplication
     * {@link nl.wur.fbr.om.model.units.UnitMultiplication}. If the unit multiplication is not a known unit, the
     * processor will try to find a known unit with the same dimension as the unit multiplication. For instance,
     * when multiplying 2 N  with 12 AU, we get a measure 24 N.AU = 3.6e12 N.m.
     * <br>
     * NB. {@link Point Points} cannot be multiplied with {@link Measure measures}, as the result would be meaningless.
     * However, for instance in Planck's law j = sigma.T the absolute temperature is used as a difference measure
     * between the point on the temperature scale and absolute zero. You can use {@link Point#getDifferenceFromZero()}
     * as a measure.
     *
     * @param multiplicand The measure that is to be multiplied by the multiplier measure.
     * @param multiplier The measure with which the multiplicand measure is to be multiplied.
     * @return The product of the two measures expressed in a unit that is a
     * {@link nl.wur.fbr.om.model.units.UnitMultiplication} of the units of the two measures.
     * @throws MathException When the two point could not be multiplied, for instance when both measures are vector
     * measure.
     */
    public static Measure multiply(Measure multiplicand, Measure multiplier){
        return processor.multiply(multiplicand, multiplier);
    }

    /**
     * Returns the product of the a double and a measure as a measure expressed in the unit of the specified
     * parameter measure.
     *
     * @param multiplicand The measure that is to be multiplied by the multiplier measure.
     * @param multiplier The double with which the multiplicand measure is to be multiplied.
     * @return The product of the double and the measure expressed in the same unit as the unit of the
     * <code>multiplicand</code>.
     */
    public static Measure multiply(Measure multiplicand, double multiplier){
        return processor.multiply(multiplicand, multiplier);
    }

    /**
     * Returns the quotient of the two measures as a measure expressed in a unit division
     * {@link nl.wur.fbr.om.model.units.UnitDivision}. If the unit division is not a known unit, the
     * processor will try to find a known unit with the same dimension as the unit division. For instance,
     * when dividing 20 AU by 5 s , we get a measure 4 AU/s = 3.6e12 m/s.
     * <br>
     * NB. {@link Point Points} cannot be divide by {@link Measure measures}, as the result would be meaningless.
     * However, for instance in Planck's law j = sigma.T the absolute temperature is used as a difference measure
     * between the point on the temperature scale and absolute zero. You can use {@link Point#getDifferenceFromZero()}
     * as a measure.
     *
     * @param numerator The measure to be divided by the denominator measure.
     * @param denominator The measure used to divide the numerator measure.
     * @return The quotient of the two measures expressed in a unit that is a
     * {@link nl.wur.fbr.om.model.units.UnitDivision} of the units of the two measures.
     * @throws MathException When the two point could not be divided, for instance when both measures are vector
     * measure.
     */
    public static Measure divide(Measure numerator, Measure denominator){
        return processor.divide(numerator, denominator);
    }

    /**
     * Returns the quotient of the two measure and the double as a measure expressed in the same unit as the specified
     * parameter measure <code>numerator</code>.
     *
     * @param numerator The measure to be divided by the denominator measure.
     * @param denominator The double used to divide the numerator measure.
     * @return The quotient of the measure and the double expressed in the same unit as the <code>numerator</code>.
     */
    public static Measure divide(Measure numerator, double denominator){
        return processor.divide(numerator, denominator);
    }

    /**
     * Returns the sine of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose sine is to be determined.
     * @return The sine of the measure.
     */
    public static Measure sin(Measure measure){
        return processor.sin(measure);
    }

    /**
     * Returns the cosine of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose cosine is to be determined.
     * @return The cosine of the measure.
     */
    public static Measure cos(Measure measure){
        return processor.cos(measure);
    }

    /**
     * Returns the tangent of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose tangent is to be determined.
     * @return The tangent of the measure.
     */
    public static Measure tan(Measure measure){
        return processor.tan(measure);
    }

    /**
     * Returns the arc sine of the measure. The unit of the parameter should be dimensionless (for instance a unit
     * division of metre over metre). The resulting measure will have radians as a unit.
     *
     * @param measure The measure whose arc sine is to be determined.
     * @return The arc sine of the measure.
     */
    public static Measure asin(Measure measure){
        return processor.asin(measure);
    }

    /**
     * Returns the arc cosine of the measure. The unit of the parameter should be dimensionless (for instance a unit
     * division of metre over metre). The resulting measure will have radians as a unit.
     *
     * @param measure The measure whose arc cosine is to be determined.
     * @return The arc cosine of the measure.
     */
    public static Measure acos(Measure measure){
        return processor.acos(measure);
    }

    /**
     * Returns the arc tangent of the measure. The unit of the parameter should be dimensionless (for instance a unit
     * division of metre over metre). The resulting measure will have radians as a unit.
     *
     * @param measure The measure whose arc tangent is to be determined.
     * @return The arc tangent of the measure.
     */
    public static Measure atan(Measure measure){
        return processor.atan(measure);
    }

    /**
     * Returns Euler's number raised to the power of the parameter. The unit of the parameter should be dimensionless.
     * The resulting measure will also be dimensionless.
     *
     * @param measure The measure to raise e to.
     * @return The value of e<sup>measure</sup>.
     */
    public static Measure exp(Measure measure){
        return processor.exp(measure);
    }

    /**
     * Returns the natural logarithm of the parameter. The unit of the parameter should be dimensionless.
     * The resulting measure will also be dimensionless.
     *
     * @param measure The measure for which the logarithm needs to be determined.
     * @return The natural logarithm of the parameter.
     */
    public static Measure log(Measure measure){
        return processor.log(measure);
    }

    /**
     * Returns the base 10 logarithm of the parameter. The unit of the parameter should be dimensionless.
     * The resulting measure will also be dimensionless.
     *
     * @param measure The measure for which the logarithm needs to be determined.
     * @return The base 10 logarithm of the parameter.
     */
    public static Measure log10(Measure measure){
        return processor.log10(measure);
    }

    /**
     * Returns the square root of the parameter. The unit of the resulting measure will be the square root of
     * the unit of the parameter. For instance, the square root of 16 m^2 will be 4 m.
     *
     * @param measure The measure for which the square root needs to be determined.
     * @return The square root of the parameter.
     */
    public static Measure sqrt(Measure measure){
        return processor.sqrt(measure);
    }

    /**
     * Returns the cubic root of the parameter. The unit of the resulting measure will be the cubic root of
     * the unit of the parameter. For instance, the cubic root of 64 m^3 will be 4 m.
     *
     * @param measure The measure for which the cubic root needs to be determined.
     * @return The cubic root of the parameter.
     */
    public static Measure cbrt(Measure measure){
        return processor.cbrt(measure);
    }

    /**
     * Returns the angle from the conversion of rectangular coordinates (x,y) to polar coordinates (r,angle).
     * Both coordinates should have the same dimension and be convertable into each other.
     *
     * @param x The ordinate coordinate.
     * @param y The abscissa coordinate.
     * @return The absolute value.
     */
    public static Measure atan2(Measure y,Measure x){
        return processor.atan2(y, x);
    }

    /**
     * Returns the exponentiation of the base to the power of the exponent, i.e. base<sup>exponent</sup>.
     * This method takes a double value (i.e. a dimensionless constant) for the exponent.
     * The unit of the result is equal to the unit of the base raised to the power of the exponent, for instance
     * 2 m raised the power of 3 (pow(2 m, 3)) is equal to 8 m^3.
     *
     * @param base The base measure which is raised to the power of the exponent.
     * @param exponent The exponent value.
     * @return The base raised to the power of the exponent.
     */
    public static Measure pow(Measure base, double exponent){
        return processor.pow(base, exponent);
    }

    /**
     * Returns the exponentiation of the base to the power of the exponent, i.e. base<sup>exponent</sup>.
     * This method takes a double value (i.e. a dimensionless constant) as the base and a measure as the exponent.
     * The exponent measure should have a dimensionless unit and be convertible to the unit One.
     * THe exponent measure can be a vector.
     * The result is expressed in unit One.
     *
     * @param base The base value which is raised to the power of the exponent.
     * @param exponent The exponent measure.
     * @return The base raised to the power of the exponent.
     */
    public static Measure pow(double base, Measure exponent){
        return processor.pow(base, exponent);
    }

    /**
     * Returns the absolute value of the specified measure expressed in the same unit as the parameter.
     *
     * @param measure The measurement whose absolute value is to be determined.
     * @return The absolute value.
     */
    public static Measure abs(Measure measure) {
        return processor.abs(measure);
    }

    /**
     * Returns the hyperbolic sine of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose hyperbolic sine is to be determined.
     * @return The hyperbolic sine of the measure.
     */
    public static Measure sinh(Measure measure){
        return processor.sinh(measure);
    }

    /**
     * Returns the hyperbolic cosine of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose hyperbolic cosine is to be determined.
     * @return The hyperbolic cosine of the measure.
     */
    public static Measure cosh(Measure measure){
        return processor.cosh(measure);
    }

    /**
     * Returns the hyperbolic tangent of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose hyperbolic tangent is to be determined.
     * @return The hyperbolic tangent of the measure.
     */
    public static Measure tanh(Measure measure){
        return processor.tanh(measure);
    }

    /**
     * Returns the length of the hypotenuse of a right-angled rectangle, i.e. the longest side of the rectangle, which is the
     * side opposite to the right angle. The length of the hypotenuse (h) can be calculated by using the Pythagorean
     * theorem h = sqrt(x<sup>2</sup>,y<sup>2</sup>). <br>
     * The units of the parameters <code>x</code> and <code>y</code> should have the same dimension.
     * The unit of the result is equal to the unit of <code>x</code>.
     *
     * @param x The first side of the right-angles rectangle, not opposite to the right angle.
     * @param y The second side of the right-angles rectangle, not opposite to the right angle.
     * @return The hypotenuse, i.e. longest side of the right-angled rectangle.
     */
    public static Measure hypot(Measure x,Measure y){
        return processor.hypot(x,y);
    }
}
