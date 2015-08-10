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
import java.util.Set;
import java.util.HashSet;
import nl.wur.fbr.om.prefixes.*;

/**
 * This class contains the identifiers for the units and scales defined for the
 * <code>om:astronomy_and_astrophysics</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Mon Aug 10 12:33:25 CEST 2015.
 */
public class AstronomyAndAstrophysics {

	/** The light year is a unit of length defined as 9.46073e15 metre. */
	public static Unit LightYear = OM.LightYear;

	/** Wordt gebruikt als hoek (360°=1440) voor o.a. rechte klimming. De m wordt meestal als superscript achter de waarde gezet gevolgd door de verdere opdeling naar seconden. Zoals in 5h34m12s09. Vaak wordt de fractie in seconden zonder punt geschreven, de s wordt als afscheiding gebruikt (http://en.wikipedia.org/wiki/Right_ascension). */
	public static Unit MinuteHourAngle = OM.MinuteHourAngle;

	/** The amount of stellar mass created per cubic parsec in each billion years. */
	public static Unit SolarMassPerGigayearCubicParsec = OM.SolarMassPerGigayearCubicParsec;

	/** The nanometre is a unit of length defined as 1.0e-9 metre. */
	public static Unit Nanometre = OM.Nanometre;

	public static Unit ReciprocalCubicParsec = OM.ReciprocalCubicParsec;

	public static Unit SecondPlaneAngleSquared = OM.SecondPlaneAngleSquared;

	/** The brightness (in magnitudes) of an area on the celestial sphere of 1 arcsecond by 1 arcsecond. */
	public static Unit MagnitudePerSecondPlaneAngleSquared = OM.MagnitudePerSecondPlaneAngleSquared;

	/** The kelvin is a unit of temperature defined as 1/273.16 of the thermodynamic temperature of the triple point of water. */
	public static Unit Kelvin = OM.Kelvin;

	/** The second is a unit of time defined as the duration of 9 192 631 770 periods of the radiation corresponding to the transition between the two hyperfine levels of the ground state of the cesium 133 atom. */
	public static Unit SecondTime = OM.SecondTime;

	public static Unit Jansky = OM.Jansky;

	/** The gigaparsec is a unit of length defined as 1.0e9 parsec. Gebruikt voor de afstand op de schaal van het heelal. */
	public static Unit Gigaparsec = OM.Gigaparsec;

	/** The millisecond (plane angle) is a unit of length defined as 1.0e-3 second (plane angle). Gebruikt in de astronomie (metingen van posities van sterren/sterrenstelsels etc.) om de fout weer te geven. */
	public static Unit MillisecondPlaneAngle = OM.MillisecondPlaneAngle;

	public static Unit MetrePerSecondTimePerMetre = OM.MetrePerSecondTimePerMetre;

	/** The centimetre is a unit of length defined as 1.0e-2 metre. */
	public static Unit Centimetre = OM.Centimetre;

	/** The gigaelectronvolt is a unit of energy defined as 1.0e9 electronvolt. */
	public static Unit Gigaelectronvolt = OM.Gigaelectronvolt;

	/** Wordt gebruikt als hoek (360°=24) voor o.a. rechte klimming. De h wordt meestal als superscript achter de waarde gezet gevolgd door de verdere opdeling naar minuten en seconden. Zoals in 5h34m12s09. Vaak wordt de fractie in seconden zonder punt geschreven, de s wordt als afscheiding gebruikt (http://en.wikipedia.org/wiki/Right_ascension). */
	public static Unit HourHourAngle = OM.HourHourAngle;

	/** Wordt gebruikt als hoek (360°=864000) voor o.a. rechte klimming. De s wordt meestal als superscript achter de waarde gezet. Zoals in 5h34m12s09. Vaak wordt de fractie in seconden zonder punt geschreven, de s wordt als afscheiding gebruikt (http://en.wikipedia.org/wiki/Right_ascension). */
	public static Unit SecondHourAngle = OM.SecondHourAngle;

	/** The radian is a unit of plane angle defined as the plane angle subtended at the center of a circle by an arc that is equal in length to the radius of the circle. */
	public static Unit Radian = OM.Radian;

	/** The megaparsec is a unit of length defined as 1.0e6 parsec. Gebruikt voor afstanden op de schaal van clusters. */
	public static Unit Megaparsec = OM.Megaparsec;

	/** Solar radius is a unit used in astronomy to denote stellar or stellar system radii (http://en.wikipedia.org/wiki/Solar_radius). */
	public static Unit SolarRadius = OM.SolarRadius;

	/** The ångström is a unit of length defined as 1.0e-10 metre. The unit is often used for wavelengths of electromagnetic radiation or to express the sizes of atoms and molecules. */
	public static Unit Angstrom = OM.Angstrom;

	/** The kiloelectronvolt is a unit of energy defined as 1.0e3 electronvolt. */
	public static Unit Kiloelectronvolt = OM.Kiloelectronvolt;

	/** The kiloparsec is a unit of length defined as 1.0e3 parsec. Gebruikt voor afstanden op de schaal van het melkwegstelsel. */
	public static Unit Kiloparsec = OM.Kiloparsec;

