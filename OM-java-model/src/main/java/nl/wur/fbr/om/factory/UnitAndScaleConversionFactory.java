package nl.wur.fbr.om.factory;



import nl.wur.fbr.om.model.Measure;
import nl.wur.fbr.om.model.Point;
import nl.wur.fbr.om.model.Scale;
import nl.wur.fbr.om.model.Unit;

/**
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
}
