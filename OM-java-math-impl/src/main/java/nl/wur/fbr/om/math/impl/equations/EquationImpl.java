package nl.wur.fbr.om.math.impl.equations;

import nl.wur.fbr.om.math.equations.ConditionalExpression;
import nl.wur.fbr.om.math.equations.Equation;
import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.model.quantities.Quantity;

/**
 * @author Don Willems on 05/10/15.
 */
public class EquationImpl extends Equation {

    public EquationImpl(Expression left, ConditionalExpression condition, Expression right) {
        super(left, condition, right);
    }


    public EquationImpl(Quantity left, ConditionalExpression condition, Expression right){
        super(new ExpressionImpl(left),condition,right);
    }

    public EquationImpl(Quantity left, ConditionalExpression condition, Quantity right){
        super(new ExpressionImpl(left),condition,new ExpressionImpl(right));
    }
}
