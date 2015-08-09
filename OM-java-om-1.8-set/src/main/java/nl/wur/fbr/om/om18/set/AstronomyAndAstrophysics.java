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
 * <code>om:astronomy_and_astrophysics</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Mon Aug 10 00:27:25 CEST 2015.
 */
public class AstronomyAndAstrophysics {

	/** The light year is a unit of length defined as 9.46073e15 metre. */
	public final static Unit LightYear = OM.LightYear;

	/** Wordt gebruikt als hoek (360°=1440) voor o.a. rechte klimming. De m wordt meestal als superscript achter de waarde gezet gevolgd door de verdere opdeling naar seconden. Zoals in 5h34m12s09. Vaak wordt de fractie in seconden zonder punt geschreven, de s wordt als afscheiding gebruikt (http://en.wikipedia.org/wiki/Right_ascension). */
	public final static Unit MinuteHourAngle = OM.MinuteHourAngle;

	/** The amount of stellar mass created per cubic parsec in each billion years. */
	public final static Unit SolarMassPerGigayearCubicParsec = OM.SolarMassPerGigayearCubicParsec;

	/** The nanometre is a unit of length defined as 1.0e-9 metre. */
	public final static Unit Nanometre = OM.Nanometre;

	public final static Unit ReciprocalCubicParsec = OM.ReciprocalCubicParsec;

	public final static Unit SecondPlaneAngleSquared = OM.SecondPlaneAngleSquared;

	/** The brightness (in magnitudes) of an area on the celestial sphere of 1 arcsecond by 1 arcsecond. */
	public final static Unit MagnitudePerSecondPlaneAngleSquared = OM.MagnitudePerSecondPlaneAngleSquared;

	/** The kelvin is a unit of temperature defined as 1/273.16 of the thermodynamic temperature of the triple point of water. */
	public final static Unit Kelvin = OM.Kelvin;

	/** The second is a unit of time defined as the duration of 9 192 631 770 periods of the radiation corresponding to the transition between the two hyperfine levels of the ground state of the cesium 133 atom. */
	public final static Unit SecondTime = OM.SecondTime;

	public final static Unit Jansky = OM.Jansky;

	/** The gigaparsec is a unit of length defined as 1.0e9 parsec. Gebruikt voor de afstand op de schaal van het heelal. */
	public final static Unit Gigaparsec = OM.Gigaparsec;

	/** The millisecond (plane angle) is a unit of length defined as 1.0e-3 second (plane angle). Gebruikt in de astronomie (metingen van posities van sterren/sterrenstelsels etc.) om de fout weer te geven. */
	public final static Unit MillisecondPlaneAngle = OM.MillisecondPlaneAngle;

	public final static Unit MetrePerSecondTimePerMetre = OM.MetrePerSecondTimePerMetre;

	/** The centimetre is a unit of length defined as 1.0e-2 metre. */
	public final static Unit Centimetre = OM.Centimetre;

	/** The gigaelectronvolt is a unit of energy defined as 1.0e9 electronvolt. */
	public final static Unit Gigaelectronvolt = OM.Gigaelectronvolt;

	/** Wordt gebruikt als hoek (360°=24) voor o.a. rechte klimming. De h wordt meestal als superscript achter de waarde gezet gevolgd door de verdere opdeling naar minuten en seconden. Zoals in 5h34m12s09. Vaak wordt de fractie in seconden zonder punt geschreven, de s wordt als afscheiding gebruikt (http://en.wikipedia.org/wiki/Right_ascension). */
	public final static Unit HourHourAngle = OM.HourHourAngle;

	/** Wordt gebruikt als hoek (360°=864000) voor o.a. rechte klimming. De s wordt meestal als superscript achter de waarde gezet. Zoals in 5h34m12s09. Vaak wordt de fractie in seconden zonder punt geschreven, de s wordt als afscheiding gebruikt (http://en.wikipedia.org/wiki/Right_ascension). */
	public final static Unit SecondHourAngle = OM.SecondHourAngle;

	/** The radian is a unit of plane angle defined as the plane angle subtended at the center of a circle by an arc that is equal in length to the radius of the circle. */
	public final static Unit Radian = OM.Radian;

	/** The megaparsec is a unit of length defined as 1.0e6 parsec. Gebruikt voor afstanden op de schaal van clusters. */
	public final static Unit Megaparsec = OM.Megaparsec;

	/** Solar radius is a unit used in astronomy to denote stellar or stellar system radii (http://en.wikipedia.org/wiki/Solar_radius). */
	public final static Unit SolarRadius = OM.SolarRadius;

	/** The ångström is a unit of length defined as 1.0e-10 metre. The unit is often used for wavelengths of electromagnetic radiation or to express the sizes of atoms and molecules. */
	public final static Unit Angstrom = OM.Angstrom;

	/** The kiloelectronvolt is a unit of energy defined as 1.0e3 electronvolt. */
	public final static Unit Kiloelectronvolt = OM.Kiloelectronvolt;

	/** The kiloparsec is a unit of length defined as 1.0e3 parsec. Gebruikt voor afstanden op de schaal van het melkwegstelsel. */
	public final static Unit Kiloparsec = OM.Kiloparsec;

