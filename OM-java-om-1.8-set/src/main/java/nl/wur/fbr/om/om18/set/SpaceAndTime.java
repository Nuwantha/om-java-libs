package nl.wur.fbr.om.om18.set;

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
 * <code>om:space_and_time</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Mon Aug 10 14:31:13 CEST 2015.
 */
public class SpaceAndTime {

	/** The light year is a unit of length defined as 9.46073e15 metre. */
	public static Unit LightYear = OM.LightYear;

	/** Megametre per second is a unit of speed defined as megametre divided by second. */
	public static Unit MegametrePerSecondTime = OM.MegametrePerSecondTime;

	/** The attohertz is a unit of frequency defined as 1.0e-18 hertz. */
	public static Unit Attohertz = OM.Attohertz;

	public static Unit CubicNanometre = OM.CubicNanometre;

	/** The femtohertz is a unit of frequency defined as 1.0e-15 hertz. */
	public static Unit Femtohertz = OM.Femtohertz;

	/** The terametre is a unit of length defined as 1.0e12 metre. */
	public static Unit Terametre = OM.Terametre;

	public static Unit CubicMicrometre = OM.CubicMicrometre;

	/** The US dry pint is a unit of volume defined as 5.506105e-4 cubic metre. */
	public static Unit DryPintUS = OM.DryPintUS;

	/** The kilometre is a unit of length defined as 1.0e3 metre. */
	public static Unit Kilometre = OM.Kilometre;

	public static Unit Attosteradian = OM.Attosteradian;

	/** Metre per microsecond squared is a unit of acceleration defined as metre divided by microsecond squared. */
	public static Unit MetrePerMicrosecondTimeSquared = OM.MetrePerMicrosecondTimeSquared;

	/** The gigahertz is a unit of frequency defined as 1.0e9 hertz. */
	public static Unit Gigahertz = OM.Gigahertz;

	/** The hertz is a unit of frequency defined as 1 divided by second. */
	public static Unit Hertz = OM.Hertz;

	/** The millisecond (plane angle) is a unit of length defined as 1.0e-3 second (plane angle). Gebruikt in de astronomie (metingen van posities van sterren/sterrenstelsels etc.) om de fout weer te geven. */
	public static Unit MillisecondPlaneAngle = OM.MillisecondPlaneAngle;

	public static Unit SquareFemtometre = OM.SquareFemtometre;

	/** The tablespoon is a unit of volume defined as 1.478676e-5 cubic metre. */
	public static Unit Tablespoon = OM.Tablespoon;

	/** The centiare is a unit of area defined as 1.0e-2 are. */
	public static Unit Centiare = OM.Centiare;

	/** The cup is a unit of volume defined as 2.365882e-4 cubic metre. */
	public static Unit Cup = OM.Cup;

	/** The parsec is a unit of length defined as 3.08567802e16 metre. */
	public static Unit Parsec = OM.Parsec;

	/** The exahertz is a unit of frequency defined as 1.0e18 hertz. */
	public static Unit Exahertz = OM.Exahertz;

	/** The microhertz is a unit of frequency defined as 1.0e-6 hertz. */
	public static Unit Microhertz = OM.Microhertz;

	/** Metre per megasecond squared is a unit of acceleration defined as metre divided by megasecond squared. */
	public static Unit MetrePerMegasecondTimeSquared = OM.MetrePerMegasecondTimeSquared;

	public static Unit SquarePicometre = OM.SquarePicometre;

	public static Unit CubicDecametre = OM.CubicDecametre;

	/** The US survey mile is a unit of length defined as 1.609347e3 metre. */
	public static Unit MileUSSurvey = OM.MileUSSurvey;

	/** The shake is a unit of time defined as 1.0e-8 second. */
	public static Unit Shake = OM.Shake;

	/** The hour is a unit of time defined as 3600 second. */
	public static Unit Hour = OM.Hour;

	/** The millimetre is a unit of length defined as 1.0e-3 metre. */
	public static Unit Millimetre = OM.Millimetre;

	/** The picohertz is a unit of frequency defined as 1.0e-12 hertz. */
	public static Unit Picohertz = OM.Picohertz;

	public static Unit SquareGigametre = OM.SquareGigametre;

	public static Unit MicrosecondTime = OM.MicrosecondTime;

	/** Metre per hectosecond squared is a unit of acceleration defined as metre divided by hectosecond squared. */
	public static Unit MetrePerHectosecondTimeSquared = OM.MetrePerHectosecondTimeSquared;

