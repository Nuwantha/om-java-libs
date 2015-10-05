package nl.wur.fbr.om.core.set.quantities.temperature;

import nl.wur.fbr.om.core.impl.quantities.AbstractQuantity;
import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.exceptions.QuantityCreationException;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.quantities.QuantityClass;

/**
 * Instances of this class represent a temperature (absolute or difference).
 * The temperature can be an absolute temperature on a measurement scale such as
 * the celsius or kelvin scales, or it can be a temperature difference.
 *
 * To create temperatures on a measurement scale use
 *
 * @author Don Willems on 05/10/15.
 */
public class Temperature extends AbstractQuantity {

    /**
     * Creates a Temperature quantity without a point on a measurement scale, i.e. this quantity is a variable.
     * This quantity accepts only points on a measurement scale and is therefore an absolute temperature.
     * An identifier will be automatically generated.
     */
    public Temperature() {
        super(true);
    }

    /**
     * Creates a Temperature quantity without a measure or point on a measurement scale, i.e. this quantity is a variable.
     * An identifier will be automatically generated.
     *
     * @param isTemperatureDifference True when the temperature is a temperature difference and not an
     *                                absolute temperature, and therefore, only accepts measures as value,
     *                                or false when the temperature is an absolute temperature and should
     *                                only accept points on a measurement scale.
     */
    public Temperature(boolean isTemperatureDifference) {
        super(!isTemperatureDifference);
    }

    /**
     * Creates a temperature difference quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the quantity.
     * @throws QuantityCreationException When the dimension of the quantity did not match the
     * dimension of the unit of the point.
     */
    public Temperature(Measure measure) throws QuantityCreationException {
        super(measure);
    }

    /**
     * Creates a Temperature quantity without a point on a measurement scale as value, i.e. this quantity is variable.
     * This quantity accepts only points on a measurement scale and is therefore an absolute temperature.
     * An identifier will be automatically generated.
     *
     * @param name    The name of the quantity.
     * @param symbol  The symbol used for the quantity.
     */
    public Temperature(String name, String symbol) {
        super(name, symbol,true);
    }

    /**
     * Creates a temperature difference quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param name    The name of the quantity.
     * @param symbol  The symbol used for the quantity.
     * @param isTemperatureDifference True when the temperature is a temperature difference and not an
     *                                absolute temperature, and therefore, only accepts measures as value,
     *                                or false when the temperature is an absolute temperature and should
     *                                only accept points on a measurement scale.
     */
    public Temperature(String name, String symbol,boolean isTemperatureDifference) {
        super(name, symbol,true);
    }


    /**
     * Creates an absolute temperature quantity with the specified point on a measurement scale as value.
     * An identifier will be automatically generated.
     *
     * @param point The value of the quantity.
     * @throws QuantityCreationException When the dimension of the quantity did not match the
     * dimension of the unit of the point.
     */
    public Temperature(Point point) throws QuantityCreationException {
        super(point);
    }

    /**
     * Creates a temperature difference quantity with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param name    The name of the quantity.
     * @param symbol  The symbol used for the quantity.
     * @param measure The value of the quantity.
     * @throws QuantityCreationException When the dimension of the quantity did not match the
     * dimension of the unit of the point.
     */
    public Temperature(String name, String symbol, Measure measure) throws QuantityCreationException {
        super(name, symbol, measure);
    }

    /**
     * Creates an absolute temperature quantity with the specified point on a measurement scale as value.
     * An identifier will be automatically generated.
     *
     * @param name   The name of the quantity.
     * @param symbol The symbol used for the quantity.
     * @param point  The value of the quantity.
     * @throws QuantityCreationException When the dimension of the quantity did not match the
     * dimension of the unit of the point.
     */
    public Temperature(String name, String symbol, Point point) throws QuantityCreationException {
        super(name, symbol, point);
    }

    /**
     * Returns the {@link QuantityClass} for which this quantity is an instance.
     *
     * @return The quantity class.
     */
    @Override
    public QuantityClass getQuantityClass() {
        return CoreQuantitySet.TEMPERATURE;
    }
}
