package nl.wur.fbr.om.math.equations;

import nl.wur.fbr.om.model.dimensions.Dimension;

/**
 * @author Don Willems on 05/10/15.
 */
public interface Function  {

    public Expression evaluate(Expression... parameters);

    /**
     * Returns the dimension of the resulting expression, or null if the function is not
     * dimensional consistent given the parameters.
     * @param parameters The input expressions.
     * @return The dimension of the result, or null if the function is not
     * dimensional consistent given the parameters.
     */
    public Dimension getDimensionOfResult(Expression... parameters);
}
