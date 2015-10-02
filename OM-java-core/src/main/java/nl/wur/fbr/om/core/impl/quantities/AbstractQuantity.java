package nl.wur.fbr.om.core.impl.quantities;

import javafx.util.Pair;
import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.quantities.Quantity;
import nl.wur.fbr.om.model.units.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * An abstract implementation of the {@link Quantity} interface.
 * To use quantities, specific implementation classes need to be created. For instance the quantity length should
 * have its own class, e.g.  <code>Length</code>.
 *
 * @author Don Willems on 20/07/15.
 */
public abstract class AbstractQuantity implements Quantity {

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

    /** The measure (numerical value expressed in a unit) which is the value of the quantity. */
    private Measure measureValue = null;

    /** The point (numerical value on a measurement scale) which is the value of the quantity. */
    private Point pointValue = null;

    /**
     * Creates an unnamed quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the quantity.
     */
    public AbstractQuantity(Measure measure){
        this.identifier = this.getQuantityClass().getIdentifier()+"#"+UUID.randomUUID().toString();
        this.measureValue = measure;
    }

    /**
     * Creates an unnamed quantity with the specified point on a measurement scale as value.
     * An identifier will be automatically generated.
     *
     * @param point The value of the quantity.
     */
    public AbstractQuantity(Point point){
        this.identifier = this.getQuantityClass().getIdentifier()+"#"+UUID.randomUUID().toString();
        this.pointValue = point;
    }

    /**
     * Creates an unnamed quantity with the specified measure as value.
     *
     * @param identifier The identifier for this quantity.
     * @param measure The value of the quantity.
     */
    public AbstractQuantity(String identifier,Measure measure){
        this.measureValue = measure;
        this.identifier = identifier;
    }

    /**
     * Creates an unnamed quantity with the specified point on a measurement scale as value.
     *
     * @param identifier The identifier for this quantity.
     * @param point The value of the quantity.
     */
    public AbstractQuantity(String identifier,Point point){
        this.pointValue = point;
        this.identifier = identifier;
    }

    /**
     * Creates an unnamed quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param name The name of the quantity.
     * @param symbol The symbol used for the quantity.
     * @param measure The value of the quantity.
     */
    public AbstractQuantity(String name,String symbol, Measure measure){
        this.identifier = this.getQuantityClass().getIdentifier()+"#"+UUID.randomUUID().toString();
        this.measureValue = measure;
        this.addAlternativeName(name,null);
        this.addAlternativeSymbol(symbol);
    }

    /**
     * Creates an unnamed quantity with the specified point on a measurement scale as value.
     * An identifier will be automatically generated.
     *
     * @param name The name of the quantity.
     * @param symbol The symbol used for the quantity.
     * @param point The value of the quantity.
     */
    public AbstractQuantity(String name,String symbol, Point point){
        this.identifier = this.getQuantityClass().getIdentifier()+"#"+UUID.randomUUID().toString();
        this.pointValue = point;
        this.addAlternativeName(name,null);
        this.addAlternativeSymbol(symbol);
    }

    /**
     * Creates an unnamed quantity with the specified measure as value.
     *
     * @param identifier The identifier for this quantity.
     * @param name The name of the quantity.
     * @param symbol The symbol used for the quantity.
     * @param measure The value of the quantity.
     */
    public AbstractQuantity(String identifier,String name,String symbol, Measure measure){
        this.measureValue = measure;
        this.identifier = identifier;
        this.addAlternativeName(name,null);
        this.addAlternativeSymbol(symbol);
    }

    /**
     * Creates an unnamed quantity with the specified point on a measurement scale as value.
     *
     * @param identifier The identifier for this quantity.
     * @param name The name of the quantity.
     * @param symbol The symbol used for the quantity.
     * @param point The value of the quantity.
     */
    public AbstractQuantity(String identifier,String name,String symbol, Point point){
        this.pointValue = point;
        this.identifier = identifier;
        this.addAlternativeName(name,null);
        this.addAlternativeSymbol(symbol);
    }


