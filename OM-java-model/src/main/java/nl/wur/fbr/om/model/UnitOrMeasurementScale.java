package nl.wur.fbr.om.model;

import java.util.List;

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

    /**
     * Returns the preferred name of the unit or measurement scale or null if not set.
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
     * Returns the preferred name in the specified language if it is known for this unit or measurement scale.
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
     * Returns the preferred symbol used for this unit or measurement scale.
     * When no symbol is known return null.
     * @return The preferred symbol.
     */
    public String getSymbol();

    /**
     * Returns a list of alternative symbols for this unit or measurement scale.
     * When no known alternative symbols are known return an empty list.
     * @return A list of alternative symbols.
     */
    public String getAlternativeSymbols();
}
