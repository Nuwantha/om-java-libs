package nl.wur.fbr.om.core.impl.quantities;

import javafx.util.Pair;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.quantities.Quantity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Don Willems on 20/07/15.
 */
public class QuantityImpl implements Quantity {

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
    public QuantityImpl(Measure measure){
        identifier = UUID.randomUUID().toString();
        this.measureValue = measure;
    }

    /**
     * Creates a quantity with the specified name and symbol and with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param name The name of the quantity.
     * @param symbol The symbol of the quantity.
     * @param measure The value of the quantity.
     */
    public QuantityImpl(String name, String symbol, Measure measure){
        identifier = UUID.randomUUID().toString();
        if(name!=null) names.add(new Pair<>("",name));
        if(symbol!=null) symbols.add(symbol);
        this.measureValue = measure;
    }

    /**
     * Creates a quantity with the specified identifier, name, and symbol and with the specified measure as value.
     *
     * @param identifier The identifier of the quantity.
     * @param name The name of the quantity.
     * @param symbol The symbol of the quantity.
     * @param measure The value of the quantity.
     */
    public QuantityImpl(String identifier, String name, String symbol, Measure measure){
        identifier = UUID.randomUUID().toString();
        if(name!=null) names.add(new Pair<>("",name));
        if(symbol!=null) symbols.add(symbol);
        this.measureValue = measure;
    }

    /**
     * Creates an unnamed quantity with the specified point on a measurement scale as value.
     * An identifier will be automatically generated.
     *
     * @param point The value of the quantity.
     */
    public QuantityImpl(Point point){
        identifier = UUID.randomUUID().toString();
        this.pointValue = point;
    }

    /**
     * Creates a quantity with the specified name and symbol and with the specified point on a measurement scale
     * as value.
     * An identifier will be automatically generated.
     *
     * @param name The name of the quantity.
     * @param symbol The symbol of the quantity.
     * @param point The value of the quantity.
     */
    public QuantityImpl(String name, String symbol, Point point){
        identifier = UUID.randomUUID().toString();
        if(name!=null) names.add(new Pair<>("",name));
        if(symbol!=null) symbols.add(symbol);
        this.pointValue = point;
    }

    /**
     * Creates a quantity with the specified identifier, name, and symbol and with the specified point on a measurement
     * scale as value.
     *
     * @param identifier The identifier of the quantity.
     * @param name The name of the quantity.
     * @param symbol The symbol of the quantity.
     * @param point The value of the quantity.
     */
    public QuantityImpl(String identifier, String name, String symbol, Point point){
        identifier = UUID.randomUUID().toString();
        if(name!=null) names.add(new Pair<>("",name));
        if(symbol!=null) symbols.add(symbol);
        this.pointValue = point;
    }

    /**
     * Returns the identifier for the specific quantity. This identifier should be unique
     * and should be used to compare object for equality.
     *
     * @return The identifier for the quantity.
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
        if(names.size()<=0) return null;
        return names.get(0).getValue();
    }

    /**
     * Returns alternative names for the quantity not including the preferred name.
     * If no alternative names exist, an empty list should be returned.
     *
     * @return A list of alternative names.
     */
    @Override
    public List<String> getAlternativeNames() {
        List<String> altnames = new ArrayList<>();
        for (int i=1;i<names.size();i++){ // start ad i=1 to ignore the preferred name.
            altnames.add(names.get(i).getValue());
        }
        return altnames;
    }

    /**
     * Returns the preferred name in the specified language if it is known for this quantity.
     * If no name in the specified language is available return null.
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
     * If no known alternative names are known return an empty list.
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
     * @param name An alternative name of the Quantity.
     * @param language The language of the name.
     */
    @Override
    public void addAlternativeName(String name,String language){
        if(language==null) language="";
        names.add(new Pair(language,name));
    }

    /**
     * Returns the preferred symbol used for this quantity.
     * When no symbol is known return null.
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
     * Returns a list of alternative symbols for this quantity.
     * When no known alternative symbols are known return an empty list.
     *
     * @return A list of alternative symbols.
     */
    @Override
    public List<String> getAlternativeSymbols(){
        List<String> altsymbols = new ArrayList<>();
        if(symbols.size()>1) altsymbols.addAll(symbols.subList(1,symbols.size()));
        return altsymbols;
    }

    /**
     * Add an alternative symbol to the quantity.
     * @param symbol The alternative symbol.
     */
    public void addAlternativeSymbol(String symbol){
        symbols.add(symbol);
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
}
