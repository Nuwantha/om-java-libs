package nl.wur.fbr.om.model.units;


import nl.wur.fbr.om.model.NamedObject;
import nl.wur.fbr.om.model.dimensions.Dimension;

/**
 * A unit of measure is defined in terms of a quantity, directly or indirectly via other units.
 * It is used as a standard for measurement of the same quantity, where any other value of the quantity can be
 * expressed as a simple multiple of the unit of measure. For example, length is a quantity; the metre is a unit of
 * length that represents a definite predetermined length. When we say 10 metre (or 10 m), we actually mean 10 times
 * the definite predetermined length called "metre".
 *
 * @author Don Willems on 14/07/15.
 */
public interface Unit extends NamedObject {

    /**
     * Returns the dimension, and therefore, the dimensional exponents, in which this unit is defined.<br>
     * The dimension of derived units are written as products of powers of the base dimensions of the
     * base units using the equations that relate the derived units to the base units or
     * quantities. In SI the dimension of any unit U is written in the form of a dimensional product,
     * dim U = L^&#945; M^&#946; T^&#947; l^&#948; &#920;^&#949; N^&#950; J^eta
     * where the exponents &#945;, &#946;, &#947;, &#948;, &#949;, &#950;, and &#951;, which are generally small integers
     * which can be positive, negative or zero, are called the dimensional exponents.
     * <br>
     * <b>For implementations</b>: For base units the base dimension in which the unit is defined is known. Implementations
     * for base units (see interface {@link BaseUnit}) should return a Dimension with only one dimension (the
     * base dimension) and a dimensional exponent for that base dimension of 1.<br>
     * For derived units, the dimension can be calculated. For instance for the unit metre per second, which is a
     * {@link UnitDivision} with numerator metre and a denominator second, a dimension with two base dimensions
     * (Length (L) and Time (T)) should be returned with exponents 1 and -1 respectively. The exponent for the time
     * dimension is negative because the time is in the denominator of the unit division.
     *
     * @return The set of dimensions and dimensional exponents.
     */
    public Dimension getUnitDimension();

    /**
     * This method returns true when the unit is dimensionless. Dimensionless units are for instance unit divisions such
     * as m/m or s^2/s^2.
     * @return True when the unit is dimensionless, false otherwise.
     */
    public boolean isDimensionless();

}
