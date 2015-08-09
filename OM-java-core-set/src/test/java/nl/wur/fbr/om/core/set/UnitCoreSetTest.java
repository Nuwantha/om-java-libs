package nl.wur.fbr.om.core.set;

import nl.wur.fbr.om.model.units.UnitDivision;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the core set of units.
 *
 * @author Don Willems on 30/07/15.
 */
public class UnitCoreSetTest {

    /**
     * Unit test for the creation of the core set of units.
     */
    @Test
    public void testUnitCoreSet() {
        try {
            Assert.assertEquals("Test Unit core set creation", CoreSet.METRE.getName(), "metre");
            Assert.assertEquals("Test Unit core set creation", CoreSet.METRE.getSymbol(),"m");
            Assert.assertEquals("Test Unit core set creation", CoreSet.METRE.getName("en"), null);
            Assert.assertEquals("Test Unit core set creation", CoreSet.METRE.getName(null), "metre");
            Assert.assertTrue("Test Unit core set creation", CoreSet.METRE.getAlternativeNames().size() == 0);
            Assert.assertTrue("Test Unit core set creation", CoreSet.METRE.getAlternativeSymbols().size() == 0);
        } catch (Exception e) {
            Assert.fail("Exception thrown when getting a creating coreUnitSet in the core set. " + e);
        }
    }


    /**
     * Unit test for the creation of a unit division from the core set of units.
     */
    @Test
    public void testCoreUnitDivision(){
        try {
            UnitDivision kilometrePerSecond = (UnitDivision) CoreSet.KILOMETRE_PER_SECOND;
            Assert.assertEquals("Test unit division creation.", kilometrePerSecond.getName(), "kilometre per second");
            Assert.assertEquals("Test unit division creation.", kilometrePerSecond.getSymbol(), "km/s");
            Assert.assertEquals("Test unit division creation.", kilometrePerSecond.getNumerator().getIdentifier(), CoreSet.KILOMETRE.getIdentifier());
            Assert.assertEquals("Test unit division creation.", kilometrePerSecond.getDenominator().getIdentifier(), CoreSet.SECOND.getIdentifier());
        } catch (Exception e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        }
    }

    /**
     * Unit test for the creation of measurement scales from the core set.
     */
    @Test
    public void testScaleCreation(){
        try {
            Assert.assertEquals("Test scale creation",CoreSet.FAHRENHEIT_SCALE.getDefinitionScale(),CoreSet.KELVIN_SCALE);
            Assert.assertEquals("Test scale creation",CoreSet.FAHRENHEIT_SCALE.getUnit().getIdentifier(), CoreSet.FAHRENHEIT.getIdentifier());
            Assert.assertTrue("Test scale creation", CoreSet.FAHRENHEIT_SCALE.getOffsetFromDefinitionScale() == -459.67);
            Assert.assertTrue("Test scale creation", CoreSet.FAHRENHEIT_SCALE.getFactorFromDefinitionScale() == 1.8);
            Assert.assertEquals("Test scale creation", CoreSet.CELSIUS_SCALE.getDefinitionScale(), CoreSet.KELVIN_SCALE);
            Assert.assertEquals("Test scale creation", CoreSet.CELSIUS_SCALE.getUnit().getIdentifier(), CoreSet.CELSIUS.getIdentifier());
            Assert.assertTrue("Test scale creation", CoreSet.CELSIUS_SCALE.getOffsetFromDefinitionScale() == -273.15);
            Assert.assertTrue("Test scale creation", CoreSet.CELSIUS_SCALE.getFactorFromDefinitionScale() == 1.0);
            Assert.assertNull("Test scale creation", CoreSet.KELVIN_SCALE.getDefinitionScale());
            Assert.assertEquals("Test scale creation", CoreSet.KELVIN_SCALE.getUnit().getIdentifier(), CoreSet.KELVIN.getIdentifier());
            Assert.assertTrue("Test scale creation", CoreSet.KELVIN_SCALE.getOffsetFromDefinitionScale() == 0);
            Assert.assertTrue("Test scale creation", CoreSet.KELVIN_SCALE.getFactorFromDefinitionScale() == 1.0);
            Assert.assertNull("Test scale creation", CoreSet.KELVIN_SCALE.getSymbol());
        } catch (Exception e) {
            Assert.fail("Exception thrown when getting a scale from its identifier. " + e);
        }
    }
}
