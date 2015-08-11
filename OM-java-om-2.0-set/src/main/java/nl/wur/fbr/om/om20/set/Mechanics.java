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
import nl.wur.fbr.om.model.points.ScalarPoint;
import nl.wur.fbr.om.model.points.ScalarRangePoint;
import nl.wur.fbr.om.core.impl.points.ScalarPointImpl;
import nl.wur.fbr.om.core.impl.points.ScalarRangePointImpl;
import java.util.Set;
import java.util.HashSet;
import nl.wur.fbr.om.prefixes.*;

/**
 * This class contains the identifiers for the units and scales defined for the
 * <code>om:mechanics</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Tue Aug 11 12:27:59 CEST 2015.
 */
public class Mechanics {

	/** Megametre per second is a unit of speed defined as megametre divided by second. */
	public static Unit MegametrePerSecondTime = OM.MegametrePerSecondTime;

	/** The attohertz is a unit of frequency defined as 1.0e-18 hertz. */
	public static Unit Attohertz = OM.Attohertz;

	public static Unit CentisecondTime = OM.CentisecondTime;

	/** The femtohertz is a unit of frequency defined as 1.0e-15 hertz. */
	public static Unit Femtohertz = OM.Femtohertz;

	/** Gigametre per second is a unit of speed defined as gigametre divided by second. */
	public static Unit GigametrePerSecondTime = OM.GigametrePerSecondTime;

	/** Metre per femtosecond is a unit of speed defined as metre divided by femtosecond. */
	public static Unit MetrePerFemtosecondTime = OM.MetrePerFemtosecondTime;

	/** Metre per kilosecond is a unit of speed defined as metre divided by kilosecond. */
	public static Unit MetrePerKilosecondTime = OM.MetrePerKilosecondTime;

	/** Metre per attosecond squared is a unit of acceleration defined as metre divided by attosecond squared. */
	public static Unit MetrePerAttosecondTimeSquared = OM.MetrePerAttosecondTimeSquared;

	/** Metre per microsecond squared is a unit of acceleration defined as metre divided by microsecond squared. */
	public static Unit MetrePerMicrosecondTimeSquared = OM.MetrePerMicrosecondTimeSquared;

	/** The gigahertz is a unit of frequency defined as 1.0e9 hertz. */
	public static Unit Gigahertz = OM.Gigahertz;

	public static Unit GigasecondTime = OM.GigasecondTime;

	/** The hertz is a unit of frequency defined as 1 divided by second. */
	public static Unit Hertz = OM.Hertz;

	public static Unit RadianPerSecondTimeSquared = OM.RadianPerSecondTimeSquared;

	/** The exahertz is a unit of frequency defined as 1.0e18 hertz. */
	public static Unit Exahertz = OM.Exahertz;

	/** The microhertz is a unit of frequency defined as 1.0e-6 hertz. */
	public static Unit Microhertz = OM.Microhertz;

	/** Metre per megasecond squared is a unit of acceleration defined as metre divided by megasecond squared. */
	public static Unit MetrePerMegasecondTimeSquared = OM.MetrePerMegasecondTimeSquared;

	/** The shake is a unit of time defined as 1.0e-8 second. */
	public static Unit Shake = OM.Shake;

	/** Metre per terasecond is a unit of speed defined as metre divided by terasecond. */
	public static Unit MetrePerTerasecondTime = OM.MetrePerTerasecondTime;

	/** The hour is a unit of time defined as 3600 second. */
	public static Unit Hour = OM.Hour;

	/** Metre per day is a unit of speed defined as metre divided by day. */
	public static Unit MetrePerDay = OM.MetrePerDay;

	/** Millimetre per second is a unit of speed defined as millimetre divided by second. */
	public static Unit MillimetrePerSecondTime = OM.MillimetrePerSecondTime;

	/** Decimetre per second is a unit of speed defined as decimetre divided by second. */
	public static Unit DecimetrePerSecondTime = OM.DecimetrePerSecondTime;