	/** Metre per hectosecond is a unit of speed defined as metre divided by hectosecond. */
	public static Unit MetrePerHectosecondTime = OM.MetrePerHectosecondTime;

	/** Petametre per second squared is a unit of acceleration defined as petametre divided by second squared. */
	public static Unit PetametrePerSecondTimeSquared = OM.PetametrePerSecondTimeSquared;

	public static Unit SquareMicrometre = OM.SquareMicrometre;

	/** Millimetre per day is a unit of speed defined as millimetre divided by day. */
	public static Unit MillimetrePerDay = OM.MillimetrePerDay;

	/** The are is a unit of area defined as 100 square metre. */
	public static Unit Are = OM.Are;

	public static Unit CubicMegametre = OM.CubicMegametre;

	/** The kayser is a unit of wavenumber defined as 100 reciprocal metre. */
	public static Unit Kayser = OM.Kayser;

	public static Unit DecisecondTime = OM.DecisecondTime;

	/** The steradian is a unit of solid angle defined as the solid angle subtended at the center of a sphere by a portion of the surface of the sphere that has an area equal to the square of the radius of the sphere. */
	public static Unit Steradian = OM.Steradian;

	/** Petametre per second is a unit of speed defined as petametre divided by second. */
	public static Unit PetametrePerSecondTime = OM.PetametrePerSecondTime;

	public static Unit Attoradian = OM.Attoradian;

	public static Unit Petalitre = OM.Petalitre;

	/** Reciprocal metre is a unit of wavenumber defined as 1 divided by metre. */
	public static Unit ReciprocalMetre = OM.ReciprocalMetre;

	public static Unit Kilolitre = OM.Kilolitre;

	public static Unit Decisteradian = OM.Decisteradian;

	/** The Imperial gallon is a unit of volume defined as 4.54609e-3 cubic metre. */
	public static Unit GallonImperial = OM.GallonImperial;

	/** The fermi is a unit of length defined as 1.0e-15 metre. */
	public static Unit Fermi = OM.Fermi;

	public static Unit SquareAttometre = OM.SquareAttometre;

	/** Hectometre per second is a unit of speed defined as hectometre divided by second. */
	public static Unit HectometrePerSecondTime = OM.HectometrePerSecondTime;

	/** The inch is a unit of length defined as 2.54e-2 metre. */
	public static Unit Inch = OM.Inch;

	public static Unit PicosecondTime = OM.PicosecondTime;

	/** Millimetre per hour is a unit of speed defined as millimetre divided by hour. */
	public static Unit MillimetrePerHour = OM.MillimetrePerHour;

	/** The petametre is a unit of length defined as 1.0e15 metre. */
	public static Unit Petametre = OM.Petametre;

	public static Unit Microradian = OM.Microradian;

	/** The Imperial gill is a unit of volume defined as 1.420653e-4 cubic metre. */
	public static Unit GillImperial = OM.GillImperial;

	/** Megametre per second squared is a unit of acceleration defined as megametre divided by second squared. */
	public static Unit MegametrePerSecondTimeSquared = OM.MegametrePerSecondTimeSquared;

	public static Unit Hectolitre = OM.Hectolitre;

	/** Hectometre per second squared is a unit of acceleration defined as hectometre divided by second squared. */
	public static Unit HectometrePerSecondTimeSquared = OM.HectometrePerSecondTimeSquared;

	public static Unit ReciprocalSecondTime = OM.ReciprocalSecondTime;

	public static Unit Picoradian = OM.Picoradian;

	public static Unit Picosteradian = OM.Picosteradian;

	/** The hectometre is a unit of length defined as 1.0e2 metre. */
	public static Unit Hectometre = OM.Hectometre;

	/** The gon is a unit of plane angle defined as 1.570796e-2 radian. */
	public static Unit Gon = OM.Gon;

	/** The ATA pica is a unit of length defined as 12 point (ATA). */
	public static Unit PicaATA = OM.PicaATA;

	/** Metre per decasecond is a unit of speed defined as metre divided by decasecond. */
	public static Unit MetrePerDecasecondTime = OM.MetrePerDecasecondTime;

	/** Micrometre per second is a unit of speed defined as micrometre divided by second. */
	public static Unit MicrometrePerSecondTime = OM.MicrometrePerSecondTime;

	/** The year is a unit of time defined as 3.1536e7 second. */
	public static Unit Year = OM.Year;

	public static Unit AttosecondTime = OM.AttosecondTime;

