package nl.wur.fbr.om.model.dimensions;

/**
 * This interface defines the methods needed to define dimensions in a system of units.
 * The dimensions should be defined in an enumeration such as those of the SI system, which
 * are defined in {@link SIDimension}.
 * @author Don Willems on 02/08/15.
 */
public interface Dimension {

    /**
     * The name of the dimension.
     * @return The name.
     */
    public String getName();

    /**
     * The symbol used for the dimension.
     * @return The symbol.
     */
    public String getSymbol();
}
