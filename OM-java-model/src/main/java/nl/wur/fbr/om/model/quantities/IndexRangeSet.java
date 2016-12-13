package nl.wur.fbr.om.model.quantities;

/**
 * Represents an index set which is specified by a range of indices, i.e. by a lower and upper limit.
 *
 * @author Don Willems on 11/10/15.
 */
public interface IndexRangeSet extends IndexSet {

    /**
     * Returns the lower limit of the index range.
     * @return The lower limit.
     */
    public int getLowerLimit();

    /**
     * Returns the upper limit of the index range.
     * @return The upper limit or -1 if the upper limit is undetermined (i.e. <code>N</code>).
     */
    public int getUpperLimit();
}