	/** Metre per millisecond is a unit of speed defined as metre divided by millisecond. */
	public static Unit MetrePerMillisecondTime = OM.MetrePerMillisecondTime;

	/** Cubic metre is a unit of volume defined as the volume of a cube whose sides measure exactly one metre. */
	public static Unit CubicMetre = OM.CubicMetre;

	/** The hectohertz is a unit of frequency defined as 1.0e2 hertz. */
	public static Unit Hectohertz = OM.Hectohertz;

	/** Metre per centisecond squared is a unit of acceleration defined as metre divided by centisecond squared. */
	public static Unit MetrePerCentisecondTimeSquared = OM.MetrePerCentisecondTimeSquared;

	public static Unit SquareDecimetre = OM.SquareDecimetre;

	/** The revolution is a unit of plane angle defined as 6.283185 radian. */
	public static Unit Revolution = OM.Revolution;

	/** The decahertz is a unit of frequency defined as 1.0e1 hertz. */
	public static Unit Decahertz = OM.Decahertz;

	/** The metre is a unit of length defined as the length of the path travelled by light in vacuum during a time interval of 1/299 792 458 of a second. */
	public static Unit Metre = OM.Metre;

	public static Unit CubicPicometre = OM.CubicPicometre;

	public static Unit SquareExametre = OM.SquareExametre;

	/** Kilometre per second squared is a unit of acceleration defined as kilometre divided by second squared. */
	public static Unit KilometrePerSecondTimeSquared = OM.KilometrePerSecondTimeSquared;

	/** Metre per second is a unit of speed defined as metre divided by second. */
	public static Unit MetrePerSecondTime = OM.MetrePerSecondTime;

	/** The cicular mil is a unit of area defined as 5.067075e-10 square metre. */
	public static Unit CircularMil = OM.CircularMil;

	/** The litre is a unit of volume defined as 1.0e-3 cubic metre. */
	public static Unit Litre = OM.Litre;

	/** The picometre is a unit of length defined as 1.0e-12 metre. */
	public static Unit Picometre = OM.Picometre;

	/** The atronomical unit is a unit of length defined as 149 597 870 700 metre (IAU 2012 Resolution). */
	public static Unit AstronomicalUnit = OM.AstronomicalUnit;

	/** The knot is a unit of speed defined as nautical mile per hour. */
	public static Unit Knot = OM.Knot;

	public static Unit MillisecondTime = OM.MillisecondTime;

	public static Unit CubicHectometre = OM.CubicHectometre;

	public static Unit Millisteradian = OM.Millisteradian;

	/** The Postscript point is a unit of length defined as 0.013888888888888888888888888888889 inch. */
	public static Unit PointPostscript = OM.PointPostscript;

	/** The attometre is a unit of length defined as 1.0e-18 metre. */
	public static Unit Attometre = OM.Attometre;

	public static Unit Centilitre = OM.Centilitre;

	/** The US gallon is a unit of volume defined as 3.785412e-3 cubic metre. */
	public static Unit GallonUS = OM.GallonUS;

	/** Metre per exasecond is a unit of speed defined as metre divided by exasecond. */
	public static Unit MetrePerExasecondTime = OM.MetrePerExasecondTime;

	public static Unit CubicGigametre = OM.CubicGigametre;

	public static Unit Exalitre = OM.Exalitre;

	/** Femtometre per second squared is a unit of acceleration defined as femtometre divided by second squared. */
	public static Unit FemtometrePerSecondTimeSquared = OM.FemtometrePerSecondTimeSquared;

	/** Metre per decisecond is a unit of speed defined as metre divided by decisecond. */
	public static Unit MetrePerDecisecondTime = OM.MetrePerDecisecondTime;

	public static Unit TerasecondTime = OM.TerasecondTime;

	/** The petahertz is a unit of frequency defined as 1.0e15 hertz. */
	public static Unit Petahertz = OM.Petahertz;

	/** Square metre is a unit of area defined as the area of a square whose sides measure exactly one metre. */
	public static Unit SquareMetre = OM.SquareMetre;

	/** Metre per exasecond squared is a unit of acceleration defined as metre divided by exasecond squared. */
	public static Unit MetrePerExasecondTimeSquared = OM.MetrePerExasecondTimeSquared;

	/** The kilohertz is a unit of frequency defined as 1.0e3 hertz. */
	public static Unit Kilohertz = OM.Kilohertz;

	/** Kilometre per second is a unit of speed defined as kilometre divided by second. */
	public static Unit KilometrePerSecondTime = OM.KilometrePerSecondTime;

