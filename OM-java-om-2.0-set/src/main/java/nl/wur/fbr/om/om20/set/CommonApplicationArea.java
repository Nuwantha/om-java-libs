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
 * <code>om:commonApplicationArea</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Thu Aug 13 21:23:59 CEST 2015.
 */
public class CommonApplicationArea {

	/** The metre is a unit of length defined as the length of the path travelled by light in vacuum during a time interval of 1/299 792 458 of a second. */
	public static Unit Metre = OM.Metre;

	/** The hectare is a unit of area defined as 1.0e2 are. */
	public static Unit Hectare = OM.Hectare;

	/** Metre per second is a unit of speed defined as metre divided by second. */
	public static Unit MetrePerSecondTime = OM.MetrePerSecondTime;

	/** The degree Celsius is a unit of temperature defined as 1 kelvin. */
	public static Unit DegreeCelsius = OM.DegreeCelsius;

	/** The volt is a unit of electric potential defined as watt divided by ampere = joule divided by coulomb = newton times metre divided by ampere times second = kilogram times square metre divided by ampere times second to the power 3. */
	public static Unit Volt = OM.Volt;

	/** The litre is a unit of volume defined as 1.0e-3 cubic metre. */
	public static Unit Litre = OM.Litre;

	/** The kilometre is a unit of length defined as 1.0e3 metre. */
	public static Unit Kilometre = OM.Kilometre;

	public static Unit MillisecondTime = OM.MillisecondTime;

	public static Unit Kilonewton = OM.Kilonewton;

	/** The month is a unit of time. */
	public static Unit Month = OM.Month;

	/** The kelvin is a unit of temperature defined as 1/273.16 of the thermodynamic temperature of the triple point of water. */
	public static Unit Kelvin = OM.Kelvin;

	/** The kilojoule is a unit of energy defined as 1.0e3 joule. */
	public static Unit Kilojoule = OM.Kilojoule;

	/** The second is a unit of time defined as the duration of 9 192 631 770 periods of the radiation corresponding to the transition between the two hyperfine levels of the ground state of the cesium 133 atom. */
	public static Unit SecondTime = OM.SecondTime;

	public static Unit Centilitre = OM.Centilitre;

	/** The US gallon is a unit of volume defined as 3.785412e-3 cubic metre. */
	public static Unit GallonUS = OM.GallonUS;

	/** The hertz is a unit of frequency defined as 1 divided by second. */
	public static Unit Hertz = OM.Hertz;

	/** The statute mile is a unit of length defined as 1.609344e3 metre. */
	public static Unit MileStatute = OM.MileStatute;

	/** Square metre is a unit of area defined as the area of a square whose sides measure exactly one metre. */
	public static Unit SquareMetre = OM.SquareMetre;

	/** The hour is a unit of time defined as 3600 second. */
	public static Unit Hour = OM.Hour;

	/** The kilogram is a unit of mass defined as the mass of the international prototype of the kilogram. */
	public static Unit Kilogram = OM.Kilogram;

	/** The kilohertz is a unit of frequency defined as 1.0e3 hertz. */
	public static Unit Kilohertz = OM.Kilohertz;

	/** The centimetre is a unit of length defined as 1.0e-2 metre. */
	public static Unit Centimetre = OM.Centimetre;

	/** The millimetre is a unit of length defined as 1.0e-3 metre. */
	public static Unit Millimetre = OM.Millimetre;

	/** The ampere is a unit of electric current defined as the constant current that produces an attractive force of 2e–7 newton per metre of length between two straight, parallel conductors of infinite length and negligible circular cross section placed one metre apart in a vacuum. */
	public static Unit Ampere = OM.Ampere;

	/** Gram per litre is a unit of density defined as gram divided by litre. */
	public static Unit GramPerLitre = OM.GramPerLitre;

	public static Unit Milliwatt = OM.Milliwatt;

	public static Unit SquareCentimetre = OM.SquareCentimetre;

	public static Unit GramPerKilogram = OM.GramPerKilogram;

	/** The foot is a unit of foot defined as 3.048e-1 metre. */
	public static Unit Foot = OM.Foot;

	public static Unit KilowattHour = OM.KilowattHour;

