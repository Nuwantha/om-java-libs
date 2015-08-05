package nl.wur.fbr.om.core.impl.units;

import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.units.BaseUnit;
import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.prefixes.Prefix;

/**
 * This class implements a base unit that is also a prefixed unit of some other unit.
 * A Base unit is a unit for which the dimension is explicitly defined. For instance, the kilogram is defined in SI
 * as a base unit with dimension Mass (M), it is also a prefixed unit with prefix kilo and base unit gram.
 *
 *
 * @author Don Willems on 04/08/15.
 */
public class PrefixedBaseUnitImpl extends PrefixedUnitImpl implements BaseUnit{

    /** The dimension in which this unit is defined. */
    private BaseDimension definitionDimension;

    /**
     * Creates a new prefixed base unit in the specified dimension, based on the specified singular unit and using
     * the specified prefix. For instance, the base unit kilogram has as singular unit the gram and as prefix kilo
     * and it is defined in the dimension {@link nl.wur.fbr.om.model.dimensions.SIBaseDimension#MASS}.
     * The symbol for this unit is created by concatenating the prefix symbol with the symbol of the singular unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     * @param dimension The dimension in which this base unit is defined.
     */
    public PrefixedBaseUnitImpl(SingularUnit singularUnit, Prefix prefix, BaseDimension dimension){
        super(singularUnit,prefix);
        this.definitionDimension = dimension;
        if(singularUnit!=null && singularUnit.getSymbol()!=null){
            setSymbol(prefix.getSymbol() + singularUnit.getSymbol());
        }
        ((SingularUnitImpl)singularUnit).setDefinitionUnit(this);
        ((SingularUnitImpl)singularUnit).setDefinitionNumericalValue(1 / prefix.getFactor());
    }

    /**
     * Creates a new prefixed base unit in the specified dimension, based on the specified singular unit and using
     * the specified prefix. For instance, the base unit kilogram has as singular unit the gram and as prefix kilo
     * and it is defined in the dimension {@link nl.wur.fbr.om.model.dimensions.SIBaseDimension#MASS}.
     * The symbol for this unit is created by concatenating the prefix symbol with the symbol of the singular unit.
     * @param name The name of the unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     * @param dimension The dimension in which this base unit is defined.
     */
    public PrefixedBaseUnitImpl(String name, SingularUnit singularUnit, Prefix prefix, BaseDimension dimension){
        super(name,singularUnit,prefix);
        this.definitionDimension = dimension;
        if(singularUnit!=null && singularUnit.getSymbol()!=null){
            setSymbol(prefix.getSymbol() + singularUnit.getSymbol());
        }
        ((SingularUnitImpl)singularUnit).setDefinitionUnit(this);
        ((SingularUnitImpl)singularUnit).setDefinitionNumericalValue(1 / prefix.getFactor());
    }

    /**
     * Creates a new prefixed base unit in the specified dimension, based on the specified singular unit and using
     * the specified prefix. For instance, the base unit kilogram has as singular unit the gram and as prefix kilo
     * and it is defined in the dimension {@link nl.wur.fbr.om.model.dimensions.SIBaseDimension#MASS}.
     * The symbol for this unit is created by concatenating the prefix symbol with the symbol of the singular unit.
     * @param identifier The unique identifier for the unit.
     * @param name The name of the unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     * @param dimension The dimension in which this base unit is defined.
     */
    public PrefixedBaseUnitImpl(String identifier, String name, SingularUnit singularUnit, Prefix prefix, BaseDimension dimension){
        super(identifier,name,null,singularUnit,prefix);
        this.definitionDimension = dimension;
        if(singularUnit!=null && singularUnit.getSymbol()!=null){
            setSymbol(prefix.getSymbol() + singularUnit.getSymbol());
        }
        ((SingularUnitImpl)singularUnit).setDefinitionUnit(this);
        ((SingularUnitImpl)singularUnit).setDefinitionNumericalValue(1 / prefix.getFactor());
    }

    /**
     * Creates a new prefixed base unit in the specified dimension, based on the specified singular unit and using
     * the specified prefix. For instance, the base unit kilogram has as singular unit the gram and as prefix kilo
     * and it is defined in the dimension {@link nl.wur.fbr.om.model.dimensions.SIBaseDimension#MASS}.
     * @param identifier The unique identifier for the unit.
     * @param name The name of the unit.
     * @param symbol The symbol of the unit.
     * @param singularUnit The singular unit on which this prefixed unit is based.
     * @param prefix The prefix.
     * @param dimension The dimension in which this base unit is defined.
     */
    public PrefixedBaseUnitImpl(String identifier, String name, String symbol, SingularUnit singularUnit, Prefix prefix, BaseDimension dimension) {
        super(identifier,name,symbol,singularUnit,prefix);
        this.definitionDimension = dimension;
        ((SingularUnitImpl)singularUnit).setDefinitionUnit(this);
        ((SingularUnitImpl)singularUnit).setDefinitionNumericalValue(1 / prefix.getFactor());
    }


    /**
     * Returns the dimension in which this base unit is defined. For instance the SI base unit metre is defined
     * in the SI dimension for length (L).
     *
     * @return The dimension of the unit.
     */
    @Override
    public BaseDimension getDefinitionDimension() {
        return definitionDimension;
    }

    /**
     * Returns the dimensions, and therefore, the dimensional exponents, in which this unit is defined.<br>
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
        map.setDimensionalExponent(definitionDimension,1);
        return map;
    }
}
