package nl.wur.fbr.om.model.quantities;

/**
 * Instances of this interface represent a set of indices (of type {@link Index}).
 *
 * @author Don Willems on 11/10/15.
 */
public interface IndexSet extends Quantity {

    /**
     * Returns true when the specified index is contained in this set.
     * If one of the limits of the set is variable, it cannot be determined whether the value is part of the set, and
     * the method returns false.
     *
     * @param index The index to be tested.
     * @return True when it is contained in the set, false if it is unknown or is not contained in the set.
     */
    public boolean contains(int index);

    /**
     * Returns the size of the set or -1 if the size cannot be determined, e.g. when the upper limit of the set is
     * variable.
     * @return The size of the set or -1 if it cannot be determined.
     */
    public int size();
}
