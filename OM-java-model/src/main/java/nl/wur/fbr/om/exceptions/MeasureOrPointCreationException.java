package nl.wur.fbr.om.exceptions;

import nl.wur.fbr.om.factory.MeasureAndPointFactory;

/**
 * Exceptions of this class are thrown when a measure or point could not be created, for instance in the factory methods
 * in {@link MeasureAndPointFactory MeasureAndPointFactory}.
 * @author Don Willems on 21/07/15.
 */
public class MeasureOrPointCreationException extends FactoryException {


    /**
     * Creates an new exception with the specified message.
     * @param message A human readable message describing the exception.
     */
    public MeasureOrPointCreationException(String message){
        super(message);
    }

    /**
     * Creates an new exception with the specified message and a reference
     * to the causing exceptions.
     * @param message A human readable message describing the exception.
     * @param cause The underlying causing exception.
     */
    public MeasureOrPointCreationException(String message, Throwable cause){
        super(message,cause);
    }
}
