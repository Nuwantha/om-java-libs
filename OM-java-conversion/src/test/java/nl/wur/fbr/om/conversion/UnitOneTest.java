package nl.wur.fbr.om.conversion;

import nl.wur.fbr.om.core.set.CoreUnitAndScaleSet;
import nl.wur.fbr.om.exceptions.ConversionException;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.units.Unit;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Don Willems on 14/08/15.
 */
public class UnitOneTest {

    @Test
    public void testOne() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Unit metrePerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.METRE);
        Assert.assertTrue("Testing m/m to be equal to one.", factory.unitIsEqualToOne(metrePerMetre));
        Unit kilometrePerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.KILOMETRE, CoreUnitAndScaleSet.METRE);
        Assert.assertFalse("Testing km/m to be equal to one.", factory.unitIsEqualToOne(kilometrePerMetre));
        Unit kilometrePerKilometre = factory.createUnitDivision(CoreUnitAndScaleSet.KILOMETRE, CoreUnitAndScaleSet.KILOMETRE);
        Assert.assertTrue("Testing km/km to be equal to one.", factory.unitIsEqualToOne(kilometrePerKilometre));
        Assert.assertTrue("Testing 1 to be equal to one.", factory.unitIsEqualToOne(CoreUnitAndScaleSet.ONE));
        Assert.assertTrue("Testing rad to be equal to one.", factory.unitIsEqualToOne(CoreUnitAndScaleSet.RADIAN));
        Assert.assertFalse("Testing degree C to be equal to one.", factory.unitIsEqualToOne(CoreUnitAndScaleSet.CELSIUS));
        Unit newtonMetre = factory.createUnitMultiplication(CoreUnitAndScaleSet.NEWTON, CoreUnitAndScaleSet.METRE);
        Unit newtonPerNewtonMetre = factory.createUnitDivision(CoreUnitAndScaleSet.NEWTON, newtonMetre);
        Assert.assertFalse("Testing N/M.m to be equal to one.", factory.unitIsEqualToOne(newtonPerNewtonMetre));
        Unit metreNewtonPerNewtonMetre = factory.createUnitMultiplication(CoreUnitAndScaleSet.METRE,newtonPerNewtonMetre);
        Assert.assertTrue("Testing m.N/M.m to be equal to one.", factory.unitIsEqualToOne(metreNewtonPerNewtonMetre));
    }

    @Test
    public void testOneAndNotOne() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Unit metrePerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.METRE, CoreUnitAndScaleSet.METRE);
        Unit kilometrePerMetre = factory.createUnitDivision(CoreUnitAndScaleSet.KILOMETRE, CoreUnitAndScaleSet.METRE);
        Unit gramPerGram = factory.createUnitDivision(CoreUnitAndScaleSet.GRAM, CoreUnitAndScaleSet.GRAM);
        Unit kilometrePerGram = factory.createUnitDivision(CoreUnitAndScaleSet.KILOMETRE, CoreUnitAndScaleSet.GRAM);
        Measure m1 = factory.createScalarMeasure(2.0, metrePerMetre);
        try {
            Measure m2 = factory.convertToUnit(m1,kilometrePerMetre);
            Assert.assertEquals("Testing dimensionless units conversion m/m to km/m",0.002,m2.getScalarValue(),0.000001);
        } catch (ConversionException e) {
            Assert.fail("Unexpected exception thrown when converting from "+metrePerMetre+" to "+kilometrePerMetre);
        }
        try {
            Measure m2 = factory.convertToUnit(m1,gramPerGram);
            Assert.fail("Expected exception was not thrown when converting from " + metrePerMetre + " to " + gramPerGram);
        } catch (ConversionException e) {
            Assert.assertTrue("Expected exception thrown when converting from " + metrePerMetre + " to " + gramPerGram, true);
        }
        try {
            Measure m2 = factory.convertToUnit(m1, CoreUnitAndScaleSet.ONE);
            Assert.assertEquals("Testing dimensionless units conversion m/m to One", 2.0, m2.getScalarValue(), 0.000001);
        } catch (ConversionException e) {
            Assert.fail("Unexpected exception thrown when converting from " + metrePerMetre + " to " + CoreUnitAndScaleSet.ONE);
        }
        try {
            Measure m2 = factory.createScalarMeasure(2.0, kilometrePerMetre);
            Measure m3 = factory.convertToUnit(m2, CoreUnitAndScaleSet.ONE);
            Assert.assertEquals("Testing dimensionless units conversion km/m to One", 2000, m3.getScalarValue(), 0.000001);
        } catch (ConversionException e) {
            Assert.fail("Unexpected exception thrown when converting from " + kilometrePerMetre + " to " + CoreUnitAndScaleSet.ONE);
        }
        try {
            Measure m2 = factory.createScalarMeasure(2.0, gramPerGram);
            Measure m3 = factory.convertToUnit(m2, CoreUnitAndScaleSet.ONE);
            Assert.assertEquals("Testing dimensionless units conversion g/g to One", 2.0, m3.getScalarValue(), 0.000001);
        } catch (ConversionException e) {
            Assert.fail("Unexpected exception thrown when converting from " + gramPerGram + " to " + CoreUnitAndScaleSet.ONE);
        }
        try {
            Measure m2 = factory.createScalarMeasure(2.0, kilometrePerGram);
            factory.convertToUnit(m2, CoreUnitAndScaleSet.ONE);
            Assert.fail("Expected exception was not thrown when converting from " + kilometrePerGram + " to " + CoreUnitAndScaleSet.ONE);
        } catch (ConversionException e) {
            Assert.assertTrue("Unexpected exception thrown when converting from " + kilometrePerGram + " to " + CoreUnitAndScaleSet.ONE,true);
        }
    }
}
