package nl.wur.fbr.om;

import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.*;
import nl.wur.fbr.om.om18.set.OMUnitAndScaleFactory;
import nl.wur.fbr.om.om18.vocabulary.set.OM;
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
            UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
            Unit metre = (Unit) factory.getUnitOrScale("metre");
            Assert.assertEquals("Testing OM Base Unit creation", SIBaseDimension.LENGTH,((BaseUnit)metre).getDefinitionDimension());
            Assert.assertEquals("Testing OM Base Unit creation", "metre",metre.getName());
            Assert.assertEquals("Testing OM Base Unit creation", "m",metre.getSymbol());
            Unit second = (Unit) factory.getUnitOrScale("second-time");
            Assert.assertEquals("Testing OM Base Unit creation", SIBaseDimension.TIME,((BaseUnit)second).getDefinitionDimension());
            Unit candela = (Unit) factory.getUnitOrScale("candela");
            Assert.assertEquals("Testing OM Base Unit creation", SIBaseDimension.LUMINOUS_INTENSITY, ((BaseUnit) candela).getDefinitionDimension());
            Assert.assertNotEquals("Testing OM Base Unit creation", SIBaseDimension.LENGTH, ((BaseUnit) candela).getDefinitionDimension());
            Assert.assertNotEquals("Testing OM Base Unit creation", SIBaseDimension.ELECTRIC_CURRENT,((BaseUnit)candela).getDefinitionDimension());
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
            UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
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
            UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
            Unit kilometre = (Unit) factory.getUnitOrScale("kilometre");
            Assert.assertEquals("Testing OM Unit Multiple creation", "kilometre", kilometre.getName());
            Assert.assertEquals("Testing OM Unit Multiple creation", "km", kilometre.getSymbol());
            Assert.assertEquals("Testing OM Unit Multiple creation", 1000, ((UnitMultiple) kilometre).getFactor(), 0.0000001);

            Unit kilogram = (Unit) factory.getUnitOrScale("kilogram");
            Assert.assertEquals("Testing OM Unit Multiple creation", "kilogram", kilogram.getName());
            Assert.assertEquals("Testing OM Unit Multiple creation", "kg", kilogram.getSymbol());
            Assert.assertEquals("Testing OM Unit Multiple creation", 1000, ((UnitMultiple) kilogram).getFactor(), 0.0000001);
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not create OMUnitAndScaleFactory.");
        }
    }

    /**
     * Tests the creation of unit multiplications in OM.
     */
    @Test
    public void testOMUnitMultiplication(){
        try {
            UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
            Unit newtonMetre = (Unit) factory.getUnitOrScale("newton_metre");
            Assert.assertEquals("Testing OM Unit Multiplication creation", "newton metre", newtonMetre.getName());
            Assert.assertEquals("Testing OM Unit Multiplication creation", "N m", newtonMetre.getSymbol());
            Unit newton = (Unit) factory.getUnitOrScale("newton");
            Unit metre = (Unit) factory.getUnitOrScale("metre");
            Assert.assertEquals("Testing OM Unit Multiplication creation", newton, ((UnitMultiplication) newtonMetre).getTerm1());
            Assert.assertEquals("Testing OM Unit Multiplication creation", metre, ((UnitMultiplication) newtonMetre).getTerm2());

        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not create OMUnitAndScaleFactory.");
        }
    }

    /**
     * Tests the creation of unit divisions in OM.
     */
    @Test
    public void testOMUnitDivision(){
        try {
            UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
            Unit metre_per_second = (Unit) factory.getUnitOrScale("metre_per_second-time");
            Assert.assertEquals("Testing OM Unit Division creation", "metre per second", metre_per_second.getName());
            Assert.assertEquals("Testing OM Unit Division creation", "m/s", metre_per_second.getSymbol());
            Unit second = (Unit) factory.getUnitOrScale("second-time");
            Unit metre = (Unit) factory.getUnitOrScale("metre");
            Assert.assertEquals("Testing OM Unit Division creation", metre, ((UnitDivision) metre_per_second).getNumerator());
            Assert.assertEquals("Testing OM Unit Division creation", second, ((UnitDivision) metre_per_second).getDenominator());

        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not create OMUnitAndScaleFactory.");
        }
    }

    /**
     * Tests the creation of unit exponentiations in OM.
     */
    @Test
    public void testOMUnitExponentiation(){
        try {
            UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
            Unit cubicMetre = (Unit) factory.getUnitOrScale("cubic_metre");
            Assert.assertEquals("Testing OM Unit Exponentiation creation", "cubic metre", cubicMetre.getName());
            Assert.assertEquals("Testing OM Unit Exponentiation creation", "m3", cubicMetre.getSymbol());
            Assert.assertEquals("Testing OM Unit Exponentiation creation", 3, ((UnitExponentiation) cubicMetre).getExponent(), 0.0000001);
            Unit metre = (Unit) factory.getUnitOrScale("metre");
            Assert.assertEquals("Testing OM Unit Exponentiation creation", metre, ((UnitExponentiation) cubicMetre).getBase());

        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not create OMUnitAndScaleFactory.");
        }
    }

    /**
     * Tests the creation of unit exponentiations in OM.
     */
    @Test
    public void testOMScaleCreation(){
        try {
            UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
            Scale celsius_scale = (Scale) factory.getUnitOrScale("Celsius_scale");
            Assert.assertEquals("Testing OM Scale creation", "Celsius scale", celsius_scale.getName());
            Assert.assertEquals("Testing OM Scale creation", 1, ((Scale) celsius_scale).getFactorFromDefinitionScale(), 0.0000001);
            Assert.assertEquals("Testing OM Scale creation", -273.15, ((Scale) celsius_scale).getOffsetFromDefinitionScale(), 0.0000001);
            Unit celsius = (Unit) factory.getUnitOrScale("degree_Celsius");
            Assert.assertEquals("Testing OM Unit Scale creation", celsius, ((Scale) celsius_scale).getUnit());
            Assert.assertEquals("Testing OM Unit Scale creation", 15, ((Scale) celsius_scale).getDefinitionPoints().size());
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not create OMUnitAndScaleFactory.");
        }
    }

    /**
     * Tests the creation of unit with the automatically generated vocabulary of identifiers.
     */
    @Test
    public void testOMVocabulary(){
        try {
            UnitAndScaleFactory factory = new DefaultUnitAndScaleFactory();
            Unit metre = (Unit) factory.getUnitOrScale(OM.Metre);
            Assert.assertEquals("Testing OM Base Unit creation", SIBaseDimension.LENGTH,((BaseUnit)metre).getDefinitionDimension());
            Assert.assertEquals("Testing OM Base Unit creation", "metre",metre.getName());
            Assert.assertEquals("Testing OM Base Unit creation", "m",metre.getSymbol());

            Scale celsius_scale = (Scale) factory.getUnitOrScale(OM.CelsiusScale);
            Assert.assertEquals("Testing OM Scale creation", "Celsius scale", celsius_scale.getName());
            Assert.assertEquals("Testing OM Scale creation", 1, ((Scale) celsius_scale).getFactorFromDefinitionScale(), 0.0000001);
            Assert.assertEquals("Testing OM Scale creation", -273.15, ((Scale) celsius_scale).getOffsetFromDefinitionScale(), 0.0000001);
            Unit celsius = (Unit) factory.getUnitOrScale(OM.DegreeCelsius);
            Assert.assertEquals("Testing OM Unit Scale creation", celsius, ((Scale) celsius_scale).getUnit());
            Assert.assertEquals("Testing OM Unit Scale creation", 15, ((Scale) celsius_scale).getDefinitionPoints().size());
        } catch (UnitOrScaleCreationException e) {
            e.printStackTrace();
            Assert.fail("Could not create OMUnitAndScaleFactory.");
        }
    }
}