	/** The newton is a unit of force defined as kilogram timesmetre divided by second squared. */
	public static Unit Newton = OM.Newton;

	/** The degree Fahrenheit is a unit of temperature defined as 5.555556e-1 kelvin. */
	public static Unit DegreeFahrenheit = OM.DegreeFahrenheit;

	/** The are is a unit of area defined as 100 square metre. */
	public static Unit Are = OM.Are;

	/** The avoirdupois pound is a unit of mass defined as 4.535924e-1 kilogram. */
	public static Unit PoundAvoirdupois = OM.PoundAvoirdupois;

	public static Unit Megawatt = OM.Megawatt;

	/** The week is a unit of time defined as 6.04800e5 second. */
	public static Unit Week = OM.Week;

	/** Milligram per litre is a unit of density defined as milligram divided by litre. */
	public static Unit MilligramPerLitre = OM.MilligramPerLitre;

	public static Unit SquareKilometre = OM.SquareKilometre;

	/** The imperial gallon is a unit of volume defined as 4.54609e-3 cubic metre. */
	public static Unit GallonImperial = OM.GallonImperial;

	/** The watt is a unit of power defined as joule divided by second = newton times metre divided by second = volt times ampere = kilogram times square metre divided by second to the power 3. */
	public static Unit Watt = OM.Watt;

	/** The inch is a unit of length defined as 2.54e-2 metre. */
	public static Unit Inch = OM.Inch;

	public static Unit Kilowatt = OM.Kilowatt;

	/** The avoirdupois ounce is a unit of mass defined as 2.834952e-2 kilogram. */
	public static Unit OunceAvoirdupois = OM.OunceAvoirdupois;

	public static Unit CubicCentimetre = OM.CubicCentimetre;

	/** The milligram is a unit of mass defined as 1.0e-3 gram. */
	public static Unit Milligram = OM.Milligram;

	/** The gram is a unit of mass defined as 1.0e-3 kilogram. */
	public static Unit Gram = OM.Gram;

	/** Kilometre per hour is a unit of speed defined as kilometre divided by hour. */
	public static Unit KilometrePerHour = OM.KilometrePerHour;

	/** The US liquid pint is a unit of volume defined as 4.731765e-4 cubic metre. */
	public static Unit LiquidPintUS = OM.LiquidPintUS;

	public static Unit Millilitre = OM.Millilitre;

	/** The percent is a unit of dimension one defined as 1/100. */
	public static Unit Percent = OM.Percent;

	/** The acre is a unit of area defined as 4.046873e3 square metre. */
	public static Unit Acre = OM.Acre;

	/** The kilocalorie (mean) is a unit of energy defined as 1.0e3 calorie (mean). */
	public static Unit KilocalorieMean = OM.KilocalorieMean;

	/** The minute (time) is a unit of time defined as 60 second. */
	public static Unit MinuteTime = OM.MinuteTime;

	/** The joule is a unit of energy defined as kilogram times square metre divided by second squared. */
	public static Unit Joule = OM.Joule;

	/** The milliampere is a unit of electric current defined as 1.0e-3 ampere. */
	public static Unit Milliampere = OM.Milliampere;

	public static Unit Millivolt = OM.Millivolt;

	/** The yard is a unit of length defined as 9.144e-1 metre. */
	public static Unit Yard = OM.Yard;

	/** The megahertz is a unit of frequency defined as 1.0e6 hertz. */
	public static Unit Megahertz = OM.Megahertz;

	/** The year is a unit of time defined as 3.1536e7 second. */
	public static Unit Year = OM.Year;

	/** The pound-force is a unit of force defined as 4.448222 newton. */
	public static Unit PoundForce = OM.PoundForce;

	/** Cubic metre is a unit of volume defined as the volume of a cube whose sides measure exactly one metre. */
	public static Unit CubicMetre = OM.CubicMetre;

	/** The pint is a unit of volume defined as 568.26125 millilitre. */
	public static Unit PintImperial = OM.PintImperial;

	/** Mile (statute) per hour is a unit of speed defined as mile (statute) divided by hour. */
	public static Unit MileStatutePerHour = OM.MileStatutePerHour;

	/** The day is a unit of time defined as 86400 second. */
	public static Unit Day = OM.Day;

	public static Unit Decilitre = OM.Decilitre;

}