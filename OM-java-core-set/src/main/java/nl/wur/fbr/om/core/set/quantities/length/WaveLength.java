package nl.wur.fbr.om.core.set.quantities.length;

import nl.wur.fbr.om.model.measures.Measure;

/**
 * Instances of this class represent a wave length quantity.
 * NB. If you want to define an electromagnetic wavelength (light) use {@link ElectromagneticWaveLength}.
 * @author Don Willems on 02/10/15.
 */
public class WaveLength extends Length {
    /**
     * Creates a wavelength with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the wavelength quantity.
     */
    public WaveLength(Measure measure) {
        super("wavelength","l",measure);
    }

    /**
     * Creates a wavelength with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the wavelength quantity.
     */
    public WaveLength(String name, String symbol, Measure measure) {
        super(name,symbol,measure);
    }

}
