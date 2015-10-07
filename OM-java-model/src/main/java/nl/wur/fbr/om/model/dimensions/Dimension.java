package nl.wur.fbr.om.model.dimensions;

import nl.wur.fbr.om.model.units.Unit;

import java.util.HashMap;
import java.util.Set;

/**
 * This class defines the dimension of a unit or quantity.
 * The dimensions of the derived units and quantities are written as products of powers of the base dimensions of the
 * base quantities or units using the equations that relate the derived units or quantities to the base units or
 * quantities. In SI the dimension of any unit U is written in the form of a dimensional product,
 * dim U = L<sup>&#945;</sup> M<sup>&#946;</sup> T<sup>&#947;</sup> l<sup>&#948;</sup> &#920;<sup>&#949;</sup> N<sup>&#950;</sup> J<sup>&#951;</sup>
 * where the exponents &#945;, &#946;, &#947;, &#948;, &#949;, &#950;, and &#951;, which are generally small integers
 * which can be positive, negative or zero, and are called the dimensional exponents.
 * [ref:<a href="http://www.bipm.org/en/publications/si-brochure/section1-3.html">BIPM</a>] <br>
 * The dimensional exponents for a specific unit can be accessed via the method {@link Unit#getUnitDimension()}
 * in implementations of the {@link Unit} interface.
 * @author Don Willems on 02/08/15.
 */
public class Dimension extends HashMap {

    /**
     * Returns the base dimensions in this dimension.
     * @return The base dimensions.
     */
    public Set<BaseDimension> getDimensions(){
        return super.keySet();
    }

    /**
     * Returns true when this dimension is empty, i.e. is dimensionless.
     * This is true when the dimension does not contain dimensional exponents, or when
     * all dimensional exponents are 0.
     * @return True when the dimension is dimensionless, or false if not.
     */
    public boolean isDimensionless(){
        Set<BaseDimension> bases = super.keySet();
        if(bases.size()==0) return true;
        for(BaseDimension baseDimension : bases){
            if(this.getDimensionalExponent(baseDimension)!=0) return false;
        }
        return true;
    }

    /**
     * Returns the dimensional exponent for the specified base dimension.
     * @param baseDimension The base dimension.
     * @return The dimensional exponent.
     */
    public double getDimensionalExponent(BaseDimension baseDimension){
        Number exp = (Number)super.get(baseDimension);
        if(exp==null) return 0;
        return exp.doubleValue();
    }

    /**
     * Sets the dimensional exponent for a specific base dimension.
     * @param baseDimension The base dimension.
     * @param dimensionalExponent The dimensional exponent.
     */
    public void setDimensionalExponent(BaseDimension baseDimension, double dimensionalExponent){
        if(dimensionalExponent==0){
            super.remove(baseDimension);
        }
        super.put(baseDimension,dimensionalExponent);
    }

    /**
     * Tests whether this dimension is the same as the specified dimension and have equal exponents of the base dimensions.
     * These dimensions need to be equal for instance for unit conversion.
     * @param object The object to be tested for equality.
     * @return True when the dimensions are equal, false otherwise.
     */
    @Override
    public boolean equals(Object object){
        if(object instanceof Dimension) {
            Dimension map = (Dimension)object;
            Set<BaseDimension> dims = this.getDimensions();
            Set<BaseDimension> odims = map.getDimensions();
            if (dims.size() != odims.size()) return false;
            for (BaseDimension dim : dims) {
                double exp = this.getDimensionalExponent(dim);
                double oexp = map.getDimensionalExponent(dim);
                if (Math.abs(exp-oexp)>0.0000001) return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns a string representation of the dimension of the unit or quantity.
     * It is a combination of the symbols of the base dimensions and the exponents.
     * For instance, metre per second squared has two base dimensions, length (L) and
     * time (T) with exponents +1 and -2 respectively. The string representation
     * will be D[L+1, T-2].
     * @return The string representation.
     */
    @Override
    public String toString(){
        Set<BaseDimension> dims = this.getDimensions();
        String str = "D[";
        boolean first = true;
        for(BaseDimension dim : dims){
            String symb = dim.getSymbol();
            double exponent = this.getDimensionalExponent(dim);
            if(exponent!=0) {
                String exp="";
                double abs = Math.abs(exponent);
                if (abs >= 1) {
                    exp = ""+(int)(abs+0.5);
                }else{
                    exp = "1/"+(int)(1/abs+0.5);
                }
                String es = "";
                if (exponent > 0) {
                    es = "+" + exp;
                } else {
                    es = "-" + exp;
                }
                if (!first) str += ", ";
                str += symb + es;
                first = false;
            }
        }
        str+="]";
        return str;
    }
}