	/** The picohertz is a unit of frequency defined as 1.0e-12 hertz. */
	public static Unit Picohertz = OM.Picohertz;

	public static Unit MicrosecondTime = OM.MicrosecondTime;

	/** Metre per hectosecond squared is a unit of acceleration defined as metre divided by hectosecond squared. */
	public static Unit MetrePerHectosecondTimeSquared = OM.MetrePerHectosecondTimeSquared;

	/** Metre per hectosecond is a unit of speed defined as metre divided by hectosecond. */
	public static Unit MetrePerHectosecondTime = OM.MetrePerHectosecondTime;

	/** Petametre per second squared is a unit of acceleration defined as petametre divided by second squared. */
	public static Unit PetametrePerSecondTimeSquared = OM.PetametrePerSecondTimeSquared;

	/** Millimetre per day is a unit of speed defined as millimetre divided by day. */
	public static Unit MillimetrePerDay = OM.MillimetrePerDay;

	/** The kayser is a unit of wavenumber defined as 100 reciprocal metre. */
	public static Unit Kayser = OM.Kayser;

	public static Unit DecisecondTime = OM.DecisecondTime;

	/** The centihertz is a unit of frequency defined as 1.0e-2 hertz. */
	public static Unit Centihertz = OM.Centihertz;

	/** Decametre per second squared is a unit of acceleration defined as decametre divided by second squared. */
	public static Unit DecametrePerSecondTimeSquared = OM.DecametrePerSecondTimeSquared;

	/** Metre per kilosecond squared is a unit of acceleration defined as metre divided by kilosecond squared. */
	public static Unit MetrePerKilosecondTimeSquared = OM.MetrePerKilosecondTimeSquared;

	/** Petametre per second is a unit of speed defined as petametre divided by second. */
	public static Unit PetametrePerSecondTime = OM.PetametrePerSecondTime;

	/** Reciprocal metre is a unit of wavenumber defined as 1 divided by metre. */
	public static Unit ReciprocalMetre = OM.ReciprocalMetre;

	/** Metre per petasecond is a unit of speed defined as metre divided by petasecond. */
	public static Unit MetrePerPetasecondTime = OM.MetrePerPetasecondTime;

	/** Hectometre per second is a unit of speed defined as hectometre divided by second. */
	public static Unit HectometrePerSecondTime = OM.HectometrePerSecondTime;

	public static Unit PetasecondTime = OM.PetasecondTime;

	public static Unit PicosecondTime = OM.PicosecondTime;

	/** Millimetre per hour is a unit of speed defined as millimetre divided by hour. */
	public static Unit MillimetrePerHour = OM.MillimetrePerHour;

	/** Nautical mile per hour is a unit of speed defined as nautical mile divided by hour. */
	public static Unit NauticalMilePerHour = OM.NauticalMilePerHour;

	/** Metre per picosecond is a unit of speed defined as metre divided by picosecond. */
	public static Unit MetrePerPicosecondTime = OM.MetrePerPicosecondTime;

	public static Unit ExasecondTime = OM.ExasecondTime;

	/** Terametre per second is a unit of speed defined as terametre divided by second. */
	public static Unit TerametrePerSecondTime = OM.TerametrePerSecondTime;

	/** Megametre per second squared is a unit of acceleration defined as megametre divided by second squared. */
	public static Unit MegametrePerSecondTimeSquared = OM.MegametrePerSecondTimeSquared;

	/** Millimetre per second squared is a unit of acceleration defined as millimetre divided by second squared. */
	public static Unit MillimetrePerSecondTimeSquared = OM.MillimetrePerSecondTimeSquared;

	/** Hectometre per second squared is a unit of acceleration defined as hectometre divided by second squared. */
	public static Unit HectometrePerSecondTimeSquared = OM.HectometrePerSecondTimeSquared;

	public static Unit DecasecondTime = OM.DecasecondTime;

