package nl.wur.fbr.om.math.equations;

/**
 * @author Don Willems on 05/10/15.
 */
public enum ConditionalExpression {

    GREATER_THAN (">","greater than"),
    LESS_THAN ("<","less than"),
    GREATER_THAN_OR_EQUAL_TO (">=","greater than or equal to"),
    LESS_THAN_OR_EQUAL_TO ("<=","less than or equal to"),
    EQUAL_TO ("==","equal to"),
    NOT_EQUAL_TO ("!=","not equal to");

    private String symbol;
    private String name;

    ConditionalExpression(String conditionalSymbol,String conditionalName){
        this.symbol = conditionalSymbol;
        this.name = conditionalName;
    }

    public String getSymbol(){
        return symbol;
    }

    public String getName(){
        return name;
    }
}
