package nl.wur.fbr.om.core.impl.quantities;

import nl.wur.fbr.om.core.impl.measures.MeasureImpl;
import nl.wur.fbr.om.core.impl.units.BaseUnitImpl;
import nl.wur.fbr.om.exceptions.QuantityCreationException;
import nl.wur.fbr.om.model.UnitAndScaleSet;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.quantities.Index;
import nl.wur.fbr.om.model.quantities.QuantityClass;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Implements an Index as a dimensionless quantity. This class allows easy creation of Index quantities with
 * only index values (integers) as parameters.
 *
 * @author Don Willems on 11/10/15.
 */
public class IndexImpl extends AbstractQuantity implements Index {

    private int indexValue = -1;

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
            return "INDEX";
        }
        @Override
        public String getName() {
            return "index";
        }
        @Override
        public List<String> getAlternativeNames() {
            return null;
        }

        @Override
        public String getName(String language) {
            return "index";
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
            return "i";
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

    /**
     * Creates a new variable index with symbol 'i'.
     */
    public IndexImpl(){
        this.indexValue = -1;
    }

    /**
     * Creates a new index 'i' with the specified value.
     *
     * @param indexValue The value of the index.
     * @throws QuantityCreationException When the index could not be created.
     */
    public IndexImpl(int indexValue) throws QuantityCreationException {
        super("index","i",new MeasureImpl(indexValue,new BaseUnitImpl("ONE","1",null)));
        this.indexValue = indexValue;
    }

    /**
     * Creates a new variable index with the specified symbol.
     *
     * @param symbol The symbol used for this index.
     */
    public IndexImpl(String symbol){
        super("index",symbol);
        this.indexValue = -1;
    }

    /**
     * Creates a new index with the specified value and using the specified symbol.
     *
     * @param symbol The symbol used for this index.
     * @param indexValue The value of the index.
     * @throws QuantityCreationException When the index could not be created.
     */
    public IndexImpl(String symbol,int indexValue) throws QuantityCreationException {
        super("index",symbol,new MeasureImpl(indexValue,new BaseUnitImpl("ONE","1",null)));
        this.indexValue = indexValue;
    }

    /**
     * Returns true when the quantity is a variable (in an expression or equation), i.e. when the value has not been
     * set.
     * @return True when the quantity is a variable, false otherwise.
     */
    @Override
    public boolean isVariable(){
        if(this.indexValue<0) return true;
        return false;
    }

    /**
     * Returns the value of the index, or -1 if the index is not set, i.e. if the index is a variable.
     *
     * @return The index.
     */
    @Override
    public int getIndexValue() {
        return indexValue;
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
