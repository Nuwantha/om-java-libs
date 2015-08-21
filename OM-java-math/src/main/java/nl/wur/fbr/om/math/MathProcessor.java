package nl.wur.fbr.om.math;

import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;

/**
 * Defines the methods that need to be implemented by a math processor to be able to operate on measures and
 * points on a measurement scale. Instances of math processors can be set in the {@link Math} static class, which
 * provides the interface to the user.
 *
 * @author Don Willems on 11/08/15.
 */
public interface MathProcessor {

    /**
     * Returns the instance factory that is used to create new measures and points and is used for conversion
     * between units and scales.
     * @return The instance factory.
     */
    public InstanceFactory getInstanceFactory();

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
    public Measure add(Measure augend,Measure addend);

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
    public Point add(Point augend,Measure addend);

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
    public Measure subtract(Measure minuend, Measure subtrahend);

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
    public Point subtract(Point minuend, Measure subtrahend);

    /**
     * Returns the difference between two points as a difference measure expressed in the units od the minuend point.
     * For instance the difference between 15C and 280.15K is 8C.
     * The point and the measure can only be subtracted when their units have the same dimension.
     * If their dimensions are dissimilar an exception is thrown.
     *
     * @param minuend The point from which the subtrahend point is to be subtracted.
     * @param subtrahend The point that is to be subtracted from the minuend point.
     * @return The difference as a measure expressed in the same unit as the minuend point.
     * @throws MathException When the two point could not be subtracted, for instance when the units could not be
     * converted to each other, i.e. have dissimilar dimensions, or when a scalar point is subtracted from a vector
     * point.
     */
    public Measure difference(Point minuend, Point subtrahend);

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
    public Measure multiply(Measure multiplicand, Measure multiplier);

    /**
     * Returns the product of the a double and a measure as a measure expressed in the unit of the specified
     * parameter measure.
     *
     * @param multiplicand The measure that is to be multiplied by the multiplier measure.
     * @param multiplier The double with which the multiplicand measure is to be multiplied.
     * @return The product of the double and the measure expressed in the same unit as the unit of the
     * <code>multiplicand</code>.
     * @throws MathException When the multiplicand is not a vector.
     */
    public Measure multiply(Measure multiplicand, double multiplier);

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
    public Measure divide(Measure numerator, Measure denominator);

    /**
     * Returns the quotient of the measure and the double as a measure expressed in the same unit as the specified
     * parameter measure <code>numerator</code>.
     *
     * @param numerator The measure to be divided by the denominator double value.
     * @param denominator The double used to divide the numerator measure.
     * @return The quotient of the measure and the double expressed in the same unit as the <code>numerator</code>.
     * @throws MathException When the numerator is not a vector or scalar.
     */
    public Measure divide(Measure numerator, double denominator);

    /**
     * Returns the quotient of the double and the measure as a measure expressed in the reciprocal unit of the specified
     * parameter measure <code>denominator</code>.
     *
     * @param numerator The double value to be divided by the denominator measure.
     * @param denominator The measure used to divide the numerator double value.
     * @return The quotient of the double value and the measure expressed in the same unit as the <code>numerator</code>.
     * @throws MathException When the denominator measure is not a scalar value.
     */
    public Measure divide(double numerator, Measure denominator);

    /**
     * Returns the sine of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose sine is to be determined.
     * @return The sine of the measure.
     * @throws MathException When the measure contains a vector, which cannot be converted to an angle or
     * when the unit of the measure is not dimensionless, or when the unit One was not defined.
     */
    public Measure sin(Measure measure);

    /**
     * Returns the cosine of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose cosine is to be determined.
     * @return The cosine of the measure.
     * @throws MathException When the measure contains a vector, which cannot be converted to an angle or
     * when the unit of the measure is not dimensionless, or when the unit One was not defined.
     */
    public Measure cos(Measure measure);

    /**
     * Returns the tangent of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose tangent is to be determined.
     * @return The tangent of the measure.
     * @throws MathException When the measure contains a vector, which cannot be converted to an angle or
     * when the unit of the measure is not dimensionless, or when the unit One was not defined.
     */
    public Measure tan(Measure measure);

    /**
     * Returns the arc sine of the measure. The unit of the parameter should be dimensionless (for instance a unit
     * division of metre over metre). The resulting measure will have radians as a unit.
     *
     * @param measure The measure whose arc sine is to be determined.
     * @return The arc sine of the measure.
     * @throws MathException When the measure could not be converted to unit One, e.g. because the measure is not dimensionless,
     * or when the radian unit was not defined.
     */
    public Measure asin(Measure measure);

