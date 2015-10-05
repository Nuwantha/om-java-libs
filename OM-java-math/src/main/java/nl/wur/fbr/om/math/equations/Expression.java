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
public abstract class Expression {

    private Expression[] parameters;
    private Function function;
    private double numericalValue;
    private Quantity quantity;
    private Measure measure;
    private Point point;
    private Dimension dimensionOfResult;

    private boolean isUnitConsistent = true;

    public Expression(double numericalValue){
        this.numericalValue = numericalValue;
        dimensionOfResult = new Dimension();
    }

    public Expression(Quantity quantity){
        this.quantity = quantity;
        dimensionOfResult = quantity.getQuantityClass().getDimension();
        if(quantity.getMeasureValue()!=null) {
            measure = quantity.getMeasureValue();
        }
        else if(quantity.getPointValue()!=null) {
            point = quantity.getPointValue();
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

    public abstract Expression add(double numericalValue);

    public abstract Expression add(Quantity quantity);

    public abstract Expression add(Expression expression);

    public Dimension getDimensionOfResult(){
        return dimensionOfResult;
    }

    public Expression evaluate(){
        if(hasFunction()){
            return function.evaluate(parameters);
        }
        return this;
    }

    @Override
    public String toString(){
        String str = "";
        if(function!=null){
            str += function.toString()+"(";
            for(int i=0;i<parameters.length;i++){
                if(i>0) str+=",";
                str += ""+parameters[i].toString();
            }
            str += ")";
        }else if(quantity!=null){
            str += quantity.toString();
        }else if(measure!=null){
            str += measure.toString();
        }else if(point!=null){
            str += point.toString();
        }else {
            str += ""+numericalValue;
        }
        if(!this.isDimensionalConsistent()) str = "["+str+"->XX]";
        return str;
    }
}
