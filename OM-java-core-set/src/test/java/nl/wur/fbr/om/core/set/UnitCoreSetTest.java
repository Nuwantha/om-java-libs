package nl.wur.fbr.om.core.set;

import nl.wur.fbr.om.core.factory.CoreUnitAndScaleFactory;
import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.units.Unit;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the core set of units.
 *
 * @author Don Willems on 30/07/15.
 */
public class UnitCoreSetTest {

    /**
     * Unit test foe the creation of the core set of units.
     */
    @Test
    public void testUnitCoreSet() {
        UnitAndScaleFactory factory = new CoreUnitAndScaleFactory();
        try {
            Assert.assertEquals("Test Unit core set creation", ((Unit)factory.getUnitOrScale(CoreUnitSet.METRE)).getName(), "metre");
            Assert.assertEquals("Test Unit core set creation", ((Unit)factory.getUnitOrScale(CoreUnitSet.METRE)).getSymbol(),"m");
            Assert.assertEquals("Test Unit core set creation", ((Unit)factory.getUnitOrScale(CoreUnitSet.METRE)).getName("en"), null);
            Assert.assertEquals("Test Unit core set creation", ((Unit)factory.getUnitOrScale(CoreUnitSet.METRE)).getName(null), "metre");
            Assert.assertTrue("Test Unit core set creation", ((Unit)factory.getUnitOrScale(CoreUnitSet.METRE)).getAlternativeNames().size() == 0);
            Assert.assertTrue("Test Unit core set creation", ((Unit)factory.getUnitOrScale(CoreUnitSet.METRE)).getAlternativeSymbols().size() == 0);
        } catch (UnitOrScaleCreationException e) {
            Assert.fail("Exception thrown when getting a creating coreUnitSet in the core set. " + e);
        }
    }
}
