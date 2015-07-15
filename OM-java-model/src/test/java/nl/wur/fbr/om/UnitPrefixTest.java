package nl.wur.fbr.om;

import nl.wur.fbr.om.model.UnitPrefix;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for prefixes.
 * @author Don Willems on 15/07/15.
 */
public class UnitPrefixTest {

    /**
     * Unit test to test correct implementation of prefixes.
     */
    @Test
    public void testUnitPrefixes() {
        Assert.assertEquals("Failure in prefix name for tera.", UnitPrefix.TERA.getPrefixName(), "tera");
        Assert.assertEquals("Failure in prefix symbol for tera.", UnitPrefix.TERA.getPrefixSymbol(), "T");
        Assert.assertTrue("Failure in prefix factor for tera.", UnitPrefix.TERA.getPrefixFactor() == 1e12);
        Assert.assertEquals("Failure in prefix name for giga.", UnitPrefix.GIGA.getPrefixName(), "giga");
        Assert.assertEquals("Failure in prefix symbol for giga.", UnitPrefix.GIGA.getPrefixSymbol(), "G");
        Assert.assertTrue("Failure in prefix factor for giga.", UnitPrefix.GIGA.getPrefixFactor() == 1e9);
        Assert.assertEquals("Failure in prefix name for mega.", UnitPrefix.MEGA.getPrefixName(), "mega");
        Assert.assertEquals("Failure in prefix symbol for mega.", UnitPrefix.MEGA.getPrefixSymbol(), "M");
        Assert.assertTrue("Failure in prefix factor for mega.", UnitPrefix.MEGA.getPrefixFactor() == 1e6);
        Assert.assertEquals("Failure in prefix name for kilo.", UnitPrefix.KILO.getPrefixName(), "kilo");
        Assert.assertEquals("Failure in prefix symbol for kilo.", UnitPrefix.KILO.getPrefixSymbol(), "k");
        Assert.assertTrue("Failure in prefix factor for kilo.", UnitPrefix.KILO.getPrefixFactor() == 1000);
        Assert.assertEquals("Failure in prefix name for hecto.", UnitPrefix.HECTO.getPrefixName(), "hecto");
        Assert.assertEquals("Failure in prefix symbol for hecto.", UnitPrefix.HECTO.getPrefixSymbol(), "h");
        Assert.assertTrue("Failure in prefix factor for hecto.", UnitPrefix.HECTO.getPrefixFactor() == 100);
        Assert.assertEquals("Failure in prefix name for deca.", UnitPrefix.DECA.getPrefixName(), "deca");
        Assert.assertEquals("Failure in prefix symbol for deca.", UnitPrefix.DECA.getPrefixSymbol(), "da");
        Assert.assertTrue("Failure in prefix factor for deca.", UnitPrefix.DECA.getPrefixFactor() == 10);
        Assert.assertEquals("Failure in prefix name for deci.", UnitPrefix.DECI.getPrefixName(), "deci");
        Assert.assertEquals("Failure in prefix symbol for deci.", UnitPrefix.DECI.getPrefixSymbol(), "d");
        Assert.assertTrue("Failure in prefix factor for deci.", UnitPrefix.DECI.getPrefixFactor() == 0.1);
        Assert.assertEquals("Failure in prefix name for centi.", UnitPrefix.CENTI.getPrefixName(), "centi");
        Assert.assertEquals("Failure in prefix symbol for centi.", UnitPrefix.CENTI.getPrefixSymbol(), "c");
        Assert.assertTrue("Failure in prefix factor for centi.", UnitPrefix.CENTI.getPrefixFactor() == 0.01);
        Assert.assertEquals("Failure in prefix name for milli.", UnitPrefix.MILLI.getPrefixName(), "milli");
        Assert.assertEquals("Failure in prefix symbol for milli.", UnitPrefix.MILLI.getPrefixSymbol(), "m");
        Assert.assertTrue("Failure in prefix factor for milli.", UnitPrefix.MILLI.getPrefixFactor() == 0.001);
        Assert.assertEquals("Failure in prefix name for micro.", UnitPrefix.MICRO.getPrefixName(), "micro");
        Assert.assertEquals("Failure in prefix symbol for micro.", UnitPrefix.MICRO.getPrefixSymbol(), "μ");
        Assert.assertTrue("Failure in prefix factor for micro.", UnitPrefix.MICRO.getPrefixFactor() == 1e-6);
        Assert.assertEquals("Failure in prefix name for nano.", UnitPrefix.NANO.getPrefixName(), "nano");
        Assert.assertEquals("Failure in prefix symbol for nano.", UnitPrefix.NANO.getPrefixSymbol(), "n");
        Assert.assertTrue("Failure in prefix factor for nano.", UnitPrefix.NANO.getPrefixFactor() == 1e-9);
        Assert.assertEquals("Failure in prefix name for pico.", UnitPrefix.PICO.getPrefixName(), "pico");
        Assert.assertEquals("Failure in prefix symbol for pico.", UnitPrefix.PICO.getPrefixSymbol(), "p");
        Assert.assertTrue("Failure in prefix factor for pico.", UnitPrefix.PICO.getPrefixFactor() == 1e-12);
    }
}
