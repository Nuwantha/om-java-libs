package nl.wur.fbr.om.om18.set;

import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.*;
import nl.wur.fbr.om.core.impl.scales.ScaleImpl;
import nl.wur.fbr.om.core.impl.units.*;
import nl.wur.fbr.om.model.UnitAndScaleSet;
import nl.wur.fbr.om.model.dimensions.SIBaseDimension;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.SingularUnit;
import nl.wur.fbr.om.model.units.Unit;
import nl.wur.fbr.om.prefixes.DecimalPrefix;

/**
 * This class contains the identifiers for the units and scales defined for the
 * <code>om:space_and_time</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Mon Aug 10 00:27:25 CEST 2015.
 */
public class SpaceAndTime {

	/** The light year is a unit of length defined as 9.46073e15 metre. */
	public final static Unit LightYear = OM.LightYear;

	/** Megametre per second is a unit of speed defined as megametre divided by second. */
	public final static Unit MegametrePerSecondTime = OM.MegametrePerSecondTime;

	/** The attohertz is a unit of frequency defined as 1.0e-18 hertz. */
	public final static Unit Attohertz = OM.Attohertz;

	public final static Unit CubicNanometre = OM.CubicNanometre;

	/** The femtohertz is a unit of frequency defined as 1.0e-15 hertz. */
	public final static Unit Femtohertz = OM.Femtohertz;

	/** The terametre is a unit of length defined as 1.0e12 metre. */
	public final static Unit Terametre = OM.Terametre;

	public final static Unit CubicMicrometre = OM.CubicMicrometre;

	/** The US dry pint is a unit of volume defined as 5.506105e-4 cubic metre. */
	public final static Unit DryPintUS = OM.DryPintUS;

	/** The kilometre is a unit of length defined as 1.0e3 metre. */
	public final static Unit Kilometre = OM.Kilometre;

	public final static Unit Attosteradian = OM.Attosteradian;

	/** Metre per microsecond squared is a unit of acceleration defined as metre divided by microsecond squared. */
	public final static Unit MetrePerMicrosecondTimeSquared = OM.MetrePerMicrosecondTimeSquared;

	/** The gigahertz is a unit of frequency defined as 1.0e9 hertz. */
	public final static Unit Gigahertz = OM.Gigahertz;

	/** The hertz is a unit of frequency defined as 1 divided by second. */
	public final static Unit Hertz = OM.Hertz;

	/** The millisecond (plane angle) is a unit of length defined as 1.0e-3 second (plane angle). Gebruikt in de astronomie (metingen van posities van sterren/sterrenstelsels etc.) om de fout weer te geven. */
	public final static Unit MillisecondPlaneAngle = OM.MillisecondPlaneAngle;

	public final static Unit SquareFemtometre = OM.SquareFemtometre;

	/** The tablespoon is a unit of volume defined as 1.478676e-5 cubic metre. */
	public final static Unit Tablespoon = OM.Tablespoon;

	/** The centiare is a unit of area defined as 1.0e-2 are. */
	public final static Unit Centiare = OM.Centiare;

	/** The cup is a unit of volume defined as 2.365882e-4 cubic metre. */
	public final static Unit Cup = OM.Cup;

	/** The parsec is a unit of length defined as 3.08567802e16 metre. */
	public final static Unit Parsec = OM.Parsec;

	/** The exahertz is a unit of frequency defined as 1.0e18 hertz. */
	public final static Unit Exahertz = OM.Exahertz;

	/** The microhertz is a unit of frequency defined as 1.0e-6 hertz. */
	public final static Unit Microhertz = OM.Microhertz;

	/** Metre per megasecond squared is a unit of acceleration defined as metre divided by megasecond squared. */
	public final static Unit MetrePerMegasecondTimeSquared = OM.MetrePerMegasecondTimeSquared;

	public final static Unit SquarePicometre = OM.SquarePicometre;

	public final static Unit CubicDecametre = OM.CubicDecametre;

	/** The US survey mile is a unit of length defined as 1.609347e3 metre. */
	public final static Unit MileUSSurvey = OM.MileUSSurvey;

	/** The shake is a unit of time defined as 1.0e-8 second. */
	public final static Unit Shake = OM.Shake;

	/** The hour is a unit of time defined as 3600 second. */
	public final static Unit Hour = OM.Hour;

	/** The millimetre is a unit of length defined as 1.0e-3 metre. */
	public final static Unit Millimetre = OM.Millimetre;

	/** The picohertz is a unit of frequency defined as 1.0e-12 hertz. */
	public final static Unit Picohertz = OM.Picohertz;

	public final static Unit SquareGigametre = OM.SquareGigametre;

