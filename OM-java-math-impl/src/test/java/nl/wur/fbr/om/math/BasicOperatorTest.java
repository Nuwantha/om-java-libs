package nl.wur.fbr.om.math;

import nl.wur.fbr.om.conversion.CoreInstanceFactory;
import nl.wur.fbr.om.core.impl.units.UnitDivisionImpl;
import nl.wur.fbr.om.core.set.CoreSet;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.math.impl.MathProcessorImpl;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.units.UnitDivision;
import nl.wur.fbr.om.model.units.UnitMultiplication;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class contains unit tests for the basic mathematical operators.
 *
 * @author Don Willems on 12/08/15.
 */
public class BasicOperatorTest {

    @Test
    public void testAdditionOfTwoMeasures() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(14, CoreSet.METRE);
        Measure m2 = factory.createScalarMeasure(700, CoreSet.DECIMETRE);
        Measure m3 = Math.add(m1,m2);
        System.out.println("Addition " + m1 + " + " + m2 + " = " + m3);
        Assert.assertEquals("Test addition",84,m3.getScalarValue(),0.00000001);
        Assert.assertEquals("Test addition",CoreSet.METRE,m3.getUnit());
        Measure m4 = factory.createScalarMeasure(12, CoreSet.KILOGRAM);
        try {
            Measure m5 = Math.add(m3, m4);
            Assert.fail("Expected MathException when adding 84 m and 12 kg.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
    }

    @Test
    public void testAdditionOfAMeasureAndAPoint() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Point m1 = factory.createScalarPoint(14, CoreSet.CELSIUS_SCALE);
        Measure m2 = factory.createScalarMeasure(18, CoreSet.FAHRENHEIT);
        Point m3 = Math.add(m1, m2);
        System.out.println("Addition "+m1+" + "+m2+" = "+m3);
        Assert.assertEquals("Test addition", 24, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test addition",CoreSet.CELSIUS,m3.getScale().getUnit());
        Assert.assertEquals("Test addition",CoreSet.CELSIUS_SCALE,m3.getScale());
        Measure m4 = factory.createScalarMeasure(12, CoreSet.KILOGRAM);
        try {
            Point m5 = Math.add(m3, m4);
            Assert.fail("Expected MathException when adding 24 C (scale) and 12 kg.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
    }

    @Test
    public void testSubtractionOfTwoMeasures() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(14, CoreSet.METRE);
        Measure m2 = factory.createScalarMeasure(70, CoreSet.DECIMETRE);
        Measure m3 = Math.subtract(m1, m2);
        System.out.println("Subtraction " + m1 + " - " + m2 + " = " + m3);
        Assert.assertEquals("Test subtraction",7,m3.getScalarValue(),0.00000001);
        Assert.assertEquals("Test subtraction",CoreSet.METRE,m3.getUnit());
        Measure m4 = factory.createScalarMeasure(12, CoreSet.KILOGRAM);
        try {
            Measure m5 = Math.add(m3, m4);
            Assert.fail("Expected MathException when subtraction 7 m and 12 kg.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
    }

    @Test
    public void testSubtractionOfAMeasureFromAPoint() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Point m1 = factory.createScalarPoint(14, CoreSet.CELSIUS_SCALE);
        Measure m2 = factory.createScalarMeasure(18, CoreSet.FAHRENHEIT);
        Point m3 = Math.subtract(m1, m2);
        System.out.println("Subtraction " + m1 + " - " + m2 + " = " + m3);
        Assert.assertEquals("Test subtraction", 4, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test subtraction",CoreSet.CELSIUS,m3.getScale().getUnit());
        Assert.assertEquals("Test subtraction",CoreSet.CELSIUS_SCALE,m3.getScale());
        Measure m4 = factory.createScalarMeasure(12, CoreSet.KILOGRAM);
        try {
            Point m5 = Math.subtract(m3, m4);
            Assert.fail("Expected MathException when subtraction 4 C and 12 kg.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
    }

    @Test
    public void testSubtractionOfTwoPoints() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Point m1 = factory.createScalarPoint(14, CoreSet.CELSIUS_SCALE);
        Point m2 = factory.createScalarPoint(50, CoreSet.FAHRENHEIT_SCALE);
        Measure m3 = Math.difference(m1, m2);
        System.out.println("Subtraction (difference between points) " + m1 + " - " + m2 + " = " + m3);
        Assert.assertEquals("Test subtraction", 4, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test addition",CoreSet.CELSIUS,m3.getUnit());
    }

    @Test
    public void testMultiplicationOfTwoMeasures() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(20, CoreSet.NEWTON);
        Measure m2 = factory.createScalarMeasure(4, CoreSet.KILOMETRE);
        Measure m3 = Math.multiply(m1, m2);
        System.out.println("Multiplication " + m1 + " * " + m2 + " = " + m3);
        Assert.assertEquals("Test multiplication", 80, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test multiplication",CoreSet.NEWTON,((UnitMultiplication) m3.getUnit()).getTerm1());
        Assert.assertEquals("Test multiplication",CoreSet.KILOMETRE,((UnitMultiplication) m3.getUnit()).getTerm2());
    }

    @Test
    public void testMultiplicationOfAMeasureAndADouble() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(20, CoreSet.KILOGRAM);
        Measure m3 = Math.multiply(m1, 7);
        System.out.println("Multiplication " + m1 + " * " + 7 + " = " + m3);
        Assert.assertEquals("Test multiplication", 140, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test multiplication",CoreSet.KILOGRAM,m3.getUnit());
    }

    @Test
    public void testDivisionOfTwoMeasures() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(20, CoreSet.INCH);
        Measure m2 = factory.createScalarMeasure(4, CoreSet.MINUTE);
        Measure m3 = Math.divide(m1, m2);
        System.out.println("Division " + m1 + " / " + m2 + " = " + m3);
        Assert.assertEquals("Test division", 5, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test division", CoreSet.INCH, ((UnitDivision) m3.getUnit()).getNumerator());
        Assert.assertEquals("Test division",CoreSet.MINUTE,((UnitDivision) m3.getUnit()).getDenominator());
    }

    @Test
    public void testDivisionOfAMeasureAndADouble() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(20, CoreSet.KILOGRAM);
        Measure m3 = Math.divide(m1, 2);
        System.out.println("Division " + m1 + " / " + 2 + " = " + m3);
        Assert.assertEquals("Test division", 10, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test division",CoreSet.KILOGRAM,m3.getUnit());
    }

}
