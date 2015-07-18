package nl.wur.fbr.om;

import nl.wur.fbr.om.prefixes.DecimalPrefix;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for prefixes.
 * @author Don Willems on 15/07/15.
 */
public class PrefixTest {

    /**
     * Unit test to test correct implementation of prefixes.
     */
    @Test
    public void testUnitPrefixes() {
        Assert.assertEquals("Failure in prefix name for yotta.", DecimalPrefix.YOTTA.getName(), "yotta");
        Assert.assertEquals("Failure in prefix symbol for yotta.", DecimalPrefix.YOTTA.getSymbol(), "Y");
        Assert.assertTrue("Failure in prefix factor for yotta.", DecimalPrefix.YOTTA.getFactor() == 1e24);
        Assert.assertEquals("Failure in prefix name for zetta.", DecimalPrefix.ZETTA.getName(), "zetta");
        Assert.assertEquals("Failure in prefix symbol for zetta.", DecimalPrefix.ZETTA.getSymbol(), "Z");
        Assert.assertTrue("Failure in prefix factor for zetta.", DecimalPrefix.ZETTA.getFactor() == 1e21);
        Assert.assertEquals("Failure in prefix name for exa.", DecimalPrefix.EXA.getName(), "exa");
        Assert.assertEquals("Failure in prefix symbol for exa.", DecimalPrefix.EXA.getSymbol(), "E");
        Assert.assertTrue("Failure in prefix factor for exa.", DecimalPrefix.EXA.getFactor() == 1e18);
        Assert.assertEquals("Failure in prefix name for peta.", DecimalPrefix.PETA.getName(), "peta");
        Assert.assertEquals("Failure in prefix symbol for peta.", DecimalPrefix.PETA.getSymbol(), "P");
        Assert.assertTrue("Failure in prefix factor for peta.", DecimalPrefix.PETA.getFactor() == 1e15);
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
        Assert.assertEquals("Failure in prefix name for femto.", DecimalPrefix.FEMTO.getName(), "femto");
        Assert.assertEquals("Failure in prefix symbol for femto.", DecimalPrefix.FEMTO.getSymbol(), "f");
        Assert.assertTrue("Failure in prefix factor for femto.", DecimalPrefix.FEMTO.getFactor() == 1e-15);
        Assert.assertEquals("Failure in prefix name for atto.", DecimalPrefix.ATTO.getName(), "atto");
        Assert.assertEquals("Failure in prefix symbol for atto.", DecimalPrefix.ATTO.getSymbol(), "a");
        Assert.assertTrue("Failure in prefix factor for atto.", DecimalPrefix.ATTO.getFactor() == 1e-18);
        Assert.assertEquals("Failure in prefix name for zepto.", DecimalPrefix.ZEPTO.getName(), "zepto");
        Assert.assertEquals("Failure in prefix symbol for zepto.", DecimalPrefix.ZEPTO.getSymbol(), "z");
        Assert.assertTrue("Failure in prefix factor for zepto.", DecimalPrefix.ZEPTO.getFactor() == 1e-21);
        Assert.assertEquals("Failure in prefix name for yocta.", DecimalPrefix.YOCTA.getName(), "yocta");
        Assert.assertEquals("Failure in prefix symbol for yocta.", DecimalPrefix.YOCTA.getSymbol(), "y");
        Assert.assertTrue("Failure in prefix factor for yocta.", DecimalPrefix.YOCTA.getFactor() == 1e-24);
    }
}
