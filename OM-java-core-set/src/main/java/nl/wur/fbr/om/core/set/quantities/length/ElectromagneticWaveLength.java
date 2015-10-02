package nl.wur.fbr.om.core.set.quantities.length;

import nl.wur.fbr.om.core.impl.quantities.AbstractQuantityClass;
import nl.wur.fbr.om.core.set.CoreSet;
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
public class ElectromagneticWaveLength extends WaveLength {

    private static QuantityClass quantityClass;

    static {
        Dimension dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, 1);
        Set<Unit> uoss = new HashSet<>();
        uoss.add(CoreSet.METRE);
        uoss.add(CoreSet.DECIMETRE);
        uoss.add(CoreSet.CENTIMETRE);
        uoss.add(CoreSet.MILLIMETRE);
        uoss.add(CoreSet.MICROMETRE);
        uoss.add(CoreSet.NANOMETRE);
        uoss.add(CoreSet.ANGSTROM);
        ElectromagneticWaveLength.quantityClass = new AbstractQuantityClass("nl.wur.fbr.om.core.set.quantity.ElectromagneticWaveLength","wavelength","λ") {
            @Override
            public Dimension getDimension() {
                return dimension;
            }

            @Override
            public boolean isDimensionless() {
                return false;
            }

            @Override
            public Unit getPreferredUnitOrScale() {
                return CoreSet.NANOMETRE;
            }

            @Override
            public Set<Unit> getUnitsOrScales(UnitAndScaleSet set) {
                return uoss;
            }
        };
    }
    /**
     * Creates an electromagnetic wavelength with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the wavelength quantity.
     */
    public ElectromagneticWaveLength(Measure measure) {
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
    public ElectromagneticWaveLength(String name, String symbol, Measure measure) {
        super(name, symbol, measure);
    }
}
