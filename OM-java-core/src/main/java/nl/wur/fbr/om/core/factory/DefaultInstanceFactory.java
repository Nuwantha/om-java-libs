package nl.wur.fbr.om.core.factory;

import nl.wur.fbr.om.factory.InstanceFactory;
import nl.wur.fbr.om.factory.MeasureAndPointFactory;
import nl.wur.fbr.om.factory.UnitAndScaleConversionFactory;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.units.Unit;

/**
 * The default implementation of the abstract class {@link InstanceFactory}, which combines the different
 * implmentations of the factories {@link UnitAndScaleFactory}, {@link MeasureAndPointFactory}, and
 * {@link UnitAndScaleConversionFactory}. It uses the default implementations for these interfaces defined in the
 * core library {@link DefaultUnitAndScaleFactory} and {@link DefaultMeasureAndPointFactory}. No implementation
 * for the {@link UnitAndScaleConversionFactory} is available in the core package, so when using the default
 * constructor, no conversions can be handles by this implementation of {@link InstanceFactory}.
 * @author Don Willems on 10/08/15.
 */
public class DefaultInstanceFactory extends InstanceFactory {

    /**
     * Creates the default instance factory, containing the {@link DefaultUnitAndScaleFactory} and
     * {@link DefaultMeasureAndPointFactory} for creating units, scale, measures, and points. No
     * default conversion factory exists in the core library. If you want to add a conversion factory to the
     * <code>DefaultInstanceFactory</code> use {@link #DefaultInstanceFactory(UnitAndScaleConversionFactory)} or
     * {@link #DefaultInstanceFactory(UnitAndScaleFactory, MeasureAndPointFactory, UnitAndScaleConversionFactory)}.
     */
    public DefaultInstanceFactory(){
        super(new DefaultUnitAndScaleFactory(),new DefaultMeasureAndPointFactory(),null);
    }

    /**
     * Creates the default instance factory, containing the {@link DefaultUnitAndScaleFactory} and
     * {@link DefaultMeasureAndPointFactory} for creating units, scale, measures, and points and with
     * the specified {@link UnitAndScaleConversionFactory} for converting measures and points to other
     * units and scales.
     * @param conversionFactory The conversion factory implementation.
     */
    public DefaultInstanceFactory(UnitAndScaleConversionFactory conversionFactory){
        super(new DefaultUnitAndScaleFactory(),new DefaultMeasureAndPointFactory(),conversionFactory);
    }


    /**
     * Creates a default instance factory with the specified factory classes.
     * @param unitAndScaleFactory The unit and scale factory.
     * @param measureAndPointFactory The measure and point factory.
     * @param conversionFactory The unit and scale conversion factory.
     */
    public DefaultInstanceFactory(UnitAndScaleFactory unitAndScaleFactory, MeasureAndPointFactory measureAndPointFactory, UnitAndScaleConversionFactory conversionFactory){
        super(unitAndScaleFactory,measureAndPointFactory,conversionFactory);
    }

}
