package nl.wur.fbr.om.math.processors;

/**
 * This exception is thrown when the mathematical operation could not be completed, for instance because the
 * units do not match. This exception is an unchecked exception.
 * @author Don Willems on 11/08/15.
 */
public class MathException extends RuntimeException {

    /**
     * Creates a new math exception with the specified message.
     * @param message The message.
     */
    public MathException(String message){
        super(message);
    }

    /**
     * Creates a new math exception with the specified message and the specified causing exception.
     * @param message The message.
     * @param cause The cause of this exception.
     */
    public MathException(String message, Throwable cause){
        super(message,cause);
    }
}
