package nl.wur.fbr.om.core.impl.quantities;

import javafx.util.Pair;
import nl.wur.fbr.om.model.quantities.Quantity;
import nl.wur.fbr.om.model.quantities.QuantityClass;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract implementation of {@link QuantityClass} that handles names, symbols and identifiers of
 * quantity classes. These names, symbols, and identifiers are often used as default values for quantities
 * of this class.
 * @author Don Willems on 02/10/15.
 */
public abstract class AbstractQuantityClass implements QuantityClass {

    /** The identifier for this quantity. */
    private String identifier;

    /**
     *  The list of names for this quantity, the first name in the list is the preferred name.
     *  The items in the list are tuples with the value being the name and the key
     *  the ISO 639 language identifier, or "" if no language was set.
     */
    private List<Pair<String,String>> names = new ArrayList<>();

    /** The list of symbols for this quantity, the first symbol in the list is the preferred symbol. */
    private List<String> symbols = new ArrayList<>();

    /**
     * Creates a new {@link QuantityClass} with the specified identifier, name and symbol.
     * @param identifier The identifier for the class of quantities.
     * @param name The name of the quantity class.
     * @param symbol The symbol used for quantities of this class.
     */
    public AbstractQuantityClass(String identifier,String name,String symbol){
        this.addAlternativeName(name,null);
        this.addAlternativeSymbol(symbol);
        this.identifier = identifier;
    }


    /**
     * Returns the identifier for the specific quantity class.
     * @return The identifier for the quantity class.
     */
    @Override
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Returns the preferred name of the quantity class or null if not set.
     *
     * @return The preferred name.
     */
    @Override
    public String getName() {
        if(names.size()<=0) return null;
        return names.get(0).getValue();
    }

    /**
     * Returns alternative names for the quantity class not including the preferred name.
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
     * Returns the preferred name in the specified language if it is known for this quantity class.
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
     * Returns the languages of the set of names.
     * @return The languages.
     */
    public List<String> getLanguages() {
        List<String> languages = new ArrayList<>();
        for(Pair<String,String> pair : names){
            languages.add(pair.getKey());
        }
        return languages;
    }

    /**
     * Adds a name with the specified language. If the name is not specific to a language
     * use null for language.
     * @param name An alternative name of the quantity class.
     * @param language The language of the name.
     */
    @Override
    public void addAlternativeName(String name,String language){
        if(language==null) language="";
        Pair<String,String> pair = new Pair(language,name);
        if(!names.contains(pair)) names.add(pair);
    }

    /**
     * Returns the preferred symbol used for this quantity class.
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
     * Returns a list of alternative symbols for this quantity class.
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
     * Add an alternative symbol to the quantity class.
     * @param symbol The alternative symbol.
     */
    @Override
    public void addAlternativeSymbol(String symbol){
        if(!symbols.contains(symbol)) symbols.add(symbol);
    }

    /**
     * Test whether the specified object is equal to this quantity class. If the object
     * is an instance of {@link QuantityClass}, the identifiers are compared and if they are equal,
     * the quantity classes are equal.
     * @param object The object to be compared to this quantity class.
     * @return True when the object is equal to this quantity class, false otherwise.
     */
    @Override
    public boolean equals(Object object){
        if(object instanceof Quantity){
            return ((Quantity)object).getIdentifier().equals(this.getIdentifier());
        }
        return false;
    }
}
