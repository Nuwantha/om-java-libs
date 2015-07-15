package nl.wur.fbr.om;

import junit.framework.Assert;
import nl.wur.fbr.om.model.UnitPrefix;
import org.junit.Test;

/**
 * @author Don Willems on 15/07/15.
 */
public class PrefixTests {

    @Test
    public void testUnitPrefixes() {
        Assert.assertEquals("Failure in prefix name for kilo.",UnitPrefix.KILO,"kilo");
    }
}
