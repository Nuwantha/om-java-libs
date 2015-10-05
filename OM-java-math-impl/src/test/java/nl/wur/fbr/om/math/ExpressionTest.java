package nl.wur.fbr.om.math;

import nl.wur.fbr.om.conversion.CoreInstanceFactory;
import nl.wur.fbr.om.core.set.CoreUnitAndScaleSet;
import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.core.set.quantities.length.Length;
import nl.wur.fbr.om.core.set.quantities.length.Radius;
import nl.wur.fbr.om.core.set.quantities.temperature.Temperature;
import nl.wur.fbr.om.core.set.quantities.time.Time;
import nl.wur.fbr.om.exceptions.QuantityCreationException;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.math.equations.ConditionalExpression;
import nl.wur.fbr.om.math.equations.Equation;
import nl.wur.fbr.om.math.equations.Expression;
import nl.wur.fbr.om.math.impl.MathProcessorImpl;
import nl.wur.fbr.om.model.QuantitySet;
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
        Expression expression = new Expression(length1);
        {
            Length length2 = (Length) QuantitySet.createQuantity(CoreQuantitySet.LENGTH);
            Expression addition = expression.add(length2);
            {
                Radius radius = (Radius) QuantitySet.createQuantity(CoreQuantitySet.RADIUS);
                Equation equation = new Equation(radius, ConditionalExpression.EQUAL_TO, addition);
                System.out.println(equation.toString());
                Assert.assertTrue("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
            {
                Time time = (Time) QuantitySet.createQuantity(CoreQuantitySet.TIME);
                Equation equation = new Equation(time, ConditionalExpression.EQUAL_TO, addition);
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
                Equation equation = new Equation(radius, ConditionalExpression.EQUAL_TO, addition);
                System.out.println(equation.toString());
                Assert.assertFalse("Test dimensional consistency between " + equation.getLeftExpression() + " and " +
                        equation.getRightExpression(), equation.isDimensionalConsistent());
            }
        }
    }
}
