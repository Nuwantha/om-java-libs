package nl.wur.fbr.om.exceptions;

/**
 * These exceptions are thrown when a unit or scale is being created by a factory method based
 * on a supplied identifier of the unit or scale, but not enough data was available to correctly
 * create the unit or scale. This happens because the factory cannot determine what kind of unit
 * needs to be created and with which values for the parameters, such as multiplication factor,
 * or offset.
 * @author Don Willems on 19/07/15.
 */
public class InsufficientDataException extends UnitOrScaleCreationException {

    /**
     * Creates an new insufficient data exception thrown during the creation of the unit or scale with the specified identifier and
     * with the specified message.
     *
     * @param message    A human readable message describing the exception.
     * @param identifier The identifier of the unit or scale being created.
     */
    public InsufficientDataException(String message, String identifier) {
        super(message, identifier);
    }

    /**
     * Creates an new insufficient data exception thrown during the creation of the unit or scale with the specified identifier and
     * with the specified message and a reference to the causing exceptions.
     *
     * @param message    A human readable message describing the exception.
     * @param identifier The identifier of the unit or scale being created.
     * @param cause      The underlying causing exception.
     */
    public InsufficientDataException(String message, String identifier, Throwable cause) {
        super(message, identifier, cause);
    }
}