	/** Wordt gebruikt om de waargenomen verandering van de positie van sterren uit te drukken (de proper motion). */
	public static Unit MillisecondPlaneAnglePerYear = OM.MillisecondPlaneAnglePerYear;

	/** The watt is a unit of power defined as joule divided by second = newton times metre divided by second = volt times ampere = kilogram times square metre divided by second to the power 3. */
	public static Unit Watt = OM.Watt;

	public static Unit WattPerSquareMetreHertz = OM.WattPerSquareMetreHertz;

	/** The second (plane angle) is a unit of plane angle defined as 4.848137e-6 radian. */
	public static Unit SecondPlaneAngle = OM.SecondPlaneAngle;

	/** Unit one is a unit of dimension one. */
	public static Unit One = OM.One;

	/** Ampere per watt is a unit of responsivity. */
	public static Unit AmperePerWatt = OM.AmperePerWatt;

	public static Unit CubicParsec = OM.CubicParsec;

	/** The millimagnitude is a unit of magnitude defined as 1.0e-3 magnitude. */
	public static Unit Millimagnitude = OM.Millimagnitude;

	public static Unit WattPerSteradianSquareMetreHertz = OM.WattPerSteradianSquareMetreHertz;

	/** Candela per square metre is a unit of luminance defined as candela divided by square metre. */
	public static Unit CandelaPerSquareMetre = OM.CandelaPerSquareMetre;

	/** Eenheid waarmee de helderheid van sterren wordt aangegeven. Meestal wordt het symbool niet aangeduid (http://en.wikipedia.org/wiki/Magnitude_(astronomy)). */
	public static Unit Magnitude = OM.Magnitude;

	/** The micromagnitude is a unit of magnitude defined as 1.0e-6 magnitude. */
	public static Unit Micromagnitude = OM.Micromagnitude;

	/** The radiative intensity (in watts) of an area on the celestial sphere of 1 arcsecond by 1 arcsecond. */
	public static Unit WattPerSecondPlaneAngleSquared = OM.WattPerSecondPlaneAngleSquared;

	public static Unit WattPerCubicMetre = OM.WattPerCubicMetre;

	/** Solar mass is a unit used in astronomy to denote stellar or galactic masses (http://en.wikipedia.org/wiki/Solar_mass). */
	public static Unit SolarMass = OM.SolarMass;

	public static Unit DegreeSquared = OM.DegreeSquared;

	/** The minute (plane angle) is a unit of plane angle defined as 2.908882e-4 radian. */
	public static Unit MinutePlaneAngle = OM.MinutePlaneAngle;

	/** The microsecond (plane angle) is a unit of length defined as 1.0e-6 second (plane angle). Gebruikt in de astronomie (metingen van posities van sterren/sterrenstelsels etc.) om de fout weer te geven. De nieuwe satellieten zijn zo nauwkeurig dat deze fout mogelijk is geworden (GAIA-satelliet). */
	public static Unit MicrosecondPlaneAngle = OM.MicrosecondPlaneAngle;

	/** The percent is a unit of dimension one defined as 1/100. */
	public static Unit Percent = OM.Percent;

	/** Solar luminosity is a unit used in astronomy to denote stellar or galactic radiant fluxes (http://en.wikipedia.org/wiki/Solar_luminosity). */
	public static Unit SolarLuminosity = OM.SolarLuminosity;

	/** The megaelectronvolt is a unit of energy defined as 1.0e6 electronvolt. */
	public static Unit Megaelectronvolt = OM.Megaelectronvolt;

	/** Volt per watt is a unit of responsivity. */
	public static Unit VoltPerWatt = OM.VoltPerWatt;

	public static Unit WattPerNanometre = OM.WattPerNanometre;

	/** The year is a unit of time defined as 3.1536e7 second. */
	public static Unit Year = OM.Year;

	public static Unit ReciprocalCubicMetre = OM.ReciprocalCubicMetre;

	public static Unit MetreKilogramPerSecondTime = OM.MetreKilogramPerSecondTime;

	public static Unit WattPerHertz = OM.WattPerHertz;

	/** De eenheid van de Hubble constante (die niet constant is!) (http://en.wikipedia.org/wiki/Hubble_constant). */
	public static Unit KilometrePerSecondTimePerMegaparsec = OM.KilometrePerSecondTimePerMegaparsec;

	/** The mass (in solar masses) per cubic parsec. */
	public static Unit SolarMassPerCubicParsec = OM.SolarMassPerCubicParsec;

	/** The day is a unit of time defined as 86400 second. */
	public static Unit Day = OM.Day;

	public static Unit BitPerSecondTime = OM.BitPerSecondTime;

	/** The amount of stellar mass created per cubic kiloparsec in each billion years. */
	public static Unit SolarMassPerGigayearCubicKiloparsec = OM.SolarMassPerGigayearCubicKiloparsec;

	public static Unit WattPerSquareMetreNanometre = OM.WattPerSquareMetreNanometre;

	public static Unit WattPerSteradianSquareMetre = OM.WattPerSteradianSquareMetre;

}