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
        Assert.assertEquals("Failure in prefix name for tera.", DecimalPrefix.TERA.getName(), "tera");
        Assert.assertEquals("Failure in prefix symbol for tera.", DecimalPrefix.TERA.getSymbol(), "T");
        Assert.assertTrue("Failure in prefix factor for tera.", DecimalPrefix.TERA.getFactor() == 1e12);
        Assert.assertEquals("Failure in prefix name for giga.", DecimalPrefix.GIGA.getName(), "giga");
        Assert.assertEquals("Failure in prefix symbol for giga.", DecimalPrefix.GIGA.getSymbol(), "G");
        Assert.assertTrue("Failure in prefix factor for giga.", DecimalPrefix.GIGA.getFactor() == 1e9);
        Assert.assertEquals("Failure in prefix name for mega.", DecimalPrefix.MEGA.getName(), "mega");
        Assert.assertEquals("Failure in prefix symbol for mega.", DecimalPrefix.MEGA.getSymbol(), "M");
        Assert.assertTrue("Failure in prefix factor for mega.", DecimalPrefix.MEGA.getFactor() == 1e6);
        Assert.assertEquals("Failure in prefix name for kilo.", DecimalPrefix.KILO.getName(), "kilo");
        Assert.assertEquals("Failure in prefix symbol for kilo.", DecimalPrefix.KILO.getSymbol(), "k");
        Assert.assertTrue("Failure in prefix factor for kilo.", DecimalPrefix.KILO.getFactor() == 1000);
        Assert.assertEquals("Failure in prefix name for hecto.", DecimalPrefix.HECTO.getName(), "hecto");
        Assert.assertEquals("Failure in prefix symbol for hecto.", DecimalPrefix.HECTO.getSymbol(), "h");
        Assert.assertTrue("Failure in prefix factor for hecto.", DecimalPrefix.HECTO.getFactor() == 100);
        Assert.assertEquals("Failure in prefix name for deca.", DecimalPrefix.DECA.getName(), "deca");
        Assert.assertEquals("Failure in prefix symbol for deca.", DecimalPrefix.DECA.getSymbol(), "da");
        Assert.assertTrue("Failure in prefix factor for deca.", DecimalPrefix.DECA.getFactor() == 10);
        Assert.assertEquals("Failure in prefix name for deci.", DecimalPrefix.DECI.getName(), "deci");
        Assert.assertEquals("Failure in prefix symbol for deci.", DecimalPrefix.DECI.getSymbol(), "d");
        Assert.assertTrue("Failure in prefix factor for deci.", DecimalPrefix.DECI.getFactor() == 0.1);
        Assert.assertEquals("Failure in prefix name for centi.", DecimalPrefix.CENTI.getName(), "centi");
        Assert.assertEquals("Failure in prefix symbol for centi.", DecimalPrefix.CENTI.getSymbol(), "c");
        Assert.assertTrue("Failure in prefix factor for centi.", DecimalPrefix.CENTI.getFactor() == 0.01);
        Assert.assertEquals("Failure in prefix name for milli.", DecimalPrefix.MILLI.getName(), "milli");
        Assert.assertEquals("Failure in prefix symbol for milli.", DecimalPrefix.MILLI.getSymbol(), "m");
        Assert.assertTrue("Failure in prefix factor for milli.", DecimalPrefix.MILLI.getFactor() == 0.001);
        Assert.assertEquals("Failure in prefix name for micro.", DecimalPrefix.MICRO.getName(), "micro");
        Assert.assertEquals("Failure in prefix symbol for micro.", DecimalPrefix.MICRO.getSymbol(), "μ");
        Assert.assertTrue("Failure in prefix factor for micro.", DecimalPrefix.MICRO.getFactor() == 1e-6);
        Assert.assertEquals("Failure in prefix name for nano.", DecimalPrefix.NANO.getName(), "nano");
        Assert.assertEquals("Failure in prefix symbol for nano.", DecimalPrefix.NANO.getSymbol(), "n");
        Assert.assertTrue("Failure in prefix factor for nano.", DecimalPrefix.NANO.getFactor() == 1e-9);
        Assert.assertEquals("Failure in prefix name for pico.", DecimalPrefix.PICO.getName(), "pico");
        Assert.assertEquals("Failure in prefix symbol for pico.", DecimalPrefix.PICO.getSymbol(), "p");
        Assert.assertTrue("Failure in prefix factor for pico.", DecimalPrefix.PICO.getFactor() == 1e-12);
    }
}
