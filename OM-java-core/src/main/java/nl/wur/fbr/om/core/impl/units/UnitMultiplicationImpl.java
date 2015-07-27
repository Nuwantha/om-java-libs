package nl.wur.fbr.om.core.impl.units;


import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.units.UnitMultiplication;

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
}
