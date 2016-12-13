package nl.wur.fbr.om.math.impl.functions;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.processors.MathOperationNotSupportedException;
import nl.wur.fbr.om.model.dimensions.Dimension;

/**
 * This is an implementation of the Summation function
 *
 * @author Don Willems on 09/10/15.
 */
public class Summation implements Function {
    /**
     * Tries to evaluate the function given the specified parameters.
     * <br>
     * It evaluates the Sum of a set of values. The call to this function should contain
     * three parameters. The first parameter specifies the variable that is the index of the summation.
     * The second parameter specifies the index set used as indices for the summation.
     * The last parameter should contain the function (where the index should be a variable) that is being summed.
     * <br>
     * The result of the evaluation is another expression which may contain a numerical value
     * or measure or point if all quantities in the parameter expressions have been filled in
     * (i.e. have a value). If not, this function tries to fill in as much as possible and returns
     * the simplified expression that contains only those variables whose values are unknown.
     *
     * @param parameters The parameters to the function (may be subexpressions).
     * @return The simplified evaluated expression.
     */
    @Override
    public Expression evaluate(Expression... parameters) {
        throw new MathOperationNotSupportedException("The Sum ("+Summation.class.toString()+") operation is not supported for evaluation.");
    }

    /**
     * Returns the dimension of the resulting expression, or null if the function is not
     * dimensional consistent given the parameters.
     * <br>
     * It evaluates the Sum of a set of values. The call to this function should contain
     * three parameters. The first parameter specifies the variable that is the index of the summation.
     * The second parameter specifies the index set used as indices for the summation.
     * The last parameter should contain the function (where the index should be a variable) that is being summed.
     * <br>
     * The dimension of the summation is equal to the dimension of the summed function (the last parameter). The index
     * parameter needs to be dimensionless.
     *
     * @param parameters The input expressions.
     * @return The dimension of the result, or null if the function is not
     * dimensional consistent given the parameters.
     */
    @Override
    public Dimension getDimensionOfResult(Expression... parameters) {
        if(parameters.length==3){
            Expression indexParameter = parameters[0];
            if(!indexParameter.getDimensionOfResult().isDimensionless()) return null;
           // if(!(parameters[1] instanceof IndexSetExpressionImpl)) return null;
            return parameters[parameters.length-1].getDimensionOfResult();
        }
        return null;
    }

    /**
     * Returns a string representation of this function. This string is used in the string
     * representation of any expression or equation that contains this function.
     *
     * @return The string representation.
     */
    @Override
    public String toString(){
        return "sum";
    }
}
