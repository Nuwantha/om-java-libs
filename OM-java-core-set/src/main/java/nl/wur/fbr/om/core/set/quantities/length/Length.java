package nl.wur.fbr.om.core.set.quantities.length;

import nl.wur.fbr.om.core.impl.quantities.AbstractQuantity;
import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.exceptions.QuantityCreationException;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.quantities.QuantityClass;

/**
 * Instances of this class represent a length quantity.
 *
 * @author Don Willems on 02/10/15.
 */
public class Length extends AbstractQuantity {

    /**
     * Creates an Length with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the length quantity.
     */
    public Length(Measure measure) throws QuantityCreationException{
        super(measure);
    }

    /**
     * Creates a Length with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param name The custom name of the quantity.
     * @param symbol The custom symbol of the quantity.
     * @param measure The value of the length quantity.
     */
    public Length(String name, String symbol, Measure measure) throws QuantityCreationException {
        super(name,symbol,measure);
    }

    /**
     * Returns the {@link QuantityClass} for which this quantity is an instance.
     *
     * @return The quantity class.
     */
    @Override
    public QuantityClass getQuantityClass() {
        return CoreQuantitySet.LENGTH;
    }
}