    /**
     * Returns the arc cosine of the measure. The unit of the parameter should be dimensionless (for instance a unit
     * division of metre over metre). The resulting measure will have radians as a unit.
     *
     * @param measure The measure whose arc cosine is to be determined.
     * @return The arc cosine of the measure.
     * @throws MathException When the measure could not be converted to unit One, e.g. because the measure is not dimensionless,
     * or when the radian unit was not defined.
     */
    public Measure acos(Measure measure);

    /**
     * Returns the arc tangent of the measure. The unit of the parameter should be dimensionless (for instance a unit
     * division of metre over metre). The resulting measure will have radians as a unit.
     *
     * @param measure The measure whose arc tangent is to be determined.
     * @return The arc tangent of the measure.
     * @throws MathException When the measure could not be converted to unit One, e.g. because the measure is not dimensionless,
     * or when the radian unit was not defined.
     */
    public Measure atan(Measure measure);

    /**
     * Returns Euler's number raised to the power of the parameter. The unit of the parameter should be dimensionless.
     * The resulting measure will also be dimensionless.
     *
     * @param measure The measure to raise e to.
     * @return The value of e<sup>measure</sup>.
     * @throws MathException When the measure could not be converted to unit One, e.g. because the measure is not dimensionless,
     * or when the unit One was not defined, or when the measure is not a vector (or scalar value).
     */
    public Measure exp(Measure measure);

    /**
     * Returns the natural logarithm of the parameter. The unit of the parameter should be dimensionless.
     * The resulting measure will also be dimensionless.
     *
     * @param measure The measure for which the logarithm needs to be determined.
     * @return The natural logarithm of the parameter.
     * @throws MathException When the measure could not be converted to unit One, e.g. because the measure is not dimensionless,
     * or when the unit One was not defined, or when the measure is not a vector (or scalar value).
     */
    public Measure log(Measure measure);

    /**
     * Returns the base 10 logarithm of the parameter. The unit of the parameter should be dimensionless.
     * The resulting measure will also be dimensionless.
     *
     * @param measure The measure for which the logarithm needs to be determined.
     * @return The base 10 logarithm of the parameter.
     * @throws MathException When the measure could not be converted to unit One, e.g. because the measure is not dimensionless,
     * or when the unit One was not defined, or when the measure is not a vector (or scalar value).
     */
    public Measure log10(Measure measure);

    /**
     * Returns the square root of the parameter. The unit of the resulting measure will be the square root of
     * the unit of the parameter. For instance, the square root of 16 m^2 will be 4 m.
     *
     * @param measure The measure for which the square root needs to be determined.
     * @return The square root of the parameter.
     * @throws MathException When the parameter is not a scalar or vector.
     */
    public Measure sqrt(Measure measure);

    /**
     * Returns the cubic root of the parameter. The unit of the resulting measure will be the cubic root of
     * the unit of the parameter. For instance, the cubic root of 64 m^3 will be 4 m.
     *
     * @param measure The measure for which the cubic root needs to be determined.
     * @return The cubic root of the parameter.
     * @throws MathException When the parameter is not a scalar or vector.
     */
    public Measure cbrt(Measure measure);

    /**
     * Returns the angle from the conversion of rectangular coordinates (x,y) to polar coordinates (r,angle).
     * Both coordinates should have the same dimension and be convertable into each other.
     *
     * @param x The ordinate coordinate.
     * @param y The abscissa coordinate.
     * @return The absolute value.
     * @throws MathException When the parameters do not have the same dimension or are not convertible, or because the
     * radian unit was not defined, or when one of the parameters was not a scalar.
     */
    public Measure atan2(Measure y,Measure x);

    /**
     * Returns the exponentiation of the base to the power of the exponent, i.e. base<sup>exponent</sup>.
     * This method takes a double value (i.e. a dimensionless constant) for the exponent.
     * The unit of the result is equal to the unit of the base raised to the power of the exponent, for instance
     * 2 m raised the power of 3 (pow(2 m, 3)) is equal to 8 m^3.
     *
     * @param base The base measure which is raised to the power of the exponent.
     * @param exponent The exponent value.
     * @return The base raised to the power of the exponent.
     * @throws MathException When the base parameter is not a scalar.
     */
    public Measure pow(Measure base, double exponent);

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
     * @throws MathException When the measure could not be converted to unit One, e.g. because the measure is not dimensionless,
     * or when the unit One was not defined, or when the measure is not a vector (or scalar value).
     */
    public Measure pow(double base, Measure exponent);

    /**
     * Returns the absolute value of the specified measure expressed in the same unit as the parameter.
     *
     * @param measure The measurement whose absolute value is to be determined.
     * @return The absolute value.
     * @throws MathException When the parameter is not a scalar or vector.
     */
    public Measure abs(Measure measure);