	public final static Unit MicrosecondTime = OM.MicrosecondTime;

	/** Metre per hectosecond squared is a unit of acceleration defined as metre divided by hectosecond squared. */
	public final static Unit MetrePerHectosecondTimeSquared = OM.MetrePerHectosecondTimeSquared;

	/** Metre per hectosecond is a unit of speed defined as metre divided by hectosecond. */
	public final static Unit MetrePerHectosecondTime = OM.MetrePerHectosecondTime;

	/** Petametre per second squared is a unit of acceleration defined as petametre divided by second squared. */
	public final static Unit PetametrePerSecondTimeSquared = OM.PetametrePerSecondTimeSquared;

	public final static Unit SquareMicrometre = OM.SquareMicrometre;

	/** Millimetre per day is a unit of speed defined as millimetre divided by day. */
	public final static Unit MillimetrePerDay = OM.MillimetrePerDay;

	/** The are is a unit of area defined as 100 square metre. */
	public final static Unit Are = OM.Are;

	public final static Unit CubicMegametre = OM.CubicMegametre;

	/** The kayser is a unit of wavenumber defined as 100 reciprocal metre. */
	public final static Unit Kayser = OM.Kayser;

	public final static Unit DecisecondTime = OM.DecisecondTime;

	/** The steradian is a unit of solid angle defined as the solid angle subtended at the center of a sphere by a portion of the surface of the sphere that has an area equal to the square of the radius of the sphere. */
	public final static Unit Steradian = OM.Steradian;

	/** Petametre per second is a unit of speed defined as petametre divided by second. */
	public final static Unit PetametrePerSecondTime = OM.PetametrePerSecondTime;

	public final static Unit Attoradian = OM.Attoradian;

	public final static Unit Petalitre = OM.Petalitre;

	/** Reciprocal metre is a unit of wavenumber defined as 1 divided by metre. */
	public final static Unit ReciprocalMetre = OM.ReciprocalMetre;

	public final static Unit Kilolitre = OM.Kilolitre;

	public final static Unit Decisteradian = OM.Decisteradian;

	/** The Imperial gallon is a unit of volume defined as 4.54609e-3 cubic metre. */
	public final static Unit GallonImperial = OM.GallonImperial;

	/** The fermi is a unit of length defined as 1.0e-15 metre. */
	public final static Unit Fermi = OM.Fermi;

	public final static Unit SquareAttometre = OM.SquareAttometre;

	/** Hectometre per second is a unit of speed defined as hectometre divided by second. */
	public final static Unit HectometrePerSecondTime = OM.HectometrePerSecondTime;

	/** The inch is a unit of length defined as 2.54e-2 metre. */
	public final static Unit Inch = OM.Inch;

	public final static Unit PicosecondTime = OM.PicosecondTime;

	/** Millimetre per hour is a unit of speed defined as millimetre divided by hour. */
	public final static Unit MillimetrePerHour = OM.MillimetrePerHour;

	/** The petametre is a unit of length defined as 1.0e15 metre. */
	public final static Unit Petametre = OM.Petametre;

	public final static Unit Microradian = OM.Microradian;

	/** The Imperial gill is a unit of volume defined as 1.420653e-4 cubic metre. */
	public final static Unit GillImperial = OM.GillImperial;

	/** Megametre per second squared is a unit of acceleration defined as megametre divided by second squared. */
	public final static Unit MegametrePerSecondTimeSquared = OM.MegametrePerSecondTimeSquared;

	public final static Unit Hectolitre = OM.Hectolitre;

	/** Hectometre per second squared is a unit of acceleration defined as hectometre divided by second squared. */
	public final static Unit HectometrePerSecondTimeSquared = OM.HectometrePerSecondTimeSquared;

	public final static Unit ReciprocalSecondTime = OM.ReciprocalSecondTime;

	public final static Unit Picoradian = OM.Picoradian;

	public final static Unit Picosteradian = OM.Picosteradian;

	/** The hectometre is a unit of length defined as 1.0e2 metre. */
	public final static Unit Hectometre = OM.Hectometre;

	/** The gon is a unit of plane angle defined as 1.570796e-2 radian. */
	public final static Unit Gon = OM.Gon;

	/** The ATA pica is a unit of length defined as 12 point (ATA). */
	public final static Unit PicaATA = OM.PicaATA;

	/** Metre per decasecond is a unit of speed defined as metre divided by decasecond. */
	public final static Unit MetrePerDecasecondTime = OM.MetrePerDecasecondTime;

	/** Micrometre per second is a unit of speed defined as micrometre divided by second. */
	public final static Unit MicrometrePerSecondTime = OM.MicrometrePerSecondTime;

