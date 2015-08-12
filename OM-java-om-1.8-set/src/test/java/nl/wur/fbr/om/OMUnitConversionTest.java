package nl.wur.fbr.om;

import nl.wur.fbr.om.conversion.CoreInstanceFactory;
import nl.wur.fbr.om.exceptions.ConversionException;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.om18.set.OM;
import org.junit.Assert;
import org.junit.Test;

/**
 * Contains unit tests for conversion between units defined in OM.
 * @author Don Willems on 04/08/15.
 */
public class OMUnitConversionTest {


    /**
     * Test for singular unit conversions.
     */
    @Test
    public void testSingularUnitConversion(){

        try {
            InstanceFactory factory = new CoreInstanceFactory();
            try {
                factory.addUnitAndScaleSet(OM.class);
            } catch (UnitOrScaleCreationException e) {
                e.printStackTrace();
            }
            Unit metre = OM.Metre;
            Unit inch = OM.Inch;
            Measure m1 = factory.createScalarMeasure(10,metre);
            Measure m2 = factory.convertToUnit(m1, inch);
            Assert.assertTrue("Test measure equals after conversion", factory.equals(m1, m2, 1e-12));
            Assert.assertEquals("Test measure equals after conversion", 393.7007874015748, m2.getScalarValue(), 0.0000001);


        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when getting a unit from its identifier. " + e);
        }
    }

    /**
     * Test for prefixed unit conversions.
     */
    @Test
    public void testPrefixedUnitConversion(){

        try {
            InstanceFactory factory = new CoreInstanceFactory();
            try {
                factory.addUnitAndScaleSet(OM.class);
            } catch (UnitOrScaleCreationException e) {
                e.printStackTrace();
            }
            Unit metre = OM.Metre;
            Unit kilometre = OM.Kilometre;
            Measure m1 = factory.createScalarMeasure(1204,metre);
            Measure m2 = factory.convertToUnit(m1,kilometre);
            Assert.assertTrue("Test measure equals after conversion", factory.equals(m1, m2,1e-12));
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }

        try {
            InstanceFactory factory = new CoreInstanceFactory();
            try {
                factory.addUnitAndScaleSet(OM.class);
            } catch (UnitOrScaleCreationException e) {
                e.printStackTrace();
            }
            Unit metre = OM.Metre;
            Unit kilogram = OM.Kilogram;
            Measure m1 = factory.createScalarMeasure(1204,metre);
            Measure m2 = factory.convertToUnit(m1,kilogram);
            Assert.assertNotEquals("Test measure equals after conversion", 1.204, m2.getScalarValue(), 0.0000001);
        } catch (ConversionException e) {
            Assert.assertTrue("Expected exception thrown when converting a unit. " + e, true);
        }
    }

