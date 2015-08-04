package nl.wur.fbr.om.model.units;

import nl.wur.fbr.om.model.dimensions.Dimension;

/**
 * A Base unit is a unit for which the dimension is explicitly defined. It does not depend on the definition of
 * another unit. The metre, is for example, a base unit with dimension length (L).
 *
 * Most base units will be singular units, but in SI we have a base unit Kilogram which is a prefixed unit. In the
 * {@link nl.wur.fbr.om.factory.UnitAndScaleFactory} creation methods exist for base units if they are either
 * singular units or prefixed units. If ypu want to be able to use other unit types (e.g. UnitExponentiation) as
 * base units, you should provide your own implementation that implements both UnitExponentiation and BaseUnit and
 * provide your own creation methods in your own factory class.
 *
 * @author Don Willems on 02/08/15.
 */
public interface BaseUnit extends Unit{

    /**
     * Returns the dimension in which this base unit is defined. For instance the SI base unit metre is defined
     * in the SI dimension for length (L).
     * @return The dimension of the unit.
     */
    public Dimension getDefinitionDimension();
}