	/** The year is a unit of time defined as 3.1536e7 second. */
	public final static Unit Year = OM.Year;

	public final static Unit AttosecondTime = OM.AttosecondTime;

	/** Metre per millisecond is a unit of speed defined as metre divided by millisecond. */
	public final static Unit MetrePerMillisecondTime = OM.MetrePerMillisecondTime;

	/** Cubic metre is a unit of volume defined as the volume of a cube whose sides measure exactly one metre. */
	public final static Unit CubicMetre = OM.CubicMetre;

	/** The hectohertz is a unit of frequency defined as 1.0e2 hertz. */
	public final static Unit Hectohertz = OM.Hectohertz;

	/** Metre per centisecond squared is a unit of acceleration defined as metre divided by centisecond squared. */
	public final static Unit MetrePerCentisecondTimeSquared = OM.MetrePerCentisecondTimeSquared;

	public final static Unit SquareDecimetre = OM.SquareDecimetre;

	/** The revolution is a unit of plane angle defined as 6.283185 radian. */
	public final static Unit Revolution = OM.Revolution;

	/** The decahertz is a unit of frequency defined as 1.0e1 hertz. */
	public final static Unit Decahertz = OM.Decahertz;

	/** The metre is a unit of length defined as the length of the path travelled by light in vacuum during a time interval of 1/299 792 458 of a second. */
	public final static Unit Metre = OM.Metre;

	public final static Unit CubicPicometre = OM.CubicPicometre;

	public final static Unit SquareExametre = OM.SquareExametre;

	/** Kilometre per second squared is a unit of acceleration defined as kilometre divided by second squared. */
	public final static Unit KilometrePerSecondTimeSquared = OM.KilometrePerSecondTimeSquared;

	/** Metre per second is a unit of speed defined as metre divided by second. */
	public final static Unit MetrePerSecondTime = OM.MetrePerSecondTime;

	/** The cicular mil is a unit of area defined as 5.067075e-10 square metre. */
	public final static Unit CircularMil = OM.CircularMil;

	/** The litre is a unit of volume defined as 1.0e-3 cubic metre. */
	public final static Unit Litre = OM.Litre;

	/** The picometre is a unit of length defined as 1.0e-12 metre. */
	public final static Unit Picometre = OM.Picometre;

	/** The atronomical unit is a unit of length defined as 149 597 870 700 metre (IAU 2012 Resolution). */
	public final static Unit AstronomicalUnit = OM.AstronomicalUnit;

	/** The knot is a unit of speed defined as nautical mile per hour. */
	public final static Unit Knot = OM.Knot;

	public final static Unit MillisecondTime = OM.MillisecondTime;

	public final static Unit CubicHectometre = OM.CubicHectometre;

	public final static Unit Millisteradian = OM.Millisteradian;

	/** The Postscript point is a unit of length defined as 0.013888888888888888888888888888889 inch. */
	public final static Unit PointPostscript = OM.PointPostscript;

	/** The attometre is a unit of length defined as 1.0e-18 metre. */
	public final static Unit Attometre = OM.Attometre;

	public final static Unit Centilitre = OM.Centilitre;

	/** The US gallon is a unit of volume defined as 3.785412e-3 cubic metre. */
	public final static Unit GallonUS = OM.GallonUS;

	/** Metre per exasecond is a unit of speed defined as metre divided by exasecond. */
	public final static Unit MetrePerExasecondTime = OM.MetrePerExasecondTime;

	public final static Unit CubicGigametre = OM.CubicGigametre;

	public final static Unit Exalitre = OM.Exalitre;

	/** Femtometre per second squared is a unit of acceleration defined as femtometre divided by second squared. */
	public final static Unit FemtometrePerSecondTimeSquared = OM.FemtometrePerSecondTimeSquared;

	/** Metre per decisecond is a unit of speed defined as metre divided by decisecond. */
	public final static Unit MetrePerDecisecondTime = OM.MetrePerDecisecondTime;

	public final static Unit TerasecondTime = OM.TerasecondTime;

	/** The petahertz is a unit of frequency defined as 1.0e15 hertz. */
	public final static Unit Petahertz = OM.Petahertz;

	/** Square metre is a unit of area defined as the area of a square whose sides measure exactly one metre. */
	public final static Unit SquareMetre = OM.SquareMetre;

	/** Metre per exasecond squared is a unit of acceleration defined as metre divided by exasecond squared. */
	public final static Unit MetrePerExasecondTimeSquared = OM.MetrePerExasecondTimeSquared;

