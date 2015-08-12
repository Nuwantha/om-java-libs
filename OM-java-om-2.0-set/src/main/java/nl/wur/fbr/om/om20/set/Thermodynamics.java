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
 * <code>om:thermodynamics</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Wed Aug 12 01:57:46 CEST 2015.
 */
public class Thermodynamics {

	/** The microdegree Celsius is a unit of temperature defined as 1.0e-6 degree Celsius. */
	public static Unit MicrodegreeCelsius = OM.MicrodegreeCelsius;

	/** The degree Celsius is a unit of temperature defined as 1 kelvin. */
	public static Unit DegreeCelsius = OM.DegreeCelsius;

	/** The kilokelvin is a unit of thermodynamic temperature defined as 1.0e3 kelvin. */
	public static Unit Kilokelvin = OM.Kilokelvin;

	/** The attokelvin is a unit of temperature defined as 1.0e-18 kelvin. */
	public static Unit Attokelvin = OM.Attokelvin;

	/** The centidegree Celsius is a unit of temperature defined as 1.0e-2 degree Celsius. */
	public static Unit CentidegreeCelsius = OM.CentidegreeCelsius;

	/** The picokelvin is a unit of temperature defined as 1.0e-12 kelvin. */
	public static Unit Picokelvin = OM.Picokelvin;

	/** The decikelvin is a unit of temperature defined as 1.0e-1 kelvin. */
	public static Unit Decikelvin = OM.Decikelvin;

	/** The degree Rankine is a unit of temperature defined as 5.555556e-1 kelvin. */
	public static Unit DegreeRankine = OM.DegreeRankine;

	public static Unit JoulePerKelvin = OM.JoulePerKelvin;

	/** The kelvin is a unit of temperature defined as 1/273.16 of the thermodynamic temperature of the triple point of water. */
	public static Unit Kelvin = OM.Kelvin;

	public static Unit WattPerMetreKelvin = OM.WattPerMetreKelvin;

	public static Unit SquareMetreKelvinPerWatt = OM.SquareMetreKelvinPerWatt;

	public static Unit WattPerSquareMetreKelvin = OM.WattPerSquareMetreKelvin;

	/** The petakelvin is a unit of thermodynamic temperature defined as 1.0e15 kelvin. */
	public static Unit Petakelvin = OM.Petakelvin;

	public static Unit DegreeCelsiusPerMinuteTime = OM.DegreeCelsiusPerMinuteTime;

	/** The hectokelvin is a unit of thermodynamic temperature defined as 1.0e2 kelvin. */
	public static Unit Hectokelvin = OM.Hectokelvin;

	/** The megakelvin is a unit of thermodynamic temperature defined as 1.0e6 kelvin. */
	public static Unit Megakelvin = OM.Megakelvin;

	/** The centikelvin is a unit of temperature defined as 1.0e-2 kelvin. */
	public static Unit Centikelvin = OM.Centikelvin;

	/** The nanokelvin is a unit of temperature defined as 1.0e-9 kelvin. */
	public static Unit Nanokelvin = OM.Nanokelvin;

	/** The attodegree Celsius is a unit of temperature defined as 1.0e-18 degree Celsius. */
	public static Unit AttodegreeCelsius = OM.AttodegreeCelsius;

	/** The decakelvin is a unit of thermodynamic temperature defined as 1.0e1 kelvin. */
	public static Unit Decakelvin = OM.Decakelvin;

	/** The exakelvin is a unit of thermodynamic temperature defined as 1.0e18 kelvin. */
	public static Unit Exakelvin = OM.Exakelvin;

	/** The femtokelvin is a unit of temperature defined as 1.0e-15 kelvin. */
	public static Unit Femtokelvin = OM.Femtokelvin;

	/** The picodegree Celsius is a unit of temperature defined as 1.0e-12 degree Celsius. */
	public static Unit PicodegreeCelsius = OM.PicodegreeCelsius;

	/** The degree Réaumur is a unit of temperature defined as 1.25 kelvin. */
	public static Unit DegreeReaumur = OM.DegreeReaumur;

	public static Unit JoulePerKelvinKilogram = OM.JoulePerKelvinKilogram;

	/** The millidegree Celsius is a unit of temperature defined as 1.0e-3 degree Celsius. */
	public static Unit MillidegreeCelsius = OM.MillidegreeCelsius;

	/** The nanodegree Celsius is a unit of temperature defined as 1.0e-9 degree Celsius. */
	public static Unit NanodegreeCelsius = OM.NanodegreeCelsius;

	/** The degree Fahrenheit is a unit of temperature defined as 5.555556e-1 kelvin. */
	public static Unit DegreeFahrenheit = OM.DegreeFahrenheit;

	/** The decidegree Celsius is a unit of temperature defined as 1.0e-1 degree Celsius. */
	public static Unit DecidegreeCelsius = OM.DecidegreeCelsius;

	/** The femtodegree Celsius is a unit of temperature defined as 1.0e-15 degree Celsius. */
	public static Unit FemtodegreeCelsius = OM.FemtodegreeCelsius;

	/** The gigakelvin is a unit of thermodynamic temperature defined as 1.0e9 kelvin. */
	public static Unit Gigakelvin = OM.Gigakelvin;

	/** The millikelvin is a unit of temperature defined as 1.0e-3 kelvin. */
	public static Unit Millikelvin = OM.Millikelvin;

	/** The terakelvin is a unit of thermodynamic temperature defined as 1.0e12 kelvin. */
	public static Unit Terakelvin = OM.Terakelvin;

	/** The microkelvin is a unit of temperature defined as 1.0e-6 kelvin. */
	public static Unit Microkelvin = OM.Microkelvin;

}