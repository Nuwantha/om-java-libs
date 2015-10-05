package nl.wur.fbr.om.core.set.quantities.time;

import nl.wur.fbr.om.core.impl.measures.MeasureImpl;
import nl.wur.fbr.om.core.set.CoreUnitAndScaleSet;
import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.quantities.QuantityClass;

/**
 * Instances of this class represent a Date quantity.
 * @author Don Willems on 05/10/15.
 */
public class Date extends Time {

    /**
     * Creates a Date quantity with the current date as value, where the value is the number of milliseconds since
     * the standard base time known as "the epoch", namely January 1, 1970, 00:00:00 GMT.
     * An identifier will be automatically generated.
     *
     */
    public Date() {
        super(new MeasureImpl((new java.util.Date()).getTime(), CoreUnitAndScaleSet.MILLISECOND));
    }

    /**
     * Creates a Date quantity with the specified date as value, where the value is the number of milliseconds since
     * the standard base time known as "the epoch", namely January 1, 1970, 00:00:00 GMT.
     * An identifier will be automatically generated.
     *
     * @param date The date.
     */
    public Date(java.util.Date date) {
        super(new MeasureImpl(date.getTime(), CoreUnitAndScaleSet.MILLISECOND));
    }

    /**
     * Creates a Date quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the quantity.
     */
    public Date(Measure measure) {
        super(measure);
    }

    /**
     * Creates a Date quantity with the current date as value, where the value is the number of milliseconds since
     * the standard base time known as "the epoch", namely January 1, 1970, 00:00:00 GMT.
     * An identifier will be automatically generated.
     *
     * @param name    The name of the quantity.
     * @param symbol  The symbol used for the quantity.
     */
    public Date(String name, String symbol) {
        super(name, symbol, new MeasureImpl((new java.util.Date()).getTime(), CoreUnitAndScaleSet.MILLISECOND));
    }

    /**
     * Creates a Date quantity with the specified date as value, where the value is the number of milliseconds since
     * the standard base time known as "the epoch", namely January 1, 1970, 00:00:00 GMT.
     * An identifier will be automatically generated.
     *
     * @param name    The name of the quantity.
     * @param symbol  The symbol used for the quantity.
     * @param date The date.
     */
    public Date(String name, String symbol, java.util.Date date) {
        super(name, symbol, new MeasureImpl(date.getTime(), CoreUnitAndScaleSet.MILLISECOND));
    }

    /**
     * Creates a Date quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param name    The name of the quantity.
     * @param symbol  The symbol used for the quantity.
     * @param measure The value of the quantity.
     */
    public Date(String name, String symbol, Measure measure) {
        super(name, symbol, measure);
    }

    /**
     * Returns the {@link QuantityClass} for which this quantity is an instance.
     *
     * @return The quantity class.
     */
    @Override
    public QuantityClass getQuantityClass() {
        return CoreQuantitySet.DATE;
    }
}
