package nl.wur.fbr.om.model.dimensions;

/**
 * This enumeration defines the set of base dimensions as defined in the SI system of units.
 * By convention physical quantities are organized in a system of dimensions. Each of the seven base quantities used
 * in the SI is regarded as having its own base dimension, which is symbolically represented by a single sans serif roman
 * capital letter.
 * @author Don Willems on 02/08/15.
 */
public enum SIBaseDimension implements BaseDimension {

    /** The base dimension of length. */
    LENGTH ("Length","L"),

    /** The base dimension of mass. */
    MASS ("Mass","M"),

    /** The base dimension of time or duration. */
    TIME ("Time","T"),

    /** The base dimension of electrical current. */
    ELECTRIC_CURRENT ("Electric current","I"),

    /** The base dimension of thermodynamic temperature. */
    THERMODYNAMIC_TEMPERATURE("Thermodynamic temperature","Θ"),

    /** The base dimension of amount of substance. */
    AMOUNT_OF_SUBSTANCE("Amount of substance","N"),

    /** The base dimension of luminous intensity. */
    LUMINOUS_INTENSITY ("Luminous intensity","J");

    /** The symbol of the base dimension. */
    private String symbol;
    /** The name of the base dimension. */
    private String name;

    /**
     * Creates a new SI base dimension with the specified name and symbol.
     * @param name The name of the base dimension.
     * @param symbol The symbol of the base dimension.
     */
    SIBaseDimension(String name, String symbol){
        this.name = name;
        this.symbol = symbol;
    }

    /**
     * The name of the base dimension.
     * @return The name.
     */
    @Override
    public String getName(){
        return name;
    }

    /**
     * The symbol used for the base dimension.
     * @return The symbol.
     */
    @Override
    public String getSymbol(){
        return symbol;
    }
}