    /**
     * Tests special case of kilogram as a base unit
     */
    @Test
    public void testKilogramUnitConversion(){

        try {
            InstanceFactory factory = new CoreInstanceFactory();
            try {
                factory.addUnitAndScaleSet(OM.class);
            } catch (UnitOrScaleCreationException e) {
                e.printStackTrace();
            }
            Unit gram = OM.Gram;
            Unit kilogram = OM.Kilogram;
            Measure m1 = factory.createScalarMeasure(1204, gram);
            Measure m2 = factory.convertToUnit(m1, kilogram);
            Assert.assertTrue("Test measure equals after conversion", factory.equals(m1, m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 1.204, m2.getScalarValue(), 0.0000001);
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Tests conversion chaining as suggested by Hajo.
     */
    @Test
    public void testConversionChaining(){
        try {
            InstanceFactory factory = new CoreInstanceFactory();
            try {
                factory.addUnitAndScaleSet(OM.class);
            } catch (UnitOrScaleCreationException e) {
                e.printStackTrace();
            }
            Unit cubicmetre = OM.CubicMetre;
            SingularUnit teaspoon = factory.createSingularUnit("Hajo's teaspoon","htsp",cubicmetre,4.928922e-6);
            SingularUnit dessertspoon = factory.createSingularUnit("Hajo's dessertspoon","hdsp",teaspoon,2);
            Unit litre = OM.Litre;
            Measure m1 = factory.createScalarMeasure(1,dessertspoon);
            Measure m2 = factory.convertToUnit(m1, teaspoon);
            Measure m3 = factory.convertToUnit(m1,cubicmetre);
            Measure m4 = factory.convertToUnit(m1,litre);
            Assert.assertTrue("Test measure equals after conversion", factory.equals(m1, m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 2, m2.getScalarValue(), 0.0000001);
            Assert.assertEquals("Test measure equals after conversion", 9.857844e-6, m3.getScalarValue(), 0.0000001);
            Assert.assertEquals("Test measure equals after conversion", 0.009857844, m4.getScalarValue(), 0.0000001);
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Test for unit division conversion.
     */
    @Test
    public void testUnitDivisionConversion(){

        try {
            InstanceFactory factory = new CoreInstanceFactory();
            try {
                factory.addUnitAndScaleSet(OM.class);
            } catch (UnitOrScaleCreationException e) {
                e.printStackTrace();
            }
            Unit kmh = OM.KilometrePerHour;
            Unit ms = OM.MetrePerSecondTime;
            Measure m1 = factory.createScalarMeasure(120,kmh);
            Measure m2 = factory.convertToUnit(m1,ms);
            Assert.assertTrue("Test measure equals after conversion",factory.equals(m1,m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 33.33333333333333, m2.getScalarValue(), 0.0000001);

        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Test for unit division conversion.
     */
    @Test
    public void testUnitMultiplicationConversion(){

        try {
            InstanceFactory factory = new CoreInstanceFactory();
            try {
                factory.addUnitAndScaleSet(OM.class);
            } catch (UnitOrScaleCreationException e) {
                e.printStackTrace();
            }
            Unit joule = OM.Joule;
            Unit kcal = OM.KilocalorieMean;
            Measure m1 = factory.createScalarMeasure(120,joule);
            Measure m2 = factory.convertToUnit(m1,kcal);
            Assert.assertTrue("Test measure equals after conversion",factory.equals(m1,m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion", 120/4.19002/1000, m2.getScalarValue(), 0.0000001);

        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /**
     * Test for unit exponentiation conversion.
     */
    @Test
    public void testUnitExponentiationConversion(){

        try {
            InstanceFactory factory = new CoreInstanceFactory();
            try {
                factory.addUnitAndScaleSet(OM.class);
            } catch (UnitOrScaleCreationException e) {
                e.printStackTrace();
            }
            Unit squaremetre = OM.SquareMetre;
            Unit squarekilometre = OM.SquareKilometre;
            Measure m1 = factory.createScalarMeasure(1000000,squaremetre);
            Measure m2 = factory.convertToUnit(m1,squarekilometre);
            Assert.assertTrue("Test measure equals after conversion", factory.equals(m1, m2,1e-12));
            Assert.assertEquals("Test measure equals after conversion",1.0, m2.getScalarValue(),0.0000001);

        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a unit. " + e);
        }
    }

    /** Tests conversion between scales. */
    @Test
    public void testScaleConversion(){

        try {
            InstanceFactory factory = new CoreInstanceFactory();
            try {
                factory.addUnitAndScaleSet(OM.class);
            } catch (UnitOrScaleCreationException e) {
                e.printStackTrace();
            }
            Scale celsiusscale = OM.CelsiusScale;
            Scale fahrenheitscale = OM.FahrenheitScale;

            Point p1 = factory.createScalarPoint(0.0,celsiusscale);
            Point p2 = factory.convertToScale(p1,fahrenheitscale);
            System.out.println("p1: "+p1.getScalarValue() + p1.getScale().getUnit().getSymbol()+" "+p1.getClass());
            System.out.println("p2: "+p2.getScalarValue() + p2.getScale().getUnit().getSymbol()+" "+p2.getClass());
            Assert.assertEquals("Test measure equals after conversion", 32.0, p2.getScalarValue(), 0.0000001);
            Assert.assertTrue("Test measure equals after conversion", factory.equals(p1, p2,1e-12));
        } catch (ConversionException e) {
            e.printStackTrace();
            Assert.fail("Exception thrown when converting a scale. " + e);
        }
    }
}
