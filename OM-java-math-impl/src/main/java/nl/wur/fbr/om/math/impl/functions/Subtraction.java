package nl.wur.fbr.om.math.impl.functions;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.impl.equations.ExpressionImpl;
import nl.wur.fbr.om.math.processors.MathException;
import nl.wur.fbr.om.model.dimensions.Dimension;

/**
 * @author Don Willems on 06/10/15.
 */
public class Subtraction implements Function {

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

    @Override
    public Dimension getDimensionOfResult(Expression... parameters) {
        if(parameters.length==2){
            Dimension dimension = parameters[0].getDimensionOfResult();
            if(parameters[1].getDimensionOfResult().equals(dimension)) return dimension;
        }
        return null;
    }

    @Override
    public String toString(){
        return "subtract";
    }
}
