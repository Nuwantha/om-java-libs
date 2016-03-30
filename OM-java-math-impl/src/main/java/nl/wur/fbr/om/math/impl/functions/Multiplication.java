package nl.wur.fbr.om.math.impl.functions;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.impl.equations.ExpressionImpl;
import nl.wur.fbr.om.math.processors.MathException;
import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.dimensions.Dimension;

import java.util.Set;

/**
 * This is an implementation of a function that can multiply two values.
 *
 * @author Don Willems on 06/10/15.
 */
public class Multiplication implements Function {

    /**
     * Tries to evaluate the function given the specified parameters, i.e. multiply the parameters.
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
            Expression multiplicand = parameters[0].evaluate();
            Expression multiplier = parameters[1].evaluate();
            if(!multiplicand.hasFunction() && !multiplier.hasFunction()){
                if(multiplicand.getMeasure()!=null && multiplier.getMeasure()!=null){
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.multiply(multiplicand.getMeasure(), multiplier.getMeasure()));
                }else if(multiplicand.getMeasure()!=null && multiplier.hasNumericalValue()){
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.multiply(multiplicand.getMeasure(), multiplier.getNumericalValue()));
                }else{
                    throw new MathException("Cannot multiply "+multiplicand.getQuantity()+" by "+multiplier.getQuantity()+".");
                }
            } else newExpression =  new ExpressionImpl(this,multiplicand,multiplier);
            return newExpression;
        }
        throw new MathException("The number of parameters for the multiplication function is not equal to 2. (N="+parameters.length+")");
    }

    /**
     * Returns the dimension of the resulting expression, or null if the function is not
     * dimensional consistent given the parameters. <br>
     * The multiplication result has a dimension that is a multiplication of the dimensions
     * of the parameters.
     *
     * @param parameters The input expressions.
     * @return The dimension of the result, or null if the function is not
     * dimensional consistent given the parameters.
     */
    @Override
    public Dimension getDimensionOfResult(Expression... parameters) {
        if(parameters.length==2){
            Dimension dimension1 = parameters[0].getDimensionOfResult();
            Dimension dimension2 = parameters[1].getDimensionOfResult();
            Dimension dimension = new Dimension();
            Set<BaseDimension> dimensionSet = dimension1.getDimensions();
            for(BaseDimension baseDimension : dimensionSet) dimension.setDimensionalExponent(baseDimension,dimension1.getDimensionalExponent(baseDimension));
            Set<BaseDimension> dimensionSet2 = dimension2.getDimensions();
            for(BaseDimension baseDimension : dimensionSet2) dimension.setDimensionalExponent(baseDimension,dimension2.getDimensionalExponent(baseDimension)+dimension.getDimensionalExponent(baseDimension));
            return dimension;
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
        return "multiply";
    }
}