    /**
     * Returns the hyperbolic sine of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose hyperbolic sine is to be determined.
     * @return The hyperbolic sine of the measure.
     * @throws MathException When the measure contains a vector, which cannot be converted to an angle or
     * when the unit of the measure is not dimensionless, or when the unit One was not defined.
     */
    public Measure sinh(Measure measure);

    /**
     * Returns the hyperbolic cosine of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose hyperbolic cosine is to be determined.
     * @return The hyperbolic cosine of the measure.
     * @throws MathException When the measure contains a vector, which cannot be converted to an angle or
     * when the unit of the measure is not dimensionless, or when the unit One was not defined.
     */
    public Measure cosh(Measure measure);
    /**
     * Returns the hyperbolic tangent of the measure. The unit of the parameter should be an angle unit (e.g. radian or degree) or
     * should have the same dimension as the angle units, i.e. be dimensionless. The unit of the result will also
     * be dimensionless.
     *
     * @param measure The measure whose hyperbolic tangent is to be determined.
     * @return The hyperbolic tangent of the measure.
     * @throws MathException When the measure contains a vector, which cannot be converted to an angle or
     * when the unit of the measure is not dimensionless, or when the unit One was not defined.
     */
    public Measure tanh(Measure measure);

    /**
     * Returns the length of the hypotenuse of a right-angled rectangle, i.e. the longest side of the rectangle, which is the
     * side opposite to the right angle. The length of the hypotenuse (h) can be calculated by using the Pythagorean
     * theorem h = sqrt(x<sup>2</sup>,y<sup>2</sup>). <br>
     * The units of the parameters <code>x</code> and <code>y</code> should have the same dimension.
     * The unit of the result is equal to the unit of <code>x</code>.
     *
     * @param x The first side of the right-angles rectangle, not opposite to the right angle.
     * @param y The second side of the right-angles rectangle, not opposite to the right angle.
     * @return The hypothenus, i.e. longest side of the right-angled rectangle.
     */
    public Measure hypot(Measure x,Measure y);

    /**
     * Returns the magnitude of the vector value as a measure that contains a scalar as
     * the numerical value of the magnitude and in the same unit in which this measure is expressed.
     * @param vector The vector measure whose magnitude is to be determined.
     * @return The magnitude of the vector.
     * @throws MathException When the parameter measure is not a vector.
     */
    public Measure magnitude(Measure vector);

    /**
     * Returns the unit vector of the vector measure. The unit vector is the normalised vector, i.e.
     * all values in the vector are divided by the magnitude of the vector. No unit is associated with
     * the unit vector.
     * @param vector The vector measure whose unit vector is to be determined.
     * @return The unit vector.
     * @throws MathException When the parameter measure is not a vector.
     */
    public double[] unitVector(Measure vector);

    /**
     * Returns the magnitude of the vector point as a measure that contains a scalar as
     * the numerical value of the magnitude and in the same unit in which the point is expressed.
     * @param vector The vector point whose magnitude is to be determined.
     * @return The magnitude of the vector.
     * @throws MathException When the parameter point is not a vector.
     */
    public Measure magnitude(Point vector);

    /**
     * Returns the unit vector of the vector point. The unit vector is the normalised vector, i.e.
     * all values in the vector are divided by the magnitude of the vector. No unit is associated with
     * the unit vector.
     * @param vector The vector point whose unit vector is to be determined.
     * @return The unit vector.
     * @throws MathException When the parameter point is not a vector.
     */
    public double[] unitVector(Point vector);

    /**
     * Returns the dot product of two vector measures. This method throws a {@link MathException} when one of the
     * measures is not a vector or when the number of components is not equal. <br>
     * Both vectors should have the same dimension. The unit of the dot product is the unit of the first vector
     * squared.
     *
     * @param vector1 The first vector in the dot product.
     * @param vector2 The second vector in the dot product.
     * @return The dot product (a scalar measure).
     * @throws MathException When the parameters are not vectors, do not have the same size, or are not convertible
     * into each other.
     */
    public Measure dotProduct(Measure vector1, Measure vector2);

    /**
     * Returns the cross product of two 3D vector measures. This method throws a {@link MathException} when one of the
     * measures is not a vector or when the number of components is not equal to three. <br>
     * Both vectors should have the same dimension. The unit of the dot product is the unit of the first vector
     * squared.
     *
     * @param vector1 The first vector in the dot product.
     * @param vector2 The second vector in the dot product.
     * @return The cross product (a vector measure).
     * @throws MathException When the parameters are not vectors, are not three dimensional, or are not convertible
     * into each other.
     */
    public Measure crossProduct(Measure vector1, Measure vector2);
}
