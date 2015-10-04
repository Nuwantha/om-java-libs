package nl.wur.fbr.om.core.set.quantities;

import nl.wur.fbr.om.core.impl.quantities.DefaultQuantityClass;
import nl.wur.fbr.om.core.set.CoreUnitAndScaleSet;
import nl.wur.fbr.om.core.set.quantities.length.*;
import nl.wur.fbr.om.model.QuantitySet;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.quantities.QuantityClass;
import nl.wur.fbr.om.model.units.Unit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class contains the core set of quantities. You can use this class to create new quantity instances with
 * methods like: {@link CoreQuantitySet#createQuantity(QuantityClass, Measure)} and
 * {@link CoreQuantitySet#createQuantity(QuantityClass, Point)}. The {@link QuantityClass quantity classes} are
 * defined as static constants in this class (e.g. {@link CoreQuantitySet#LENGTH}).
 *
 * @author Don Willems on 04/10/15.
 */
public class CoreQuantitySet extends QuantitySet {

    public static String NAMESPACE;
    public static QuantityClass LENGTH;
    public static QuantityClass DISTANCE;
    public static QuantityClass DIAMETER;
    public static QuantityClass RADIUS;
    public static QuantityClass WAVELENGTH;
    public static QuantityClass ELECTROMAGNETIC_WAVELENGTH;

    private static Set<QuantityClass> quantityClasses = new HashSet<>();
    private static Map<String,QuantityClass> quantityClassesByID = new HashMap<>();

    static {
        NAMESPACE = "nl.wur.fbr.om.core.set.quantity.";

        // LENGTH Quantities
        Dimension dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH,1);
        Set<Object> uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.METRE);
        uoss.add(CoreUnitAndScaleSet.KILOMETRE);
        uoss.add(CoreUnitAndScaleSet.DECIMETRE);
        uoss.add(CoreUnitAndScaleSet.CENTIMETRE);
        uoss.add(CoreUnitAndScaleSet.MILLIMETRE);
        uoss.add(CoreUnitAndScaleSet.MICROMETRE);
        uoss.add(CoreUnitAndScaleSet.NANOMETRE);
        uoss.add(CoreUnitAndScaleSet.ANGSTROM);
        uoss.add(CoreUnitAndScaleSet.INCH);
        uoss.add(CoreUnitAndScaleSet.FEET);
        uoss.add(CoreUnitAndScaleSet.YARD);
        uoss.add(CoreUnitAndScaleSet.MILE);
        uoss.add(CoreUnitAndScaleSet.NAUTICAL_MILE);
        uoss.add(CoreUnitAndScaleSet.FATHOM);

        LENGTH = new DefaultQuantityClass(NAMESPACE+"Length","length","l",dimension,CoreUnitAndScaleSet.METRE,uoss,Length.class);
        quantityClasses.add(LENGTH);
        quantityClassesByID.put(LENGTH.getIdentifier(), LENGTH);

        DISTANCE = new DefaultQuantityClass(NAMESPACE+"Distance","distance","d",dimension,CoreUnitAndScaleSet.METRE,uoss,Distance.class);
        quantityClasses.add(DISTANCE);
        quantityClassesByID.put(DISTANCE.getIdentifier(), DISTANCE);

        DIAMETER = new DefaultQuantityClass(NAMESPACE+"Distance","distance","d",dimension,CoreUnitAndScaleSet.METRE,uoss,Diameter.class);
        quantityClasses.add(DIAMETER);
        quantityClassesByID.put(DIAMETER.getIdentifier(), DIAMETER);

        RADIUS = new DefaultQuantityClass(NAMESPACE+"Radius","radius","r",dimension,CoreUnitAndScaleSet.METRE,uoss,Radius.class);
        quantityClasses.add(RADIUS);
        quantityClassesByID.put(RADIUS.getIdentifier(), RADIUS);

        WAVELENGTH = new DefaultQuantityClass(NAMESPACE+"Wavelength","wavelength","l",dimension,CoreUnitAndScaleSet.METRE,uoss,Wavelength.class);
        quantityClasses.add(WAVELENGTH);
        quantityClassesByID.put(WAVELENGTH.getIdentifier(), WAVELENGTH);

        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.METRE);
        uoss.add(CoreUnitAndScaleSet.DECIMETRE);
        uoss.add(CoreUnitAndScaleSet.CENTIMETRE);
        uoss.add(CoreUnitAndScaleSet.MILLIMETRE);
        uoss.add(CoreUnitAndScaleSet.MICROMETRE);
        uoss.add(CoreUnitAndScaleSet.NANOMETRE);
        uoss.add(CoreUnitAndScaleSet.ANGSTROM);

        ELECTROMAGNETIC_WAVELENGTH = new DefaultQuantityClass(NAMESPACE+"ElectromagneticWavelength","wavelength","λ",dimension,CoreUnitAndScaleSet.NANOMETRE,uoss, ElectromagneticWavelength.class);
        quantityClasses.add(ELECTROMAGNETIC_WAVELENGTH);
        quantityClassesByID.put(ELECTROMAGNETIC_WAVELENGTH.getIdentifier(),ELECTROMAGNETIC_WAVELENGTH);
    }



    /**
     * Returns all quantity classes in this set.
     *
     * @return All quantity classes.
     */
    @Override
    public Set<QuantityClass> getAllQuantityClasses() {
        return quantityClasses;
    }

    /**
     * Returns The quantity class identified by the specified identifier.
     *
     * @param identifier The identifier of the quantity class.
     * @return The quantity class.
     */
    @Override
    public QuantityClass getQuantityClass(String identifier) {
        return quantityClassesByID.get(identifier);
    }
}
