package nl.wur.fbr.om.math.impl.equations;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.impl.functions.Addition;
import nl.wur.fbr.om.math.impl.functions.Multiplication;
import nl.wur.fbr.om.math.impl.functions.Subtraction;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.quantities.Quantity;

/**
 * This class represents an implementation of an expression, which is a finite mathematical combination of operators,
 * variables, constants and functions. Instances of this class constrict the expression to either one variable or
 * constant or a function (or operator) with parameters. <br>
 * This subclass of {@link Expression} implements several operators that can be used in expressions such as
 * {@link #add(Expression)} and {@link #subtract(Expression)}. <br>
 * Expressions can be chained together to form more complex expressions. For instance
 * to create the mathematical expression '1+2+3+4+5', you can use the following code:
 * <code>
 *     Expression result = new ExpressionImpl(1).add(2).add(3).add(4).add(5);
 * </code>
 * The result is an expression containing the subsequent chained expressions. Calling the method
 * {@link Expression#evaluate()} will causes the expression to be evaluated, in our example resulting in an
 * {@link Expression} containing the numerical value 15.0.
 *
 * @author Don Willems on 05/10/15.
 */
public class ExpressionImpl extends Expression {

    private Addition addition = new Addition();
    private Subtraction subtraction = new Subtraction();
    private Multiplication multiplication = new Multiplication();

    /**
     * Creates a new expression with the specified numerical value.
     *
     * @param numericalValue The numerical value.
     */
    public ExpressionImpl(double numericalValue) {
        super(numericalValue);
    }

    /**
     * Creates a new expression with the specified quantity. The quantity contains the type (class) of quantity, which has
     * a specific dimension and optionally also a measure (expressed in a unit) or a point on a measurement scale. If the
     * quantity does not contain a point or measures, the quantity should be interpreted as a variable quantity.
     * Calling {@link #evaluate()} on an expression with variable quantities will not yield a single numerical result but another
     * expression where subexpressions have been evaluated. For instance, calling {@link #evaluate()} on:
     * <code>
     *     Length l = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);.
     *     Expression result = new ExpressionImpl(1).add(2).add(3).add(4).add(l);
     * </code>
     * will result in an expression that is equal to:
     * <code>
     *     Expression result = new ExpressionImpl(10).add(l);
     * </code>
     * When operators or functions are applied to a quantity, unit conversion will take place if needed. If the
     * quantity has a dimension that is not consistent with the operator or function together with the dimension
     * of possible other parameters, the expression is marked as being dimensionally inconsistent and the
     * expression cannot be evaluated.
     *
     * @param quantity The quantity contained by the expression.
     */
    public ExpressionImpl(Quantity quantity) {
        super(quantity);
    }

    /**
     * Creates a new expression with the specified measure. The measure contains a numerical value and a unit.
     * When operators or functions are applied to a measure, unit conversion will take place if needed. If the
     * measure has a dimension that is not consistent with the operator or function together with the dimension
     * of possible other parameters, the expression is marked as being dimensionally inconsistent and the
     * expression cannot be evaluated.
     *
     * @param measure The measure contained by the expression.
     */
    public ExpressionImpl(Measure measure) {
        super(measure);
    }

    /**
     * Creates a new expression with the specified  point on a measurement scale. The point contains a numerical value
     * and a scale together with a unit.
     * When operators or functions are applied to a point, unit and scale conversion will take place if needed. If the
     * point has a dimension that is not consistent with the operator or function together with the dimension
     * of possible other parameters, the expression is marked as being dimensionally inconsistent and the
     * expression cannot be evaluated.
     *
     * @param point The point on a measurement scale contained by the expression.
     */
    public ExpressionImpl(Point point) {
        super(point);
    }

    /**
     * Creates a new expression containing a function and a set of parameters to that function. The set of parameters
     * consists of subexpressions, which may either be complex (contains subexpressions themselves) or have a
     * quantity or numerical value as content.
     * @param function The function to be applied in the expression.
     * @param parameters The parameters (subexpressions) that are used as input for the function.
     */
    public ExpressionImpl(Function function, Expression... parameters) {
        super(function, parameters);
    }

    /**
     * Adds the specified numerical value to the expression.
     * The result is a new expression with the {@link Addition} function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param numericalValue The numerical value to be added.
     * @return The expression containing the addition of the numerical value.
     */
    @Override
    public Expression add(double numericalValue){
        Expression result = new ExpressionImpl(addition,this,new ExpressionImpl(numericalValue));
        return result;
    }

    /**
     * Adds the specified numerical value to the expression.
     * The result is a new expression with the {@link Addition} function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param quantity The quantity to be added.
     * @return The expression containing the addition of the quantity.
     */
    @Override
    public Expression add(Quantity quantity){
        Expression result = new ExpressionImpl(addition,this,new ExpressionImpl(quantity));
        return result;
    }

    /**
     * Adds the specified expression to this expression.
     * The result is a new expression with the {@link Addition} function with parameters this
     * expression and the specified (sub)expression.
     *
     * @param expression The subexpression to be added.
     * @return The expression containing the addition of the expression.
     */
    @Override
    public Expression add(Expression expression){
        Expression result = new ExpressionImpl(addition,this,expression);
        return result;
    }

    /**
     * Subtracts the specified numerical value from the expression.
     * The result is a new expression with {@link Subtraction} function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param numericalValue The numerical value to be subtracted.
     * @return The expression containing the subtraction of the numerical value.
     */
    @Override
    public Expression subtract(double numericalValue) {
        Expression result = new ExpressionImpl(subtraction,this,new ExpressionImpl(numericalValue));
        return result;
    }

    /**
     * Subtracts the specified numerical value from the expression.
     * The result is a new expression with the {@link Subtraction} function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param quantity The quantity to be subtracted.
     * @return The expression containing the subtraction of the quantity.
     */
    @Override
    public Expression subtract(Quantity quantity) {
        Expression result = new ExpressionImpl(subtraction,this,new ExpressionImpl(quantity));
        return result;
    }

    /**
     * Subtracts the specified expression from this expression.
     * The result is a new expression with {@link Subtraction} function with parameters this
     * expression and the specified (sub)expression.
     *
     * @param expression The subexpression to be subtracted.
     * @return The expression containing the subtraction of the expression.
     */
    @Override
    public Expression subtract(Expression expression) {
        Expression result = new ExpressionImpl(subtraction,this,expression);
        return result;
    }

    /**
     * Multiplies the expression  with the specified numerical value.
     * The result is a new expression with the {@link Multiplication} function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param numericalValue The numerical value to be multiplied by.
     * @return The expression containing the multiplication with the numerical value.
     */
    @Override
    public Expression multiply(double numericalValue) {
        Expression result = new ExpressionImpl(multiplication,this,new ExpressionImpl(numericalValue));
        return result;
    }

    /**
     * Multiplies the expression with the specified quantity.
     * The result is a new expression with the {@link Multiplication} function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param quantity The quantity to be multiplied by.
     * @return The expression containing the multiplication with the quantity.
     */
    @Override
    public Expression multiply(Quantity quantity) {
        Expression result = new ExpressionImpl(multiplication,this,new ExpressionImpl(quantity));
        return result;
    }

    /**
     * Multiplies the expression with the specified expression.
     * The result is a new expression with the {@link Multiplication} function with parameters this
     * expression and the specified (sub)expression.
     *
     * @param expression The subexpression to be multiplied by.
     * @return The expression containing the multiplication with the expression.
     */
    @Override
    public Expression multiply(Expression expression) {
        Expression result = new ExpressionImpl(multiplication,this,expression);
        return result;
    }
}