	/** The kilohertz is a unit of frequency defined as 1.0e3 hertz. */
	public final static Unit Kilohertz = OM.Kilohertz;

	/** Kilometre per second is a unit of speed defined as kilometre divided by second. */
	public final static Unit KilometrePerSecondTime = OM.KilometrePerSecondTime;

	/** The sidereal minute is a unit of time defined as 5.983617e1 second. */
	public final static Unit MinuteSidereal = OM.MinuteSidereal;

	/** The centimetre is a unit of length defined as 1.0e-2 metre. */
	public final static Unit Centimetre = OM.Centimetre;

	public final static Unit Gigayear = OM.Gigayear;

	/** The US dry gallon is a unit of volume defined as 4.40488377086e-3 cubic metre. */
	public final static Unit DryGallonUS = OM.DryGallonUS;

	/** The foot is a unit of foot defined as 3.048e-1 metre. */
	public final static Unit Foot = OM.Foot;

	/** The sidereal second is a unit of time defined as 9.972696e-1 second. */
	public final static Unit SecondSidereal = OM.SecondSidereal;

	public final static Unit Picolitre = OM.Picolitre;

	/** The gal is a unit of acceleration defined as centimetre per second (time) squared. */
	public final static Unit Gal = OM.Gal;

	/** The exametre is a unit of length defined as 1.0e18 metre. */
	public final static Unit Exametre = OM.Exametre;

	public final static Unit KilosecondTime = OM.KilosecondTime;

	public final static Unit Microlitre = OM.Microlitre;

	/** Femtometre per second is a unit of speed defined as femtometre divided by second. */
	public final static Unit FemtometrePerSecondTime = OM.FemtometrePerSecondTime;

	/** The micrometre is a unit of length defined as 1.0e-6 metre. */
	public final static Unit Micrometre = OM.Micrometre;

	public final static Unit Centisteradian = OM.Centisteradian;

	public final static Unit Deciradian = OM.Deciradian;

	public final static Unit MegasecondTime = OM.MegasecondTime;

	/** The decimetre is a unit of length defined as 1.0e-1 metre. */
	public final static Unit Decimetre = OM.Decimetre;

	/** Attometre per second is a unit of speed defined as attometre divided by second. */
	public final static Unit AttometrePerSecondTime = OM.AttometrePerSecondTime;

	/** The barn is a unit of area defined as 1.0e-28 square metre. */
	public final static Unit Barn = OM.Barn;

	/** Metre per nanosecond is a unit of speed defined as metre divided by nanosecond. */
	public final static Unit MetrePerNanosecondTime = OM.MetrePerNanosecondTime;

	/** Metre per femtosecond squared is a unit of acceleration defined as metre divided by femtosecond squared. */
	public final static Unit MetrePerFemtosecondTimeSquared = OM.MetrePerFemtosecondTimeSquared;

	public final static Unit CubicMillimetre = OM.CubicMillimetre;

	public final static Unit NanosecondTime = OM.NanosecondTime;

	/** Metre per petasecond squared is a unit of acceleration defined as metre divided by petasecond squared. */
	public final static Unit MetrePerPetasecondTimeSquared = OM.MetrePerPetasecondTimeSquared;

	/** The sidereal year is a unit of time defined as 3.155815e7 second. */
	public final static Unit YearSidereal = OM.YearSidereal;

	/** The mil (plane angle) is a unit of plane angle defined as 9.817477e-4 radian. */
	public final static Unit MilPlaneAngle = OM.MilPlaneAngle;

	/** The sidereal day is a unit of time defined as 8.616409e4 second. */
	public final static Unit DaySidereal = OM.DaySidereal;

	/** Kilometre per hour is a unit of speed defined as kilometre divided by hour. */
	public final static Unit KilometrePerHour = OM.KilometrePerHour;

	/** The tropical year is a unit of time defined as 3.155693e7 second. */
	public final static Unit YearTropical = OM.YearTropical;

	/** Metre per megasecond is a unit of speed defined as metre divided by megasecond. */
	public final static Unit MetrePerMegasecondTime = OM.MetrePerMegasecondTime;

	/** The US liquid pint is a unit of volume defined as 4.731765e-4 cubic metre. */
	public final static Unit LiquidPintUS = OM.LiquidPintUS;

	/** Metre per decisecond squared is a unit of acceleration defined as metre divided by decisecond squared. */
	public final static Unit MetrePerDecisecondTimeSquared = OM.MetrePerDecisecondTimeSquared;

	/** The Imperial quart is a unit of volume defined as 1.1365 litre. */
	public final static Unit QuartImperial = OM.QuartImperial;

	public final static Unit Femtosteradian = OM.Femtosteradian;

