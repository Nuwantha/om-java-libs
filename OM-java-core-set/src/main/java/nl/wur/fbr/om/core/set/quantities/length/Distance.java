package nl.wur.fbr.om.core.set.quantities.length;

import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.quantities.QuantityClass;

/**
 * Instances of this class represent a distance quantity.
 * @author Don Willems on 02/10/15.
 */
public class Distance extends Length {
    /**
     * Creates an Distance with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the distance quantity.
     */
    public Distance(Measure measure) {
        super(measure);
    }

    /**
     * Creates a Distance with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param name The custom name of the distance quantity.
     * @param symbol The custom symbol of the distance quantity.
     * @param measure The value of the distance quantity.
     */
    public Distance(String name, String symbol, Measure measure) {
        super(name, symbol, measure);
    }

    /**
     * Returns the {@link QuantityClass} for which this quantity is an instance.
     *
     * @return The quantity class.
     */
    @Override
    public QuantityClass getQuantityClass() {
        return CoreQuantitySet.DISTANCE;
    }
}
