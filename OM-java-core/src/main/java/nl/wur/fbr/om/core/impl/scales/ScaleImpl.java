package nl.wur.fbr.om.core.impl.scales;

import javafx.util.Pair;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Implements Measurement scales, which are concepts used for the expression of quantities.
 * The four types of measurement scales are: nominal scales, ordinal scales, interval scales and ratio scales.
 * The latter two scales are also called cardinal scales.
 * An example of a scale is the Celsius scale, a temperature scale.
 * @author Don Willems on 20/07/15.
 */
public class ScaleImpl implements Scale {

    /** The identifier for this scale. */
    private String identifier;

    /** The definition scale. */
    private Scale definitionScale;

    /** The offset from the definition scale. */
    private double offset = 0.0;

    /** The multiplication factor by which this scale needs to be multiplied to revert to the definition scale. */
    private double factor = 1.0;

    /** The unit associated with the measurement scale. */
    private Unit unit;

    /** The list of points on the scale used to define the scale. */
    private List<Point> definitionPoints = new ArrayList<>();

    /**
     *  The list of names for this scale, the first name in the list is the preferred name.
     *  The items in the list are tuples with the value being the name and the key
     *  the ISO 639 language identifier, or "" if no language was set.
     */
    private List<Pair<String,String>> names = new ArrayList<>();

    /** The list of symbols for this scale, the first symbol in the list is the preferred symbol. */
    private List<String> symbols = new ArrayList<>();

    /**
     * Creates a new instance of a base measurement scale with the unit in which points on this scale are expressed.
     * @param unit The unit in which points on this scale are expressed.
     */
    public ScaleImpl(Unit unit) {
        super();
        this.identifier = UUID.randomUUID().toString();
        this.unit = unit;
    }

    /**
     * Creates a new instance of a base measurement scale with the unit in which points on this scale are expressed,
     * with a name and symbol for the scale.
     * @param unit The unit in which points on this scale are expressed.
     * @param name The name of the scale.
     * @param symbol The symbol used for this scale.
     */
    public ScaleImpl(String name, String symbol,Unit unit) {
        super();
        this.identifier = UUID.randomUUID().toString();
        if(name!=null) names.add(new Pair<>("",name));
        if(symbol!=null) symbols.add(symbol);
        this.unit = unit;
    }

    /**
     * Creates a new instance of a base measurement scale with the unit in which points on this scale are expressed,
     * with an identifier, a name and symbol for the scale.
     * @param identifier The identifier, unique for this Scale.
     * @param name The name of the scale.
     * @param symbol The symbol used for this scale.
     * @param unit The unit in which points on this scale are expressed.
     */
    public ScaleImpl(String identifier, String name, String symbol,Unit unit) {
        super();
        this.identifier = identifier;
        if(name!=null) names.add(new Pair<>("",name));
        if(symbol!=null) symbols.add(symbol);
        this.unit = unit;
    }
    /**
     * Creates a new instance of a measurement scale, defined relative to the specified definition scale.
     * For instance the Fahrenheit scale is defined in relation to the Kelvin scale with an offset of
     * -459.67 and a multiplication factor of 1.8.
     * @param definitionScale The definition scale.
     * @param offset The offset from the definition scale.
     * @param factor The multiplication factor in relation to the definition scale.
     * @param unit The unit in which points on this scale are expressed.
     */
    public ScaleImpl(Scale definitionScale, double offset, double factor,Unit unit) {
        super();
        this.identifier = UUID.randomUUID().toString();
        this.definitionScale = definitionScale;
        this.offset = offset;
        this.factor = factor;
        this.unit = unit;
    }

    /**
     * Creates a new instance of a measurement scale, defined relative to the specified definition scale,
     * with a name and symbol for the scale.
     * For instance the Fahrenheit scale is defined in relation to the Kelvin scale with an offset of
     * -459.67 and a multiplication factor of 1.8.
     * @param name The name of the scale.
     * @param symbol The symbol used for this scale.
     * @param definitionScale The definition scale.
     * @param offset The offset from the definition scale.
     * @param factor The multiplication factor in relation to the definition scale.
     * @param unit The unit in which points on this scale are expressed.
     */
    public ScaleImpl(String name, String symbol, Scale definitionScale, double offset, double factor,Unit unit) {
        super();
        this.identifier = UUID.randomUUID().toString();
        if(name!=null) names.add(new Pair<>("",name));
        if(symbol!=null) symbols.add(symbol);
        this.definitionScale = definitionScale;
        this.offset = offset;
        this.factor = factor;
        this.unit = unit;
    }

