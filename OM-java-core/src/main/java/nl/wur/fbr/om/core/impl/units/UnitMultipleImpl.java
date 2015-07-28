package nl.wur.fbr.om.core.impl.units;

import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.units.UnitMultiple;
import nl.wur.fbr.om.prefixes.BinaryPrefix;
import nl.wur.fbr.om.prefixes.DecimalPrefix;
import nl.wur.fbr.om.prefixes.JEDECBinaryPrefix;
import nl.wur.fbr.om.prefixes.Prefix;

/**
 * The core implementation of a unit multiple or prefixed unit.
 * A unit multiple or a prefixed unit is a singular unit that is multiplied by a standard factor specified by the
 * prefix or by a custom multiplication factor. For instance, the unit kilometre (km) has a prefix kilo (k) which
 * implies a conversion factor of 1000 to convert from metre to kilometre. A custom unit 125 g has a no prefix (null)
 * and a unit of gram, and a multiplication factor of 125.
 * @author Don Willems on 19/07/15.
 */
public class UnitMultipleImpl extends UnitImpl implements UnitMultiple {

    /** The unit which is prefixed. */
    private Unit unit;

    /** The prefix used. */
    private Prefix prefix;

    /** The prefix factor with which the singular unit is multiplied. */
    private double factor;

    /**
     * Creates a new unit multiple or prefixes unit, based on the specified singular unit and using the specified
     * prefix. For instance, the unit kilometre has as singular unit the metre and as prefix kilo.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     */
    public UnitMultipleImpl(SingularUnit singularUnit, Prefix prefix){
        super();
        this.unit = singularUnit;
        this.prefix = prefix;
        this.factor = prefix.getFactor();
    }

    /**
     * Creates a new unit multiple or prefixes unit, based on the specified singular unit and using the specified
     * prefix. For instance, the unit kilometre has as singular unit the metre and as prefix kilo.
     * The symbol for this unit is created by concatenating the prefix symbol with the symbol of the singular unit.
     * @param name The name of the unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     */
    public UnitMultipleImpl(String name, SingularUnit singularUnit, Prefix prefix){
        super(name,null);
        if(singularUnit!=null && singularUnit.getSymbol()!=null){
            addAlternativeSymbol(prefix.getSymbol()+singularUnit.getSymbol());
        }
        this.unit = singularUnit;
        this.prefix = prefix;
        this.factor = prefix.getFactor();
    }

    /**
     * Creates a new unit multiple or prefixes unit, based on the specified singular unit and using the specified
     * prefix. For instance, the unit kilometre has as singular unit the metre and as prefix kilo.
     * @param identifier The unique identifier for the unit.
     * @param name The name of the unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     */
    public UnitMultipleImpl(String identifier, String name, SingularUnit singularUnit, Prefix prefix){
        super(identifier,name,null);
        if(singularUnit!=null && singularUnit.getSymbol()!=null){
            addAlternativeSymbol(prefix.getSymbol()+singularUnit.getSymbol());
        }
        this.unit = singularUnit;
        this.prefix = prefix;
        this.factor = prefix.getFactor();
    }

    /**
     * Creates a new unit multiple or prefixes unit, based on the specified singular unit and using the specified
     * prefix. For instance, the unit kilometre has as singular unit the metre and as prefix kilo.
     * @param identifier The unique identifier for the unit.
     * @param name The name of the unit.
     * @param symbol The symbol of the unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     */
    public UnitMultipleImpl(String identifier, String name, String symbol, SingularUnit singularUnit, Prefix prefix) {
        super(identifier,name,symbol);
        this.unit = singularUnit;
        this.prefix = prefix;
        this.factor = prefix.getFactor();
    }

    /**
     * Creates a new unit multiple or prefixes unit, based on the specified singular unit and using the specified
     * prefix multiplication factor. A corresponding prefix that has the same multiplication factor is sought for.
     * For instance, the unit kilometre has as singular unit the metre and as prefix kilo with a multiplication factor
     * 1000.
     * @param unit The unit on which this unit multiple is based.
     * @param factor The multiplication factor.
     */
    public UnitMultipleImpl(Unit unit, double factor){
        super();
        this.unit = unit;
        this.prefix = null;
        this.factor = factor;
    }

    /**
     * Creates a new unit multiple or prefixes unit, based on the specified singular unit and using the specified
     * prefix multiplication factor. A corresponding prefix that has the same multiplication factor is sought for.
     * For instance, the unit kilometre has as singular unit the metre and as prefix kilo with a multiplication factor
     * 1000.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param unit The unit on which this unit is multiple based.
     * @param factor The multiplication factor.
     */
    public UnitMultipleImpl(String name, String symbol, Unit unit, double factor){
        super(name,symbol);
        this.unit = unit;
        this.prefix = null;
        this.factor = factor;
    }

    /**
     * Creates a new unit multiple or prefixes unit, based on the specified singular unit and using the specified
     * prefix multiplication factor. A corresponding prefix that has the same multiplication factor is sought for.
     * For instance, the unit kilometre has as singular unit the metre and as prefix kilo with a multiplication factor
     * 1000.
     * @param identifier The unique identifier for the unit.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param unit The unit on which this unit is multiple based.
     * @param factor The multiplication factor.
     */
    public UnitMultipleImpl(String identifier, String name, String symbol, Unit unit, double factor){
        super(identifier,name,symbol);
        this.unit = unit;
        this.prefix = null;
        this.factor = factor;
    }

    /**
     * The singular unit that is prefixed.
     * For instance, the unit km has a unit of m.
     *
     * @return The base unit.
     */
    @Override
    public Unit getUnit() {
        return unit;
    }

    /**
     * Returns the @link{Prefix Prefix} used for this unit.
     * Prefixes can be both decimal (see {@link DecimalPrefix DecimalPrefix}) or
     * binary (see {@link BinaryPrefix BinaryPrefix} or
     * {@link JEDECBinaryPrefix JEDEXBinaryPrefix}). If the UnitMultiple was created with a custom multiplication factor,
     * e.g. for the custom unit 125 g, this method will return null.
     *
     * @return The prefix.
     */
    @Override
    public Prefix getPrefix() {
        return prefix;
    }

    /**
     * Returns the value with which measures need to be multiplied when converting to this prefixed unit and its
     * unit.
     * For instance, the unit km has a factor of 1000. The custom unit 125 g has a factor of 125.
     *
     * @return The factor.
     */
    @Override
    public double getFactor() {
        return factor;
    }
}
