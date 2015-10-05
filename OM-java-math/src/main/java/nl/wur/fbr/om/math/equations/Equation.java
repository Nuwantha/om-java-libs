package nl.wur.fbr.om.math.equations;


import nl.wur.fbr.om.model.quantities.Quantity;

/**
 * @author Don Willems on 05/10/15.
 */
public class Equation {

    private Expression left, right;
    private ConditionalExpression condition;

    public Equation(Expression left, ConditionalExpression condition, Expression right){
        this.left = left;
        this.right = right;
        this.condition = condition;
    }

    public Equation(Quantity left, ConditionalExpression condition, Expression right){
        this.left = new Expression(left);
        this.right = right;
        this.condition = condition;
    }

    public Equation(Quantity left, ConditionalExpression condition, Quantity right){
        this.left = new Expression(left);
        this.right = new Expression(right);
        this.condition = condition;
    }

    public Expression getLeftExpression(){
        return left;
    }

    public ConditionalExpression getConditionalExpression(){
        return condition;
    }

    public Expression getRightExpression(){
        return right;
    }

    public boolean isDimensionalConsistent(){
        if(left.isDimensionalConsistent() && right.isDimensionalConsistent()){
            return left.getDimensionOfResult().equals(right.getDimensionOfResult());
        }
        return false;
    }

    @Override
    public String toString(){
        String str = left.toString()+" "+condition.getSymbol()+" "+right.toString();
        if(!this.isDimensionalConsistent()) str = "["+str+"->XX]";
        return str;
    }
}
