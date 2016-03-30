package nl.wur.fbr.om.math.equations;

import nl.wur.fbr.om.model.dimensions.Dimension;

/**
 * This interface defines the methods that need to be defined for a (mathematical)
 * function that can be used in an {@link Expression}.
 *
 * @author Don Willems on 05/10/15.
 */
public interface Function  {

    /**
     * Tries to evaluate the function given the specified parameters.
     * The result of the evaluation is another expression which may contain a numerical value
     * or measure or point if all quantities in the parameter expressions have been filled in
     * (i.e. have a value). If not, this function tries to fill in as much as possible and returns
     * the simplified expression that contains only those variables whose values are unknown.
     *
     * @param parameters The parameters to the function (may be subexpressions).
     * @return The simplified evaluated expression.
     */
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
