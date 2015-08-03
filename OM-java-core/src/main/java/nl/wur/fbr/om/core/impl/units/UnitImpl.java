package nl.wur.fbr.om.core.impl.units;

import javafx.util.Pair;
import nl.wur.fbr.om.model.units.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * The core implementation of Unit. This class is abstract as all unit instances should be instances of
 * subclasses of this class.
 * This class provides access to name(s) and symbol(s) that are used for a Unit.
 * Names may be added in multiple languages.
 *
 * @author Don Willems on 18/07/15.
 */
public abstract class UnitImpl implements Unit {

    /** The identifier for this unit. */
    private String identifier;

    /**
     *  The list of names for this unit, the first name in the list is the preferred name.
     *  The items in the list are tuples with the value being the name and the key
     *  the ISO 639 language identifier, or "" if no language was set.
     */
    private List<Pair<String,String>> names = new ArrayList<>();

    /** The list of symbols for this unit, the first symbol in the list is the preferred symbol. */
    private List<String> symbols = new ArrayList<>();

    /**
     * Creates a new Unit with an UUID identifier.
     */
    UnitImpl(){
        this(UUID.randomUUID().toString());
    }

    /**
     * Creates a new Unit with the specified identifier.
     * @param identifier The identifier of the Unit.
     */
    UnitImpl(String identifier){
        this.identifier = identifier;
    }

    /**
     * Creates a new instance of a Unit with the specified name and symbol.
     * @param name The name of the unit.
     * @param symbol The symbol of the unit.
     */
    UnitImpl(String name, String symbol) {
        super();
        identifier = UUID.randomUUID().toString();
        if(name!=null) names.add(new Pair<>("",name));
        if(symbol!=null) symbols.add(symbol);
    }

    /**
     * Creates a new instance of a Unit with the specified name and symbol.
     * @param identifier The identifier, unique to the Unit.
     * @param name The name of the unit.
     * @param symbol The symbol of the unit.
     */
    UnitImpl(String identifier,String name, String symbol) {
        super();
        this.identifier = identifier;
        if(name!=null) names.add(new Pair<>("",name));
        if(symbol!=null) symbols.add(symbol);
    }

    /**
     * Returns the identifier for the specific object. This identifier should be unique
     * and should be used to compare object for equality.
     *
     * @return The identifier for the object.
     */
    @Override
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Returns the preferred name of the object or null if not set.
     *
     * @return The preferred name.
     */
    @Override
    public String getName() {
        if(names.size()<=0) return null;
        return names.get(0).getValue();
    }

    /**
     * Returns alternative names for the object not including the preferred name.
     * If no alternative names exist, an empty list is returned.
     *
     * @return A list of alternative names.
     */
    @Override
    public List<String> getAlternativeNames() {
        List<String> altnames = new ArrayList<>();
        for (int i=1;i<names.size();i++){ // start at i=1 to ignore the preferred name.
            altnames.add(names.get(i).getValue());
        }
        return altnames;
    }

    /**
     * Returns the preferred name in the specified language if it is known for this object.
     * If no name in the specified language is available null is returned.
     *
     * @param language The language of the requested name (ISO 639).
     * @return The preferred name.
     */
    @Override
    public String getName(String language) {
        if(language==null) return getName();
        for (int i=0;i<names.size();i++){ // iterate until name with language is found
            if (names.get(i).getKey().equals(language)){
                return  names.get(i).getValue();
            }
        }
        return null;
    }

    /**
     * Returns the alternative names in the specified language if any are known.
     * If no known alternative names are known an empty list is returned.
     *
     * @param language The language of the requested alternative names.
     * @return A list of alternative names.
     */
    @Override
    public List<String> getAlternativeNames(String language) {
        boolean found = false;
        List<String> altnames = new ArrayList<>();
        for (int i=0;i<names.size();i++){ // iterate over all names
            if (names.get(i).getKey().equals(language)) { // test for language
                if(found) { // test whether this name is the first in the correct language, if so ignore
                    altnames.add(names.get(i).getValue()); // add when correct language
                }
                found = true;
            }
        }
        return altnames;
    }

    /**
     * Adds a name with the specified language. If the name is not specific to a language
     * use null for language.
     * @param name An alternative name of the Unit.
     * @param language The language of the name.
     */
    @Override
    public void addAlternativeName(String name,String language){
        if(language==null) language="";
        names.add(new Pair(language,name));
    }

    /**
     * Returns the preferred symbol used for this object.
     * When no symbol is known null is returned.
     *
     * @return The preferred symbol.
     */
    @Override
    public String getSymbol() {
        if(symbols.size()<=0) return null;
        return symbols.get(0);
    }

    /**
     * Sets the preferred symbol to the specified string.
     * @param symbol The preferred symbol.
     */
    @Override
    public void setSymbol(String symbol){
        symbols.add(0,symbol);
    }

    /**
     * Returns a list of alternative symbols for this object.
     * When no known alternative symbols are known an empty list is returned.
     *
     * @return A list of alternative symbols.
     */
    @Override
    public List<String> getAlternativeSymbols() {
        List<String> altsymbols = new ArrayList<>();
        if(symbols.size()>1) altsymbols.addAll(symbols.subList(1,symbols.size()));
        return altsymbols;
    }

    /**
     * Add an alternative symbol to the Unit.
     * @param symbol The alternative symbol.
     */
    @Override
    public void addAlternativeSymbol(String symbol){
        symbols.add(symbol);
    }

    /**
     * Test whether the specified object is equal to this Unit. If the object
     * is an instance of Unit, the identifiers are compared and if they are equal,
     * the units are equal.
     * @param object The object to be compared to this unit.
     * @return True when the object is equal to this unit, false otherwise.
     */
    @Override
    public boolean equals(Object object){
        if(object instanceof Unit){
            return ((Unit)object).getIdentifier().equals(this.getIdentifier());
        }
        return false;
    }

    /**
     * Returns a string representation of the unit. If a symbol is defined it returns the
     * symbol, if not the name or identifier is returned.
     * @return A string representation of the unit.
     */
    @Override
    public String toString(){
        if(this.getSymbol()!=null) return this.getSymbol();
        if(this.getName()!=null) return this.getName();
        return "Unit<"+this.getIdentifier()+">";
    }
}
