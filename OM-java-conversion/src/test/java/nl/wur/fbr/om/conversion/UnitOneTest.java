package nl.wur.fbr.om.conversion;

import nl.wur.fbr.om.core.set.CoreSet;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.model.units.Unit;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Don Willems on 14/08/15.
 */
public class UnitOneTest {

    @Test
    public void testOne() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Unit metrePerMetre = factory.createUnitDivision(CoreSet.METRE,CoreSet.METRE);
        Assert.assertTrue("Testing m/m to be equal to one.", factory.unitIsEqualToOne(metrePerMetre));
        Unit kilometrePerMetre = factory.createUnitDivision(CoreSet.KILOMETRE,CoreSet.METRE);
        Assert.assertFalse("Testing km/m to be equal to one.", factory.unitIsEqualToOne(kilometrePerMetre));
        Unit kilometrePerKilometre = factory.createUnitDivision(CoreSet.KILOMETRE,CoreSet.KILOMETRE);
        Assert.assertTrue("Testing km/km to be equal to one.", factory.unitIsEqualToOne(kilometrePerKilometre));
        Assert.assertTrue("Testing 1 to be equal to one.", factory.unitIsEqualToOne(CoreSet.ONE));
        Assert.assertTrue("Testing rad to be equal to one.", factory.unitIsEqualToOne(CoreSet.RADIAN));
        Assert.assertFalse("Testing degree C to be equal to one.", factory.unitIsEqualToOne(CoreSet.CELSIUS));
        Unit newtonMetre = factory.createUnitMultiplication(CoreSet.NEWTON,CoreSet.METRE);
        Unit newtonPerNewtonMetre = factory.createUnitDivision(CoreSet.NEWTON, newtonMetre);
        Assert.assertFalse("Testing N/M.m to be equal to one.", factory.unitIsEqualToOne(newtonPerNewtonMetre));
        Unit metreNewtonPerNewtonMetre = factory.createUnitMultiplication(CoreSet.METRE,newtonPerNewtonMetre);
        Assert.assertTrue("Testing m.N/M.m to be equal to one.", factory.unitIsEqualToOne(metreNewtonPerNewtonMetre));
    }
}
