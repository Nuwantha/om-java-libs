package nl.wur.fbr.om.model;

/**
 * A singular unit is a simple (not compound) unit. This may be a base unit such as the metre, but may also
 * be a more specific unit such as the astronomical unit, which has the same dimension as the metre and is
 * actually defined in metres. It can be converted to the base unit by dividing by the numerical value defined
 * for each singular unit, given by #getDefinitionNumericalValue().
 * The base unit does not have to be a singular unit itself. For instance the singular unit Pascal is defined in
 * terms of unit newton per square metre.
 *
 * @author Don Willems on 14/07/15.
 */
public interface SingularUnit extends Unit {

    /**
     * Returns the Unit on which the unit is based.
     * For instance, the unit Astronomical Unit (AU) is defined as
     * 1.495978707e11 metre. The definition unit is in this case the metre.
     * This method may also return null if no definition unit is defined for this unit, i.e. when this unit
     * is a base unit in some system of units. The metre is, for instance, a base unit in SI.
     * @return The unit that is used as the definition unit.
     */
    public Unit getDefinitionUnit();

    /**
     * Returns the numerical conversion factor to covert between this unit and its definition unit.
     * For instance, the unit Astronomical Unit (AU) is defined as
     * 1.495978707e11 metre. The numerical value is in this case: 1.495978707e11.
     * If no definition unit is set (i.e. this unit is a base unit for a system of units), this method
     * should return 1.
     * @return The numerical value used to convert between this unit and its base.
     */
    public double getDefinitionNumericalValue();

}
