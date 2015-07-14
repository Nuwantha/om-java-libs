package nl.wur.fbr.om.model;

/**
 * Created by Don Willems on 14/07/15.
 */
public interface SingularUnit extends Unit {

    /**
     * Returns the Unit or Measurement scale on which the unit is based.
     * For instance, the unit Astronomical Unit (AU) is defined as
     * 1.495978707e11 metre. The definition unit is in this case the metre.
     * @return The unit or measurement scale that is the base of this unit.
     */
    public UnitOrMeasurementScale getDefinitionUnitOrMeasurementScale();

    /**
     * Returns the numerical conversion factor to covert between this unit and its base unit or measurement scale.
     * For instance, the unit Astronomical Unit (AU) is defined as
     * 1.495978707e11 metre. The numerical value is in this case: 1.495978707e11.
     * @return The numerical value used to convert between this unit and its base.
     */
    public double getDefinitionNumericalValue();

}
