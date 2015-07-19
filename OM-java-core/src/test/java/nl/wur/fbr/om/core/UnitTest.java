package nl.wur.fbr.om.core;

import nl.wur.fbr.om.core.impl.SingularUnitImpl;
import nl.wur.fbr.om.core.impl.UnitImpl;
import nl.wur.fbr.om.model.Unit;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Don Willems on 19/07/15.
 */
public class UnitTest {

    @Test
    public void testUnitNameAndSymbols() {
        UnitImpl metre = new SingularUnitImpl("metre","m");
        Assert.assertEquals("Test names and symbols for units.",metre.getName(),"metre");
        Assert.assertEquals("Test names and symbols for units.",metre.getSymbol(),"m");
        Assert.assertEquals("Test names and symbols for units.", metre.getName("en"), null);
        Assert.assertEquals("Test names and symbols for units.", metre.getName(null), "metre");
        Assert.assertTrue("Test names and symbols for units.", metre.getAlternativeNames().size() == 0);
        Assert.assertTrue("Test names and symbols for units.", metre.getAlternativeSymbols().size() == 0);
        metre.addAlternativeName("meter", "nl");
        Assert.assertEquals("Test names and symbols for units.", metre.getName(), "metre");
        Assert.assertEquals("Test names and symbols for units.",metre.getSymbol(),"m");
        Assert.assertEquals("Test names and symbols for units.",metre.getName("en"),null);
        Assert.assertEquals("Test names and symbols for units.", metre.getName("nl"), "meter");
        Assert.assertEquals("Test names and symbols for units.", metre.getName(null), "metre");
        Assert.assertTrue("Test names and symbols for units.", metre.getAlternativeNames().size() == 1);
        if(metre.getAlternativeNames().size()>0){
            Assert.assertEquals("Test names and symbols for units.", metre.getAlternativeNames().get(0), "meter");
        }
        Assert.assertTrue("Test names and symbols for units.", metre.getAlternativeNames("nl").size() == 0);
        Assert.assertTrue("Test names and symbols for units.", metre.getAlternativeSymbols().size() == 0);
        metre.addAlternativeSymbol("mtr");
        Assert.assertEquals("Test names and symbols for units.", metre.getName(), "metre");
        Assert.assertEquals("Test names and symbols for units.",metre.getSymbol(),"m");
        Assert.assertEquals("Test names and symbols for units.",metre.getName("en"),null);
        Assert.assertEquals("Test names and symbols for units.", metre.getName("nl"), "meter");
        Assert.assertEquals("Test names and symbols for units.", metre.getName(null), "metre");
        Assert.assertTrue("Test names and symbols for units.", metre.getAlternativeNames().size() == 1);
        if(metre.getAlternativeNames().size()>0){
            Assert.assertEquals("Test names and symbols for units.", metre.getAlternativeNames().get(0), "meter");
        }
        Assert.assertTrue("Test names and symbols for units.", metre.getAlternativeNames("nl").size() == 0);
        Assert.assertTrue("Test names and symbols for units.", metre.getAlternativeSymbols().size() == 1);
        if(metre.getAlternativeSymbols().size()>0){
            Assert.assertEquals("Test names and symbols for units.", metre.getAlternativeSymbols().get(0), "mtr");
        }
    }
}