	public final static Unit Millilitre = OM.Millilitre;

	/** Decametre per second is a unit of speed defined as decametre divided by second. */
	public final static Unit DecametrePerSecondTime = OM.DecametrePerSecondTime;

	/** Centimetre per day is a unit of speed defined as centimetre divided by day. */
	public final static Unit CentimetrePerDay = OM.CentimetrePerDay;

	/** The minute (time) is a unit of time defined as 60 second. */
	public final static Unit MinuteTime = OM.MinuteTime;

	/** The TeX pica is a unit of length defined as 12 point (TeX). */
	public final static Unit PicaTeX = OM.PicaTeX;

	public final static Unit Teralitre = OM.Teralitre;

	public final static Unit Nanosteradian = OM.Nanosteradian;

	public final static Unit Attolitre = OM.Attolitre;

	/** Picometre per second is a unit of speed defined as picometre divided by second. */
	public final static Unit PicometrePerSecondTime = OM.PicometrePerSecondTime;

	/** The US liquid quart is a unit of volume defined as 9.463529e-4 cubic metre. */
	public final static Unit LiquidQuartUS = OM.LiquidQuartUS;

	/** The pint is a unit of volume defined as 568.26125 millilitre. */
	public final static Unit PintImperial = OM.PintImperial;

	public final static Unit CubicExametre = OM.CubicExametre;

	public final static Unit Decilitre = OM.Decilitre;

	public final static Unit CubicKilometre = OM.CubicKilometre;

	/** The US gill is a unit of volume defined as 1.182941e-4 cubic metre. */
	public final static Unit GillUS = OM.GillUS;

	public final static Unit Nanoradian = OM.Nanoradian;

	public final static Unit CentisecondTime = OM.CentisecondTime;

	/** The nanometre is a unit of length defined as 1.0e-9 metre. */
	public final static Unit Nanometre = OM.Nanometre;

	/** Gigametre per second is a unit of speed defined as gigametre divided by second. */
	public final static Unit GigametrePerSecondTime = OM.GigametrePerSecondTime;

	public final static Unit Megalitre = OM.Megalitre;

	public final static Unit CubicTerametre = OM.CubicTerametre;

	public final static Unit Nanolitre = OM.Nanolitre;

	/** Metre per femtosecond is a unit of speed defined as metre divided by femtosecond. */
	public final static Unit MetrePerFemtosecondTime = OM.MetrePerFemtosecondTime;

	/** The micron is a unit of length defined as 1.0e-6 metre. */
	public final static Unit Micron = OM.Micron;

	/** Metre per kilosecond is a unit of speed defined as metre divided by kilosecond. */
	public final static Unit MetrePerKilosecondTime = OM.MetrePerKilosecondTime;

	/** Metre per attosecond squared is a unit of acceleration defined as metre divided by attosecond squared. */
	public final static Unit MetrePerAttosecondTimeSquared = OM.MetrePerAttosecondTimeSquared;

	/** The peck is a unit of volume defined as 8.809768e-3 cubic metre. */
	public final static Unit Peck = OM.Peck;

	public final static Unit GigasecondTime = OM.GigasecondTime;

	public final static Unit Decalitre = OM.Decalitre;

	/** The statute mile is a unit of length defined as 1.609344e3 metre. */
	public final static Unit MileStatute = OM.MileStatute;

	public final static Unit RadianPerSecondTimeSquared = OM.RadianPerSecondTimeSquared;

	/** The degree is a unit of plane angle defined as 1.745329e-2 radian. */
	public final static Unit Degree = OM.Degree;

	/** Metre per terasecond is a unit of speed defined as metre divided by terasecond. */
	public final static Unit MetrePerTerasecondTime = OM.MetrePerTerasecondTime;

	/** Metre per day is a unit of speed defined as metre divided by day. */
	public final static Unit MetrePerDay = OM.MetrePerDay;

	/** Millimetre per second is a unit of speed defined as millimetre divided by second. */
	public final static Unit MillimetrePerSecondTime = OM.MillimetrePerSecondTime;

	/** The US fluid ounce is a unit of volume defined as 2.957353e-5 cubic metre. */
	public final static Unit FluidOunceUS = OM.FluidOunceUS;

	public final static Unit CubicKiloparsec = OM.CubicKiloparsec;

	/** Decimetre per second is a unit of speed defined as decimetre divided by second. */
	public final static Unit DecimetrePerSecondTime = OM.DecimetrePerSecondTime;

	public final static Unit SquareCentimetre = OM.SquareCentimetre;

	/** The radian is a unit of plane angle defined as the plane angle subtended at the center of a circle by an arc that is equal in length to the radius of the circle. */
	public final static Unit Radian = OM.Radian;

