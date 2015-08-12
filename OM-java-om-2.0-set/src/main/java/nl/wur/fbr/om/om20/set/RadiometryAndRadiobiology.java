package nl.wur.fbr.om.om20.set;

import nl.wur.fbr.om.model.scales.Scale;

import nl.wur.fbr.om.factory.UnitAndScaleFactory;
import nl.wur.fbr.om.model.units.*;
import nl.wur.fbr.om.core.impl.scales.ScaleImpl;
import nl.wur.fbr.om.core.impl.units.*;
import nl.wur.fbr.om.model.UnitAndScaleSet;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.model.UnitAndScaleSet;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.core.impl.points.PointImpl;
import java.util.Set;
import org.apache.commons.lang3.Range;
import java.util.HashSet;
import nl.wur.fbr.om.prefixes.*;

/**
 * This class contains the identifiers for the units and scales defined for the
 * <code>om:radiometryAndRadiobiology</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Wed Aug 12 01:57:46 CEST 2015.
 */
public class RadiometryAndRadiobiology {

	public static Unit Decasievert = OM.Decasievert;

	/** The petagray is a unit of absorbed dose defined as 1.0e15 gray. */
	public static Unit Petagray = OM.Petagray;

	/** The exagray is a unit of absorbed dose defined as 1.0e18 gray. */
	public static Unit Exagray = OM.Exagray;

	public static Unit Picosievert = OM.Picosievert;

	/** The picobecquerel is a unit of activity defined as 1.0e-12 becquerel. */
	public static Unit Picobecquerel = OM.Picobecquerel;

	/** The centigray is a unit of absorbed dose defined as 1.0e-2 gray. */
	public static Unit Centigray = OM.Centigray;

	/** The gigagray is a unit of absorbed dose defined as 1.0e9 gray. */
	public static Unit Gigagray = OM.Gigagray;

	/** The femtobecquerel is a unit of activity defined as 1.0e-15 becquerel. */
	public static Unit Femtobecquerel = OM.Femtobecquerel;

	/** The hectogray is a unit of absorbed dose defined as 1.0e2 gray. */
	public static Unit Hectogray = OM.Hectogray;

	/** The kilogray is a unit of absorbed dose defined as 1.0e3 gray. */
	public static Unit Kilogray = OM.Kilogray;

	public static Unit CoulombPerKilogram = OM.CoulombPerKilogram;

	/** The femtogray is a unit of absorbed dose defined as 1.0e-15 gray. */
	public static Unit Femtogray = OM.Femtogray;

	/** The picogray is a unit of absorbed dose defined as 1.0e-12 gray. */
	public static Unit Picogray = OM.Picogray;

	/** The gray is a unit of absorbed dose defined as joule divided by kilogram = square metre divided by second squared. */
	public static Unit Gray = OM.Gray;

	/** The decigray is a unit of absorbed dose defined as 1.0e-1 gray. */
	public static Unit Decigray = OM.Decigray;

	/** The attobecquerel is a unit of activity defined as 1.0e-18 becquerel. */
	public static Unit Attobecquerel = OM.Attobecquerel;

	/** The decibecquerel is a unit of activity defined as 1.0e-1 becquerel. */
	public static Unit Decibecquerel = OM.Decibecquerel;

	/** The teragray is a unit of absorbed dose defined as 1.0e12 gray. */
	public static Unit Teragray = OM.Teragray;

	/** The röntgen is a unit of exposure to x and γ rays defined as 2.58e-4 coulomb per kilogram. */
	public static Unit Röntgen = OM.Röntgen;

	/** The millibecquerel is a unit of activity defined as 1.0e-3 becquerel. */
	public static Unit Millibecquerel = OM.Millibecquerel;

	/** The megagray is a unit of absorbed dose defined as 1.0e6 gray. */
	public static Unit Megagray = OM.Megagray;

	public static Unit Terasievert = OM.Terasievert;

	public static Unit Decisievert = OM.Decisievert;

