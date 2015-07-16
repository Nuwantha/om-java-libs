package nl.wur.fbr.om.model;

/**
 * Measurement scales are concepts used for the expression of quantities.
 * Four types of measurement scales are: nominal scales, ordinal scales, interval scales and ratio scales.
 * The latter two scales are also called cardinal scales.
 * An example of a scale is the Celsius scale, a temperature scale.
 * @author Don Willems on 14/07/15.
 */
public interface Scale {

    /**
     * Returns the measurement scale related to which this measurement scale is defined.
     * For instance the Centigrade (Celsius) scale is defined in relation to the Kelvin scale.
     * This implies that some measurement scales do not have a definition scale, e.g. the Kelvin scale.
     * These scales are defined using points that refer to specific quantities.
     * For instance the point 373.15 K is defined in terms of the boiling point of water.
     * @return The definition scale.
     */
    public Scale getDefinitionScale();

    /**
     * The linear ofset from the definition scale.
     * For instance the Fahrenheit scale has an offset of -459.67
     * @return
     */
    public double getOffsetFromDefinitionScale();

    /**
     * The multiplication factor in relation to the definition scale.
     * For instance the Fahrenheit scale has a factor of 1.8
     * @return
     */
    public double getMultiplicationFactorFromDefinitionScale();

    /**
     * Returns the associated unit for this measurement scale.
     * The celsius scale has, for instance, the unit celsius.
     * @return
     */
    public Unit getUnit();
}
