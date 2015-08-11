package nl.wur.fbr.om.conversion;

import nl.wur.fbr.om.core.factory.DefaultInstanceFactory;
import nl.wur.fbr.om.core.factory.DefaultMeasureAndPointFactory;
import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.factory.MeasureAndPointFactory;
import nl.wur.fbr.om.factory.UnitAndScaleConversionFactory;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;

/**
 * This factory class is a wrapper that contains the different factory classes that are used to create and convert
 * units and measurement scales. <br>
 * This class is an extension of the {@link DefaultInstanceFactory} with conversion support.
 * It includes a conversion factory of type {@link DefaultUnitConversionFactory}.
 * @author Don Willems on 10/08/15.
 */
public class CoreInstanceFactory extends DefaultInstanceFactory{

    /**
     * Creates the default instance factory, containing the {@link DefaultUnitAndScaleFactory} and
     * {@link DefaultMeasureAndPointFactory} for creating units, scale, measures, and points and the
     * {@link DefaultUnitConversionFactory} for converting measures and points to different units
     * and scales.
     */
    public CoreInstanceFactory(){
        super(new DefaultUnitAndScaleFactory(),new DefaultMeasureAndPointFactory(),null);
        super.setUnitAndScaleConversionFactory(new DefaultUnitConversionFactory(this.getMeasureAndPointFactory()));
    }


    /**
     * Creates a default instance factory with the specified factory classes.
     * @param unitAndScaleFactory The unit and scale factory.
     * @param measureAndPointFactory The measure and point factory.
     * @param conversionFactory The unit and scale conversion factory.
     */
    public CoreInstanceFactory(UnitAndScaleFactory unitAndScaleFactory, MeasureAndPointFactory measureAndPointFactory, UnitAndScaleConversionFactory conversionFactory){
        super(unitAndScaleFactory,measureAndPointFactory,conversionFactory);
    }
}