    /**
     * Returns the value of the quantity if the value is a measure, or null if the value is a
     * point on a measurement scale.
     * @return The value of the quantity.
     */
    @Override
    public Measure getMeasureValue(){
        return measureValue;
    }

    /**
     * Returns the value of the quantity if the value is a point on a measurement scale or null if
     * the value is a measure.
     * @return The value of the quantity.
     */
    @Override
    public Point getPointValue(){
        return pointValue;
    }

    /**
     * Returns the value of the quantity.
     * @return The value of the quantity.
     */
    @Override
    public Object getValue(){
        if(measureValue!=null) return measureValue;
        else return pointValue;
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
     * Returns the preferred name of the quantity or null if not set.
     *
     * @return The preferred name.
     */
    @Override
    public String getName() {
        if(names.size()<=0) return this.getQuantityClass().getName();
        return names.get(0).getValue();
    }

    /**
     * Returns alternative names for the quantity not including the preferred name.
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
        if(altnames.size()<=0) return this.getQuantityClass().getAlternativeNames();
        return altnames;
    }

    /**
     * Returns the preferred name in the specified language if it is known for this quantity.
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
        return this.getQuantityClass().getName(language);
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
        if(altnames.size()<=0) return this.getQuantityClass().getAlternativeNames(language);
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
        if(languages.size()<=0) return this.getQuantityClass().getLanguages();
        return languages;
    }

    /**
     * Adds a name with the specified language. If the name is not specific to a language
     * use null for language.
     * @param name An alternative name of the quantity.
     * @param language The language of the name.
     */
    @Override
    public void addAlternativeName(String name,String language){
        if(language==null) language="";
        Pair<String,String> pair = new Pair(language,name);
        if(!names.contains(pair)) names.add(pair);
    }

    /**
     * Returns the preferred symbol used for this quantity.
     * When no symbol is known null is returned.
     *
     * @return The preferred symbol.
     */
    @Override
    public String getSymbol() {
        if(symbols.size()<=0) return this.getQuantityClass().getSymbol();
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
     * Returns a list of alternative symbols for this quantity.
     * When no known alternative symbols are known an empty list is returned.
     *
     * @return A list of alternative symbols.
     */
    @Override
    public List<String> getAlternativeSymbols() {
        List<String> altsymbols = new ArrayList<>();
        if(symbols.size()>1) altsymbols.addAll(symbols.subList(1, symbols.size()));
        if(altsymbols.size()<=0) return this.getQuantityClass().getAlternativeSymbols();
        return altsymbols;
    }

    /**
     * Add an alternative symbol to the quantity.
     * @param symbol The alternative symbol.
     */
    @Override
    public void addAlternativeSymbol(String symbol){
        if(!symbols.contains(symbol)) symbols.add(symbol);
    }

    /**
     * Test whether the specified object is equal to this quantity. If the object
     * is an instance of {@link Quantity}, the identifiers are compared and if they are equal,
     * the quantities are equal.
     * @param object The object to be compared to this quantity.
     * @return True when the object is equal to this quantity, false otherwise.
     */
    @Override
    public boolean equals(Object object){
        if(object instanceof Quantity){
            return ((Quantity)object).getIdentifier().equals(this.getIdentifier());
        }
        return false;
    }

    /**
     * Returns a string representation of the quantity. If a symbol is defined it returns the
     * symbol, if not the name or identifier is returned.
     * @return A string representation of the quantity.
     */
    @Override
    public String toString(){
        String str = "";
        if(this.getSymbol()!=null) str+=  this.getSymbol();
        else if(this.getName()!=null) str+=  this.getName();
        else str+= "Quantity<"+this.getIdentifier()+">";
        if(getValue()!=null) str+=" = "+getValue();
        return str;
    }
}
