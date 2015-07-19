package nl.wur.fbr.om.core;

import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.core.impl.SingularUnitImpl;
import nl.wur.fbr.om.core.impl.UnitImpl;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.factory.UnitOrScaleCreationException;
import nl.wur.fbr.om.model.*;
import nl.wur.fbr.om.prefixes.DecimalPrefix;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for testing unit creation and properties.
 *
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
        Assert.assertEquals("Test singular unit creation.",metre.getName(),"metre");
        Assert.assertEquals("Test singular unit creation.",metre.getSymbol(),"m");
        Assert.assertEquals("Test singular unit creation.",metre.getDefinitionUnit(),null);
        Assert.assertTrue("Test singular unit creation.",metre.getDefinitionNumericalValue()==1.0);
        SingularUnit au = factory.createSingularUnit("astronomical unit", "AU", metre, 1.495978707e11);
        Assert.assertEquals("Test singular unit creation.",au.getName(),"astronomical unit");
        Assert.assertEquals("Test singular unit creation.",au.getSymbol(),"AU");
        Assert.assertEquals("Test singular unit creation.",au.getDefinitionUnit(),metre);
        Assert.assertTrue("Test singular unit creation.", au.getDefinitionNumericalValue() == 1.495978707e11);
        try {
            SingularUnit au2 = (SingularUnit)factory.getUnitOrScale(au.getIdentifier());
            Assert.assertEquals("Testing factory unit get and equals test",au,au2);
            Assert.assertEquals("Test singular unit creation.",au2.getName(),"astronomical unit");
            Assert.assertEquals("Test singular unit creation.",au2.getSymbol(),"AU");
            Assert.assertEquals("Test singular unit creation.",au2.getDefinitionUnit(),metre);
            Assert.assertTrue("Test singular unit creation.", au2.getDefinitionNumericalValue() == 1.495978707e11);
        } catch (Exception e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. "+e);
        }
        try {
            SingularUnit test = (SingularUnit)factory.getUnitOrScale("some nonsense id");
            Assert.fail("Exception should have been thrown.");
        } catch (UnitOrScaleCreationException e) {
            Assert.assertTrue("Expected exception thrown: "+e,true);
        }
    }

    @Test
    public void testUnitMultipleCreation() {
        UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
        SingularUnit metre = factory.createBaseUnit("metre","m");
        UnitMultiple kilometre = factory.createUnitMultiple("kilometre", metre, DecimalPrefix.KILO);
        Assert.assertEquals("Test unit multiple creation.", kilometre.getName(), "kilometre");
        Assert.assertEquals("Test unit multiple creation.", kilometre.getSymbol(), "km");
        Assert.assertEquals("Test unit multiple creation.", kilometre.getSingularUnit(), metre);
        Assert.assertEquals("Test unit multiple creation.", kilometre.getPrefix(), DecimalPrefix.KILO);
        Assert.assertTrue("Test unit multiple creation.", kilometre.getPrefixFactor() == 1000.0);
        UnitMultiple nanometre = factory.createUnitMultiple("nanometre", "nm", metre, 1e-9);
        Assert.assertEquals("Test unit multiple creation.", nanometre.getName(), "nanometre");
        Assert.assertEquals("Test unit multiple creation.", nanometre.getSymbol(), "nm");
        Assert.assertEquals("Test unit multiple creation.", nanometre.getSingularUnit(), metre);
        Assert.assertEquals("Test unit multiple creation.", nanometre.getPrefix(), DecimalPrefix.NANO);
        Assert.assertTrue("Test unit multiple creation.", nanometre.getPrefixFactor() == 0.000000001);
        try {
            UnitMultiple nanometre2 = (UnitMultiple)factory.getUnitOrScale(nanometre.getIdentifier());
            Assert.assertEquals("Testing factory unit get and equals test",nanometre,nanometre2);
            Assert.assertEquals("Test unit multiple creation.", nanometre2.getName(), "nanometre");
            Assert.assertEquals("Test unit multiple creation.", nanometre2.getSymbol(), "nm");
            Assert.assertEquals("Test unit multiple creation.", nanometre2.getSingularUnit(), metre);
            Assert.assertEquals("Test unit multiple creation.", nanometre2.getPrefix(), DecimalPrefix.NANO);
            Assert.assertTrue("Test unit multiple creation.", nanometre2.getPrefixFactor() == 0.000000001);
        } catch (Exception e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        }
    }

    @Test
    public void testUnitDivisionCreation(){
        UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
        SingularUnit metre = factory.createBaseUnit("metre","m");
        SingularUnit second = factory.createBaseUnit("second","s");
        UnitDivision metrePerSecond = factory.createUnitDivision("metre per second", "m/s", metre, second);
        Assert.assertEquals("Test unit division creation.", metrePerSecond.getName(), "metre per second");
        Assert.assertEquals("Test unit division creation.", metrePerSecond.getSymbol(), "m/s");
        Assert.assertEquals("Test unit division creation.", metrePerSecond.getNumerator(), metre);
        Assert.assertEquals("Test unit division creation.", metrePerSecond.getDenominator(), second);
        UnitMultiple kilometre = factory.createUnitMultiple("kilometre",metre, DecimalPrefix.KILO);
        UnitDivision kilometrePerSecond = factory.createUnitDivision("kilometre per second", "km/s", kilometre, second);
        Assert.assertEquals("Test unit division creation.", kilometrePerSecond.getName(), "kilometre per second");
        Assert.assertEquals("Test unit division creation.", kilometrePerSecond.getSymbol(), "km/s");
        Assert.assertEquals("Test unit division creation.", kilometrePerSecond.getNumerator(), kilometre);
        Assert.assertEquals("Test unit division creation.", kilometrePerSecond.getDenominator(), second);
        try {
            UnitDivision kilometrePerSecond2 = (UnitDivision)factory.getUnitOrScale(kilometrePerSecond.getIdentifier());
            Assert.assertEquals("Testing factory unit get and equals test",kilometrePerSecond,kilometrePerSecond2);
            Assert.assertEquals("Test unit division creation.", kilometrePerSecond2.getName(), "kilometre per second");
            Assert.assertEquals("Test unit division creation.", kilometrePerSecond2.getSymbol(), "km/s");
            Assert.assertEquals("Test unit division creation.", kilometrePerSecond2.getNumerator(), kilometre);
            Assert.assertEquals("Test unit division creation.", kilometrePerSecond2.getDenominator(), second);
        } catch (Exception e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        }
    }

    @Test
    public void testUnitExponentiation(){
        UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
        SingularUnit metre = factory.createBaseUnit("metre", "m");
        UnitExponentiation cubicMetre = factory.createUnitExponentiation("cubic metre", "m^3", metre, 3);
        Assert.assertEquals("Test unit exponentiation creation.", cubicMetre.getName(), "cubic metre");
        Assert.assertEquals("Test unit exponentiation creation.", cubicMetre.getSymbol(), "m^3");
        Assert.assertEquals("Test unit exponentiation creation.", cubicMetre.getBaseUnit(), metre);
        Assert.assertTrue("Test unit exponentiation creation.", cubicMetre.getExponent() == 3);
        try {
            UnitExponentiation cubicMetre2 = (UnitExponentiation)factory.getUnitOrScale(cubicMetre.getIdentifier());
            Assert.assertEquals("Testing factory unit get and equals test",cubicMetre,cubicMetre2);
            Assert.assertEquals("Test unit exponentiation creation.", cubicMetre2.getName(), "cubic metre");
            Assert.assertEquals("Test unit exponentiation creation.", cubicMetre2.getSymbol(), "m^3");
            Assert.assertEquals("Test unit exponentiation creation.", cubicMetre2.getBaseUnit(), metre);
            Assert.assertTrue("Test unit exponentiation creation.", cubicMetre2.getExponent() == 3);
        } catch (Exception e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. "+e);
        }
    }

    @Test
    public void testUnitMultiplicationCreation(){
        UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
        SingularUnit newton = factory.createBaseUnit("Newton","N");
        SingularUnit metre = factory.createBaseUnit("metre","m");
        UnitExponentiation cubicMetre = factory.createUnitExponentiation("cubic metre", "m^3", metre, 3);
        UnitMultiplication newtonCubicMetre = factory.createUnitMultiplication("Newton cubic metre", "N.m^2", newton, cubicMetre);
        Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre.getName(), "Newton cubic metre");
        Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre.getSymbol(), "N.m^2");
        Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre.getUnit1(), newton);
        Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre.getUnit2(), cubicMetre);
        try {
            UnitMultiplication newtonCubicMetre2 = (UnitMultiplication)factory.getUnitOrScale(newtonCubicMetre.getIdentifier());
            Assert.assertEquals("Testing factory unit get and equals test",newtonCubicMetre2,newtonCubicMetre);
            Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre2.getName(), "Newton cubic metre");
            Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre2.getSymbol(), "N.m^2");
            Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre2.getUnit1(), newton);
            Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre2.getUnit2(), cubicMetre);
        } catch (Exception e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. "+e);
        }
    }
}
