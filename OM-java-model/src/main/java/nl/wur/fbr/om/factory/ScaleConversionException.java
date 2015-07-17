package nl.wur.fbr.om.factory;

import nl.wur.fbr.om.model.Scale;

/**
 * Represents an exception being thrown during unit conversion.
 *
 * @author Don Willems on 17/07/15.
 */
public class ScaleConversionException extends ConversionException{

    private Scale sourceScale;
    private Scale targetScale;

    /**
     * Creates a new scale conversion exception for a scale conversion with the specified source and target scale.
     * @param message A human readable message describing the exception.
     * @param sourceScale The scale to be converted.
     * @param targetScale The scale to which this scale is converted.
     */
    public ScaleConversionException(String message, Scale sourceScale, Scale targetScale){
        super(message);
        this.sourceScale = sourceScale;
        this.targetScale = targetScale;
    }

    /**
     * Creates a new scale conversion exception for a scale conversion with the specified source and target scale.
     * @param message A human readable message describing the exception.
     * @param sourceScale The scale to be converted.
     * @param targetScale The scale to which this scale is converted.
     * @param cause The causing exception.
     */
    public ScaleConversionException(String message, Scale sourceScale, Scale targetScale, Throwable cause){
        super(message,cause);
        this.sourceScale = sourceScale;
        this.targetScale = targetScale;
    }

}
