package nl.wur.fbr.om.conversion;

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
import nl.wur.fbr.om.model.units.Unit;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the conversion of units.
 * @author Don Willems on 01/08/15.
 */
public class UnitConversionTest {

    /**
     * Test for singular unit conversions.
     */
    @Test
    public void testSingularUnitConversion(){
        UnitAndScaleFactory factory = new CoreUnitAndScaleFactory();
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);

        try {
            Unit metre = (Unit) factory.getUnitOrScale(CoreUnitSet.METRE);
            Unit inch = (Unit) factory.getUnitOrScale(CoreUnitSet.INCH);
            Measure m1 = measureFactory.createScalarMeasure(10,metre);
            Measure m2 = conversion.convertToUnit(m1, inch);
            Assert.assertTrue("Test measure equals after conversion",conversion.equals(m1,m2));
            Assert.assertEquals("Test measure equals after conversion", 393.7007874015748, ((ScalarMeasure) m2).doubleValue(), 0.0000001);


        } catch (UnitOrScaleCreationException e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Test for prefixed unit conversions.
     */
    @Test
    public void testPrefixedUnitConversion(){
        UnitAndScaleFactory factory = new CoreUnitAndScaleFactory();
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);

        try {
            Unit metre = (Unit) factory.getUnitOrScale(CoreUnitSet.METRE);
            Unit kilometre = (Unit) factory.getUnitOrScale(CoreUnitSet.KILOMETRE);
            Measure m1 = measureFactory.createScalarMeasure(1204,metre);
            Measure m2 = conversion.convertToUnit(m1,kilometre);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(m1, m2));
        } catch (UnitOrScaleCreationException e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            Assert.fail("Exception thrown when converting a unit. " + e);
        }

        try {
            Unit metre = (Unit) factory.getUnitOrScale(CoreUnitSet.METRE);
            Unit kilogram = (Unit) factory.getUnitOrScale(CoreUnitSet.KILOMETRE);
            Measure m1 = measureFactory.createScalarMeasure(1204,metre);
            Measure m2 = conversion.convertToUnit(m1,kilogram);
            Assert.assertNotEquals("Test measure equals after conversion", 1.204, ((ScalarMeasure) m2).doubleValue(), 0.0000001);
        } catch (UnitOrScaleCreationException e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            Assert.assertTrue("Expected exception thrown when converting a unit. " + e, true);
        }
    }

    /**
     * Test for unit division conversion.
     */
    @Test
    public void testUnitDivisionConversion(){
        UnitAndScaleFactory factory = new CoreUnitAndScaleFactory();
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);

        try {
            Unit kmh = (Unit) factory.getUnitOrScale(CoreUnitSet.KILOMETRE_PER_HOUR);
            Unit ms = (Unit) factory.getUnitOrScale(CoreUnitSet.METRE_PER_SECOND);
            Measure m1 = measureFactory.createScalarMeasure(120,kmh);
            Measure m2 = conversion.convertToUnit(m1,ms);
            Assert.assertTrue("Test measure equals after conversion",conversion.equals(m1,m2));
            Assert.assertEquals("Test measure equals after conversion", 33.33333333333333, ((ScalarMeasure) m2).doubleValue(), 0.0000001);

        } catch (UnitOrScaleCreationException e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Test for unit division conversion.
     */
    @Test
    public void testUnitMultiplicationConversion(){
        UnitAndScaleFactory factory = new CoreUnitAndScaleFactory();
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);

        try {
            Unit joule = (Unit) factory.getUnitOrScale(CoreUnitSet.JOULE);
            Unit kcal = (Unit) factory.getUnitOrScale(CoreUnitSet.KILOCALORIE);
            Measure m1 = measureFactory.createScalarMeasure(120,joule);
            Measure m2 = conversion.convertToUnit(m1,kcal);
            Assert.assertTrue("Test measure equals after conversion",conversion.equals(m1,m2));
            Assert.assertEquals("Test measure equals after conversion", 0.0286806883, ((ScalarMeasure) m2).doubleValue(), 0.0000001);

        } catch (UnitOrScaleCreationException e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Test for unit exponentiation conversion.
     */
    @Test
    public void testUnitExponentiationConversion(){
        UnitAndScaleFactory factory = new CoreUnitAndScaleFactory();
        MeasureAndPointFactory measureFactory = new DefaultMeasureAndPointFactory();
        UnitAndScaleConversionFactory conversion = new DefaultUnitConversionFactory(measureFactory);

        try {
            Unit squaremetre = (Unit) factory.getUnitOrScale(CoreUnitSet.SQUARE_METRE);
            Unit squarekilometre = (Unit) factory.getUnitOrScale(CoreUnitSet.SQUARE_KILOMETRE);
            Measure m1 = measureFactory.createScalarMeasure(1000000,squaremetre);
            Measure m2 = conversion.convertToUnit(m1,squarekilometre);
            Assert.assertTrue("Test measure equals after conversion", conversion.equals(m1, m2));
            Assert.assertEquals("Test measure equals after conversion",1.0, ((ScalarMeasure)m2).doubleValue(),0.0000001);

        } catch (UnitOrScaleCreationException e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        } catch (ConversionException e) {
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }
}
