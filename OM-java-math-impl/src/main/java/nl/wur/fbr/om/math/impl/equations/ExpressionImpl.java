package nl.wur.fbr.om.math.impl.equations;

import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.equations.Function;
import nl.wur.fbr.om.math.impl.functions.*;
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
    private Division division = new Division();
    private Sine sine = new Sine();
    private Cosine cosine = new Cosine();
    private Tangent tangent = new Tangent();
    private Arcsine arcsine = new Arcsine();
    private Arccosine arccosine = new Arccosine();
    private Arctangent arctangent = new Arctangent();
    private Exponent exponent = new Exponent();
    private NaturalLogarithm naturalLogarithm = new NaturalLogarithm();
    private Base10Logarithm base10Logarithm = new Base10Logarithm();
    private SquareRoot squareRoot = new SquareRoot();
    private CubicRoot cubicRoot = new CubicRoot();
    private HyperbolicSine hyperbolicSine = new HyperbolicSine();
    private HyperbolicCosine hyperbolicCosine = new HyperbolicCosine();
    private HyperbolicTangent hyperbolicTangent = new HyperbolicTangent();
    private AbsoluteValue absolute = new AbsoluteValue();
    private Power power = new Power();
    private Hypotenuse hypotenuse = new Hypotenuse();
    private Magnitude magnitude = new Magnitude();
    private DotProduct dotProduct = new DotProduct();
    private CrossProduct crossProduct = new CrossProduct();

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

    /**
     * Divides the expression by the specified numerical value.
     * The result is a new expression with the {@link Division} function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param numericalValue The numerical value to be divided by.
     * @return The expression containing the division with the numerical value.
     */
    @Override
    public Expression divide(double numericalValue) {
        Expression result = new ExpressionImpl(division,this,new ExpressionImpl(numericalValue));
        return result;
    }

    /**
     * Divides the expression by the specified quantity.
     * The result is a new expression with the {@link Division} function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param quantity The quantity to be divided by.
     * @return The expression containing the division with the quantity.
     */
    @Override
    public Expression divide(Quantity quantity) {
        Expression result = new ExpressionImpl(division,this,new ExpressionImpl(quantity));
        return result;
    }

    /**
     * Divides the expression by the specified expression.
     * The result is a new expression with the {@link Division} function with parameters this
     * expression and the specified (sub)expression.
     *
     * @param expression The subexpression to be divided by.
     * @return The expression containing the division with the expression.
     */
    @Override
    public Expression divide(Expression expression) {
        Expression result = new ExpressionImpl(division,this,expression);
        return result;
    }

    /**
     * Calculates the sine of this expression.
     * The result is a new expression with the {@link Sine} function with as parameter this
     * expression.
     *
     * @return The expression containing the sine of this expression.
     */
    @Override
    public Expression sin() {
        Expression result = new ExpressionImpl(sine,this);
        return result;
    }

    /**
     * Calculates the cosine of this expression.
     * The result is a new expression with the {@link Cosine} function with as parameter this
     * expression.
     *
     * @return The expression containing the cosine of this expression.
     */
    @Override
    public Expression cos() {
        Expression result = new ExpressionImpl(cosine,this);
        return result;
    }

    /**
     * Calculates the tangent of this expression.
     * The result is a new expression with the {@link Tangent} function with as parameter this
     * expression.
     *
     * @return The expression containing the tangent of this expression.
     */
    @Override
    public Expression tan() {
        Expression result = new ExpressionImpl(tangent,this);
        return result;
    }

    /**
     * Calculates the arcsine of this expression.
     * The result is a new expression with the {@link Arcsine} function with as parameter this
     * expression.
     *
     * @return The expression containing the arcsine of this expression.
     */
    @Override
    public Expression asin() {
        Expression result = new ExpressionImpl(arcsine,this);
        return result;
    }

    /**
     * Calculates the arccosine of this expression.
     * The result is a new expression with the {@link Arccosine} function with as parameter this
     * expression.
     *
     * @return The expression containing the arccosine of this expression.
     */
    @Override
    public Expression acos() {
        Expression result = new ExpressionImpl(arccosine,this);
        return result;
    }

    /**
     * Calculates the arctangent of this expression.
     * The result is a new expression with the {@link Arctangent} function with as parameter this
     * expression.
     *
     * @return The expression containing the arctangent of this expression.
     */
    @Override
    public Expression atan() {
        Expression result = new ExpressionImpl(arctangent,this);
        return result;
    }

    /**
     * Calculates the arctangent of this expression divided by the specified expression.
     * I.e. the angle from the conversion of rectangular coordinates (x,y) to polar coordinates (r,angle),
     * where the specified expression is the ordinate coordinate (x) and this expression is the
     * abscissa coordinate (y).
     * Both coordinates should have the same dimension and be convertible into each other.
     *
     * @param numericalValue The ordinate coordinate (x).
     * @return The expression containing the arctangent of this expression.
     */
    @Override
    public Expression atan2(double numericalValue) {
        Expression result = new ExpressionImpl(arctangent,this,new ExpressionImpl(numericalValue));
        return result;
    }

    /**
     * Calculates the arctangent of this expression divided by the specified expression.
     * I.e. the angle from the conversion of rectangular coordinates (x,y) to polar coordinates (r,angle),
     * where the specified expression is the ordinate coordinate (x) and this expression is the
     * abscissa coordinate (y).
     * Both coordinates should have the same dimension and be convertible into each other.
     *
     * @param quantity The ordinate coordinate (x).
     * @return The expression containing the arctangent of this expression.
     */
    @Override
    public Expression atan2(Quantity quantity) {
        Expression result = new ExpressionImpl(arctangent,this,new ExpressionImpl(quantity));
        return result;
    }

    /**
     * Calculates the arctangent of this expression divided by the specified expression.
     * I.e. the angle from the conversion of rectangular coordinates (x,y) to polar coordinates (r,angle),
     * where the specified expression is the ordinate coordinate (x) and this expression is the
     * abscissa coordinate (y).
     * Both coordinates should have the same dimension and be convertible into each other.
     *
     * @param expression The ordinate coordinate (x).
     * @return The expression containing the arctangent of this expression.
     */
    @Override
    public Expression atan2(Expression expression) {
        Expression result = new ExpressionImpl(arctangent,this,expression);
        return result;
    }

    /**
     * Calculates the exponent (Euler's number raised to the parameter) of this expression.
     * The result is a new expression with the {@link Exponent} function with as parameter this
     * expression.
     *
     * @return The expression containing the exponent of this expression.
     */
    @Override
    public Expression exp() {
        Expression result = new ExpressionImpl(exponent,this);
        return result;
    }

    /**
     * Calculates the natural logarithm of this expression.
     * The result is a new expression with the {@link NaturalLogarithm} function with as parameter this
     * expression.
     *
     * @return The expression containing the natural logarithm of this expression.
     */
    @Override
    public Expression log() {
        Expression result = new ExpressionImpl(naturalLogarithm,this);
        return result;
    }

    /**
     * Calculates the logarithm with base 10 of this expression.
     * The result is a new expression with the {@link Base10Logarithm} function with as parameter this
     * expression.
     *
     * @return The expression containing the base 10 logarithm of this expression.
     */
    @Override
    public Expression log10() {
        Expression result = new ExpressionImpl(base10Logarithm,this);
        return result;
    }

    /**
     * Calculates the square root of this expression.
     * The result is a new expression with the {@link SquareRoot} function with as parameter this
     * expression.
     *
     * @return The expression containing the square root of this expression.
     */
    @Override
    public Expression sqrt() {
        Expression result = new ExpressionImpl(squareRoot,this);
        return result;
    }

    /**
     * Calculates the cubic root of this expression.
     * The result is a new expression with the {@link CubicRoot} function with as parameter this
     * expression.
     *
     * @return The expression containing the cubic root of this expression.
     */
    @Override
    public Expression cbrt() {
        Expression result = new ExpressionImpl(cubicRoot,this);
        return result;
    }

    /**
     * Calculates the value of this expression raised to the specified power.
     * The result is a new expression with the {@link Power} function with parameters this
     * expression as the base and the specified numerical value as the exponent.
     *
     * @param numericalValue The numerical value that is used as the exponent in the power function.
     * @return The expression containing the power function and the exponent parameter encapsulated in a subexpression.
     */
    @Override
    public Expression pow(double numericalValue) {
        Expression result = new ExpressionImpl(power,this,new ExpressionImpl(numericalValue));
        return result;
    }

    /**
     * Calculates the value of this expression raised to the specified power.
     * The result is a new expression with a power function with parameters this
     * expression as the base and the specified quantity as the exponent.
     *
     * @param quantity The quantity that is used as the exponent in the power function.
     * @return The expression containing the power function and the exponent parameter encapsulated in a subexpression.
     */
    @Override
    public Expression pow(Quantity quantity) {
        Expression result = new ExpressionImpl(power,this, new ExpressionImpl(quantity));
        return result;
    }

    /**
     * Calculates the value of this expression raised to the specified power.
     * The result is a new expression with a power function with parameters this
     * expression as the base and the specified expression as the exponent.
     *
     * @param expression The subexpression that is used as the exponent in the power function.
     * @return The expression containing the power function and the exponent parameter.
     */
    @Override
    public Expression pow(Expression expression) {
        Expression result = new ExpressionImpl(power,this,expression);
        return result;
    }



    /**
     * Calculates the absolute value of this expression.
     * The result is a new expression with the {@link AbsoluteValue} function with as parameter this
     * expression.
     *
     * @return The expression containing the absolute value of this expression.
     */
    @Override
    public Expression abs() {
        Expression result = new ExpressionImpl(absolute,this);
        return result;
    }

    /**
     * Calculates the hyperbolic sine of this expression.
     * The result is a new expression with the {@link HyperbolicSine} function with as parameter this
     * expression.
     *
     * @return The expression containing the hyperbolic sine of this expression.
     */
    @Override
    public Expression sinh() {
        Expression result = new ExpressionImpl(hyperbolicSine,this);
        return result;
    }

    /**
     * Calculates the hyperbolic cosine of this expression.
     * The result is a new expression with the {@link HyperbolicCosine} function with as parameter this
     * expression.
     *
     * @return The expression containing the hyperbolic cosine of this expression.
     */
    @Override
    public Expression cosh() {
        Expression result = new ExpressionImpl(hyperbolicCosine,this);
        return result;
    }

    /**
     * Calculates the hyperbolic tangent of this expression.
     * The result is a new expression with the {@link HyperbolicTangent} function with as parameter this
     * expression.
     *
     * @return The expression containing the hyperbolic tangent of this expression.
     */
    @Override
    public Expression tanh() {
        Expression result = new ExpressionImpl(hyperbolicTangent,this);
        return result;
    }

    /**
     * Calculates the hypotenuse of this expression and the specified numerical value.
     * The result is the length of the hypotenuse of a right-angled rectangle, i.e. the longest side of the rectangle.
     * The hypotenuse is the side opposite to the right angle. The length of the hypotenuse (h) can be calculated by
     * using the Pythagorean theorem h = sqrt(x<sup>2</sup>,y<sup>2</sup>), where x is this expression and y is
     * the specified numerical value.
     *
     * @param numericalValue The numerical value that is used as the second parameter in the calculation of the hypotenuse.
     * @return The expression containing the hypotenuse function and the second parameter encapsulated in a subexpression.
     */
    @Override
    public Expression hypot(double numericalValue) {
        Expression result = new ExpressionImpl(hypotenuse,this,new ExpressionImpl(numericalValue));
        return result;
    }

    /**
     * Calculates the hypotenuse of this expression and the specified quantity.
     * The result is the length of the hypotenuse of a right-angled rectangle, i.e. the longest side of the rectangle.
     * The hypotenuse is the side opposite to the right angle. The length of the hypotenuse (h) can be calculated by
     * using the Pythagorean theorem h = sqrt(x<sup>2</sup>,y<sup>2</sup>), where x is this expression and y is
     * the specified quantity.
     *
     * @param quantity The quantity that is used as the second parameter in the calculation of the hypotenuse.
     * @return The expression containing the hypotenuse function and the second parameter encapsulated in a subexpression.
     */
    @Override
    public Expression hypot(Quantity quantity) {
        Expression result = new ExpressionImpl(hypotenuse,this,new ExpressionImpl(quantity));
        return result;
    }

    /**
     * Calculates the hypotenuse of this expression and the specified expression.
     * The result is the length of the hypotenuse of a right-angled rectangle, i.e. the longest side of the rectangle.
     * The hypotenuse is the side opposite to the right angle. The length of the hypotenuse (h) can be calculated by
     * using the Pythagorean theorem h = sqrt(x<sup>2</sup>,y<sup>2</sup>), where x is this expression and y is
     * the specified expression.
     *
     * @param expression The expression that is used as the second parameter in the calculation of the hypotenuse.
     * @return The expression containing the hypotenuse function and the second parameter encapsulated in a subexpression.
     */
    @Override
    public Expression hypot(Expression expression) {
        Expression result = new ExpressionImpl(hypotenuse,this,expression);
        return result;
    }

    /**
     * Calculates the magnitude of the vector in the specified expression. If the expression does not contain a
     * vector but contains a scalar value, the magnitude of the scalar value (which is equal to the scalar value) is
     * returned.
     * The result is a new expression with a magnitude function with as parameter this
     * expression.
     *
     * @return The expression containing the magnitude function.
     */
    @Override
    public Expression magnitude() {
        Expression result = new ExpressionImpl(magnitude,this);
        return result;
    }

    /**
     * Calculates the dot product of the vector in the specified quantity with this expression.
     * The result is a new expression with the {@link DotProduct} function with as parameter the specified measure and this
     * expression.
     *
     * @param quantity The quantity used in calculating the dot product of this expression.
     * @return The expression containing the dot product function.
     */
    @Override
    public Expression dotProduct(Quantity quantity) {
        Expression result = new ExpressionImpl(dotProduct,this,new ExpressionImpl(quantity));
        return result;
    }

    /**
     * Calculates the dot product of the vector in the specified expression with this expression.
     * The result is a new expression with the {@link DotProduct} function with as parameters the specified expression and this
     * expression.
     *
     * @param expression The expression used in calculating the dot product of this expression.
     * @return The expression containing the dot product function.
     */
    @Override
    public Expression dotProduct(Expression expression) {
        Expression result = new ExpressionImpl(dotProduct,this,expression);
        return result;
    }

    /**
     * Calculates the cross product of the vector in the specified quantity with this expression.
     * The result is a new expression with the {@link CrossProduct} function with as parameter the specified measure and this
     * expression.
     *
     * @param quantity The quantity used in calculating the cross product of this expression.
     * @return The expression containing the cross product function.
     */
    @Override
    public Expression crossProduct(Quantity quantity) {
        Expression result = new ExpressionImpl(crossProduct,this,new ExpressionImpl(quantity));
        return result;
    }

    /**
     * Calculates the cross product of the vector in the specified expression with this expression.
     * The result is a new expression with the {@link CrossProduct} product function with as parameters the specified expression and this
     * expression.
     *
     * @param expression The expression used in calculating the cross product of this expression.
     * @return The expression containing the cross product function.
     */
    @Override
    public Expression crossProduct(Expression expression) {
        Expression result = new ExpressionImpl(crossProduct,this,expression);
        return result;
    }
}