	/** The sidereal minute is a unit of time defined as 5.983617e1 second. */
	public static Unit MinuteSidereal = OM.MinuteSidereal;

	/** The centimetre is a unit of length defined as 1.0e-2 metre. */
	public static Unit Centimetre = OM.Centimetre;

	public static Unit Gigayear = OM.Gigayear;

	/** The US dry gallon is a unit of volume defined as 4.40488377086e-3 cubic metre. */
	public static Unit DryGallonUS = OM.DryGallonUS;

	/** The foot is a unit of foot defined as 3.048e-1 metre. */
	public static Unit Foot = OM.Foot;

	/** The sidereal second is a unit of time defined as 9.972696e-1 second. */
	public static Unit SecondSidereal = OM.SecondSidereal;

	public static Unit Picolitre = OM.Picolitre;

	/** The gal is a unit of acceleration defined as centimetre per second (time) squared. */
	public static Unit Gal = OM.Gal;

	/** The exametre is a unit of length defined as 1.0e18 metre. */
	public static Unit Exametre = OM.Exametre;

	public static Unit KilosecondTime = OM.KilosecondTime;

	public static Unit Microlitre = OM.Microlitre;

	/** Femtometre per second is a unit of speed defined as femtometre divided by second. */
	public static Unit FemtometrePerSecondTime = OM.FemtometrePerSecondTime;

	/** The micrometre is a unit of length defined as 1.0e-6 metre. */
	public static Unit Micrometre = OM.Micrometre;

	public static Unit Centisteradian = OM.Centisteradian;

	public static Unit Deciradian = OM.Deciradian;

	public static Unit MegasecondTime = OM.MegasecondTime;

	/** The decimetre is a unit of length defined as 1.0e-1 metre. */
	public static Unit Decimetre = OM.Decimetre;

	/** Attometre per second is a unit of speed defined as attometre divided by second. */
	public static Unit AttometrePerSecondTime = OM.AttometrePerSecondTime;

	/** The barn is a unit of area defined as 1.0e-28 square metre. */
	public static Unit Barn = OM.Barn;

	/** Metre per nanosecond is a unit of speed defined as metre divided by nanosecond. */
	public static Unit MetrePerNanosecondTime = OM.MetrePerNanosecondTime;

	/** Metre per femtosecond squared is a unit of acceleration defined as metre divided by femtosecond squared. */
	public static Unit MetrePerFemtosecondTimeSquared = OM.MetrePerFemtosecondTimeSquared;

	public static Unit CubicMillimetre = OM.CubicMillimetre;

	public static Unit NanosecondTime = OM.NanosecondTime;

	/** Metre per petasecond squared is a unit of acceleration defined as metre divided by petasecond squared. */
	public static Unit MetrePerPetasecondTimeSquared = OM.MetrePerPetasecondTimeSquared;

	/** The sidereal year is a unit of time defined as 3.155815e7 second. */
	public static Unit YearSidereal = OM.YearSidereal;

	/** The mil (plane angle) is a unit of plane angle defined as 9.817477e-4 radian. */
	public static Unit MilPlaneAngle = OM.MilPlaneAngle;

	/** The sidereal day is a unit of time defined as 8.616409e4 second. */
	public static Unit DaySidereal = OM.DaySidereal;

	/** Kilometre per hour is a unit of speed defined as kilometre divided by hour. */
	public static Unit KilometrePerHour = OM.KilometrePerHour;

	/** The tropical year is a unit of time defined as 3.155693e7 second. */
	public static Unit YearTropical = OM.YearTropical;

	/** Metre per megasecond is a unit of speed defined as metre divided by megasecond. */
	public static Unit MetrePerMegasecondTime = OM.MetrePerMegasecondTime;

	/** The US liquid pint is a unit of volume defined as 4.731765e-4 cubic metre. */
	public static Unit LiquidPintUS = OM.LiquidPintUS;

	/** Metre per decisecond squared is a unit of acceleration defined as metre divided by decisecond squared. */
	public static Unit MetrePerDecisecondTimeSquared = OM.MetrePerDecisecondTimeSquared;

	/** The Imperial quart is a unit of volume defined as 1.1365 litre. */
	public static Unit QuartImperial = OM.QuartImperial;

	public static Unit Femtosteradian = OM.Femtosteradian;

	public static Unit Millilitre = OM.Millilitre;

	/** Decametre per second is a unit of speed defined as decametre divided by second. */
	public static Unit DecametrePerSecondTime = OM.DecametrePerSecondTime;

