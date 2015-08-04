package nl.wur.fbr.om;

import nl.wur.fbr.om.conversion.DefaultUnitConversionFactory;
import nl.wur.fbr.om.core.factory.DefaultMeasureAndPointFactory;
import nl.wur.fbr.om.core.set.CoreUnitAndScaleFactory;
import nl.wur.fbr.om.core.set.CoreUnitSet;
import nl.wur.fbr.om.exceptions.ConversionException;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.MeasureAndPointFactory;
import nl.wur.fbr.om.factory.UnitAndScaleConversionFactory;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.measures.ScalarMeasure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.points.ScalarPoint;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.om18.set.OMUnitAndScaleFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Contains unit tests for conversion between units defined in OM.
 * @author Don Willems on 04/08/15.
 */
public class OMUnitConversionTest {


    /**
     * Test for singular unit conversions.
     */
    @Test
    public void testSingularUnitConversion(){

        try {
            UnitAndScaleFactory factory = new OMUnitAndScaleFactory();
            MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
            UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);
            Unit metre = (Unit) factory.getUnitOrScale("metre");
            Unit inch = (Unit) factory.getUnitOrScale("inch");
            Measure m1 = measureFactory.createScalarMeasure(10,metre);
            Measure m2 = conversion.convertToUnit(m1, inch);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(m1, m2, 1e-12));
            Assert.assertEquals("Test measure equals after conversion", 393.7007874015748, ((ScalarMeasure) m2).doubleValue(), 0.0000001);


        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Test for prefixed unit conversions.
     */
    @Test
    public void testPrefixedUnitConversion(){

        try {
            UnitAndScaleFactory factory = new OMUnitAndScaleFactory();
            MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
            UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);
            Unit metre = (Unit) factory.getUnitOrScale("metre");
            Unit kilometre = (Unit) factory.getUnitOrScale("kilometre");
            Measure m1 = measureFactory.createScalarMeasure(1204,metre);
            Measure m2 = conversion.convertToUnit(m1,kilometre);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(m1, m2,1e-12));
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }

        try {
            UnitAndScaleFactory factory = new OMUnitAndScaleFactory();
            MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
            UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);
            Unit metre = (Unit) factory.getUnitOrScale("metre");
            Unit kilogram = (Unit) factory.getUnitOrScale("kilogram");
            Measure m1 = measureFactory.createScalarMeasure(1204,metre);
            Measure m2 = conversion.convertToUnit(m1,kilogram);
            Assert.assertNotEquals("Test measure equals after conversion", 1.204, ((ScalarMeasure) m2).doubleValue(), 0.0000001);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            Assert.assertTrue("Expected exception thrown when converting a unit. " + e, true);
        }
    }

    /**
     * Tests special case of kilogram as a base unit
     */
    @Test
    public void testKilogramUnitConversion(){

        try {
            UnitAndScaleFactory factory = new OMUnitAndScaleFactory();
            MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
            UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);
            Unit gram = (Unit) factory.getUnitOrScale("gram");
            Unit kilogram = (Unit) factory.getUnitOrScale("kilogram");
            Measure m1 = measureFactory.createScalarMeasure(1204, gram);
            Measure m2 = conversion.convertToUnit(m1, kilogram);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(m1, m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 1.204, ((ScalarMeasure) m2).doubleValue(), 0.0000001);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Tests conversion chaining as suggested by Hajo.
     */
    @Test
    public void testConversionChaining(){
        try {
            UnitAndScaleFactory factory = new OMUnitAndScaleFactory();
            MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
            UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);
            Unit cubicmetre = (Unit) factory.getUnitOrScale("cubic_metre");
            SingularUnit teaspoon = factory.createSingularUnit("Hajo's teaspoon","htsp",cubicmetre,4.928922e-6);
            SingularUnit dessertspoon = factory.createSingularUnit("Hajo's dessertspoon","hdsp",teaspoon,2);
            Unit litre = (Unit) factory.getUnitOrScale("litre");
            Measure m1 = measureFactory.createScalarMeasure(1,dessertspoon);
            Measure m2 = conversion.convertToUnit(m1, teaspoon);
            Measure m3 = conversion.convertToUnit(m1,cubicmetre);
            Measure m4 = conversion.convertToUnit(m1,litre);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(m1, m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 2, ((ScalarMeasure) m2).doubleValue(), 0.0000001);
            Assert.assertEquals("Test measure equals after conversion", 9.857844e-6, ((ScalarMeasure) m3).doubleValue(), 0.0000001);
            Assert.assertEquals("Test measure equals after conversion", 0.009857844, ((ScalarMeasure) m4).doubleValue(), 0.0000001);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Test for unit division conversion.
     */
    @Test
    public void testUnitDivisionConversion(){

        try {
            UnitAndScaleFactory factory = new OMUnitAndScaleFactory();
            MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
            UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);
            Unit kmh = (Unit) factory.getUnitOrScale("kilometre_per_hour");
            Unit ms = (Unit) factory.getUnitOrScale("metre_per_second");
            Measure m1 = measureFactory.createScalarMeasure(120,kmh);
            Measure m2 = conversion.convertToUnit(m1,ms);
            Assert.assertTrue("Test measure equals after conversion",conversion.equals(m1,m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 33.33333333333333, ((ScalarMeasure) m2).doubleValue(), 0.0000001);

        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Test for unit division conversion.
     */
    @Test
    public void testUnitMultiplicationConversion(){

        try {
            UnitAndScaleFactory factory = new OMUnitAndScaleFactory();
            MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
            UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);
            Unit joule = (Unit) factory.getUnitOrScale("joule");
            Unit kcal = (Unit) factory.getUnitOrScale("kilocalorie-mean");
            Measure m1 = measureFactory.createScalarMeasure(120,joule);
            Measure m2 = conversion.convertToUnit(m1,kcal);
            Assert.assertTrue("Test measure equals after conversion",conversion.equals(m1,m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 0.0286806883, ((ScalarMeasure) m2).doubleValue(), 0.0000001);

        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Test for unit exponentiation conversion.
     */
    @Test
    public void testUnitExponentiationConversion(){

        try {
            UnitAndScaleFactory factory = new OMUnitAndScaleFactory();
            MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
            UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);
            Unit squaremetre = (Unit) factory.getUnitOrScale("square_metre");
            Unit squarekilometre = (Unit) factory.getUnitOrScale("square_kilometre");
            Measure m1 = measureFactory.createScalarMeasure(1000000,squaremetre);
            Measure m2 = conversion.convertToUnit(m1,squarekilometre);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(m1, m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion",1.0, ((ScalarMeasure)m2).doubleValue(),0.0000001);

        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /** Tests conversion between scales. */
    @Test
    public void testScaleConversion(){

        try {
            UnitAndScaleFactory factory = new OMUnitAndScaleFactory();
            MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
            UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);
            Scale celsiusscale = (Scale) factory.getUnitOrScale("Celsius_scale");
            Scale fahrenheitscale = (Scale) factory.getUnitOrScale("Fahrenheit_scale");

            Point p1 = measureFactory.createScalarPoint(0.0,celsiusscale);
            Point p2 = conversion.convertToScale(p1,fahrenheitscale);
            System.out.println("p1: "+((ScalarPoint)p1).doubleValue() + p1.getScale().getUnit().getSymbol()+" "+p1.getClass());
            System.out.println("p2: "+((ScalarPoint)p2).doubleValue() + p2.getScale().getUnit().getSymbol()+" "+p2.getClass());
            Assert.assertEquals("Test measure equals after conversion", 32.0, ((ScalarPoint) p2).doubleValue(), 0.0000001);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(p1, p2,1e-12));
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when getting a scale from its identifier. " + e);
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a scale. " + e);
        }
    }
}
