package nl.wur.fbr.om.core;

import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.dimensions.DimensionMap;
import nl.wur.fbr.om.model.dimensions.SIDimension;
import nl.wur.fbr.om.model.units.*;
import nl.wur.fbr.om.prefixes.DecimalPrefix;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class contains the unit tests for dimension testing.
 * @author Don Willems on 02/08/15.
 */
public class DimensionTest {

    /**
     * Tests a compound unit for its dimensions
     */
    @Test
    public void testCompoundUnitDimension(){UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
        SingularUnit metre = factory.createBaseUnit("metre", "m", SIDimension.LENGTH);
        SingularUnit second = factory.createBaseUnit("second", "s",SIDimension.TIME);
        Unit metrePerSecondSquared = factory.createUnitDivision("metre per second squared", "m/s^2", metre, factory.createUnitExponentiation(second, 2));
        Unit gram = factory.createBaseUnit("gram", "g", SIDimension.MASS);
        Unit kilogram = factory.createPrefixedUnit("kilogram", "kg", (SingularUnit) gram, DecimalPrefix.KILO);
        Unit newton = factory.createUnitMultiplication("Newton", "N", kilogram, metrePerSecondSquared);
        UnitMultiplication newtonmetre = factory.createUnitMultiplication("Newton metre", "N.m", newton, metre);
        SingularUnit pascal = factory.createSingularUnit("Pascal", "Pa", newtonmetre);
        PrefixedUnit millisecond = factory.createPrefixedUnit("millisecond", second, DecimalPrefix.MILLI);
        UnitExponentiation millisecondSquared = factory.createUnitExponentiation("millisecond squared", "ms^2", millisecond, 2);
        UnitDivision pascalPerMillisecondSquared = factory.createUnitDivision("Pascal per second squared", "Pa/ms^2", pascal, millisecondSquared);

        DimensionMap metreMap = metre.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",1,metreMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,metreMap.getDimensionalExponent(SIDimension.LENGTH));
        DimensionMap secondMap = second.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",1,secondMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test", 1, secondMap.getDimensionalExponent(SIDimension.TIME));
        DimensionMap metrePerSecondSquaredMap = metrePerSecondSquared.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",2,metrePerSecondSquaredMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,metrePerSecondSquaredMap.getDimensionalExponent(SIDimension.LENGTH));
        Assert.assertEquals("Compound unit dimension test",-2,metrePerSecondSquaredMap.getDimensionalExponent(SIDimension.TIME));
        DimensionMap gramMap = gram.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",1,gramMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,gramMap.getDimensionalExponent(SIDimension.MASS));
        DimensionMap kilogramMap = kilogram.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",1,kilogramMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,kilogramMap.getDimensionalExponent(SIDimension.MASS));
        DimensionMap newtonMap = newton.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",3,newtonMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,newtonMap.getDimensionalExponent(SIDimension.MASS));
        Assert.assertEquals("Compound unit dimension test",1,newtonMap.getDimensionalExponent(SIDimension.LENGTH));
        Assert.assertEquals("Compound unit dimension test",-2,newtonMap.getDimensionalExponent(SIDimension.TIME));
        DimensionMap newtonMetreMap = newtonmetre.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",3,newtonMetreMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,newtonMetreMap.getDimensionalExponent(SIDimension.MASS));
        Assert.assertEquals("Compound unit dimension test",2,newtonMetreMap.getDimensionalExponent(SIDimension.LENGTH));
        Assert.assertEquals("Compound unit dimension test",-2,newtonMetreMap.getDimensionalExponent(SIDimension.TIME));
        DimensionMap pascalMap = pascal.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",3,pascalMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,pascalMap.getDimensionalExponent(SIDimension.MASS));
        Assert.assertEquals("Compound unit dimension test",2,pascalMap.getDimensionalExponent(SIDimension.LENGTH));
        Assert.assertEquals("Compound unit dimension test",-2,pascalMap.getDimensionalExponent(SIDimension.TIME));
        DimensionMap millisecondMap = millisecond.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",1,millisecondMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1, millisecondMap.getDimensionalExponent(SIDimension.TIME));
        DimensionMap millisecondSquaredMap = millisecondSquared.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",1,millisecondSquaredMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",2, millisecondSquaredMap.getDimensionalExponent(SIDimension.TIME));
        DimensionMap pascalPerMillisecondSquaredMap = pascalPerMillisecondSquared.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",3,pascalPerMillisecondSquaredMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,pascalPerMillisecondSquaredMap.getDimensionalExponent(SIDimension.MASS));
        Assert.assertEquals("Compound unit dimension test",2,pascalPerMillisecondSquaredMap.getDimensionalExponent(SIDimension.LENGTH));
        Assert.assertEquals("Compound unit dimension test",-4,pascalPerMillisecondSquaredMap.getDimensionalExponent(SIDimension.TIME));
    }
}