	/** Centimetre per day is a unit of speed defined as centimetre divided by day. */
	public static Unit CentimetrePerDay = OM.CentimetrePerDay;

	/** The minute (time) is a unit of time defined as 60 second. */
	public static Unit MinuteTime = OM.MinuteTime;

	/** The TeX pica is a unit of length defined as 12 point (TeX). */
	public static Unit PicaTeX = OM.PicaTeX;

	public static Unit Teralitre = OM.Teralitre;

	public static Unit Nanosteradian = OM.Nanosteradian;

	public static Unit Attolitre = OM.Attolitre;

	/** Picometre per second is a unit of speed defined as picometre divided by second. */
	public static Unit PicometrePerSecondTime = OM.PicometrePerSecondTime;

	/** The US liquid quart is a unit of volume defined as 9.463529e-4 cubic metre. */
	public static Unit LiquidQuartUS = OM.LiquidQuartUS;

	/** The pint is a unit of volume defined as 568.26125 millilitre. */
	public static Unit PintImperial = OM.PintImperial;

	public static Unit CubicExametre = OM.CubicExametre;

	public static Unit Decilitre = OM.Decilitre;

	public static Unit CubicKilometre = OM.CubicKilometre;

	/** The US gill is a unit of volume defined as 1.182941e-4 cubic metre. */
	public static Unit GillUS = OM.GillUS;

	public static Unit Nanoradian = OM.Nanoradian;

	public static Unit CentisecondTime = OM.CentisecondTime;

	/** The nanometre is a unit of length defined as 1.0e-9 metre. */
	public static Unit Nanometre = OM.Nanometre;

	/** Gigametre per second is a unit of speed defined as gigametre divided by second. */
	public static Unit GigametrePerSecondTime = OM.GigametrePerSecondTime;

	public static Unit Megalitre = OM.Megalitre;

	public static Unit CubicTerametre = OM.CubicTerametre;

	public static Unit Nanolitre = OM.Nanolitre;

	/** Metre per femtosecond is a unit of speed defined as metre divided by femtosecond. */
	public static Unit MetrePerFemtosecondTime = OM.MetrePerFemtosecondTime;

	/** The micron is a unit of length defined as 1.0e-6 metre. */
	public static Unit Micron = OM.Micron;

	/** Metre per kilosecond is a unit of speed defined as metre divided by kilosecond. */
	public static Unit MetrePerKilosecondTime = OM.MetrePerKilosecondTime;

	/** Metre per attosecond squared is a unit of acceleration defined as metre divided by attosecond squared. */
	public static Unit MetrePerAttosecondTimeSquared = OM.MetrePerAttosecondTimeSquared;

	/** The peck is a unit of volume defined as 8.809768e-3 cubic metre. */
	public static Unit Peck = OM.Peck;

	public static Unit GigasecondTime = OM.GigasecondTime;

	public static Unit Decalitre = OM.Decalitre;

	/** The statute mile is a unit of length defined as 1.609344e3 metre. */
	public static Unit MileStatute = OM.MileStatute;

	public static Unit RadianPerSecondTimeSquared = OM.RadianPerSecondTimeSquared;

	/** The degree is a unit of plane angle defined as 1.745329e-2 radian. */
	public static Unit Degree = OM.Degree;

	/** Metre per terasecond is a unit of speed defined as metre divided by terasecond. */
	public static Unit MetrePerTerasecondTime = OM.MetrePerTerasecondTime;

	/** Metre per day is a unit of speed defined as metre divided by day. */
	public static Unit MetrePerDay = OM.MetrePerDay;

	/** Millimetre per second is a unit of speed defined as millimetre divided by second. */
	public static Unit MillimetrePerSecondTime = OM.MillimetrePerSecondTime;

	/** The US fluid ounce is a unit of volume defined as 2.957353e-5 cubic metre. */
	public static Unit FluidOunceUS = OM.FluidOunceUS;

	public static Unit CubicKiloparsec = OM.CubicKiloparsec;

	/** Decimetre per second is a unit of speed defined as decimetre divided by second. */
	public static Unit DecimetrePerSecondTime = OM.DecimetrePerSecondTime;

	public static Unit SquareCentimetre = OM.SquareCentimetre;

	/** The radian is a unit of plane angle defined as the plane angle subtended at the center of a circle by an arc that is equal in length to the radius of the circle. */
	public static Unit Radian = OM.Radian;

	public static Unit CubicDecimetre = OM.CubicDecimetre;

