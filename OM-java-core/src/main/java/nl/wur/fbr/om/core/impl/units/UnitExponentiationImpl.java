package nl.wur.fbr.om.core.impl.units;


import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.units.UnitExponentiation;

/**
 * A unit that is defined as an exponentiation of another unit.
 * For instance, the unit exponentiation cubic metre (m^3) is the exponentiation (with exponent 3) of the unit
 * metre.
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
}
