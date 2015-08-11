package nl.wur.fbr.om.exceptions;

/**
 * This is the generic exception thrown by factory methods when they encounter a problem.
 * @author Don Willems on 10/08/15.
 */
public class FactoryException extends Exception {

    /**
     * Creates a new <code>FactoryException</code> with the specified message.
     * @param message A human readable message describing the exception.
     */
    public FactoryException(String message){
        super(message);
    }


    /**
     * Creates a new <code>FactoryException</code> with the specified message and a causing error.
     * @param message A human readable message describing the exception.
     * @param cause The causing exception.
     */
    public FactoryException(String message, Throwable cause){
        super(message,cause);
    }
}
