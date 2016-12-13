package nl.wur.fbr.om.core.impl.quantities;

import nl.wur.fbr.om.model.quantities.IndexRangeSet;

/**
 * Implemtation for the {@link IndexRangeSet} interface which represents an index set which is specified by a range
 * of indices, i.e. by a lower and upper limit.
 *
 * @author Don Willems on 11/10/15.
 */
public class IndexRangeSetImpl extends IndexSetImpl implements IndexRangeSet {

    private int lowerlimit = 1;
    private int upperlimit = -1;

    /**
     * Creates an index set with range <code>[1,N]</code> where <code>N</code> is undetermined, i.e. variable.
     */
    public IndexRangeSetImpl() {

    }

    /**
     * Creates an index set containing all values between the specified lower and upper limits.
     *
     * @param lowerlimit The lower limit, use -1 for an undetermined (i.e. variable) lower limit.
     * @param upperlimit The upper limit, use -1 for an undetermined (i.e. variable) upper limit.
     */
    public IndexRangeSetImpl(int lowerlimit, int upperlimit){
        if(lowerlimit<upperlimit){
            this.lowerlimit = lowerlimit;
            this.upperlimit = upperlimit;
        }else{
            this.lowerlimit = upperlimit;
            this.upperlimit = lowerlimit;
        }
    }

    /**
     * Creates an index set using the specified symbol and with range <code>[1,N]</code> where <code>N</code> is
     * undetermined, i.e. variable.
     *
     * @param symbol The symbol to be used for this set.
     */
    public IndexRangeSetImpl(String symbol) {
        super(symbol);
    }

    /**
     * Creates an index set using the specified symbol and containing all values between the specified lower and upper
     * limits.
     *
     * @param symbol The symbol to be used for this set.
     * @param lowerlimit The lower limit, use -1 for an undetermined (i.e. variable) lower limit.
     * @param upperlimit The upper limit, use -1 for an undetermined (i.e. variable) upper limit.
     */
    public IndexRangeSetImpl(String symbol,int lowerlimit, int upperlimit){
        if(lowerlimit<upperlimit){
            this.lowerlimit = lowerlimit;
            this.upperlimit = upperlimit;
        }else{
            this.lowerlimit = upperlimit;
            this.upperlimit = lowerlimit;
        }
    }

    /**
     * Returns true when the set is a variable set, i.e. when the range is indeterminate as in <code>[1,N]</code>.
     * @return True when the quantity is a variable, false otherwise.
     */
    @Override
    public boolean isVariable(){
        return this.lowerlimit<0 || this.upperlimit<0;
    }

    /**
     * Returns the lower limit of the index range.
     *
     * @return The lower limit.
     */
    @Override
    public int getLowerLimit() {
        return lowerlimit;
    }

    /**
     * Returns the upper limit of the index range.
     *
     * @return The upper limit or -1 if the upper limit is undetermined (i.e. <code>N</code>).
     */
    @Override
    public int getUpperLimit() {
        return upperlimit;
    }

    /**
     * Returns true when the specified index is contained in this set.
     * If one of the limits of the set is variable, it cannot be determined whether the value is part of the set, and
     * the method returns false.
     *
     * @param index The index to be tested.
     * @return True when it is contained in the set, false if it is unknown or is not contained in the set.
     */
    @Override
    public boolean contains(int index) {
        if(lowerlimit>0 && upperlimit>0) return index<=upperlimit && index>=lowerlimit;
        return false;
    }

    /**
     * Returns the size of the set or -1 if the size cannot be determined, e.g. when the upper limit of the set is
     * variable.
     *
     * @return The size of the set or -1 if it cannot be determined.
     */
    @Override
    public int size() {
        if(lowerlimit>0 && upperlimit>0) return upperlimit-lowerlimit+1;
        return -1;
    }
}
