package nl.wur.fbr.om.factory;



import nl.wur.fbr.om.exceptions.ConversionException;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.measures.ScalarMeasure;
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
     * @throws ConversionException When the units of the measures are in different dimensions.
     */
    public int compare(ScalarMeasure measure1, ScalarMeasure measure2) throws ConversionException;

    /**
     * Compares the two measures and returns a true when they are equal. This includes the conversion of units,
     * e.g. 1 km is equal to 1000000 mm. If the compared measures are {@link nl.wur.fbr.om.model.measures.VectorMeasure VectorMeasures}
     * each of the components of the vector should be equals to the same component of the other vector (including
     * unit comversion). When the measures cannot be compared because the units cannot be converted into each other,
     * this method returns false.
     * @param measure1 The first measure to compare.
     * @param measure2 The second measure to compare.
     * @return True when the measures are equal, or false otherwise.
     */
    public boolean equals(Measure measure1, Measure measure2);

    /**
     * Compares the two points and returns a negative integer if the first point is smaller than the
     * second point, 0 if the two points are equal, or a positive integer if the first point is
     * larger than the second point. If the numerical values are vectors, the length of the vectors is
     * compared.
     * @param point1 The first point to compare.
     * @param point2 The second point to compare.
     * @return A negative integer if the first point is smaller than the second point, 0 if the points
     * are equal, and a positive integer if the first point is larger.
     * @throws ConversionException When the units of the points are in different dimensions, or if the measures
     * have incompatible numerical values, e.g. a scalar and a vector.
     */
    public int compare(Point point1, Point point2) throws ConversionException;
}
