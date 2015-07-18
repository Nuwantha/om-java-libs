package nl.wur.fbr.om.factory;

import nl.wur.fbr.om.model.Unit;

/**
 * Represents an exception being thrown during unit conversion.
 *
 * @author Don Willems on 14/07/15.
 */
public class UnitConversionException extends ConversionException {

    private Unit sourceUnit;
    private Unit targetUnit;

    /**
     * Creates a new unit conversion exception for a unit conversion with the specified source and target unit.
     * @param message A human readable message describing the exception.
     * @param sourceUnit The unit to be converted.
     * @param targetUnit The unit to which is converted.
     */
    public UnitConversionException(String message, Unit sourceUnit, Unit targetUnit){
        super(message);
        this.sourceUnit = sourceUnit;
        this.targetUnit = targetUnit;
    }

    /**
     * Creates a new unit conversion exception for a unit conversion with the specified source and target unit.
     * @param message A human readable message describing the exception.
     * @param sourceUnit The unit to be converted.
     * @param targetUnit The unit to which is converted.
     * @param cause The causing exception.
     */
    public UnitConversionException(String message, Unit sourceUnit, Unit targetUnit, Throwable cause){
        super(message,cause);
        this.sourceUnit = sourceUnit;
        this.targetUnit = targetUnit;
    }


}
