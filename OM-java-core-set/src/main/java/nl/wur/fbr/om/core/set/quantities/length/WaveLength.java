package nl.wur.fbr.om.core.set.quantities.length;

import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.exceptions.QuantityCreationException;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.quantities.QuantityClass;

/**
 * Instances of this class represent a wave length quantity.
 * NB. If you want to define an electromagnetic wavelength (light) use {@link ElectromagneticWavelength}.
 * @author Don Willems on 02/10/15.
 */
public class Wavelength extends Length {
    /**
     * Creates a wavelength with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the wavelength quantity.
     * @throws QuantityCreationException When the dimension of the quantity did not match the
     * dimension of the unit of the point.
     */
    public Wavelength(Measure measure) throws QuantityCreationException {
        super("wavelength","l",measure);
    }

    /**
     * Creates a wavelength with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param name The custom name of the quantity.
     * @param symbol The custom symbol of the quantity.
     * @param measure The value of the wavelength quantity.
     * @throws QuantityCreationException When the dimension of the quantity did not match the
     * dimension of the unit of the point.
     */
    public Wavelength(String name, String symbol, Measure measure) throws QuantityCreationException {
        super(name,symbol,measure);
    }

    /**
     * Returns the {@link QuantityClass} for which this quantity is an instance.
     *
     * @return The quantity class.
     */
    @Override
    public QuantityClass getQuantityClass() {
        return CoreQuantitySet.WAVELENGTH;
    }

}