    /**
     * Creates a new instance of a measurement scale, defined relative to the specified definition scale,
     * with a name and symbol for the scale.
     * For instance the Fahrenheit scale is defined in relation to the Kelvin scale with an offset of
     * -459.67 and a multiplication factor of 1.8.
     * @param identifier The identifier, unique for this Scale.
     * @param name The name of the scale.
     * @param symbol The symbol used for this scale.
     * @param definitionScale The definition scale.
     * @param offset The offset from the definition scale.
     * @param factor The multiplication factor in relation to the definition scale.
     * @param unit The unit in which points on this scale are expressed.
     */
    public ScaleImpl(String identifier, String name, String symbol, Scale definitionScale, double offset, double factor,Unit unit) {
        super();
        this.identifier = identifier;
        if(name!=null) names.add(new Pair<>("",name));
        if(symbol!=null) symbols.add(symbol);
        this.definitionScale = definitionScale;
        this.offset = offset;
        this.factor = factor;
        this.unit = unit;
    }

    /**
     * Returns the measurement scale related to which this measurement scale is defined or null if it is not
     * defined relative to another scale.
     * For instance the Centigrade (Celsius) scale is defined in relation to the Kelvin scale.
     * This implies that some measurement scales do not have a definition scale, e.g. the Kelvin scale.
     * These scales are defined using points that refer to specific quantities.
     * For instance the point 373.15 K is defined in terms of the boiling point of water.
     *
     * @return The definition scale.
     */
    @Override
    public Scale getDefinitionScale() {
        return definitionScale;
    }

    /**
     * The linear offset from the definition scale, or null if the scale is not defined relative to another scale.
     * For instance the Fahrenheit scale has an offset of -459.67
     *
     * @return The offset.
     */
    @Override
    public double getOffsetFromDefinitionScale() {
        return offset;
    }

    /**
     * The multiplication factor in relation to the definition scale, or null if the scale is not defined
     * relative to another scale.
     * For instance the Fahrenheit scale has a factor of 1.8
     *
     * @return The multiplication factor.
     */
    @Override
    public double getFactorFromDefinitionScale() {
        return factor;
    }

    /**
     * Returns the points on the scale which are used to define the measurement scale. For instance, the
     * Celsius scale is defined by points such as the boiling point of water (i.e. 100 degrees Celsius).
     *
     * @return A list with definition points.
     */
    @Override
    public List<Point> getDefinitionPoints() {
        return definitionPoints;
    }

    /**
     * Adds a point on this measurement scale that is used to define the scale. For instance, the
     * Celsius scale is defined by points such as the boiling point of water (i.e. 100 degrees Celsius).
     * @param point The point.
     */
    public void addDefinitionPoint(Point point){
        definitionPoints.add(point);
    }

    /**
     * Returns the associated unit for this measurement scale.
     * The celsius scale has, for instance, the unit celsius.
     *
     * @return The unit associated with the measurement scale.
     */
    @Override
    public Unit getUnit() {
        return unit;
    }


    /**
     * Returns the identifier for the specific scale. This identifier should be unique
     * and should be used to compare object for equality.
     *
     * @return The identifier for the object.
     */
    @Override
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Returns the preferred name of the scale or null if not set.
     *
     * @return The preferred name.
     */
    @Override
    public String getName() {
        if(names.size()<=0) return null;
        return names.get(0).getValue();
    }

    /**
     * Returns alternative names for the scale not including the preferred name.
     * If no alternative names exist, an empty list is returned.
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
     * Returns the preferred name in the specified language if it is known for this scale.
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
     * @param name An alternative name of the Scale.
     * @param language The language of the name.
     */
    public void addAlternativeName(String name,String language){
        if(language==null) language="";
        names.add(new Pair(language,name));
    }

    /**
     * Returns the preferred symbol used for this scale.
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
     * Returns a list of alternative symbols for this scale.
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
     * Add an alternative symbol to the Scale.
     * @param symbol The alternative symbol.
     */
    public void addAlternativeSymbol(String symbol){
        symbols.add(symbol);
    }

    /**
     * Test whether the specified object is equal to this Scale. If the object
     * is an instance of Scale, the identifiers are compared and if they are equal,
     * the scales are equal.
     * @param object The object to be compared to this scale.
     * @return True when the object is equal to this scale, false otherwise.
     */
    @Override
    public boolean equals(Object object){
        if(object instanceof Scale){
            return ((Scale)object).getIdentifier().equals(this.getIdentifier());
        }
        return false;
    }
}
