package nl.wur.fbr.om.model.quantities;

import nl.wur.fbr.om.exceptions.FactoryException;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;

/**
 * An exception thrown when creating quantities. Quantities are created in
 * {@link nl.wur.fbr.om.model.QuantitySet#createQuantity(QuantityClass, Measure)} or
 * {@link nl.wur.fbr.om.model.QuantitySet#createQuantity(QuantityClass, Point)} methods.
 *
 * @author Don Willems on 04/10/15.
 */
public class QuantityCreationException extends FactoryException{
    /**
     * Creates a new <code>QuantityCreationException</code> with the specified message.
     *
     * @param message A human readable message describing the exception.
     */
    public QuantityCreationException(String message) {
        super(message);
    }

    /**
     * Creates a new <code>QuantityCreationException</code> with the specified message and a causing error.
     *
     * @param message A human readable message describing the exception.
     * @param cause   The causing exception.
     */
    public QuantityCreationException(String message, Throwable cause) {
        super(message, cause);
    }
}
