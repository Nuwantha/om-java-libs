package nl.wur.fbr.om.math.processors;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;

/**
 * A {@link MathOperationNotSupportedException} is thrown when one of the mathematical operations defined in an
 * implementation of {@link MathProcessor} or {@link Function#evaluate(Expression...)} is not implemented.
 * @author Don Willems on 09/10/15.
 */
public class MathOperationNotSupportedException extends MathException {

    /**
     * Creates a new math operation not supported exception with the specified message.
     *
     * @param message The message.
     */
    public MathOperationNotSupportedException(String message) {
        super(message);
    }

    /**
     * Creates a new math operation not supported exception with the specified message and the specified causing exception.
     *
     * @param message The message.
     * @param cause   The cause of this exception.
     */
    public MathOperationNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }
}
