package nl.wur.fbr.om.math.impl.functions;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.impl.equations.ExpressionImpl;
import nl.wur.fbr.om.math.processors.MathException;
import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.dimensions.Dimension;

import java.util.Set;

/**
 * This is an implementation of a function that determines the cross product of two vector parameters.
 *
 *
 * @author Don Willems on 09/10/15.
 */
public class CrossProduct implements Function {

    /**
     * Tries to evaluate the function given the specified parameters, i.e. calculate the cross product of the two
     * parameter vectors.
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
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.crossProduct(x.getMeasure(), y.getMeasure()));
                }else{
                    throw new MathException("Cannot evaluate the cross product of "+x.getQuantity()+" and "+y.getQuantity()+".");
                }
            } else newExpression =  new ExpressionImpl(this,x,y);
            return newExpression;
        }
        throw new MathException("The number of parameters for the product function is not equal to 2. (N="+parameters.length+")");
    }

    /**
     * Returns the dimension of the resulting expression, or null if the function is not
     * dimensional consistent given the parameters. <br>
     * The cross product has a dimension of the dimension of the parameter vectors (which have to be equal) squared.
     *
     * @param parameters The input expressions.
     * @return The dimension of the result, or null if the function is not
     * dimensional consistent given the parameters.
     */
    @Override
    public Dimension getDimensionOfResult(Expression... parameters) {
        if(parameters.length==2){
            Dimension dimension = parameters[0].getDimensionOfResult();
            if(!dimension.equals(parameters[1].getDimensionOfResult())) return null;
            Set<BaseDimension> baseDimensionSet = dimension.getDimensions();
            Dimension dim = new Dimension();
            for(BaseDimension baseDimension : baseDimensionSet){
                dim.setDimensionalExponent(baseDimension,dimension.getDimensionalExponent(baseDimension)*2);
            }
            return dim;
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
        return "crossProduct";
    }
}