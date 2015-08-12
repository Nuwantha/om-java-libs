package nl.wur.fbr.om.math;

import nl.wur.fbr.om.conversion.CoreInstanceFactory;
import nl.wur.fbr.om.core.set.CoreSet;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.math.impl.MathProcessorImpl;
import nl.wur.fbr.om.model.measures.Measure;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class contains unit tests for the basic mathematical operators.
 *
 * @author Don Willems on 12/08/15.
 */
public class BasicOperatorTest {

    @Test
    public void testAdditionOfTwoMeasures() throws UnitOrScaleCreationException {
        InstanceFactory factory = new CoreInstanceFactory();
        factory.addUnitAndScaleSet(CoreSet.class);
        Math.setMathProcessor(new MathProcessorImpl(factory));
        Measure m1 = factory.createScalarMeasure(14, CoreSet.METRE);
        Measure m2 = factory.createScalarMeasure(700, CoreSet.DECIMETRE);
        Measure m3 = Math.add(m1,m2);
        Assert.assertEquals("Test addition",84,m3.getScalarValue(),0.00000001);
        Assert.assertEquals("Test addition",CoreSet.METRE,m3.getUnit());
        Measure m4 = factory.createScalarMeasure(12, CoreSet.KILOGRAM);
        try {
            Measure m5 = Math.add(m3, m4);
            Assert.fail("Expected MathException when adding 84 m and 12 kg.");
        }catch (MathException e){
            Assert.assertTrue("MathException thrown as expected",true);
        }
    }

}
