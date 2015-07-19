package nl.wur.fbr.om.core.impl;

import nl.wur.fbr.om.model.SingularUnit;
import nl.wur.fbr.om.model.UnitMultiple;
import nl.wur.fbr.om.prefixes.BinaryPrefix;
import nl.wur.fbr.om.prefixes.DecimalPrefix;
import nl.wur.fbr.om.prefixes.JEDECBinaryPrefix;
import nl.wur.fbr.om.prefixes.Prefix;

/**
 * The core implementation of a unit multiple or prefixed unit.
 * A unit multiple or a prefixed unit is a singular unit that is multiplied by a standard factor specified by the
 * prefix. For instance, the unit kilometre (km) has a prefix kilo (k) which implies a conversion factor of 1000
 * to convert from metre to kilometre.
 * @author Don Willems on 19/07/15.
 */
public class UnitMultipleImpl extends UnitImpl implements UnitMultiple {

    /** The singular unit which is prefixed. */
    private SingularUnit singularUnit;

    /** The prefix used. */
    private Prefix prefix;

    /** The prefix factor with which the singular unit is multiplied. */
    private double prefixFactor;

    /**
     * Creates a new unit multiple or prefixes unit, based on the specified singular unit and using the specified
     * prefix. For instance, the unit kilometre has as singular unit the metre and as prefix kilo.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     */
    public UnitMultipleImpl(SingularUnit singularUnit, Prefix prefix){
        super();
        this.singularUnit = singularUnit;
        this.prefix = prefix;
        this.prefixFactor = prefix.getFactor();
    }

    /**
     * Creates a new unit multiple or prefixes unit, based on the specified singular unit and using the specified
     * prefix. For instance, the unit kilometre has as singular unit the metre and as prefix kilo.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     */
    public UnitMultipleImpl(String name, String symbol, SingularUnit singularUnit, Prefix prefix){
        super(name,symbol);
        this.singularUnit = singularUnit;
        this.prefix = prefix;
        this.prefixFactor = prefix.getFactor();
    }

    /**
     * Creates a new unit multiple or prefixes unit, based on the specified singular unit and using the specified
     * prefix. For instance, the unit kilometre has as singular unit the metre and as prefix kilo.
     * @param identifier The unique identifier for the unit.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     */
    public UnitMultipleImpl(String identifier, String name, String symbol, SingularUnit singularUnit, Prefix prefix){
        super(identifier,name,symbol);
        this.singularUnit = singularUnit;
        this.prefix = prefix;
        this.prefixFactor = prefix.getFactor();
    }

    /**
     * Creates a new unit multiple or prefixes unit, based on the specified singular unit and using the specified
     * prefix multiplication factor. A corresponding prefix that has the same multiplication factor is sought for.
     * For instance, the unit kilometre has as singular unit the metre and as prefix kilo with a multiplication factor
     * 1000.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefixFactor The prefix multiplication factor.
     */
    public UnitMultipleImpl(SingularUnit singularUnit, double prefixFactor){
        super();
        this.singularUnit = singularUnit;
        this.prefix = UnitMultipleImpl.findPrefixForFactor(prefixFactor);
        this.prefixFactor = prefixFactor;
    }

    /**
     * Creates a new unit multiple or prefixes unit, based on the specified singular unit and using the specified
     * prefix multiplication factor. A corresponding prefix that has the same multiplication factor is sought for.
     * For instance, the unit kilometre has as singular unit the metre and as prefix kilo with a multiplication factor
     * 1000.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefixFactor The prefix multiplication factor.
     */
    public UnitMultipleImpl(String name, String symbol, SingularUnit singularUnit, double prefixFactor){
        super(name,symbol);
        this.singularUnit = singularUnit;
        this.prefix = UnitMultipleImpl.findPrefixForFactor(prefixFactor);
        this.prefixFactor = prefixFactor;
    }

    /**
     * Creates a new unit multiple or prefixes unit, based on the specified singular unit and using the specified
     * prefix multiplication factor. A corresponding prefix that has the same multiplication factor is sought for.
     * For instance, the unit kilometre has as singular unit the metre and as prefix kilo with a multiplication factor
     * 1000.
     * @param identifier The unique identifier for the unit.
     * @param name The name of the unit.
     * @param symbol The symbol used for the unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefixFactor The prefix multiplication factor.
     */
    public UnitMultipleImpl(String identifier, String name, String symbol, SingularUnit singularUnit, double prefixFactor){
        super(identifier,name,symbol);
        this.singularUnit = singularUnit;
        this.prefix = UnitMultipleImpl.findPrefixForFactor(prefixFactor);
        this.prefixFactor = prefixFactor;
    }

    /**
     * The singular unit that is prefixed.
     * For instance, the unit km has a base unit of m.
     *
     * @return The base unit.
     */
    @Override
    public SingularUnit getSingularUnit() {
        return singularUnit;
    }

    /**
     * Returns the @link{Prefix Prefix} used for this unit.
     * Prefixes can be both decimal (see {@link DecimalPrefix DecimalPrefix}) or
     * binary (see {@link BinaryPrefix BinaryPrefix} or
     * {@link JEDECBinaryPrefix JEDEXBinaryPrefix}). If the prefix factor does not correspond to one of the
     * known prefixes, null will be returned by this method.
     *
     * @return The prefix.
     */
    @Override
    public Prefix getPrefix() {
        return prefix;
    }

    /**
     * Returns the value with which measures need to be multiplied when converting to this prefixed unit and its
     * singular unit.
     * For instance, the unit km has a prefix factor of 1000.
     *
     * @return The prefix factor.
     */
    @Override
    public double getPrefixFactor() {
        return prefixFactor;
    }

    /**
     * Searches for a prefix with the specified factor in the set of known prefixes.
     * @param factor The prefix factor.
     * @return The corresponding prefix.
     */
    private static Prefix findPrefixForFactor(double factor){
        DecimalPrefix[] dprefixes = DecimalPrefix.values();
        for(int i=0;i<dprefixes.length;i++){
            if(dprefixes[i].getFactor()==factor) return dprefixes[i];
        }
        BinaryPrefix[] bprefixes = BinaryPrefix.values();
        for(int i=0;i<bprefixes.length;i++){
            if(bprefixes[i].getFactor()==factor) return bprefixes[i];
        }
        return null;
    }
}
