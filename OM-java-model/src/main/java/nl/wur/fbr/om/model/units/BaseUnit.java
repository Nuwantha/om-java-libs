package nl.wur.fbr.om.model.units;

import nl.wur.fbr.om.model.dimensions.Dimension;

/**
 * A Base unit is a unit for which the dimension is explicitly defined. It does not depend on the definition of
 * another unit. The metre, is for example, a base unit with dimension length (L). Base units are often, but not
 * necessarily base units in a system of units such as SI. For instance, the kilogram is defined in SI as a base
 * unit, but for this library kilogram should be defined as a prefixed unit with prefix kilo and base unit gram.
 *
 * @author Don Willems on 02/08/15.
 */
public interface BaseUnit extends SingularUnit {

    /**
     * Returns the dimension in which this base unit is defined. For instance the SI base unit metre is defined
     * in the SI dimension for length (L).
     * @return The dimension of the unit.
     */
    public Dimension getDefinitionDimension();
}
