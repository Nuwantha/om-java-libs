package nl.wur.fbr.om.math.impl.functions;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.processors.MathOperationNotSupportedException;
import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.dimensions.Dimension;

/**
 * This is an implementation of the Product (over sequences) function
 *
 * @author Don Willems on 09/10/15.
 */
public class Product implements Function {
    /**
     * Tries to evaluate the function given the specified parameters.
     * <br>
     * It evaluates the Product of a set of values. The call to this function should contain
     * three parameters. The first parameter specifies the variable that is the index of the product.
     * The second parameter specifies the index set used as indices for the product.
     * The last parameter should contain the function (where the index should be a variable) that is being multiplied.
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
     * It evaluates the Product of a set of values. The call to this function should contain
     * three parameters. The first parameter specifies the variable that is the index of the product.
     * The second parameter specifies the index set used as indices for the product.
     * The last parameter should contain the function (where the index should be a variable) that is being multiplied.
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
        if(parameters.length>=3 && parameters.length<=4){
            Expression indexParameter = parameters[0];
            if(!indexParameter.getDimensionOfResult().isDimensionless()) return null;
           // if(!(parameters[1] instanceof IndexSetExpressionImpl)) return null;
           // IndexSetExpressionImpl indexSet = (IndexSetExpressionImpl) parameters[1];
            int size = 0;//indexSet.indexSetSize();
            boolean infinite = false;
            if(size == (int)Double.POSITIVE_INFINITY) {
                infinite = true;
            }
            Dimension dim = parameters[parameters.length-1].getDimensionOfResult();
            Dimension dimension = new Dimension();
            for(BaseDimension baseDimension : dim.getDimensions()){
                if(!infinite) {
                    dimension.setDimensionalExponent(baseDimension, dim.getDimensionalExponent(baseDimension) * size);
                }else {
                    double val = dim.getDimensionalExponent(baseDimension);
                    if(val<0) dimension.setDimensionalExponent(baseDimension,Double.NEGATIVE_INFINITY);
                    else if(val>0) dimension.setDimensionalExponent(baseDimension,Double.POSITIVE_INFINITY);
                }
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
        return "product";
    }
}
