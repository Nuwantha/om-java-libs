package nl.wur.fbr.om.model.dimensions;

import nl.wur.fbr.om.model.units.Unit;

import java.util.HashMap;
import java.util.Set;

/**
 * This class defines the dimension of a unit or quantity.
 * The dimensions of the derived units and quantities are written as products of powers of the dimensions of the
 * base quantities or units using the equations that relate the derived units or quantities to the base units or
 * quantities. In SI the dimension of any unit U is written in the form of a dimensional product,
 * dim U = L^&#945; M^&#946; T^&#947; l^&#948; &#920;^&#949; N^&#950; J^eta
 * where the exponents &#945;, &#946;, &#947;, &#948;, &#949;, &#950;, and &#951;, which are generally small integers
 * which can be positive, negative or zero, are called the dimensional exponents.
 * [ref:<a href="http://www.bipm.org/en/publications/si-brochure/section1-3.html">BIPM</a>] <br>
 * The dimensional exponents for a specific unit can be accessed via the method {@link Unit#getUnitDimension()}
 * in implementations of the {@link Unit} interface.
 * @author Don Willems on 02/08/15.
 */
public class DimensionMap extends HashMap {

    /**
     * Returns the dimensions in this map.
     * @return The dimensions.
     */
    public Set<Dimension> getDimensions(){
        return super.keySet();
    }

    /**
     * Returns the dimensional exponent for the specified dimension.
     * @param dimension The dimension.
     * @return The dimensional exponent.
     */
    public int getDimensionalExponent(Dimension dimension){
        Number exp = (Number)super.get(dimension);
        if(exp==null) return 0;
        return exp.intValue();
    }

    /**
     * Sets the dimensional exponent for a specific dimension.
     * @param dimension The dimension.
     * @param dimensionalExponent The dimensional exponent.
     */
    public void setDimensionalExponent(Dimension dimension, int dimensionalExponent){
        if(dimensionalExponent==0){
            super.remove(dimension);
        }
        super.put(dimension,dimensionalExponent);
    }

    /**
     * Tests whether the dimension maps have the same dimensions and have equal exponents.
     * These dimensions need to be equal for instance for unit conversion.
     * @param object The object to be tested for equality.
     * @return True when the dimensions are equal, false otherwise.
     */
    @Override
    public boolean equals(Object object){
        if(object instanceof DimensionMap) {
            DimensionMap map = (DimensionMap)object;
            Set<Dimension> dims = this.getDimensions();
            Set<Dimension> odims = map.getDimensions();
            if (dims.size() != odims.size()) return false;
            for (Dimension dim : dims) {
                int exp = this.getDimensionalExponent(dim);
                int oexp = this.getDimensionalExponent(dim);
                if (exp != oexp) return false;
            }
            return true;
        }
        return false;
    }
}
