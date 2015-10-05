package nl.wur.fbr.om.core.set.quantities;

import nl.wur.fbr.om.core.impl.quantities.DefaultQuantityClass;
import nl.wur.fbr.om.core.set.CoreUnitAndScaleSet;
import nl.wur.fbr.om.core.set.quantities.electricalcurrent.ElectricalCurrent;
import nl.wur.fbr.om.core.set.quantities.force.Force;
import nl.wur.fbr.om.core.set.quantities.length.*;
import nl.wur.fbr.om.core.set.quantities.luminosity.LuminousIntensity;
import nl.wur.fbr.om.core.set.quantities.mass.Mass;
import nl.wur.fbr.om.core.set.quantities.force.Weight;
import nl.wur.fbr.om.core.set.quantities.substance.AmountOfSubstance;
import nl.wur.fbr.om.core.set.quantities.temperature.Temperature;
import nl.wur.fbr.om.core.set.quantities.time.Date;
import nl.wur.fbr.om.core.set.quantities.time.Time;
import nl.wur.fbr.om.model.QuantitySet;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.quantities.QuantityClass;

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

    private static String NAMESPACE;

    /** Length is the amount of space between two geographical points along a curve. It is a base quantity in the
     * International System of Units and other systems of units. */
    public static QuantityClass LENGTH;

    /** Distance is a numerical description of how far apart objects are. */
    public static QuantityClass DISTANCE;

    /**
     * The diameter of a circle or sphere is any straight line segment that passes through the center of
     * the circle or sphere and whose endpoints lie on the circle or sphere.
     */
    public static QuantityClass DIAMETER;

    /**
     * The radius of a circle or sphere is the length of a line segment from its center to its
     * perimeter.
     */
    public static QuantityClass RADIUS;

    /**
     * The wavelength of a wave is the spatial period of the wave—the distance over which the wave's shape
     * repeats, and the inverse of the spatial frequency
     */
    public static QuantityClass WAVELENGTH;

    /**
     * The wavelength of an electromagnetic wave, i.e. light.
     */
    public static QuantityClass ELECTROMAGNETIC_WAVELENGTH;

    /**
     * Mass is the amount of matter of a phenomenon. It is a base quantity in the International System of Units.
     */
    public static QuantityClass MASS;

    /**
     * Time is a base quantity in the International System of Units and other systems of units.
     * It is measured by numbers of repetitions of cyclical events.
     */
    public static QuantityClass TIME;

    /**
     * A calendar date is a reference to a particular day represented within a calendar system.
     */
    public static QuantityClass DATE;

    /**
     * The electrical current is a quantity that measures the flow of electric charge.
     * In electric circuits this charge is often carried by moving
     * electrons in a wire. It can also be carried by ions in an electrolyte, or by both ions and electrons such
     * as in a plasma.
     */
    public static QuantityClass ELECTRICAL_CURRENT;


    /**
     * Temperature is the extent to which an object is hot. The temperature can be measured on a temperature scale
     * (absolute temperature) or a temperature difference, where it would be a measure instead of a point on a
     * measurement scale.
     */
    public static QuantityClass TEMPERATURE;


    /**
     * Amount of substance is the number of elementary entities such as atoms, molecules, electrons, particles, etc.
     * present in a phenomenon. It is a base quantity in the International System of Units.
     */
    public static QuantityClass AMOUNT_OF_SUBSTANCE;


    /**
     * Luminous intensity is the wavelength-weighted power emitted by a light source in a particular direction per
     * unit solid angle. It is a base quantity in the International System of Units.
     */
    public static QuantityClass LUMINOUS_INTENSITY;


    /**
     * Force is the extent to which an object with mass can be caused to accelerate. It is a derived quantity in the
     * International System of Units. Force is mass times acceleration.
     */
    public static QuantityClass FORCE;

    /**
     * Weight is a force that attracts a body towards another (reference) body, e.g. Earth.
     */
    public static QuantityClass WEIGHT;

    private static Set<QuantityClass> quantityClasses = new HashSet<>();
    private static Map<String,QuantityClass> quantityClassesByID = new HashMap<>();

    static {
        NAMESPACE = "nl.wur.fbr.om.core.set.quantity.";

        // LENGTH Quantities
        Dimension dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, 1);
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
        quantityClassesByID.put(ELECTROMAGNETIC_WAVELENGTH.getIdentifier(), ELECTROMAGNETIC_WAVELENGTH);


        // MASS quantities

        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.GRAM);
        uoss.add(CoreUnitAndScaleSet.KILOGRAM);
        uoss.add(CoreUnitAndScaleSet.MILLIGRAM);
        uoss.add(CoreUnitAndScaleSet.MICROGRAM);

        MASS = new DefaultQuantityClass(NAMESPACE+"Mass","mass","m",dimension,CoreUnitAndScaleSet.KILOGRAM,uoss, Mass.class);
        quantityClasses.add(MASS);
        quantityClassesByID.put(MASS.getIdentifier(), MASS);


        // TIME quantities

        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.SECOND);
        uoss.add(CoreUnitAndScaleSet.MILLISECOND);
        uoss.add(CoreUnitAndScaleSet.MICROSECOND);
        uoss.add(CoreUnitAndScaleSet.NANOSECOND);
        uoss.add(CoreUnitAndScaleSet.MINUTE);
        uoss.add(CoreUnitAndScaleSet.HOUR);
        uoss.add(CoreUnitAndScaleSet.YEAR);
        uoss.add(CoreUnitAndScaleSet.DAY);

        TIME = new DefaultQuantityClass(NAMESPACE+"Time","time","s",dimension,CoreUnitAndScaleSet.SECOND,uoss, Time.class);
        quantityClasses.add(TIME);
        quantityClassesByID.put(TIME.getIdentifier(), TIME);

        DATE = new DefaultQuantityClass(NAMESPACE+"Date","date","s",dimension,CoreUnitAndScaleSet.SECOND,uoss, Date.class);
        quantityClasses.add(DATE);
        quantityClassesByID.put(DATE.getIdentifier(), DATE);


        // ELECTRICAL CURRENT quantities

        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.AMPERE);

        ELECTRICAL_CURRENT = new DefaultQuantityClass(NAMESPACE+"ElectricalCurrent","electrical current","I",dimension,CoreUnitAndScaleSet.AMPERE,uoss, ElectricalCurrent.class);
        quantityClasses.add(ELECTRICAL_CURRENT);
        quantityClassesByID.put(ELECTRICAL_CURRENT.getIdentifier(), ELECTRICAL_CURRENT);


        // TEMPERATURE quantities

        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.CELSIUS_SCALE);
        uoss.add(CoreUnitAndScaleSet.KELVIN_SCALE);
        uoss.add(CoreUnitAndScaleSet.FAHRENHEIT_SCALE);
        uoss.add(CoreUnitAndScaleSet.CELSIUS);
        uoss.add(CoreUnitAndScaleSet.KELVIN);
        uoss.add(CoreUnitAndScaleSet.FAHRENHEIT);

        TEMPERATURE = new DefaultQuantityClass(NAMESPACE+"Temperature","temperature","T",dimension,CoreUnitAndScaleSet.KELVIN_SCALE,uoss, Temperature.class);
        quantityClasses.add(TEMPERATURE);
        quantityClassesByID.put(TEMPERATURE.getIdentifier(), TEMPERATURE);


        // FORCE quantities

        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.NEWTON);

        FORCE = new DefaultQuantityClass(NAMESPACE+"Force","force","F",dimension,CoreUnitAndScaleSet.NEWTON,uoss, Force.class);
        quantityClasses.add(FORCE);
        quantityClassesByID.put(FORCE.getIdentifier(), FORCE);

        WEIGHT = new DefaultQuantityClass(NAMESPACE+"Weight","weight","W",dimension,CoreUnitAndScaleSet.NEWTON,uoss, Weight.class);
        quantityClasses.add(WEIGHT);
        quantityClassesByID.put(WEIGHT.getIdentifier(), WEIGHT);


        // AMOUNT OF SUBSTANCE quantities

        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.MOLE);

        AMOUNT_OF_SUBSTANCE = new DefaultQuantityClass(NAMESPACE+"AmountOfSubstance","amount of substance","n",dimension,CoreUnitAndScaleSet.MOLE,uoss, AmountOfSubstance.class);
        quantityClasses.add(AMOUNT_OF_SUBSTANCE);
        quantityClassesByID.put(AMOUNT_OF_SUBSTANCE.getIdentifier(), AMOUNT_OF_SUBSTANCE);


        // LUMINOUS INTENSITY quantities

        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.CANDELA);

        AMOUNT_OF_SUBSTANCE = new DefaultQuantityClass(NAMESPACE+"LuminousIntensity","luminous intensity","I",dimension,CoreUnitAndScaleSet.CANDELA,uoss, LuminousIntensity.class);
        quantityClasses.add(AMOUNT_OF_SUBSTANCE);
        quantityClassesByID.put(AMOUNT_OF_SUBSTANCE.getIdentifier(), AMOUNT_OF_SUBSTANCE);
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