	public static Unit ReciprocalSecondTime = OM.ReciprocalSecondTime;

	/** Metre per attosecond is a unit of speed defined as metre divided by attosecond. */
	public static Unit MetrePerAttosecondTime = OM.MetrePerAttosecondTime;

	/** Metre per decasecond squared is a unit of acceleration defined as metre divided by decasecond squared. */
	public static Unit MetrePerDecasecondTimeSquared = OM.MetrePerDecasecondTimeSquared;

	/** Metre per gigasecond squared is a unit of acceleration defined as metre divided by gigasecond squared. */
	public static Unit MetrePerGigasecondTimeSquared = OM.MetrePerGigasecondTimeSquared;

	/** The nanohertz is a unit of frequency defined as 1.0e-9 hertz. */
	public static Unit Nanohertz = OM.Nanohertz;

	/** Metre per decasecond is a unit of speed defined as metre divided by decasecond. */
	public static Unit MetrePerDecasecondTime = OM.MetrePerDecasecondTime;

	/** Metre per terasecond squared is a unit of acceleration defined as metre divided by terasecond squared. */
	public static Unit MetrePerTerasecondTimeSquared = OM.MetrePerTerasecondTimeSquared;

	/** Micrometre per second is a unit of speed defined as micrometre divided by second. */
	public static Unit MicrometrePerSecondTime = OM.MicrometrePerSecondTime;

	public static Unit AttosecondTime = OM.AttosecondTime;

	/** The megahertz is a unit of frequency defined as 1.0e6 hertz. */
	public static Unit Megahertz = OM.Megahertz;

	/** The year is a unit of time defined as 3.1536e7 second. */
	public static Unit Year = OM.Year;

	/** Metre per millisecond is a unit of speed defined as metre divided by millisecond. */
	public static Unit MetrePerMillisecondTime = OM.MetrePerMillisecondTime;

	/** Nanometre per second squared is a unit of acceleration defined as nanometre divided by second squared. */
	public static Unit NanometrePerSecondTimeSquared = OM.NanometrePerSecondTimeSquared;

	/** Metre per picosecond squared is a unit of acceleration defined as metre divided by picosecond squared. */
	public static Unit MetrePerPicosecondTimeSquared = OM.MetrePerPicosecondTimeSquared;

	/** The hectohertz is a unit of frequency defined as 1.0e2 hertz. */
	public static Unit Hectohertz = OM.Hectohertz;

	/** Metre per centisecond squared is a unit of acceleration defined as metre divided by centisecond squared. */
	public static Unit MetrePerCentisecondTimeSquared = OM.MetrePerCentisecondTimeSquared;

	/** Decimetre per second squared is a unit of acceleration defined as decimetre divided by second squared. */
	public static Unit DecimetrePerSecondTimeSquared = OM.DecimetrePerSecondTimeSquared;

	/** The day is a unit of time defined as 86400 second. */
	public static Unit Day = OM.Day;

	/** The decahertz is a unit of frequency defined as 1.0e1 hertz. */
	public static Unit Decahertz = OM.Decahertz;

	/** Kilometre per second squared is a unit of acceleration defined as kilometre divided by second squared. */
	public static Unit KilometrePerSecondTimeSquared = OM.KilometrePerSecondTimeSquared;

	/** Metre per second is a unit of speed defined as metre divided by second. */
	public static Unit MetrePerSecondTime = OM.MetrePerSecondTime;

	/** The knot is a unit of speed defined as nautical mile per hour. */
	public static Unit Knot = OM.Knot;

	/** Micrometre per second squared is a unit of acceleration defined as micrometre divided by second squared. */
	public static Unit MicrometrePerSecondTimeSquared = OM.MicrometrePerSecondTimeSquared;

	public static Unit MillisecondTime = OM.MillisecondTime;

	/** The millihertz is a unit of frequency defined as 1.0e-3 hertz. */
	public static Unit Millihertz = OM.Millihertz;

