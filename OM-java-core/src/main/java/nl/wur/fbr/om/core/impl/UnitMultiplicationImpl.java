package nl.wur.fbr.om.core.impl;

import nl.wur.fbr.om.model.Unit;
import nl.wur.fbr.om.model.UnitMultiplication;

/**
 * The core implementation for Unit multiplication, which is a compound unit consisting of two base units that are multiplied.
 * For instance, the unit Newton metre (N.m) is a multiplication of Newton (N) and metre (m).
 * @author Don Willems on 19/07/15.
 */
public class UnitMultiplicationImpl extends UnitImpl implements UnitMultiplication {

    /** The first unit in the unit multiplication. */
    private Unit unit1;

    /** The second unit in the unit multiplication. */
    private Unit unit2;

    /**
     * Creates a new unit multiplication with the two specified units.
     * @param unit1 The first unit in the unit multiplication.
     * @param unit2 The second unit in the unit multiplication.
     */
    public UnitMultiplicationImpl(Unit unit1, Unit unit2){
        super();
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    /**
     * Creates a new unit multiplication with the two specified units.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param unit1 The first unit in the unit multiplication.
     * @param unit2 The second unit in the unit multiplication.
     */
    public UnitMultiplicationImpl(String name, String symbol, Unit unit1, Unit unit2){
        super(name,symbol);
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    /**
     * Creates a new unit multiplication with the two specified units.
     * @param identifier The unique identifier for this unit.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param unit1 The first unit in the unit multiplication.
     * @param unit2 The second unit in the unit multiplication.
     */
    public UnitMultiplicationImpl(String identifier, String name, String symbol, Unit unit1, Unit unit2){
        super(identifier,name,symbol);
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    /**
     * Returns the first unit used in the unit multiplication.
     * The order (first and second) does not matter.
     * For instance, for the unit multiplication N.m, the first unit is N.
     *
     * @return The first unit in the multiplication.
     */
    @Override
    public Unit getUnit1() {
        return unit1;
    }

    /**
     * Returns the second unit used in the unit multiplication.
     * The order (first and second) does not matter.
     * For instance, for the unit multiplication N.m, the second unit is m.
     *
     * @return The second unit in the multiplication.
     */
    @Override
    public Unit getUnit2() {
        return unit2;
    }
}
