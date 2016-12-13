package nl.wur.fbr.om.core.impl.quantities;

import nl.wur.fbr.om.core.impl.measures.MeasureImpl;
import nl.wur.fbr.om.exceptions.QuantityCreationException;
import nl.wur.fbr.om.model.UnitAndScaleSet;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.quantities.Index;
import nl.wur.fbr.om.model.quantities.IndexSet;
import nl.wur.fbr.om.model.quantities.QuantityClass;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Don Willems on 11/10/15.
 */
public class IndexSetImpl extends AbstractQuantity implements IndexSet {

    private QuantityClass qclass = new QuantityClass() {
        private Dimension emptyDim = new Dimension();
        private Set<Object> units = new HashSet<>();
        @Override
        public Dimension getDimension() {
            return emptyDim;
        }
        @Override
        public boolean isDimensionless() {
            return true;
        }
        @Override
        public Object getPreferredUnitOrScale() {
            return null;
        }
        @Override
        public Set<Object> getUnitsOrScales(UnitAndScaleSet set) {
            return units;
        }
        @Override
        public Class getClassForQuantityClass() {
            return IndexImpl.class;
        }

        @Override
        public String getIdentifier() {
            return "INDEX_SET";
        }
        @Override
        public String getName() {
            return "index set";
        }
        @Override
        public List<String> getAlternativeNames() {
            return null;
        }

        @Override
        public String getName(String language) {
            return "index set";
        }

        @Override
        public List<String> getLanguages() {
            return null;
        }

        @Override
        public List<String> getAlternativeNames(String language) {
            return null;
        }

        @Override
        public void addAlternativeName(String name, String language) {
            return;
        }

        @Override
        public String getSymbol() {
            return "I";
        }

        @Override
        public void setSymbol(String symbol) {

        }

        @Override
        public List<String> getAlternativeSymbols() {
            return null;
        }

        @Override
        public void addAlternativeSymbol(String symbol) {

        }
    };

    private Set<Integer> indices = new HashSet<>();
    private Set<IndexSet> subsets = new HashSet<>();
    private boolean variable = false;

    /**
     * Creates an index set without specifying values.
     * As long as no values are added, this index set is a variable set.
     */
    public IndexSetImpl(){
        variable = true;
    }

    /**
     * Creates an new index set with the specified indices.
     *
     * @param index The indexes to be added initially.
     */
    public IndexSetImpl(int... index){
        for(int i=0;i<index.length;i++){
            indices.add(index[i]);
        }
    }

    /**
     * Creates an empty index set with the specified symbol.
     *
     * @param symbol The symbol used for the set.
     */
    public IndexSetImpl(String symbol){
        super("index set",symbol);
        variable = true;
    }

    /**
     * Creates an new index set with the specified indices and with the specified symbol.
     *
     * @param symbol The symbol used for the set.
     * @param index The indexes to be added initially.
     */
    public IndexSetImpl(String symbol,int... index){
        for(int i=0;i<index.length;i++){
            indices.add(index[i]);
        }
    }

    /**
     * Creates an new index set with the specified subsets.
     *
     * @param subset The subsets to be added initially.
     */
    public IndexSetImpl(IndexSet... subset){
        for(int i=0;i<subset.length;i++){
            subsets.add(subset[i]);
        }
    }

    /**
     * Creates an new index set with the specified subsets.
     *
     * @param subset The subsets to be added initially.
     * @param subset The subsets to be added initially.
     */
    public IndexSetImpl(String symbol,IndexSet... subset){
        for(int i=0;i<subset.length;i++){
            subsets.add(subset[i]);
        }
    }

    /**
     * Adds an index to the set.
     * @param index The index.
     */
    public void addIndex(int index){
        variable = false;
        indices.add(index);
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
        boolean cont = indices.contains(index);
        if(cont) return true;
        for(IndexSet subset : subsets){
            if(subset.contains(index)) return true;
        }
        return false;
    }

    /**
     * Returns true when the quantity is a variable (in an expression or equation), i.e. when the value has not been
     * set.
     * @return True when the quantity is a variable, false otherwise.
     */
    @Override
    public boolean isVariable(){
        if(variable) return true;
        for(IndexSet subset : subsets){
            if(subset.isVariable()) return true;
        }
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
        return indices.size();
    }

    /**
     * Returns the {@link QuantityClass} for which this quantity is an instance.
     *
     * @return The quantity class.
     */
    @Override
    public QuantityClass getQuantityClass() {
        return qclass;
    }
}
