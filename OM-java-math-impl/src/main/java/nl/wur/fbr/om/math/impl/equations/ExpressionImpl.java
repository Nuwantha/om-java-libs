package nl.wur.fbr.om.math.impl.equations;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.impl.functions.Addition;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.quantities.Quantity;

/**
 * @author Don Willems on 05/10/15.
 */
public class ExpressionImpl extends Expression {

    private Addition addition = new Addition();

    public ExpressionImpl(double numericalValue) {
        super(numericalValue);
    }

    public ExpressionImpl(Quantity quantity) {
        super(quantity);
    }

    public ExpressionImpl(Measure measure) {
        super(measure);
    }

    public ExpressionImpl(Point point) {
        super(point);
    }

    public ExpressionImpl(Function function, Expression... parameters) {
        super(function, parameters);
    }


    public Expression add(double numericalValue){
        Expression result = new ExpressionImpl(addition,this,new ExpressionImpl(numericalValue));
        return result;
    }

    public Expression add(Quantity quantity){
        Expression result = new ExpressionImpl(addition,this,new ExpressionImpl(quantity));
        return result;
    }

    public Expression add(Expression expression){
        Expression result = new ExpressionImpl(addition,this,expression);
        return result;
    }
}
