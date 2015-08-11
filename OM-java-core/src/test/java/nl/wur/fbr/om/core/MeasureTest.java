package nl.wur.fbr.om.core;

import nl.wur.fbr.om.core.factory.DefaultInstanceFactory;
import nl.wur.fbr.om.core.factory.DefaultMeasureAndPointFactory;
import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.factory.MeasureAndPointFactory;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.measures.ScalarMeasure;
import nl.wur.fbr.om.model.measures.VectorMeasure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.points.ScalarPoint;
import nl.wur.fbr.om.model.points.VectorPoint;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.Unit;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the core classes Measure and Point and the factory MeasureAndPointFactory.
 *
 *
 * @author Don Willems on 22/07/15.
 */
public class MeasureTest {

    @Test
    public void testScalarMeasureCreation(){
        InstanceFactory factory = new DefaultInstanceFactory();
        Unit metre = factory.createBaseUnit("metre", "m", SIBaseDimension.LENGTH);
        Unit second = factory.createBaseUnit("second", "s",SIBaseDimension.TIME);
        ScalarMeasure m1 = factory.createScalarMeasure(15.3, metre);
        Assert.assertTrue("Test measure creation",m1.getScalarValue().doubleValue()==15.3);
        Assert.assertTrue("Test measure creation",m1.getNumericalValue() instanceof Number);
        Assert.assertTrue("Test measure creation", ((Number) m1.getNumericalValue()).doubleValue() == 15.3);
        Assert.assertEquals("Test measure creation", metre, m1.getUnit());

        Unit metrePerSecond = factory.createUnitDivision("metre per second", "m/s", metre, second);
        ScalarMeasure ms1 = factory.createScalarMeasure(2.4e2, metrePerSecond);
        Assert.assertTrue("Test measure creation",ms1.getScalarValue().doubleValue()==2.4e2);
        Assert.assertTrue("Test measure creation",ms1.getNumericalValue() instanceof Number);
        Assert.assertTrue("Test measure creation",((Number)ms1.getNumericalValue()).doubleValue()==2.4e2);
        Assert.assertEquals("Test measure creation",metrePerSecond,ms1.getUnit());

        Measure m2 = factory.createMeasure(15.3, metre);
        Assert.assertTrue("Test measure creation",m2 instanceof ScalarMeasure);
        Assert.assertTrue("Test measure creation",((ScalarMeasure)m2).getScalarValue().doubleValue()==15.3);
        Assert.assertTrue("Test measure creation",m2.getNumericalValue() instanceof Number);
        Assert.assertTrue("Test measure creation", ((Number) m2.getNumericalValue()).doubleValue() == 15.3);
        Assert.assertEquals("Test measure creation", metre, m2.getUnit());
    }

    @Test
    public void testVectorMeasureCreation(){
        InstanceFactory factory = new DefaultInstanceFactory();
        Unit metre = factory.createBaseUnit("metre", "m", SIBaseDimension.LENGTH);
        Double[] vector = {4.0,3.0};
        VectorMeasure m1 = factory.createVectorMeasure(vector, metre);
        Assert.assertTrue("Test measure creation", ((Number) m1.getVectorValue()[0]).doubleValue() == 4.0);
        Assert.assertTrue("Test measure creation", m1.getNumericalValue() instanceof Number[]);
        Assert.assertTrue("Test measure creation", ((Number[]) m1.getNumericalValue())[0].doubleValue() == 4.0);
        Assert.assertEquals("Test measure creation", metre, m1.getUnit());
        Assert.assertTrue("Test measure creation", ((Number) m1.getVectorValue()[1]).doubleValue() == 3.0);
        Assert.assertTrue("Test measure creation", ((Number[]) m1.getNumericalValue())[1].doubleValue() == 3.0);
        Assert.assertTrue("Test measure creation", m1.getMagnitude().getScalarValue().doubleValue() == 5.0);
        Assert.assertEquals("Test measure creation", metre, m1.getMagnitude().getUnit());

        Measure m2 = factory.createMeasure(vector, metre);
        Assert.assertTrue("Test measure creation", m2 instanceof VectorMeasure);
        VectorMeasure m3 = (VectorMeasure)m2;
        Assert.assertTrue("Test measure creation", m3.doubleValue()[0] == 4.0);
        Assert.assertTrue("Test measure creation", m3.getNumericalValue() instanceof Number[]);
        Assert.assertTrue("Test measure creation", m3.doubleValue()[1] == 3.0);
        Assert.assertEquals("Test measure creation", metre, m3.getUnit());
        Assert.assertTrue("Test measure creation", ((Number) m3.getVectorValue()[1]).doubleValue() == 3.0);
        Assert.assertTrue("Test measure creation", ((Number[]) m3.getNumericalValue())[1].doubleValue() == 3.0);
        Assert.assertTrue("Test measure creation", m3.getMagnitude().getScalarValue().doubleValue() == 5.0);
        Assert.assertEquals("Test measure creation", metre, m3.getMagnitude().getUnit());
    }

    @Test
    public void testPointCreation(){
        InstanceFactory factory = new DefaultInstanceFactory();
        Unit kelvin = factory.createBaseUnit("Kelvin", "K", SIBaseDimension.THERMODYNAMIC_TEMPERATURE);
        Unit celsius = factory.createSingularUnit("Celsius", "°C", kelvin, 1.0);
        Scale kelvinScale = factory.createScale("kelvin scale", null, kelvin);
        Scale celsiusScale = factory.createScale("celsius scale", null, kelvinScale, -273.15, 1.0, celsius);
        ScalarPoint boilingpoint = factory.createScalarPoint(100.0, celsiusScale);
        Assert.assertTrue("Test measure creation", boilingpoint.doubleValue() == 100.0);
        Assert.assertEquals("Test measure creation", celsiusScale, boilingpoint.getScale());
        Assert.assertEquals("Test measure creation", celsius, boilingpoint.getScale().getUnit());

        Double[] vector = {4.0,3.0};
        Point m2 = factory.createPoint(vector, celsiusScale);
        Assert.assertTrue("Test measure creation", m2 instanceof VectorPoint);
        VectorPoint m3 = (VectorPoint)m2;
        Assert.assertTrue("Test measure creation", m3.doubleValue()[0] == 4.0);
        Assert.assertTrue("Test measure creation", m3.getNumericalValue() instanceof Number[]);
        Assert.assertTrue("Test measure creation", m3.doubleValue()[1] == 3.0);
        Assert.assertEquals("Test measure creation", celsius, m3.getScale().getUnit());
        Assert.assertTrue("Test measure creation", ((Number) m3.getVectorValue()[1]).doubleValue() == 3.0);
        Assert.assertTrue("Test measure creation", ((Number[]) m3.getNumericalValue())[1].doubleValue() == 3.0);
        Assert.assertTrue("Test measure creation", m3.getMagnitude().getScalarValue().doubleValue() == 5.0);
        Assert.assertEquals("Test measure creation", celsius, m3.getMagnitude().getUnit());

    }
}