	/** Wordt gebruikt om de waargenomen verandering van de positie van sterren uit te drukken (de proper motion). */
	public final static Unit MillisecondPlaneAnglePerYear = OM.MillisecondPlaneAnglePerYear;

	/** The watt is a unit of power defined as joule divided by second = newton times metre divided by second = volt times ampere = kilogram times square metre divided by second to the power 3. */
	public final static Unit Watt = OM.Watt;

	public final static Unit WattPerSquareMetreHertz = OM.WattPerSquareMetreHertz;

	/** The second (plane angle) is a unit of plane angle defined as 4.848137e-6 radian. */
	public final static Unit SecondPlaneAngle = OM.SecondPlaneAngle;

	/** Unit one is a unit of dimension one. */
	public final static Unit One = OM.One;

	/** Ampere per watt is a unit of responsivity. */
	public final static Unit AmperePerWatt = OM.AmperePerWatt;

	public final static Unit CubicParsec = OM.CubicParsec;

	/** The millimagnitude is a unit of magnitude defined as 1.0e-3 magnitude. */
	public final static Unit Millimagnitude = OM.Millimagnitude;

	public final static Unit WattPerSteradianSquareMetreHertz = OM.WattPerSteradianSquareMetreHertz;

	/** Candela per square metre is a unit of luminance defined as candela divided by square metre. */
	public final static Unit CandelaPerSquareMetre = OM.CandelaPerSquareMetre;

	/** Eenheid waarmee de helderheid van sterren wordt aangegeven. Meestal wordt het symbool niet aangeduid (http://en.wikipedia.org/wiki/Magnitude_(astronomy)). */
	public final static Unit Magnitude = OM.Magnitude;

	/** The micromagnitude is a unit of magnitude defined as 1.0e-6 magnitude. */
	public final static Unit Micromagnitude = OM.Micromagnitude;

	/** The radiative intensity (in watts) of an area on the celestial sphere of 1 arcsecond by 1 arcsecond. */
	public final static Unit WattPerSecondPlaneAngleSquared = OM.WattPerSecondPlaneAngleSquared;

	public final static Unit WattPerCubicMetre = OM.WattPerCubicMetre;

	/** Solar mass is a unit used in astronomy to denote stellar or galactic masses (http://en.wikipedia.org/wiki/Solar_mass). */
	public final static Unit SolarMass = OM.SolarMass;

	public final static Unit DegreeSquared = OM.DegreeSquared;

	/** The minute (plane angle) is a unit of plane angle defined as 2.908882e-4 radian. */
	public final static Unit MinutePlaneAngle = OM.MinutePlaneAngle;

	/** The microsecond (plane angle) is a unit of length defined as 1.0e-6 second (plane angle). Gebruikt in de astronomie (metingen van posities van sterren/sterrenstelsels etc.) om de fout weer te geven. De nieuwe satellieten zijn zo nauwkeurig dat deze fout mogelijk is geworden (GAIA-satelliet). */
	public final static Unit MicrosecondPlaneAngle = OM.MicrosecondPlaneAngle;

	/** The percent is a unit of dimension one defined as 1/100. */
	public final static Unit Percent = OM.Percent;

	/** Solar luminosity is a unit used in astronomy to denote stellar or galactic radiant fluxes (http://en.wikipedia.org/wiki/Solar_luminosity). */
	public final static Unit SolarLuminosity = OM.SolarLuminosity;

	/** The megaelectronvolt is a unit of energy defined as 1.0e6 electronvolt. */
	public final static Unit Megaelectronvolt = OM.Megaelectronvolt;

	/** Volt per watt is a unit of responsivity. */
	public final static Unit VoltPerWatt = OM.VoltPerWatt;

	public final static Unit WattPerNanometre = OM.WattPerNanometre;

	/** The year is a unit of time defined as 3.1536e7 second. */
	public final static Unit Year = OM.Year;

	public final static Unit ReciprocalCubicMetre = OM.ReciprocalCubicMetre;

	public final static Unit MetreKilogramPerSecondTime = OM.MetreKilogramPerSecondTime;

	public final static Unit WattPerHertz = OM.WattPerHertz;

	/** De eenheid van de Hubble constante (die niet constant is!) (http://en.wikipedia.org/wiki/Hubble_constant). */
	public final static Unit KilometrePerSecondTimePerMegaparsec = OM.KilometrePerSecondTimePerMegaparsec;

	/** The mass (in solar masses) per cubic parsec. */
	public final static Unit SolarMassPerCubicParsec = OM.SolarMassPerCubicParsec;

	/** The day is a unit of time defined as 86400 second. */
	public final static Unit Day = OM.Day;

	public final static Unit BitPerSecondTime = OM.BitPerSecondTime;

	/** The amount of stellar mass created per cubic kiloparsec in each billion years. */
	public final static Unit SolarMassPerGigayearCubicKiloparsec = OM.SolarMassPerGigayearCubicKiloparsec;

	public final static Unit WattPerSquareMetreNanometre = OM.WattPerSquareMetreNanometre;

	public final static Unit WattPerSteradianSquareMetre = OM.WattPerSteradianSquareMetre;

}