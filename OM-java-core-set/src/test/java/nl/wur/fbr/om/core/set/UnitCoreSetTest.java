package nl.wur.fbr.om.core.set;

import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
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
        UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
        Units units = new Units();
        try {
            units.initialiseSet(factory);
            Assert.assertEquals("Test Unit core set creation", units.METRE.getName(), "metre");
            Assert.assertEquals("Test Unit core set creation",units.METRE.getSymbol(),"m");
            Assert.assertEquals("Test Unit core set creation", units.METRE.getName("en"), null);
            Assert.assertEquals("Test Unit core set creation", units.METRE.getName(null), "metre");
            Assert.assertTrue("Test Unit core set creation", units.METRE.getAlternativeNames().size() == 0);
            Assert.assertTrue("Test Unit core set creation", units.METRE.getAlternativeSymbols().size() == 0);
        } catch (UnitOrScaleCreationException e) {
            Assert.fail("Exception thrown when getting a creating units in the core set. " + e);
        }
    }
}
