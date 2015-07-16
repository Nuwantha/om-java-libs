package nl.wur.fbr.om.prefixes;

/**
 * This interface can be implemented by enumerations for different types of prefixes such as unit prefixes and
 * binary prefixes.
 * @author Don Willems on 16/07/15.
 */
public interface Prefix {

    /**
     * Returns the name of the prefix (all lower case characters).
     * @return The name of the prefix.
     */
    public String getName();

    /**
     * Returns the symbol for the prefix.
     * The unit prefix KILO has, for instance, the symbol 'k'.
     * @return The prefix symbol.
     */
    public String getSymbol();

    /**
     * Returns the multiplication factor for the prefix.
     * The unit prefix KILO has, for instance the multiplication factor 1000.
     * @return The multiplication factor.
     */
    public double getFactor();
}
