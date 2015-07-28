package nl.wur.fbr.om.core.impl.units;

import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.units.UnitMultiple;
import nl.wur.fbr.om.prefixes.BinaryPrefix;
import nl.wur.fbr.om.prefixes.DecimalPrefix;
import nl.wur.fbr.om.prefixes.JEDECBinaryPrefix;
import nl.wur.fbr.om.prefixes.Prefix;

/**
 * The core implementation of a unit multiple, which is a  unit that is multiplied by a standard factor specified by
 * a custom multiplication factor. For instance, the custom unit 125 g has a unit of gram, and a multiplication factor
 * of 125.
 * A special case of unit multiples are prefixed units where the multiplication factor is defined by the prefix used
 * such as kilo in kilogram. For prefixed units, use {@link PrefixedUnitImpl}.
 * @author Don Willems on 19/07/15.
 */
public class UnitMultipleImpl extends UnitImpl implements UnitMultiple {

    /** The unit which is multiplied. */
    private Unit unit;

    /** The multiplication factor with which the unit is multiplied. */
    private double factor;

    /**
     * Creates a new unit multiple, based on the specified unit and using the specified
     * multiplication factor. For instance, the custom unit 125 g has a unit of gram, and a multiplication factor
     * of 125.
     * @param unit The unit on which this unit multiple is based.
     * @param factor The multiplication factor.
     */
    public UnitMultipleImpl(Unit unit, double factor){
        super();
        this.unit = unit;
        this.factor = factor;
        if(unit!=null && unit.getSymbol()!=null){
            if(factor>1) {
                setSymbol("" + (int) factor + unit.getSymbol());
            }else{
                setSymbol("" + factor + unit.getSymbol());
            }
        }
    }

    /**
     * Creates a new unit multiple, based on the specified unit and using the specified
     * multiplication factor. For instance, the custom unit 125 g has a unit of gram, and a multiplication factor
     * of 125.
     * @param name The name of the unit.
     * @param unit The unit on which this unit is multiple based.
     * @param factor The multiplication factor.
     */
    public UnitMultipleImpl(String name, Unit unit, double factor){
        super(name,null);
        this.unit = unit;
        this.factor = factor;
        if(unit!=null && unit.getSymbol()!=null){
            if(factor>1) {
                setSymbol("" + (int) factor + unit.getSymbol());
            }else{
                setSymbol("" + factor + unit.getSymbol());
            }
        }
    }

    /**
     * Creates a new unit multiple, based on the specified unit and using the specified
     * multiplication factor. For instance, the custom unit 125 g has a unit of gram, and a multiplication factor
     * of 125.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param unit The unit on which this unit is multiple based.
     * @param factor The multiplication factor.
     */
    public UnitMultipleImpl(String name, String symbol, Unit unit, double factor){
        super(name,symbol);
        if(symbol==null && unit!=null && unit.getSymbol()!=null){
            if(factor>1) {
                setSymbol("" + (int) factor + unit.getSymbol());
            }else{
                setSymbol("" + factor + unit.getSymbol());
            }
        }
        this.unit = unit;
        this.factor = factor;
    }

    /**
     * Creates a new unit multiple, based on the specified unit and using the specified
     * multiplication factor. For instance, the custom unit 125 g has a unit of gram, and a multiplication factor
     * of 125.
     * @param identifier The unique identifier for the unit.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param unit The unit on which this unit is multiple based.
     * @param factor The multiplication factor.
     */
    public UnitMultipleImpl(String identifier, String name, String symbol, Unit unit, double factor){
        super(identifier,name,symbol);
        this.unit = unit;
        this.factor = factor;
    }

    /**
     * The  unit that is the basis for this unit multiple.
     * For instance, the unit multiple 125 g has a unit of g.
     *
     * @return The unit.
     */
    @Override
    public Unit getUnit() {
        return unit;
    }

    /**
     * Returns the value with which measures need to be multiplied when converting between this unit and its
     * basis unit.
     * For instance, the custom unit 125 g has a factor of 125.
     *
     * @return The factor.
     */
    @Override
    public double getFactor() {
        return factor;
    }
}
