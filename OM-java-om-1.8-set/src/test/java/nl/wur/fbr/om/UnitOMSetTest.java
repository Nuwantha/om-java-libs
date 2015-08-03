package nl.wur.fbr.om;

import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.om18.set.OMUnitAndScaleFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the OM set of units.
 *
 * @author Don Willems on 03/08/15.
 */
public class UnitOMSetTest {

    @Test
    public void testOMBaseUnits(){
        try {
            UnitAndScaleFactory factory = new OMUnitAndScaleFactory();
            Unit metre = (Unit) factory.getUnitOrScale("metre");

        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not create OMUnitAndScaleFactory.");
        }
    }
}
