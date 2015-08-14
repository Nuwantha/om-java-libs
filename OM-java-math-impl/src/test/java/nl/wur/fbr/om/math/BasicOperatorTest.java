package nl.wur.fbr.om.math;

import nl.wur.fbr.om.conversion.CoreInstanceFactory;
import nl.wur.fbr.om.core.impl.units.UnitDivisionImpl;
import nl.wur.fbr.om.core.set.CoreSet;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.math.impl.MathProcessorImpl;
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
    public void testAdditionOfTwoVectorMeasures() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        double[] v1 = {14,22};
        double[] v2 = {700,-200};
        Measure m1 = factory.createVectorMeasure(v1, CoreSet.METRE);
        Measure m2 = factory.createVectorMeasure(v2, CoreSet.DECIMETRE);
        Measure m3 = Math.add(m1,m2);
        System.out.println("Addition " + m1 + " + " + m2 + " = " + m3);
        Assert.assertEquals("Test addition", 84, m3.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test addition",2,m3.getVectorValue()[1],0.00000001);
        Assert.assertEquals("Test addition",CoreSet.METRE,m3.getUnit());
        Measure m4 = factory.createScalarMeasure(12, CoreSet.METRE);
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
    public void testSubtractionOfTwoCVectorMeasures() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        double[] v1 = {14,22};
        double[] v2 = {700,-200};
        Measure m1 = factory.createVectorMeasure(v1, CoreSet.METRE);
        Measure m2 = factory.createVectorMeasure(v2, CoreSet.DECIMETRE);
        Measure m3 = Math.subtract(m1, m2);
        System.out.println("Subtraction " + m1 + " - " + m2 + " = " + m3);
        Assert.assertEquals("Test subtraction", -56, m3.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test subtraction",42,m3.getVectorValue()[1],0.00000001);
        Assert.assertEquals("Test subtraction",CoreSet.METRE,m3.getUnit());
        Measure m4 = factory.createScalarMeasure(12, CoreSet.METRE);
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
    public void testMultiplicationOfAVectorAndAScalarMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        double[] v1 = {10,-5};
        Measure m1 = factory.createVectorMeasure(v1, CoreSet.NEWTON);
        Measure m2 = factory.createScalarMeasure(4, CoreSet.KILOMETRE);
        Measure m3 = Math.multiply(m1, m2);
        System.out.println("Multiplication " + m1 + " * " + m2 + " = " + m3);
        Assert.assertEquals("Test multiplication", 40, m3.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test multiplication", -20, m3.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test multiplication", CoreSet.NEWTON, ((UnitMultiplication) m3.getUnit()).getTerm1());
        Assert.assertEquals("Test multiplication", CoreSet.KILOMETRE, ((UnitMultiplication) m3.getUnit()).getTerm2());
        double[] v2 = {10,-5};
        Measure m4 = factory.createScalarMeasure(7, CoreSet.NEWTON);
        Measure m5 = factory.createVectorMeasure(v2, CoreSet.KILOMETRE);
        Measure m6 = Math.multiply(m4, m5);
        System.out.println("Multiplication " + m4 + " * " + m5 + " = " + m6);
        Assert.assertEquals("Test multiplication", 70, m6.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test multiplication", -35, m6.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test multiplication",CoreSet.NEWTON,((UnitMultiplication) m6.getUnit()).getTerm1());
        Assert.assertEquals("Test multiplication",CoreSet.KILOMETRE,((UnitMultiplication) m6.getUnit()).getTerm2());
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
    public void testDivisionOfAVectorAndScalarMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        double[] v1 = {10,-16};
        Measure m1 = factory.createVectorMeasure(v1, CoreSet.INCH);
        Measure m2 = factory.createScalarMeasure(4, CoreSet.MINUTE);
        Measure m3 = Math.divide(m1, m2);
        System.out.println("Division " + m1 + " / " + m2 + " = " + m3);
        Assert.assertEquals("Test division", 2.5, m3.getVectorValue()[0], 0.00000001);
        Assert.assertEquals("Test division", -4, m3.getVectorValue()[1], 0.00000001);
        Assert.assertEquals("Test division", CoreSet.INCH, ((UnitDivision) m3.getUnit()).getNumerator());
        Assert.assertEquals("Test division",CoreSet.MINUTE,((UnitDivision) m3.getUnit()).getDenominator());
        try{
            Measure m4 = Math.divide(m2, m1);
            Assert.fail("Expected MathException when dividing a scalar by a vector.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
        try{
            double[] v2 = {10,-16};
            Measure m5 = factory.createVectorMeasure(v2, CoreSet.NEWTON);
            Measure m6 = Math.divide(m1, m5);
            Assert.fail("Expected MathException when dividing a vector by a vector.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
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

    @Test
    public void testSine() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(1,CoreSet.RADIAN);
        Measure m2 = Math.sin(m1);
        System.out.println("Sine: sin("+m1+") = "+m2);
        Assert.assertEquals("Test sine", 0.8414709848, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test sine", CoreSet.ONE, m2.getUnit());
        Measure m3 = factory.createScalarMeasure(1,CoreSet.DEGREE);
        Measure m4 = Math.sin(m3);
        System.out.println("Sine: sin(" + m3 + ") = " + m4);
        Assert.assertEquals("Test sine", 0.0174524064, m4.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test sine",CoreSet.ONE,m4.getUnit());
        double[] vec = {0.4,2.3};
        Measure m5 = factory.createVectorMeasure(vec,CoreSet.DEGREE);
        try {
            Math.sin(m5);
            Assert.fail("Exception should have been thrown after taking the sine of a vector.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the sine of a vector.",true);
        }
        Measure m6 = factory.createVectorMeasure(vec,CoreSet.METRE);
        try {
            Math.sin(m6);
            Assert.fail("Exception should have been thrown after taking the sine of a measure with a non dimensionless unit.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the sine of a measure with a dimensionless unit.",true);
        }
        Unit kilometrePerKiloMetre = factory.createUnitDivision(CoreSet.KILOMETRE,CoreSet.KILOMETRE);
        Measure m7 = factory.createScalarMeasure(2.03,kilometrePerKiloMetre);
        Measure m8 = Math.sin(m7);
        System.out.println("Sine: sin(" + m7 + ") = " + m8);
        Assert.assertEquals("Test sine", 0.8964057412, m8.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test sine",CoreSet.ONE,m8.getUnit());
        Unit metrePerKiloMetre = factory.createUnitDivision(CoreSet.METRE,CoreSet.KILOMETRE);
        Measure m9 = factory.createScalarMeasure(2.03,metrePerKiloMetre);
        Measure m10 = Math.sin(m9);
        System.out.println("Sine: sin(" + m9 + ") = " + m10);
        Assert.assertEquals("Test sine", 0.0020299986, m10.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test sine",CoreSet.ONE,m10.getUnit());
    }

    @Test
    public void testCosine() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(1,CoreSet.RADIAN);
        Measure m2 = Math.cos(m1);
        System.out.println("Cosine: cos("+m1+") = "+m2);
        Assert.assertEquals("Test cosine", 0.5403023059, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test cosine", CoreSet.ONE, m2.getUnit());
        Measure m3 = factory.createScalarMeasure(1,CoreSet.DEGREE);
        Measure m4 = Math.cos(m3);
        System.out.println("Cosine: cos(" + m3 + ") = " + m4);
        Assert.assertEquals("Test cosine", 0.9998476952, m4.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test cosine",CoreSet.ONE,m4.getUnit());
        double[] vec = {0.4,2.3};
        Measure m5 = factory.createVectorMeasure(vec,CoreSet.DEGREE);
        try {
            Math.cos(m5);
            Assert.fail("Exception should have been thrown after taking the cosine of a vector.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the cosine of a vector.",true);
        }
        Measure m6 = factory.createVectorMeasure(vec,CoreSet.METRE);
        try {
            Math.cos(m6);
            Assert.fail("Exception should have been thrown after taking the cosine of a measure with a non dimensionless unit.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the cosine of a measure with a dimensionless unit.",true);
        }
        Unit kilometrePerKiloMetre = factory.createUnitDivision(CoreSet.KILOMETRE,CoreSet.KILOMETRE);
        Measure m7 = factory.createScalarMeasure(2.03,kilometrePerKiloMetre);
        Measure m8 = Math.cos(m7);
        System.out.println("Cosine: cos(" + m7 + ") = " + m8);
        Assert.assertEquals("Test cosine", -0.4432344157, m8.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test cosine",CoreSet.ONE,m8.getUnit());
        Unit metrePerKiloMetre = factory.createUnitDivision(CoreSet.METRE,CoreSet.KILOMETRE);
        Measure m9 = factory.createScalarMeasure(2.03,metrePerKiloMetre);
        Measure m10 = Math.cos(m9);
        System.out.println("Cosine: cos(" + m9 + ") = " + m10);
        Assert.assertEquals("Test cosine", 0.9999979396, m10.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test cosine",CoreSet.ONE,m10.getUnit());
    }

    @Test
    public void testTangent() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(1,CoreSet.RADIAN);
        Measure m2 = Math.tan(m1);
        System.out.println("Tangent: tan("+m1+") = "+m2);
        Assert.assertEquals("Test tangent", 1.5574077247, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test tangent", CoreSet.ONE, m2.getUnit());
        Measure m3 = factory.createScalarMeasure(1,CoreSet.DEGREE);
        Measure m4 = Math.tan(m3);
        System.out.println("Tangent: tan(" + m3 + ") = " + m4);
        Assert.assertEquals("Test tangent", 0.0174550649, m4.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test tangent",CoreSet.ONE,m4.getUnit());
        double[] vec = {0.4,2.3};
        Measure m5 = factory.createVectorMeasure(vec,CoreSet.DEGREE);
        try {
            Math.tan(m5);
            Assert.fail("Exception should have been thrown after taking the tangent of a vector.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the tangent of a vector.",true);
        }
        Measure m6 = factory.createVectorMeasure(vec,CoreSet.METRE);
        try {
            Math.tan(m6);
            Assert.fail("Exception should have been thrown after taking the tangent of a measure with a non dimensionless unit.");
        }catch (MathException e){
            Assert.assertTrue("Expected exception when taking the tangent of a measure with a dimensionless unit.",true);
        }
        Unit kilometrePerKiloMetre = factory.createUnitDivision(CoreSet.KILOMETRE,CoreSet.KILOMETRE);
        Measure m7 = factory.createScalarMeasure(2.03,kilometrePerKiloMetre);
        Measure m8 = Math.tan(m7);
        System.out.println("Tangent: tan(" + m7 + ") = " + m8);
        Assert.assertEquals("Test tangent", -2.0224190845, m8.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test tangent",CoreSet.ONE,m8.getUnit());
        Unit metrePerKiloMetre = factory.createUnitDivision(CoreSet.METRE,CoreSet.KILOMETRE);
        Measure m9 = factory.createScalarMeasure(2.03,metrePerKiloMetre);
        Measure m10 = Math.tan(m9);
        System.out.println("Tangent: tan(" + m9 + ") = " + m10);
        Assert.assertEquals("Test tangent", 0.0020300028, m10.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test tangent",CoreSet.ONE,m10.getUnit());
    }

    @Test
    public void testSqrtOfAMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(25, CoreSet.KILOGRAM);
        Measure m2 = Math.sqrt(m1);
        System.out.println("Square root: sqrt(" + m1 + ") = " + m2);
        Assert.assertEquals("Test sqrt", 5, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test sqrt", CoreSet.KILOGRAM, ((UnitExponentiation) m2.getUnit()).getBase());
        Assert.assertEquals("Test sqrt", 1. / 2., ((UnitExponentiation) m2.getUnit()).getExponent(), 0.000001);
        Measure m3 = factory.createScalarMeasure(100, CoreSet.SQUARE_FEET);
        Measure m4 = Math.sqrt(m3);
        System.out.println("Square root: sqrt(" + m3 + ") = " + m4);
        Assert.assertEquals("Test sqrt", 10, m4.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test sqrt", CoreSet.FEET, m4.getUnit());
    }

    @Test
    public void testCbrtOfAMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(125, CoreSet.KILOGRAM);
        Measure m2 = Math.cbrt(m1);
        System.out.println("Cubic root: cbrt(" + m1 + ") = " + m2);
        Assert.assertEquals("Test cbrt", 5, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test cbrt", CoreSet.KILOGRAM, ((UnitExponentiation)m2.getUnit()).getBase());
        Assert.assertEquals("Test cbrt", 1./3., ((UnitExponentiation) m2.getUnit()).getExponent(),0.000001);
        Measure m3 = factory.createScalarMeasure(1000, CoreSet.CUBIC_METRE);
        Measure m4 = Math.cbrt(m3);
        System.out.println("Cubic root: cbrt(" + m3 + ") = " + m4);
        Assert.assertEquals("Test cbrt", 10, m4.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test cbrt", CoreSet.METRE, m4.getUnit());
    }

    @Test
    public void testAbsOfAMeasure() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(20, CoreSet.KILOGRAM);
        Measure m2 = Math.abs(m1);
        Assert.assertEquals("Test abs", 20, m2.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test abs", CoreSet.KILOGRAM, m2.getUnit());
        Measure m3 = factory.createScalarMeasure(-20, CoreSet.KILOGRAM);
        Measure m4 = Math.abs(m3);
        Assert.assertEquals("Test abs", 20, m4.getScalarValue(), 0.00000001);
        Assert.assertEquals("Test abs",CoreSet.KILOGRAM,m4.getUnit());
    }

}
