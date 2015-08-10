package nl.wur.fbr.om.core;

import nl.wur.fbr.om.core.factory.DefaultInstanceFactory;
import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.core.impl.units.PrefixedUnitImpl;
import nl.wur.fbr.om.core.impl.units.SingularUnitImpl;
import nl.wur.fbr.om.core.impl.units.UnitImpl;
import nl.wur.fbr.om.exceptions.ConversionException;
import nl.wur.fbr.om.exceptions.FactoryNotSetException;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.*;
import nl.wur.fbr.om.prefixes.DecimalPrefix;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for testing unit creation and properties.
 *
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
        InstanceFactory factory = new DefaultInstanceFactory();
        Unit metre = factory.createBaseUnit("metre", "m", SIBaseDimension.LENGTH);
        Assert.assertEquals("Test singular unit creation.",metre.getName(),"metre");
        Assert.assertEquals("Test singular unit creation.",metre.getSymbol(),"m");
        Assert.assertEquals("Test singular unit creation.", ((SingularUnit)metre).getDefinitionUnit(), null);
        Assert.assertTrue("Test singular unit creation.", ((SingularUnit)metre).getDefinitionNumericalValue() == 1.0);
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
            Assert.assertTrue("Expected exception thrown: " + e, true);
        }
    }

    @Test
    public void testUnitMultipleCreation() {
        InstanceFactory factory = new DefaultInstanceFactory();
        Unit metre = factory.createBaseUnit("metre", "m", SIBaseDimension.LENGTH);
        PrefixedUnit kilometre = factory.createPrefixedUnit("kilometre", (SingularUnit)metre, DecimalPrefix.KILO);
        Assert.assertEquals("Test unit multiple creation.", kilometre.getName(), "kilometre");
        Assert.assertEquals("Test unit multiple creation.", kilometre.getSymbol(), "km");
        Assert.assertEquals("Test unit multiple creation.", kilometre.getUnit(), metre);
        Assert.assertEquals("Test unit multiple creation.", kilometre.getPrefix(), DecimalPrefix.KILO);
        Assert.assertTrue("Test unit multiple creation.", kilometre.getFactor() == 1000.0);
        UnitMultiple nanometre = factory.createUnitMultiple("nanometre", metre, 1.0E-9);
        Assert.assertEquals("Test unit multiple creation.", nanometre.getName(), "nanometre");
        Assert.assertEquals("Test unit multiple creation.", nanometre.getSymbol(), "1.0E-9m");
        Assert.assertEquals("Test unit multiple creation.", nanometre.getUnit(), metre);
        Assert.assertTrue("Test unit multiple creation.", nanometre.getFactor() == 0.000000001);
        try {
            UnitMultiple nanometre2 = (UnitMultiple)factory.getUnitOrScale(nanometre.getIdentifier());
            Assert.assertEquals("Testing factory unit get and equals test",nanometre,nanometre2);
            Assert.assertEquals("Test unit multiple creation.", nanometre2.getName(), "nanometre");
            Assert.assertEquals("Test unit multiple creation.", nanometre2.getSymbol(), "1.0E-9m");
            Assert.assertEquals("Test unit multiple creation.", nanometre2.getUnit(), metre);
            Assert.assertTrue("Test unit multiple creation.", nanometre2.getFactor() == 0.000000001);
        } catch (Exception e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        }
        Unit gram = factory.createBaseUnit("gram", "g", SIBaseDimension.MASS);
        UnitMultiple u100g = factory.createUnitMultiple("100 gram",gram,100);
        Assert.assertEquals("Test unit multiple creation.", u100g.getName(), "100 gram");
        Assert.assertEquals("Test unit multiple creation.", u100g.getSymbol(), "100g");
        Assert.assertEquals("Test unit multiple creation.", u100g.getUnit(), gram);
        Assert.assertTrue("Test unit multiple creation.", u100g.getFactor() == 100);
        UnitMultiple au = factory.createUnitMultiple("astronomical unit", "AU", metre, 1.495978707e11);
        Assert.assertEquals("Test singular unit creation.",au.getName(),"astronomical unit");
        Assert.assertEquals("Test singular unit creation.",au.getSymbol(),"AU");
        Assert.assertEquals("Test singular unit creation.",au.getUnit(),metre);
        Assert.assertTrue("Test singular unit creation.", au.getFactor() == 1.495978707e11);
        try {
            UnitMultiple au2 = (UnitMultiple)factory.getUnitOrScale(au.getIdentifier());
            Assert.assertEquals("Testing factory unit get and equals test",au,au2);
            Assert.assertEquals("Test singular unit creation.",au2.getName(),"astronomical unit");
            Assert.assertEquals("Test singular unit creation.",au2.getSymbol(),"AU");
            Assert.assertEquals("Test singular unit creation.",au2.getUnit(),metre);
            Assert.assertTrue("Test singular unit creation.", au2.getFactor() == 1.495978707e11);
        } catch (Exception e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. "+e);
        }
    }

    @Test
    public void testUnitDivisionCreation(){
        InstanceFactory factory = new DefaultInstanceFactory();
        Unit metre = factory.createBaseUnit("metre", "m",SIBaseDimension.LENGTH);
        Unit second = factory.createBaseUnit("second", "s",SIBaseDimension.TIME);
        UnitDivision metrePerSecond = factory.createUnitDivision("metre per second", "m/s", metre, second);
        Assert.assertEquals("Test unit division creation.", metrePerSecond.getName(), "metre per second");
        Assert.assertEquals("Test unit division creation.", metrePerSecond.getSymbol(), "m/s");
        Assert.assertEquals("Test unit division creation.", metrePerSecond.getNumerator(), metre);
        Assert.assertEquals("Test unit division creation.", metrePerSecond.getDenominator(), second);
        PrefixedUnit kilometre = factory.createPrefixedUnit("kilometre", (SingularUnit)metre, DecimalPrefix.KILO);
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
        InstanceFactory factory = new DefaultInstanceFactory();
        Unit metre = factory.createBaseUnit("metre", "m", SIBaseDimension.LENGTH);
        UnitExponentiation cubicMetre = factory.createUnitExponentiation("cubic metre", "m^3", metre, 3);
        Assert.assertEquals("Test unit exponentiation creation.", cubicMetre.getName(), "cubic metre");
        Assert.assertEquals("Test unit exponentiation creation.", cubicMetre.getSymbol(), "m^3");
        Assert.assertEquals("Test unit exponentiation creation.", cubicMetre.getBase(), metre);
        Assert.assertTrue("Test unit exponentiation creation.", cubicMetre.getExponent() == 3);
        try {
            UnitExponentiation cubicMetre2 = (UnitExponentiation)factory.getUnitOrScale(cubicMetre.getIdentifier());
            Assert.assertEquals("Testing factory unit get and equals test",cubicMetre,cubicMetre2);
            Assert.assertEquals("Test unit exponentiation creation.", cubicMetre2.getName(), "cubic metre");
            Assert.assertEquals("Test unit exponentiation creation.", cubicMetre2.getSymbol(), "m^3");
            Assert.assertEquals("Test unit exponentiation creation.", cubicMetre2.getBase(), metre);
            Assert.assertTrue("Test unit exponentiation creation.", cubicMetre2.getExponent() == 3);
        } catch (Exception e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. "+e);
        }
    }

    @Test
    public void testUnitMultiplicationCreation(){
        InstanceFactory factory = new DefaultInstanceFactory();
        Unit metre = factory.createBaseUnit("metre", "m", SIBaseDimension.LENGTH);
        Unit second = factory.createBaseUnit("second", "s",SIBaseDimension.TIME);
        Unit metrePerSecondSquared = factory.createUnitDivision("metre per second squared", "m/s^2", metre, factory.createUnitExponentiation(second, 2));
        Unit gram = factory.createBaseUnit("gram", "g", SIBaseDimension.MASS);
        Unit kilogram = factory.createPrefixedUnit("kilogram", "kg", (SingularUnit) gram, DecimalPrefix.KILO);
        Unit newton = factory.createUnitMultiplication("Newton", "N", kilogram, metrePerSecondSquared);
        UnitExponentiation cubicMetre = factory.createUnitExponentiation("cubic metre", "m^3", metre, 3);
        UnitMultiplication newtonCubicMetre = factory.createUnitMultiplication("Newton cubic metre", "N.m^2", newton, cubicMetre);
        Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre.getName(), "Newton cubic metre");
        Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre.getSymbol(), "N.m^2");
        Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre.getTerm1(), newton);
        Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre.getTerm2(), cubicMetre);
        try {
            UnitMultiplication newtonCubicMetre2 = (UnitMultiplication)factory.getUnitOrScale(newtonCubicMetre.getIdentifier());
            Assert.assertEquals("Testing factory unit get and equals test",newtonCubicMetre2,newtonCubicMetre);
            Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre2.getName(), "Newton cubic metre");
            Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre2.getSymbol(), "N.m^2");
            Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre2.getTerm1(), newton);
            Assert.assertEquals("Test unit multiplication creation.", newtonCubicMetre2.getTerm2(), cubicMetre);
        } catch (Exception e) {
            Assert.fail("Exception thrown when getting a unit from its identifier. "+e);
        }
    }

    @Test
    public void testCompoundUnitCreation(){
        InstanceFactory factory = new DefaultInstanceFactory();
        SingularUnit metre = (SingularUnit)factory.createBaseUnit("metre", "m", SIBaseDimension.LENGTH);
        SingularUnit second = (SingularUnit)factory.createBaseUnit("second", "s",SIBaseDimension.TIME);
        Unit metrePerSecondSquared = factory.createUnitDivision("metre per second squared", "m/s^2", metre, factory.createUnitExponentiation(second, 2));
        Unit gram = factory.createSingularUnit("gram", "g");
        Unit kilogram = factory.createPrefixedBaseUnit("kilogram", "kg", SIBaseDimension.MASS, (SingularUnit) gram, DecimalPrefix.KILO);
        Unit newton = factory.createUnitMultiplication("Newton", "N", kilogram, metrePerSecondSquared);
        UnitMultiplication newtonmetre = factory.createUnitMultiplication("Newton metre", "N.m", newton, metre);
        SingularUnit pascal = factory.createSingularUnit("Pascal", "Pa", newtonmetre);
        PrefixedUnit millisecond = factory.createPrefixedUnit("millisecond", second, DecimalPrefix.MILLI);
        UnitExponentiation millisecondSquared = factory.createUnitExponentiation("millisecond squared", "ms^2", millisecond,2);
        UnitDivision pascalPerMillisecondSquared = factory.createUnitDivision("Pascal per second squared","Pa/ms^2",pascal,millisecondSquared);
        Assert.assertEquals("Test compound unit creation",pascalPerMillisecondSquared.getNumerator(),pascal);
        Assert.assertEquals("Test compound unit creation", ((SingularUnit) pascalPerMillisecondSquared.getNumerator()).getDefinitionUnit(), newtonmetre);
        Assert.assertEquals("Test compound unit creation", ((UnitMultiplication) ((SingularUnit) pascalPerMillisecondSquared.getNumerator()).getDefinitionUnit()).getTerm1(), newton);
        Assert.assertEquals("Test compound unit creation", ((UnitMultiplication) ((SingularUnit) pascalPerMillisecondSquared.getNumerator()).getDefinitionUnit()).getTerm2(), metre);
        Assert.assertEquals("Test compound unit creation",pascalPerMillisecondSquared.getDenominator(),millisecondSquared);
        Assert.assertEquals("Test compound unit creation", ((UnitExponentiation) pascalPerMillisecondSquared.getDenominator()).getBase(), millisecond);
        Assert.assertTrue("Test compound unit creation", ((UnitExponentiation) pascalPerMillisecondSquared.getDenominator()).getExponent() == 2);
        Assert.assertEquals("Test compound unit creation",((UnitMultiple)((UnitExponentiation) pascalPerMillisecondSquared.getDenominator()).getBase()).getUnit(),second);
        Assert.assertEquals("Test compound unit creation", ((PrefixedUnit) ((UnitExponentiation) pascalPerMillisecondSquared.getDenominator()).getBase()).getPrefix(), DecimalPrefix.MILLI);
    }

    @Test
    public void testScaleCreation(){
        InstanceFactory factory = new DefaultInstanceFactory();
        Unit kelvin = factory.createBaseUnit("Kelvin", "K", SIBaseDimension.THERMODYNAMIC_TEMPERATURE);
        SingularUnit celsius = factory.createSingularUnit("Celsius", "°C", kelvin);
        SingularUnit fahrenheit = factory.createSingularUnit("Fahrenheit", "°C", kelvin, 1.8);
        Scale kelvinScale = factory.createScale("Kelvin scale", null, kelvin);
        Scale celsiusScale = factory.createScale("Celsius scale", null, kelvinScale, -273.15, 1.0, celsius);
        Scale fahrenheitScale = factory.createScale("Fahrenheit scale", null, kelvinScale, -459.67, 1.8, fahrenheit);
        Assert.assertEquals("Test scale creation",fahrenheitScale.getDefinitionScale(),kelvinScale);
        Assert.assertEquals("Test scale creation",fahrenheitScale.getUnit(),fahrenheit);
        Assert.assertTrue("Test scale creation", fahrenheitScale.getOffsetFromDefinitionScale() == -459.67);
        Assert.assertTrue("Test scale creation", fahrenheitScale.getFactorFromDefinitionScale() == 1.8);
        Assert.assertEquals("Test scale creation", celsiusScale.getDefinitionScale(), kelvinScale);
        Assert.assertEquals("Test scale creation", celsiusScale.getUnit(), celsius);
        Assert.assertTrue("Test scale creation", celsiusScale.getOffsetFromDefinitionScale() == -273.15);
        Assert.assertTrue("Test scale creation", celsiusScale.getFactorFromDefinitionScale() == 1.0);
        Assert.assertNull("Test scale creation", kelvinScale.getDefinitionScale());
        Assert.assertEquals("Test scale creation", kelvinScale.getUnit(), kelvin);
        Assert.assertTrue("Test scale creation", kelvinScale.getOffsetFromDefinitionScale() == 0);
        Assert.assertTrue("Test scale creation", kelvinScale.getFactorFromDefinitionScale() == 1.0);
        Assert.assertEquals("Test scale creation", kelvinScale.getName(), "Kelvin scale");
        Assert.assertNull("Test scale creation", kelvinScale.getSymbol());
    }

    @Test
    public void testFactoryNotSetException() {
        InstanceFactory factory = new DefaultInstanceFactory();
        try{
            Unit metre = factory.createBaseUnit("metre", "m", SIBaseDimension.LENGTH);
            SingularUnit au = factory.createSingularUnit("astronomical unit", "AU", metre, 1.495978707e11);
            Measure m1 = factory.createScalarMeasure(10, au);
            Measure m2 = factory.convertToUnit(m1,metre);
            Assert.fail("FactoryNotSetException was NOT thrown as expected.");
        } catch (FactoryNotSetException e){
            Assert.assertTrue("FactoryNotSetException thrown as expected.",true);
        } catch (ConversionException e) {
            Assert.fail("FactoryNotSetException was NOT thrown as expected.");
        }
    }
}
