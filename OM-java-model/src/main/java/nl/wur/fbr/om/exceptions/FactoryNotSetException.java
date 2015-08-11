package nl.wur.fbr.om.exceptions;

/**
 * Exceptions of this type are thrown in the {@link nl.wur.fbr.om.factory.InstanceFactory} when
 * one of its containing factories ({@link nl.wur.fbr.om.factory.UnitAndScaleFactory},
 * {@link nl.wur.fbr.om.factory.MeasureAndPointFactory}, or {@link nl.wur.fbr.om.factory.UnitAndScaleConversionFactory},
 * is not set while one of its methods is called. This exception is an unchecked exception and does not need to
 * be caught.
 * @author Don Willems on 10/08/15.
 */
public class FactoryNotSetException extends RuntimeException{

    /**
     * Creates a new <code>FactoryNotSetException</code> with the specified message.
     * @param message A human readable message describing the exception.
     */
    public FactoryNotSetException(String message){
        super(message);
    }


    /**
     * Creates a new <code>FactoryNotSetException</code> with the specified message and a causing error.
     * @param message A human readable message describing the exception.
     * @param cause The causing exception.
     */
    public FactoryNotSetException(String message, Throwable cause){
        super(message,cause);
    }
}