	public final static Unit CubicDecimetre = OM.CubicDecimetre;

	/** The centihertz is a unit of frequency defined as 1.0e-2 hertz. */
	public final static Unit Centihertz = OM.Centihertz;

	/** Decametre per second squared is a unit of acceleration defined as decametre divided by second squared. */
	public final static Unit DecametrePerSecondTimeSquared = OM.DecametrePerSecondTimeSquared;

	/** Metre per kilosecond squared is a unit of acceleration defined as metre divided by kilosecond squared. */
	public final static Unit MetrePerKilosecondTimeSquared = OM.MetrePerKilosecondTimeSquared;

	/** The ångström is a unit of length defined as 1.0e-10 metre. The unit is often used for wavelengths of electromagnetic radiation or to express the sizes of atoms and molecules. */
	public final static Unit Angstrom = OM.Angstrom;

	public final static Unit SquarePetametre = OM.SquarePetametre;

	/** The Imperial fluid ounce is a unit of volume defined as 2.841306e-5 cubic metre. */
	public final static Unit FluidOunceImperial = OM.FluidOunceImperial;

	/** The chain is a unit of length defined as 2.011684e1 metre. */
	public final static Unit Chain = OM.Chain;

	/** Metre per petasecond is a unit of speed defined as metre divided by petasecond. */
	public final static Unit MetrePerPetasecondTime = OM.MetrePerPetasecondTime;

	public final static Unit CubicPetametre = OM.CubicPetametre;

	public final static Unit PetasecondTime = OM.PetasecondTime;

	/** The furlong is a unit of length defined as 201.168 metre. */
	public final static Unit Furlong = OM.Furlong;

	/** Nautical mile per hour is a unit of speed defined as nautical mile divided by hour. */
	public final static Unit NauticalMilePerHour = OM.NauticalMilePerHour;

	/** Metre per picosecond is a unit of speed defined as metre divided by picosecond. */
	public final static Unit MetrePerPicosecondTime = OM.MetrePerPicosecondTime;

	public final static Unit Milliradian = OM.Milliradian;

	public final static Unit ExasecondTime = OM.ExasecondTime;

	/** Terametre per second is a unit of speed defined as terametre divided by second. */
	public final static Unit TerametrePerSecondTime = OM.TerametrePerSecondTime;

	/** Millimetre per second squared is a unit of acceleration defined as millimetre divided by second squared. */
	public final static Unit MillimetrePerSecondTimeSquared = OM.MillimetrePerSecondTimeSquared;

	public final static Unit CubicCentimetre = OM.CubicCentimetre;

	public final static Unit DecasecondTime = OM.DecasecondTime;

	public final static Unit Femtoradian = OM.Femtoradian;

	/** Metre per attosecond is a unit of speed defined as metre divided by attosecond. */
	public final static Unit MetrePerAttosecondTime = OM.MetrePerAttosecondTime;

	/** The ATA point is a unit of length defined as 0.3514598e-3 metre. */
	public final static Unit PointATA = OM.PointATA;

	public final static Unit SquareMillimetre = OM.SquareMillimetre;

	public final static Unit Microsteradian = OM.Microsteradian;

	/** The microsecond (plane angle) is a unit of length defined as 1.0e-6 second (plane angle). Gebruikt in de astronomie (metingen van posities van sterren/sterrenstelsels etc.) om de fout weer te geven. De nieuwe satellieten zijn zo nauwkeurig dat deze fout mogelijk is geworden (GAIA-satelliet). */
	public final static Unit MicrosecondPlaneAngle = OM.MicrosecondPlaneAngle;

	public final static Unit SquareTerametre = OM.SquareTerametre;

	/** The Postscript pica is a unit of length defined as 12 point (Postscript). */
	public final static Unit PicaPostscript = OM.PicaPostscript;

	/** Metre per decasecond squared is a unit of acceleration defined as metre divided by decasecond squared. */
	public final static Unit MetrePerDecasecondTimeSquared = OM.MetrePerDecasecondTimeSquared;

	/** Metre per gigasecond squared is a unit of acceleration defined as metre divided by gigasecond squared. */
	public final static Unit MetrePerGigasecondTimeSquared = OM.MetrePerGigasecondTimeSquared;

	/** The nanohertz is a unit of frequency defined as 1.0e-9 hertz. */
	public final static Unit Nanohertz = OM.Nanohertz;

	/** The acre foot is a unit of volume defined as 1.233489e3 cubic metre. */
	public final static Unit AcreFoot = OM.AcreFoot;

