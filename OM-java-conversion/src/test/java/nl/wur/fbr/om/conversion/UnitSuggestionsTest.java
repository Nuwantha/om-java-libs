package nl.wur.fbr.om.conversion;

import nl.wur.fbr.om.core.set.CoreUnitAndScaleSet;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.units.Unit;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * This class contains unit test to test the {@link nl.wur.fbr.om.factory.InstanceFactory#getUnitSuggestions(Measure)}
 * functionality.
 * @author Don Willems on 16/08/15.
 */
public class UnitSuggestionsTest {

    @Test
    public void testSuggestPrefixedUnits() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreUnitAndScaleSet.class);
        Measure m1 = factory.createMeasure(0.025, CoreUnitAndScaleSet.METRE);
        List<Unit> suggestions = factory.getUnitSuggestions(m1);
        Assert.assertTrue("Test suggestions for prefixed units.",suggestions.size()>0);
        Assert.assertEquals("Test suggestions for prefixed units.", CoreUnitAndScaleSet.CENTIMETRE, suggestions.get(0));
        m1 = factory.createMeasure(250, CoreUnitAndScaleSet.METRE);
        suggestions = factory.getUnitSuggestions(m1);
        Assert.assertTrue("Test suggestions for prefixed units.",suggestions.size()>0);
        Assert.assertEquals("Test suggestions for prefixed units.", CoreUnitAndScaleSet.KILOMETRE, suggestions.get(0));
    }
}
