package nl.wur.fbr.om.core.impl.units;


import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.units.UnitMultiplication;

import java.util.Set;

/**
 * The core implementation for Unit multiplication, which is a compound unit consisting of two base units that are multiplied.
 * For instance, the unit Newton metre (N.m) is a multiplication of Newton (N) and metre (m).
 * @author Don Willems on 19/07/15.
 */
public class UnitMultiplicationImpl extends UnitImpl implements UnitMultiplication {

    /** The first unit in the unit multiplication. */
    private Unit term1;

    /** The second unit in the unit multiplication. */
    private Unit term2;

    /**
     * Creates a new unit multiplication with the two specified units.
     * @param term1 The first unit term in the unit multiplication.
     * @param term2 The second unit term in the unit multiplication.
     */
    public UnitMultiplicationImpl(Unit term1, Unit term2){
        super();
        this.term1 = term1;
        this.term2 = term2;
    }

    /**
     * Creates a new unit multiplication with the two specified units.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param term1 The first unit term in the unit multiplication.
     * @param term2 The second unit term in the unit multiplication.
     */
    public UnitMultiplicationImpl(String name, String symbol, Unit term1, Unit term2){
        super(name,symbol);
        this.term1 = term1;
        this.term2 = term2;
    }

    /**
     * Creates a new unit multiplication with the two specified units.
     * @param identifier The unique identifier for this unit.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param term1 The first unit term in the unit multiplication.
     * @param term2 The second unit term in the unit multiplication.
     */
    public UnitMultiplicationImpl(String identifier, String name, String symbol, Unit term1, Unit term2){
        super(identifier,name,symbol);
        this.term1 = term1;
        this.term2 = term2;
    }

    /**
     * Returns the first unit term used in the unit multiplication.
     * The order (first and second) does not matter.
     * For instance, for the unit multiplication N.m, the first unit is N.
     *
     * @return The first unit term in the multiplication.
     */
    @Override
    public Unit getTerm1() {
        return term1;
    }

    /**
     * Returns the second term unit used in the unit multiplication.
     * The order (first and second) does not matter.
     * For instance, for the unit multiplication N.m, the second unit is m.
     *
     * @return The second unit term in the multiplication.
     */
    @Override
    public Unit getTerm2() {
        return term2;
    }

    /**
     * Returns the dimensions, and therefore, the dimensional exponents, in which this unit is defined.
     * The dimension of unit multiplication are a combination of the dimensions of the <code>term1</code> and
     * <code>term2</code> units. Each of the dimensions is added with the same exponent.
     * For instance, the unit newton metre has the SI dimension
     * Length (L) with exponent +2 from the <code>term1</code> unit Newton (which is metre per second squared) and from
     * the <code>term2</code> unit metre (+1 + +1 = +2) and the SI dimension Time (T) with exponent
     * -2 from the <code>term1</code> unit Newton.<br>
     * The dimensions of the derived units are written as products of powers of the dimensions of the
     * base units using the equations that relate the derived units to the base units or
     * quantities. In SI the dimension of any unit U is written in the form of a dimensional product,
     * dim U = L^&#945; M^&#946; T^&#947; l^&#948; &#920;^&#949; N^&#950; J^eta
     * where the exponents &#945;, &#946;, &#947;, &#948;, &#949;, &#950;, and &#951;, which are generally small integers
     * which can be positive, negative or zero, are called the dimensional exponents.
     *
     * @return The set of dimensions and dimensional exponents.
     */
    @Override
    public Dimension getUnitDimension() {
        Dimension map = new Dimension();
        Dimension map1 = getTerm1().getUnitDimension();
        Dimension map2 = getTerm2().getUnitDimension();
        Set<BaseDimension> dims1 = map1.getDimensions();
        for(BaseDimension dim : dims1){
            int exp = map1.getDimensionalExponent(dim);
            map.setDimensionalExponent(dim,exp);
        }
        Set<BaseDimension> dims2 = map2.getDimensions();
        for(BaseDimension dim : dims2){
            int exp = map2.getDimensionalExponent(dim);
            int eee = map.getDimensionalExponent(dim);
            map.setDimensionalExponent(dim,eee+exp);
        }
        return map;
    }
}