	/** The US survey foot is a unit of length defined as 3.048006e-1 metre. */
	public final static Unit FootUSSurvey = OM.FootUSSurvey;

	/** The nautical mile is a unit of length defined as 1852 metre. */
	public final static Unit NauticalMile = OM.NauticalMile;

	/** Metre per terasecond squared is a unit of acceleration defined as metre divided by terasecond squared. */
	public final static Unit MetrePerTerasecondTimeSquared = OM.MetrePerTerasecondTimeSquared;

	/** The decametre is a unit of length defined as 1.0e1 metre. */
	public final static Unit Decametre = OM.Decametre;

	/** The yard is a unit of length defined as 9.144e-1 metre. */
	public final static Unit Yard = OM.Yard;

	/** The megahertz is a unit of frequency defined as 1.0e6 hertz. */
	public final static Unit Megahertz = OM.Megahertz;

	/** Nanometre per second squared is a unit of acceleration defined as nanometre divided by second squared. */
	public final static Unit NanometrePerSecondTimeSquared = OM.NanometrePerSecondTimeSquared;

	/** Metre per picosecond squared is a unit of acceleration defined as metre divided by picosecond squared. */
	public final static Unit MetrePerPicosecondTimeSquared = OM.MetrePerPicosecondTimeSquared;

	/** Decimetre per second squared is a unit of acceleration defined as decimetre divided by second squared. */
	public final static Unit DecimetrePerSecondTimeSquared = OM.DecimetrePerSecondTimeSquared;

	/** The day is a unit of time defined as 86400 second. */
	public final static Unit Day = OM.Day;

	/** The megametre is a unit of length defined as 1.0e6 metre. */
	public final static Unit Megametre = OM.Megametre;

	/** The hectare is a unit of area defined as 1.0e2 are. */
	public final static Unit Hectare = OM.Hectare;

	/** Micrometre per second squared is a unit of acceleration defined as micrometre divided by second squared. */
	public final static Unit MicrometrePerSecondTimeSquared = OM.MicrometrePerSecondTimeSquared;

	public final static Unit Gigalitre = OM.Gigalitre;

	/** The millihertz is a unit of frequency defined as 1.0e-3 hertz. */
	public final static Unit Millihertz = OM.Millihertz;

	/** Centimetre per second squared is a unit of acceleration defined as centimetre divided by second squared. */
	public final static Unit CentimetrePerSecondTimeSquared = OM.CentimetrePerSecondTimeSquared;

	/** The second is a unit of time defined as the duration of 9 192 631 770 periods of the radiation corresponding to the transition between the two hyperfine levels of the ground state of the cesium 133 atom. */
	public final static Unit SecondTime = OM.SecondTime;

	public final static Unit Femtolitre = OM.Femtolitre;

	/** Metre per microsecond is a unit of speed defined as metre divided by microsecond. */
	public final static Unit MetrePerMicrosecondTime = OM.MetrePerMicrosecondTime;

	public final static Unit HourSidereal = OM.HourSidereal;

	/** The terahertz is a unit of frequency defined as 1.0e12 hertz. */
	public final static Unit Terahertz = OM.Terahertz;

	/** Picometre per second squared is a unit of acceleration defined as picometre divided by second squared. */
	public final static Unit PicometrePerSecondTimeSquared = OM.PicometrePerSecondTimeSquared;

	/** The cord is a unit of volume defined as 3.624556 cubic metre. */
	public final static Unit Cord = OM.Cord;

	/** The gigametre is a unit of length defined as 1.0e9 metre. */
	public final static Unit Gigametre = OM.Gigametre;

	public final static Unit SquareNanometre = OM.SquareNanometre;

	/** Exametre per second squared is a unit of acceleration defined as exametre divided by second squared. */
	public final static Unit ExametrePerSecondTimeSquared = OM.ExametrePerSecondTimeSquared;

	/** The rod is a unit of length defined as 5.029210 metre. */
	public final static Unit Rod = OM.Rod;

	/** The femtometre is a unit of length defined as 1.0e-15 metre. */
	public final static Unit Femtometre = OM.Femtometre;

	/** The fathom is a unit of length defined as 1.828804 metre. */
	public final static Unit Fathom = OM.Fathom;

	public final static Unit CubicAttometre = OM.CubicAttometre;

	/** The mil (length) is a unit of length defined as 2.54e-5 metre. */
	public final static Unit MilLength = OM.MilLength;

	/** The megaparsec is a unit of length defined as 1.0e6 parsec. Gebruikt voor afstanden op de schaal van clusters. */
	public final static Unit Megaparsec = OM.Megaparsec;