	/** Centimetre per second squared is a unit of acceleration defined as centimetre divided by second squared. */
	public static Unit CentimetrePerSecondTimeSquared = OM.CentimetrePerSecondTimeSquared;

	/** The second is a unit of time defined as the duration of 9 192 631 770 periods of the radiation corresponding to the transition between the two hyperfine levels of the ground state of the cesium 133 atom. */
	public static Unit SecondTime = OM.SecondTime;

	/** Metre per microsecond is a unit of speed defined as metre divided by microsecond. */
	public static Unit MetrePerMicrosecondTime = OM.MetrePerMicrosecondTime;

	/** Metre per exasecond is a unit of speed defined as metre divided by exasecond. */
	public static Unit MetrePerExasecondTime = OM.MetrePerExasecondTime;

	public static Unit HourSidereal = OM.HourSidereal;

	/** The terahertz is a unit of frequency defined as 1.0e12 hertz. */
	public static Unit Terahertz = OM.Terahertz;

	/** Picometre per second squared is a unit of acceleration defined as picometre divided by second squared. */
	public static Unit PicometrePerSecondTimeSquared = OM.PicometrePerSecondTimeSquared;

	/** Femtometre per second squared is a unit of acceleration defined as femtometre divided by second squared. */
	public static Unit FemtometrePerSecondTimeSquared = OM.FemtometrePerSecondTimeSquared;

	/** Metre per decisecond is a unit of speed defined as metre divided by decisecond. */
	public static Unit MetrePerDecisecondTime = OM.MetrePerDecisecondTime;

	public static Unit TerasecondTime = OM.TerasecondTime;

	/** The petahertz is a unit of frequency defined as 1.0e15 hertz. */
	public static Unit Petahertz = OM.Petahertz;

	/** Metre per exasecond squared is a unit of acceleration defined as metre divided by exasecond squared. */
	public static Unit MetrePerExasecondTimeSquared = OM.MetrePerExasecondTimeSquared;

	/** Exametre per second squared is a unit of acceleration defined as exametre divided by second squared. */
	public static Unit ExametrePerSecondTimeSquared = OM.ExametrePerSecondTimeSquared;

	/** The kilohertz is a unit of frequency defined as 1.0e3 hertz. */
	public static Unit Kilohertz = OM.Kilohertz;

	/** Kilometre per second is a unit of speed defined as kilometre divided by second. */
	public static Unit KilometrePerSecondTime = OM.KilometrePerSecondTime;

	/** The sidereal minute is a unit of time defined as 5.983617e1 second. */
	public static Unit MinuteSidereal = OM.MinuteSidereal;

	public static Unit Gigayear = OM.Gigayear;

	/** The sidereal second is a unit of time defined as 9.972696e-1 second. */
	public static Unit SecondSidereal = OM.SecondSidereal;

	/** The gal is a unit of acceleration defined as centimetre per second (time) squared. */
	public static Unit Gal = OM.Gal;

	public static Unit KilosecondTime = OM.KilosecondTime;

	/** Femtometre per second is a unit of speed defined as femtometre divided by second. */
	public static Unit FemtometrePerSecondTime = OM.FemtometrePerSecondTime;

	/** Metre per gigasecond is a unit of speed defined as metre divided by gigasecond. */
	public static Unit MetrePerGigasecondTime = OM.MetrePerGigasecondTime;

	public static Unit FemtosecondTime = OM.FemtosecondTime;

	public static Unit MegasecondTime = OM.MegasecondTime;

	/** Attometre per second is a unit of speed defined as attometre divided by second. */
	public static Unit AttometrePerSecondTime = OM.AttometrePerSecondTime;

	/** Metre per nanosecond is a unit of speed defined as metre divided by nanosecond. */
	public static Unit MetrePerNanosecondTime = OM.MetrePerNanosecondTime;

	/** Gigametre per second squared is a unit of acceleration defined as gigametre divided by second squared. */
	public static Unit GigametrePerSecondTimeSquared = OM.GigametrePerSecondTimeSquared;

