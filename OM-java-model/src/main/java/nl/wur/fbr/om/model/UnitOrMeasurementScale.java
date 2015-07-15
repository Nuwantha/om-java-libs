package nl.wur.fbr.om.model;

/**
 * UnitOrMeasurementScale is a wrapper interface to contain both Unit or Measure where one or the other
 * may be used as a property or parameter.
 * @author Don Willems on 14/07/15.
 */
public interface UnitOrMeasurementScale {

    /**
     * Returns the identifier for the specific unit or measurement scale. This identifier should be unique
     * and should be used to compare units or measurements scales for equality.
     * @return The identifier for the unit or measurement scale.
     */
    public String getIdentifier();
}
