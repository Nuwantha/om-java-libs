package nl.wur.fbr.om.core.impl;

import nl.wur.fbr.om.model.Unit;
import nl.wur.fbr.om.model.UnitDivision;

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
}