	/** Metre per femtosecond squared is a unit of acceleration defined as metre divided by femtosecond squared. */
	public static Unit MetrePerFemtosecondTimeSquared = OM.MetrePerFemtosecondTimeSquared;

	public static Unit HectosecondTime = OM.HectosecondTime;

	public static Unit NanosecondTime = OM.NanosecondTime;

	/** Metre per petasecond squared is a unit of acceleration defined as metre divided by petasecond squared. */
	public static Unit MetrePerPetasecondTimeSquared = OM.MetrePerPetasecondTimeSquared;

	/** The sidereal year is a unit of time defined as 3.155815e7 second. */
	public static Unit YearSidereal = OM.YearSidereal;

	/** The sidereal day is a unit of time defined as 8.616409e4 second. */
	public static Unit DaySidereal = OM.DaySidereal;

	/** Kilometre per hour is a unit of speed defined as kilometre divided by hour. */
	public static Unit KilometrePerHour = OM.KilometrePerHour;

	/** The decihertz is a unit of frequency defined as 1.0e-1 hertz. */
	public static Unit Decihertz = OM.Decihertz;

	/** Metre per nanosecond squared is a unit of acceleration defined as metre divided by nanosecond squared. */
	public static Unit MetrePerNanosecondTimeSquared = OM.MetrePerNanosecondTimeSquared;

	/** The tropical year is a unit of time defined as 3.155693e7 second. */
	public static Unit YearTropical = OM.YearTropical;

	/** Metre per megasecond is a unit of speed defined as metre divided by megasecond. */
	public static Unit MetrePerMegasecondTime = OM.MetrePerMegasecondTime;

	/** Terametre per second squared is a unit of acceleration defined as terametre divided by second squared. */
	public static Unit TerametrePerSecondTimeSquared = OM.TerametrePerSecondTimeSquared;

	/** Metre per decisecond squared is a unit of acceleration defined as metre divided by decisecond squared. */
	public static Unit MetrePerDecisecondTimeSquared = OM.MetrePerDecisecondTimeSquared;

	/** Attometre per second squared is a unit of acceleration defined as attometre divided by second squared. */
	public static Unit AttometrePerSecondTimeSquared = OM.AttometrePerSecondTimeSquared;

	/** Centimetre per second is a unit of speed defined as centimetre divided by second. */
	public static Unit CentimetrePerSecondTime = OM.CentimetrePerSecondTime;

	/** Decametre per second is a unit of speed defined as decametre divided by second. */
	public static Unit DecametrePerSecondTime = OM.DecametrePerSecondTime;

	/** Nanometre per second is a unit of speed defined as nanometre divided by second. */
	public static Unit NanometrePerSecondTime = OM.NanometrePerSecondTime;

	/** Centimetre per day is a unit of speed defined as centimetre divided by day. */
	public static Unit CentimetrePerDay = OM.CentimetrePerDay;

	/** Metre per millisecond squared is a unit of acceleration defined as metre divided by millisecond squared. */
	public static Unit MetrePerMillisecondTimeSquared = OM.MetrePerMillisecondTimeSquared;

	/** The minute (time) is a unit of time defined as 60 second. */
	public static Unit MinuteTime = OM.MinuteTime;

	/** Metre per second squared is a unit of acceleration defined as metre divided by second squared. */
	public static Unit MetrePerSecondTimeSquared = OM.MetrePerSecondTimeSquared;

	/** Metre per centisecond is a unit of speed defined as metre divided by centisecond. */
	public static Unit MetrePerCentisecondTime = OM.MetrePerCentisecondTime;

	/** Exametre per second is a unit of speed defined as exametre divided by second. */
	public static Unit ExametrePerSecondTime = OM.ExametrePerSecondTime;

	/** Picometre per second is a unit of speed defined as picometre divided by second. */
	public static Unit PicometrePerSecondTime = OM.PicometrePerSecondTime;

}