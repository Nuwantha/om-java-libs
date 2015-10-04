package nl.wur.fbr.om.core.impl.quantities;

import javafx.util.Pair;
import nl.wur.fbr.om.model.UnitAndScaleSet;
import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.quantities.Quantity;
import nl.wur.fbr.om.model.quantities.QuantityClass;
import nl.wur.fbr.om.model.units.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * An abstract implementation of {@link QuantityClass} that handles names, symbols and identifiers of
 * quantity classes. These names, symbols, and identifiers are often used as default values for quantities
 * of this class.
 * @author Don Willems on 02/10/15.
 */
public class DefaultQuantityClass implements QuantityClass {

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

    private Dimension dimension;
    private Set<Object> unitsOrScales;
    private Object preferredUnitOrScale;
    private Class quantityJavaClass;

    /**
     * Creates a quantity class with the specified properties.
     *
     * @param identifier The identifier of the quantity class.
     * @param name The name of the quantity class.
     * @param symbol The default symbol used for quantities of this class.
     * @param dimension The dimension of quantities of this class.
     * @param unitOrScale The preferred unit or scale to be used by quantities of this class.
     * @param unitsOrScales The set of units or scales that can be used by quantities of this class.
     * @param quantityClass The Java class whose instances represent quantities of this class.
     */
    public DefaultQuantityClass(String identifier, String name, String symbol, Dimension dimension, Object unitOrScale, Set<Object> unitsOrScales, Class quantityClass){
        this.addAlternativeName(name,null);
        this.addAlternativeSymbol(symbol);
        this.identifier = identifier;
        this.unitsOrScales = unitsOrScales;
        this.preferredUnitOrScale = unitOrScale;
        this.quantityJavaClass = quantityClass;
        this.dimension = dimension;
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

    /**
     * Returns the dimension, and therefore, the dimensional exponents, in which quantities of this class are defined.<br>
     * The dimension of derived quantities are written as products of powers of the base dimensions of the
     * base quantities using the equations that relate the derived quantities to the base units or
     * quantities. In SI the dimension of any quantities Q is written in the form of a dimensional product,
     * dim Q = L^&#945; M^&#946; T^&#947; l^&#948; &#920;^&#949; N^&#950; J^eta
     * where the exponents &#945;, &#946;, &#947;, &#948;, &#949;, &#950;, and &#951;, are generally small integers
     * which can be positive, negative or zero, and are called the dimensional exponents.
     * <br>
     * <b>For implementations</b>:
     * The dimension of a quantity can not be calculated as they can for compound units. The implementations of this
     * method should probably return a constant value for the dimension of the {@link Quantity} implementation.
     *
     * @return The set of dimensions and dimensional exponents.
     */
    @Override
    public Dimension getDimension() {
        return dimension;
    }

    /**
     * This method returns true when the quantities of this class are dimensionless.
     *
     * @return True when the quantity is dimensionless, false otherwise.
     */
    @Override
    public boolean isDimensionless() {
        Set<BaseDimension> dimensions = dimension.getDimensions();
        for(BaseDimension base : dimensions){
            if(dimension.getDimensionalExponent(base)!=0) return false;
        }
        return true;
    }

    /**
     * Returns the preferred unit or scale to be used for quantities of this quantity class type.
     * For instance, for a quantity defined in SI, the
     * preferred unit or scale should be the corresponding SI unit.
     *
     * @return The preferred unit.
     */
    @Override
    public Object getPreferredUnitOrScale() {
        return preferredUnitOrScale;
    }

    /**
     * Returns all units or scales that can be used for quantities of this quantity class type,
     * that are specified in the set.
     *
     * @param set The set of units and scales in which the requested units and scales should be found.
     * @return A list of units and scales that can be used for this quantity.
     */
    @Override
    public Set<Object> getUnitsOrScales(UnitAndScaleSet set) {
        return unitsOrScales;
    }

    /**
     * Returns the java class representing instances of this quantity class.
     *
     * @return The java class.
     */
    @Override
    public Class getClassForQuantityClass() {
        return quantityJavaClass;
    }
}
