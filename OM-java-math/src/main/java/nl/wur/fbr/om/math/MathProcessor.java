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
     * Returns the quotient of the two measure and the double as a measure expressed in the same unit as the specified
     * parameter measure <code>numerator</code>.
     *
     * @param numerator The measure to be divided by the denominator measure.
     * @param denominator The double used to divide the numerator measure.
     * @return The quotient of the measure and the double expressed in the same unit as the <code>numerator</code>.
     */
    public Measure divide(Measure numerator, double denominator);
}
