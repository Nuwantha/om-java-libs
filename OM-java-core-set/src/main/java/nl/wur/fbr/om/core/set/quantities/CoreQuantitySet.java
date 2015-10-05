package nl.wur.fbr.om.core.set.quantities;

import nl.wur.fbr.om.core.impl.quantities.DefaultQuantityClass;
import nl.wur.fbr.om.core.set.CoreUnitAndScaleSet;
import nl.wur.fbr.om.core.set.quantities.angle.Angle;
import nl.wur.fbr.om.core.set.quantities.angle.SolidAngle;
import nl.wur.fbr.om.core.set.quantities.electricity.*;
import nl.wur.fbr.om.core.set.quantities.energy.Energy;
import nl.wur.fbr.om.core.set.quantities.energy.Power;
import nl.wur.fbr.om.core.set.quantities.force.Force;
import nl.wur.fbr.om.core.set.quantities.force.Pressure;
import nl.wur.fbr.om.core.set.quantities.length.*;
import nl.wur.fbr.om.core.set.quantities.luminosity.LuminousIntensity;
import nl.wur.fbr.om.core.set.quantities.mass.Mass;
import nl.wur.fbr.om.core.set.quantities.force.Weight;
import nl.wur.fbr.om.core.set.quantities.substance.AmountOfSubstance;
import nl.wur.fbr.om.core.set.quantities.temperature.Temperature;
import nl.wur.fbr.om.core.set.quantities.time.Date;
import nl.wur.fbr.om.core.set.quantities.time.Frequency;
import nl.wur.fbr.om.core.set.quantities.time.Time;
import nl.wur.fbr.om.core.set.quantities.velocity.Acceleration;
import nl.wur.fbr.om.core.set.quantities.velocity.Velocity;
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
     * Area expresses the two-dimensional size of a defined part of a surface, typically a region bounded by a closed
     * curve. It is a derived quantity in the International System of Units. Area is length squared.
     */
    public static QuantityClass AREA;

    /**
     * Volume is a measure of how much three-dimensional space any phenomenon occupies. It is a derived quantity in
     * the International System of Units. Volume is length to the power 3.
     */
    public static QuantityClass VOLUME;


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
     * Frequency is a measure of the number of occurrences of a repeating event per unit time.
     */
    public static QuantityClass FREQUENCY;

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


    /**
     * Pressure is the force applied to or distributed over a surface. It is a derived quantity in the
     * International System of Units. Pressure is force divided by area.
     */
    public static QuantityClass PRESSURE;

    /**
     * A Plane angle is the ratio between an arc and its radius.
     */
    public static QuantityClass ANGLE;

    /**
     * ASolid angle is the ratio of the surface of a portion of a sphere enclosed by the conical surface that forms an
     * angle to the square of the radius of the sphere.
     */
    public static QuantityClass SOLID_ANGLE;

    /**
     * Velocity is the rate of change of position.
     */
    public static QuantityClass VELOCITY;

    /**
     * Acceleration is the rate of change of the velocity of an object.
     */
    public static QuantityClass ACCELERATION;

    /**
     * Energy can be defined as the ability to do work. It is a derived quantity in the International System of Units.
     */
    public static QuantityClass ENERGY;

    /**
     * Power is the time rate at which work is done. It is a derived quantity in the International System of Units.
     * Power is energy divided by time.
     */
    public static QuantityClass POWER;

    /**
     * Electric charge is a conserved property of some subatomic particles, which determines their electromagnetic
     * interaction. It is a derived quantity in the International System of Units. Electric charge is electric current
     * times time.
     */
    public static QuantityClass ELECTRICAL_CHARGE;

    /**
     * Electric potential is the potential energy per unit charge associated with static (time-invariant) electric field.
     */
    public static QuantityClass ELECTRICAL_POTENTIAL;

    /**
     * Capacitance is the ability to hold electrical charge. It is a derived quantity in the International System of
     * Units. Capacitance is electric charge divided by electric potential.
     */
    public static QuantityClass ELECTRICAL_CAPACITANCE;

    /**
     * Electrical resistance is the degree to which an object opposes an electric current through it. It is a derived
     * quantity in the International System of Units. Electrical resistance is electric potential divided by
     * electric current.
     */
    public static QuantityClass ELECTRICAL_RESISTANCE;

    /**
     * Electrical conductance is a measure of how easily electricity flows along a certain path through an electrical
     * element.
     */
    public static QuantityClass ELECTRICAL_CONDUCTANCE;



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

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, 2);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.SQUARE_METRE);
        uoss.add(CoreUnitAndScaleSet.SQUARE_KILOMETRE);
        uoss.add(CoreUnitAndScaleSet.SQUARE_FEET);
        uoss.add(CoreUnitAndScaleSet.SQUARE_MILE);
        uoss.add(CoreUnitAndScaleSet.HECTARE);
        uoss.add(CoreUnitAndScaleSet.ACRE);

        AREA = new DefaultQuantityClass(NAMESPACE+"Area","area","A",dimension,CoreUnitAndScaleSet.SQUARE_METRE,uoss, Area.class);
        quantityClasses.add(AREA);
        quantityClassesByID.put(AREA.getIdentifier(), AREA);

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, 3);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.CUBIC_METRE);
        uoss.add(CoreUnitAndScaleSet.LITRE);
        uoss.add(CoreUnitAndScaleSet.MILLILITRE);
        uoss.add(CoreUnitAndScaleSet.PINT_IMPERIAL);
        uoss.add(CoreUnitAndScaleSet.GALLON_IMPERIAL);
        uoss.add(CoreUnitAndScaleSet.CUP);
        uoss.add(CoreUnitAndScaleSet.TEASPOON);
        uoss.add(CoreUnitAndScaleSet.TABLESPOON);

        VOLUME = new DefaultQuantityClass(NAMESPACE+"Volume","volume","V",dimension,CoreUnitAndScaleSet.CUBIC_METRE,uoss, Volume.class);
        quantityClasses.add(VOLUME);
        quantityClassesByID.put(VOLUME.getIdentifier(), VOLUME);


        // MASS quantities

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.MASS, 1);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.GRAM);
        uoss.add(CoreUnitAndScaleSet.KILOGRAM);
        uoss.add(CoreUnitAndScaleSet.MILLIGRAM);
        uoss.add(CoreUnitAndScaleSet.MICROGRAM);

        MASS = new DefaultQuantityClass(NAMESPACE+"Mass","mass","m",dimension,CoreUnitAndScaleSet.KILOGRAM,uoss, Mass.class);
        quantityClasses.add(MASS);
        quantityClassesByID.put(MASS.getIdentifier(), MASS);


        // TIME quantities

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.TIME, 1);
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


        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.TIME, -1);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.HERTZ);

        FREQUENCY = new DefaultQuantityClass(NAMESPACE+"Frequency","frequency","f",dimension,CoreUnitAndScaleSet.HERTZ,uoss, Frequency.class);
        quantityClasses.add(FREQUENCY);
        quantityClassesByID.put(DATE.getIdentifier(), FREQUENCY);


        // ELECTRICITY quantities

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.ELECTRIC_CURRENT, 1);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.AMPERE);

        ELECTRICAL_CURRENT = new DefaultQuantityClass(NAMESPACE+"ElectricalCurrent","electrical current","I",dimension,CoreUnitAndScaleSet.AMPERE,uoss, ElectricalCurrent.class);
        quantityClasses.add(ELECTRICAL_CURRENT);
        quantityClassesByID.put(ELECTRICAL_CURRENT.getIdentifier(), ELECTRICAL_CURRENT);

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.TIME, 1);
        dimension.setDimensionalExponent(SIBaseDimension.ELECTRIC_CURRENT, 1);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.COULOMB);

        ELECTRICAL_CHARGE = new DefaultQuantityClass(NAMESPACE+"ElectricalCharge","electrical charge","Q",dimension,CoreUnitAndScaleSet.COULOMB,uoss, ElectricalCharge.class);
        quantityClasses.add(ELECTRICAL_CHARGE);
        quantityClassesByID.put(ELECTRICAL_CHARGE.getIdentifier(), ELECTRICAL_CHARGE);

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, -2);
        dimension.setDimensionalExponent(SIBaseDimension.MASS, -1);
        dimension.setDimensionalExponent(SIBaseDimension.TIME, 4);
        dimension.setDimensionalExponent(SIBaseDimension.ELECTRIC_CURRENT, 1);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.FARAD);

        ELECTRICAL_CAPACITANCE = new DefaultQuantityClass(NAMESPACE+"ElectricalCapacitance","electrical capacitance","C",dimension,CoreUnitAndScaleSet.FARAD,uoss, ElectricalCapacitance.class);
        quantityClasses.add(ELECTRICAL_CAPACITANCE);
        quantityClassesByID.put(ELECTRICAL_CAPACITANCE.getIdentifier(), ELECTRICAL_CAPACITANCE);

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, -2);
        dimension.setDimensionalExponent(SIBaseDimension.MASS, -1);
        dimension.setDimensionalExponent(SIBaseDimension.TIME, 3);
        dimension.setDimensionalExponent(SIBaseDimension.ELECTRIC_CURRENT, 2);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.SIEMENS);

        ELECTRICAL_CONDUCTANCE = new DefaultQuantityClass(NAMESPACE+"ElectricalConductance","electrical conductance","G",dimension,CoreUnitAndScaleSet.SIEMENS,uoss, ElectricalConductance.class);
        quantityClasses.add(ELECTRICAL_CONDUCTANCE);
        quantityClassesByID.put(ELECTRICAL_CONDUCTANCE.getIdentifier(), ELECTRICAL_CONDUCTANCE);

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, 2);
        dimension.setDimensionalExponent(SIBaseDimension.MASS, 1);
        dimension.setDimensionalExponent(SIBaseDimension.TIME, -3);
        dimension.setDimensionalExponent(SIBaseDimension.ELECTRIC_CURRENT, -1);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.VOLT);

        ELECTRICAL_POTENTIAL = new DefaultQuantityClass(NAMESPACE+"ElectricalPotential","electrical potential","V",dimension,CoreUnitAndScaleSet.VOLT,uoss, ElectricalPotential.class);
        quantityClasses.add(ELECTRICAL_POTENTIAL);
        quantityClassesByID.put(ELECTRICAL_POTENTIAL.getIdentifier(), ELECTRICAL_POTENTIAL);

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, 2);
        dimension.setDimensionalExponent(SIBaseDimension.MASS, 1);
        dimension.setDimensionalExponent(SIBaseDimension.TIME, -3);
        dimension.setDimensionalExponent(SIBaseDimension.ELECTRIC_CURRENT, -2);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.OHM);

        ELECTRICAL_RESISTANCE = new DefaultQuantityClass(NAMESPACE+"ElectricalResistance","electrical resistance","R",dimension,CoreUnitAndScaleSet.OHM,uoss, ElectricalResistance.class);
        quantityClasses.add(ELECTRICAL_RESISTANCE);
        quantityClassesByID.put(ELECTRICAL_RESISTANCE.getIdentifier(), ELECTRICAL_RESISTANCE);


        // TEMPERATURE quantities

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.THERMODYNAMIC_TEMPERATURE, 1);
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

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.MASS, 1);
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, 1);
        dimension.setDimensionalExponent(SIBaseDimension.TIME, -2);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.NEWTON);

        FORCE = new DefaultQuantityClass(NAMESPACE+"Force","force","F",dimension,CoreUnitAndScaleSet.NEWTON,uoss, Force.class);
        quantityClasses.add(FORCE);
        quantityClassesByID.put(FORCE.getIdentifier(), FORCE);

        WEIGHT = new DefaultQuantityClass(NAMESPACE+"Weight","weight","W",dimension,CoreUnitAndScaleSet.NEWTON,uoss, Weight.class);
        quantityClasses.add(WEIGHT);
        quantityClassesByID.put(WEIGHT.getIdentifier(), WEIGHT);

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, -1);
        dimension.setDimensionalExponent(SIBaseDimension.MASS, 1);
        dimension.setDimensionalExponent(SIBaseDimension.TIME, -2);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.PASCAL);
        uoss.add(CoreUnitAndScaleSet.NEWTON_PER_SQUARE_METRE);
        uoss.add(CoreUnitAndScaleSet.ATMOSPHERE);
        uoss.add(CoreUnitAndScaleSet.BAR);
        uoss.add(CoreUnitAndScaleSet.MILLIBAR);
        uoss.add(CoreUnitAndScaleSet.PSI);

        PRESSURE = new DefaultQuantityClass(NAMESPACE+"Pressure","pressure","p",dimension,CoreUnitAndScaleSet.PASCAL,uoss, Pressure.class);
        quantityClasses.add(PRESSURE);
        quantityClassesByID.put(PRESSURE.getIdentifier(), PRESSURE);


        // AMOUNT OF SUBSTANCE quantities

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.AMOUNT_OF_SUBSTANCE, 1);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.MOLE);

        AMOUNT_OF_SUBSTANCE = new DefaultQuantityClass(NAMESPACE+"AmountOfSubstance","amount of substance","n",dimension,CoreUnitAndScaleSet.MOLE,uoss, AmountOfSubstance.class);
        quantityClasses.add(AMOUNT_OF_SUBSTANCE);
        quantityClassesByID.put(AMOUNT_OF_SUBSTANCE.getIdentifier(), AMOUNT_OF_SUBSTANCE);


        // LUMINOUS INTENSITY quantities

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LUMINOUS_INTENSITY, 1);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.CANDELA);

        AMOUNT_OF_SUBSTANCE = new DefaultQuantityClass(NAMESPACE+"LuminousIntensity","luminous intensity","I",dimension,CoreUnitAndScaleSet.CANDELA,uoss, LuminousIntensity.class);
        quantityClasses.add(AMOUNT_OF_SUBSTANCE);
        quantityClassesByID.put(AMOUNT_OF_SUBSTANCE.getIdentifier(), AMOUNT_OF_SUBSTANCE);


        // ANGLE quantities

        dimension = new Dimension();
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.RADIAN);
        uoss.add(CoreUnitAndScaleSet.DEGREE);

        ANGLE = new DefaultQuantityClass(NAMESPACE+"Angle","angle","α",dimension,CoreUnitAndScaleSet.RADIAN,uoss, Angle.class);
        quantityClasses.add(ANGLE);
        quantityClassesByID.put(ANGLE.getIdentifier(), ANGLE);

        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.STERADIAN);

        SOLID_ANGLE = new DefaultQuantityClass(NAMESPACE+"SolidAngle","solid angle","Ω",dimension,CoreUnitAndScaleSet.STERADIAN,uoss, SolidAngle.class);
        quantityClasses.add(SOLID_ANGLE);
        quantityClassesByID.put(SOLID_ANGLE.getIdentifier(), SOLID_ANGLE);


        // VELOCITY quantities

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, 1);
        dimension.setDimensionalExponent(SIBaseDimension.TIME, -1);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.METRE_PER_SECOND);
        uoss.add(CoreUnitAndScaleSet.KILOMETRE_PER_SECOND);
        uoss.add(CoreUnitAndScaleSet.KILOMETRE_PER_HOUR);
        uoss.add(CoreUnitAndScaleSet.MILE_PER_HOUR);
        uoss.add(CoreUnitAndScaleSet.KNOT);

        VELOCITY = new DefaultQuantityClass(NAMESPACE+"Velocity","velocity","v",dimension,CoreUnitAndScaleSet.METRE_PER_SECOND,uoss, Velocity.class);
        quantityClasses.add(VELOCITY);
        quantityClassesByID.put(VELOCITY.getIdentifier(), VELOCITY);

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, 1);
        dimension.setDimensionalExponent(SIBaseDimension.TIME, -2);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.METRE_PER_SECOND_SQUARED);

        ACCELERATION = new DefaultQuantityClass(NAMESPACE+"Acceleration","acceleration","a",dimension,CoreUnitAndScaleSet.METRE_PER_SECOND_SQUARED,uoss, Acceleration.class);
        quantityClasses.add(ACCELERATION);
        quantityClassesByID.put(ACCELERATION.getIdentifier(), ACCELERATION);


        // ENERGY quantities

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, 2);
        dimension.setDimensionalExponent(SIBaseDimension.MASS, 1);
        dimension.setDimensionalExponent(SIBaseDimension.TIME, -2);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.JOULE);
        uoss.add(CoreUnitAndScaleSet.CALORIE);
        uoss.add(CoreUnitAndScaleSet.KILOCALORIE);

        ENERGY = new DefaultQuantityClass(NAMESPACE+"Energy","energy","E",dimension,CoreUnitAndScaleSet.JOULE,uoss, Energy.class);
        quantityClasses.add(ENERGY);
        quantityClassesByID.put(ENERGY.getIdentifier(), ENERGY);

        dimension = new Dimension();
        dimension.setDimensionalExponent(SIBaseDimension.LENGTH, 2);
        dimension.setDimensionalExponent(SIBaseDimension.MASS, 1);
        dimension.setDimensionalExponent(SIBaseDimension.TIME, -3);
        uoss = new HashSet<>();
        uoss.add(CoreUnitAndScaleSet.WATT);

        POWER = new DefaultQuantityClass(NAMESPACE+"Power","power","P",dimension,CoreUnitAndScaleSet.WATT,uoss, Power.class);
        quantityClasses.add(POWER);
        quantityClassesByID.put(POWER.getIdentifier(), POWER);
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
