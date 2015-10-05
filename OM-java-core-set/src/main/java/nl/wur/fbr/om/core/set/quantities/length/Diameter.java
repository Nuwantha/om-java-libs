package nl.wur.fbr.om.core.set.quantities.length;

import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.exceptions.QuantityCreationException;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.quantities.QuantityClass;

/**
 * Instances of this class represent a Diameter quantity.
 * @author Don Willems on 04/10/15.
 */
public class Diameter extends Length {

    /**
     * Creates an Diameter with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the diameter quantity.
     * @throws QuantityCreationException When the dimension of the quantity did not match the
     * dimension of the unit of the point.
     */
    public Diameter(Measure measure) throws QuantityCreationException {
        super("diameter","d",measure);
    }

    /**
     * Creates a Diameter with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param name The custom name of the diameter quantity.
     * @param symbol The custom symbol of the diameter quantity.
     * @param measure The value of the diameter quantity.
     * @throws QuantityCreationException When the dimension of the quantity did not match the
     * dimension of the unit of the point.
     */
    public Diameter(String name, String symbol, Measure measure) throws QuantityCreationException {
        super(name, symbol, measure);
    }


    /**
     * Returns the {@link QuantityClass} for which this quantity is an instance.
     *
     * @return The quantity class.
     */
    @Override
    public QuantityClass getQuantityClass() {
        return CoreQuantitySet.DIAMETER;
    }
}
