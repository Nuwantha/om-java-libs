package nl.wur.fbr.om.core;

import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.units.*;
import nl.wur.fbr.om.prefixes.DecimalPrefix;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class contains the unit tests for dimension testing.
 *
 * @author Don Willems on 02/08/15.
 */
public class DimensionTest {

    /**
     * Tests a compound unit for its dimensions
     */
    @Test
    public void testCompoundUnitDimension(){UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
        Unit metre = factory.createBaseUnit("metre", "m", SIBaseDimension.LENGTH);
        Unit second = factory.createBaseUnit("second", "s",SIBaseDimension.TIME);
        Unit metrePerSecondSquared = factory.createUnitDivision("metre per second squared", "m/s^2", metre, factory.createUnitExponentiation(second, 2));
        Unit gram = factory.createBaseUnit("gram", "g", SIBaseDimension.MASS);
        Unit kilogram = factory.createPrefixedUnit("kilogram", "kg", (SingularUnit) gram, DecimalPrefix.KILO);
        Unit newton = factory.createUnitMultiplication("Newton", "N", kilogram, metrePerSecondSquared);
        UnitMultiplication newtonmetre = factory.createUnitMultiplication("Newton metre", "N.m", newton, metre);
        SingularUnit pascal = factory.createSingularUnit("Pascal", "Pa", newtonmetre);
        PrefixedUnit millisecond = factory.createPrefixedUnit("millisecond", (SingularUnit)second, DecimalPrefix.MILLI);
        UnitExponentiation millisecondSquared = factory.createUnitExponentiation("millisecond squared", "ms^2", millisecond, 2);
        UnitDivision pascalPerMillisecondSquared = factory.createUnitDivision("Pascal per second squared", "Pa/ms^2", pascal, millisecondSquared);

        Dimension metreMap = metre.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",1,metreMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,metreMap.getDimensionalExponent(SIBaseDimension.LENGTH),0.0000001);
        Dimension secondMap = second.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",1,secondMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test", 1, secondMap.getDimensionalExponent(SIBaseDimension.TIME),0.0000001);
        Dimension metrePerSecondSquaredMap = metrePerSecondSquared.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",2,metrePerSecondSquaredMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,metrePerSecondSquaredMap.getDimensionalExponent(SIBaseDimension.LENGTH),0.0000001);
        Assert.assertEquals("Compound unit dimension test",-2,metrePerSecondSquaredMap.getDimensionalExponent(SIBaseDimension.TIME),0.0000001);
        Dimension gramMap = gram.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",1,gramMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,gramMap.getDimensionalExponent(SIBaseDimension.MASS),0.0000001);
        Dimension kilogramMap = kilogram.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",1,kilogramMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,kilogramMap.getDimensionalExponent(SIBaseDimension.MASS),0.0000001);
        Dimension newtonMap = newton.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",3,newtonMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,newtonMap.getDimensionalExponent(SIBaseDimension.MASS),0.0000001);
        Assert.assertEquals("Compound unit dimension test",1,newtonMap.getDimensionalExponent(SIBaseDimension.LENGTH),0.0000001);
        Assert.assertEquals("Compound unit dimension test",-2,newtonMap.getDimensionalExponent(SIBaseDimension.TIME),0.0000001);
        Dimension newtonMetreMap = newtonmetre.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",3,newtonMetreMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,newtonMetreMap.getDimensionalExponent(SIBaseDimension.MASS),0.0000001);
        Assert.assertEquals("Compound unit dimension test",2,newtonMetreMap.getDimensionalExponent(SIBaseDimension.LENGTH),0.0000001);
        Assert.assertEquals("Compound unit dimension test",-2,newtonMetreMap.getDimensionalExponent(SIBaseDimension.TIME),0.0000001);
        Dimension pascalMap = pascal.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",3,pascalMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,pascalMap.getDimensionalExponent(SIBaseDimension.MASS),0.0000001);
        Assert.assertEquals("Compound unit dimension test",2,pascalMap.getDimensionalExponent(SIBaseDimension.LENGTH),0.0000001);
        Assert.assertEquals("Compound unit dimension test",-2,pascalMap.getDimensionalExponent(SIBaseDimension.TIME),0.0000001);
        Dimension millisecondMap = millisecond.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",1,millisecondMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1, millisecondMap.getDimensionalExponent(SIBaseDimension.TIME),0.0000001);
        Dimension millisecondSquaredMap = millisecondSquared.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",1,millisecondSquaredMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",2, millisecondSquaredMap.getDimensionalExponent(SIBaseDimension.TIME),0.0000001);
        Dimension pascalPerMillisecondSquaredMap = pascalPerMillisecondSquared.getUnitDimension();
        Assert.assertEquals("Compound unit dimension test",3,pascalPerMillisecondSquaredMap.getDimensions().size());
        Assert.assertEquals("Compound unit dimension test",1,pascalPerMillisecondSquaredMap.getDimensionalExponent(SIBaseDimension.MASS),0.0000001);
        Assert.assertEquals("Compound unit dimension test",2,pascalPerMillisecondSquaredMap.getDimensionalExponent(SIBaseDimension.LENGTH),0.0000001);
        Assert.assertEquals("Compound unit dimension test",-4,pascalPerMillisecondSquaredMap.getDimensionalExponent(SIBaseDimension.TIME),0.0000001);
    }
}