	/** Metre per gigasecond is a unit of speed defined as metre divided by gigasecond. */
	public final static Unit MetrePerGigasecondTime = OM.MetrePerGigasecondTime;

	public final static Unit FemtosecondTime = OM.FemtosecondTime;

	public final static Unit SquareKilometre = OM.SquareKilometre;

	public final static Unit Centiradian = OM.Centiradian;

	/** The second (plane angle) is a unit of plane angle defined as 4.848137e-6 radian. */
	public final static Unit SecondPlaneAngle = OM.SecondPlaneAngle;

	/** Gigametre per second squared is a unit of acceleration defined as gigametre divided by second squared. */
	public final static Unit GigametrePerSecondTimeSquared = OM.GigametrePerSecondTimeSquared;

	public final static Unit CubicParsec = OM.CubicParsec;

	public final static Unit HectosecondTime = OM.HectosecondTime;

	public final static Unit DegreeSquared = OM.DegreeSquared;

	public final static Unit CubicFemtometre = OM.CubicFemtometre;

	/** The minute (plane angle) is a unit of plane angle defined as 2.908882e-4 radian. */
	public final static Unit MinutePlaneAngle = OM.MinutePlaneAngle;

	/** The TeX point is a unit of length defined as 0.01383700013837000138370001383 inch. */
	public final static Unit PointTeX = OM.PointTeX;

	/** The decihertz is a unit of frequency defined as 1.0e-1 hertz. */
	public final static Unit Decihertz = OM.Decihertz;

	/** Metre per nanosecond squared is a unit of acceleration defined as metre divided by nanosecond squared. */
	public final static Unit MetrePerNanosecondTimeSquared = OM.MetrePerNanosecondTimeSquared;

	/** Terametre per second squared is a unit of acceleration defined as terametre divided by second squared. */
	public final static Unit TerametrePerSecondTimeSquared = OM.TerametrePerSecondTimeSquared;

	public final static Unit SquareDecametre = OM.SquareDecametre;

	/** The Didot point is a unit of length defined as 0.3759e-3 metre. */
	public final static Unit PointDidot = OM.PointDidot;

	/** Attometre per second squared is a unit of acceleration defined as attometre divided by second squared. */
	public final static Unit AttometrePerSecondTimeSquared = OM.AttometrePerSecondTimeSquared;

	/** Centimetre per second is a unit of speed defined as centimetre divided by second. */
	public final static Unit CentimetrePerSecondTime = OM.CentimetrePerSecondTime;

	/** The teaspoon is a unit of volume defined as 4.928922e-6 cubic metre. */
	public final static Unit Teaspoon = OM.Teaspoon;

	/** The US dry quart is a unit of volume defined as 1.101221e-3 cubic metre. */
	public final static Unit DryQuartUS = OM.DryQuartUS;

	/** Nanometre per second is a unit of speed defined as nanometre divided by second. */
	public final static Unit NanometrePerSecondTime = OM.NanometrePerSecondTime;

	/** The bushel is a unit of volume defined as 3.523907e-2 cubic metre. */
	public final static Unit Bushel = OM.Bushel;

	/** Metre per millisecond squared is a unit of acceleration defined as metre divided by millisecond squared. */
	public final static Unit MetrePerMillisecondTimeSquared = OM.MetrePerMillisecondTimeSquared;

	/** The acre is a unit of area defined as 4.046873e3 square metre. */
	public final static Unit Acre = OM.Acre;

	/** The barrel is a unit of volume defined as 1.589873e-1 cubic metre. */
	public final static Unit Barrel = OM.Barrel;

	public final static Unit SquareHectometre = OM.SquareHectometre;

	/** The cicero is a unit of length defined as 12 point (Didot). */
	public final static Unit Cicero = OM.Cicero;

	/** Metre per second squared is a unit of acceleration defined as metre divided by second squared. */
	public final static Unit MetrePerSecondTimeSquared = OM.MetrePerSecondTimeSquared;

	public final static Unit SquareMegametre = OM.SquareMegametre;

	/** The stere is a unit of volume defined as cubic metre. */
	public final static Unit Stere = OM.Stere;

	/** Metre per centisecond is a unit of speed defined as metre divided by centisecond. */
	public final static Unit MetrePerCentisecondTime = OM.MetrePerCentisecondTime;

	/** The register ton is a unit of volume defined as 2.831658 cubic metre. */
	public final static Unit TonRegister = OM.TonRegister;

	/** Exametre per second is a unit of speed defined as exametre divided by second. */
	public final static Unit ExametrePerSecondTime = OM.ExametrePerSecondTime;

	public final static Unit MetrePerMetre = OM.MetrePerMetre;

}