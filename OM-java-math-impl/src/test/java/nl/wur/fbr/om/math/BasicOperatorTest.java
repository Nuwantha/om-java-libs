package nl.wur.fbr.om.math;

import nl.wur.fbr.om.conversion.CoreInstanceFactory;
import nl.wur.fbr.om.core.set.CoreUnitAndScaleSet;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.math.impl.MathProcessorImpl;
import nl.wur.fbr.om.math.processors.MathException;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.units.UnitDivision;
import nl.wur.fbr.om.model.units.UnitExponentiation;
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
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(14, CoreUnitAndScaleSet.METRE);
        Measure m2 = factory.createScalarMeasure(700, CoreUnitAndScaleSet.DECIMETRE);
        Measure m3 = Math.add(m1,m2);
        System.out.println("Addition " + m1 + " + " + m2 + " = " + m3);
        Assert.assertEquals("Test addition",84,m3.getScalarValue(),0.00000001);
        Assert.assertEquals("Test addition", CoreUnitAndScaleSet.METRE,m3.getUnit());
        Measure m4 = factory.createScalarMeasure(12, CoreUnitAndScaleSet.KILOGRAM);
        try {
            Measure m5 = Math.add(m3, m4);
            Assert.fail("Expected MathException when adding 84 m and 12 kg.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
    }

    @Test
    public void testAdditionOfTwoVectorMeasures() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        double[] v1 = {14,22};
        double[] v2 = {700,-200};
        Measure m1 = factory.createVectorMeasure(v1, CoreUnitAndScaleSet.METRE);
        Measure m2 = factory.createVectorMeasure(v2, CoreUnitAndScaleSet.DECIMETRE);
        Measure m3 = Math.add(m1,m2);
        System.out.println("Addition " + m1 + " + " + m2 + " = " + m3);
        Assert.assertEquals("Test addition", 84, m3.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test addition",2,m3.getVectorValue()[1],0.00000001);
        Assert.assertEquals("Test addition", CoreUnitAndScaleSet.METRE,m3.getUnit());
        Measure m4 = factory.createScalarMeasure(12, CoreUnitAndScaleSet.METRE);
        try {
            Measure m5 = Math.add(m3, m4);
            Assert.fail("Expected MathException when adding [84,20] m and 12 m.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
    }

    @Test
    public void testAdditionOfAMeasureAndAPoint() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Point m1 = factory.createScalarPoint(14, CoreUnitAndScaleSet.CELSIUS_SCALE);
        Measure m2 = factory.createScalarMeasure(18, CoreUnitAndScaleSet.FAHRENHEIT);
        Point m3 = Math.add(m1, m2);
        System.out.println("Addition "+m1+" + "+m2+" = "+m3);
        Assert.assertEquals("Test addition", 24, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test addition", CoreUnitAndScaleSet.CELSIUS,m3.getScale().getUnit());
        Assert.assertEquals("Test addition", CoreUnitAndScaleSet.CELSIUS_SCALE,m3.getScale());
        Measure m4 = factory.createScalarMeasure(12, CoreUnitAndScaleSet.KILOGRAM);
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
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(14, CoreUnitAndScaleSet.METRE);
        Measure m2 = factory.createScalarMeasure(70, CoreUnitAndScaleSet.DECIMETRE);
        Measure m3 = Math.subtract(m1, m2);
        System.out.println("Subtraction " + m1 + " - " + m2 + " = " + m3);
        Assert.assertEquals("Test subtraction",7,m3.getScalarValue(),0.00000001);
        Assert.assertEquals("Test subtraction", CoreUnitAndScaleSet.METRE,m3.getUnit());
        Measure m4 = factory.createScalarMeasure(12, CoreUnitAndScaleSet.KILOGRAM);
        try {
            Measure m5 = Math.add(m3, m4);
            Assert.fail("Expected MathException when subtraction 7 m and 12 kg.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
    }

    @Test
    public void testSubtractionOfTwoCVectorMeasures() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        double[] v1 = {14,22};
        double[] v2 = {700,-200};
        Measure m1 = factory.createVectorMeasure(v1, CoreUnitAndScaleSet.METRE);
        Measure m2 = factory.createVectorMeasure(v2, CoreUnitAndScaleSet.DECIMETRE);
        Measure m3 = Math.subtract(m1, m2);
        System.out.println("Subtraction " + m1 + " - " + m2 + " = " + m3);
        Assert.assertEquals("Test subtraction", -56, m3.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test subtraction",42,m3.getVectorValue()[1],0.00000001);
        Assert.assertEquals("Test subtraction", CoreUnitAndScaleSet.METRE,m3.getUnit());
        Measure m4 = factory.createScalarMeasure(12, CoreUnitAndScaleSet.METRE);
        try {
            Measure m5 = Math.add(m3, m4);
            Assert.fail("Expected MathException when subtraction [-56,42] m and 12 m.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
    }

    @Test
    public void testSubtractionOfAMeasureFromAPoint() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Point m1 = factory.createScalarPoint(14, CoreUnitAndScaleSet.CELSIUS_SCALE);
        Measure m2 = factory.createScalarMeasure(18, CoreUnitAndScaleSet.FAHRENHEIT);
        Point m3 = Math.subtract(m1, m2);
        System.out.println("Subtraction " + m1 + " - " + m2 + " = " + m3);
        Assert.assertEquals("Test subtraction", 4, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test subtraction", CoreUnitAndScaleSet.CELSIUS,m3.getScale().getUnit());
        Assert.assertEquals("Test subtraction", CoreUnitAndScaleSet.CELSIUS_SCALE,m3.getScale());
        Measure m4 = factory.createScalarMeasure(12, CoreUnitAndScaleSet.KILOGRAM);
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
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Point m1 = factory.createScalarPoint(14, CoreUnitAndScaleSet.CELSIUS_SCALE);
        Point m2 = factory.createScalarPoint(50, CoreUnitAndScaleSet.FAHRENHEIT_SCALE);
        Measure m3 = Math.difference(m1, m2);
        System.out.println("Subtraction (difference between points) " + m1 + " - " + m2 + " = " + m3);
        Assert.assertEquals("Test subtraction", 4, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test addition", CoreUnitAndScaleSet.CELSIUS,m3.getUnit());
    }

    @Test
    public void testMultiplicationOfTwoMeasures() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(20, CoreUnitAndScaleSet.NEWTON);
        Measure m2 = factory.createScalarMeasure(4, CoreUnitAndScaleSet.KILOMETRE);
        Measure m3 = Math.multiply(m1, m2);
        System.out.println("Multiplication " + m1 + " * " + m2 + " = " + m3);
        Assert.assertEquals("Test multiplication", 80, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test multiplication", CoreUnitAndScaleSet.NEWTON,((UnitMultiplication) m3.getUnit()).getTerm1());
        Assert.assertEquals("Test multiplication", CoreUnitAndScaleSet.KILOMETRE,((UnitMultiplication) m3.getUnit()).getTerm2());
    }

    @Test
    public void testMultiplicationOfAVectorAndAScalarMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        double[] v1 = {10,-5};
        Measure m1 = factory.createVectorMeasure(v1, CoreUnitAndScaleSet.NEWTON);
        Measure m2 = factory.createScalarMeasure(4, CoreUnitAndScaleSet.KILOMETRE);
        Measure m3 = Math.multiply(m1, m2);
        System.out.println("Multiplication " + m1 + " * " + m2 + " = " + m3);
        Assert.assertEquals("Test multiplication", 40, m3.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test multiplication", -20, m3.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test multiplication", CoreUnitAndScaleSet.NEWTON, ((UnitMultiplication) m3.getUnit()).getTerm1());
        Assert.assertEquals("Test multiplication", CoreUnitAndScaleSet.KILOMETRE, ((UnitMultiplication) m3.getUnit()).getTerm2());
        double[] v2 = {10,-5};
        Measure m4 = factory.createScalarMeasure(7, CoreUnitAndScaleSet.NEWTON);
        Measure m5 = factory.createVectorMeasure(v2, CoreUnitAndScaleSet.KILOMETRE);
        Measure m6 = Math.multiply(m4, m5);
        System.out.println("Multiplication " + m4 + " * " + m5 + " = " + m6);
        Assert.assertEquals("Test multiplication", 70, m6.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test multiplication", -35, m6.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test multiplication", CoreUnitAndScaleSet.NEWTON,((UnitMultiplication) m6.getUnit()).getTerm1());
        Assert.assertEquals("Test multiplication", CoreUnitAndScaleSet.KILOMETRE,((UnitMultiplication) m6.getUnit()).getTerm2());
        try{
            Measure m7 = Math.multiply(m1, m5);
            Assert.fail("Expected MathException when multiplying two vectors.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
    }

    @Test
    public void testMultiplicationOfAMeasureAndADouble() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(20, CoreUnitAndScaleSet.KILOGRAM);
        Measure m3 = Math.multiply(m1, 7);
        System.out.println("Multiplication " + m1 + " * " + 7 + " = " + m3);
        Assert.assertEquals("Test multiplication", 140, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test multiplication", CoreUnitAndScaleSet.KILOGRAM,m3.getUnit());
    }

    @Test
    public void testDivisionOfTwoMeasures() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(20, CoreUnitAndScaleSet.INCH);
        Measure m2 = factory.createScalarMeasure(4, CoreUnitAndScaleSet.MINUTE);
        Measure m3 = Math.divide(m1, m2);
        System.out.println("Division " + m1 + " / " + m2 + " = " + m3);
        Assert.assertEquals("Test division", 5, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test division", CoreUnitAndScaleSet.INCH, ((UnitDivision) m3.getUnit()).getNumerator());
        Assert.assertEquals("Test division", CoreUnitAndScaleSet.MINUTE,((UnitDivision) m3.getUnit()).getDenominator());
    }

    @Test
    public void testDivisionOfAVectorAndScalarMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        double[] v1 = {10,-16};
        Measure m1 = factory.createVectorMeasure(v1, CoreUnitAndScaleSet.INCH);
        Measure m2 = factory.createScalarMeasure(4, CoreUnitAndScaleSet.MINUTE);
        Measure m3 = Math.divide(m1, m2);
        System.out.println("Division " + m1 + " / " + m2 + " = " + m3);
        Assert.assertEquals("Test division", 2.5, m3.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test division", -4, m3.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test division", CoreUnitAndScaleSet.INCH, ((UnitDivision) m3.getUnit()).getNumerator());
        Assert.assertEquals("Test division", CoreUnitAndScaleSet.MINUTE,((UnitDivision) m3.getUnit()).getDenominator());
        try{
            Measure m4 = Math.divide(m2, m1);
            Assert.fail("Expected MathException when dividing a scalar by a vector.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
        try{
            double[] v2 = {10,-16};
            Measure m5 = factory.createVectorMeasure(v2, CoreUnitAndScaleSet.NEWTON);
            Measure m6 = Math.divide(m1, m5);
            Assert.fail("Expected MathException when dividing a vector by a vector.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
    }

    @Test
    public void testDivisionOfAMeasureAndADouble() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(20, CoreUnitAndScaleSet.KILOGRAM);
        Measure m3 = Math.divide(m1, 2);
        System.out.println("Division " + m1 + " / " + 2 + " = " + m3);
        Assert.assertEquals("Test division", 10, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test division", CoreUnitAndScaleSet.KILOGRAM,m3.getUnit());
    }

    @Test
    public void testDivisionOfADoubleAndAMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(20, CoreUnitAndScaleSet.KILOGRAM);
        Measure m3 = Math.divide(2, m1);
        System.out.println("Division 2 / " + m1 + " = " + m3);
        Assert.assertEquals("Test division", 0.1, m3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test division", CoreUnitAndScaleSet.KILOGRAM,((UnitExponentiation)m3.getUnit()).getBase());
        double[] vec = {0.4,2.3};
        Measure m5 = factory.createVectorMeasure(vec, CoreUnitAndScaleSet.CALORIE);
        try {
            Math.divide(2, m5);
            Assert.fail("Exception should have been thrown after division of scalar by vector.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception after division of scalar by vector.",true);
        }
    }

    @Test
    public void testSine() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(1, CoreUnitAndScaleSet.RADIAN);
        Measure m2 = Math.sin(m1);
        System.out.println("Sine: sin("+m1+") = "+m2);
        Assert.assertEquals("Test sine", 0.8414709848, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test sine", CoreUnitAndScaleSet.ONE, m2.getUnit());
        Measure m3 = factory.createScalarMeasure(1, CoreUnitAndScaleSet.DEGREE);
        Measure m4 = Math.sin(m3);
        System.out.println("Sine: sin(" + m3 + ") = " + m4);
        Assert.assertEquals("Test sine", 0.0174524064, m4.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test sine", CoreUnitAndScaleSet.ONE,m4.getUnit());
        double[] vec = {0.4,2.3};
        Measure m5 = factory.createVectorMeasure(vec, CoreUnitAndScaleSet.DEGREE);
        try {
            Math.sin(m5);
            Assert.fail("Exception should have been thrown after taking the sine of a vector.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the sine of a vector.",true);
        }
        Measure m6 = factory.createVectorMeasure(vec, CoreUnitAndScaleSet.METRE);
        try {
            Math.sin(m6);
            Assert.fail("Exception should have been thrown after taking the sine of a measure with a non dimensionless unit.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the sine of a measure with a dimensionless unit.",true);
        }
        Unit kilometrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.KILOMETRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m7 = factory.createScalarMeasure(2.03,kilometrePerKiloMetre);
        Measure m8 = Math.sin(m7);
        System.out.println("Sine: sin(" + m7 + ") = " + m8);
        Assert.assertEquals("Test sine", 0.8964057412, m8.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test sine", CoreUnitAndScaleSet.ONE,m8.getUnit());
        Unit metrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m9 = factory.createScalarMeasure(2.03,metrePerKiloMetre);
        Measure m10 = Math.sin(m9);
        System.out.println("Sine: sin(" + m9 + ") = " + m10);
        Assert.assertEquals("Test sine", 0.0020299986, m10.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test sine", CoreUnitAndScaleSet.ONE,m10.getUnit());
    }

    @Test
    public void testCosine() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(1, CoreUnitAndScaleSet.RADIAN);
        Measure m2 = Math.cos(m1);
        System.out.println("Cosine: cos("+m1+") = "+m2);
        Assert.assertEquals("Test cosine", 0.5403023059, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test cosine", CoreUnitAndScaleSet.ONE, m2.getUnit());
        Measure m3 = factory.createScalarMeasure(1, CoreUnitAndScaleSet.DEGREE);
        Measure m4 = Math.cos(m3);
        System.out.println("Cosine: cos(" + m3 + ") = " + m4);
        Assert.assertEquals("Test cosine", 0.9998476952, m4.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test cosine", CoreUnitAndScaleSet.ONE,m4.getUnit());
        double[] vec = {0.4,2.3};
        Measure m5 = factory.createVectorMeasure(vec, CoreUnitAndScaleSet.DEGREE);
        try {
            Math.cos(m5);
            Assert.fail("Exception should have been thrown after taking the cosine of a vector.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the cosine of a vector.",true);
        }
        Measure m6 = factory.createVectorMeasure(vec, CoreUnitAndScaleSet.METRE);
        try {
            Math.cos(m6);
            Assert.fail("Exception should have been thrown after taking the cosine of a measure with a non dimensionless unit.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the cosine of a measure with a dimensionless unit.",true);
        }
        Unit kilometrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.KILOMETRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m7 = factory.createScalarMeasure(2.03,kilometrePerKiloMetre);
        Measure m8 = Math.cos(m7);
        System.out.println("Cosine: cos(" + m7 + ") = " + m8);
        Assert.assertEquals("Test cosine", -0.4432344157, m8.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test cosine", CoreUnitAndScaleSet.ONE,m8.getUnit());
        Unit metrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m9 = factory.createScalarMeasure(2.03,metrePerKiloMetre);
        Measure m10 = Math.cos(m9);
        System.out.println("Cosine: cos(" + m9 + ") = " + m10);
        Assert.assertEquals("Test cosine", 0.9999979396, m10.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test cosine", CoreUnitAndScaleSet.ONE,m10.getUnit());
    }

    @Test
    public void testTangent() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(1, CoreUnitAndScaleSet.RADIAN);
        Measure m2 = Math.tan(m1);
        System.out.println("Tangent: tan("+m1+") = "+m2);
        Assert.assertEquals("Test tangent", 1.5574077247, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test tangent", CoreUnitAndScaleSet.ONE, m2.getUnit());
        Measure m3 = factory.createScalarMeasure(1, CoreUnitAndScaleSet.DEGREE);
        Measure m4 = Math.tan(m3);
        System.out.println("Tangent: tan(" + m3 + ") = " + m4);
        Assert.assertEquals("Test tangent", 0.0174550649, m4.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test tangent", CoreUnitAndScaleSet.ONE,m4.getUnit());
        double[] vec = {0.4,2.3};
        Measure m5 = factory.createVectorMeasure(vec, CoreUnitAndScaleSet.DEGREE);
        try {
            Math.tan(m5);
            Assert.fail("Exception should have been thrown after taking the tangent of a vector.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the tangent of a vector.",true);
        }
        Measure m6 = factory.createVectorMeasure(vec, CoreUnitAndScaleSet.METRE);
        try {
            Math.tan(m6);
            Assert.fail("Exception should have been thrown after taking the tangent of a measure with a non dimensionless unit.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the tangent of a measure with a dimensionless unit.",true);
        }
        Unit kilometrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.KILOMETRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m7 = factory.createScalarMeasure(2.03,kilometrePerKiloMetre);
        Measure m8 = Math.tan(m7);
        System.out.println("Tangent: tan(" + m7 + ") = " + m8);
        Assert.assertEquals("Test tangent", -2.0224190845, m8.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test tangent", CoreUnitAndScaleSet.ONE,m8.getUnit());
        Unit metrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m9 = factory.createScalarMeasure(2.03,metrePerKiloMetre);
        Measure m10 = Math.tan(m9);
        System.out.println("Tangent: tan(" + m9 + ") = " + m10);
        Assert.assertEquals("Test tangent", 0.0020300028, m10.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test tangent", CoreUnitAndScaleSet.ONE,m10.getUnit());
    }

    @Test
    public void testArcSine() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Unit metrePerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.METRE);
        Unit metrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m1 = factory.createScalarMeasure(1, metrePerMetre);
        Measure m2 = Math.asin(m1);
        System.out.println("Arcsine: asin("+m1+") = "+m2);
        Assert.assertEquals("Test arcsine", 1.5707963268, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test arcsine", CoreUnitAndScaleSet.RADIAN, m2.getUnit());
        double[] vec = {0.4,2.3};
        Measure m5 = factory.createVectorMeasure(vec,metrePerMetre);
        try {
            Math.asin(m5);
            Assert.fail("Exception should have been thrown after taking the arcsine of a vector.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the arcsine of a vector.",true);
        }
        Measure m6 = factory.createVectorMeasure(vec,metrePerKiloMetre);
        try {
            Math.asin(m6);
            Assert.fail("Exception should have been thrown after taking the arcsine of a measure with a non dimensionless unit.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the arcsine of a measure with a dimensionless unit.",true);
        }
        Unit kilometrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.KILOMETRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m7 = factory.createScalarMeasure(0.9322,kilometrePerKiloMetre);
        Measure m8 = Math.asin(m7);
        System.out.println("Arcsine: asin(" + m7 + ") = " + m8);
        Assert.assertEquals("Test arcsine", 1.200444329, m8.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test arcsine", CoreUnitAndScaleSet.RADIAN,m8.getUnit());
        Measure m9 = factory.createScalarMeasure(0.9322,metrePerKiloMetre);
        Measure m10 = Math.asin(m9);
        System.out.println("Arcsine: asin(" + m9 + ") = " + m10);
        Assert.assertEquals("Test arcsine", 9.3220013501E-4, m10.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test arcsine", CoreUnitAndScaleSet.RADIAN,m10.getUnit());
    }

    @Test
    public void testArcCosine() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Unit metrePerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.METRE);
        Unit metrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m1 = factory.createScalarMeasure(1, metrePerMetre);
        Measure m2 = Math.acos(m1);
        System.out.println("Arccosine: acos("+m1+") = "+m2);
        Assert.assertEquals("Test arccosine", 0, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test arccosine", CoreUnitAndScaleSet.RADIAN, m2.getUnit());
        double[] vec = {0.4,2.3};
        Measure m5 = factory.createVectorMeasure(vec,metrePerMetre);
        try {
            Math.acos(m5);
            Assert.fail("Exception should have been thrown after taking the arccosine of a vector.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the arccosine of a vector.",true);
        }
        Measure m6 = factory.createVectorMeasure(vec,metrePerKiloMetre);
        try {
            Math.acos(m6);
            Assert.fail("Exception should have been thrown after taking the arccosine of a measure with a non dimensionless unit.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the arccosine of a measure with a dimensionless unit.",true);
        }
        Unit kilometrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.KILOMETRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m7 = factory.createScalarMeasure(0.9322,kilometrePerKiloMetre);
        Measure m8 = Math.acos(m7);
        System.out.println("Arccosine: acos(" + m7 + ") = " + m8);
        Assert.assertEquals("Test arccosine", 0.3703519978, m8.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test arccosine", CoreUnitAndScaleSet.RADIAN,m8.getUnit());
        Measure m9 = factory.createScalarMeasure(0.9322,metrePerKiloMetre);
        Measure m10 = Math.acos(m9);
        System.out.println("Arccosine: acos(" + m9 + ") = " + m10);
        Assert.assertEquals("Test arccosine", 1.5698641267, m10.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test arccosine", CoreUnitAndScaleSet.RADIAN,m10.getUnit());
    }

    @Test
    public void testArcTan() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Unit metrePerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.METRE);
        Unit metrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m1 = factory.createScalarMeasure(1, metrePerMetre);
        Measure m2 = Math.atan(m1);
        System.out.println("Arctangent: atan("+m1+") = "+m2);
        Assert.assertEquals("Test arctangent", 0.7853981634, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test arctangent", CoreUnitAndScaleSet.RADIAN, m2.getUnit());
        double[] vec = {0.4,2.3};
        Measure m5 = factory.createVectorMeasure(vec,metrePerMetre);
        try {
            Math.atan(m5);
            Assert.fail("Exception should have been thrown after taking the arctangent of a vector.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the arctangent of a vector.",true);
        }
        Measure m6 = factory.createVectorMeasure(vec,metrePerKiloMetre);
        try {
            Math.atan(m6);
            Assert.fail("Exception should have been thrown after taking the arctangent of a measure with a non dimensionless unit.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the arctangent of a measure with a dimensionless unit.",true);
        }
        Unit kilometrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.KILOMETRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m7 = factory.createScalarMeasure(2.832,kilometrePerKiloMetre);
        Measure m8 = Math.atan(m7);
        System.out.println("Arctangent: atan(" + m7 + ") = " + m8);
        Assert.assertEquals("Test arctangent", 1.2313559582, m8.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test arctangent", CoreUnitAndScaleSet.RADIAN,m8.getUnit());
        Measure m9 = factory.createScalarMeasure(1003.432,metrePerKiloMetre);
        Measure m10 = Math.atan(m9);
        System.out.println("Arctangent: atan(" + m9 + ") = " + m10);
        Assert.assertEquals("Test arctangent", 0.7871112221, m10.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test arctangent", CoreUnitAndScaleSet.RADIAN,m10.getUnit());
    }

    @Test
    public void testExponent() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Unit metrePerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.METRE);
        Unit metrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m1 = factory.createScalarMeasure(0.4, metrePerMetre);
        Measure m2 = Math.exp(m1);
        System.out.println("Natural exponent: exp("+m1+") = "+m2);
        Assert.assertEquals("Test natural exponent", 1.4918246976, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test natural exponent", CoreUnitAndScaleSet.ONE, m2.getUnit());
        double[] vec = {0.4,2.3};
        Measure m5 = factory.createVectorMeasure(vec,metrePerMetre);
        Measure m5a = Math.exp(m5);
        System.out.println("Natural exponent: exp(" + m5 + ") = " + m5a);
        Assert.assertEquals("Test natural exponent", 1.4918246976, m5a.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test natural exponent", 9.9741824548, m5a.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test natural exponent", CoreUnitAndScaleSet.ONE, m5a.getUnit());
        Measure m6 = factory.createVectorMeasure(vec,metrePerKiloMetre);
        Measure m6a = Math.exp(m6);
        System.out.println("Natural exponent: exp("+m6+") = "+m6a);
        Assert.assertEquals("Test natural exponent", 1.00040008, m6a.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test natural exponent", 1.002302647, m6a.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test natural exponent", CoreUnitAndScaleSet.ONE, m6a.getUnit());
        Unit kilometrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.KILOMETRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m7 = factory.createScalarMeasure(2.832,kilometrePerKiloMetre);
        Measure m8 = Math.exp(m7);
        System.out.println("Natural exponent: exp(" + m7 + ") = " + m8);
        Assert.assertEquals("Test natural exponent", 16.9793856597, m8.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test natural exponent", CoreUnitAndScaleSet.ONE,m8.getUnit());
        Measure m9 = factory.createScalarMeasure(-356.25,metrePerKiloMetre);
        Measure m10 = Math.exp(m9);
        System.out.println("Natural exponent: exp(" + m9 + ") = " + m10);
        Assert.assertEquals("Test natural exponent", 0.700297524, m10.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test natural exponent", CoreUnitAndScaleSet.ONE,m10.getUnit());
        Unit gramPerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.GRAM, CoreUnitAndScaleSet.METRE);
        Measure m11 = factory.createVectorMeasure(vec,gramPerMetre);
        try {
            Math.exp(m11);
            Assert.fail("Exception should have been thrown after taking the exponent of a non dimensionless measure.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the exponent of a non dimensionless measure.",true);
        }
    }

    @Test
    public void testNaturalLogarithm() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Unit metrePerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.METRE);
        Unit metrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m1 = factory.createScalarMeasure(1.4918246976, metrePerMetre);
        Measure m2 = Math.log(m1);
        System.out.println("Natural logarithm: log("+m1+") = "+m2);
        Assert.assertEquals("Test natural logarithm", 0.4, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test natural logarithm", CoreUnitAndScaleSet.ONE, m2.getUnit());
        double[] vec = {1.4918246976,9.9741824548};
        Measure m5 = factory.createVectorMeasure(vec,metrePerMetre);
        Measure m5a = Math.log(m5);
        System.out.println("Natural logarithm: log(" + m5 + ") = " + m5a);
        Assert.assertEquals("Test natural logarithm", 0.4, m5a.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test natural logarithm", 2.3, m5a.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test natural logarithm", CoreUnitAndScaleSet.ONE, m5a.getUnit());
        Measure m6 = factory.createVectorMeasure(vec,metrePerKiloMetre);
        Measure m6a = Math.log(m6);
        System.out.println("Natural logarithm: log("+m6+") = "+m6a);
        Assert.assertEquals("Test natural logarithm", -6.507755279, m6a.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test natural logarithm", -4.607755279, m6a.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test natural logarithm", CoreUnitAndScaleSet.ONE, m6a.getUnit());
        Unit kilometrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.KILOMETRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m7 = factory.createScalarMeasure(16.9793856597,kilometrePerKiloMetre);
        Measure m8 = Math.log(m7);
        System.out.println("Natural logarithm: log(" + m7 + ") = " + m8);
        Assert.assertEquals("Test natural logarithm", 2.832, m8.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test natural logarithm", CoreUnitAndScaleSet.ONE,m8.getUnit());
        Measure m9 = factory.createScalarMeasure(700.297524,metrePerKiloMetre);
        Measure m10 = Math.log(m9);
        System.out.println("Natural logarithm: log(" + m9 + ") = " + m10);
        Assert.assertEquals("Test natural logarithm",-0.35625, m10.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test natural logarithm", CoreUnitAndScaleSet.ONE,m10.getUnit());
        Unit gramPerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.GRAM, CoreUnitAndScaleSet.METRE);
        Measure m11 = factory.createVectorMeasure(vec,gramPerMetre);
        try {
            Math.log(m11);
            Assert.fail("Exception should have been thrown after taking the logonent of a non dimensionless measure.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the logonent of a non dimensionless measure.",true);
        }
    }

    @Test
    public void testBase10Logarithm() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Unit metrePerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.METRE);
        Unit metrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m1 = factory.createScalarMeasure(100, metrePerMetre);
        Measure m2 = Math.log10(m1);
        System.out.println("Base 10 logarithm: log10("+m1+") = "+m2);
        Assert.assertEquals("Test base 10 logarithm", 2, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test base 10 logarithm", CoreUnitAndScaleSet.ONE, m2.getUnit());
        double[] vec = {10000,0.001};
        Measure m5 = factory.createVectorMeasure(vec,metrePerMetre);
        Measure m5a = Math.log10(m5);
        System.out.println("Base 10 logarithm: log10(" + m5 + ") = " + m5a);
        Assert.assertEquals("Test base 10 logarithm", 4, m5a.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test base 10 logarithm", -3, m5a.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test base 10 logarithm", CoreUnitAndScaleSet.ONE, m5a.getUnit());
        Measure m6 = factory.createVectorMeasure(vec,metrePerKiloMetre);
        Measure m6a = Math.log10(m6);
        System.out.println("Base 10 logarithm: log10("+m6+") = "+m6a);
        Assert.assertEquals("Test base 10 logarithm", 1, m6a.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test base 10 logarithm", -6, m6a.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test base 10 logarithm", CoreUnitAndScaleSet.ONE, m6a.getUnit());
        Unit kilometrePerKiloMetre = factory.createUnitDivision(CoreUnitAndScaleSet.KILOMETRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure m7 = factory.createScalarMeasure(1e-7,kilometrePerKiloMetre);
        Measure m8 = Math.log10(m7);
        System.out.println("Base 10 logarithm: log10(" + m7 + ") = " + m8);
        Assert.assertEquals("Test base 10 logarithm", -7, m8.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test base 10 logarithm", CoreUnitAndScaleSet.ONE,m8.getUnit());
        Measure m9 = factory.createScalarMeasure(1e12,metrePerKiloMetre);
        Measure m10 = Math.log10(m9);
        System.out.println("Base 10 logarithm: log10(" + m9 + ") = " + m10);
        Assert.assertEquals("Test base 10 logarithm",9, m10.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test base 10 logarithm", CoreUnitAndScaleSet.ONE,m10.getUnit());
        Unit gramPerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.GRAM, CoreUnitAndScaleSet.METRE);
        Measure m11 = factory.createVectorMeasure(vec,gramPerMetre);
        try {
            Math.log10(m11);
            Assert.fail("Exception should have been thrown after taking the logonent of a non dimensionless measure.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the logonent of a non dimensionless measure.",true);
        }
    }
    
    @Test
    public void testSqrtOfAMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(25, CoreUnitAndScaleSet.KILOGRAM);
        Measure m2 = Math.sqrt(m1);
        System.out.println("Square root: sqrt(" + m1 + ") = " + m2);
        Assert.assertEquals("Test sqrt", 5, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test sqrt", CoreUnitAndScaleSet.KILOGRAM, ((UnitExponentiation) m2.getUnit()).getBase());
        Assert.assertEquals("Test sqrt", 1. / 2., ((UnitExponentiation) m2.getUnit()).getExponent(), 0.000001);
        Measure m3 = factory.createScalarMeasure(100, CoreUnitAndScaleSet.SQUARE_FEET);
        Measure m4 = Math.sqrt(m3);
        System.out.println("Square root: sqrt(" + m3 + ") = " + m4);
        Assert.assertEquals("Test sqrt", 10, m4.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test sqrt", CoreUnitAndScaleSet.FEET, m4.getUnit());
    }

    @Test
    public void testCbrtOfAMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(125, CoreUnitAndScaleSet.KILOGRAM);
        Measure m2 = Math.cbrt(m1);
        System.out.println("Cubic root: cbrt(" + m1 + ") = " + m2);
        Assert.assertEquals("Test cbrt", 5, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test cbrt", CoreUnitAndScaleSet.KILOGRAM, ((UnitExponentiation)m2.getUnit()).getBase());
        Assert.assertEquals("Test cbrt", 1./3., ((UnitExponentiation) m2.getUnit()).getExponent(),0.000001);
        Measure m3 = factory.createScalarMeasure(1000, CoreUnitAndScaleSet.CUBIC_METRE);
        Measure m4 = Math.cbrt(m3);
        System.out.println("Cubic root: cbrt(" + m3 + ") = " + m4);
        Assert.assertEquals("Test cbrt", 10, m4.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test cbrt", CoreUnitAndScaleSet.METRE, m4.getUnit());
    }

    @Test
    public void testAtan2OfAMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure x = factory.createScalarMeasure(3.4, CoreUnitAndScaleSet.METRE);
        Measure y = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.METRE);
        Measure theta = Math.atan2(y,x);
        System.out.println("Arctangent: atan2("+y+","+x+") = "+theta);
        Assert.assertEquals("Test arctangent", -0.7853981634, theta.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test arctangent", CoreUnitAndScaleSet.RADIAN, theta.getUnit());
        Measure x2 = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.METRE);
        Measure y2 = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.DECIMETRE);
        Measure theta2 = Math.atan2(y2,x2);
        System.out.println("Arctangent: atan2("+y2+","+x2+") = "+theta2);
        Assert.assertEquals("Test arctangent", -3.0419240011, theta2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test arctangent", CoreUnitAndScaleSet.RADIAN, theta2.getUnit());
        Measure x3 = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.GRAM);
        Measure y3 = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.GRAM);
        Measure theta3 = Math.atan2(y3, x3);
        System.out.println("Arctangent: atan2("+y3+","+x3+") = "+theta2);
        Assert.assertEquals("Test arctangent", -2.3561944902, theta3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test arctangent", CoreUnitAndScaleSet.RADIAN, theta3.getUnit());
        Measure x4 = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.METRE);
        Measure y4 = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.GRAM);
        try {
            Math.atan2(y4, x4);
            Assert.fail("Exception should have been thrown after taking the arctan2 of a non dimensionless measure.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the arctan2 of a non dimensionless measure.",true);
        }
        double[] vecx = {0.4,2.3};
        double[] vecy = {0.4,2.3};
        Measure x5 = factory.createVectorMeasure(vecx, CoreUnitAndScaleSet.METRE);
        Measure y5 = factory.createVectorMeasure(vecy, CoreUnitAndScaleSet.METRE);
        try {
            Math.atan2(y5, x5);
            Assert.fail("Exception should have been thrown after taking the hypotenuse of two vectors.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the hypotenuse of two vectors.",true);
        }
    }

    @Test
    public void testPowerOfAMeasureWithAConstant() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure x = factory.createScalarMeasure(12.4, CoreUnitAndScaleSet.METRE);
        Measure sqx = Math.pow(x, 2);
        System.out.println("Power: pow("+x+",2) = "+sqx);
        Assert.assertEquals("Test power", 153.76, sqx.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test power", CoreUnitAndScaleSet.SQUARE_METRE, sqx.getUnit());
        Measure x1 = factory.createScalarMeasure(-6.5, CoreUnitAndScaleSet.METRE);
        Measure cb1 = Math.pow(x1, 3);
        System.out.println("Power: pow("+x1+",3) = "+cb1);
        Assert.assertEquals("Test power", -274.625, cb1.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test power", CoreUnitAndScaleSet.CUBIC_METRE, cb1.getUnit());
        Measure x2 = factory.createScalarMeasure(12.4, CoreUnitAndScaleSet.KILOMETRE);
        Measure sqx2 = Math.pow(x2, 2);
        System.out.println("Power: pow("+x2+",2) = "+sqx2);
        Assert.assertEquals("Test power", 153.76, sqx2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test power", CoreUnitAndScaleSet.SQUARE_KILOMETRE, sqx2.getUnit());
        double[] vec = {0.4,2.3};
        Measure x3 = factory.createVectorMeasure(vec, CoreUnitAndScaleSet.METRE);
        try {
            Math.pow(x3, 5);
            Assert.fail("Exception should have been thrown after taking the fourth power of a vector.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the fourth power of a vector.",true);
        }
    }


    @Test
    public void testPowerOfAConstantWithAMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Unit metrePerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.METRE);
        Unit metrePerKilometre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.KILOMETRE);
        Measure x = factory.createScalarMeasure(12.4, metrePerMetre);
        Measure sqx = Math.pow(2,x);
        System.out.println("Power: pow(2,"+x+") = "+sqx);
        Assert.assertEquals("Test power", 5404.7044025258, sqx.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test power", CoreUnitAndScaleSet.ONE, sqx.getUnit());
        Measure x1 = factory.createScalarMeasure(-6.5, CoreUnitAndScaleSet.METRE);
        try {
            Measure cb1 = Math.pow(3, x1);
            Assert.fail("Exception should have been thrown after raising 3 to the power of "+x1+".");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when raising 3 to the power of "+x1+".",true);
        }
        Measure x2 = factory.createScalarMeasure(12.4, metrePerKilometre);
        Measure sqx2 = Math.pow(2,x2);
        System.out.println("Power: pow(2,"+x2+") = "+sqx2);
        Assert.assertEquals("Test power", 1.0086320683, sqx2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test power", CoreUnitAndScaleSet.ONE, sqx2.getUnit());
        double[] vec = {0.4,2.3};
        Measure x3 = factory.createVectorMeasure(vec, metrePerMetre);
        Measure sq5 = Math.pow(5,x3);
        System.out.println("Power: pow(5," + x3 + ") = " + sq5);
        Assert.assertEquals("Test power", 1.9036539387, sq5.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test power", 40.5164149173, sq5.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test power", CoreUnitAndScaleSet.ONE, sqx.getUnit());
    }

    @Test
    public void testAbsOfAMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(20, CoreUnitAndScaleSet.KILOGRAM);
        Measure m2 = Math.abs(m1);
        Assert.assertEquals("Test abs", 20, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test abs", CoreUnitAndScaleSet.KILOGRAM, m2.getUnit());
        Measure m3 = factory.createScalarMeasure(-20, CoreUnitAndScaleSet.KILOGRAM);
        Measure m4 = Math.abs(m3);
        Assert.assertEquals("Test abs", 20, m4.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test abs", CoreUnitAndScaleSet.KILOGRAM,m4.getUnit());
    }

    @Test
    public void testHypotenuseOfAMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure x = factory.createScalarMeasure(3.4, CoreUnitAndScaleSet.METRE);
        Measure y = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.METRE);
        Measure theta = Math.hypot(x, y);
        System.out.println("Hypotenuse: hypot("+x+","+y+") = "+theta);
        Assert.assertEquals("Test hypotenuse", 4.8083261121, theta.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test hypotenuse", CoreUnitAndScaleSet.METRE, theta.getUnit());
        Measure x2 = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.METRE);
        Measure y2 = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.KILOMETRE);
        Measure theta2 = Math.hypot(x2, y2);
        System.out.println("Hypotenuse: hypot("+x2+","+y2+") = "+theta2);
        Assert.assertEquals("Test hypotenuse", 3400.0016999996, theta2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test hypotenuse", CoreUnitAndScaleSet.METRE, theta2.getUnit());
        Measure x3 = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.GRAM);
        Measure y3 = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.GRAM);
        Measure theta3 = Math.hypot(x3, y3);
        System.out.println("Hypotenuse: hypot("+x3+","+y3+") = "+theta3);
        Assert.assertEquals("Test hypotenuse", 4.8083261121, theta3.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test hypotenuse", CoreUnitAndScaleSet.GRAM, theta3.getUnit());
        Measure x4 = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.METRE);
        Measure y4 = factory.createScalarMeasure(-3.4, CoreUnitAndScaleSet.GRAM);
        try {
            Math.hypot(x4, y4);
            Assert.fail("Exception should have been thrown after taking the hypotenuse of a non dimensionless measure.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the hypotenuse of a non dimensionless measure.",true);
        }
        double[] vecx = {0.4,2.3};
        double[] vecy = {0.4,2.3};
        Measure x5 = factory.createVectorMeasure(vecx, CoreUnitAndScaleSet.METRE);
        Measure y5 = factory.createVectorMeasure(vecy, CoreUnitAndScaleSet.METRE);
        try {
            Math.hypot(x5, y5);
            Assert.fail("Exception should have been thrown after taking the hypotenuse of two vectors.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the hypotenuse of two vectors.",true);
        }
    }

    @Test
    public void testVectorMagnitude() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        double[] vecx = {4, -3};
        Measure v1 = factory.createVectorMeasure(vecx, CoreUnitAndScaleSet.METRE);
        Measure v2 = Math.magnitude(v1);
        Assert.assertEquals("Test vector magnitude", 5, v2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test vector magnitude", CoreUnitAndScaleSet.METRE, v2.getUnit());
        Measure v3 = factory.createScalarMeasure(-12, CoreUnitAndScaleSet.METRE);
        Measure v4 = Math.magnitude(v3);
        Assert.assertEquals("Test vector magnitude", 12, v4.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test vector magnitude", CoreUnitAndScaleSet.METRE, v4.getUnit());
    }

    @Test
    public void testUnitVector() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        double[] vecx = {4, -3};
        Measure v1 = factory.createVectorMeasure(vecx, CoreUnitAndScaleSet.METRE);
        double[] v2 = Math.unitVector(v1);
        Assert.assertEquals("Test vector magnitude", 0.8, v2[0], 0.00000001);
        Assert.assertEquals("Test vector magnitude", -0.6, v2[1], 0.00000001);
        Measure v3 = factory.createScalarMeasure(-12, CoreUnitAndScaleSet.METRE);
        double v4[] = Math.unitVector(v3);
        Assert.assertEquals("Test vector magnitude", -1, v4[0], 0.00000001);
    }

    @Test
    public void testDotProduct() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        double[] vecx = {0.4,2.3};
        double[] vecy = {2.4,-5.3};
        Measure v1 = factory.createVectorMeasure(vecx, CoreUnitAndScaleSet.METRE);
        Measure v2 = factory.createVectorMeasure(vecy, CoreUnitAndScaleSet.METRE);
        Measure dotp = Math.dotProduct(v1, v2);
        System.out.println("Dot product: dotProduct(" + v1 + "," + v2 + ") = " + dotp);
        Assert.assertEquals("Test dot product", -11.23, dotp.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test dot product", CoreUnitAndScaleSet.SQUARE_METRE, dotp.getUnit());
        Measure s1 = factory.createScalarMeasure(4.3, CoreUnitAndScaleSet.METRE);
        try {
            Math.hypot(s1, v1);
            Assert.fail("Exception should have been thrown while calculating the dot product of a scalar and a vector.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception while calculating the dot product of a scalar and a vector.",true);
        }
        Measure s2 = factory.createScalarMeasure(2, CoreUnitAndScaleSet.METRE);
        Measure dotp2 = Math.dotProduct(s1, s2);
        System.out.println("Dot product: dotProduct(" + s1 + "," + s2 + ") = " + dotp2);
        Assert.assertEquals("Test dot product", 8.6, dotp2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test dot product", CoreUnitAndScaleSet.SQUARE_METRE, dotp2.getUnit());
        double[] vec3 = {2.4,-5.3};
        Measure v3 = factory.createVectorMeasure(vec3, CoreUnitAndScaleSet.CALORIE);
        try {
            Math.hypot(v1, v3);
            Assert.fail("Exception should have been thrown while calculating the dot product of two vectors in different dimensions.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception while calculating the dot product of two vectors in different dimensions.",true);
        }
        double[] vec4 = {2.4,-5.3,7.3};
        Measure v4 = factory.createVectorMeasure(vec4, CoreUnitAndScaleSet.METRE);
        try {
            Math.hypot(v1, v4);
            Assert.fail("Exception should have been thrown while calculating the dot product of two vectors with different sizes.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception while calculating the dot product of two vectors with different sizes.",true);
        }
    }

    @Test
    public void testCrossProduct() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        double[] vecx = {2,1,3};
        double[] vecy = {5,-2,-3};
        Measure v1 = factory.createVectorMeasure(vecx, CoreUnitAndScaleSet.METRE);
        Measure v2 = factory.createVectorMeasure(vecy, CoreUnitAndScaleSet.METRE);
        Measure crosp = Math.crossProduct(v1, v2);
        System.out.println("Cross product: crossProduct(" + v1 + "," + v2 + ") = " + crosp);
        Assert.assertEquals("Test cross product", 3, crosp.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test cross product", 21, crosp.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test cross product", -9, crosp.getVectorValue()[2], 0.00000001);
        Assert.assertEquals("Test cross product", CoreUnitAndScaleSet.SQUARE_METRE, crosp.getUnit());

        double[] veca = {5,-3};
        double[] vecb = {-2,-3};
        Measure v3 = factory.createVectorMeasure(veca, CoreUnitAndScaleSet.METRE);
        Measure v4 = factory.createVectorMeasure(vecb, CoreUnitAndScaleSet.METRE);
        try {
            Math.crossProduct(v3, v4);
            Assert.fail("Exception should have been thrown while calculating the dot product of two 2D vectors.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception while calculating the dot product of two 2D vectors.",true);
        }
        try {
            Math.crossProduct(v1, v4);
            Assert.fail("Exception should have been thrown while calculating the dot product of a 3D and a 2D vector.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception while calculating the dot product of a 3D and a 2D vector.",true);
        }
        Measure v6 = factory.createVectorMeasure(vecx, CoreUnitAndScaleSet.CALORIE);
        try {
            Math.crossProduct(v6, v2);
            Assert.fail("Exception should have been thrown while calculating the dot product of two vectors with a different dimension.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception while calculating the dot product of vectors with a different dimension.",true);
        }
    }
}
