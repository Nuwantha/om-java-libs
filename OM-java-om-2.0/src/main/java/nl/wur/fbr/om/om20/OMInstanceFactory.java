package nl.wur.fbr.om.om20;

import nl.wur.fbr.om.core.factory.DefaultInstanceFactory;
import nl.wur.fbr.om.core.factory.DefaultMeasureAndPointFactory;
import nl.wur.fbr.om.factory.MeasureAndPointFactory;
import nl.wur.fbr.om.factory.UnitAndScaleConversionFactory;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import org.openrdf.repository.Repository;

/**
 * This factory class is a wrapper that contains the different factory classes that are used to create and convert
 * units and measurement scales using units and scales defined using the OM ontology. <br>
 * This class is an extension of the {@link DefaultInstanceFactory} with conversion support and it includes a
 * unit and scale factory of type {@link OMUnitAndScaleFactory} that is able to create units and scales defined
 * in a triple store using the OM ontology (v1.8).
 * @author Don Willems on 10/08/15.
 */
public class OMInstanceFactory extends DefaultInstanceFactory {
    /**
     * Creates the default instance factory, containing the {@link OMUnitAndScaleFactory} initialised with the
     * specified triple store repository and a {@link DefaultMeasureAndPointFactory}.
     * It does not include a conversion factory.
     * @param repository The triple store repository.
     */
    public OMInstanceFactory(Repository repository){
        super(new OMUnitAndScaleFactory(repository),new DefaultMeasureAndPointFactory(),null);
    }

    /**
     * Creates the default instance factory, containing the {@link OMUnitAndScaleFactory} initialised with the
     * specified triple store repository, a {@link DefaultMeasureAndPointFactory} and with
     * the specified {@link UnitAndScaleConversionFactory} for converting measures and points to other
     * units and scales.
     * @param repository The triple store repository.
     * @param conversionFactory The conversion factory implementation.
     */
    public OMInstanceFactory(Repository repository,UnitAndScaleConversionFactory conversionFactory){
        super(new OMUnitAndScaleFactory(repository), new DefaultMeasureAndPointFactory(), conversionFactory);
    }

    /**
     * Creates a default instance factory with the specified factory classes.
     * @param unitAndScaleFactory The unit and scale factory.
     * @param measureAndPointFactory The measure and point factory.
     * @param conversionFactory The unit and scale conversion factory.
     */
    public OMInstanceFactory(UnitAndScaleFactory unitAndScaleFactory, MeasureAndPointFactory measureAndPointFactory, UnitAndScaleConversionFactory conversionFactory){
        super(unitAndScaleFactory,measureAndPointFactory,conversionFactory);
    }
}