	/** The hectobecquerel is a unit of activity defined as 1.0e2 becquerel. */
	public static Unit Hectobecquerel = OM.Hectobecquerel;

	/** The petabecquerel is a unit of activity defined as 1.0e15 becquerel. */
	public static Unit Petabecquerel = OM.Petabecquerel;

	public static Unit Centisievert = OM.Centisievert;

	/** The nanobecquerel is a unit of activity defined as 1.0e-9 becquerel. */
	public static Unit Nanobecquerel = OM.Nanobecquerel;

	/** The megabecquerel is a unit of activity defined as 1.0e6 becquerel. */
	public static Unit Megabecquerel = OM.Megabecquerel;

	/** The decagray is a unit of absorbed dose defined as 1.0e1 gray. */
	public static Unit Decagray = OM.Decagray;

	public static Unit Nanosievert = OM.Nanosievert;

	public static Unit Microsievert = OM.Microsievert;

	public static Unit Exasievert = OM.Exasievert;

	/** The milligray is a unit of absorbed dose defined as 1.0e-3 gray. */
	public static Unit Milligray = OM.Milligray;

	/** The microbecquerel is a unit of activity defined as 1.0e-6 becquerel. */
	public static Unit Microbecquerel = OM.Microbecquerel;

	/** The microgray is a unit of absorbed dose defined as 1.0e-6 gray. */
	public static Unit Microgray = OM.Microgray;

	/** The gigabecquerel is a unit of activity defined as 1.0e9 becquerel. */
	public static Unit Gigabecquerel = OM.Gigabecquerel;

	/** The kilobecquerel is a unit of activity defined as 1.0e3 becquerel. */
	public static Unit Kilobecquerel = OM.Kilobecquerel;

	/** The attogray is a unit of absorbed dose defined as 1.0e-18 gray. */
	public static Unit Attogray = OM.Attogray;

	public static Unit Megasievert = OM.Megasievert;

	/** The curie is a unit of activity defined as 3.7e10 becquerel. */
	public static Unit Curie = OM.Curie;

	public static Unit Petasievert = OM.Petasievert;

	public static Unit Kilosievert = OM.Kilosievert;

	/** The becquerel is a unit of activity defined as the activity of a quantity of radioactive material in which one nucleus decays per second. Algebraically it is defined as 1 divided by second. */
	public static Unit Becquerel = OM.Becquerel;

	public static Unit Femtosievert = OM.Femtosievert;

	public static Unit Millisievert = OM.Millisievert;

	public static Unit Gigasievert = OM.Gigasievert;

	public static Unit Hectosievert = OM.Hectosievert;

	/** The exabecquerel is a unit of activity defined as 1.0e18 becquerel. */
	public static Unit Exabecquerel = OM.Exabecquerel;

	public static Unit GrayPerSecondTime = OM.GrayPerSecondTime;

	/** The nanogray is a unit of absorbed dose defined as 1.0e-9 gray. */
	public static Unit Nanogray = OM.Nanogray;

	public static Unit Attosievert = OM.Attosievert;

	/** The centibecquerel is a unit of activity defined as 1.0e-2 becquerel. */
	public static Unit Centibecquerel = OM.Centibecquerel;

	/** The rad is a unit of absorbed dose defined as 1.0e-2 gray. */
	public static Unit Rad = OM.Rad;

	/** The decabecquerel is a unit of activity defined as 1.0e1 becquerel. */
	public static Unit Decabecquerel = OM.Decabecquerel;

	/** The sievert is a unit of dose equivalent defined as joule divided by kilogram = square metre divided by second squared. */
	public static Unit Sievert = OM.Sievert;

	/** The rem is a unit of dose equivalent defined as 1.0e-2 sievert. */
	public static Unit Rem = OM.Rem;

	/** The terabecquerel is a unit of activity defined as 1.0e12 becquerel. */
	public static Unit Terabecquerel = OM.Terabecquerel;

}