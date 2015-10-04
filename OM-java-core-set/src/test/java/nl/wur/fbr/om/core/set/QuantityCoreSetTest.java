package nl.wur.fbr.om.core.set;

import nl.wur.fbr.om.core.factory.DefaultInstanceFactory;
import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.core.set.quantities.length.ElectromagneticWavelength;
import nl.wur.fbr.om.core.set.quantities.length.Length;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.model.quantities.QuantityCreationException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the core quantity set.
 * @author Don Willems on 02/10/15.
 */
public class QuantityCoreSetTest {

    @Test
    public void testLength() throws UnitOrScaleCreationException, QuantityCreationException {
        CoreQuantitySet quantitySet = new CoreQuantitySet();
        InstanceFactory factory = new DefaultInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Length length = (Length) quantitySet.createQuantity(CoreQuantitySet.LENGTH,factory.createMeasure(15.4,CoreUnitAndScaleSet.METRE));
        Assert.assertEquals("Test equal name of quantity and quantity class.","length",length.getName());
        Assert.assertEquals("Test equal symbol of quantity and quantity class.","l",length.getSymbol());
        Assert.assertEquals("Test equal string description of length.", "l = 15.4 m", length.toString());

        ElectromagneticWavelength waveLength = (ElectromagneticWavelength) quantitySet.createQuantity(CoreQuantitySet.ELECTROMAGNETIC_WAVELENGTH,factory.createMeasure(15.4,CoreUnitAndScaleSet.NANOMETRE));
        Assert.assertEquals("Test equal name of quantity and quantity class.","wavelength",waveLength.getName());
        Assert.assertEquals("Test equal symbol of quantity and quantity class.","λ",waveLength.getSymbol());
        Assert.assertEquals("Test equal string description of length.", "λ = 15.4 nm", waveLength.toString());
        try {
            quantitySet.createQuantity(CoreQuantitySet.ELECTROMAGNETIC_WAVELENGTH,factory.createPoint(15.4,CoreUnitAndScaleSet.CELSIUS_SCALE));
            Assert.fail("Should have thrown a QuantityCreationException.");
        }catch (QuantityCreationException e){
            Assert.assertTrue("Expected exception when creating a length with a celsius scale.",true);
        }

    }
}
