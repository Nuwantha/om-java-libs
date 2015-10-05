package nl.wur.fbr.om.math.impl.functions;

import nl.wur.fbr.om.math.*;
import nl.wur.fbr.om.math.Math;
import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.impl.equations.ExpressionImpl;
import nl.wur.fbr.om.math.processors.MathException;
import nl.wur.fbr.om.model.dimensions.Dimension;

/**
 * @author Don Willems on 05/10/15.
 */
public class Addition implements Function {

    @Override
    public Expression evaluate(Expression... parameters) {
        if(parameters.length==2){
            Expression newExpression = null;
            Expression augend = parameters[0].evaluate();
            Expression addend = parameters[1].evaluate();
            if(!augend.hasFunction() && !addend.hasFunction()){
                if(augend.getMeasure()!=null && addend.getMeasure()!=null){
                    newExpression = new ExpressionImpl(nl.wur.fbr.om.math.Math.add(augend.getMeasure(), addend.getMeasure()));
                }else if(augend.getPoint()!=null && addend.getMeasure()!=null){
                    newExpression = new ExpressionImpl(Math.add(augend.getPoint(), addend.getMeasure()));
                }else{
                    throw new MathException("Cannot add a "+addend.getQuantity()+" to "+augend.getQuantity()+".");
                }
            } else newExpression =  new ExpressionImpl(this,augend,addend);
            return newExpression;
        }
        throw new MathException("The number of parameters for the addition function is not equal to 2. (N="+parameters.length+")");
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
        return "add";
    }
}
