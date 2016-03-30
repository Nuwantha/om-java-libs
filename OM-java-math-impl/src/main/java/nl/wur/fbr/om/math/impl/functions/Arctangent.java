package nl.wur.fbr.om.math.impl.functions;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.impl.equations.ExpressionImpl;
import nl.wur.fbr.om.math.processors.MathException;
import nl.wur.fbr.om.model.dimensions.Dimension;

/**
 * This is an implementation of the arctangent function.
 *
 * @author Don Willems on 07/10/15.
 */
public class Arctangent implements Function {

    /**
     * Tries to evaluate the function given the specified parameters, i.e. calculate the arctangent of the parameter.
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
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.atan(value.getMeasure()));
                }else if(value.hasNumericalValue()){
                    newExpression = new ExpressionImpl(Math.atan(value.getNumericalValue()));
                }else{
                    throw new MathException("Cannot calculate the arctangent of "+value.getQuantity()+".");
                }
            } else newExpression =  new ExpressionImpl(this,value);
            return newExpression;
        }else if(parameters.length==2){
            Expression newExpression = null;
            Expression y = parameters[0].evaluate();
            Expression x = parameters[1].evaluate();
            if(!y.hasFunction() && !x.hasFunction()){
                if(y.getMeasure()!=null && x.getMeasure()!=null){
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.atan2(y.getMeasure(),x.getMeasure()));
                }else if(y.hasNumericalValue() && x.hasNumericalValue()){
                    newExpression = new ExpressionImpl(Math.atan2(y.getNumericalValue(),x.getNumericalValue()));
                }else{
                    throw new MathException("Cannot calculate the arctangent of "+y.getQuantity()+" / "+x.getQuantity()+".");
                }
            } else newExpression =  new ExpressionImpl(this,y,x);
            return newExpression;
        }
        throw new MathException("The number of parameters for the arctangent function is not equal to 1 or 2. (N="+parameters.length+")");
    }

    /**
     * Returns the dimension of the resulting expression, or null if the function is not
     * dimensional consistent given the parameters. <br>
     * The arctangent always returns a dimensionless value.
     *
     * @param parameters The input expressions.
     * @return The dimension of the result, or null if the function is not
     * dimensional consistent given the parameters.
     */
    @Override
    public Dimension getDimensionOfResult(Expression... parameters) {
        if(parameters.length==1) {
            if(!parameters[0].getDimensionOfResult().isDimensionless()) return null;
            return new Dimension();
        }
        if(parameters.length==2) {
            if(!parameters[0].getDimensionOfResult().equals(parameters[1].getDimensionOfResult())) return null;
            return new Dimension();
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
        return "atan";
    }
}