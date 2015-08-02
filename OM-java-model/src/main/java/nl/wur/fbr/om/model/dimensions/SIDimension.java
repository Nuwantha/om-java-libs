package nl.wur.fbr.om.model.dimensions;

/**
 * This enumeration defines the set of dimensions as defined in the SI system of units.
 * By convention physical quantities are organized in a system of dimensions. Each of the seven base quantities used
 * in the SI is regarded as having its own dimension, which is symbolically represented by a single sans serif roman
 * capital letter.
 * @author Don Willems on 02/08/15.
 */
public enum SIDimension implements Dimension{

    /** The dimension of length. */
    LENGTH ("Length","L"),

    /** The dimension of mass. */
    MASS ("Mass","M"),

    /** The dimension of time or duration. */
    TIME ("Time","T"),

    /** The dimension of electrical current. */
    ELECTRIC_CURRENT ("Electric current","I"),

    /** The dimension of thermodynamic temperature. */
    TEMPERATURE ("Thermodynamic temperature","Θ"),

    /** The dimension of amount of substance. */
    AMOUNT ("Amount of substance","N"),

    /** The dimension of luminous intensity. */
    LUMINOUS_INTENSITY ("Luminous intensity","J");

    /** The symbol of the dimension. */
    private String symbol;
    /** The name of the dimension. */
    private String name;

    /**
     * Creates a new SI dimension with the specified name and symbol.
     * @param name The name of the dimension.
     * @param symbol The symbol of the dimension.
     */
    SIDimension(String name, String symbol){
        this.name = name;
        this.symbol = symbol;
    }

    /**
     * The name of the dimension.
     * @return The name.
     */
    @Override
    public String getName(){
        return name;
    }

    /**
     * The symbol used for the dimension.
     * @return The symbol.
     */
    @Override
    public String getSymbol(){
        return symbol;
    }
}