	/** The centihertz is a unit of frequency defined as 1.0e-2 hertz. */
	public static Unit Centihertz = OM.Centihertz;

	/** Decametre per second squared is a unit of acceleration defined as decametre divided by second squared. */
	public static Unit DecametrePerSecondTimeSquared = OM.DecametrePerSecondTimeSquared;

	/** Metre per kilosecond squared is a unit of acceleration defined as metre divided by kilosecond squared. */
	public static Unit MetrePerKilosecondTimeSquared = OM.MetrePerKilosecondTimeSquared;

	/** The ångström is a unit of length defined as 1.0e-10 metre. The unit is often used for wavelengths of electromagnetic radiation or to express the sizes of atoms and molecules. */
	public static Unit Angstrom = OM.Angstrom;

	public static Unit SquarePetametre = OM.SquarePetametre;

	/** The Imperial fluid ounce is a unit of volume defined as 2.841306e-5 cubic metre. */
	public static Unit FluidOunceImperial = OM.FluidOunceImperial;

	/** The chain is a unit of length defined as 2.011684e1 metre. */
	public static Unit Chain = OM.Chain;

	/** Metre per petasecond is a unit of speed defined as metre divided by petasecond. */
	public static Unit MetrePerPetasecondTime = OM.MetrePerPetasecondTime;

	public static Unit CubicPetametre = OM.CubicPetametre;

	public static Unit PetasecondTime = OM.PetasecondTime;

	/** The furlong is a unit of length defined as 201.168 metre. */
	public static Unit Furlong = OM.Furlong;

	/** Nautical mile per hour is a unit of speed defined as nautical mile divided by hour. */
	public static Unit NauticalMilePerHour = OM.NauticalMilePerHour;

	/** Metre per picosecond is a unit of speed defined as metre divided by picosecond. */
	public static Unit MetrePerPicosecondTime = OM.MetrePerPicosecondTime;

	public static Unit Milliradian = OM.Milliradian;

	public static Unit ExasecondTime = OM.ExasecondTime;

	/** Terametre per second is a unit of speed defined as terametre divided by second. */
	public static Unit TerametrePerSecondTime = OM.TerametrePerSecondTime;

	/** Millimetre per second squared is a unit of acceleration defined as millimetre divided by second squared. */
	public static Unit MillimetrePerSecondTimeSquared = OM.MillimetrePerSecondTimeSquared;

	public static Unit CubicCentimetre = OM.CubicCentimetre;

	public static Unit DecasecondTime = OM.DecasecondTime;

	public static Unit Femtoradian = OM.Femtoradian;

	/** Metre per attosecond is a unit of speed defined as metre divided by attosecond. */
	public static Unit MetrePerAttosecondTime = OM.MetrePerAttosecondTime;

	/** The ATA point is a unit of length defined as 0.3514598e-3 metre. */
	public static Unit PointATA = OM.PointATA;

	public static Unit SquareMillimetre = OM.SquareMillimetre;

	public static Unit Microsteradian = OM.Microsteradian;

	/** The microsecond (plane angle) is a unit of length defined as 1.0e-6 second (plane angle). Gebruikt in de astronomie (metingen van posities van sterren/sterrenstelsels etc.) om de fout weer te geven. De nieuwe satellieten zijn zo nauwkeurig dat deze fout mogelijk is geworden (GAIA-satelliet). */
	public static Unit MicrosecondPlaneAngle = OM.MicrosecondPlaneAngle;

	public static Unit SquareTerametre = OM.SquareTerametre;

	/** The Postscript pica is a unit of length defined as 12 point (Postscript). */
	public static Unit PicaPostscript = OM.PicaPostscript;

	/** Metre per decasecond squared is a unit of acceleration defined as metre divided by decasecond squared. */
	public static Unit MetrePerDecasecondTimeSquared = OM.MetrePerDecasecondTimeSquared;

	/** Metre per gigasecond squared is a unit of acceleration defined as metre divided by gigasecond squared. */
	public static Unit MetrePerGigasecondTimeSquared = OM.MetrePerGigasecondTimeSquared;

	/** The nanohertz is a unit of frequency defined as 1.0e-9 hertz. */
	public static Unit Nanohertz = OM.Nanohertz;

	/** The acre foot is a unit of volume defined as 1.233489e3 cubic metre. */
	public static Unit AcreFoot = OM.AcreFoot;

	/** The US survey foot is a unit of length defined as 3.048006e-1 metre. */
	public static Unit FootUSSurvey = OM.FootUSSurvey;

