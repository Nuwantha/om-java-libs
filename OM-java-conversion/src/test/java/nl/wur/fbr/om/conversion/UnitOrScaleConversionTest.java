package nl.wur.fbr.om.conversion;

import nl.wur.fbr.om.core.factory.DefaultMeasureAndPointFactory;
import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.core.set.CoreSet;
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
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the conversion of units.
 * @author Don Willems on 01/08/15.
 */
public class UnitOrScaleConversionTest {

    /**
     * Test for singular unit conversions.
     */
    @Test
    public void testSingularUnitConversion(){

        try {
            UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
            factory.addUnitAndScaleSet(CoreSet.class);
            MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
            UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);
            Unit metre = CoreSet.METRE;
            Unit inch = CoreSet.INCH;
            Measure m1 = measureFactory.createScalarMeasure(10,metre);
            Measure m2 = conversion.convertToUnit(m1, inch);
            Assert.assertTrue("Test measure equals after conversion",conversion.equals(m1,m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 393.7007874015748, ((ScalarMeasure) m2).doubleValue(), 0.0000001);


        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Test for prefixed unit conversions.
     */
    @Test
    public void testPrefixedUnitConversion(){
        UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
        try {
            factory.addUnitAndScaleSet(CoreSet.class);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add core set to factory. " + e);
        }
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);

        try {
            Unit metre = CoreSet.METRE;
            Unit kilometre = CoreSet.KILOMETRE;
            Measure m1 = measureFactory.createScalarMeasure(1204,metre);
            Measure m2 = conversion.convertToUnit(m1,kilometre);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(m1, m2,1e-12));
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }

        try {
            Unit metre = CoreSet.METRE;
            Unit kilogram = CoreSet.KILOGRAM;
            Measure m1 = measureFactory.createScalarMeasure(1204,metre);
            Measure m2 = conversion.convertToUnit(m1,kilogram);
            Assert.assertNotEquals("Test measure equals after conversion", 1.204, ((ScalarMeasure) m2).doubleValue(), 0.0000001);
        } catch (ConversionException e) {
            Assert.assertTrue("Expected exception thrown when converting a unit. " + e, true);
        }
    }

    /**
     * Tests the special unit kilogram as a base unit.
     */
    @Test
    public void testKilogramUnitConversion(){
        UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
        try {
            factory.addUnitAndScaleSet(CoreSet.class);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add core set to factory. " + e);
        }
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);

        try {
            Unit gram = CoreSet.GRAM;
            Unit kilogram = CoreSet.KILOGRAM;
            Measure m1 = measureFactory.createScalarMeasure(1204, gram);
            Measure m2 = conversion.convertToUnit(m1, kilogram);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(m1, m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 1.204, ((ScalarMeasure) m2).doubleValue(), 0.0000001);
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
        UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
        try {
            factory.addUnitAndScaleSet(CoreSet.class);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add core set to factory. " + e);
        }
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);
        try {
            Unit cubicmetre = CoreSet.CUBIC_METRE;
            SingularUnit teaspoon = factory.createSingularUnit("Hajo's teaspoon","htsp",cubicmetre,4.928922e-6);
            SingularUnit dessertspoon = factory.createSingularUnit("Hajo's dessertspoon","hdsp",teaspoon,2);
            Unit litre = CoreSet.LITRE;
            Measure m1 = measureFactory.createScalarMeasure(1,dessertspoon);
            Measure m2 = conversion.convertToUnit(m1, teaspoon);
            Measure m3 = conversion.convertToUnit(m1,cubicmetre);
            Measure m4 = conversion.convertToUnit(m1,litre);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(m1, m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 2, ((ScalarMeasure) m2).doubleValue(), 0.0000001);
            Assert.assertEquals("Test measure equals after conversion", 9.857844e-6, ((ScalarMeasure) m3).doubleValue(), 0.0000001);
            Assert.assertEquals("Test measure equals after conversion", 0.009857844, ((ScalarMeasure) m4).doubleValue(), 0.0000001);
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
        UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
        try {
            factory.addUnitAndScaleSet(CoreSet.class);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add core set to factory. " + e);
        }
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);

        try {
            Unit kmh = CoreSet.KILOMETRE_PER_HOUR;
            Unit ms = CoreSet.METRE_PER_SECOND;
            Measure m1 = measureFactory.createScalarMeasure(120,kmh);
            Measure m2 = conversion.convertToUnit(m1,ms);
            Assert.assertTrue("Test measure equals after conversion",conversion.equals(m1,m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 33.33333333333333, ((ScalarMeasure) m2).doubleValue(), 0.0000001);

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
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);

        try {
            Unit joule = CoreSet.JOULE;
            Unit kcal = CoreSet.KILOCALORIE;
            Measure m1 = measureFactory.createScalarMeasure(120,joule);
            Measure m2 = conversion.convertToUnit(m1,kcal);
            Assert.assertTrue("Test measure equals after conversion",conversion.equals(m1,m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 0.0286806883, ((ScalarMeasure) m2).doubleValue(), 0.0000001);

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
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);

        try {
            Unit squaremetre = CoreSet.SQUARE_METRE;
            Unit squarekilometre = CoreSet.SQUARE_KILOMETRE;
            Measure m1 = measureFactory.createScalarMeasure(1000000,squaremetre);
            Measure m2 = conversion.convertToUnit(m1,squarekilometre);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(m1, m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion",1.0, ((ScalarMeasure)m2).doubleValue(),0.0000001);

        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /** Tests conversion between scales. */
    @Test
    public void testScaleConversion(){
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);

        try {
            Scale celsiusscale = CoreSet.CELSIUS_SCALE;
            Scale fahrenheitscale = CoreSet.FAHRENHEIT_SCALE;

            Point p1 = measureFactory.createScalarPoint(0.0,celsiusscale);
            Point p2 = conversion.convertToScale(p1,fahrenheitscale);
            Assert.assertEquals("Test measure equals after conversion", 32.0, ((ScalarPoint) p2).doubleValue(), 0.0000001);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(p1, p2,1e-12));
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a scale. " + e);
        }
    }
}
