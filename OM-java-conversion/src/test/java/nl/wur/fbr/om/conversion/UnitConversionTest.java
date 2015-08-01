package nl.wur.fbr.om.conversion;

import nl.wur.fbr.om.core.factory.DefaultMeasureAndPointFactory;
import nl.wur.fbr.om.core.set.CoreUnitAndScaleFactory;
import nl.wur.fbr.om.core.set.CoreUnitSet;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.MeasureAndPointFactory;
import nl.wur.fbr.om.factory.UnitAndScaleConversionFactory;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.units.Unit;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the conversion of units.
 * @author Don Willems on 01/08/15.
 */
public class UnitConversionTest {

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
            Measure m2 = measureFactory.createScalarMeasure(1.204,kilometre);
            Assert.assertTrue("Test measure equals after conversion",conversion.equals(m1,m2));

        } catch (UnitOrScaleCreationException e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);

        }

    }
}