	/** The nautical mile is a unit of length defined as 1852 metre. */
	public static Unit NauticalMile = OM.NauticalMile;

	/** Metre per terasecond squared is a unit of acceleration defined as metre divided by terasecond squared. */
	public static Unit MetrePerTerasecondTimeSquared = OM.MetrePerTerasecondTimeSquared;

	/** The decametre is a unit of length defined as 1.0e1 metre. */
	public static Unit Decametre = OM.Decametre;

	/** The yard is a unit of length defined as 9.144e-1 metre. */
	public static Unit Yard = OM.Yard;

	/** The megahertz is a unit of frequency defined as 1.0e6 hertz. */
	public static Unit Megahertz = OM.Megahertz;

	/** Nanometre per second squared is a unit of acceleration defined as nanometre divided by second squared. */
	public static Unit NanometrePerSecondTimeSquared = OM.NanometrePerSecondTimeSquared;

	/** Metre per picosecond squared is a unit of acceleration defined as metre divided by picosecond squared. */
	public static Unit MetrePerPicosecondTimeSquared = OM.MetrePerPicosecondTimeSquared;

	/** Decimetre per second squared is a unit of acceleration defined as decimetre divided by second squared. */
	public static Unit DecimetrePerSecondTimeSquared = OM.DecimetrePerSecondTimeSquared;

	/** The day is a unit of time defined as 86400 second. */
	public static Unit Day = OM.Day;

	/** The megametre is a unit of length defined as 1.0e6 metre. */
	public static Unit Megametre = OM.Megametre;

	/** The hectare is a unit of area defined as 1.0e2 are. */
	public static Unit Hectare = OM.Hectare;

	/** Micrometre per second squared is a unit of acceleration defined as micrometre divided by second squared. */
	public static Unit MicrometrePerSecondTimeSquared = OM.MicrometrePerSecondTimeSquared;

	public static Unit Gigalitre = OM.Gigalitre;

	/** The millihertz is a unit of frequency defined as 1.0e-3 hertz. */
	public static Unit Millihertz = OM.Millihertz;

	/** Centimetre per second squared is a unit of acceleration defined as centimetre divided by second squared. */
	public static Unit CentimetrePerSecondTimeSquared = OM.CentimetrePerSecondTimeSquared;

	/** The second is a unit of time defined as the duration of 9 192 631 770 periods of the radiation corresponding to the transition between the two hyperfine levels of the ground state of the cesium 133 atom. */
	public static Unit SecondTime = OM.SecondTime;

	public static Unit Femtolitre = OM.Femtolitre;

	/** Metre per microsecond is a unit of speed defined as metre divided by microsecond. */
	public static Unit MetrePerMicrosecondTime = OM.MetrePerMicrosecondTime;

	public static Unit HourSidereal = OM.HourSidereal;

	/** The terahertz is a unit of frequency defined as 1.0e12 hertz. */
	public static Unit Terahertz = OM.Terahertz;

	/** Picometre per second squared is a unit of acceleration defined as picometre divided by second squared. */
	public static Unit PicometrePerSecondTimeSquared = OM.PicometrePerSecondTimeSquared;

	/** The cord is a unit of volume defined as 3.624556 cubic metre. */
	public static Unit Cord = OM.Cord;

	/** The gigametre is a unit of length defined as 1.0e9 metre. */
	public static Unit Gigametre = OM.Gigametre;

	public static Unit SquareNanometre = OM.SquareNanometre;

	/** Exametre per second squared is a unit of acceleration defined as exametre divided by second squared. */
	public static Unit ExametrePerSecondTimeSquared = OM.ExametrePerSecondTimeSquared;

	/** The rod is a unit of length defined as 5.029210 metre. */
	public static Unit Rod = OM.Rod;

	/** The femtometre is a unit of length defined as 1.0e-15 metre. */
	public static Unit Femtometre = OM.Femtometre;

	/** The fathom is a unit of length defined as 1.828804 metre. */
	public static Unit Fathom = OM.Fathom;

	public static Unit CubicAttometre = OM.CubicAttometre;

	/** The mil (length) is a unit of length defined as 2.54e-5 metre. */
	public static Unit MilLength = OM.MilLength;

	/** The megaparsec is a unit of length defined as 1.0e6 parsec. Gebruikt voor afstanden op de schaal van clusters. */
	public static Unit Megaparsec = OM.Megaparsec;

