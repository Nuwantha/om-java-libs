package nl.wur.fbr.om.math.impl.functions;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.impl.equations.ExpressionImpl;
import nl.wur.fbr.om.math.processors.MathException;
import nl.wur.fbr.om.model.dimensions.Dimension;

/**
 * This is an implementation of the base 10 logarithm function.
 *
 * @author Don Willems on 07/10/15.
 */
public class Base10Logarithm implements Function {

    /**
     * Tries to evaluate the function given the specified parameters, i.e. calculate the base 10 logarithm of
     * the parameter.
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
            if (!value.hasFunction()){
                if(value.getMeasure()!=null){
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.log10(value.getMeasure()));
                }else if(value.hasNumericalValue()){
                    newExpression = new ExpressionImpl(Math.log10(value.getNumericalValue()));
                }else{
                    throw new MathException("Cannot calculate the base 10 logarithm of "+value.getQuantity()+".");
                }
            } else newExpression =  new ExpressionImpl(this,value);
            return newExpression;
        }
        throw new MathException("The number of parameters for the base 10 logarithm function is not equal to 1. (N="+parameters.length+")");
    }

    /**
     * Returns the dimension of the resulting expression, or null if the function is not
     * dimensional consistent given the parameters. <br>
     * The base 10 logarithm always returns a dimensionless value.
     *
     * @param parameters The input expressions.
     * @return The dimension of the result, or null if the function is not
     * dimensional consistent given the parameters.
     */
    @Override
    public Dimension getDimensionOfResult(Expression... parameters) {
        if(parameters.length!=1) return null;
        if(!parameters[0].getDimensionOfResult().isDimensionless()) return null;
        return new Dimension();
    }

    /**
     * Returns a string representation of this function. This string is used in the string
     * representation of any expression or equation that contains this function.
     *
     * @return The string representation.
     */
    @Override
    public String toString(){
        return "log10";
    }
}