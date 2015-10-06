package nl.wur.fbr.om.math.impl.functions;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.impl.equations.ExpressionImpl;
import nl.wur.fbr.om.math.processors.MathException;
import nl.wur.fbr.om.model.dimensions.Dimension;

/**
 * This is an implementation of a function that can subtract two values.
 *
 * @author Don Willems on 06/10/15.
 */
public class Subtraction implements Function {

    /**
     * Tries to evaluate the function given the specified parameters, i.e. subtract the parameters.
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
        if(parameters.length==2){
            Expression newExpression = null;
            Expression minuend = parameters[0].evaluate();
            Expression subtrahend = parameters[1].evaluate();
            if(!minuend.hasFunction() && !subtrahend.hasFunction()){
                if(minuend.getMeasure()!=null && subtrahend.getMeasure()!=null){
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.subtract(minuend.getMeasure(), subtrahend.getMeasure()));
                }else if(minuend.getPoint()!=null && subtrahend.getMeasure()!=null){
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.subtract(minuend.getPoint(), subtrahend.getMeasure()));
                }else if(minuend.getPoint()!=null && subtrahend.getPoint()!=null){
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.difference(minuend.getPoint(), subtrahend.getPoint()));
                }else{
                    throw new MathException("Cannot subtract "+minuend.getQuantity()+" from "+subtrahend.getQuantity()+".");
                }
            } else newExpression =  new ExpressionImpl(this,minuend,subtrahend);
            return newExpression;
        }
        throw new MathException("The number of parameters for the subtraction function is not equal to 2. (N="+parameters.length+")");
    }

    /**
     * Returns the dimension of the resulting expression, or null if the function is not
     * dimensional consistent given the parameters. <br>
     * The subtraction result has the same dimension as the dimension of the parameters, which have
     * to be the same for each parameter.
     *
     * @param parameters The input expressions.
     * @return The dimension of the result, or null if the function is not
     * dimensional consistent given the parameters.
     */
    @Override
    public Dimension getDimensionOfResult(Expression... parameters) {
        if(parameters.length==2){
            Dimension dimension = parameters[0].getDimensionOfResult();
            if(parameters[1].getDimensionOfResult().equals(dimension)) return dimension;
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
        return "subtract";
    }
}
