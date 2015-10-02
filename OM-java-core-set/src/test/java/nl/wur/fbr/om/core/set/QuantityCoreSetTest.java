package nl.wur.fbr.om.core.set;

import nl.wur.fbr.om.core.factory.DefaultInstanceFactory;
import nl.wur.fbr.om.core.set.quantities.length.ElectromagneticWaveLength;
import nl.wur.fbr.om.core.set.quantities.length.Length;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the core quantity set.
 * @author Don Willems on 02/10/15.
 */
public class QuantityCoreSetTest {

    @Test
    public void testLength() throws UnitOrScaleCreationException {
        InstanceFactory factory = new DefaultInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Length length = new Length(factory.createMeasure(15.4,CoreSet.METRE));
        Assert.assertEquals("Test equal name of quantity and quantity class.","length",length.getName());
        Assert.assertEquals("Test equal symbol of quantity and quantity class.","l",length.getSymbol());
        Assert.assertEquals("Test equal string description of length.", "l = 15.4 m", length.toString());

        ElectromagneticWaveLength waveLength = new ElectromagneticWaveLength(factory.createMeasure(15.4,CoreSet.NANOMETRE));
        Assert.assertEquals("Test equal name of quantity and quantity class.","wavelength",waveLength.getName());
        Assert.assertEquals("Test equal symbol of quantity and quantity class.","λ",waveLength.getSymbol());
        Assert.assertEquals("Test equal string description of length.","λ = 15.4 nm",waveLength.toString());
    }
}
