package nl.wur.fbr.om.math;

import nl.wur.fbr.om.conversion.CoreInstanceFactory;
import nl.wur.fbr.om.core.set.CoreUnitAndScaleSet;
import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.core.set.quantities.angle.Angle;
import nl.wur.fbr.om.core.set.quantities.length.Area;
import nl.wur.fbr.om.core.set.quantities.length.Length;
import nl.wur.fbr.om.core.set.quantities.length.Radius;
import nl.wur.fbr.om.core.set.quantities.length.Volume;
import nl.wur.fbr.om.core.set.quantities.temperature.Temperature;
import nl.wur.fbr.om.core.set.quantities.time.Time;
import nl.wur.fbr.om.exceptions.QuantityCreationException;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.math.equations.ConditionalExpression;
import nl.wur.fbr.om.math.equations.Equation;
import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.impl.MathProcessorImpl;
import nl.wur.fbr.om.math.impl.equations.EquationImpl;
import nl.wur.fbr.om.math.impl.equations.ExpressionImpl;
import nl.wur.fbr.om.model.QuantitySet;
import nl.wur.fbr.om.model.measures.Measure;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for expressions.
 * @author Don Willems on 05/10/15.
 */
public class ExpressionTest {

    @Test
    public void testExpressionAddition() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        CoreQuantitySet quantitySet = new CoreQuantitySet();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
        Expression expression = new ExpressionImpl(length1);
        {
            Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression addition = expression.add(length2);
            {
                Radius radius = (Radius) QuantitySet.createQuantity(CoreQuantitySet.RADIUS);
                Equation equation = new EquationImpl(radius, ConditionalExpression.EQUAL_TO, addition);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
            {
                Time time = (Time) QuantitySet.createQuantity(CoreQuantitySet.TIME);
                Equation equation = new EquationImpl(time, ConditionalExpression.EQUAL_TO, addition);
                System.out.println(equation.toString());
                Assert.assertFalse("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Temperature temperature = (Temperature) QuantitySet.createQuantity(CoreQuantitySet.TEMPERATURE);
            Expression addition = expression.add(temperature);
            {
                Radius radius = (Radius) QuantitySet.createQuantity(CoreQuantitySet.RADIUS);
                Equation equation = new EquationImpl(radius, ConditionalExpression.EQUAL_TO, addition);
                System.out.println(equation.toString());
                Assert.assertFalse("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
    }

    @Test
    public void testExpressionAdditionWithValues() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH,factory.createMeasure(14,CoreUnitAndScaleSet.METRE));
        Expression expression = new ExpressionImpl(length1);
        {
            Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH,factory.createMeasure(10,CoreUnitAndScaleSet.METRE));
            Expression addition = expression.add(length2);
            {
                Expression result = addition.evaluate();
                Measure expectedResult = factory.createMeasure(24, CoreUnitAndScaleSet.METRE);
                Measure resultMeasure = result.getMeasure();
                boolean equals = factory.equals(expectedResult,resultMeasure,0.00000001);
                Assert.assertEquals("Test evaluation result of " + addition, expectedResult.getScalarValue(), result.getMeasure().getScalarValue(), 0.0000001);
                Assert.assertTrue("Test evaluation result of " + addition, equals);
            }
        }
    }

    @Test
    public void testExpressionSubtraction() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
        Expression expression = new ExpressionImpl(length1);
        {
            Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression subtraction = expression.subtract(length2);
            {
                Radius radius = (Radius) QuantitySet.createQuantity(CoreQuantitySet.RADIUS);
                Equation equation = new EquationImpl(radius, ConditionalExpression.EQUAL_TO, subtraction);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
            {
                Time time = (Time) QuantitySet.createQuantity(CoreQuantitySet.TIME);
                Equation equation = new EquationImpl(time, ConditionalExpression.EQUAL_TO, subtraction);
                System.out.println(equation.toString());
                Assert.assertFalse("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Temperature temperature = (Temperature) QuantitySet.createQuantity(CoreQuantitySet.TEMPERATURE);
            Expression subtraction = expression.subtract(temperature);
            {
                Radius radius = (Radius) QuantitySet.createQuantity(CoreQuantitySet.RADIUS);
                Equation equation = new EquationImpl(radius, ConditionalExpression.EQUAL_TO, subtraction);
                System.out.println(equation.toString());
                Assert.assertFalse("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
    }

    @Test
    public void testExpressionSubtractionWithValues() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH,factory.createMeasure(14,CoreUnitAndScaleSet.METRE));
        Expression expression = new ExpressionImpl(length1);
        {
            Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH,factory.createMeasure(10,CoreUnitAndScaleSet.METRE));
            Expression subtraction = expression.subtract(length2);
            {
                Expression result = subtraction.evaluate();
                Measure expectedResult = factory.createMeasure(4, CoreUnitAndScaleSet.METRE);
                Measure resultMeasure = result.getMeasure();
                boolean equals = factory.equals(expectedResult,resultMeasure,0.00000001);
                Assert.assertEquals("Test evaluation result of " + subtraction, expectedResult.getScalarValue(), result.getMeasure().getScalarValue(), 0.0000001);
                Assert.assertTrue("Test evaluation result of " + subtraction, equals);
            }
        }
    }

    @Test
    public void testExpressionMultiplication() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
        Expression expression = new ExpressionImpl(length1);
        {
            Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression multiplication = expression.multiply(length2);
            {
                Area area = (Area) QuantitySet.createQuantity(CoreQuantitySet.AREA);
                Equation equation = new EquationImpl(area, ConditionalExpression.EQUAL_TO, multiplication);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
            {
                Length length3 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length3, ConditionalExpression.EQUAL_TO, multiplication);
                System.out.println(equation.toString());
                Assert.assertFalse("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
    }

    /*
    @Test
    public void testExpressionMultiplicationWithValues() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH,factory.createMeasure(14,CoreUnitAndScaleSet.METRE));
        Expression expression = new ExpressionImpl(length1);
        {
            Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH,factory.createMeasure(10,CoreUnitAndScaleSet.METRE));
            Expression multiplication = expression.multiply(length2);
            {
                Expression result = multiplication.evaluate();
                Measure expectedResult = factory.createMeasure(140, CoreUnitAndScaleSet.SQUARE_METRE);
                Measure resultMeasure = result.getMeasure();
                boolean equals = factory.equals(expectedResult,resultMeasure,0.00000001);
                Assert.assertEquals("Test evaluation result of " + multiplication, expectedResult.getScalarValue(), result.getMeasure().getScalarValue(), 0.0000001);
                Assert.assertTrue("Test evaluation result of " + multiplication, equals);
            }
        }
    }
    */

    @Test
    public void testExpressionDivision() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Area area = (Area) QuantitySet.createQuantity(CoreQuantitySet.AREA);
        Expression expression = new ExpressionImpl(area);
        {
            Length length1 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression division = expression.divide(length1);
            {
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, division);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
            {
                Area area2 = (Area) QuantitySet.createQuantity(CoreQuantitySet.AREA);
                Equation equation = new EquationImpl(area2, ConditionalExpression.EQUAL_TO, division);
                System.out.println(equation.toString());
                Assert.assertFalse("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
    }

    @Test
    public void testExpressionSine() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Angle angle = (Angle) QuantitySet.createQuantity(CoreQuantitySet.ANGLE);
            Expression expression = new ExpressionImpl(angle);
            Expression sine = expression.sin();
            System.out.println(sine.toString());
            Assert.assertTrue("Test dimensional consistency of " + sine, sine.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression lsine = sine.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + lsine, lsine.isDimensionalConsistent());
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, lsine);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression expression = new ExpressionImpl(length);
            Expression sine = expression.sin();
            System.out.println(sine.toString());
            Assert.assertFalse("Test dimensional consistency of " + sine, sine.isDimensionalConsistent());
        }
    }

    @Test
    public void testExpressionCosine() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Angle angle = (Angle) QuantitySet.createQuantity(CoreQuantitySet.ANGLE);
            Expression expression = new ExpressionImpl(angle);
            Expression cosine = expression.cos();
            System.out.println(cosine.toString());
            Assert.assertTrue("Test dimensional consistency of " + cosine, cosine.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression lcosine = cosine.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + lcosine, lcosine.isDimensionalConsistent());
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, lcosine);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression expression = new ExpressionImpl(length);
            Expression cosine = expression.cos();
            System.out.println(cosine.toString());
            Assert.assertFalse("Test dimensional consistency of " + cosine, cosine.isDimensionalConsistent());
        }
    }

    @Test
    public void testExpressionTangent() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Angle angle = (Angle) QuantitySet.createQuantity(CoreQuantitySet.ANGLE);
            Expression expression = new ExpressionImpl(angle);
            Expression tangent = expression.tan();
            System.out.println(tangent.toString());
            Assert.assertTrue("Test dimensional consistency of " + tangent, tangent.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression ltangent = tangent.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + ltangent, ltangent.isDimensionalConsistent());
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, ltangent);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression expression = new ExpressionImpl(length);
            Expression tangent = expression.tan();
            System.out.println(tangent.toString());
            Assert.assertFalse("Test dimensional consistency of " + tangent, tangent.isDimensionalConsistent());
        }
    }

    @Test
    public void testExpressionArcsine() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Angle angle = (Angle) QuantitySet.createQuantity(CoreQuantitySet.ANGLE);
            Expression expression = new ExpressionImpl(angle);
            Expression arcsine = expression.asin();
            System.out.println(arcsine.toString());
            Assert.assertTrue("Test dimensional consistency of " + arcsine, arcsine.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression larcsine = arcsine.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + larcsine, larcsine.isDimensionalConsistent());
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, larcsine);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression expression = new ExpressionImpl(length);
            Expression arcsine = expression.asin();
            System.out.println(arcsine.toString());
            Assert.assertFalse("Test dimensional consistency of " + arcsine, arcsine.isDimensionalConsistent());
        }
    }

    @Test
    public void testExpressionArccosine() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Angle angle = (Angle) QuantitySet.createQuantity(CoreQuantitySet.ANGLE);
            Expression expression = new ExpressionImpl(angle);
            Expression arccosine = expression.acos();
            System.out.println(arccosine.toString());
            Assert.assertTrue("Test dimensional consistency of " + arccosine, arccosine.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression larccosine = arccosine.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + larccosine, larccosine.isDimensionalConsistent());
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, larccosine);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression expression = new ExpressionImpl(length);
            Expression arccosine = expression.acos();
            System.out.println(arccosine.toString());
            Assert.assertFalse("Test dimensional consistency of " + arccosine, arccosine.isDimensionalConsistent());
        }
    }

    @Test
    public void testExpressionArctangent() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Angle angle = (Angle) QuantitySet.createQuantity(CoreQuantitySet.ANGLE);
            Expression expression = new ExpressionImpl(angle);
            Expression arctangent = expression.atan();
            System.out.println(arctangent.toString());
            Assert.assertTrue("Test dimensional consistency of " + arctangent, arctangent.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression larctangent = arctangent.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + larctangent, larctangent.isDimensionalConsistent());
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, larctangent);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression expression = new ExpressionImpl(length);
            Expression arctangent = expression.atan();
            System.out.println(arctangent.toString());
            Assert.assertFalse("Test dimensional consistency of " + arctangent, arctangent.isDimensionalConsistent());
        }
    }

    @Test
    public void testExpressionExponent() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Angle angle = (Angle) QuantitySet.createQuantity(CoreQuantitySet.ANGLE);
            Expression expression = new ExpressionImpl(angle);
            Expression exponent = expression.exp();
            System.out.println(exponent.toString());
            Assert.assertTrue("Test dimensional consistency of " + exponent, exponent.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression lexponent = exponent.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + lexponent, lexponent.isDimensionalConsistent());
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, lexponent);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression expression = new ExpressionImpl(length);
            Expression exponent = expression.exp();
            System.out.println(exponent.toString());
            Assert.assertFalse("Test dimensional consistency of " + exponent, exponent.isDimensionalConsistent());
        }
    }

    @Test
    public void testExpressionNaturalLogarithm() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Angle angle = (Angle) QuantitySet.createQuantity(CoreQuantitySet.ANGLE);
            Expression expression = new ExpressionImpl(angle);
            Expression logarithm = expression.log();
            System.out.println(logarithm.toString());
            Assert.assertTrue("Test dimensional consistency of " + logarithm, logarithm.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression llogarithm = logarithm.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + llogarithm, llogarithm.isDimensionalConsistent());
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, llogarithm);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression expression = new ExpressionImpl(length);
            Expression logarithm = expression.log();
            System.out.println(logarithm.toString());
            Assert.assertFalse("Test dimensional consistency of " + logarithm, logarithm.isDimensionalConsistent());
        }
    }

    @Test
    public void testExpressionBase10Logarithm() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Angle angle = (Angle) QuantitySet.createQuantity(CoreQuantitySet.ANGLE);
            Expression expression = new ExpressionImpl(angle);
            Expression base10logarithm = expression.log10();
            System.out.println(base10logarithm.toString());
            Assert.assertTrue("Test dimensional consistency of " + base10logarithm, base10logarithm.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression lbase10logarithm = base10logarithm.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + lbase10logarithm, lbase10logarithm.isDimensionalConsistent());
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, lbase10logarithm);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression base10logarithm = new ExpressionImpl(length);
            Expression arctangent = base10logarithm.log10();
            System.out.println(arctangent.toString());
            Assert.assertFalse("Test dimensional consistency of " + arctangent, arctangent.isDimensionalConsistent());
        }
    }

    @Test
    public void testExpressionHyperbolicSine() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Angle angle = (Angle) QuantitySet.createQuantity(CoreQuantitySet.ANGLE);
            Expression expression = new ExpressionImpl(angle);
            Expression sine = expression.sinh();
            System.out.println(sine.toString());
            Assert.assertTrue("Test dimensional consistency of " + sine, sine.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression lsine = sine.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + lsine, lsine.isDimensionalConsistent());
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, lsine);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression expression = new ExpressionImpl(length);
            Expression sine = expression.sinh();
            System.out.println(sine.toString());
            Assert.assertFalse("Test dimensional consistency of " + sine, sine.isDimensionalConsistent());
        }
    }

    @Test
    public void testExpressionHyperbolicCosine() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Angle angle = (Angle) QuantitySet.createQuantity(CoreQuantitySet.ANGLE);
            Expression expression = new ExpressionImpl(angle);
            Expression cosine = expression.cosh();
            System.out.println(cosine.toString());
            Assert.assertTrue("Test dimensional consistency of " + cosine, cosine.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression lcosine = cosine.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + lcosine, lcosine.isDimensionalConsistent());
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, lcosine);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression expression = new ExpressionImpl(length);
            Expression cosine = expression.cosh();
            System.out.println(cosine.toString());
            Assert.assertFalse("Test dimensional consistency of " + cosine, cosine.isDimensionalConsistent());
        }
    }

    @Test
    public void testExpressionHyperbolicTangent() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Angle angle = (Angle) QuantitySet.createQuantity(CoreQuantitySet.ANGLE);
            Expression expression = new ExpressionImpl(angle);
            Expression tangent = expression.tanh();
            System.out.println(tangent.toString());
            Assert.assertTrue("Test dimensional consistency of " + tangent, tangent.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression ltangent = tangent.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + ltangent, ltangent.isDimensionalConsistent());
                Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Equation equation = new EquationImpl(length2, ConditionalExpression.EQUAL_TO, ltangent);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
        {
            Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression expression = new ExpressionImpl(length);
            Expression tangent = expression.tanh();
            System.out.println(tangent.toString());
            Assert.assertFalse("Test dimensional consistency of " + tangent, tangent.isDimensionalConsistent());
        }
    }

    @Test
    public void testExpressionSquareRoot() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Area area = (Area) QuantitySet.createQuantity(CoreQuantitySet.AREA);
            Expression expression = new ExpressionImpl(area);
            Expression squareroot = expression.sqrt();
            System.out.println(squareroot.toString());
            Assert.assertTrue("Test dimensional consistency of " + squareroot, squareroot.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression lsquareroot = squareroot.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + lsquareroot, lsquareroot.isDimensionalConsistent());
                Area area2 = (Area) QuantitySet.createQuantity(CoreQuantitySet.AREA);
                Equation equation = new EquationImpl(area2, ConditionalExpression.EQUAL_TO, lsquareroot);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
    }

    @Test
    public void testExpressionCubicRoot() throws UnitOrScaleCreationException, QuantityCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        {
            Volume volume = (Volume) QuantitySet.createQuantity(CoreQuantitySet.VOLUME);
            Expression expression = new ExpressionImpl(volume);
            Expression cubicRoot = expression.cbrt();
            System.out.println(cubicRoot.toString());
            Assert.assertTrue("Test dimensional consistency of " + cubicRoot, cubicRoot.isDimensionalConsistent());
            {
                Length length = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
                Expression lcubicRoot = cubicRoot.multiply(length);
                Assert.assertTrue("Test dimensional consistency of " + lcubicRoot, lcubicRoot.isDimensionalConsistent());
                Area area = (Area) QuantitySet.createQuantity(CoreQuantitySet.AREA);
                Equation equation = new EquationImpl(area, ConditionalExpression.EQUAL_TO, lcubicRoot);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
    }
}
