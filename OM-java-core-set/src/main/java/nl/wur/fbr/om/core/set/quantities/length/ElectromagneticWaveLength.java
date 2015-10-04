package nl.wur.fbr.om.core.set.quantities.length;

import nl.wur.fbr.om.core.impl.quantities.DefaultQuantityClass;
import nl.wur.fbr.om.core.set.CoreUnitAndScaleSet;
import nl.wur.fbr.om.core.set.quantities.CoreQuantitySet;
import nl.wur.fbr.om.model.UnitAndScaleSet;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.quantities.QuantityClass;
import nl.wur.fbr.om.model.units.Unit;

import java.util.HashSet;
import java.util.Set;

/**
 * Instances of this class represent an electromagnetic wavelength quantity.
 * @author Don Willems on 02/10/15.
 */
public class ElectromagneticWavelength extends Wavelength {

    /**
     * Creates an electromagnetic wavelength with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the wavelength quantity.
     */
    public ElectromagneticWavelength(Measure measure) {
        super("wavelength","λ",measure);
    }

    /**
     * Creates an electromagnetic wavelength with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param name The name of the electromagnetic wavelength
     * @param symbol The symbol of the electromagnetic wavelength.
     * @param measure The value of the wavelength quantity.
     */
    public ElectromagneticWavelength(String name, String symbol, Measure measure) {
        super(name, symbol, measure);
    }

    /**
     * Returns the {@link QuantityClass} for which this quantity is an instance.
     *
     * @return The quantity class.
     */
    @Override
    public QuantityClass getQuantityClass() {
        return CoreQuantitySet.ELECTROMAGNETIC_WAVELENGTH;
    }
}
