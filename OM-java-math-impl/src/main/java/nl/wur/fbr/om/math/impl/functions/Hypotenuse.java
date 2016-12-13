package nl.wur.fbr.om.math.impl.functions;

import nl.wur.fbr.om.math.*;
import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.impl.equations.ExpressionImpl;
import nl.wur.fbr.om.math.processors.MathException;
import nl.wur.fbr.om.model.dimensions.Dimension;

import java.lang.Math;

/**
 * This is an implementation of a function that calculates the hypotenuse of the two parameters.
 * It is the length of the hypotenuse of a right-angled rectangle, i.e. the longest side of the rectangle, which is the
 * side opposite to the right angle. The length of the hypotenuse (h) can be calculated by using the Pythagorean
 * theorem h = sqrt(x<sup>2</sup>,y<sup>2</sup>).
 *
 * @author Don Willems on 08/10/15.
 */
public class Hypotenuse implements Function {

    /**
     * Tries to evaluate the function given the specified parameters, i.e. calculate the hypotenuse of the two
     * parameters, which is the length of the hypotenuse of a right-angled rectangle, i.e. the longest side of the rectangle.
     * The hypotenuse is the side opposite to the right angle. The length of the hypotenuse (h) can be calculated by
     * using the Pythagorean theorem h = sqrt(x<sup>2</sup>,y<sup>2</sup>), where x is the first and y the second
     * parameter.
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
            Expression x = parameters[0].evaluate();
            Expression y = parameters[1].evaluate();
            if(!x.hasFunction() && !y.hasFunction()){
                if(x.getMeasure()!=null && y.getMeasure()!=null){
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.hypot(x.getMeasure(), y.getMeasure()));
                }else if(x.hasNumericalValue() && y.hasNumericalValue()){
                    newExpression = new ExpressionImpl(Math.hypot(x.getNumericalValue(), y.getNumericalValue()));
                }else{
                    throw new MathException("Cannot evaluate the hypotenuse of "+x.getQuantity()+" and "+y.getQuantity()+".");
                }
            } else newExpression =  new ExpressionImpl(this,x,y);
            return newExpression;
        }
        throw new MathException("The number of parameters for the hypotenuse function is not equal to 2. (N="+parameters.length+")");
    }

    /**
     * Returns the dimension of the resulting expression, or null if the function is not
     * dimensional consistent given the parameters. <br>
     * The result of the hypotenuse has the same dimension as the dimension of the parameters, which have
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
        return "hypot";
    }
}