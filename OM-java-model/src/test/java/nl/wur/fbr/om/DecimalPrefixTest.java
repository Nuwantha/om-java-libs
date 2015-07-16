package nl.wur.fbr.om;

import nl.wur.fbr.om.prefixes.DecimalPrefix;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for prefixes.
 * @author Don Willems on 15/07/15.
 */
public class DecimalPrefixTest {

    /**
     * Unit test to test correct implementation of prefixes.
     */
    @Test
    public void testUnitPrefixes() {
        Assert.assertEquals("Failure in prefix name for tera.", DecimalPrefix.TERA.getPrefixName(), "tera");
        Assert.assertEquals("Failure in prefix symbol for tera.", DecimalPrefix.TERA.getPrefixSymbol(), "T");
        Assert.assertTrue("Failure in prefix factor for tera.", DecimalPrefix.TERA.getPrefixFactor() == 1e12);
        Assert.assertEquals("Failure in prefix name for giga.", DecimalPrefix.GIGA.getPrefixName(), "giga");
        Assert.assertEquals("Failure in prefix symbol for giga.", DecimalPrefix.GIGA.getPrefixSymbol(), "G");
        Assert.assertTrue("Failure in prefix factor for giga.", DecimalPrefix.GIGA.getPrefixFactor() == 1e9);
        Assert.assertEquals("Failure in prefix name for mega.", DecimalPrefix.MEGA.getPrefixName(), "mega");
        Assert.assertEquals("Failure in prefix symbol for mega.", DecimalPrefix.MEGA.getPrefixSymbol(), "M");
        Assert.assertTrue("Failure in prefix factor for mega.", DecimalPrefix.MEGA.getPrefixFactor() == 1e6);
        Assert.assertEquals("Failure in prefix name for kilo.", DecimalPrefix.KILO.getPrefixName(), "kilo");
        Assert.assertEquals("Failure in prefix symbol for kilo.", DecimalPrefix.KILO.getPrefixSymbol(), "k");
        Assert.assertTrue("Failure in prefix factor for kilo.", DecimalPrefix.KILO.getPrefixFactor() == 1000);
        Assert.assertEquals("Failure in prefix name for hecto.", DecimalPrefix.HECTO.getPrefixName(), "hecto");
        Assert.assertEquals("Failure in prefix symbol for hecto.", DecimalPrefix.HECTO.getPrefixSymbol(), "h");
        Assert.assertTrue("Failure in prefix factor for hecto.", DecimalPrefix.HECTO.getPrefixFactor() == 100);
        Assert.assertEquals("Failure in prefix name for deca.", DecimalPrefix.DECA.getPrefixName(), "deca");
        Assert.assertEquals("Failure in prefix symbol for deca.", DecimalPrefix.DECA.getPrefixSymbol(), "da");
        Assert.assertTrue("Failure in prefix factor for deca.", DecimalPrefix.DECA.getPrefixFactor() == 10);
        Assert.assertEquals("Failure in prefix name for deci.", DecimalPrefix.DECI.getPrefixName(), "deci");
        Assert.assertEquals("Failure in prefix symbol for deci.", DecimalPrefix.DECI.getPrefixSymbol(), "d");
        Assert.assertTrue("Failure in prefix factor for deci.", DecimalPrefix.DECI.getPrefixFactor() == 0.1);
        Assert.assertEquals("Failure in prefix name for centi.", DecimalPrefix.CENTI.getPrefixName(), "centi");
        Assert.assertEquals("Failure in prefix symbol for centi.", DecimalPrefix.CENTI.getPrefixSymbol(), "c");
        Assert.assertTrue("Failure in prefix factor for centi.", DecimalPrefix.CENTI.getPrefixFactor() == 0.01);
        Assert.assertEquals("Failure in prefix name for milli.", DecimalPrefix.MILLI.getPrefixName(), "milli");
        Assert.assertEquals("Failure in prefix symbol for milli.", DecimalPrefix.MILLI.getPrefixSymbol(), "m");
        Assert.assertTrue("Failure in prefix factor for milli.", DecimalPrefix.MILLI.getPrefixFactor() == 0.001);
        Assert.assertEquals("Failure in prefix name for micro.", DecimalPrefix.MICRO.getPrefixName(), "micro");
        Assert.assertEquals("Failure in prefix symbol for micro.", DecimalPrefix.MICRO.getPrefixSymbol(), "μ");
        Assert.assertTrue("Failure in prefix factor for micro.", DecimalPrefix.MICRO.getPrefixFactor() == 1e-6);
        Assert.assertEquals("Failure in prefix name for nano.", DecimalPrefix.NANO.getPrefixName(), "nano");
        Assert.assertEquals("Failure in prefix symbol for nano.", DecimalPrefix.NANO.getPrefixSymbol(), "n");
        Assert.assertTrue("Failure in prefix factor for nano.", DecimalPrefix.NANO.getPrefixFactor() == 1e-9);
        Assert.assertEquals("Failure in prefix name for pico.", DecimalPrefix.PICO.getPrefixName(), "pico");
        Assert.assertEquals("Failure in prefix symbol for pico.", DecimalPrefix.PICO.getPrefixSymbol(), "p");
        Assert.assertTrue("Failure in prefix factor for pico.", DecimalPrefix.PICO.getPrefixFactor() == 1e-12);
    }
}
