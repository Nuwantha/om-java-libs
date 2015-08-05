package nl.wur.fbr.om.model.dimensions;

/**
 * This interface defines the methods needed to define base dimensions in a system of units.
 * The base dimensions should be defined in an enumeration such as those of the SI system, which
 * are defined in {@link SIBaseDimension}.
 * @author Don Willems on 02/08/15.
 */
public interface BaseDimension {

    /**
     * The name of the base dimension.
     * @return The name.
     */
    public String getName();

    /**
     * The symbol used for the base dimension.
     * @return The symbol.
     */
    public String getSymbol();
}
