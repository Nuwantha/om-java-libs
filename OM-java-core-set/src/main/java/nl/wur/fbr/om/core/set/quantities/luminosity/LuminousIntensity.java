package nl.wur.fbr.om.core.set.quantities.luminosity;

import nl.wur.fbr.om.core.impl.quantities.AbstractQuantity;
import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.quantities.QuantityClass;

/**
 * Instances of this class represent a luminous intensity quantity.
 * @author Don Willems on 05/10/15.
 */
public class LuminousIntensity extends AbstractQuantity{
    /**
     * Creates a luminous intensity quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the quantity.
     */
    public LuminousIntensity(Measure measure) {
        super(measure);
    }

    /**
     * Creates a luminous intensity quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param name    The name of the quantity.
     * @param symbol  The symbol used for the quantity.
     * @param measure The value of the quantity.
     */
    public LuminousIntensity(String name, String symbol, Measure measure) {
        super(name, symbol, measure);
    }

    /**
     * Returns the {@link QuantityClass} for which this quantity is an instance.
     *
     * @return The quantity class.
     */
    @Override
    public QuantityClass getQuantityClass() {
        return CoreQuantitySet.LUMINOUS_INTENSITY;
    }
}
