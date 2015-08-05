package nl.wur.fbr.om.core.set;

/**
 * This class contains the identifier for the core set of measurement scales.
 *
 * @author Don Willems on 30/07/15.
 */
public abstract class CoreScaleSet {

    /** The namespace of the core unit set.*/
    public final static String NAMESPACE;

    /** The identifier for the Kelvin temperature scale.*/
    public final static String KELVIN_SCALE;

    /** The identifier for the Celsius temperature scale.*/
    public final static String CELSIUS_SCALE;

    /** The identifier for the Fahrenheit temperature scale.*/
    public final static String FAHRENHEIT_SCALE;

    static {
        NAMESPACE = "nl.wur.fbr.om.core.set.scale.";

        KELVIN_SCALE = NAMESPACE+"kelvin";
        CELSIUS_SCALE = NAMESPACE+"celsius";
        FAHRENHEIT_SCALE = NAMESPACE+"fahrenheit";
    }
}
