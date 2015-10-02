package nl.wur.fbr.om.core.set.quantities.length;

import nl.wur.fbr.om.core.impl.quantities.AbstractQuantity;
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
 * Instances of this class represent a length quantity.
 *
 * @author Don Willems on 02/10/15.
 */
public class Length extends AbstractQuantity {

    private static QuantityClass quantityClass;

    static {
        Dimension dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH,1);
        Set<Unit> uoss = new HashSet<>();
        uoss.add(CoreSet.METRE);
        uoss.add(CoreSet.KILOMETRE);
        uoss.add(CoreSet.DECIMETRE);
        uoss.add(CoreSet.CENTIMETRE);
        uoss.add(CoreSet.MILLIMETRE);
        uoss.add(CoreSet.MICROMETRE);
        uoss.add(CoreSet.NANOMETRE);
        uoss.add(CoreSet.ANGSTROM);
        uoss.add(CoreSet.INCH);
        uoss.add(CoreSet.FEET);
        uoss.add(CoreSet.YARD);
        uoss.add(CoreSet.MILE);
        uoss.add(CoreSet.NAUTICAL_MILE);
        uoss.add(CoreSet.FATHOM);
        Length.quantityClass = new AbstractQuantityClass("nl.wur.fbr.om.core.set.quantity.Length","length","l") {
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
                return CoreSet.METRE;
            }

            @Override
            public Set<Unit> getUnitsOrScales(UnitAndScaleSet set) {
                return uoss;
            }
        };
    }

    /**
     * Creates an Length with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the length quantity.
     */
    public Length(Measure measure) {
        super(measure);
    }

    /**
     * Creates a Length with the specified measure as value.
     * An identifier will be automatically generated.
     *
     * @param measure The value of the length quantity.
     */
    public Length(String name, String symbol, Measure measure) {
        super(name,symbol,measure);
    }

    /**
     * Returns the {@link QuantityClass} for which this quantity is an instance.
     *
     * @return The quantity class.
     */
    @Override
    public QuantityClass getQuantityClass() {
        return Length.quantityClass;
    }
}
