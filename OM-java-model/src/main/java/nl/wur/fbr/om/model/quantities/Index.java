package nl.wur.fbr.om.model.quantities;

/**
 * Instances of this interface represent an index, i.e. a position in a set.
 * Instances of this quantity have an integer value as measure with unit ONE.
 *
 * @author Don Willems on 11/10/15.
 */
public interface Index extends Quantity{

    /**
     * Returns the value of the index, or -1 if the index is not set, i.e. if the index is a variable.
     *
     * @return The index.
     */
    public int getIndexValue();
}
