package nl.wur.fbr.om.exceptions;

import nl.wur.fbr.om.factory.UnitAndScaleFactory;

/**
 * Exceptions of this class are thrown when a unit or scale could not be created, for instance in the factory methods
 * in {@link UnitAndScaleFactory UnitAndScaleFactory}.
 * @author Don Willems on 19/07/15.
 */
public class UnitOrScaleCreationException extends Exception {

    /** The identifier of the unit or scale being created. */
    private String identifier;

    /**
     * Creates an new exception with the specified message.
     * @param message A human readable message describing the exception.
     */
    public UnitOrScaleCreationException(String message){
        super(message);
    }

    /**
     * Creates an new exception with the specified message and a reference
     * to the causing exceptions.
     * @param message A human readable message describing the exception.
     * @param cause The underlying causing exception.
     */
    public UnitOrScaleCreationException(String message, Throwable cause){
        super(message,cause);
    }

    /**
     * Creates an new exception thrown during the creation of the unit or scale with the specified identifier and
     * with the specified message.
     * @param message A human readable message describing the exception.
     * @param identifier The identifier of the unit or scale being created.
     */
    public UnitOrScaleCreationException(String message, String identifier){
        super(message);
        this.identifier = identifier;
    }

    /**
     * Creates an new exception thrown during the creation of the unit or scale with the specified identifier and
     * with the specified message and a reference to the causing exceptions.
     * @param message A human readable message describing the exception.
     * @param identifier The identifier of the unit or scale being created.
     * @param cause The underlying causing exception.
     */
    public UnitOrScaleCreationException(String message, String identifier, Throwable cause){
        super(message,cause);
        this.identifier = identifier;
    }

    /**
     * Returns the identifier of the unit or scale being created when this exception was thrown, or
     * null when no identifier was specified.
     * @return The identifier.
     */
    public final String getIdentifier(){
        return identifier;
    }
}
