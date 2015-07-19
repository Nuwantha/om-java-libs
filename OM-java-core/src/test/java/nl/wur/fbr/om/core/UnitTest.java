package nl.wur.fbr.om.core;

import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.core.impl.SingularUnitImpl;
import nl.wur.fbr.om.core.impl.UnitImpl;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.SingularUnit;
import nl.wur.fbr.om.model.Unit;
import nl.wur.fbr.om.model.UnitMultiple;
import nl.wur.fbr.om.prefixes.DecimalPrefix;
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

    @Test
    public void testSingularUnitCreation() {
        UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
        SingularUnit metre = factory.createBaseUnit("metre","m");
        SingularUnit au = factory.createSingularUnit("astronomical unit", "AU", metre, 1.495978707e11);
    }

    @Test
    public void testUnitMultipleCreation() {
        UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
        SingularUnit metre = factory.createBaseUnit("metre","m");
        UnitMultiple kilometre = factory.createUnitMultiple("kilometre",metre, DecimalPrefix.KILO);
        Assert.assertEquals("Test unit multiple creation.", kilometre.getSymbol(), "km");
        Assert.assertEquals("Test unit multiple creation.", kilometre.getSymbol(), "km");
    }
}
