package nl.wur.fbr.om.conversion;

import nl.wur.fbr.om.core.factory.DefaultMeasureAndPointFactory;
import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.core.set.CoreUnitAndScaleSet;
import nl.wur.fbr.om.exceptions.ConversionException;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.factory.MeasureAndPointFactory;
import nl.wur.fbr.om.factory.UnitAndScaleConversionFactory;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
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

        InstanceFactory factory = new CoreInstanceFactory();
        try {
            factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        } catch (UnitOrScaleCreationException e) {
            Assert.fail("Could not add unit and scale set to the factory. " + e);
        }
        try {
            MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
            UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);
            Unit metre = CoreUnitAndScaleSet.METRE;
            Unit inch = CoreUnitAndScaleSet.INCH;
            Measure m1 = measureFactory.createScalarMeasure(10,metre);
            Measure m2 = conversion.convertToUnit(m1, inch);
            Assert.assertTrue("Test measure equals after conversion",conversion.equals(m1,m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 393.7007874015748, m2.getScalarValue(), 0.0000001);


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
        InstanceFactory factory = new CoreInstanceFactory();
        try {
            factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        } catch (UnitOrScaleCreationException e) {
            Assert.fail("Could not add unit and scale set to the factory. " + e);
        }
        try {
            Unit metre = CoreUnitAndScaleSet.METRE;
            Unit kilometre = CoreUnitAndScaleSet.KILOMETRE;
            Measure m1 = factory.createScalarMeasure(1204,metre);
            Measure m2 = factory.convertToUnit(m1,kilometre);
            Assert.assertTrue("Test measure equals after conversion", factory.equals(m1, m2,1e-12));
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }

        try {
            Unit metre = CoreUnitAndScaleSet.METRE;
            Unit kilogram = CoreUnitAndScaleSet.KILOGRAM;
            Measure m1 = factory.createScalarMeasure(1204,metre);
            Measure m2 = factory.convertToUnit(m1,kilogram);
            Assert.assertNotEquals("Test measure equals after conversion", 1.204, m2.getScalarValue(), 0.0000001);
        } catch (ConversionException e) {
            Assert.assertTrue("Expected exception thrown when converting a unit. " + e, true);
        }
    }

    /**
     * Tests the special unit kilogram as a base unit.
     */
    @Test
    public void testKilogramUnitConversion(){
        InstanceFactory factory = new CoreInstanceFactory();
        try {
            factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
            Unit gram = CoreUnitAndScaleSet.GRAM;
            Unit kilogram = CoreUnitAndScaleSet.KILOGRAM;
            Measure m1 = factory.createScalarMeasure(1204, gram);
            Measure m2 = factory.convertToUnit(m1, kilogram);
            Assert.assertTrue("Test measure equals after conversion", factory.equals(m1, m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 1.204, m2.getScalarValue(), 0.0000001);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add unit and scale set to the factory. " + e);
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Tests the special unit kilogram as a base unit without measures but with doubles.
     */
    @Test
    public void testKilogramUnitConversionWithDoubles(){
        InstanceFactory factory = new CoreInstanceFactory();

        try {
            factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
            Unit gram = CoreUnitAndScaleSet.GRAM;
            Unit kilogram = CoreUnitAndScaleSet.KILOGRAM;
            double convValue = factory.convert(1024, gram, kilogram);
            Assert.assertEquals("Test value equals after conversion", 1.024, convValue, 0.00001);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add unit and scale set to the factory. " + e);
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
            factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add core set to factory. " + e);
        }
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);
        try {
            Unit cubicmetre = CoreUnitAndScaleSet.CUBIC_METRE;
            SingularUnit teaspoon = factory.createSingularUnit("Hajo's teaspoon","htsp",cubicmetre,4.928922e-6);
            SingularUnit dessertspoon = factory.createSingularUnit("Hajo's dessertspoon","hdsp",teaspoon,2);
            Unit litre = CoreUnitAndScaleSet.LITRE;
            Measure m1 = measureFactory.createScalarMeasure(1,dessertspoon);
            Measure m2 = conversion.convertToUnit(m1, teaspoon);
            Measure m3 = conversion.convertToUnit(m1,cubicmetre);
            Measure m4 = conversion.convertToUnit(m1,litre);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(m1, m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 2, m2.getScalarValue(), 0.0000001);
            Assert.assertEquals("Test measure equals after conversion", 9.857844e-6, m3.getScalarValue(), 0.0000001);
            Assert.assertEquals("Test measure equals after conversion", 0.009857844, m4.getScalarValue(), 0.0000001);
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
        InstanceFactory factory = new CoreInstanceFactory();
        try {
            factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add core set to factory. " + e);
        }
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);

        try {
            Unit kmh = CoreUnitAndScaleSet.KILOMETRE_PER_HOUR;
            Unit ms = CoreUnitAndScaleSet.METRE_PER_SECOND;
            Measure m1 = measureFactory.createScalarMeasure(120,kmh);
            Measure m2 = conversion.convertToUnit(m1,ms);
            Assert.assertTrue("Test measure equals after conversion",conversion.equals(m1,m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 33.33333333333333, m2.getScalarValue(), 0.0000001);

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
        InstanceFactory factory = new CoreInstanceFactory();
        try {
            factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add core set to factory. " + e);
        }
        try {
            Unit joule = CoreUnitAndScaleSet.JOULE;
            Unit kcal = CoreUnitAndScaleSet.KILOCALORIE;
            Measure m1 = factory.createScalarMeasure(120,joule);
            Measure m2 = factory.convertToUnit(m1,kcal);
            Assert.assertTrue("Test measure equals after conversion",factory.equals(m1,m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 0.0286806883, m2.getScalarValue(), 0.0000001);

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
        InstanceFactory factory = new CoreInstanceFactory();
        try {
            factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add core set to factory. " + e);
        }
        try {
            Unit squaremetre = CoreUnitAndScaleSet.SQUARE_METRE;
            Unit squarekilometre = CoreUnitAndScaleSet.SQUARE_KILOMETRE;
            Measure m1 = factory.createScalarMeasure(1000000,squaremetre);
            Measure m2 = factory.convertToUnit(m1,squarekilometre);
            Assert.assertTrue("Test measure equals after conversion", factory.equals(m1, m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion",1.0, m2.getScalarValue(),0.0000001);

        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /** Tests conversion between scales. */
    @Test
    public void testScaleConversion(){
        InstanceFactory factory = new CoreInstanceFactory();
        try {
            factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add core set to factory. " + e);
        }
        try {
            Scale celsiusscale = CoreUnitAndScaleSet.CELSIUS_SCALE;
            Scale fahrenheitscale = CoreUnitAndScaleSet.FAHRENHEIT_SCALE;

            Point p1 = factory.createScalarPoint(0.0,celsiusscale);
            Point p2 = factory.convertToScale(p1,fahrenheitscale);
            Assert.assertEquals("Test measure equals after conversion", 32.0, p2.getScalarValue(), 0.0000001);
            Assert.assertTrue("Test measure equals after conversion", factory.equals(p1, p2,1e-12));
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a scale. " + e);
        }
    }
}
