package nl.wur.fbr.om.factory;



import nl.wur.fbr.om.exceptions.ConversionException;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.Unit;

/**
 * Implementations of this factory can be used to convert between units and for comparing measures and
 * points.
 * @author Don Willems on 16/07/15.
 */
public interface UnitAndScaleConversionFactory {

    /**
     * Converts a double value expressed in the specified unit to the target unit.
     * @param value The double value.
     * @param unit The unit in which the double is expressed.
     * @param targetUnit The target unit into which the double should be converted.
     * @return The converted value expressed in the target unit.
     * @throws ConversionException When the double could not be converted to the specified target unit.
     */
    public double convert(double value, Unit unit, Unit targetUnit) throws ConversionException;

    /**
     * Converts a double value on the specified measurement scalte to the target measurement scale.
     * @param value The double value.
     * @param scale The unit in which the double is expressed.
     * @param targetScale The target unit into which the double should be converted.
     * @return The converted value expressed in the target unit.
     * @throws ConversionException When the double could not be converted to the specified target unit.
     */
    public double convert(double value, Scale scale, Scale targetScale) throws ConversionException;

    /**
     * Converts a measure (a numerical value expressed in a specific unit) to a target unit.
     * @param measure The measure to be converted to the target unit.
     * @param targetUnit The target unit to which the measurement is to be converted.
     * @return The converted measure.
     * @throws ConversionException When the measure could not be converted to the specified target unit.
     */
    public Measure convertToUnit(Measure measure, Unit targetUnit) throws ConversionException;

    /**
     * Converts a point (a numerical value expressed on a specific scale) to a target scale.
     * This method can be used to convert, for instance, between degrees Celsius and Fahrenheit if the temperature
     * is absolute (i.e. not a temperature difference).
     * @param point The point to be converted to the target scale.
     * @param targetScale The target scale to which the point is to be converted.
     * @return The converted point.
     * @throws ConversionException When the point could not be converted to the specified target scale.
     */
    public Point convertToScale(Point point, Scale targetScale) throws ConversionException;

    /**
     * Compares the two scalar measures and returns a negative integer if the first measure is smaller than the
     * second measure, 0 if the two measures are equal, or a positive integer if the first measure is
     * larger than the second measure.
     * @param measure1 The first measure to compare.
     * @param measure2 The second measure to compare.
     * @return A negative integer if the first measure is smaller than the second measure, 0 if the measures
     * are equal, and a positive integer if the first measure is larger.
     * @throws ConversionException When the units of the measures are in a different dimension.
     */
    public int compare(Measure measure1, Measure measure2) throws ConversionException;

    /**
     * Compares the two measures and returns true when they are equal. This includes the conversion of units,
     * e.g. 1 km is equal to 1000000 mm. If the compared measures are vectors
     * each of the components of the vector should be equal to the same component of the other vector (including
     * unit conversion). When the measures cannot be compared because the units cannot be converted into each other,
     * this method returns false.
     * @param measure1 The first measure to compare.
     * @param measure2 The second measure to compare.
     * @param diff The maximum difference between the two values for the method to return true, e.g. if the first measure
     *             has value 12.002 and the second 12.003 and diff is 0.002, this method will return true.
     * @return True when the measures are equal, or false otherwise.
     */
    public boolean equals(Measure measure1, Measure measure2,double diff);

    /**
     * Compares the two points and returns a negative integer if the first point is smaller than the
     * second point, 0 if the two points are equal, or a positive integer if the first point is
     * larger than the second point.
     * @param point1 The first point to compare.
     * @param point2 The second point to compare.
     * @return A negative integer if the first point is smaller than the second point, 0 if the points
     * are equal, and a positive integer if the first point is larger.
     * @throws ConversionException When the units of the points are in a different dimension, or if the measures
     * have incompatible numerical values, e.g. a scalar and a vector.
     */
    public int compare(Point point1, Point point2) throws ConversionException;

    /**
     * Compares the two points and returns true when they are equal. This includes the conversion of units,
     * e.g. 1 K is equal to 1.8 F. If the compared points are vectors
     * each of the components of the vector should be equal to the same component of the other vector (including
     * unit conversion and scale conversion). When the points cannot be compared because the units cannot be converted into each other,
     * this method returns false.
     * @param point1 The first point to compare.
     * @param point2 The second point to compare.
     * @param diff The maximum difference between the two values for the method to return true, e.g. if the first point
     *             has value 12.002 and the second 12.003 and diff is 0.002, this method will return true.
     * @return True when the points are equal, or false otherwise.
     */
    public boolean equals(Point point1, Point point2,double diff);

    /**
     * Returns the conversion factor that is needed to convert the source unit to the target unit.
     * @param sourceUnit The source unit.
     * @param targetUnit The target unit.
     * @return The conversion factor.
     * @throws ConversionException When the sourceUnit cannot be converted into the targetUnit.
     */
    public double getConversionFactor(Unit sourceUnit, Unit targetUnit) throws ConversionException;

    /**
     * Defines two units two be equal to each other, for instance when they define the same unit but are in
     * different sets.
     * @param unit1 The first unit set to be equal to the second.
     * @param unit2 The second unit set to be equal to the first.
     */
    public void setUnitsToBeEqual(Unit unit1, Unit unit2);

    /**
     * Tests whether the specified unit is equal to One.
     * Some units are defined with respect to the unit One, other units are compound units that equate to One.
     * For instance the unit m/m equates to one, but km/m does not.
     *
     * @param unit The unit to be tested.
     * @return True when the unit equates to one.
     */
    public boolean unitIsEqualToOne(Unit unit);
}
