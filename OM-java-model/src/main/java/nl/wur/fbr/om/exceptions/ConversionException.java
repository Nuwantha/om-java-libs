package nl.wur.fbr.om.exceptions;

/**
 * Represents an exception being thrown during unit or scale conversion.
 * @author Don Willems on 17/07/15.
 */
public class ConversionException extends Exception {

    /**
     * Creates a new <code>ConversionException</code> with the specified message.
     * @param message A human readable message describing the exception.
     */
    public ConversionException(String message){
        super(message);
    }


    /**
     * Creates a new <code>ConversionException</code> with the specified message and a causing error.
     * @param message A human readable message describing the exception.
     * @param cause The causing exception.
     */
    public ConversionException(String message, Throwable cause){
        super(message,cause);
    }
}
