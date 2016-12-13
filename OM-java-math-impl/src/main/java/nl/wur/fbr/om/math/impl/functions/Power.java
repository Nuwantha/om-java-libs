package nl.wur.fbr.om.math.impl.functions;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.impl.equations.ExpressionImpl;
import nl.wur.fbr.om.math.processors.MathException;
import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.dimensions.Dimension;

import java.util.Set;

/**
 * This is an implementation of a power function.
 *
 * @author Don Willems on 08/10/15.
 */
public class Power implements Function {
    /**
     * Tries to evaluate the function given the specified parameters, i.e. the first parameter raised to the power
     * of the second parameter.
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
            Expression base = parameters[0].evaluate();
            Expression power = parameters[1].evaluate();
            if(!base.hasFunction() && !power.hasFunction()){
                if(base.getMeasure()!=null && power.hasNumericalValue()){
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.pow(base.getMeasure(), power.getNumericalValue()));
                }else if(base.hasNumericalValue() && power.getMeasure()!=null){
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.pow(base.getNumericalValue(), power.getMeasure()));
                }else if(base.hasNumericalValue() && power.getMeasure()!=null){
                    newExpression = new ExpressionImpl(Math.pow(base.getNumericalValue(), power.getNumericalValue()));
                }else{
                    throw new MathException("Cannot raise "+base.getQuantity()+" to the power of "+power.getQuantity()+".");
                }
            } else newExpression =  new ExpressionImpl(this,base,power);
            return newExpression;
        }
        throw new MathException("The number of parameters for the power function is not equal to 2. (N="+parameters.length+")");
    }

    /**
     * Returns the dimension of the resulting expression, or null if the function is not
     * dimensional consistent given the parameters. <br>
     * The exponent (second parameter) should be dimensionless. The dimension of the result is the dimension
     * of the base (first parameter) multiplied by the value of the dimensionless exponent.
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
            if(!dimension2.isDimensionless()) return null;
            if(parameters[1].hasNumericalValue()){
                double exponent = parameters[1].getNumericalValue();
                Dimension dimension = new Dimension();
                Set<BaseDimension> baseDimensions = dimension1.getDimensions();
                for(BaseDimension baseDimension : baseDimensions){
                    dimension.setDimensionalExponent(baseDimension,dimension1.getDimensionalExponent(baseDimension)*exponent);
                }
                return dimension;
            }else if(parameters[0].hasNumericalValue()){
                return new Dimension(); // if the  base is a numerical value, the result is dimensionless
            }
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
        return "pow";
    }
}