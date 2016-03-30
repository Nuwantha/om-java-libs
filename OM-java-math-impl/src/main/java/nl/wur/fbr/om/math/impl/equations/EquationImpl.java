package nl.wur.fbr.om.math.impl.equations;

import nl.wur.fbr.om.math.equations.ConditionalExpression;
import nl.wur.fbr.om.math.equations.Equation;
import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.model.quantities.Quantity;

/**
 * The core implementation of an {@link Equation}. It contains some extra constructors for creating
 * equations from quantities.
 *
 * @author Don Willems on 05/10/15.
 */
public class EquationImpl extends Equation {


    /**
     * Creates an equation with a left and right expression and with a conditional expression used in
     * comparison.
     *
     * @param left The left side expression.
     * @param condition The conditional expression.
     * @param right The right side expression.
     */
    public EquationImpl(Expression left, ConditionalExpression condition, Expression right) {
        super(left, condition, right);
    }


    /**
     * Creates an equation with a left and right expression and with a conditional expression used in
     * comparison, where the left expression is a {@link Quantity}. The value of the quantity may not have been
     * set, the quantity can then be used as a variable.
     *
     * @param left The left side expression (a quantity).
     * @param condition The conditional expression.
     * @param right The right side expression.
     */
    public EquationImpl(Quantity left, ConditionalExpression condition, Expression right){
        super(new ExpressionImpl(left),condition,right);
    }


    /**
     * Creates an equation with a left and right expression and with a conditional expression used in
     * comparison, where the both left and right expressions are {@link Quantity Quantities}.
     * The value of each of the quantities may not have been
     * set, the quantity can then be used as a variable.
     *
     * @param left The left side expression (a quantity).
     * @param condition The conditional expression.
     * @param right The right side expression (a quantity).
     */
    public EquationImpl(Quantity left, ConditionalExpression condition, Quantity right){
        super(new ExpressionImpl(left),condition,new ExpressionImpl(right));
    }
}
