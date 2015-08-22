package nl.wur.fbr.om.core.set;

import nl.wur.fbr.om.core.factory.DefaultInstanceFactory;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.Unit;
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
        InstanceFactory factory = new DefaultInstanceFactory();
        try {
            factory.addUnitAndScaleSet(CoreSet.class);
            Assert.assertEquals("Test Unit core set creation", CoreSet.METRE.getName(), "metre");
            Assert.assertEquals("Test Unit core set creation", CoreSet.METRE.getSymbol(),"m");
            Assert.assertEquals("Test Unit core set creation", CoreSet.METRE.getName("en"), null);
            Assert.assertEquals("Test Unit core set creation", CoreSet.METRE.getName(null), "metre");
            Assert.assertTrue("Test Unit core set creation", CoreSet.METRE.getAlternativeNames().size() == 0);
            Assert.assertTrue("Test Unit core set creation", CoreSet.METRE.getAlternativeSymbols().size() == 0);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add core set to factory. "+e);
        }
    }


    /**
     * Unit test for the creation of a unit division from the core set of units.
     */
    @Test
    public void testCoreUnitDivision(){
        InstanceFactory factory = new DefaultInstanceFactory();
        try {
            factory.addUnitAndScaleSet(CoreSet.class);
            UnitDivision kilometrePerSecond = (UnitDivision) CoreSet.KILOMETRE_PER_SECOND;
            Assert.assertEquals("Test unit division creation.", kilometrePerSecond.getName(), "kilometre per second");
            Assert.assertEquals("Test unit division creation.", kilometrePerSecond.getSymbol(), "km/s");
            Assert.assertEquals("Test unit division creation.", kilometrePerSecond.getNumerator().getIdentifier(), CoreSet.KILOMETRE.getIdentifier());
            Assert.assertEquals("Test unit division creation.", kilometrePerSecond.getDenominator().getIdentifier(), CoreSet.SECOND.getIdentifier());
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add core set to factory. "+e);
        }
    }

    /**
     * Unit test for the creation of measurement scales from the core set.
     */
    @Test
    public void testScaleCreation(){
        InstanceFactory factory = new DefaultInstanceFactory();
        try{
            factory.addUnitAndScaleSet(CoreSet.class);
            Scale kelvinScale = CoreSet.KELVIN_SCALE;
            Scale celsiusScale = CoreSet.CELSIUS_SCALE;
            Scale fahrenheitScale = CoreSet.FAHRENHEIT_SCALE;
            Assert.assertEquals("Test scale creation",fahrenheitScale.getDefinitionScale(),kelvinScale);
            Assert.assertEquals("Test scale creation",fahrenheitScale.getUnit().getIdentifier(),CoreSet.FAHRENHEIT.getIdentifier());
            Assert.assertTrue("Test scale creation", fahrenheitScale.getOffsetFromDefinitionScale() == -459.67);
            Assert.assertTrue("Test scale creation", fahrenheitScale.getFactorFromDefinitionScale() == 1.8);
            Assert.assertEquals("Test scale creation", celsiusScale.getDefinitionScale(), kelvinScale);
            Assert.assertEquals("Test scale creation", celsiusScale.getUnit().getIdentifier(), CoreSet.CELSIUS.getIdentifier());
            Assert.assertTrue("Test scale creation", celsiusScale.getOffsetFromDefinitionScale() == -273.15);
            Assert.assertTrue("Test scale creation", celsiusScale.getFactorFromDefinitionScale() == 1.0);
            Assert.assertNull("Test scale creation", kelvinScale.getDefinitionScale());
            Assert.assertEquals("Test scale creation", kelvinScale.getUnit().getIdentifier(), CoreSet.KELVIN.getIdentifier());
            Assert.assertTrue("Test scale creation", kelvinScale.getOffsetFromDefinitionScale() == 0);
            Assert.assertTrue("Test scale creation", kelvinScale.getFactorFromDefinitionScale() == 1.0);
            Assert.assertNull("Test scale creation", kelvinScale.getSymbol());
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not add core set to factory. "+e);
        }
    }
}
