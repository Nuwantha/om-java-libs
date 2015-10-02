package nl.wur.fbr.om.model.quantities;

import nl.wur.fbr.om.model.NamedObject;
import nl.wur.fbr.om.model.UnitAndScaleSet;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.units.Unit;

import java.util.Set;

/**
 * A quantity class group together the properties of quantities of the same class.
 * For instance, a quantity 'distance between A and B' may be an instance of a <code>Distance</code> class, with
 * name 'distance between A and B', the <code>Distance</code> class has a method {@link Quantity#getQuantityClass() getQuantityClass()}
 * that returns an instance of the {@link QuantityClass} interface that contains the name 'distance'.
 *
 * @author Don Willems on 02/10/15.
 */
public interface QuantityClass extends NamedObject {

    /**
     * Returns the dimension, and therefore, the dimensional exponents, in which quantities of this class are defined.<br>
     * The dimension of derived quantities are written as products of powers of the base dimensions of the
     * base quantities using the equations that relate the derived quantities to the base units or
     * quantities. In SI the dimension of any quantities Q is written in the form of a dimensional product,
     * dim Q = L^&#945; M^&#946; T^&#947; l^&#948; &#920;^&#949; N^&#950; J^eta
     * where the exponents &#945;, &#946;, &#947;, &#948;, &#949;, &#950;, and &#951;, are generally small integers
     * which can be positive, negative or zero, and are called the dimensional exponents.
     * <br>
     * <b>For implementations</b>:
     * The dimension of a quantity can not be calculated as they can for compound units. The implementations of this
     * method should probably return a constant value for the dimension of the {@link Quantity} implementation.
     *
     * @return The set of dimensions and dimensional exponents.
     */
    public Dimension getDimension();

    /**
     * This method returns true when the quantities of this class are dimensionless.
     * @return True when the quantity is dimensionless, false otherwise.
     */
    public boolean isDimensionless();

    /**
     * Returns the preferred unit or scale to be used for quantities of this quantity class type.
     * For instance, for a quantity defined in SI, the
     * preferred unit or scale should be the corresponding SI unit.
     * @return The preferred unit.
     */
    public Unit getPreferredUnitOrScale();

    /**
     * Returns all units or scales that can be used for quantities of this quantity class type,
     * that are specified in the set.
     *
     * @param set The set of units and scales in which the requested units and scales should be found.
     * @return A list of units and scales that can be used for this quantity.
     */
    public Set<Unit> getUnitsOrScales(UnitAndScaleSet set);
}
