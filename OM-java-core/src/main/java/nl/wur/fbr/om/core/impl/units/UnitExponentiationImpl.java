package nl.wur.fbr.om.core.impl.units;


import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.units.UnitExponentiation;

import java.util.Set;

/**
 * A unit that is defined as an exponentiation of another unit.
 * For instance, the unit exponentiation cubic metre (m^3) is the exponentiation (with exponent 3) of the unit
 * metre.
 *
 * @author Don Willems on 19/07/15.
 */
public class UnitExponentiationImpl extends UnitImpl implements UnitExponentiation {

    /** The base unit of the exponentiation. */
    private Unit base;

    /** The exponent. */
    private double exponent;


    /**
     * Creates a new unit exponentiation with the specified base unit and exponent.
     * @param base The base unit in the unit exponentiation.
     * @param exponent The exponent in the base exponentiation.
     */
    public UnitExponentiationImpl(Unit base, double exponent){
        super();
        this.base = base;
        this.exponent = exponent;
    }

    /**
     * Creates a new unit exponentiation with the specified base unit and exponent.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param base The base unit in the unit exponentiation.
     * @param exponent The exponent in the unit exponentiation.
     */
    public UnitExponentiationImpl(String name, String symbol, Unit base, double exponent){
        super(name,symbol);
        this.base = base;
        this.exponent = exponent;
    }

    /**
     * Creates a new unit exponentiation with the specified base unit and exponent.
     * @param identifier The unique identifier for this unit.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param base The base unit in the unit exponentiation.
     * @param exponent The exponent in the unit exponentiation.
     */
    public UnitExponentiationImpl(String identifier, String name, String symbol, Unit base, double exponent){
        super(identifier,name,symbol);
        this.base = base;
        this.exponent = exponent;
    }

    /**
     * Returns the base unit of the compound unit.
     * For instance, for the unit m^3, the base unit is m.
     *
     * @return The base unit.
     */
    @Override
    public Unit getBase() {
        return base;
    }

    /**
     * Returns the exponent of the unit exponentiation.
     * For instance, for the unit m^3, the exponent is 3.
     *
     * @return The exponent.
     */
    @Override
    public double getExponent() {
        return exponent;
    }

    /**
     * Returns the dimensions, and therefore, the dimensional exponents, in which this unit is defined.
     * For unit exponentiations, the dimensional exponents of the base unit are multiplied by the
     * exponent of the unit exponentiation. For instance the unit square metre has a SI dimension
     * Length (L) with exponent 2 (from the base unit metre which has exponent 1).<br>
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
        Dimension bmap = base.getUnitDimension();
        Set<BaseDimension> dims = bmap.getDimensions();
        for(BaseDimension dim : dims){
            int exp = bmap.getDimensionalExponent(dim);
            map.setDimensionalExponent(dim,exp*(int)getExponent());
        }
        return map;
    }

    /**
     * Test whether the specified object is equal to this Unit. If the object
     * is an instance of Unit, the identifiers are compared and if they are equal,
     * the units are equal. If not and if the object is also a {@link UnitExponentiation}, the base
     * units and exponents are tested if they are equal and if they are equal, the method returns true.
     * This check is needed for dimensionless units.
     * @param object The object to be compared to this unit.
     * @return True when the object is equal to this unit, false otherwise.
     */
    @Override
    public boolean equals(Object object){
        if(super.equals(object)) return true;
        if(object instanceof UnitExponentiation){
            UnitExponentiation umult = (UnitExponentiation)object;
            return getBase().equals(umult.getBase()) && getExponent()==umult.getExponent();
        }
        return false;
    }
}
