package nl.wur.fbr.om.math.equations;

import nl.wur.fbr.om.math.processors.MathException;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.quantities.Index;
import nl.wur.fbr.om.model.quantities.Quantity;
import nl.wur.fbr.om.math.Math;

import java.util.Set;

/**
 * This class represents an expression, which is a finite mathematical combination of operators, variables, constants
 * and functions. Instances of this class constrict the expression to either one variable or constant or a function
 * (or operator) with parameters. Expressions can be chained together to form more complex expressions. For instance
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
public abstract class Expression {

    private Expression[] parameters;
    private Function function;
    private double numericalValue;
    private Quantity quantity;
    private Measure measure;
    private Point point;
    private Dimension dimensionOfResult;

    private boolean isUnitConsistent = true;

    /**
     * Creates a new expression with the specified numerical value.
     *
     * @param numericalValue The numerical value.
     */
    public Expression(double numericalValue){
        this.numericalValue = numericalValue;
        dimensionOfResult = new Dimension();
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

    /**
     * Creates a new expression with the specified measure. The measure contains a numerical value and a unit.
     * When operators or functions are applied to a measure, unit conversion will take place if needed. If the
     * measure has a dimension that is not consistent with the operator or function together with the dimension
     * of possible other parameters, the expression is marked as being dimensionally inconsistent and the
     * expression cannot be evaluated.
     *
     * @param measure The measure contained by the expression.
     */
    public Expression(Measure measure){
        this.measure = measure;
        dimensionOfResult = measure.getUnit().getUnitDimension();
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
    public Expression(Point point){
        this.point = point;
        dimensionOfResult = point.getScale().getUnit().getUnitDimension();
    }

    /**
     * Creates a new expression containing a function and a set of parameters to that function. The set of parameters
     * consists of subexpressions, which may either be complex (contains subexpressions themselves) or have a
     * quantity or numerical value as content.
     * @param function The function to be applied in the expression.
     * @param parameters The parameters (subexpressions) that are used as input for the function.
     */
    public Expression(Function function, Expression... parameters){
        this.function = function;
        this.parameters = parameters;
        dimensionOfResult = function.getDimensionOfResult(parameters);
    }

    /**
     * Checks whether this expression and its subexpressions are dimensionally consistent and if so
     * returns true.
     * @return True when the expression is dimensionally consistent, false if it is not.
     */
    public boolean isDimensionalConsistent(){
        return dimensionOfResult!=null;
    }

    /**
     * Checks whether this expression and its subexpressions are unit consistent and if so
     * returns true.
     * @return True when the expression is unit consistent, false if it is not.
     */
    public boolean isUnitConsistent(){
        return isUnitConsistent;
    }

    /**
     * Returns true when this expression contains a variable (i.e. when the value of a quantity or an index has not
     * been set).
     * @return True when the expression contains a variable.
     */
    public boolean isVariable(){
        if(hasQuantity() && quantity.isVariable()) return  true;
        return false;
    }

    /**
     * Returns true if this expression only contains a numerical value and no subexpressions.
     * @return True when the expression contains a numerical value, false otherwise.
     */
    public boolean hasNumericalValue(){
        return (quantity==null && function==null);
    }

    /**
     * Returns the numerical value if the expression contains only a numerical value.
     * @return The numerical value.
     * @throws MathException When the expression does not contain a numerical value.
     */
    public double getNumericalValue(){
        if(quantity!=null || function!=null) throw new MathException("The Expression is not a numerical value.");
        return numericalValue;
    }

    /**
     * Returns true if this expression only contains a quantity (maybe a variable quantity)
     * and no subexpressions.
     * @return True when the expression contains a quantity, false otherwise.
     */
    public boolean hasQuantity(){
        return quantity!=null;
    }

    /**
     * Returns the quantity if the expression contains only a quantity (maybe a variable quantity).
     * @return The quantity.
     * @throws MathException When the expression does not contain a quantity.
     */
    public Quantity getQuantity(){
        if(quantity==null) throw new MathException("The Expression is not a Quantity.");
        return quantity;
    }

    /**
     * Returns the measure contained in the expression if the expression was created with only
     * a measure value.
     * @return The measure value.
     */
    public Measure getMeasure(){
        return measure;
    }

    /**
     * Returns the point on a measurement scale contained in the expression if the expression was
     * created with only a point value.
     * @return The point.
     */
    public Point getPoint(){
        return point;
    }

    /**
     * Returns true when this expression contains an index value.
     * @return True when this is an index.
     */
    public boolean hasIndexValue(){
        return quantity!=null && quantity instanceof Index;
    }

    /**
     * Returns the index value contained in this expression.
     * @return The value of the index or -1 when the index has not been set.
     */
    public int getIndexValue(){
        if(quantity!=null && quantity instanceof Index) return ((Index) quantity).getIndexValue();
        return -1;
    }


    /**
     * Returns true if this expression contains a function with subexpressions as parameters.
     * @return True when the expression contains a function, false otherwise.
     */
    public boolean hasFunction(){
        return function!=null;
    }

    /**
     * Returns the function (or operator function) contained in the expression.
     * @return The function.
     * @throws MathException When the expression does not contain a function.
     */
    public Function getFunction(){
        if(function==null) throw new MathException("The Expression is not a Function.");
        return function;
    }

    /**
     * Returns the parameters to the function contained in the expression.
     * @return The parameters to the function.
     * @throws MathException When the expression does not contain a function.
     */
    public Expression[] getParameters(){
        if(function==null) throw new MathException("The Expression is not a Function.");
        return parameters;
    }

    /**
     * Adds the specified numerical value to the expression.
     * The result is a new expression with an addition function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param numericalValue The numerical value to be added.
     * @return The expression containing the addition of the numerical value.
     */
    public abstract Expression add(double numericalValue);


    /**
     * Adds the specified quantity to the expression.
     * The result is a new expression with an addition function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param quantity The quantity to be added.
     * @return The expression containing the addition of the quantity.
     */
    public abstract Expression add(Quantity quantity);


    /**
     * Adds the specified expression to this expression.
     * The result is a new expression with an addition function with parameters this
     * expression and the specified (sub)expression.
     *
     * @param expression The subexpression to be added.
     * @return The expression containing the addition of the expression.
     */
    public abstract Expression add(Expression expression);


    /**
     * Subtracts the specified numerical value from the expression.
     * The result is a new expression with a subtraction function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param numericalValue The numerical value to be subtracted.
     * @return The expression containing the subtraction of the numerical value.
     */
    public abstract Expression subtract(double numericalValue);

    /**
     * Subtracts the specified quantity from the expression.
     * The result is a new expression with a subtraction function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param quantity The quantity to be subtracted.
     * @return The expression containing the subtraction of the quantity.
     */
    public abstract Expression subtract(Quantity quantity);

    /**
     * Subtracts the specified expression from this expression.
     * The result is a new expression with a subtraction function with parameters this
     * expression and the specified (sub)expression.
     *
     * @param expression The subexpression to be subtracted.
     * @return The expression containing the subtraction of the expression.
     */
    public abstract Expression subtract(Expression expression);


    /**
     * Multiplies the expression  with the specified numerical value.
     * The result is a new expression with a multiplication function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param numericalValue The numerical value to be multiplied by.
     * @return The expression containing the multiplication with the numerical value.
     */
    public abstract Expression multiply(double numericalValue);

    /**
     * Multiplies the expression with the specified quantity.
     * The result is a new expression with a multiplication function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param quantity The quantity to be multiplied by.
     * @return The expression containing the multiplication with the quantity.
     */
    public abstract Expression multiply(Quantity quantity);

    /**
     * Multiplies the expression with the specified expression.
     * The result is a new expression with a multiplication function with parameters this
     * expression and the specified (sub)expression.
     *
     * @param expression The subexpression to be multiplied by.
     * @return The expression containing the multiplication with the expression.
     */
    public abstract Expression multiply(Expression expression);


    /**
     * Divides the expression by the specified numerical value.
     * The result is a new expression with a division function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param numericalValue The numerical value to be divided by.
     * @return The expression containing the division with the numerical value.
     */
    public abstract Expression divide(double numericalValue);

    /**
     * Divides the expression by the specified quantity.
     * The result is a new expression with a division function with parameters this
     * expression and an expression containing the numerical value.
     *
     * @param quantity The quantity to be divided by.
     * @return The expression containing the division with the quantity.
     */
    public abstract Expression divide(Quantity quantity);

    /**
     * Divides the expression by the specified expression.
     * The result is a new expression with a division function with parameters this
     * expression and the specified (sub)expression.
     *
     * @param expression The subexpression to be divided by.
     * @return The expression containing the division with the expression.
     */
    public abstract Expression divide(Expression expression);


    /**
     * Calculates the sine of this expression.
     * The result is a new expression with a sine function with as parameter this
     * expression.
     *
     * @return The expression containing the sine of this expression.
     */
    public abstract Expression sin();


    /**
     * Calculates the cosine of this expression.
     * The result is a new expression with a cosine function with as parameter this
     * expression.
     *
     * @return The expression containing the cosine of this expression.
     */
    public abstract Expression cos();


    /**
     * Calculates the tangent of this expression.
     * The result is a new expression with a tangent function with as parameter this
     * expression.
     *
     * @return The expression containing the tangent of this expression.
     */
    public abstract Expression tan();


    /**
     * Calculates the arcsine of this expression.
     * The result is a new expression with an arcsine function with as parameter this
     * expression.
     *
     * @return The expression containing the arcsine of this expression.
     */
    public abstract Expression asin();


    /**
     * Calculates the arccosine of this expression.
     * The result is a new expression with an arccosine function with as parameter this
     * expression.
     *
     * @return The expression containing the arccosine of this expression.
     */
    public abstract Expression acos();


    /**
     * Calculates the arctangent of this expression.
     * The result is a new expression with an arctangent function with as parameter this
     * expression.
     *
     * @return The expression containing the arctangent of this expression.
     */
    public abstract Expression atan();




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
    public abstract Expression atan2(double numericalValue);

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
    public abstract Expression atan2(Quantity quantity);

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
    public abstract Expression atan2(Expression expression);


    /**
     * Calculates the exponent (Euler's number raised to the parameter) of this expression.
     * The result is a new expression with an exponent function with as parameter this
     * expression.
     *
     * @return The expression containing the exponent of this expression.
     */
    public abstract Expression exp();


    /**
     * Calculates the natural logarithm of this expression.
     * The result is a new expression with a natural logarithm function with as parameter this
     * expression.
     *
     * @return The expression containing the natural logarithm of this expression.
     */
    public abstract Expression log();


    /**
     * Calculates the logarithm with base 10 of this expression.
     * The result is a new expression with a base 10 logarithm function with as parameter this
     * expression.
     *
     * @return The expression containing the base 10 logarithm of this expression.
     */
    public abstract Expression log10();



    /**
     * Calculates the square root of this expression.
     * The result is a new expression with a square root function with as parameter this
     * expression.
     *
     * @return The expression containing the square root of this expression.
     */
    public abstract Expression sqrt();

    /**
     * Calculates the cubic root of this expression.
     * The result is a new expression with a cubic root function with as parameter this
     * expression.
     *
     * @return The expression containing the cubic root of this expression.
     */
    public abstract Expression cbrt();



    /**
     * Calculates the value of this expression raised to the specified power.
     * The result is a new expression with a power function with parameters this
     * expression as the base and the specified numerical value as the exponent.
     *
     * @param numericalValue The numerical value that is used as the exponent in the power function.
     * @return The expression containing the power function and the exponent parameter encapsulated in a subexpression.
     */
    public abstract Expression pow(double numericalValue);

    /**
     * Calculates the value of this expression raised to the specified power.
     * The result is a new expression with a power function with parameters this
     * expression as the base and the specified quantity as the exponent.
     *
     * @param quantity The quantity that is used as the exponent in the power function.
     * @return The expression containing the power function and the exponent parameter encapsulated in a subexpression.
     */
    public abstract Expression pow(Quantity quantity);

    /**
     * Calculates the value of this expression raised to the specified power.
     * The result is a new expression with a power function with parameters this
     * expression as the base and the specified expression as the exponent.
     *
     * @param expression The subexpression that is used as the exponent in the power function.
     * @return The expression containing the power function and the exponent parameter.
     */
    public abstract Expression pow(Expression expression);



    /**
     * Calculates the absolute value of this expression.
     * The result is a new expression with a absolute value function with as parameter this
     * expression.
     *
     * @return The expression containing the absolute value of this expression.
     */
    public abstract Expression abs();



    /**
     * Calculates the hyperbolic sine of this expression.
     * The result is a new expression with a hyperbolic sine function with as parameter this
     * expression.
     *
     * @return The expression containing the hyperbolic sine of this expression.
     */
    public abstract Expression sinh();


    /**
     * Calculates the hyperbolic cosine of this expression.
     * The result is a new expression with a hyperbolic cosine function with as parameter this
     * expression.
     *
     * @return The expression containing the hyperbolic cosine of this expression.
     */
    public abstract Expression cosh();


    /**
     * Calculates the hyperbolic tangent of this expression.
     * The result is a new expression with a hyperbolic tangent function with as parameter this
     * expression.
     *
     * @return The expression containing the hyperbolic tangent of this expression.
     */
    public abstract Expression tanh();



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
    public abstract Expression hypot(double numericalValue);

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
    public abstract Expression hypot(Quantity quantity);

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
    public abstract Expression hypot(Expression expression);




    /**
     * Calculates the magnitude of the vector in the specified expression. If the expression does not contain a
     * vector but contains a scalar value, the magnitude of the scalar value (which is equal to the scalar value) is
     * returned.
     * The result is a new expression with a magnitude function with as parameter this
     * expression.
     *
     * @return The expression containing the magnitude function.
     */
    public abstract Expression magnitude();




    /**
     * Calculates the dot product of the vector in the specified quantity with this expression.
     * The result is a new expression with a dot product function with as parameter the specified measure and this
     * expression.
     *
     * @param quantity The quantity used in calculating the dot product of this expression.
     * @return The expression containing the dot product function.
     */
    public abstract Expression dotProduct(Quantity quantity);

    /**
     * Calculates the dot product of the vector in the specified expression with this expression.
     * The result is a new expression with a dot product function with as parameters the specified expression and this
     * expression.
     *
     * @param expression The expression used in calculating the dot product of this expression.
     * @return The expression containing the dot product function.
     */
    public abstract Expression dotProduct(Expression expression);




    /**
     * Calculates the cross product of the vector in the specified quantity with this expression.
     * The result is a new expression with a cross product function with as parameter the specified measure and this
     * expression.
     *
     * @param quantity The quantity used in calculating the cross product of this expression.
     * @return The expression containing the cross product function.
     */
    public abstract Expression crossProduct(Quantity quantity);

    /**
     * Calculates the cross product of the vector in the specified expression with this expression.
     * The result is a new expression with a cross product function with as parameters the specified expression and this
     * expression.
     *
     * @param expression The expression used in calculating the cross product of this expression.
     * @return The expression containing the cross product function.
     */
    public abstract Expression crossProduct(Expression expression);



    /**
     * Returns the dimension of the result of this expression.
     * @return The resulting dimension.
     */
    public Dimension getDimensionOfResult(){
        return dimensionOfResult;
    }

    /**
     * Evaluates the expression. If possible this method tries to calculate the result of the
     * expression to a measure or point on a measurement scale. If this is not possible because
     * the expression or its subexpressions contain variables (quantities without a value) it will
     * try to simplify the expression to contain the fewest possible variables.
     * @return
     */
    public Expression evaluate(){
        if(hasFunction()){
            return function.evaluate(parameters);
        }
        return this;
    }

    /**
     * Returns a string representation of the expression.
     * The expression or its subexpressions are marked if they are not dimensional consistent.
     * @return The string representation.
     */
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
