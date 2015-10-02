package nl.wur.fbr.om.core.set.quantities.length;

import nl.wur.fbr.om.model.measures.Measure;

/**
 * Instances of this class represent a distance quantity.
 * @author Don Willems on 02/10/15.
 */
public class Distance extends Length {
    /**
     * Creates a Distance with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the distance quantity.
     */
    public Distance(Measure measure) {
        super("distance","d",measure);
    }
}
