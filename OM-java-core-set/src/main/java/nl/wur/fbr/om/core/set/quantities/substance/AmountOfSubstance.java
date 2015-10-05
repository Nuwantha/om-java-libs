package nl.wur.fbr.om.core.set.quantities.substance;

import nl.wur.fbr.om.core.impl.quantities.AbstractQuantity;
import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.quantities.QuantityClass;

/**
 * Instances of this class represent a amount of substance quantity.
 * @author Don Willems on 05/10/15.
 */
public class AmountOfSubstance extends AbstractQuantity{
    /**
     * Creates an unnamed quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the quantity.
     */
    public AmountOfSubstance(Measure measure) {
        super(measure);
    }

    /**
     * Creates an unnamed quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param name    The name of the quantity.
     * @param symbol  The symbol used for the quantity.
     * @param measure The value of the quantity.
     */
    public AmountOfSubstance(String name, String symbol, Measure measure) {
        super(name, symbol, measure);
    }

    /**
     * Returns the {@link QuantityClass} for which this quantity is an instance.
     *
     * @return The quantity class.
     */
    @Override
    public QuantityClass getQuantityClass() {
        return CoreQuantitySet.AMOUNT_OF_SUBSTANCE;
    }
}