	/** Metre per gigasecond is a unit of speed defined as metre divided by gigasecond. */
	public static Unit MetrePerGigasecondTime = OM.MetrePerGigasecondTime;

	public static Unit FemtosecondTime = OM.FemtosecondTime;

	public static Unit SquareKilometre = OM.SquareKilometre;

	public static Unit Centiradian = OM.Centiradian;

	/** The second (plane angle) is a unit of plane angle defined as 4.848137e-6 radian. */
	public static Unit SecondPlaneAngle = OM.SecondPlaneAngle;

	/** Gigametre per second squared is a unit of acceleration defined as gigametre divided by second squared. */
	public static Unit GigametrePerSecondTimeSquared = OM.GigametrePerSecondTimeSquared;

	public static Unit CubicParsec = OM.CubicParsec;

	public static Unit HectosecondTime = OM.HectosecondTime;

	public static Unit DegreeSquared = OM.DegreeSquared;

	public static Unit CubicFemtometre = OM.CubicFemtometre;

	/** The minute (plane angle) is a unit of plane angle defined as 2.908882e-4 radian. */
	public static Unit MinutePlaneAngle = OM.MinutePlaneAngle;

	/** The TeX point is a unit of length defined as 0.01383700013837000138370001383 inch. */
	public static Unit PointTeX = OM.PointTeX;

	/** The decihertz is a unit of frequency defined as 1.0e-1 hertz. */
	public static Unit Decihertz = OM.Decihertz;

	/** Metre per nanosecond squared is a unit of acceleration defined as metre divided by nanosecond squared. */
	public static Unit MetrePerNanosecondTimeSquared = OM.MetrePerNanosecondTimeSquared;

	/** Terametre per second squared is a unit of acceleration defined as terametre divided by second squared. */
	public static Unit TerametrePerSecondTimeSquared = OM.TerametrePerSecondTimeSquared;

	public static Unit SquareDecametre = OM.SquareDecametre;

	/** The Didot point is a unit of length defined as 0.3759e-3 metre. */
	public static Unit PointDidot = OM.PointDidot;

	/** Attometre per second squared is a unit of acceleration defined as attometre divided by second squared. */
	public static Unit AttometrePerSecondTimeSquared = OM.AttometrePerSecondTimeSquared;

	/** Centimetre per second is a unit of speed defined as centimetre divided by second. */
	public static Unit CentimetrePerSecondTime = OM.CentimetrePerSecondTime;

	/** The teaspoon is a unit of volume defined as 4.928922e-6 cubic metre. */
	public static Unit Teaspoon = OM.Teaspoon;

	/** The US dry quart is a unit of volume defined as 1.101221e-3 cubic metre. */
	public static Unit DryQuartUS = OM.DryQuartUS;

	/** Nanometre per second is a unit of speed defined as nanometre divided by second. */
	public static Unit NanometrePerSecondTime = OM.NanometrePerSecondTime;

	/** The bushel is a unit of volume defined as 3.523907e-2 cubic metre. */
	public static Unit Bushel = OM.Bushel;

	/** Metre per millisecond squared is a unit of acceleration defined as metre divided by millisecond squared. */
	public static Unit MetrePerMillisecondTimeSquared = OM.MetrePerMillisecondTimeSquared;

	/** The acre is a unit of area defined as 4.046873e3 square metre. */
	public static Unit Acre = OM.Acre;

	/** The barrel is a unit of volume defined as 1.589873e-1 cubic metre. */
	public static Unit Barrel = OM.Barrel;

	public static Unit SquareHectometre = OM.SquareHectometre;

	/** The cicero is a unit of length defined as 12 point (Didot). */
	public static Unit Cicero = OM.Cicero;

	/** Metre per second squared is a unit of acceleration defined as metre divided by second squared. */
	public static Unit MetrePerSecondTimeSquared = OM.MetrePerSecondTimeSquared;

	public static Unit SquareMegametre = OM.SquareMegametre;

	/** The stere is a unit of volume defined as cubic metre. */
	public static Unit Stere = OM.Stere;

	/** Metre per centisecond is a unit of speed defined as metre divided by centisecond. */
	public static Unit MetrePerCentisecondTime = OM.MetrePerCentisecondTime;

	/** The register ton is a unit of volume defined as 2.831658 cubic metre. */
	public static Unit TonRegister = OM.TonRegister;

	/** Exametre per second is a unit of speed defined as exametre divided by second. */
	public static Unit ExametrePerSecondTime = OM.ExametrePerSecondTime;

	public static Unit MetrePerMetre = OM.MetrePerMetre;

}