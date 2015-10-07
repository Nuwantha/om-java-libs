package nl.wur.fbr.om.math.impl.functions;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.impl.equations.ExpressionImpl;
import nl.wur.fbr.om.math.processors.MathException;
import nl.wur.fbr.om.model.dimensions.Dimension;

/**
 * This is an implementation of the sine function.
 *
 * @author Don Willems on 07/10/15.
 */
public class Sine implements Function {
    /**
     * Tries to evaluate the function given the specified parameters, i.e. calculate the sine of the parameter.
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
        if(parameters.length==1){
            Expression newExpression = null;
            Expression value = parameters[0].evaluate();
            if(!value.hasFunction()){
                if(value.getMeasure()!=null){
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.sin(value.getMeasure()));
                }else if(value.hasNumericalValue()){
                    newExpression = new ExpressionImpl(Math.sin(value.getNumericalValue()));
                }else{
                    throw new MathException("Cannot calculate the sine of "+value.getQuantity()+".");
                }
            } else newExpression =  new ExpressionImpl(this,value);
            return newExpression;
        }
        throw new MathException("The number of parameters for the sine function is not equal to 1. (N="+parameters.length+")");
    }

    /**
     * Returns the dimension of the resulting expression, or null if the function is not
     * dimensional consistent given the parameters. <br>
     * The sine always returns a dimensionless value.
     *
     * @param parameters The input expressions.
     * @return The dimension of the result, or null if the function is not
     * dimensional consistent given the parameters.
     */
    @Override
    public Dimension getDimensionOfResult(Expression... parameters) {
        if(parameters.length!=1) return null;
        return new Dimension();
    }
}
