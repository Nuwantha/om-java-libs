package nl.wur.fbr.om.conversion;

import nl.wur.fbr.om.model.UnitOrMeasurementScale;

/**
 * Represents an exception being thrown during unit conversion.
 *
 * @author Don Willems on 14/07/15.
 */
public class UnitConversionException extends Exception {

    private UnitOrMeasurementScale sourceUnit;
    private UnitOrMeasurementScale targetUnit;

    /**
     * Creates a new unit conversion exception for a unit conversion with the specified source and target unit or
     * measurement scale.
     * @param message A human readable message describing the exception.
     * @param sourceUnit The unit to be converted.
     * @param targetUnit The unit to which is converted.
     */
    public UnitConversionException(String message, UnitOrMeasurementScale sourceUnit, UnitOrMeasurementScale targetUnit){
        super(message);
        this.sourceUnit = sourceUnit;
        this.targetUnit = targetUnit;
    }

    /**
     * Creates a new unit conversion exception for a unit conversion with the specified source and target unit or
     * measurement scale.
     * @param message A human readable message describing the exception.
     * @param sourceUnit The unit to be converted.
     * @param targetUnit The unit to which is converted.
     * @param cause The causing exception.
     */
    public UnitConversionException(String message, UnitOrMeasurementScale sourceUnit, UnitOrMeasurementScale targetUnit, Throwable cause){
        super(message,cause);
        this.sourceUnit = sourceUnit;
        this.targetUnit = targetUnit;
    }


}
