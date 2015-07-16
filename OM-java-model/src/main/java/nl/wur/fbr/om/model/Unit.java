package nl.wur.fbr.om.model;

import java.util.List;

/**
 * A unit of measure is defined in terms of a quantity, directly or indirectly via other units.
 * It is used as a standard for measurement of the same quantity, where any other value of the quantity can be
 * expressed as a simple multiple of the unit of measure. For example, length is a quantity; the metre is a unit of
 * length that represents a definite predetermined length. When we say 10 metre (or 10 m), we actually mean 10 times
 * the definite predetermined length called "metre".
 * @author Don Willems on 14/07/15.
 */
public interface Unit {

    /**
     * Returns the identifier for the specific unit. This identifier should be unique
     * and should be used to compare units for equality.
     * @return The identifier for the unit.
     */
    public String getIdentifier();

    /**
     * Returns the preferred name of the unit or null if not set.
     * @return The preferred name.
     */
    public String getName();

    /**
     * Returns alternative names for the unit not including the preferred name.
     * If no alternative names exist, an empty list should be returned.
     * @return A list of alternative names.
     */
    public List<String> getAlternativeNames();

    /**
     * Returns the preferred name in the specified language if it is known for this unit.
     * If no name in the specified language is available return null.
     * @param language The language of the requested name (ISO 639).
     * @return The preferred name.
     */
    public String getName(String language);

    /**
     * Returns the alternative names in the specified language if any are known.
     * If no known alternative names are known return an empty list.
     * @param language The language of the requested alternative names.
     * @return A list of alternative names.
     */
    public List<String> getAlternativeNames(String language);

    /**
     * Returns the preferred symbol used for this unit.
     * When no symbol is known return null.
     * @return The preferred symbol.
     */
    public String getSymbol();

    /**
     * Returns a list of alternative symbols for this unit.
     * When no known alternative symbols are known return an empty list.
     * @return A list of alternative symbols.
     */
    public String getAlternativeSymbols();
}
