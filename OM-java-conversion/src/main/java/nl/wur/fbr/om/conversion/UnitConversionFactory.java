package nl.wur.fbr.om.conversion;

import nl.wur.fbr.om.model.Measure;
import nl.wur.fbr.om.model.UnitOrMeasurementScale;

/**
 * @author Don Willems on 16/07/15.
 */
public interface UnitConversionFactory {

    /**
     * Converts a measure (a numerical value expressed in a specific unit) to a target unit (or measurement scale).
     * @param measure The measure to be converted to the target unit.
     * @param targetUnit The target unit to which the measurement is to be converted.
     * @return The converted measure.
     * @throws UnitConversionException When the measure could not be converted to the specified target unit.
     */
    public Measure convertToUnit(Measure measure, UnitOrMeasurementScale targetUnit) throws UnitConversionException;
}
