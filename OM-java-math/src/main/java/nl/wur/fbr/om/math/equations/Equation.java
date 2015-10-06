package nl.wur.fbr.om.math.equations;


import nl.wur.fbr.om.model.quantities.Quantity;

/**
 * Instances of this class represent an equation, with a left expression, a condition and a right expression
 * of the equation. The left and right expression are compared with each other where the conditional expression
 * determines when an equation holds (is true) or not.
 *
 * @author Don Willems on 05/10/15.
 */
public abstract class Equation {

    private Expression left, right;
    private ConditionalExpression condition;

    /**
     * Creates an equation with a left and right expression and with a conditional expression used in
     * comparison.
     *
     * @param left The left side expression.
     * @param condition The conditional expression.
     * @param right The right side expression.
     */
    public Equation(Expression left, ConditionalExpression condition, Expression right){
        this.left = left;
        this.right = right;
        this.condition = condition;
    }

    /**
     * Returns the left side expression of this equation.
     *
     * @return The left side expression.
     */
    public Expression getLeftExpression(){
        return left;
    }

    /**
     * Returns the conditional expression used for comparing the left and right side expressions.
     * Often the conditional expression will be {@link ConditionalExpression#EQUAL_TO}, but it may
     * also be for instance {@link ConditionalExpression#GREATER_THAN}.
     *
     * @return The conditional expression.
     */
    public ConditionalExpression getConditionalExpression(){
        return condition;
    }

    /**
     * Returns the right side expression of this equation.
     *
     * @return The right side expression.
     */
    public Expression getRightExpression(){
        return right;
    }

    /**
     * Tests if the equation is dimensional consistent. This is done by first determining whether both sides
     * of the equation are themselves dimensional consistent and if they are by comparing the dimension of
     * both sides. The left and right side expression need to have the same {@link nl.wur.fbr.om.model.dimensions.Dimension}
     * for the equation to be dimensional consistent.
     *
     * @return True when the equation is dimensional consistent, or false if not.
     */
    public boolean isDimensionalConsistent(){
        if(left.isDimensionalConsistent() && right.isDimensionalConsistent()){
            return left.getDimensionOfResult().equals(right.getDimensionOfResult());
        }
        return false;
    }

    /**
     * Returns a string representation of the equation.
     * The equation and subexpressions are marked if they are not dimensional consistent.
     *
     * @return The string representation.
     */
    @Override
    public String toString(){
        String str = left.toString()+" "+condition.getSymbol()+" "+right.toString();
        if(!this.isDimensionalConsistent()) str = "["+str+"->XX]";
        return str;
    }
}
