package nl.wur.fbr.om.math.equations;

/**
 * This enumeration defines the different conditional expressions that can be used in a {@link Equation}.
 *
 * @author Don Willems on 05/10/15.
 */
public enum ConditionalExpression {

    /**
     * The greater than (<code>&gt;</code>) conditional expression.
     */
    GREATER_THAN (">","greater than"),

    /**
     * The less than (<code>&lt;</code>) conditional expression.
     */
    LESS_THAN ("<","less than"),

    /**
     * The greater than or equal to (<code>&gt;=</code>) conditional expression.
     */
    GREATER_THAN_OR_EQUAL_TO (">=","greater than or equal to"),

    /**
     * The less than or equal to (<code>&lt;=</code>) conditional expression.
     */
    LESS_THAN_OR_EQUAL_TO ("<=","less than or equal to"),

    /**
     * The equal to (<code>=</code>) conditional expression.
     */
    EQUAL_TO ("=","equal to"),

    /**
     * The not equal to (<code>!=</code>) conditional expression.
     */
    NOT_EQUAL_TO ("!=","not equal to");

    private String symbol;
    private String name;

    ConditionalExpression(String conditionalSymbol,String conditionalName){
        this.symbol = conditionalSymbol;
        this.name = conditionalName;
    }

    /**
     * Returns the symbol (<code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>, <code>&lt;=</code>,
     * <code>=</code>, or <code>!=</code>) used for the conditional expression.
     * @return The symbol.
     */
    public String getSymbol(){
        return symbol;
    }

    /**
     * Returns the name (a string representation) of the conditional expression.
     * @return The name.
     */
    public String getName(){
        return name;
    }
}
