package nl.wur.fbr.om.core.impl.measures;


import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.units.Unit;

/**
 * This class implements the {@link Measure Measure} interface that represents a value expressed in a unit.
 * For some measurements like temperature (if it is not relative, i.e. difference between temperatures),
 * {@link Point Point} should be used instead of <code>Measure</code> as these measurements are defined on a
 * measurement scale.
 * @author Don Willems on 20/07/15.
 */
public class MeasureImpl implements Measure {

    /** The unit in which the numerical value for this measure is expressed. */
    private Unit unit;

    /** The numerical value. This may be a number, or a tensor or vector. */
    private Object numericalValue;

    /**
     * Creates a new {@link Measure} with the specified numerical value expressed in the specified Unit.
     *
     * @param numericalValue The numerical value.
     * @param unit The unit.
     */
    public MeasureImpl(Object numericalValue, Unit unit){
        this.unit = unit;
        this.numericalValue = numericalValue;
    }

    /**
     * The unit in which the measure is epressed.
     *
     * @return The unit or measurement scale.
     */
    @Override
    public Unit getUnit() {
        return unit;
    }

    /**
     * The numerical value of the measure.
     * The return type is an Object but can be of type Number, or (in the future) of Vector or Tensor types.
     *
     * @return The numerical value.
     */
    @Override
    public Object getNumericalValue() {
        return numericalValue;
    }

    /**
     * A string representation of this measure, the string representation of the numerical value followed by the
     * symbol of the unit if not null. For instance, a measure with value 15 and unit metre,
     * will be represented as 15 m.
     * @return The
     */
    @Override
    public String toString(){
        String str = ""+numericalValue;
        if(getUnit()!=null && getUnit().getSymbol()!=null){
            str+= " " + getUnit().getSymbol();
        }
        return str;
    }
}
