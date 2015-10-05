package nl.wur.fbr.om.math.equations;

import nl.wur.fbr.om.math.processors.MathException;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.quantities.Quantity;
import nl.wur.fbr.om.math.Math;

/**
 * @author Don Willems on 05/10/15.
 */
public class Expression {

    private Expression[] parameters;
    private Function function;
    private double numericalValue;
    private Quantity quantity;
    private Measure measure;
    private Point point;
    private Dimension dimensionOfResult;

    private boolean isUnitConsistent = true;

    private Function addition = new Function() {
        @Override
        public Expression evaluate(Expression... parameters) {
            if(parameters.length==2){
                Expression newExpression = null;
                Expression augend = parameters[0].evaluate();
                Expression addend = parameters[1].evaluate();
                if(!augend.hasFunction() && !addend.hasFunction()){
                    if(augend.getMeasure()!=null && addend.getMeasure()!=null){
                        newExpression = new Expression(Math.add(augend.getMeasure(), addend.getMeasure()));
                    }else if(augend.getPoint()!=null && addend.getMeasure()!=null){
                        newExpression = new Expression(Math.add(augend.getPoint(), addend.getMeasure()));
                    }else{
                        throw new MathException("Cannot add a "+addend.getQuantity()+" to "+augend.getQuantity()+".");
                    }
                } else newExpression =  new Expression(addition,augend,addend);
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
    };

    public Expression(double numericalValue){
        this.numericalValue = numericalValue;
        dimensionOfResult = new Dimension();
    }

    public Expression(Quantity quantity){
        this.quantity = quantity;
        if(quantity.getMeasureValue()!=null) {
            measure = quantity.getMeasureValue();
            dimensionOfResult = measure.getUnit().getUnitDimension();
        }
        else if(quantity.getPointValue()!=null) {
            point = quantity.getPointValue();
            dimensionOfResult = point.getScale().getUnit().getUnitDimension();
        }
    }

    public Expression(Measure measure){
        this.measure = measure;
        dimensionOfResult = measure.getUnit().getUnitDimension();
    }

    public Expression(Point point){
        this.point = point;
        dimensionOfResult = point.getScale().getUnit().getUnitDimension();
    }

    public Expression(Function function, Expression... parameters){
        this.function = function;
        this.parameters = parameters;
        dimensionOfResult = function.getDimensionOfResult(parameters);
    }

    public boolean isDimensionalConsistent(){
        return dimensionOfResult!=null;
    }

    public boolean isUnitConsistent(){
        return isUnitConsistent;
    }

    public boolean hasNumericalValue(){
        return (quantity==null && function==null);
    }

    public double getNumericalValue(){
        if(quantity!=null || function!=null) throw new MathException("The Expression is not a numerical value.");
        return numericalValue;
    }

    public boolean hasQuantity(){
        return quantity!=null;
    }

    public Quantity getQuantity(){
        if(quantity==null) throw new MathException("The Expression is not a Quantity.");
        return quantity;
    }

    public Measure getMeasure(){
        return measure;
    }

    public Point getPoint(){
        return point;
    }

    public boolean hasFunction(){
        return function!=null;
    }

    public Function getFunction(){
        if(function==null) throw new MathException("The Expression is not a Function.");
        return function;
    }

    public Expression add(double numericalValue){
        Expression result = new Expression(addition,new Expression(numericalValue));
        return result;
    }

    public Expression add(Quantity quantity){
        Expression result = new Expression(addition,new Expression(quantity));
        return result;
    }

    public Expression add(Expression expression){
        Expression result = new Expression(addition,expression);
        return result;
    }

    public Dimension getDimensionOfResult(){
        return dimensionOfResult;
    }

    public Expression evaluate(){
        if(hasFunction()){
            return function.evaluate(parameters);
        }
        return this;
    }
}
