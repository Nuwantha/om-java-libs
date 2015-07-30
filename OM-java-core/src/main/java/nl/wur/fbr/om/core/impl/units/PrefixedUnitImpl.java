package nl.wur.fbr.om.core.impl.units;

import nl.wur.fbr.om.model.units.PrefixedUnit;
import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.prefixes.BinaryPrefix;
import nl.wur.fbr.om.prefixes.DecimalPrefix;
import nl.wur.fbr.om.prefixes.JEDECBinaryPrefix;
import nl.wur.fbr.om.prefixes.Prefix;

/**
 * @author Don Willems on 28/07/15.
 */
public class PrefixedUnitImpl extends UnitMultipleImpl implements PrefixedUnit{

    /** The prefix used. */
    private Prefix prefix;

    /**
     * Creates a new prefixed unit, based on the specified singular unit and using the specified
     * prefix. For instance, the unit kilometre has as singular unit the metre and as prefix kilo.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     */
    public PrefixedUnitImpl(SingularUnit singularUnit, Prefix prefix){
        super(singularUnit,prefix.getFactor());
        if(singularUnit!=null && singularUnit.getSymbol()!=null){
            setSymbol(prefix.getSymbol() + singularUnit.getSymbol());
        }
        this.prefix = prefix;
    }

    /**
     * Creates a new prefixed unit, based on the specified singular unit and using the specified
     * prefix. For instance, the unit kilometre has as singular unit the metre and as prefix kilo.
     * The symbol for this unit is created by concatenating the prefix symbol with the symbol of the singular unit.
     * @param name The name of the unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     */
    public PrefixedUnitImpl(String name, SingularUnit singularUnit, Prefix prefix){
        super(name,singularUnit,prefix.getFactor());
        if(singularUnit!=null && singularUnit.getSymbol()!=null){
            setSymbol(prefix.getSymbol() + singularUnit.getSymbol());
        }
        this.prefix = prefix;
    }

    /**
     * Creates a new prefixed unit, based on the specified singular unit and using the specified
     * prefix. For instance, the unit kilometre has as singular unit the metre and as prefix kilo.
     * @param identifier The unique identifier for the unit.
     * @param name The name of the unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     */
    public PrefixedUnitImpl(String identifier, String name, SingularUnit singularUnit, Prefix prefix){
        super(identifier,name,null,singularUnit,prefix.getFactor());
        if(singularUnit!=null && singularUnit.getSymbol()!=null){
            setSymbol(prefix.getSymbol()+singularUnit.getSymbol());
        }
        this.prefix = prefix;
    }

    /**
     * Creates a new prefixed unit, based on the specified singular unit and using the specified
     * prefix. For instance, the unit kilometre has as singular unit the metre and as prefix kilo.
     * @param identifier The unique identifier for the unit.
     * @param name The name of the unit.
     * @param symbol The symbol of the unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     */
    public PrefixedUnitImpl(String identifier, String name, String symbol, SingularUnit singularUnit, Prefix prefix) {
        super(identifier,name,symbol,singularUnit,prefix.getFactor());
        this.prefix = prefix;
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
}
