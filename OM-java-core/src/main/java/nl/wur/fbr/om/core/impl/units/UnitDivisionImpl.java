package nl.wur.fbr.om.core.impl.units;


import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.dimensions.DimensionMap;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.units.UnitDivision;

import java.util.Set;

/**
 * The core implementation of a compound unit that is the division of two other units.
 * For instance, the unit used for denstiy, kilogram per
 * cubic metre is a unit division of the numerator kilogram and the denominator cubic metre.
 * @author Don Willems on 19/07/15.
 */
public class UnitDivisionImpl extends UnitImpl implements UnitDivision {

    /** The numerator unit in the unit division. */
    private Unit numerator;

    /** The denominator unit in the unit division. */
    private Unit denominator;

    /**
     * Creates a new unit division with the specified numerator and denominator.
     * @param numerator The numerator unit in the unit division.
     * @param denominator The denominator unit in the unit division.
     */
    public UnitDivisionImpl(Unit numerator, Unit denominator){
        super();
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Creates a new unit division with the specified numerator and denominator.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param numerator The numerator unit in the unit division.
     * @param denominator The denominator unit in the unit division.
     */
    public UnitDivisionImpl(String name, String symbol, Unit numerator, Unit denominator){
        super(name,symbol);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Creates a new unit division with the specified numerator and denominator.
     * @param identifier The unique identifier for this unit.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param numerator The numerator unit in the unit division.
     * @param denominator The denominator unit in the unit division.
     */
    public UnitDivisionImpl(String identifier, String name, String symbol, Unit numerator, Unit denominator){
        super(identifier,name,symbol);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * The Unit used in the numerator of the compound unit.
     * For instance, for the unit kg/m^3, the numerator unit is kg.
     *
     * @return The numerator.
     */
    @Override
    public Unit getNumerator() {
        return numerator;
    }

    /**
     * The Unit used in the denominator of the compound unit.
     * For instance, for the unit kg/m^3, the denominator unit is m^3.
     *
     * @return The denominator.
     */
    @Override
    public Unit getDenominator() {
        return denominator;
    }

    /**
     * Returns the dimensions, and therefore, the dimensional exponents, in which this unit is defined.
     * The dimension of unit divisions are a combination of the dimensions of the numerator and denominator
     * units. Each of the numerator dimensions is added with the same exponent, while the denominator
     * dimensions are subtracted. For instance, the unit kilometre per square second has the SI dimension
     * Length (L) with exponent +1 from the numerator kilometre and the SI dimension Time (T) with exponent
     * -2 from the denominator square second (which has exponent +2). The exponent for time is negative (from +2
     * to -2) because the unit is divided by the denominator unit.<br>
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
    public DimensionMap getUnitDimension() {
        DimensionMap map = new DimensionMap();
        DimensionMap map1 = getNumerator().getUnitDimension();
        DimensionMap map2 = getDenominator().getUnitDimension();
        Set<Dimension> dims1 = map1.getDimensions();
        for(Dimension dim : dims1){
            int exp = map1.getDimensionalExponent(dim);
            map.setDimensionalExponent(dim,exp);
        }
        Set<Dimension> dims2 = map2.getDimensions();
        for(Dimension dim : dims2){
            int exp = map2.getDimensionalExponent(dim);
            int eee = map.getDimensionalExponent(dim);
            map.setDimensionalExponent(dim,eee-exp);
        }
        return map;
    }
}
