package nl.wur.fbr.om;

import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.dimensions.SIDimension;
import nl.wur.fbr.om.model.units.BaseUnit;
import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.units.UnitMultiple;
import nl.wur.fbr.om.om18.set.OMUnitAndScaleFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the OM set of units.
 *
 * @author Don Willems on 03/08/15.
 */
public class UnitOMSetTest {

    /**
     * This method tests the creation of base units in OM.
     */
    @Test
    public void testOMBaseUnits(){
        try {
            UnitAndScaleFactory factory = new OMUnitAndScaleFactory();
            Unit metre = (Unit) factory.getUnitOrScale("metre");
            Assert.assertEquals("Testing OM Base Unit creation", SIDimension.LENGTH,((BaseUnit)metre).getDefinitionDimension());
            Assert.assertEquals("Testing OM Base Unit creation", "metre",metre.getName());
            Assert.assertEquals("Testing OM Base Unit creation", "m",metre.getSymbol());
            Unit second = (Unit) factory.getUnitOrScale("second-time");
            Assert.assertEquals("Testing OM Base Unit creation", SIDimension.TIME,((BaseUnit)second).getDefinitionDimension());
            Unit candela = (Unit) factory.getUnitOrScale("candela");
            Assert.assertEquals("Testing OM Base Unit creation", SIDimension.LUMINOUS_INTENSITY, ((BaseUnit) candela).getDefinitionDimension());
            Assert.assertNotEquals("Testing OM Base Unit creation", SIDimension.LENGTH, ((BaseUnit) candela).getDefinitionDimension());
            Assert.assertNotEquals("Testing OM Base Unit creation", SIDimension.ELECTRIC_CURRENT,((BaseUnit)candela).getDefinitionDimension());
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not create OMUnitAndScaleFactory.");
        }
    }

    /**
     * This method tests the creation of singular units in OM.
     */
    @Test
    public void testOMSingularUnits(){
        try {
            UnitAndScaleFactory factory = new OMUnitAndScaleFactory();
            Unit au = (Unit) factory.getUnitOrScale("astronomical_unit");
            Assert.assertEquals("Testing OM Singular Unit creation", "astronomical unit", au.getName());
            Assert.assertEquals("Testing OM Singular Unit creation", "au", au.getSymbol());
            Assert.assertEquals("Testing OM Singular Unit creation", 1.495978707e11, ((SingularUnit) au).getDefinitionNumericalValue(), 100);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not create OMUnitAndScaleFactory.");
        }
    }

    /**
     * This method tests the creation of unit multiples in OM.
     */
    @Test
    public void testOMUnitMultiples(){
        try {
            UnitAndScaleFactory factory = new OMUnitAndScaleFactory();
            Unit kilometre = (Unit) factory.getUnitOrScale("kilometre");
            Assert.assertEquals("Testing OM Singular Unit creation", "kilometre", kilometre.getName());
            Assert.assertEquals("Testing OM Singular Unit creation", "km", kilometre.getSymbol());
            Assert.assertEquals("Testing OM Singular Unit creation", 1000, ((UnitMultiple) kilometre).getFactor(), 0.0000001);

            Unit kilogram = (Unit) factory.getUnitOrScale("kilogram");
            Assert.assertEquals("Testing OM Singular Unit creation", "kilogram", kilogram.getName());
            Assert.assertEquals("Testing OM Singular Unit creation", "kg", kilogram.getSymbol());
            Assert.assertEquals("Testing OM Singular Unit creation", 1000, ((UnitMultiple) kilogram).getFactor(), 0.0000001);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not create OMUnitAndScaleFactory.");
        }
    }
}
