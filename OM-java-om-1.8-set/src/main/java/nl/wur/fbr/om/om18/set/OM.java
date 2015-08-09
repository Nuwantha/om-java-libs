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
 * This class contains all identifiers for units and scales defined in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Mon Aug 10 00:27:22 CEST 2015.
 */
public class OM {

	public final static Unit Decasievert;

	/** The statvolt is a unit of electric potential defined as 2.997925e2 volt. */
	public final static Unit Statvolt;

	/** Megametre per second is a unit of speed defined as megametre divided by second. */
	public final static Unit MegametrePerSecondTime;

	/** The attohertz is a unit of frequency defined as 1.0e-18 hertz. */
	public final static Unit Attohertz;

	/** The petagray is a unit of absorbed dose defined as 1.0e15 gray. */
	public final static Unit Petagray;

	/** The terametre is a unit of length defined as 1.0e12 metre. */
	public final static Unit Terametre;

	/** Metre per yottasecond is a unit of speed defined as metre divided by yottasecond. */
	public final static Unit MetrePerYottasecondTime;

	public final static Unit Yoctosievert;

	public final static Unit Gigasiemens;

	public final static Unit DecasecondTimeSquared;

	/** Metre per microsecond squared is a unit of acceleration defined as metre divided by microsecond squared. */
	public final static Unit MetrePerMicrosecondTimeSquared;

	public final static Unit Jansky;

	public final static Unit Zebibit;

	/** The apothecaries' ounce is a unit of mass defined as 3.110348e-2 kilogram. */
	public final static Unit OunceApothecaries;

	/** The oersted is a unit of magnetic field defined as 7.957747e1 ampere per metre. */
	public final static Unit Oersted;

	/** The yoctohenry is a unit of inductance defined as 1.0e-24 henry. */
	public final static Unit Yoctohenry;

	public final static Unit Gigaweber;

	/** Zettagram per litre is a unit of density defined as zettagram divided by litre. */
	public final static Unit ZettagramPerLitre;

	/** The microhertz is a unit of frequency defined as 1.0e-6 hertz. */
	public final static Unit Microhertz;

	/** The yottajoule is a unit of energy defined as 1.0e24 joule. */
	public final static Unit Yottajoule;

	/** Metre per megasecond squared is a unit of acceleration defined as metre divided by megasecond squared. */
	public final static Unit MetrePerMegasecondTimeSquared;

	/** The gigakatal is a unit of catalytic activity defined as 1.0e9 katal. */
	public final static Unit Gigakatal;

	/** The decakelvin is a unit of thermodynamic temperature defined as 1.0e1 kelvin. */
	public final static Unit Decakelvin;

	public final static Unit Megasiemens;

	/** The petaampere is a unit of electric current defined as 1.0e15 ampere. */
	public final static Unit Petaampere;

	/** Gram per yoctolitre is a unit of density defined as gram divided by yoctolitre. */
	public final static Unit GramPerYoctolitre;

	/** The picokatal is a unit of catalytic activity defined as 1.0e-12 katal. */
	public final static Unit Picokatal;

	public final static Unit Kilolux;

	/** The ampere is a unit of electric current defined as the constant current that produces an attractive force of 2e–7 newton per metre of length between two straight, parallel conductors of infinite length and negligible circular cross section placed one metre apart in a vacuum. */
	public final static Unit Ampere;

	/** Metre per hectosecond squared is a unit of acceleration defined as metre divided by hectosecond squared. */
	public final static Unit MetrePerHectosecondTimeSquared;

	public final static Unit Picoweber;

	public final static Unit Decisievert;

	public final static Unit CandelaSteradian;

	public final static Unit SquareMicrometre;

	/** The hectobecquerel is a unit of activity defined as 1.0e2 becquerel. */
	public final static Unit Hectobecquerel;

	/** The petagram is a unit of mass defined as 1.0e15 gram. */
	public final static Unit Petagram;

	public final static Unit CubicMegametre;

	public final static Unit DecisecondTime;

	/** The tesla is a unit of magnetic flux density defined as volt times second divided by square metre = newton divided by ampere times metre = weber divided by square metre = kilogram divided by coulomb times second = kilogram divided by ampere times second squared. */
	public final static Unit Tesla;

	/** The avoirdupois pound is a unit of mass defined as 4.535924e-1 kilogram. */
	public final static Unit PoundAvoirdupois;

	public final static Unit FemtomolePerMetre;

	public final static Unit Kilolitre;

	/** The yottametre is a unit of length defined as 1.0e24 metre. */
	public final static Unit Yottametre;

	public final static Unit Exasievert;

	/** The petamolair is a unit of amount of substance concentration defined as 1.0e15 molair. */
	public final static Unit Petamolair;

	/** The millimetre of mercury is a unit of pressure defined as 1.0e-3 metre of mercury. */
	public final static Unit MillimetreOfMercury;

	/** Gram per nanolitre is a unit of density defined as gram divided by nanolitre. */
	public final static Unit GramPerNanolitre;

	/** The inch is a unit of length defined as 2.54e-2 metre. */
	public final static Unit Inch;

	public final static Unit Megabit;

	public final static Unit PicosecondTime;

	public final static Unit SquareMetrePerSquareMetreDay;

	public final static Unit Nanopascal;

	public final static Unit TonnePerHectare;

	public final static Unit Megasievert;

	public final static Unit Hectolitre;

	/** Hectometre per second squared is a unit of acceleration defined as hectometre divided by second squared. */
	public final static Unit HectometrePerSecondTimeSquared;

	/** The International Table British thermal unit is a unit of energy defined as 1.055056e3 joule. */
	public final static Unit BritishThermalUnitInternationalTable;

	public final static Unit DegreeCelsiusPerHour;

	/** Gram per cubic centimetre is a unit of density defined as gram divided by cubic centimetre. */
	public final static Unit GramPerCubicCentimetre;

	public final static Unit Exatesla;

	/** The centikelvin is a unit of temperature defined as 1.0e-2 kelvin. */
	public final static Unit Centikelvin;

	/** The exakelvin is a unit of thermodynamic temperature defined as 1.0e18 kelvin. */
	public final static Unit Exakelvin;

	public final static Unit Gigasievert;

	public final static Unit MillimolePerMetre;

	/** The gon is a unit of plane angle defined as 1.570796e-2 radian. */
	public final static Unit Gon;

	public final static Unit MolePerMicrometre;

	public final static Unit Zettapascal;

	public final static Unit Millivolt;

	public final static Unit Petamole;

	public final static Unit Exasiemens;

	/** The centihenry is a unit of inductance defined as 1.0e-2 henry. */
	public final static Unit Centihenry;

	/** The megafarad is a unit of capacitance defined as 1.0e6 farad. */
	public final static Unit Megafarad;

	/** The rem is a unit of dose equivalent defined as 1.0e-2 sievert. */
	public final static Unit Rem;

	public final static Unit ReciprocalHenry;

	/** The femtocandela is a unit of luminous intensity defined as 1.0e-15 candela. */
	public final static Unit Femtocandela;

	public final static Unit Teratesla;

	public final static Unit Zeptolitre;

	/** The decahertz is a unit of frequency defined as 1.0e1 hertz. */
	public final static Unit Decahertz;

	public final static Unit SquareMetrePerSquareMetre;

	/** The metre is a unit of length defined as the length of the path travelled by light in vacuum during a time interval of 1/299 792 458 of a second. */
	public final static Unit Metre;

	public final static Unit SquareExametre;

	/** The zeptcandela is a unit of luminous intensity defined as 1.0e-21 candela. */
	public final static Unit Zeptocandela;

	/** The cicular mil is a unit of area defined as 5.067075e-10 square metre. */
	public final static Unit CircularMil;

	/** Mole per exalitre is a unit of amount of substance concentration defined as mole divided by exalitre. */
	public final static Unit MolePerExalitre;

	/** The atronomical unit is a unit of length defined as 149 597 870 700 metre (IAU 2012 Resolution). */
	public final static Unit AstronomicalUnit;

	public final static Unit KelvinKilogram;

	public final static Scale RankineScale;

	public final static Unit Exavolt;

	public final static Unit MillisecondTime;

	public final static Unit MegasecondTimeSquared;

	public final static Unit Millimole;

	public final static Unit Zettasiemens;

	public final static Unit Millisteradian;

	/** The decihenry is a unit of inductance defined as 1.0e-1 henry. */
	public final static Unit Decihenry;

	public final static Unit Nanoweber;

	/** The biot is a unit of electric current defined as 10 ampere. */
	public final static Unit Biot;

	/** Parts per million is a unit of dimension one defined as 1/1 000 000. */
	public final static Unit PartsPerMillion;

	/** The abampere is a unit of electric current defined as 10 ampere. */
	public final static Unit Abampere;

	public final static Unit Zettasievert;

	public final static Unit Yottatesla;

	/** The terajoule is a unit of energy defined as 1.0e12 joule. */
	public final static Unit Terajoule;

	public final static Unit Milliwatt;

	public final static Unit ReciprocalDegreeCelsiusDay;

	public final static Unit JapaneseYen;

	public final static Unit Gigayear;

	/** The US dry gallon is a unit of volume defined as 4.40488377086e-3 cubic metre. */
	public final static Unit DryGallonUS;

	/** The foot is a unit of foot defined as 3.048e-1 metre. */
	public final static Unit Foot;

	public final static Unit Exbibyte;

	/** The nanocoulomb is a unit of electric charge defined as 1.0e-9 coulomb. */
	public final static Unit Nanocoulomb;

	/** The exametre is a unit of length defined as 1.0e18 metre. */
	public final static Unit Exametre;

	public final static Unit ReciprocalYear;

	/** The statfarad is a unit of capacitance defined as 1.112650e-12 farad. */
	public final static Unit Statfarad;

	public final static Unit SecondTimeSquared;

	/** Femtometre per second is a unit of speed defined as femtometre divided by second. */
	public final static Unit FemtometrePerSecondTime;

	public final static Unit Femtopascal;

	public final static Unit CentimolePerMetre;

	public final static Unit Deciradian;

	/** Gram per picolitre is a unit of density defined as gram divided by picolitre. */
	public final static Unit GramPerPicolitre;

	public final static Unit Megawatt;

	public final static Unit MicromolePerMole;

	public final static Unit ErgSecondTime;

	/** Mole per millilitre is a unit of amount of substance concentration defined as mole divided by millilitre. */
	public final static Unit MolePerMillilitre;

	public final static Unit SecondTimeToThePower2;

	public final static Unit NanosecondTimeSquared;

	public final static Unit ZeptosecondTime;

	/** The attohenry is a unit of inductance defined as 1.0e-18 henry. */
	public final static Unit Attohenry;

	/** The milligray is a unit of absorbed dose defined as 1.0e-3 gray. */
	public final static Unit Milligray;

	public final static Unit CubicMillimetre;

	/** The hectomolair is a unit of amount of substance concentration defined as 1.0e2 molair. */
	public final static Unit Hectomolair;

	/** The yottakelvin is a unit of thermodynamic temperature defined as 1.0e24 kelvin. */
	public final static Unit Yottakelvin;

	/** The rhe is a unit of fluidity defined as 10 reciprocal pascal second (time). */
	public final static Unit Rhe;

	public final static Unit NanosecondTime;

	public final static Unit JoulePerSquareMetre;

	/** Metre per petasecond squared is a unit of acceleration defined as metre divided by petasecond squared. */
	public final static Unit MetrePerPetasecondTimeSquared;

	/** The milligram is a unit of mass defined as 1.0e-3 gram. */
	public final static Unit Milligram;

	public final static Unit MolePerKilometre;

	public final static Unit Kilolumen;

	public final static Unit Yoctosiemens;

	public final static Unit Zeptolumen;

	/** The terafarad is a unit of capacitance defined as 1.0e12 farad. */
	public final static Unit Terafarad;

	public final static Unit Exabit;

	/** Metre per megasecond is a unit of speed defined as metre divided by megasecond. */
	public final static Unit MetrePerMegasecondTime;

	/** The stattesla is a unit of magnetic flux density defined as 2.9979e6 tesla. */
	public final static Unit Stattesla;

	public final static Unit Zeptoradian;

	/** The yoctohertz is a unit of frequency defined as 1.0e-24 hertz. */
	public final static Unit Yoctohertz;

	/** The yoctodegree Celsius is a unit of temperature defined as 1.0e-24 degree Celsius. */
	public final static Unit YoctodegreeCelsius;

	/** Teragram per litre is a unit of density defined as teragram divided by litre. */
	public final static Unit TeragramPerLitre;

	public final static Unit MolePerMegametre;

	/** The microhenry is a unit of inductance defined as 1.0e-6 henry. */
	public final static Unit Microhenry;

	/** The yottaampere is a unit of electric current defined as 1.0e24 ampere. */
	public final static Unit Yottaampere;

	/** Zettamole per litre is a unit of amount of substance concentration defined as zettamole divided by litre. */
	public final static Unit ZettamolePerLitre;

	public final static Unit ReciprocalPascalSecondTime;

	/** The zettabecquerel is a unit of activity defined as 1.0e21 becquerel. */
	public final static Unit Zettabecquerel;

	/** Decametre per second is a unit of speed defined as decametre divided by second. */
	public final static Unit DecametrePerSecondTime;

	/** Mole per decalitre is a unit of amount of substance concentration defined as mole divided by decalitre. */
	public final static Unit MolePerDecalitre;

	/** The microcoulomb is a unit of electric charge defined as 1.0e-6 coulomb. */
	public final static Unit Microcoulomb;

	public final static Unit KilocolonyFormingUnitPerMillilitre;

	public final static Unit Megamole;

	public final static Unit Petavolt;

	public final static Unit WattPerNanometre;

	public final static Unit Yoctoradian;

	public final static Unit Decalumen;

	/** The US liquid quart is a unit of volume defined as 9.463529e-4 cubic metre. */
	public final static Unit LiquidQuartUS;

	/** De eenheid van de Hubble constante (die niet constant is!) (http://en.wikipedia.org/wiki/Hubble_constant). */
	public final static Unit KilometrePerSecondTimePerMegaparsec;

	public final static Unit MegaeuroPerMegawatt;

	public final static Unit CubicKilometre;

	/** The centikatal is a unit of catalytic activity defined as 1.0e-2 katal. */
	public final static Unit Centikatal;

	/** The petacoulomb is a unit of electric charge defined as 1.0e15 coulomb. */
	public final static Unit Petacoulomb;

	public final static Unit Hectovolt;

	public final static Unit Kilovolt;

	public final static Unit Terasiemens;

	/** Gram per petalitre is a unit of density defined as gram divided by petalitre. */
	public final static Unit GramPerPetalitre;

	/** The amount of stellar mass created per cubic parsec in each billion years. */
	public final static Unit SolarMassPerGigayearCubicParsec;

	/** The exagray is a unit of absorbed dose defined as 1.0e18 gray. */
	public final static Unit Exagray;

	/** The brightness (in magnitudes) of an area on the celestial sphere of 1 arcsecond by 1 arcsecond. */
	public final static Unit MagnitudePerSecondPlaneAngleSquared;

	/** Mole per centilitre is a unit of amount of substance concentration defined as mole divided by centilitre. */
	public final static Unit MolePerCentilitre;

	public final static Unit Megalitre;

	public final static Unit Attolumen;

	/** Metre per kilosecond is a unit of speed defined as metre divided by kilosecond. */
	public final static Unit MetrePerKilosecondTime;

	/** The kelvin is a unit of temperature defined as 1/273.16 of the thermodynamic temperature of the triple point of water. */
	public final static Unit Kelvin;

	public final static Unit Zettalux;

	/** The exagram is a unit of mass defined as 1.0e18 gram. */
	public final static Unit Exagram;

	/** The EC therm is a unit of energy defined as 1.05506e8 joule. */
	public final static Unit ThermEC;

	/** Mole per cubic metre is a unit of amount of substance concentration defined as mole divided by cubic metre. */
	public final static Unit MolePerCubicMetre;

	/** Hectogram per litre is a unit of density defined as hectogram divided by litre. */
	public final static Unit HectogramPerLitre;

	/** The kilofarad is a unit of capacitance defined as 1.0e3 farad. */
	public final static Unit Kilofarad;

	/** The US fluid ounce is a unit of volume defined as 2.957353e-5 cubic metre. */
	public final static Unit FluidOunceUS;

	/** The megamolair is a unit of amount of substance concentration defined as 1.0e6 molair. */
	public final static Unit Megamolair;

	public final static Unit Decawatt;

	public final static Unit Kilobit;

	public final static Unit ExamolePerMetre;

	public final static Unit Terasievert;

	public final static Unit SquareMetreKelvin;

	public final static Unit Petaweber;

	public final static Unit CubicCentimetrePerCubicCentimetre;

	public final static Unit Zettawatt;

	public final static Unit GramPerGram;

	/** Decametre per second squared is a unit of acceleration defined as decametre divided by second squared. */
	public final static Unit DecametrePerSecondTimeSquared;

	/** The erg is a unit of energy defined as 1.0e-7 joule. */
	public final static Unit Erg;

	/** The femtojoule is a unit of energy defined as 1.0e-15 joule. */
	public final static Unit Femtojoule;

	public final static Unit Hectolux;

	public final static Unit MolePerSecondTime;

	/** Metre per petasecond is a unit of speed defined as metre divided by petasecond. */
	public final static Unit MetrePerPetasecondTime;

	public final static Unit Hectopascal;

	public final static Unit PetasecondTime;

	/** Candela per square metre is a unit of luminance defined as candela divided by square metre. */
	public final static Unit CandelaPerSquareMetre;

	/** Yoctometre per second is a unit of speed defined as yoctometre divided by second. */
	public final static Unit YoctometrePerSecondTime;

	public final static Unit Milliradian;

	public final static Unit ExasecondTime;

	/** The radiative intensity (in watts) of an area on the celestial sphere of 1 arcsecond by 1 arcsecond. */
	public final static Unit WattPerSecondPlaneAngleSquared;

	public final static Unit Megalux;

	/** Terametre per second is a unit of speed defined as terametre divided by second. */
	public final static Unit TerametrePerSecondTime;

	/** The farad is a unit of capacitance defined as ampere times second divided by volt = coulomb divided by volt = coulomb squared divided by joule = coulomb squared divided by newton times metre = second squared times coulomb squared divided by square metre times kilogram = second to the power 4 times ampere squared divided by square metre times kilogram. */
	public final static Unit Farad;

	public final static Unit GramPerSquareMetreSecondTime;

	/** The unified atomic mass unit is a unit of mass defined as 1.660538782(83)e-27 kilogram. */
	public final static Unit UnifiedAtomicMassUnit;

	/** Yoctogram per litre is a unit of density defined as yoctogram divided by litre. */
	public final static Unit YoctogramPerLitre;

	public final static Unit DecasecondTime;

	/** The decamolair is a unit of amount of substance concentration defined as 1.0e1 molair. */
	public final static Unit Decamolair;

	public final static Unit MegaeuroPerMegatonne;

	/** The candela is a unit of luminous intensity defined as the luminous intensity, in a given direction, of a source that emits monochromatic radiation of frequency 540e12 hertz and that has a radiant intensity in that direction of 1/683 watt per steradian. */
	public final static Unit Candela;

	public final static Unit HectomolePerMetre;

	public final static Unit Zettaweber;

	public final static Unit JoulePerSquareMetreDay;

	/** Metre per decasecond squared is a unit of acceleration defined as metre divided by decasecond squared. */
	public final static Unit MetrePerDecasecondTimeSquared;

	/** The poise is a unit of dynamic viscosity defined as 1.0e-1 pascal second (time). */
	public final static Unit Poise;

	public final static Unit MicrogramPerSquareMetreSecondTime;

	/** The nanohertz is a unit of frequency defined as 1.0e-9 hertz. */
	public final static Unit Nanohertz;

	public final static Unit PascalSecondTime;

	/** The hectoampere is a unit of electric current defined as 1.0e2 ampere. */
	public final static Unit Hectoampere;

	/** The acre foot is a unit of volume defined as 1.233489e3 cubic metre. */
	public final static Unit AcreFoot;

	/** The joule is a unit of energy defined as kilogram times square metre divided by second squared. */
	public final static Unit Joule;

	/** The thermochemical calorie is a unit of energy defined as 4.184 joule. */
	public final static Unit CalorieThermochemical;

	public final static Unit MetreKilogramPerSecondTime;

	/** The kilocoulomb is a unit of electric charge defined as 1.0e3 coulomb. */
	public final static Unit Kilocoulomb;

	/** The hectofarad is a unit of capacitance defined as 1.0e2 farad. */
	public final static Unit Hectofarad;

	/** The millikatal is a unit of catalytic activity defined as 1.0e-3 katal. */
	public final static Unit Millikatal;

	/** Decimetre per second squared is a unit of acceleration defined as decimetre divided by second squared. */
	public final static Unit DecimetrePerSecondTimeSquared;

	public final static Unit CentisecondTimeSquared;

	public final static Unit IndianRupee;

	public final static Unit BitPerSecondTime;

	public final static Unit Exaohm;

	/** The maxwell is a unit of magnetic flux defined as 1.0e-8 weber. */
	public final static Unit Maxwell;

	/** The hectojoule is a unit of energy defined as 1.0e2 joule. */
	public final static Unit Hectojoule;

	public final static Unit Picosievert;

	public final static Unit SecondTimePerSquareMetre;

	public final static Unit Millitesla;

	/** The yottafarad is a unit of capacitance defined as 1.0e24 farad. */
	public final static Unit Yottafarad;

	/** Metre per zeptosecond squared is a unit of acceleration defined as metre divided by zeptosecond squared. */
	public final static Unit MetrePerZeptosecondTimeSquared;

	/** The abmho is a unit of electrical conductance defined as 1.0e9 siemens. */
	public final static Unit Abmho;

	/** Centimetre per second squared is a unit of acceleration defined as centimetre divided by second squared. */
	public final static Unit CentimetrePerSecondTimeSquared;

	/** The kilojoule is a unit of energy defined as 1.0e3 joule. */
	public final static Unit Kilojoule;

	/** Mole per decilitre is a unit of amount of substance concentration defined as mole divided by decilitre. */
	public final static Unit MolePerDecilitre;

	public final static Unit WattPerMetreKelvin;

	/** The centiampere is a unit of electric current defined as 1.0e-2 ampere. */
	public final static Unit Centiampere;

	/** The hectogray is a unit of absorbed dose defined as 1.0e2 gray. */
	public final static Unit Hectogray;

	/** Picometre per second squared is a unit of acceleration defined as picometre divided by second squared. */
	public final static Unit PicometrePerSecondTimeSquared;

	public final static Unit Hectomole;

	public final static Unit Kilomole;

	/** The milligauss is a unit of magnetic flux density defined as 1.0e-3 gauss. */
	public final static Unit Milligauss;

	/** The petakatal is a unit of catalytic activity defined as 1.0e15 katal. */
	public final static Unit Petakatal;

	/** The rod is a unit of length defined as 5.029210 metre. */
	public final static Unit Rod;

	/** The femtometre is a unit of length defined as 1.0e-15 metre. */
	public final static Unit Femtometre;

	/** The nanohenry is a unit of inductance defined as 1.0e-9 henry. */
	public final static Unit Nanohenry;

	/** The picodegree Celsius is a unit of temperature defined as 1.0e-12 degree Celsius. */
	public final static Unit PicodegreeCelsius;

	public final static Unit PetasecondTimeSquared;

	/** The zettagray is a unit of absorbed dose defined as 1.0e21 gray. */
	public final static Unit Zettagray;

	/** The stokes is a unit of kinematic viscosity defined as 1.0e-4 square metre per second (time). */
	public final static Unit Stokes;

	/** The yoctokelvin is a unit of temperature defined as 1.0e-24 kelvin. */
	public final static Unit Yoctokelvin;

	public final static Unit MolePerYoctometre;

	/** The petabecquerel is a unit of activity defined as 1.0e15 becquerel. */
	public final static Unit Petabecquerel;

	public final static Unit Petawatt;

	public final static Unit Decinewton;

	public final static Unit Attolux;

	/** The picomolair is a unit of amount of substance concentration defined as 1.0e-12 molair. */
	public final static Unit Picomolair;

	public final static Unit FemtosecondTime;

	/** The zettagram is a unit of mass defined as 1.0e21 gram. */
	public final static Unit Zettagram;

	/** The zettamolair is a unit of amount of substance concentration defined as 1.0e21 molair. */
	public final static Unit Zettamolair;

	/** The pennyweight is a unit of mass defined as 1.555174e-3 kilogram. */
	public final static Unit Pennyweight;

	/** The teraampere is a unit of electric current defined as 1.0e12 ampere. */
	public final static Unit Teraampere;

	public final static Unit Centilux;

	/** The decahenry is a unit of inductance defined as 1.0e1 henry. */
	public final static Unit Decahenry;

	/** The gigamolair is a unit of amount of substance concentration defined as 1.0e9 molair. */
	public final static Unit Gigamolair;

	/** The millimagnitude is a unit of magnitude defined as 1.0e-3 magnitude. */
	public final static Unit Millimagnitude;

	public final static Unit Picosiemens;

	public final static Unit MexicanPeso;

	/** The femtofarad is a unit of capacitance defined as 1.0e-15 farad. */
	public final static Unit Femtofarad;

	public final static Unit Kilowatt;

	public final static Unit VoltPerMetre;

	public final static Unit Decasiemens;

	/** Solar mass is a unit used in astronomy to denote stellar or galactic masses (http://en.wikipedia.org/wiki/Solar_mass). */
	public final static Unit SolarMass;

	public final static Unit Decalux;

	public final static Unit Megatonne;

	public final static Unit SwedishKrona;

	public final static Unit Examole;

	/** The phot is a unit of illuminance defined as 1.0e4 lux. */
	public final static Unit Phot;

	/** Metre per nanosecond squared is a unit of acceleration defined as metre divided by nanosecond squared. */
	public final static Unit MetrePerNanosecondTimeSquared;

	public final static Unit Exawatt;

	/** Kilogram per gigajoule is a unit of energy consumption. */
	public final static Unit KilogramPerGigajoule;

	/** Gram per gigalitre is a unit of density defined as gram divided by gigalitre. */
	public final static Unit GramPerGigalitre;

	/** Terametre per second squared is a unit of acceleration defined as terametre divided by second squared. */
	public final static Unit TerametrePerSecondTimeSquared;

	public final static Unit Zeptonewton;

	/** The petakelvin is a unit of thermodynamic temperature defined as 1.0e15 kelvin. */
	public final static Unit Petakelvin;

	/** The zeptdegree Celsius is a unit of temperature defined as 1.0e-21 degree Celsius. */
	public final static Unit ZeptodegreeCelsius;

	public final static Unit Femtosievert;

	public final static Unit CubicYoctometre;

	/** The hectogram is a unit of mass defined as 1.0e2 gram. */
	public final static Unit Hectogram;

	public final static Unit Zettamole;

	public final static Unit KelvinMole;

	public final static Unit TeramolePerMetre;

	public final static Unit MicromolePerSecondTimeGram;

	/** Nanometre per second is a unit of speed defined as nanometre divided by second. */
	public final static Unit NanometrePerSecondTime;

	public final static Unit Zebibyte;

	/** The kilocalorie (mean) is a unit of energy defined as 1.0e3 calorie (mean). */
	public final static Unit KilocalorieMean;

	/** The barye is a unit of pressure defined as 0.1 pascal. */
	public final static Unit Barye;

	/** The millidegree Celsius is a unit of temperature defined as 1.0e-3 degree Celsius. */
	public final static Unit MillidegreeCelsius;

	public final static Unit Yoctonewton;

	public final static Unit MicronewtonMetre;

	/** Exametre per second is a unit of speed defined as exametre divided by second. */
	public final static Unit ExametrePerSecondTime;

	/** Zeptometre per second is a unit of speed defined as zeptometre divided by second. */
	public final static Unit ZeptometrePerSecondTime;

	public final static Unit DegreeCelsiusPerSecondTime;

	public final static Scale ReaumurScale;

	/** The faraday is a unit of electric charge defined as 9.648531e4 coulomb. */
	public final static Unit Faraday;

	/** The terakelvin is a unit of thermodynamic temperature defined as 1.0e12 kelvin. */
	public final static Unit Terakelvin;

	public final static Unit MetrePerMetre;

	/** The franklin is a unit of electric charge defined as 3.335641e-10 coulomb. */
	public final static Unit Franklin;

	public final static Unit MolePerFemtometre;

	public final static Unit GramPerSquareMetreMetre;

	public final static Unit GigasecondTimeSquared;

	/** The femtohertz is a unit of frequency defined as 1.0e-15 hertz. */
	public final static Unit Femtohertz;

	public final static Unit CubicMicrometre;

	public final static Unit ReciprocalCubicCentimetre;

	public final static Unit HongKongDollar;

	public final static Unit Exaweber;

	public final static Unit Femtotesla;

	public final static Unit Centilumen;

	public final static Unit Tebibit;

	/** The zeptometre is a unit of length defined as 1.0e-21 metre. */
	public final static Unit Zeptometre;

	public final static Unit AttomolePerMetre;

	public final static Unit Zettavolt;

	/** The abohm is a unit of electrical resistance defined as 1.0e-9 ohm. */
	public final static Unit Abohm;

	/** The decigram is a unit of mass defined as 1.0e-1 gram. */
	public final static Unit Decigram;

	public final static Unit MolePerMole;

	public final static Unit Zeptosievert;

	/** The femtocoulomb is a unit of electric charge defined as 1.0e-15 coulomb. */
	public final static Unit Femtocoulomb;

	public final static Unit Zettabit;

	/** The gigahertz is a unit of frequency defined as 1.0e9 hertz. */
	public final static Unit Gigahertz;

	public final static Unit MegajoulePerSquareMetreDay;

	/** Gram per exalitre is a unit of density defined as gram divided by exalitre. */
	public final static Unit GramPerExalitre;

	/** Zeptometre per second squared is a unit of acceleration defined as zeptometre divided by second squared. */
	public final static Unit ZeptometrePerSecondTimeSquared;

	/** The cup is a unit of volume defined as 2.365882e-4 cubic metre. */
	public final static Unit Cup;

	public final static Unit SquarePicometre;

	/** The US survey mile is a unit of length defined as 1.609347e3 metre. */
	public final static Unit MileUSSurvey;

	/** The shake is a unit of time defined as 1.0e-8 second. */
	public final static Unit Shake;

	public final static Unit Teranewton;

	/** The hour is a unit of time defined as 3600 second. */
	public final static Unit Hour;

	/** The decigray is a unit of absorbed dose defined as 1.0e-1 gray. */
	public final static Unit Decigray;

	public final static Unit CubicMetrePerMole;

	/** Nanogram per litre is a unit of density defined as nanogram divided by litre. */
	public final static Unit NanogramPerLitre;

	/** Wordt gebruikt als hoek (360°=24) voor o.a. rechte klimming. De h wordt meestal als superscript achter de waarde gezet gevolgd door de verdere opdeling naar minuten en seconden. Zoals in 5h34m12s09. Vaak wordt de fractie in seconden zonder punt geschreven, de s wordt als afscheiding gebruikt (http://en.wikipedia.org/wiki/Right_ascension). */
	public final static Unit HourHourAngle;

	/** The millibecquerel is a unit of activity defined as 1.0e-3 becquerel. */
	public final static Unit Millibecquerel;

	public final static Unit Picotesla;

	/** Metre per hectosecond is a unit of speed defined as metre divided by hectosecond. */
	public final static Unit MetrePerHectosecondTime;

	public final static Unit Microweber;

	/** The are is a unit of area defined as 100 square metre. */
	public final static Unit Are;

	public final static Unit MetreToThePower2ReciprocalMetre;

	public final static Unit MoleMicrometreReciprocalSquareCentimetre;

	public final static Unit Yottamole;

	public final static Unit Zeptosiemens;

	public final static Unit Attoradian;

	public final static Unit Decisteradian;

	public final static Unit Pebibyte;

	public final static Unit MolePerHectometre;

	public final static Unit Megabyte;

	/** Wordt gebruikt om de waargenomen verandering van de positie van sterren uit te drukken (de proper motion). */
	public final static Unit MillisecondPlaneAnglePerYear;

	/** The decafarad is a unit of capacitance defined as 1.0e1 farad. */
	public final static Unit Decafarad;

	/** Gram per zeptolitre is a unit of density defined as gram divided by zeptolitre. */
	public final static Unit GramPerZeptolitre;

	public final static Unit UnitedStatesDollar;

	public final static Unit Tebibyte;

	/** The picokelvin is a unit of temperature defined as 1.0e-12 kelvin. */
	public final static Unit Picokelvin;

	/** The petametre is a unit of length defined as 1.0e15 metre. */
	public final static Unit Petametre;

	public final static Unit CoulombPerVolt;

	public final static Unit Hectowatt;

	public final static Unit WattPerCubicMetre;

	/** Megametre per second squared is a unit of acceleration defined as megametre divided by second squared. */
	public final static Unit MegametrePerSecondTimeSquared;

	/** Mole per gigalitre is a unit of amount of substance concentration defined as mole divided by gigalitre. */
	public final static Unit MolePerGigalitre;

	public final static Unit WattPerAmpere;

	public final static Unit Kibibyte;

	/** The microkatal is a unit of catalytic activity defined as 1.0e-6 katal. */
	public final static Unit Microkatal;

	/** The petajoule is a unit of energy defined as 1.0e15 joule. */
	public final static Unit Petajoule;

	public final static Unit HenryPerMetre;

	public final static Unit Picosteradian;

	/** Millimole per litre is a unit of amount of substance concentration defined as millimole divided by litre. */
	public final static Unit MillimolePerLitre;

	/** The hectometre is a unit of length defined as 1.0e2 metre. */
	public final static Unit Hectometre;

	/** The ATA pica is a unit of length defined as 12 point (ATA). */
	public final static Unit PicaATA;

	public final static Unit JoulePerKelvinMole;

	/** The decikatal is a unit of catalytic activity defined as 1.0e-1 katal. */
	public final static Unit Decikatal;

	public final static Unit Megapascal;

	/** The millimolair is a unit of amount of substance concentration defined as 1.0e-3 molair. */
	public final static Unit Millimolair;

	/** The teramolair is a unit of amount of substance concentration defined as 1.0e12 molair. */
	public final static Unit Teramolair;

	public final static Unit PicomolePerMetre;

	public final static Unit Deciweber;

	/** The micromolair is a unit of amount of substance concentration defined as 1.0e-6 molair. */
	public final static Unit Micromolair;

	public final static Unit Decimole;

	/** The exakatal is a unit of catalytic activity defined as 1.0e18 katal. */
	public final static Unit Exakatal;

	public final static Unit JoulePerMole;

	/** Gram per hectolitre is a unit of density defined as gram divided by hectolitre. */
	public final static Unit GramPerHectolitre;

	/** The attocandela is a unit of luminous intensity defined as 1.0e-18 candela. */
	public final static Unit Attocandela;

	public final static Unit MoleMicrometreReciprocalSquareCentimetreReciprocalSecondTime;

	public final static Unit Yottawatt;

	/** The decabecquerel is a unit of activity defined as 1.0e1 becquerel. */
	public final static Unit Decabecquerel;

	/** The nanoampere is a unit of electric current defined as 1.0e-9 ampere. */
	public final static Unit Nanoampere;

	/** Metre per millisecond is a unit of speed defined as metre divided by millisecond. */
	public final static Unit MetrePerMillisecondTime;

	public final static Unit Microlux;

	/** Cubic metre is a unit of volume defined as the volume of a cube whose sides measure exactly one metre. */
	public final static Unit CubicMetre;

	public final static Unit Decanewton;

	/** The microbar is a unit of pressure defined as 1.0e-6 bar. */
	public final static Unit Microbar;

	/** The femtoampere is a unit of electric current defined as 1.0e-15 ampere. */
	public final static Unit Femtoampere;

	public final static Unit LitrePerHour;

	public final static Unit PartsPerMillionPerYear;

	public final static Unit WeberPerSquareMetre;

	/** The litre is a unit of volume defined as 1.0e-3 cubic metre. */
	public final static Unit Litre;

	/** The picometre is a unit of length defined as 1.0e-12 metre. */
	public final static Unit Picometre;

	/** The knot is a unit of speed defined as nautical mile per hour. */
	public final static Unit Knot;

	public final static Unit SquareMetreNanometre;

	public final static Unit WattPerSteradian;

	/** The zeptjoule is a unit of energy defined as 1.0e-21 joule. */
	public final static Unit Zeptojoule;

	public final static Unit Centilitre;

	public final static Unit MetreKilogram;

	/** The femtobecquerel is a unit of activity defined as 1.0e-15 becquerel. */
	public final static Unit Femtobecquerel;

	/** Metre per exasecond is a unit of speed defined as metre divided by exasecond. */
	public final static Unit MetrePerExasecondTime;

	/** The gigacandela is a unit of luminous intensity defined as 1.0e9 candela. */
	public final static Unit Gigacandela;

	public final static Unit Yottalumen;

	public final static Unit GramPerMegajoule;

	/** The teracandela is a unit of luminous intensity defined as 1.0e12 candela. */
	public final static Unit Teracandela;

	public final static Unit MetrePerSecondTimePerMetre;

	/** Metre per decisecond is a unit of speed defined as metre divided by decisecond. */
	public final static Unit MetrePerDecisecondTime;

	/** The water horsepower is a unit of power defined as 7.46043e2 watt. */
	public final static Unit HorsepowerWater;

	public final static Unit CubicMetrePerCubicMetre;

	public final static Unit KilomolePerMetre;

	public final static Unit DegreeCelsiusDay;

	/** The sidereal minute is a unit of time defined as 5.983617e1 second. */
	public final static Unit MinuteSidereal;

	/** The abcoulomb is a unit of electric charge defined as 10 coulomb. */
	public final static Unit Abcoulomb;

	public final static Unit ZettasecondTimeSquared;

	public final static Unit Yoctolumen;

	public final static Unit ReciprocalGram;

	/** The microfarad is a unit of capacitance defined as 1.0e-6 farad. */
	public final static Unit Microfarad;

	public final static Unit KilowattHour;

	public final static Unit Petatesla;

	/** The carat (mass) is a unit of mass defined as 2.0e-4 kilogram. */
	public final static Unit CaratMass;

	/** Microgram per litre is a unit of density defined as microgram divided by litre. */
	public final static Unit MicrogramPerLitre;

	public final static Unit YottasecondTime;

	public final static Unit MolePerZeptometre;

	/** The zettahenry is a unit of inductance defined as 1.0e21 henry. */
	public final static Unit Zettahenry;

	/** The boiler horsepower is a unit of power defined as 9.80950e3 watt. */
	public final static Unit HorsepowerBoiler;

	/** Solar radius is a unit used in astronomy to denote stellar or stellar system radii (http://en.wikipedia.org/wiki/Solar_radius). */
	public final static Unit SolarRadius;

	/** Milligram per litre is a unit of density defined as milligram divided by litre. */
	public final static Unit MilligramPerLitre;

	/** Attometre per second is a unit of speed defined as attometre divided by second. */
	public final static Unit AttometrePerSecondTime;

	/** The barn is a unit of area defined as 1.0e-28 square metre. */
	public final static Unit Barn;

	public final static Unit KilogramPerHectareDay;

	/** Mole per kilolitre is a unit of amount of substance concentration defined as mole divided by kilolitre. */
	public final static Unit MolePerKilolitre;

	/** The millihenry is a unit of inductance defined as 1.0e-3 henry. */
	public final static Unit Millihenry;

	public final static Unit Terabit;

	public final static Unit Nanotesla;

	public final static Unit JoulePerSquareMetreSecondTime;

	/** The tropical year is a unit of time defined as 3.155693e7 second. */
	public final static Unit YearTropical;

	public final static Unit Yottapascal;

	/** The US liquid pint is a unit of volume defined as 4.731765e-4 cubic metre. */
	public final static Unit LiquidPintUS;

	/** The attofarad is a unit of capacitance defined as 1.0e-18 farad. */
	public final static Unit Attofarad;

	public final static Unit Decivolt;

	/** The picocandela is a unit of luminous intensity defined as 1.0e-12 candela. */
	public final static Unit Picocandela;

	public final static Unit N25Millilitre;

	/** The megacandela is a unit of luminous intensity defined as 1.0e6 candela. */
	public final static Unit Megacandela;

	public final static Unit Kilosievert;

	/** The nanomolair is a unit of amount of substance concentration defined as 1.0e-9 molair. */
	public final static Unit Nanomolair;

	public final static Unit Megalumen;

	/** The femtokelvin is a unit of temperature defined as 1.0e-15 kelvin. */
	public final static Unit Femtokelvin;

	/** The microcandela is a unit of luminous intensity defined as 1.0e-6 candela. */
	public final static Unit Microcandela;

	/** Centimetre per day is a unit of speed defined as centimetre divided by day. */
	public final static Unit CentimetrePerDay;

	/** Nanomole per litre is a unit of amount of substance concentration defined as nanomole divided by litre. */
	public final static Unit NanomolePerLitre;

	/** The minute (time) is a unit of time defined as 60 second. */
	public final static Unit MinuteTime;

	/** The abhenry is a unit of inductance defined as 1.0e-9 henry. */
	public final static Unit Abhenry;

	public final static Unit Teralitre;

	/** Gram per decilitre is a unit of density defined as gram divided by decilitre. */
	public final static Unit GramPerDecilitre;

	public final static Unit Nanolumen;

	public final static Unit Zeptotesla;

	public final static Unit SquareZeptometre;

	public final static Unit Attolitre;

	public final static Unit MolePerDecametre;

	/** The pint is a unit of volume defined as 568.26125 millilitre. */
	public final static Unit PintImperial;

	/** The decidegree Celsius is a unit of temperature defined as 1.0e-1 degree Celsius. */
	public final static Unit DecidegreeCelsius;

	/** The tonne is a unit of mass defined as 1000 kilogram. */
	public final static Unit Tonne;

	/** Mole per megalitre is a unit of amount of substance concentration defined as mole divided by megalitre. */
	public final static Unit MolePerMegalitre;

	public final static Unit Yobibit;

	/** The electric horsepower is a unit of power defined as 7.46e2 watt. */
	public final static Unit HorsepowerElectric;

	public final static Unit Zeptosteradian;

	public final static Unit MegaeuroPerPetajoule;

	/** The millicandela is a unit of luminous intensity defined as 1.0e-3 candela. */
	public final static Unit Millicandela;

	public final static Unit ReciprocalWatt;

	public final static Unit CentisecondTime;

	public final static Unit SecondPlaneAngleSquared;

	public final static Unit Zettabyte;

	/** Gigametre per second is a unit of speed defined as gigametre divided by second. */
	public final static Unit GigametrePerSecondTime;

	public final static Unit Nanolitre;

	public final static Unit Millinewton;

	public final static Unit MetreToThePower2ReciprocalGram;

	public final static Unit WattPerSquareMetre;

	public final static Unit KilogramPerKilogram;

	public final static Unit Decalitre;

	/** The decaampere is a unit of electric current defined as 1.0e1 ampere. */
	public final static Unit Decaampere;

	public final static Unit NewtonPerSquareMetre;

	public final static Unit DeltaA450PerSecondTime;

	/** The degree is a unit of plane angle defined as 1.745329e-2 radian. */
	public final static Unit Degree;

	/** Metre per day is a unit of speed defined as metre divided by day. */
	public final static Unit MetrePerDay;

	public final static Unit CoulombMetre;

	/** Millimetre per second is a unit of speed defined as millimetre divided by second. */
	public final static Unit MillimetrePerSecondTime;

	public final static Unit GramPerSquareMetreCentimetre;

	/** Decimetre per second is a unit of speed defined as decimetre divided by second. */
	public final static Unit DecimetrePerSecondTime;

	public final static Unit Euro;

	/** The megagray is a unit of absorbed dose defined as 1.0e6 gray. */
	public final static Unit Megagray;

	/** The lambert is a unit of luminance defined as 3.183099e3 candela per square metre. */
	public final static Unit Lambert;

	/** The baud is a unit of symbol rate defined as one distinct symbol change or signalling event made to the transmission medium per second in a digitally modulated signal or a line code. */
	public final static Unit Baud;

	public final static Unit CubicDecimetre;

	public final static Unit Femtovolt;

	/** The megagram is a unit of mass defined as 1.0e6 gram. */
	public final static Unit Megagram;

	public final static Unit JoulePerSecondTime;

	/** The centihertz is a unit of frequency defined as 1.0e-2 hertz. */
	public final static Unit Centihertz;

	public final static Unit Gibibit;

	/** Metre per kilosecond squared is a unit of acceleration defined as metre divided by kilosecond squared. */
	public final static Unit MetrePerKilosecondTimeSquared;

	public final static Unit Femtolumen;

	/** The picoampere is a unit of electric current defined as 1.0e-12 ampere. */
	public final static Unit Picoampere;

	public final static Unit SquarePetametre;

	/** The Imperial fluid ounce is a unit of volume defined as 2.841306e-5 cubic metre. */
	public final static Unit FluidOunceImperial;

	/** Megagram per litre is a unit of density defined as megagram divided by litre. */
	public final static Unit MegagramPerLitre;

	public final static Unit Microsievert;

	public final static Unit Yoctolux;

	/** Gram per kilolitre is a unit of density defined as gram divided by kilolitre. */
	public final static Unit GramPerKilolitre;

	public final static Unit CubicPetametre;

	public final static Unit Mebibyte;

	/** The kilobecquerel is a unit of activity defined as 1.0e3 becquerel. */
	public final static Unit Kilobecquerel;

	/** The degree Rankine is a unit of temperature defined as 5.555556e-1 kelvin. */
	public final static Unit DegreeRankine;

	/** Millimetre per second squared is a unit of acceleration defined as millimetre divided by second squared. */
	public final static Unit MillimetrePerSecondTimeSquared;

	public final static Unit MolePerTerametre;

	public final static Unit Attopascal;

	/** The zettakatal is a unit of catalytic activity defined as 1.0e21 katal. */
	public final static Unit Zettakatal;

	/** Decimole per litre is a unit of amount of substance concentration defined as decimole divided by litre. */
	public final static Unit DecimolePerLitre;

	/** The gigahenry is a unit of inductance defined as 1.0e9 henry. */
	public final static Unit Gigahenry;

	public final static Unit MilligramPerHectogram;

	/** Gram per microlitre is a unit of density defined as gram divided by microlitre. */
	public final static Unit GramPerMicrolitre;

	/** The becquerel is a unit of activity defined as the activity of a quantity of radioactive material in which one nucleus decays per second. Algebraically it is defined as 1 divided by second. */
	public final static Unit Becquerel;

	/** Mole per yottalitre is a unit of amount of substance concentration defined as mole divided by yottalitre. */
	public final static Unit MolePerYottalitre;

	/** The microsecond (plane angle) is a unit of length defined as 1.0e-6 second (plane angle). Gebruikt in de astronomie (metingen van posities van sterren/sterrenstelsels etc.) om de fout weer te geven. De nieuwe satellieten zijn zo nauwkeurig dat deze fout mogelijk is geworden (GAIA-satelliet). */
	public final static Unit MicrosecondPlaneAngle;

	/** The nanokelvin is a unit of temperature defined as 1.0e-9 kelvin. */
	public final static Unit Nanokelvin;

	/** The Postscript pica is a unit of length defined as 12 point (Postscript). */
	public final static Unit PicaPostscript;

	public final static Unit GrayPerSecondTime;

	/** The zeptfarad is a unit of capacitance defined as 1.0e-21 farad. */
	public final static Unit Zeptofarad;

	/** Hectomole per litre is a unit of amount of substance concentration defined as hectomole divided by litre. */
	public final static Unit HectomolePerLitre;

	public final static Unit Teraohm;

	public final static Unit Megavolt;

	/** Micromole per litre is a unit of amount of substance concentration defined as micromole divided by litre. */
	public final static Unit MicromolePerLitre;

	/** The megahertz is a unit of frequency defined as 1.0e6 hertz. */
	public final static Unit Megahertz;

	/** Nanometre per second squared is a unit of acceleration defined as nanometre divided by second squared. */
	public final static Unit NanometrePerSecondTimeSquared;

	/** Decamole per litre is a unit of amount of substance concentration defined as decamole divided by litre. */
	public final static Unit DecamolePerLitre;

	/** The femtomolair is a unit of amount of substance concentration defined as 1.0e-15 molair. */
	public final static Unit Femtomolair;

	/** Metre per picosecond squared is a unit of acceleration defined as metre divided by picosecond squared. */
	public final static Unit MetrePerPicosecondTimeSquared;

	/** The gigakelvin is a unit of thermodynamic temperature defined as 1.0e9 kelvin. */
	public final static Unit Gigakelvin;

	public final static Unit CubicZeptometre;

	/** The mass (in solar masses) per cubic parsec. */
	public final static Unit SolarMassPerCubicParsec;

	public final static Unit MegamolePerMetre;

	/** The 59 °F British thermal unit is a unit of energy defined as 1.05480e3 joule. */
	public final static Unit BritishThermalUnit59F;

	/** The day is a unit of time defined as 86400 second. */
	public final static Unit Day;

	public final static Unit Centiohm;

	/** The attocoulomb is a unit of electric charge defined as 1.0e-18 coulomb. */
	public final static Unit Attocoulomb;

	public final static Unit Mebibit;

	public final static Unit Hectoohm;

	/** The kilocandela is a unit of luminous intensity defined as 1.0e3 candela. */
	public final static Unit Kilocandela;

	/** The kilokelvin is a unit of thermodynamic temperature defined as 1.0e3 kelvin. */
	public final static Unit Kilokelvin;

	/** The yottacoulomb is a unit of electric charge defined as 1.0e24 coulomb. */
	public final static Unit Yottacoulomb;

	/** The zettacoulomb is a unit of electric charge defined as 1.0e21 coulomb. */
	public final static Unit Zettacoulomb;

	/** Micrometre per second squared is a unit of acceleration defined as micrometre divided by second squared. */
	public final static Unit MicrometrePerSecondTimeSquared;

	/** The microampere is a unit of electric current defined as 1.0e-6 ampere. */
	public final static Unit Microampere;

	/** The technical atmosphere is a unit of pressure defined as 9.80665e4 pascal. */
	public final static Unit AtmosphereTechnical;

	/** The gigaampere is a unit of electric current defined as 1.0e9 ampere. */
	public final static Unit Gigaampere;

	public final static Unit Kilonewton;

	/** The millihertz is a unit of frequency defined as 1.0e-3 hertz. */
	public final static Unit Millihertz;

	public final static Unit Microsiemens;

	public final static Unit Millisiemens;

	/** Molair is a unit of amount of substance concentration defined as 1 mole per litre. */
	public final static Unit Molair;

	public final static Unit Pebibit;

	public final static Unit Femtolitre;

	public final static Unit ColonyFormingUnitPer25Millilitre;

	/** Metre per microsecond is a unit of speed defined as metre divided by microsecond. */
	public final static Unit MetrePerMicrosecondTime;

	public final static Unit ExasecondTimeSquared;

	public final static Scale FahrenheitScale;

	/** The British hundredweight is a unit of mass defined as 5.080235e1 kilogram. */
	public final static Unit HundredweightBritish;

	public final static Unit HourSidereal;

	/** Yottametre per second squared is a unit of acceleration defined as yottametre divided by second squared. */
	public final static Unit YottametrePerSecondTimeSquared;

	/** The terahertz is a unit of frequency defined as 1.0e12 hertz. */
	public final static Unit Terahertz;

	public final static Unit KilogramSecondTimeToThePower2;

	/** Decigram per litre is a unit of density defined as decigram divided by litre. */
	public final static Unit DecigramPerLitre;

	/** The yoctocandela is a unit of luminous intensity defined as 1.0e-24 candela. */
	public final static Unit Yoctocandela;

	/** The cord is a unit of volume defined as 3.624556 cubic metre. */
	public final static Unit Cord;

	public final static Unit CoulombPerCubicMetre;

	public final static Unit Micronewton;

	public final static Unit MetrePerCubicMetre;

	/** Picogram per litre is a unit of density defined as picogram divided by litre. */
	public final static Unit PicogramPerLitre;

	/** The petafarad is a unit of capacitance defined as 1.0e15 farad. */
	public final static Unit Petafarad;

	/** The kilokatal is a unit of catalytic activity defined as 1.0e3 katal. */
	public final static Unit Kilokatal;

	public final static Unit Teralumen;

	public final static Unit GramPerKilogram;

	public final static Unit SwissFranc;

	/** The megaparsec is a unit of length defined as 1.0e6 parsec. Gebruikt voor afstanden op de schaal van clusters. */
	public final static Unit Megaparsec;

	/** Mole per yoctolitre is a unit of amount of substance concentration defined as mole divided by yoctolitre. */
	public final static Unit MolePerYoctolitre;

	/** Metre per zettasecond squared is a unit of acceleration defined as metre divided by zettasecond squared. */
	public final static Unit MetrePerZettasecondTimeSquared;

	/** The megahenry is a unit of inductance defined as 1.0e6 henry. */
	public final static Unit Megahenry;

	public final static Unit SouthKoreanWon;

	/** Decagram per litre is a unit of density defined as decagram divided by litre. */
	public final static Unit DecagramPerLitre;

	public final static Unit Millilumen;

	public final static Unit Zettaohm;

	public final static Unit ReciprocalKelvin;

	public final static Unit KilogramPerSecondTime;

	public final static Unit Centiradian;

	public final static Unit Yottalitre;

	public final static Unit Picovolt;

	public final static Unit Yoctolitre;

	public final static Unit WattPerSteradianSquareMetreHertz;

	public final static Unit DegreeSquared;

	public final static Unit GramPerSquareMetreDay;

	public final static Unit MilligramRAE;

	/** The TeX point is a unit of length defined as 0.01383700013837000138370001383 inch. */
	public final static Unit PointTeX;

	/** The 23 °C perm is a unit of permeance defined as 5.74525e-11 kilogram per pascal second (time) square metre. */
	public final static Unit Perm23C;

	public final static Unit Nanonewton;

	public final static Unit FaradPerMetre;

	public final static Unit Millisievert;

	/** The lumen is a unit of luminous flux defined as candela times steradian = lux times square metre. */
	public final static Unit Lumen;

	public final static Unit SquareHectometre;

	/** The lux is a unit of illuminance defined as lumen divided by square metre = candela times steradian divided by square metre. */
	public final static Unit Lux;

	/** The milliampere is a unit of electric current defined as 1.0e-3 ampere. */
	public final static Unit Milliampere;

	/** The bar is a unit of pressure defined as 100 000 pascal. */
	public final static Unit Bar;

	public final static Unit Hectoweber;

	/** The kiloampere is a unit of electric current defined as 1.0e3 ampere. */
	public final static Unit Kiloampere;

	public final static Unit ZettasecondTime;

	/** Metre per yoctosecond is a unit of speed defined as metre divided by yoctosecond. */
	public final static Unit MetrePerYoctosecondTime;

	/** The millikelvin is a unit of temperature defined as 1.0e-3 kelvin. */
	public final static Unit Millikelvin;

	/** Microram per cubic centimetre is a unit of density defined as microgram divided by cubic centimetre. */
	public final static Unit MicrogramPerCubicCentimetre;

	/** The 39 °F British thermal unit is a unit of energy defined as 1.05967e3 joule. */
	public final static Unit BritishThermalUnit39F;

	/** The US hundredweight is a unit of mass defined as 4.535924e1 kilogram. */
	public final static Unit HundredweightUS;

	/** The microkelvin is a unit of temperature defined as 1.0e-6 kelvin. */
	public final static Unit Microkelvin;

	/** Wordt gebruikt als hoek (360°=1440) voor o.a. rechte klimming. De m wordt meestal als superscript achter de waarde gezet gevolgd door de verdere opdeling naar seconden. Zoals in 5h34m12s09. Vaak wordt de fractie in seconden zonder punt geschreven, de s wordt als afscheiding gebruikt (http://en.wikipedia.org/wiki/Right_ascension). */
	public final static Unit MinuteHourAngle;

	/** The ton-force is a unit of force defined as 8.896443e3 newton. */
	public final static Unit TonForce;

	/** The 60 °F British thermal unit is a unit of energy defined as 1.05468e3 joule. */
	public final static Unit BritishThermalUnit60F;

	/** The femtokatal is a unit of catalytic activity defined as 1.0e-15 katal. */
	public final static Unit Femtokatal;

	public final static Unit Microohm;

	public final static Unit CubicNanometre;

	/** The degree Celsius is a unit of temperature defined as 1 kelvin. */
	public final static Unit DegreeCelsius;

	/** The electronvolt is a unit of energy defined as 1.602177e-19 joule. */
	public final static Unit Electronvolt;

	public final static Unit WattPerSquareMetreSteradian;

	/** The yoctobecquerel is a unit of activity defined as 1.0e-24 becquerel. */
	public final static Unit Yoctobecquerel;

	public final static Unit Attosteradian;

	/** The picogram is a unit of mass defined as 1.0e-12 gram. */
	public final static Unit Picogram;

	/** Gram per yottalitre is a unit of density defined as gram divided by yottalitre. */
	public final static Unit GramPerYottalitre;

	public final static Unit MicromolePerSecondTime;

	/** The centicoulomb is a unit of electric charge defined as 1.0e-2 coulomb. */
	public final static Unit Centicoulomb;

	/** The decicoulomb is a unit of electric charge defined as 1.0e-1 coulomb. */
	public final static Unit Decicoulomb;

	public final static Unit GigayearCubicParsec;

	/** The hertz is a unit of frequency defined as 1 divided by second. */
	public final static Unit Hertz;

	/** The millisecond (plane angle) is a unit of length defined as 1.0e-3 second (plane angle). Gebruikt in de astronomie (metingen van posities van sterren/sterrenstelsels etc.) om de fout weer te geven. */
	public final static Unit MillisecondPlaneAngle;

	/** Attomole per litre is a unit of amount of substance concentration defined as attomole divided by litre. */
	public final static Unit AttomolePerLitre;

	/** The picogray is a unit of absorbed dose defined as 1.0e-12 gray. */
	public final static Unit Picogray;

	/** The exahertz is a unit of frequency defined as 1.0e18 hertz. */
	public final static Unit Exahertz;

	public final static Unit ColonyFormingUnitPerMillilitre;

	public final static Unit ReciprocalDay;

	public final static Unit NanomolePerMetre;

	/** The deciampere is a unit of electric current defined as 1.0e-1 ampere. */
	public final static Unit Deciampere;

	public final static Unit MetreToThePower2;

	public final static Unit KilogramPerMole;

	/** The yoctojoule is a unit of energy defined as 1.0e-24 joule. */
	public final static Unit Yoctojoule;

	/** Petametre per second squared is a unit of acceleration defined as petametre divided by second squared. */
	public final static Unit PetametrePerSecondTimeSquared;

	/** The assay ton is a unit of mass defined as 2.916667e-2 kilogram. */
	public final static Unit TonAssay;

	/** The zeptampere is a unit of electric current defined as 1.0e-21 ampere. */
	public final static Unit Zeptoampere;

	/** Millimetre per day is a unit of speed defined as millimetre divided by day. */
	public final static Unit MillimetrePerDay;

	/** The yoctocoulomb is a unit of electric charge defined as 1.0e-24 coulomb. */
	public final static Unit Yoctocoulomb;

	public final static Unit CanadianDollar;

	public final static Unit Millipascal;

	public final static Unit TerasecondTimeSquared;

	/** The megacoulomb is a unit of electric charge defined as 1.0e6 coulomb. */
	public final static Unit Megacoulomb;

	/** Petametre per second is a unit of speed defined as petametre divided by second. */
	public final static Unit PetametrePerSecondTime;

	/** The week is a unit of time defined as 6.04800e5 second. */
	public final static Unit Week;

	/** The centifarad is a unit of capacitance defined as 1.0e-2 farad. */
	public final static Unit Centifarad;

	public final static Unit Petalitre;

	/** Reciprocal metre is a unit of wavenumber defined as 1 divided by metre. */
	public final static Unit ReciprocalMetre;

	/** Mole per femtolitre is a unit of amount of substance concentration defined as mole divided by femtolitre. */
	public final static Unit MolePerFemtolitre;

	public final static Unit Zeptoohm;

	public final static Unit Yottabyte;

	/** The fermi is a unit of length defined as 1.0e-15 metre. */
	public final static Unit Fermi;

	/** The microdegree Celsius is a unit of temperature defined as 1.0e-6 degree Celsius. */
	public final static Unit MicrodegreeCelsius;

	public final static Unit SquareAttometre;

	/** The grain is a unit of mass defined as 6.479891e-5 kilogram. */
	public final static Unit Grain;

	/** The apothecaries' pound is a unit of mass defined as 3.732417e-1 kilogram. */
	public final static Unit PoundApothecaries;

	public final static Scale CelsiusScale;

	/** Millimetre per hour is a unit of speed defined as millimetre divided by hour. */
	public final static Unit MillimetrePerHour;

	public final static Unit Microtesla;

	/** The gigabecquerel is a unit of activity defined as 1.0e9 becquerel. */
	public final static Unit Gigabecquerel;

	/** Mole per hectolitre is a unit of amount of substance concentration defined as mole divided by hectolitre. */
	public final static Unit MolePerHectolitre;

	/** The Imperial gill is a unit of volume defined as 1.420653e-4 cubic metre. */
	public final static Unit GillImperial;

	public final static Unit Femtomole;

	public final static Unit Piconewton;

	/** Mole per zeptolitre is a unit of amount of substance concentration defined as mole divided by zeptolitre. */
	public final static Unit MolePerZeptolitre;

	public final static Unit Femtoohm;

	public final static Unit Femtoweber;

	public final static Unit KilogramPerHectare;

	public final static Unit Petabit;

	public final static Unit ReciprocalSecondTime;

	/** The decacoulomb is a unit of electric charge defined as 1.0e1 coulomb. */
	public final static Unit Decacoulomb;

	/** Attogram per litre is a unit of density defined as attogram divided by litre. */
	public final static Unit AttogramPerLitre;

	public final static Unit Picoradian;

	public final static Unit KilogramSecondTimeToThePower2ReciprocalMetre;

	/** The thermochemical British thermal unit is a unit of energy defined as 1.054350e3 joule. */
	public final static Unit BritishThermalUnitThermochemical;

	public final static Unit DecisecondTimeSquared;

	/** Picomole per litre is a unit of amount of substance concentration defined as picomole divided by litre. */
	public final static Unit PicomolePerLitre;

	/** The nanofarad is a unit of capacitance defined as 1.0e-9 farad. */
	public final static Unit Nanofarad;

	public final static Unit Femtowatt;

	public final static Unit KilojoulePerSquareMetreDay;

	public final static Unit Picomole;

	/** Metre per decasecond is a unit of speed defined as metre divided by decasecond. */
	public final static Unit MetrePerDecasecondTime;

	public final static Unit Zettalumen;

	/** Micrometre per second is a unit of speed defined as micrometre divided by second. */
	public final static Unit MicrometrePerSecondTime;

	public final static Unit MolePerMetre;

	/** The stathenry is a unit of inductance defined as 8.987552e11 henry. */
	public final static Unit Stathenry;

	/** The year is a unit of time defined as 3.1536e7 second. */
	public final static Unit Year;

	public final static Unit AttosecondTime;

	public final static Unit MolePerGigametre;

	public final static Unit ReciprocalCubicMetre;

	/** Gram per megalitre is a unit of density defined as gram divided by megalitre. */
	public final static Unit GramPerMegalitre;

	/** The kilomolair is a unit of amount of substance concentration defined as 1.0e3 molair. */
	public final static Unit Kilomolair;

	public final static Unit LumenPerSquareMetre;

	/** Metre per centisecond squared is a unit of acceleration defined as metre divided by centisecond squared. */
	public final static Unit MetrePerCentisecondTimeSquared;

	public final static Unit Decitesla;

	public final static Unit HectareDay;

	public final static Unit Attotesla;

	public final static Unit Nanowatt;

	public final static Unit SquareDecimetre;

	/** The revolution is a unit of plane angle defined as 6.283185 radian. */
	public final static Unit Revolution;

	public final static Unit Picowatt;

	public final static Unit Megohm;

	public final static Unit YoctosecondTime;

	public final static Unit SquareMetreSteradian;

	public final static Unit CubicPicometre;

	/** Kilometre per second squared is a unit of acceleration defined as kilometre divided by second squared. */
	public final static Unit KilometrePerSecondTimeSquared;

	/** Metre per second is a unit of speed defined as metre divided by second. */
	public final static Unit MetrePerSecondTime;

	/** The amylase unit is a unit of catalytic activity. */
	public final static Unit AmylaseUnit;

	public final static Unit NewtonMetre;

	public final static Unit CubicMetrePerYear;

	public final static Unit Kiloweber;

	public final static Unit Zeptoweber;

	public final static Unit Petalumen;

	public final static Unit ReciprocalDegreeCelsius;

	public final static Unit CubicHectometre;

	/** The metre of mercury is a unit of pressure defined as 133 322 pascal. */
	public final static Unit MetreOfMercury;

	/** The femtogram is a unit of mass defined as 1.0e-15 gram. */
	public final static Unit Femtogram;

	public final static Unit ReciprocalAtmosphereStandard;

	/** The Postscript point is a unit of length defined as 0.013888888888888888888888888888889 inch. */
	public final static Unit PointPostscript;

	/** The ton of refridgeration is a unit of power defined as 3.516853e3 watt. */
	public final static Unit TonOfRefridgeration;

	/** The attometre is a unit of length defined as 1.0e-18 metre. */
	public final static Unit Attometre;

	/** The petacandela is a unit of luminous intensity defined as 1.0e15 candela. */
	public final static Unit Petacandela;

	public final static Unit ReciprocalSquareMetre;

	public final static Unit CubicGigametre;

	/** Femtometre per second squared is a unit of acceleration defined as femtometre divided by second squared. */
	public final static Unit FemtometrePerSecondTimeSquared;

	public final static Unit Decatesla;

	public final static Unit DegreeCelsiusPerMinuteTime;

	public final static Unit Kibibit;

	/** The femtogray is a unit of absorbed dose defined as 1.0e-15 gray. */
	public final static Unit Femtogray;

	/** The decijoule is a unit of energy defined as 1.0e-1 joule. */
	public final static Unit Decijoule;

	public final static Unit Femtonewton;

	/** Square metre is a unit of area defined as the area of a square whose sides measure exactly one metre. */
	public final static Unit SquareMetre;

	/** Metre per exasecond squared is a unit of acceleration defined as metre divided by exasecond squared. */
	public final static Unit MetrePerExasecondTimeSquared;

	public final static Unit Megaeuro;

	/** The centimetre is a unit of length defined as 1.0e-2 metre. */
	public final static Unit Centimetre;

	public final static Unit Deciohm;

	public final static Unit MegametrePerKilojoule;

	/** The picofarad is a unit of capacitance defined as 1.0e-12 farad. */
	public final static Unit Picofarad;

	/** Kilomole per litre is a unit of amount of substance concentration defined as kilomole divided by litre. */
	public final static Unit KilomolePerLitre;

	public final static Unit ColonyFormingUnit;

	/** The röntgen is a unit of exposure to x and γ rays defined as 2.58e-4 coulomb per kilogram. */
	public final static Unit Röntgen;

	/** The yottahertz is a unit of frequency defined as 1.0e24 hertz. */
	public final static Unit Yottahertz;

	/** The sidereal second is a unit of time defined as 9.972696e-1 second. */
	public final static Unit SecondSidereal;

	public final static Unit Nanosiemens;

	public final static Unit ReciprocalPartsPerMillion;

	public final static Unit Picolitre;

	public final static Unit YoctomolePerMetre;

	/** The degree Fahrenheit is a unit of temperature defined as 5.555556e-1 kelvin. */
	public final static Unit DegreeFahrenheit;

	public final static Unit Nanomole;

	public final static Unit KilosecondTime;

	public final static Unit GramPerMetre;

	/** The micrometre is a unit of length defined as 1.0e-6 metre. */
	public final static Unit Micrometre;

	public final static Unit Centisteradian;

	/** The nanobecquerel is a unit of activity defined as 1.0e-9 becquerel. */
	public final static Unit Nanobecquerel;

	/** The picocoulomb is a unit of electric charge defined as 1.0e-12 coulomb. */
	public final static Unit Picocoulomb;

	public final static Unit ReciprocalHectare;

	public final static Unit Exapascal;

	/** The zeptmolair is a unit of amount of substance concentration defined as 1.0e-21 molair. */
	public final static Unit Zeptomolair;

	public final static Unit PoundSterling;

	/** The zettakelvin is a unit of thermodynamic temperature defined as 1.0e21 kelvin. */
	public final static Unit Zettakelvin;

	public final static Unit Nanosievert;

	/** The decimetre is a unit of length defined as 1.0e-1 metre. */
	public final static Unit Decimetre;

	/** The hectokatal is a unit of catalytic activity defined as 1.0e2 katal. */
	public final static Unit Hectokatal;

	public final static Unit Zettalitre;

	public final static Unit SquareYottametre;

	public final static Unit TerawattHour;

	/** Metre per femtosecond squared is a unit of acceleration defined as metre divided by femtosecond squared. */
	public final static Unit MetrePerFemtosecondTimeSquared;

	/** The centijoule is a unit of energy defined as 1.0e-2 joule. */
	public final static Unit Centijoule;

	public final static Unit Giganewton;

	public final static Unit JouleSecondTime;

	/** The sidereal year is a unit of time defined as 3.155815e7 second. */
	public final static Unit YearSidereal;

	public final static Unit MolePerZettametre;

	public final static Unit JoulePerCubicMetre;

	public final static Unit JoulePerKelvin;

	public final static Unit AustralianDollar;

	public final static Unit PetamolePerMetre;

	/** The attojoule is a unit of energy defined as 1.0e-18 joule. */
	public final static Unit Attojoule;

	/** The decimolair is a unit of amount of substance concentration defined as 1.0e-1 molair. */
	public final static Unit Decimolair;

	/** The yoctomolair is a unit of amount of substance concentration defined as 1.0e-24 molair. */
	public final static Unit Yoctomolair;

	/** Gram per joule is a unit of energy consumption. */
	public final static Unit GramPerJoule;

	public final static Unit YottamolePerMetre;

	/** The terahenry is a unit of inductance defined as 1.0e12 henry. */
	public final static Unit Terahenry;

	public final static Unit Yottalux;

	/** The curie is a unit of activity defined as 3.7e10 becquerel. */
	public final static Unit Curie;

	public final static Unit Petasievert;

	public final static Unit Perm23C_1;

	/** Metre per decisecond squared is a unit of acceleration defined as metre divided by decisecond squared. */
	public final static Unit MetrePerDecisecondTimeSquared;

	/** The henry is a unit of inductance defined as square metre times kilogram divided by second squared times ampere squared = weber divided by ampere = volt second divided by ampere = (joule divided by coulomb) times second divided by (coulomb divided by second) = joule times second squared divided by coulomb squared = square metre times kilogram divided by coulomb squared. */
	public final static Unit Henry;

	/** The Imperial quart is a unit of volume defined as 1.1365 litre. */
	public final static Unit QuartImperial;

	public final static Unit MicrogramPerJoule;

	/** The statohm is a unit of electrical resistance defined as 8.987552e11 ohm. */
	public final static Unit Statohm;

	/** The exabecquerel is a unit of activity defined as 1.0e18 becquerel. */
	public final static Unit Exabecquerel;

	public final static Unit Millilitre;

	/** Kilogram per cubic metre is a unit of density defined as kilogram divided by cubic metre. */
	public final static Unit KilogramPerCubicMetre;

	/** The exahenry is a unit of inductance defined as 1.0e18 henry. */
	public final static Unit Exahenry;

	/** The 15 °C calorie is a unit of energy defined as 4.18580 joule. */
	public final static Unit Calorie15C;

	public final static Unit ZeptosecondTimeSquared;

	/** The bit is a unit of information capacity defined as the information capacity of one binary digit. */
	public final static Unit Bit;

	/** The nanogray is a unit of absorbed dose defined as 1.0e-9 gray. */
	public final static Unit Nanogray;

	public final static Unit ZeptomolePerMetre;

	/** The TeX pica is a unit of length defined as 12 point (TeX). */
	public final static Unit PicaTeX;

	/** The nanogram is a unit of mass defined as 1.0e-9 gram. */
	public final static Unit Nanogram;

	public final static Unit Nanosteradian;

	public final static Unit MolePerNanometre;

	/** The exacoulomb is a unit of electric charge defined as 1.0e18 coulomb. */
	public final static Unit Exacoulomb;

	public final static Unit Kilosiemens;

	/** The gigacoulomb is a unit of electric charge defined as 1.0e9 coulomb. */
	public final static Unit Gigacoulomb;

	/** The megaerg is a unit of energy defined as 1.0e6 erg. */
	public final static Unit Megaerg;

	/** Mile (statute) per hour is a unit of speed defined as mile (statute) divided by hour. */
	public final static Unit MileStatutePerHour;

	public final static Unit Megaweber;

	/** The teracoulomb is a unit of electric charge defined as 1.0e12 coulomb. */
	public final static Unit Teracoulomb;

	public final static Unit NewtonPerMetre;

	/** The nanometre is a unit of length defined as 1.0e-9 metre. */
	public final static Unit Nanometre;

	/** Metre per zeptosecond is a unit of speed defined as metre divided by zeptosecond. */
	public final static Unit MetrePerZeptosecondTime;

	public final static Unit Petasiemens;

	/** The dyne is a unit of force defined as 1.0e-5 newton. */
	public final static Unit Dyne;

	/** Megamole per litre is a unit of amount of substance concentration defined as megamole divided by litre. */
	public final static Unit MegamolePerLitre;

	/** Zettametre per second is a unit of speed defined as zettametre divided by second. */
	public final static Unit ZettametrePerSecondTime;

	/** Metre per femtosecond is a unit of speed defined as metre divided by femtosecond. */
	public final static Unit MetrePerFemtosecondTime;

	public final static Unit MolePerPetametre;

	/** The microjoule is a unit of energy defined as 1.0e-6 joule. */
	public final static Unit Microjoule;

	/** The centigray is a unit of absorbed dose defined as 1.0e-2 gray. */
	public final static Unit Centigray;

	/** Metre per attosecond squared is a unit of acceleration defined as metre divided by attosecond squared. */
	public final static Unit MetrePerAttosecondTimeSquared;

	public final static Unit Gigawatt;

	/** The decifarad is a unit of capacitance defined as 1.0e-1 farad. */
	public final static Unit Decifarad;

	/** The peck is a unit of volume defined as 8.809768e-3 cubic metre. */
	public final static Unit Peck;

	/** The siemens is a unit of electrical conductance defined as 1 divided by ohm = ampere divided by volt = coulomb squared times second divided by kilogram times square metre = ampere squared times second to the power 3 divided by kilogram times square metre. */
	public final static Unit Siemens;

	/** The unit pole is a unit of magnetic flux defined as 1.256637e-7 weber. */
	public final static Unit UnitPole;

	public final static Unit MicromolePerMetre;

	public final static Unit Attowatt;

	public final static Unit Centitesla;

	/** The statute mile is a unit of length defined as 1.609344e3 metre. */
	public final static Unit MileStatute;

	/** The picojoule is a unit of energy defined as 1.0e-12 joule. */
	public final static Unit Picojoule;

	public final static Unit Zeptovolt;

	/** Metre per terasecond is a unit of speed defined as metre divided by terasecond. */
	public final static Unit MetrePerTerasecondTime;

	public final static Unit Centimole;

	/** The short ton is a unit of mass defined as 9.071847e2 kilogram. */
	public final static Unit TonShort;

	public final static Unit Terapascal;

	/** The decibecquerel is a unit of activity defined as 1.0e-1 becquerel. */
	public final static Unit Decibecquerel;

	public final static Unit CubicYottametre;

	public final static Unit Yottavolt;

	/** The statweber is a unit of magnetic flux defined as 2.9979e2 weber. */
	public final static Unit Statweber;

	public final static Unit Yoctoohm;

	/** The newton is a unit of force defined as kilogram timesmetre divided by second squared. */
	public final static Unit Newton;

	public final static Unit Hectosiemens;

	public final static Unit Exalumen;

	public final static Unit Nanovolt;

	/** The byte is a unit of information capacity defined as 8 bit. */
	public final static Unit Byte;

	/** Cubic metre per kilogram is a unit of specific volume defined as cubic metre divided by kilogram. */
	public final static Unit CubicMetrePerKilogram;

	public final static Unit DecimolePerMetre;

	/** Gigamole per litre is a unit of amount of substance concentration defined as gigamole divided by litre. */
	public final static Unit GigamolePerLitre;

	/** The debye is a unit of electric dipole moment defined as 3.33564e-30 coulomb metre. */
	public final static Unit Debye;

	public final static Unit SquareMetrePerSecondTime;

	/** The chain is a unit of length defined as 2.011684e1 metre. */
	public final static Unit Chain;

	/** The quad is a unit of energy defined as 1.0e15 British thermal unit (International Table). */
	public final static Unit Quad;

	public final static Unit WattPerSquareMetreHertz;

	/** The abvolt is a unit of electric potential defined as 1.0e-8 volt. */
	public final static Unit Abvolt;

	/** The darcy is a unit of area defined as 9.869233e-13 square metre. */
	public final static Unit Darcy;

	public final static Unit DecamolePerMetre;

	public final static Unit HectosecondTimeSquared;

	/** The micromagnitude is a unit of magnitude defined as 1.0e-6 magnitude. */
	public final static Unit Micromagnitude;

	public final static Unit Yoctopascal;

	/** Nautical mile per hour is a unit of speed defined as nautical mile divided by hour. */
	public final static Unit NauticalMilePerHour;

	/** Metre per picosecond is a unit of speed defined as metre divided by picosecond. */
	public final static Unit MetrePerPicosecondTime;

	/** The decikelvin is a unit of temperature defined as 1.0e-1 kelvin. */
	public final static Unit Decikelvin;

	public final static Unit Terabyte;

	public final static Unit Nanolux;

	public final static Unit MicrosecondTimeSquared;

	/** The yoctoampere is a unit of electric current defined as 1.0e-24 ampere. */
	public final static Unit Yoctoampere;

	/** Mole per teralitre is a unit of amount of substance concentration defined as mole divided by teralitre. */
	public final static Unit MolePerTeralitre;

	/** The ATA point is a unit of length defined as 0.3514598e-3 metre. */
	public final static Unit PointATA;

	public final static Unit Microsteradian;

	/** The foot poundal is a unit of energy defined as 4.214011e-2 joule. */
	public final static Unit FootPoundal;

	/** The attodegree Celsius is a unit of temperature defined as 1.0e-18 degree Celsius. */
	public final static Unit AttodegreeCelsius;

	/** The statmho is a unit of electrical conductance defined as 1.112650e-12 siemens. */
	public final static Unit Statmho;

	/** Metre per gigasecond squared is a unit of acceleration defined as metre divided by gigasecond squared. */
	public final static Unit MetrePerGigasecondTimeSquared;

	/** The long ton is a unit of mass defined as 1.016047e3 kilogram. */
	public final static Unit TonLong;

	/** The yottacandela is a unit of luminous intensity defined as 1.0e24 candela. */
	public final static Unit Yottacandela;

	public final static Unit Attomole;

	/** Yottametre per second is a unit of speed defined as yottametre divided by second. */
	public final static Unit YottametrePerSecondTime;

	public final static Unit MolePerYottametre;

	/** The mean British thermal unit is a unit of energy defined as 1.05587e3 joule. */
	public final static Unit BritishThermalUnitMean;

	public final static Unit Picolux;

	/** The centibecquerel is a unit of activity defined as 1.0e-2 becquerel. */
	public final static Unit Centibecquerel;

	/** The nautical mile is a unit of length defined as 1852 metre. */
	public final static Unit NauticalMile;

	public final static Unit Milliohm;

	public final static Unit JoulePerKelvinKilogram;

	/** Metre per terasecond squared is a unit of acceleration defined as metre divided by terasecond squared. */
	public final static Unit MetrePerTerasecondTimeSquared;

	/** The decametre is a unit of length defined as 1.0e1 metre. */
	public final static Unit Decametre;

	public final static Unit Centiwatt;

	public final static Unit SquareZettametre;

	/** The decajoule is a unit of energy defined as 1.0e1 joule. */
	public final static Unit Decajoule;

	public final static Unit Gigalumen;

	/** The standard atmosphere is a unit of pressure defined as 1.01325e5 pascal. */
	public final static Unit AtmosphereStandard;

	/** The nanojoule is a unit of energy defined as 1.0e-9 joule. */
	public final static Unit Nanojoule;

	public final static Unit Yoctotesla;

	/** Kilogram per cubic decimetre is a unit of density defined as kilogram divided by cubic decimetre. */
	public final static Unit KilogramPerCubicDecimetre;

	/** The yoctofarad is a unit of capacitance defined as 1.0e-24 farad. */
	public final static Unit Yoctofarad;

	public final static Unit Yottasiemens;

	public final static Unit ColonyFormingUnitPerGram;

	public final static Unit Deciwatt;

	public final static Unit Attosiemens;

	/** Zettametre per second squared is a unit of acceleration defined as zettametre divided by second squared. */
	public final static Unit ZettametrePerSecondTimeSquared;

	/** The hectocandela is a unit of luminous intensity defined as 1.0e2 candela. */
	public final static Unit Hectocandela;

	/** Yottagram per litre is a unit of density defined as yottagram divided by litre. */
	public final static Unit YottagramPerLitre;

	public final static Unit Gigalitre;

	/** Milligram per cubic metre is a unit of density defined as milligram divided by cubic metre. */
	public final static Unit MilligramPerCubicMetre;

	/** The megakatal is a unit of catalytic activity defined as 1.0e6 katal. */
	public final static Unit Megakatal;

	public final static Unit Centipascal;

	public final static Unit MolePerAttometre;

	/** The second is a unit of time defined as the duration of 9 192 631 770 periods of the radiation corresponding to the transition between the two hyperfine levels of the ground state of the cesium 133 atom. */
	public final static Unit SecondTime;

	/** The ohm is a unit of electrical resistance defined as volt divided by ampere = square metre times kilogram divided by second to the power 3 times ampere squared. */
	public final static Unit Ohm;

	public final static Unit AttosecondTimeSquared;

	/** The millicoulomb is a unit of electric charge defined as 1.0e-3 coulomb. */
	public final static Unit Millicoulomb;

	public final static Unit GramPerHectogram;

	public final static Unit SquareNanometre;

	public final static Unit CubicMillimetrePerCubicMillimetre;

	/** The attobecquerel is a unit of activity defined as 1.0e-18 becquerel. */
	public final static Unit Attobecquerel;

	/** The gigaelectronvolt is a unit of energy defined as 1.0e9 electronvolt. */
	public final static Unit Gigaelectronvolt;

	/** Ampere per metre is a unit of magnetic field defined as ampere divided by metre. */
	public final static Unit AmperePerMetre;

	public final static Unit CubicAttometre;

	/** The mil (length) is a unit of length defined as 2.54e-5 metre. */
	public final static Unit MilLength;

	public final static Unit Kilohm;

	/** The stilb is a unit of luminance defined as 1.0e4 candela per square metre. */
	public final static Unit Stilb;

	/** The femtodegree Celsius is a unit of temperature defined as 1.0e-15 degree Celsius. */
	public final static Unit FemtodegreeCelsius;

	public final static Unit Centivolt;

	public final static Unit SteradianSquareMetreHertz;

	public final static Unit KatalPerCubicMetre;

	public final static Unit PicosecondTimeSquared;

	public final static Unit SquareKilometre;

	public final static Unit Petanewton;

	public final static Unit CoulombPerSquareMetre;

	public final static Unit MetreKelvin;

	/** The microbecquerel is a unit of activity defined as 1.0e-6 becquerel. */
	public final static Unit Microbecquerel;

	public final static Unit CubicParsec;

	public final static Unit Centistokes;

	public final static Unit Attovolt;

	public final static Unit MegajoulePerSquareMetre;

	public final static Unit Centipoise;

	/** The zeptkelvin is a unit of temperature defined as 1.0e-21 kelvin. */
	public final static Unit Zeptokelvin;

	/** The attogray is a unit of absorbed dose defined as 1.0e-18 gray. */
	public final static Unit Attogray;

	public final static Unit Hectonewton;

	/** Mole per picolitre is a unit of amount of substance concentration defined as mole divided by picolitre. */
	public final static Unit MolePerPicolitre;

	public final static Unit CubicFemtometre;

	/** The minute (plane angle) is a unit of plane angle defined as 2.908882e-4 radian. */
	public final static Unit MinutePlaneAngle;

	/** The yoctometre is a unit of length defined as 1.0e-24 metre. */
	public final static Unit Yoctometre;

	public final static Unit Yottasievert;

	public final static Unit Gigalux;

	/** The femtohenry is a unit of inductance defined as 1.0e-15 henry. */
	public final static Unit Femtohenry;

	public final static Unit Teralux;

	/** The attogram is a unit of mass defined as 1.0e-18 gram. */
	public final static Unit Attogram;

	public final static Unit SquareDecametre;

	public final static Unit Hectotesla;

	public final static Unit Hectosievert;

	/** Gram per zettalitre is a unit of density defined as gram divided by zettalitre. */
	public final static Unit GramPerZettalitre;

	/** Centimetre per second is a unit of speed defined as centimetre divided by second. */
	public final static Unit CentimetrePerSecondTime;

	/** The footlambert is a unit of luminance defined as 3.426259 candela per square metre. */
	public final static Unit Footlambert;

	/** Kilogram per litre is a unit of density defined as kilogram divided by litre. */
	public final static Unit KilogramPerLitre;

	/** The teaspoon is a unit of volume defined as 4.928922e-6 cubic metre. */
	public final static Unit Teaspoon;

	/** The US dry quart is a unit of volume defined as 1.101221e-3 cubic metre. */
	public final static Unit DryQuartUS;

	/** The megaelectronvolt is a unit of energy defined as 1.0e6 electronvolt. */
	public final static Unit Megaelectronvolt;

	public final static Unit MoleMicrometre;

	/** The acre is a unit of area defined as 4.046873e3 square metre. */
	public final static Unit Acre;

	/** The barrel is a unit of volume defined as 1.589873e-1 cubic metre. */
	public final static Unit Barrel;

	/** The zeptkatal is a unit of catalytic activity defined as 1.0e-21 katal. */
	public final static Unit Zeptokatal;

	/** The kilohenry is a unit of inductance defined as 1.0e3 henry. */
	public final static Unit Kilohenry;

	public final static Unit Petaohm;

	public final static Unit SecondTimeAmpere;

	public final static Unit Attosievert;

	/** The centigram is a unit of mass defined as 1.0e-2 gram. */
	public final static Unit Centigram;

	/** Metre per second squared is a unit of acceleration defined as metre divided by second squared. */
	public final static Unit MetrePerSecondTimeSquared;

	/** The nanodegree Celsius is a unit of temperature defined as 1.0e-9 degree Celsius. */
	public final static Unit NanodegreeCelsius;

	public final static Unit NanokatalPerMilligram;

	/** The yottahenry is a unit of inductance defined as 1.0e24 henry. */
	public final static Unit Yottahenry;

	public final static Unit RadianPerSecondTime;

	/** The yottagray is a unit of absorbed dose defined as 1.0e24 gray. */
	public final static Unit Yottagray;

	/** The sievert is a unit of dose equivalent defined as joule divided by kilogram = square metre divided by second squared. */
	public final static Unit Sievert;

	/** The zettahertz is a unit of frequency defined as 1.0e21 hertz. */
	public final static Unit Zettahertz;

	public final static Unit KilosecondTimeSquared;

	/** The yottagram is a unit of mass defined as 1.0e24 gram. */
	public final static Unit Yottagram;

	public final static Unit Zeptolux;

	public final static Unit WattPerSquareMetreNanometre;

	public final static Unit WattPerSteradianSquareMetre;

	/** The light year is a unit of length defined as 9.46073e15 metre. */
	public final static Unit LightYear;

	/** The zettacandela is a unit of luminous intensity defined as 1.0e21 candela. */
	public final static Unit Zettacandela;

	/** The volt is a unit of electric potential defined as watt divided by ampere = joule divided by coulomb = newton times metre divided by ampere times second = kilogram times square metre divided by ampere times second to the power 3. */
	public final static Unit Volt;

	public final static Unit SquareMetreHertz;

	/** The US dry pint is a unit of volume defined as 5.506105e-4 cubic metre. */
	public final static Unit DryPintUS;

	/** The kilometre is a unit of length defined as 1.0e3 metre. */
	public final static Unit Kilometre;

	/** The attokatal is a unit of catalytic activity defined as 1.0e-18 katal. */
	public final static Unit Attokatal;

	/** Femtomole per litre is a unit of amount of substance concentration defined as femtomole divided by litre. */
	public final static Unit FemtomolePerLitre;

	/** The month is a unit of time. */
	public final static Unit Month;

	/** The statcoulomb is a unit of electric charge defined as 3.335641e-10 coulomb. */
	public final static Unit Statcoulomb;

	/** The mho is a unit of electrical conductance defined as 1 siemens. */
	public final static Unit Mho;

	/** The weber is a unit of magnetic flux defined as kilogram times square metre divided by second squared times ampere = volt times second = joule divided by ampere. */
	public final static Unit Weber;

	public final static Unit Exbibit;

	public final static Unit Attoohm;

	/** The pascal is a unit of pressure and stress defined as newton divided by square metre = joule divided by cubic metre = kilogram divided by metre second squared. */
	public final static Unit Pascal;

	public final static Unit MilligramPerKilometre;

	public final static Unit SquareFemtometre;

	/** The tablespoon is a unit of volume defined as 1.478676e-5 cubic metre. */
	public final static Unit Tablespoon;

	/** The centiare is a unit of area defined as 1.0e-2 are. */
	public final static Unit Centiare;

	/** The teragram is a unit of mass defined as 1.0e12 gram. */
	public final static Unit Teragram;

	/** Zeptomole per litre is a unit of amount of substance concentration defined as zeptomole divided by litre. */
	public final static Unit ZeptomolePerLitre;

	/** The parsec is a unit of length defined as 3.08567802e16 metre. */
	public final static Unit Parsec;

	public final static Unit NewZealandDollar;

	public final static Unit ReciprocalHour;

	public final static Unit CubicDecametre;

	/** The metric horsepower is a unit of power defined as 7.354988e2 watt. */
	public final static Unit HorsepowerMetric;

	/** The katal is a unit of catalytic activity defined as mole divided by second. */
	public final static Unit Katal;

	/** The millimetre is a unit of length defined as 1.0e-3 metre. */
	public final static Unit Millimetre;

	/** The zettaampere is a unit of electric current defined as 1.0e21 ampere. */
	public final static Unit Zettaampere;

	public final static Unit SingaporeDollar;

	/** The zeptcoulomb is a unit of electric charge defined as 1.0e-21 coulomb. */
	public final static Unit Zeptocoulomb;

	/** The footcandle is a unit of illuminance defined as 1.076391e1 lux. */
	public final static Unit Footcandle;

	public final static Unit Gigatesla;

	/** The teragray is a unit of absorbed dose defined as 1.0e12 gray. */
	public final static Unit Teragray;

	/** The picohertz is a unit of frequency defined as 1.0e-12 hertz. */
	public final static Unit Picohertz;

	public final static Unit SquareGigametre;

	public final static Unit MicrosecondTime;

	public final static Unit PascalSecondTimeSquareMetre;

	public final static Unit Femtosiemens;

	/** The kayser is a unit of wavenumber defined as 100 reciprocal metre. */
	public final static Unit Kayser;

	public final static Unit Gigaohm;

	/** The steradian is a unit of solid angle defined as the solid angle subtended at the center of a sphere by a portion of the surface of the sphere that has an area equal to the square of the radius of the sphere. */
	public final static Unit Steradian;

	/** The torr is a unit of pressure defined as 1.333224e2 pascal. */
	public final static Unit Torr;

	/** The yoctogray is a unit of absorbed dose defined as 1.0e-24 gray. */
	public final static Unit Yoctogray;

	/** Gram per millilitre is a unit of density defined as gram divided by millilitre. */
	public final static Unit GramPerMillilitre;

	/** The Imperial gallon is a unit of volume defined as 4.54609e-3 cubic metre. */
	public final static Unit GallonImperial;

	public final static Unit Attonewton;

	/** The centimetre of mercury is a unit of pressure defined as 1.0e-2 metre of mercury. */
	public final static Unit CentimetreOfMercury;

	public final static Unit Gibibyte;

	/** Unit one is a unit of dimension one. */
	public final static Unit One;

	/** Hectometre per second is a unit of speed defined as hectometre divided by second. */
	public final static Unit HectometrePerSecondTime;

	/** Ampere per watt is a unit of responsivity. */
	public final static Unit AmperePerWatt;

	public final static Unit Yoctowatt;

	public final static Unit CubicMetrePerSecondTime;

	/** The gauss is a unit of magnetic flux density defined as 1.0e-4 tesla. */
	public final static Unit Gauss;

	public final static Unit Microradian;

	public final static Unit Petapascal;

	public final static Unit Teravolt;

	/** Mole per microlitre is a unit of amount of substance concentration defined as mole divided by microlitre. */
	public final static Unit MolePerMicrolitre;

	public final static Unit Attoweber;

	/** Femtogram per litre is a unit of density defined as femtogram divided by litre. */
	public final static Unit FemtogramPerLitre;

	/** The International Table calorie is a unit of energy defined as 4.1868 joule. */
	public final static Unit CalorieInternationalTable;

	public final static Unit MetreKilogramPerSecondTimeSquared;

	/** The gram is a unit of mass defined as 1.0e-3 kilogram. */
	public final static Unit Gram;

	public final static Unit SquareMetreKelvinPerWatt;

	/** The attomolair is a unit of amount of substance concentration defined as 1.0e-18 molair. */
	public final static Unit Attomolair;

	/** The hectokelvin is a unit of thermodynamic temperature defined as 1.0e2 kelvin. */
	public final static Unit Hectokelvin;

	/** The terakatal is a unit of catalytic activity defined as 1.0e12 katal. */
	public final static Unit Terakatal;

	/** The zepthertz is a unit of frequency defined as 1.0e-21 hertz. */
	public final static Unit Zeptohertz;

	public final static Unit Decavolt;

	/** Gram per decalitre is a unit of density defined as gram divided by decalitre. */
	public final static Unit GramPerDecalitre;

	/** Volt per watt is a unit of responsivity. */
	public final static Unit VoltPerWatt;

	/** Yoctometre per second squared is a unit of acceleration defined as yoctometre divided by second squared. */
	public final static Unit YoctometrePerSecondTimeSquared;

	/** The nanocandela is a unit of luminous intensity defined as 1.0e-9 candela. */
	public final static Unit Nanocandela;

	public final static Unit Gigavolt;

	public final static Unit Zeptowatt;

	public final static Unit Yoctomole;

	public final static Unit Zeptopascal;

	/** The exaampere is a unit of electric current defined as 1.0e18 ampere. */
	public final static Unit Exaampere;

	/** Mole per litre is a unit of amount of substance concentration defined as mole divided by litre. */
	public final static Unit MolePerLitre;

	public final static Unit WattPerHertz;

	/** The hectohertz is a unit of frequency defined as 1.0e2 hertz. */
	public final static Unit Hectohertz;

	/** Ampere per square metre is a unit of current density defined as ampere divided by square metre. */
	public final static Unit AmperePerSquareMetre;

	public final static Unit SquareMetreSecondTime;

	/** The terabecquerel is a unit of activity defined as 1.0e12 becquerel. */
	public final static Unit Terabecquerel;

	/** The amount of stellar mass created per cubic kiloparsec in each billion years. */
	public final static Unit SolarMassPerGigayearCubicKiloparsec;

	public final static Unit MolePerExametre;

	public final static Unit KilojoulePerHectogram;

	public final static Unit MillisecondTimeSquared;

	public final static Unit MilligramPerKilogram;

	/** The decicandela is a unit of luminous intensity defined as 1.0e-1 candela. */
	public final static Unit Decicandela;

	public final static Unit MolePerMillimetre;

	/** The decagram is a unit of mass defined as 1.0e1 gram. */
	public final static Unit Decagram;

	/** Yoctomole per litre is a unit of amount of substance concentration defined as yoctomole divided by litre. */
	public final static Unit YoctomolePerLitre;

	public final static Unit CandelaPerSquareCentimetre;

	public final static Unit Yoctovolt;

	/** The gigagray is a unit of absorbed dose defined as 1.0e9 gray. */
	public final static Unit Gigagray;

	/** The US gallon is a unit of volume defined as 3.785412e-3 cubic metre. */
	public final static Unit GallonUS;

	public final static Unit Exalitre;

	/** The kilogray is a unit of absorbed dose defined as 1.0e3 gray. */
	public final static Unit Kilogray;

	public final static Unit CoulombPerKilogram;

	/** The mole is a unit of amount of substance defined as the amount of substance of a system that contains as many elementary entities as there are atoms in 0.012 kilogram of carbon 12. */
	public final static Unit Mole;

	/** The gigagram is a unit of mass defined as 1.0e9 gram. */
	public final static Unit Gigagram;

	public final static Unit TerasecondTime;

	/** The British horsepower is a unit of power defined as 7.4570e2 watt. */
	public final static Unit HorsepowerBritish;

	/** The abfarad is a unit of capacitance defined as 1.0e9 farad. */
	public final static Unit Abfarad;

	/** The gray is a unit of absorbed dose defined as joule divided by kilogram = square metre divided by second squared. */
	public final static Unit Gray;

	/** The exafarad is a unit of capacitance defined as 1.0e18 farad. */
	public final static Unit Exafarad;

	/** The petahertz is a unit of frequency defined as 1.0e15 hertz. */
	public final static Unit Petahertz;

	/** Centimole per litre is a unit of amount of substance concentration defined as centimole divided by litre. */
	public final static Unit CentimolePerLitre;

	public final static Unit ZettamolePerMetre;

	/** The kilogram is a unit of mass defined as the mass of the international prototype of the kilogram. */
	public final static Unit Kilogram;

	/** The kilohertz is a unit of frequency defined as 1.0e3 hertz. */
	public final static Unit Kilohertz;

	/** Kilometre per second is a unit of speed defined as kilometre divided by second. */
	public final static Unit KilometrePerSecondTime;

	/** The decacandela is a unit of luminous intensity defined as 1.0e1 candela. */
	public final static Unit Decacandela;

	public final static Unit RussianRuble;

	/** Gram per litre is a unit of density defined as gram divided by litre. */
	public final static Unit GramPerLitre;

	/** The millifarad is a unit of capacitance defined as 1.0e-3 farad. */
	public final static Unit Millifarad;

	/** Wordt gebruikt als hoek (360°=864000) voor o.a. rechte klimming. De s wordt meestal als superscript achter de waarde gezet. Zoals in 5h34m12s09. Vaak wordt de fractie in seconden zonder punt geschreven, de s wordt als afscheiding gebruikt (http://en.wikipedia.org/wiki/Right_ascension). */
	public final static Unit SecondHourAngle;

	public final static Unit GramPerSquareMetre;

	/** The gal is a unit of acceleration defined as centimetre per second (time) squared. */
	public final static Unit Gal;

	/** The kip is a unit of force defined as 4.448222e3 newton. */
	public final static Unit Kip;

	public final static Unit Kilotesla;

	/** The centicandela is a unit of luminous intensity defined as 1.0e-2 candela. */
	public final static Unit Centicandela;

	/** The hectohenry is a unit of inductance defined as 1.0e2 henry. */
	public final static Unit Hectohenry;

	public final static Unit Microlitre;

	public final static Unit YoctosecondTimeSquared;

	public final static Unit Centinewton;

	public final static Unit Zeptomole;

	/** The megabecquerel is a unit of activity defined as 1.0e6 becquerel. */
	public final static Unit Megabecquerel;

	public final static Unit Microwatt;

	/** The decagray is a unit of absorbed dose defined as 1.0e1 gray. */
	public final static Unit Decagray;

	/** The kiloelectronvolt is a unit of energy defined as 1.0e3 electronvolt. */
	public final static Unit Kiloelectronvolt;

	public final static Unit MegasecondTime;

	/** Gram per femtolitre is a unit of density defined as gram divided by femtolitre. */
	public final static Unit GramPerFemtolitre;

	/** The watt is a unit of power defined as joule divided by second = newton times metre divided by second = volt times ampere = kilogram times square metre divided by second to the power 3. */
	public final static Unit Watt;

	/** The millijoule is a unit of energy defined as 1.0e-3 joule. */
	public final static Unit Millijoule;

	/** The mean calorie is a unit of energy defined as 4.19002 joule. */
	public final static Unit CalorieMean;

	/** Metre per nanosecond is a unit of speed defined as metre divided by nanosecond. */
	public final static Unit MetrePerNanosecondTime;

	public final static Unit Decamole;

	/** Petamole per litre is a unit of amount of substance concentration defined as petamole divided by litre. */
	public final static Unit PetamolePerLitre;

	public final static Unit Yobibyte;

	/** The decibar is a unit of pressure defined as 1.0e-1 bar. */
	public final static Unit Decibar;

	/** The microgray is a unit of absorbed dose defined as 1.0e-6 gray. */
	public final static Unit Microgray;

	/** The zeptgram is a unit of mass defined as 1.0e-21 gram. */
	public final static Unit Zeptogram;

	public final static Unit Zettanewton;

	/** Mole per nanolitre is a unit of amount of substance concentration defined as mole divided by nanolitre. */
	public final static Unit MolePerNanolitre;

	/** The yoctogram is a unit of mass defined as 1.0e-24 gram. */
	public final static Unit Yoctogram;

	/** Eenheid waarmee de helderheid van sterren wordt aangegeven. Meestal wordt het symbool niet aangeduid (http://en.wikipedia.org/wiki/Magnitude_(astronomy)). */
	public final static Unit Magnitude;

	public final static Unit Decilux;

	/** Gram per teralitre is a unit of density defined as gram divided by teralitre. */
	public final static Unit GramPerTeralitre;

	public final static Unit SteradianSquareMetre;

	/** Yottamole per litre is a unit of amount of substance concentration defined as yottamole divided by litre. */
	public final static Unit YottamolePerLitre;

	public final static Unit Gigabit;

	/** The millibar is a unit of pressure defined as 1.0e-3 bar. */
	public final static Unit Millibar;

	public final static Unit MillinewtonMetre;

	/** The mil (plane angle) is a unit of plane angle defined as 9.817477e-4 radian. */
	public final static Unit MilPlaneAngle;

	/** The sidereal day is a unit of time defined as 8.616409e4 second. */
	public final static Unit DaySidereal;

	public final static Unit Millilux;

	public final static Unit MolePerKilogram;

	/** Kilometre per hour is a unit of speed defined as kilometre divided by hour. */
	public final static Unit KilometrePerHour;

	public final static Unit YottasecondTimeSquared;

	public final static Unit Gigamole;

	public final static Unit Decipascal;

	public final static Unit Yoctosteradian;

	public final static Unit Femtosteradian;

	public final static Unit CubicZettametre;

	public final static Unit Megatesla;

	/** The examolair is a unit of amount of substance concentration defined as 1.0e18 molair. */
	public final static Unit Examolair;

	/** The percent is a unit of dimension one defined as 1/100. */
	public final static Unit Percent;

	/** Mole per zettalitre is a unit of amount of substance concentration defined as mole divided by zettalitre. */
	public final static Unit MolePerZettalitre;

	/** The picohenry is a unit of inductance defined as 1.0e-12 henry. */
	public final static Unit Picohenry;

	public final static Unit KilogramPerPascalSecondTimeSquareMetre;

	/** The slug is a unit of mass defined as 1.459390e1 kilogram. */
	public final static Unit Slug;

	public final static Unit Decaweber;

	public final static Unit Micromole;

	/** Gram per attolitre is a unit of density defined as gram divided by attolitre. */
	public final static Unit GramPerAttolitre;

	/** The zettajoule is a unit of energy defined as 1.0e21 joule. */
	public final static Unit Zettajoule;

	/** Picometre per second is a unit of speed defined as picometre divided by second. */
	public final static Unit PicometrePerSecondTime;

	/** The zettafarad is a unit of capacitance defined as 1.0e21 farad. */
	public final static Unit Zettafarad;

	/** The zettametre is a unit of length defined as 1.0e21 metre. */
	public final static Unit Zettametre;

	public final static Unit CubicExametre;

	/** The zeptgray is a unit of absorbed dose defined as 1.0e-21 gray. */
	public final static Unit Zeptogray;

	public final static Unit Decilitre;

	public final static Unit MolePerCentimetre;

	public final static Unit NorwegianKrone;

	/** The US gill is a unit of volume defined as 1.182941e-4 cubic metre. */
	public final static Unit GillUS;

	public final static Unit Nanoradian;

	public final static Unit ReciprocalCubicParsec;

	public final static Unit KilogramSquareMetre;

	/** Petagram per litre is a unit of density defined as petagram divided by litre. */
	public final static Unit PetagramPerLitre;

	public final static Unit DeltaA450;

	/** Mole per petalitre is a unit of amount of substance concentration defined as mole divided by petalitre. */
	public final static Unit MolePerPetalitre;

	/** The coulomb is a unit of electric charge defined as ampere times second = farad times volt. */
	public final static Unit Coulomb;

	public final static Unit CubicTerametre;

	/** The micron is a unit of length defined as 1.0e-6 metre. */
	public final static Unit Micron;

	public final static Unit AmperePerVolt;

	public final static Unit Decapascal;

	public final static Unit GigasecondTime;

	public final static Unit Yoctoweber;

	public final static Unit RadianPerSecondTimeSquared;

	/** The US therm is a unit of energy defined as 1.054804e8 joule. */
	public final static Unit ThermUS;

	public final static Unit Decilumen;

	public final static Unit Yottaweber;

	/** The exacandela is a unit of luminous intensity defined as 1.0e18 candela. */
	public final static Unit Exacandela;

	public final static Unit ReciprocalSquareCentimetre;

	public final static Unit CubicKiloparsec;

	public final static Unit SquareMetreDay;

	public final static Unit SquareCentimetre;

	/** The degree Réaumur is a unit of temperature defined as 1.25 kelvin. */
	public final static Unit DegreeReaumur;

	/** The radian is a unit of plane angle defined as the plane angle subtended at the center of a circle by an arc that is equal in length to the radius of the circle. */
	public final static Unit Radian;

	/** The hectocoulomb is a unit of electric charge defined as 1.0e2 coulomb. */
	public final static Unit Hectocoulomb;

	/** Examole per litre is a unit of amount of substance concentration defined as examole divided by litre. */
	public final static Unit ExamolePerLitre;

	public final static Unit Centiweber;

	/** The microgram is a unit of mass defined as 1.0e-6 gram. */
	public final static Unit Microgram;

	/** The exajoule is a unit of energy defined as 1.0e18 joule. */
	public final static Unit Exajoule;

	/** Metre per yoctosecond squared is a unit of acceleration defined as metre divided by yoctosecond squared. */
	public final static Unit MetrePerYoctosecondTimeSquared;

	/** The ångström is a unit of length defined as 1.0e-10 metre. The unit is often used for wavelengths of electromagnetic radiation or to express the sizes of atoms and molecules. */
	public final static Unit Angstrom;

	public final static Unit Yottanewton;

	public final static Unit Milliweber;

	public final static Unit DeltaA450PerSecondTimePerMilligram;

	public final static Unit WattSquareMetre;

	/** The yottabecquerel is a unit of activity defined as 1.0e24 becquerel. */
	public final static Unit Yottabecquerel;

	/** The furlong is a unit of length defined as 201.168 metre. */
	public final static Unit Furlong;

	public final static Unit GigamolePerMetre;

	public final static Unit Gigabyte;

	public final static Unit WeberPerAmpere;

	public final static Unit Petalux;

	public final static Unit CubicCentimetre;

	public final static Unit SquareYoctometre;

	public final static Unit MoleMicrometreReciprocalSquareCentimetreReciprocalSecondTimeReciprocalAtmosphereStandard;

	/** The yottakatal is a unit of catalytic activity defined as 1.0e24 katal. */
	public final static Unit Yottakatal;

	public final static Unit Femtoradian;

	/** Metre per attosecond is a unit of speed defined as metre divided by attosecond. */
	public final static Unit MetrePerAttosecondTime;

	/** The yottamolair is a unit of amount of substance concentration defined as 1.0e24 molair. */
	public final static Unit Yottamolair;

	public final static Unit SquareMillimetre;

	public final static Unit SquareTerametre;

	public final static Unit SecondTimePerDay;

	public final static Unit Zettatesla;

	/** Solar luminosity is a unit used in astronomy to denote stellar or galactic radiant fluxes (http://en.wikipedia.org/wiki/Solar_luminosity). */
	public final static Unit SolarLuminosity;

	/** The megajoule is a unit of energy defined as 1.0e6 joule. */
	public final static Unit Megajoule;

	/** The 0 °C perm is a unit ofpermeance defined as 5.72135e-11 kilogram per pascal second (time) square metre. */
	public final static Unit Perm0C;

	/** Metre per zettasecond is a unit of speed defined as metre divided by zettasecond. */
	public final static Unit MetrePerZettasecondTime;

	/** The US survey foot is a unit of length defined as 3.048006e-1 metre. */
	public final static Unit FootUSSurvey;

	public final static Unit GramMetreToThePower2ReciprocalMetre;

	/** Centigram per litre is a unit of density defined as centigram divided by litre. */
	public final static Unit CentigramPerLitre;

	public final static Unit Microvolt;

	/** The yard is a unit of length defined as 9.144e-1 metre. */
	public final static Unit Yard;

	public final static Unit KilocolonyFormingUnit;

	/** The yoctokatal is a unit of catalytic activity defined as 1.0e-24 katal. */
	public final static Unit Yoctokatal;

	/** Exagram per litre is a unit of density defined as exagram divided by litre. */
	public final static Unit ExagramPerLitre;

	public final static Unit Yottaohm;

	/** Gigagram per litre is a unit of density defined as gigagram divided by litre. */
	public final static Unit GigagramPerLitre;

	public final static Unit JoulePerKilogram;

	/** The megametre is a unit of length defined as 1.0e6 metre. */
	public final static Unit Megametre;

	/** The megaampere is a unit of electric current defined as 1.0e6 ampere. */
	public final static Unit Megaampere;

	public final static Unit TonnePerCubicMetre;

	/** The ton of TNT is a unit of energy defined as 4.184e9 joule. */
	public final static Unit TonOfTNT;

	/** The hectare is a unit of area defined as 1.0e2 are. */
	public final static Unit Hectare;

	public final static Unit Terawatt;

	public final static Unit Picoohm;

	/** The centidegree Celsius is a unit of temperature defined as 1.0e-2 degree Celsius. */
	public final static Unit CentidegreeCelsius;

	/** The shannon is a unit of information capacity defined as 1 bit. */
	public final static Unit Shannon;

	/** The picobecquerel is a unit of activity defined as 1.0e-12 becquerel. */
	public final static Unit Picobecquerel;

	/** The decakatal is a unit of catalytic activity defined as 1.0e1 katal. */
	public final static Unit Decakatal;

	public final static Unit Nanoohm;

	/** Gram per centilitre is a unit of density defined as gram divided by centilitre. */
	public final static Unit GramPerCentilitre;

	/** The gamma is a unit of magnetic flux density defined as 1.0e-9 tesla. */
	public final static Unit Gamma;

	public final static Unit Teraweber;

	/** Teramole per litre is a unit of amount of substance concentration defined as teramole divided by litre. */
	public final static Unit TeramolePerLitre;

	public final static Unit Exanewton;

	/** The poundal is a unit of force defined as 1.382550e-1 newton. */
	public final static Unit Poundal;

	/** The zeptbecquerel is a unit of activity defined as 1.0e-21 becquerel. */
	public final static Unit Zeptobecquerel;

	/** Mole per attolitre is a unit of amount of substance concentration defined as mole divided by attolitre. */
	public final static Unit MolePerAttolitre;

	public final static Unit NanounifiedAtomicMassUnit;

	public final static Unit VoltSecondTime;

	/** The attoampere is a unit of electric current defined as 1.0e-18 ampere. */
	public final static Unit Attoampere;

	/** The gigaparsec is a unit of length defined as 1.0e9 parsec. Gebruikt voor de afstand op de schaal van het heelal. */
	public final static Unit Gigaparsec;

	public final static Unit SquareMetrePerGram;

	/** The gigametre is a unit of length defined as 1.0e9 metre. */
	public final static Unit Gigametre;

	/** The nanokatal is a unit of catalytic activity defined as 1.0e-9 katal. */
	public final static Unit Nanokatal;

	/** The zepthenry is a unit of inductance defined as 1.0e-21 henry. */
	public final static Unit Zeptohenry;

	/** Exametre per second squared is a unit of acceleration defined as exametre divided by second squared. */
	public final static Unit ExametrePerSecondTimeSquared;

	public final static Unit KilogramPerSquareMetre;

	public final static Unit MolePerDecimetre;

	public final static Scale KelvinScale;

	/** Gram per cubic metre is a unit of density defined as gram divided by cubic metre. */
	public final static Unit GramPerCubicMetre;

	/** The fathom is a unit of length defined as 1.828804 metre. */
	public final static Unit Fathom;

	public final static Unit Meganewton;

	public final static Unit Exabyte;

	public final static Unit Micropascal;

	public final static Unit Decaohm;

	public final static Unit Gigapascal;

	/** The statampere is a unit of electric current defined as 3.335641e-10 ampere. */
	public final static Unit Statampere;

	public final static Unit Centisievert;

	/** Metre per gigasecond is a unit of speed defined as metre divided by gigasecond. */
	public final static Unit MetrePerGigasecondTime;

	public final static Unit Kilopascal;

	/** The 20 °C calorie is a unit of energy defined as 4.18190 joule. */
	public final static Unit Calorie20C;

	/** The kiloparsec is a unit of length defined as 1.0e3 parsec. Gebruikt voor afstanden op de schaal van het melkwegstelsel. */
	public final static Unit Kiloparsec;

	/** The second (plane angle) is a unit of plane angle defined as 4.848137e-6 radian. */
	public final static Unit SecondPlaneAngle;

	/** Gigametre per second squared is a unit of acceleration defined as gigametre divided by second squared. */
	public final static Unit GigametrePerSecondTimeSquared;

	/** The attokelvin is a unit of temperature defined as 1.0e-18 kelvin. */
	public final static Unit Attokelvin;

	public final static Unit HectosecondTime;

	public final static Unit Hectolumen;

	/** The avoirdupois ounce is a unit of mass defined as 2.834952e-2 kilogram. */
	public final static Unit OunceAvoirdupois;

	public final static Unit MolePerPicometre;

	public final static Unit Picolumen;

	public final static Unit Teramole;

	/** Zeptogram per litre is a unit of density defined as zeptogram divided by litre. */
	public final static Unit ZeptogramPerLitre;

	/** Metre per yottasecond squared is a unit of acceleration defined as metre divided by yottasecond squared. */
	public final static Unit MetrePerYottasecondTimeSquared;

	public final static Unit LitrePerMole;

	/** The decihertz is a unit of frequency defined as 1.0e-1 hertz. */
	public final static Unit Decihertz;

	/** The gigafarad is a unit of capacitance defined as 1.0e9 farad. */
	public final static Unit Gigafarad;

	public final static Unit Microlumen;

	public final static Unit Yottabit;

	public final static Unit VoltPerAmpere;

	/** The Didot point is a unit of length defined as 0.3759e-3 metre. */
	public final static Unit PointDidot;

	/** Attometre per second squared is a unit of acceleration defined as attometre divided by second squared. */
	public final static Unit AttometrePerSecondTimeSquared;

	/** The megakelvin is a unit of thermodynamic temperature defined as 1.0e6 kelvin. */
	public final static Unit Megakelvin;

	/** The centimolair is a unit of amount of substance concentration defined as 1.0e-2 molair. */
	public final static Unit Centimolair;

	public final static Unit Kilotonne;

	public final static Unit Petabyte;

	public final static Unit Decisiemens;

	/** The gigajoule is a unit of energy defined as 1.0e9 joule. */
	public final static Unit Gigajoule;

	/** The hartley is a unit of information capacity defined as 3.321928095 bit. */
	public final static Unit Hartley;

	public final static Unit Exalux;

	/** The bushel is a unit of volume defined as 3.523907e-2 cubic metre. */
	public final static Unit Bushel;

	public final static Unit Picopascal;

	/** Metre per millisecond squared is a unit of acceleration defined as metre divided by millisecond squared. */
	public final static Unit MetrePerMillisecondTimeSquared;

	public final static Unit FemtosecondTimeSquared;

	public final static Unit Centisiemens;

	/** The petahenry is a unit of inductance defined as 1.0e15 henry. */
	public final static Unit Petahenry;

	/** The cicero is a unit of length defined as 12 point (Didot). */
	public final static Unit Cicero;

	public final static Unit SquareMegametre;

	/** The stere is a unit of volume defined as cubic metre. */
	public final static Unit Stere;

	/** The rad is a unit of absorbed dose defined as 1.0e-2 gray. */
	public final static Unit Rad;

	public final static Unit Kilobyte;

	/** Metre per centisecond is a unit of speed defined as metre divided by centisecond. */
	public final static Unit MetrePerCentisecondTime;

	/** The pound-force is a unit of force defined as 4.448222 newton. */
	public final static Unit PoundForce;

	/** The register ton is a unit of volume defined as 2.831658 cubic metre. */
	public final static Unit TonRegister;

	public final static Unit GigayearCubicKiloparsec;

	public final static Unit Femtolux;

	public final static Unit InternationalUnit;



	static {
		Sievert = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/sievert", "sievert", "Sv", null);
		Decasievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decasievert","decasievert","daSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Volt = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/volt", "volt", "V", null);
		Statvolt =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/statvolt", "statvolt", "statV", Volt, 299.7925 );
		Metre = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre", "metre", "m", nl.wur.fbr.om.model.dimensions.SIBaseDimension.LENGTH);
		Megametre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megametre","megametre","Mm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		SecondTime = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/second-time", "second", "s", nl.wur.fbr.om.model.dimensions.SIBaseDimension.TIME);
		MegametrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/megametre_per_second-time","megametre per second","Mm/s",Megametre, SecondTime);
		Hertz = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hertz", "hertz", "Hz", null);
		Attohertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attohertz","attohertz","aHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Gray = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gray", "gray", "Gy", null);
		Petagray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petagray","petagray","PGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Terametre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terametre","terametre","Tm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		YottasecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottasecond-time","yottasecond","Ys",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		MetrePerYottasecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_yottasecond-time","metre per yottasecond","m/Ys",Metre, YottasecondTime);
		Yoctosievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctosievert","yoctosievert","ySv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Siemens = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/siemens", "siemens", "S", null);
		Gigasiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigasiemens","gigasiemens","GS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		DecasecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decasecond-time","decasecond","das",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		DecasecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/decasecond-time_squared","decasecond squared","das2",DecasecondTime, 2.0);
		MicrosecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microsecond-time","microsecond","μs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		MicrosecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/microsecond-time_squared","microsecond squared","μs2",MicrosecondTime, 2.0);
		MetrePerMicrosecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_microsecond-time_squared","metre per microsecond squared","m/μs2",Metre, MicrosecondTimeSquared);
		Jansky = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/jansky", "jansky", "Jy", null);
		Bit = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/bit", "bit", "bit", null);
		Zebibit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zebibit","zebibit","Zibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.ZEBI);
		Gram =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram", "gram", "g" );
		Kilogram = new PrefixedBaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram","kilogram","kg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO, nl.wur.fbr.om.model.dimensions.SIBaseDimension.MASS);
		OunceApothecaries =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/ounce-apothecaries", "ounce (apothecaries')", "oz (ap.)", Kilogram, 0.03110348 );
		Ampere = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/ampere", "ampere", "A", nl.wur.fbr.om.model.dimensions.SIBaseDimension.ELECTRIC_CURRENT);
		AmperePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/ampere_per_metre","ampere per metre","A/m",Ampere, Metre);
		Oersted =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/oersted", "oersted", "Oe", AmperePerMetre, 79.57747 );
		Henry = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/henry", "henry", "H", null);
		Yoctohenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctohenry","yoctohenry","yH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Weber = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/weber", "weber", "Wb", null);
		Gigaweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigaweber","gigaweber","GWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Zettagram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettagram","zettagram","ZG",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		CubicMetre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_metre","cubic metre","m3",Metre, 3.0);
		Litre =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/litre", "litre", "l", CubicMetre, 0.001 );
		ZettagramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettagram_per_litre","zettagram per litre","Zg/l",Zettagram, Litre);
		Microhertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microhertz","microhertz","μHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Joule = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/joule", "joule", "J", null);
		Yottajoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottajoule","yottajoule","YJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		MegasecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megasecond-time","megasecond","Ms",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		MegasecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/megasecond-time_squared","megasecond squared","Ms2",MegasecondTime, 2.0);
		MetrePerMegasecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_megasecond-time_squared","metre per megasecond squared","m/Ms2",Metre, MegasecondTimeSquared);
		Katal = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/katal", "katal", "kat", null);
		Gigakatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigakatal","gigakatal","Gkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Kelvin = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kelvin", "kelvin", "K", nl.wur.fbr.om.model.dimensions.SIBaseDimension.THERMODYNAMIC_TEMPERATURE);
		Decakelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decakelvin","decakelvin","daK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Megasiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megasiemens","megasiemens","MS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Petaampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petaampere","petaampere","PA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Yoctolitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctolitre","yoctolitre","yl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		GramPerYoctolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_yoctolitre","gram per yoctolitre","g/yl",Gram, Yoctolitre);
		Picokatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picokatal","picokatal","pkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Lux = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/lux", "lux", "lx", null);
		Kilolux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilolux","kilolux","klx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		HectosecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectosecond-time","hectosecond","hs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		HectosecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectosecond-time_squared","hectosecond squared","hs2",HectosecondTime, 2.0);
		MetrePerHectosecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_hectosecond-time_squared","metre per hectosecond squared","m/hs2",Metre, HectosecondTimeSquared);
		Picoweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picoweber","picoweber","pWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Decisievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decisievert","decisievert","dSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Candela = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/candela", "candela", "cd", nl.wur.fbr.om.model.dimensions.SIBaseDimension.LUMINOUS_INTENSITY);
		Steradian = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/steradian", "steradian", "sr", null);
		CandelaSteradian = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/candela_steradian","candela steradian","cd sr",Candela, Steradian);
		Micrometre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/micrometre","micrometre","μm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		SquareMicrometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_micrometre","square micrometre","μm2",Micrometre, 2.0);
		Becquerel = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/becquerel", "becquerel", "Bq", null);
		Hectobecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectobecquerel","hectobecquerel","hBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Petagram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petagram","petagram","Pg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		CubicMegametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_megametre","cubic megametre","Mm3",Megametre, 3.0);
		DecisecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decisecond-time","decisecond","ds",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Tesla = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/tesla", "tesla", "T", null);
		PoundAvoirdupois =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/pound-avoirdupois", "pound (avoirdupois)", "lb", Kilogram, 0.4535924 );
		Mole = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole", "mole", "mol", nl.wur.fbr.om.model.dimensions.SIBaseDimension.AMOUNT_OF_SUBSTANCE);
		Femtomole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtomole","femtomole","fmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		FemtomolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtomole_per_metre","femtomole per metre","fmol/m",Femtomole, Metre);
		Kilolitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilolitre","kilolitre","kl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Yottametre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottametre","yottametre","Ym",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Exasievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exasievert","exasievert","ESv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Molair = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/molair", "molair", "M", null);
		Petamolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petamolair","petamolair","PM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Pascal = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/pascal", "pascal", "Pa", null);
		MetreOfMercury =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_of_mercury", "metre of mercury", "m Hg", Pascal, 133.322 );
		MillimetreOfMercury = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millimetre_of_mercury","millimetre of mercury","mm Hg",(SingularUnit)MetreOfMercury, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Nanolitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanolitre","nanolitre","nl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		GramPerNanolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_nanolitre","gram per nanolitre","g/nl",Gram, Nanolitre);
		Inch =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/inch", "inch", "in", Metre, 0.0254 );
		Megabit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megabit","megabit","Mbit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		PicosecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picosecond-time","picosecond","ps",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		SquareMetre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_metre","square metre","m2",Metre, 2.0);
		SquareMetrePerSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_metre_per_square_metre","square metre per square metre","m2/m2",SquareMetre, SquareMetre);
		Day =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/day", "day", "d", SecondTime, 86400.0 );
		SquareMetrePerSquareMetreDay = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_metre_per_square_metre_day","square metre per square metre day","m2/(m2 d)",SquareMetrePerSquareMetre, Day);
		Nanopascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanopascal","nanopascal","nPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Tonne =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/tonne", "tonne", "t", Kilogram, 1000.0 );
		Are =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/are", "are", "a", SquareMetre, 100.0 );
		Hectare = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectare","hectare","ha",(SingularUnit)Are, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		TonnePerHectare = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/tonne_per_hectare","tonne per hectare","t/ha",Tonne, Hectare);
		Megasievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megasievert","megasievert","MSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Hectolitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectolitre","hectolitre","hl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Hectometre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectometre","hectometre","hm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		SecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/second-time_squared","second squared","s2",SecondTime, 2.0);
		HectometrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectometre_per_second-time_squared","hectometre per second squared","hm/s2",Hectometre, SecondTimeSquared);
		BritishThermalUnitInternationalTable =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/British_thermal_unit-International_Table", "British thermal unit (International Table)", "Btu_IT", Joule, 1055.056 );
		DegreeCelsius = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/degree_Celsius", "degree Celsius", "°C", nl.wur.fbr.om.model.dimensions.SIBaseDimension.THERMODYNAMIC_TEMPERATURE);
		Hour =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hour", "hour", "h", SecondTime, 3600.0 );
		DegreeCelsiusPerHour = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/degree_Celsius_per_hour","degree Celsius per hour","°C/h",DegreeCelsius, Hour);
		Centimetre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centimetre","centimetre","cm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		CubicCentimetre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_centimetre","cubic centimetre","cm3",Centimetre, 3.0);
		GramPerCubicCentimetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_cubic_centimetre","gram per cubic centimetre","g/cm3",Gram, CubicCentimetre);
		Exatesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exatesla","exatesla","ET",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Centikelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centikelvin","centikelvin","cK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Exakelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exakelvin","exakelvin","EK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Gigasievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigasievert","gigasievert","GSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Millimole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millimole","millimole","mmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MillimolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/millimole_per_metre","millimole per metre","mmol/m",Millimole, Metre);
		Radian = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/radian", "radian", "rad", null);
		Gon =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gon", "gon", "gon", Radian, 0.01570796 );
		MolePerMicrometre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_micrometre","mole per micrometre","mol/μm",Mole, Micrometre);
		Zettapascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettapascal","zettapascal","ZPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Millivolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millivolt","millivolt","mV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Petamole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petamole","petamole","Pmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Exasiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exasiemens","exasiemens","ES",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Centihenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centihenry","centihenry","cH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Farad = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/farad", "farad", "F", null);
		Megafarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megafarad","megafarad","MF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Rem =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/rem", "rem", "rem", Sievert, 0.01 );
		ReciprocalHenry = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_henry","reciprocal henry","H-1",Henry, -1.0);
		Femtocandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtocandela","femtocandela","fcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Teratesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teratesla","teratesla","TT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Zeptolitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptolitre","zeptolitre","zl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Decahertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decahertz","decahertz","daHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Exametre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exametre","exametre","Em",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		SquareExametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_exametre","square exametre","Em2",Exametre, 2.0);
		Zeptocandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptocandela","zeptocandela","zcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		CircularMil =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/circular_mil", "circular mil", "null", SquareMetre, 5.067075E-10 );
		Exalitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exalitre","exalitre","El",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		MolePerExalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_exalitre","mole per exalitre","mol/El",Mole, Exalitre);
		AstronomicalUnit =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/astronomical_unit", "astronomical unit", "au", Metre, 1.495978707E11 );
		KelvinKilogram = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/kelvin_kilogram","kelvin kilogram","K kg",Kelvin, Kilogram);
		DegreeRankine =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/degree_Rankine", "degree Rankine", "°R", Kelvin, 0.5555556 );
		KelvinScale = new ScaleImpl("http://www.wurvoc.org/vocabularies/om-1.8/Kelvin_scale","Kelvin scale","null", Kelvin);
		RankineScale = new ScaleImpl("http://www.wurvoc.org/vocabularies/om-1.8/Rankine_scale","Rankine scale","null",KelvinScale, 0.0, 1.8, DegreeRankine);
		Exavolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exavolt","exavolt","EV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		MillisecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millisecond-time","millisecond","ms",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Zettasiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettasiemens","zettasiemens","ZS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Millisteradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millisteradian","millisteradian","msr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Decihenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decihenry","decihenry","dH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Nanoweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanoweber","nanoweber","nWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Biot =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/biot", "biot", "Bi", Ampere, 10.0 );
		One = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/one", "one", "1", null);
		PartsPerMillion =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/parts_per_million", "parts per million", "ppm", One, 1.0E-6 );
		Abampere =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/abampere", "abampere", "abA", Ampere, 10.0 );
		Zettasievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettasievert","zettasievert","ZSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Yottatesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottatesla","yottatesla","YT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Terajoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terajoule","terajoule","TJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Watt = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt", "watt", "W", null);
		Milliwatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/milliwatt","milliwatt","mW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		DegreeCelsiusDay = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/degree_Celsius_day","degree Celsius day","°C d",DegreeCelsius, Day);
		ReciprocalDegreeCelsiusDay = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_degree_Celsius_day","reciprocal degree Celsius day","(°C d)-1",DegreeCelsiusDay, -1.0);
		JapaneseYen = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/Japanese_yen", "Japanese yen", "null", null);
		Year =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/year", "year", "a", SecondTime, 3.1536E7 );
		Gigayear = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigayear","gigayear","Gyr",(SingularUnit)Year, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		DryGallonUS =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/dry_gallon-US", "dry gallon (US)", "gal", CubicMetre, 0.00440488377086 );
		Foot =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/foot", "foot", "ft", Metre, 0.3048 );
		Byte =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/byte", "byte", "B", Bit, 8.0 );
		Exbibyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exbibyte","exbibyte","EiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.EXBI);
		Coulomb = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/coulomb", "coulomb", "C", null);
		Nanocoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanocoulomb","nanocoulomb","nC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		ReciprocalYear = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_year","reciprocal year","a-1",Year, -1.0);
		Statfarad =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/statfarad", "statfarad", "statF", Farad, 1.11265E-12 );
		Femtometre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtometre","femtometre","fm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		FemtometrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtometre_per_second-time","femtometre per second","fm/s",Femtometre, SecondTime);
		Femtopascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtopascal","femtopascal","fPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Centimole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centimole","centimole","cmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		CentimolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/centimole_per_metre","centimole per metre","cmol/m",Centimole, Metre);
		Deciradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/deciradian","deciradian","drad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Picolitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picolitre","picolitre","pl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		GramPerPicolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_picolitre","gram per picolitre","g/pl",Gram, Picolitre);
		Megawatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megawatt","megawatt","MW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Micromole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/micromole","micromole","μmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		MicromolePerMole = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/micromole_per_mole","micromole per mole","μmol/mol",Micromole, Mole);
		Erg =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/erg", "erg", "erg", Joule, 1.0E-7 );
		ErgSecondTime = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/erg_second-time","erg second","erg s",Erg, SecondTime);
		Millilitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millilitre","millilitre","ml",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MolePerMillilitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_millilitre","mole per millilitre","mol/ml",Mole, Millilitre);
		SecondTimeToThePower2 = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/second-time_to_the_power_-2","second to the power -2","s-2",SecondTime, -2.0);
		NanosecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanosecond-time","nanosecond","ns",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		NanosecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanosecond-time_squared","nanosecond squared","ns2",NanosecondTime, 2.0);
		ZeptosecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptosecond-time","zeptosecond","zs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Attohenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attohenry","attohenry","aH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Milligray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/milligray","milligray","mGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Millimetre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millimetre","millimetre","mm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		CubicMillimetre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_millimetre","cubic millimetre","mm3",Millimetre, 3.0);
		Hectomolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectomolair","hectomolair","hM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Yottakelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottakelvin","yottakelvin","YK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		PascalSecondTime = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/pascal_second-time","pascal second","Pa s",Pascal, SecondTime);
		ReciprocalPascalSecondTime = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_pascal_second-time","reciprocal pascal second","Pa-1 s-1",PascalSecondTime, -1.0);
		Rhe =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/rhe", "rhe", "null", ReciprocalPascalSecondTime, 10.0 );
		JoulePerSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/joule_per_square_metre","joule per square metre","J/m2",Joule, SquareMetre);
		PetasecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petasecond-time","petasecond","Ps",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		PetasecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/petasecond-time_squared","petasecond squared","Ps2",PetasecondTime, 2.0);
		MetrePerPetasecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_petasecond-time_squared","metre per petasecond squared","m/Ps2",Metre, PetasecondTimeSquared);
		Milligram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/milligram","milligram","mg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Kilometre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilometre","kilometre","km",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		MolePerKilometre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_kilometre","mole per kilometre","mol/km",Mole, Kilometre);
		Lumen = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/lumen", "lumen", "lm", nl.wur.fbr.om.model.dimensions.SIBaseDimension.LUMINOUS_INTENSITY);
		Kilolumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilolumen","kilolumen","klm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Yoctosiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctosiemens","yoctosiemens","yS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Zeptolumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptolumen","zeptolumen","zlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Terafarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terafarad","terafarad","TF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Exabit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exabit","exabit","Ebit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		MetrePerMegasecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_megasecond-time","metre per megasecond","m/Ms",Metre, MegasecondTime);
		Stattesla =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/stattesla", "stattesla", "statT", Tesla, 2997900.0 );
		Zeptoradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptoradian","zeptoradian","zrad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Yoctohertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctohertz","yoctohertz","yHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		YoctodegreeCelsius = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctodegree_Celsius","yoctodegree Celsius","y°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Teragram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teragram","teragram","Tg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		TeragramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/teragram_per_litre","teragram per litre","Tg/l",Teragram, Litre);
		MolePerMegametre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_megametre","mole per megametre","mol/Mm",Mole, Megametre);
		Microhenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microhenry","microhenry","μH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Yottaampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottaampere","yottaampere","YA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Zettamole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettamole","zettamole","Zmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		ZettamolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettamole_per_litre","zettamole per litre","Zmol/l",Zettamole, Litre);
		Zettabecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettabecquerel","zettabecquerel","ZBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Decametre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decametre","decametre","dam",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		DecametrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/decametre_per_second-time","decametre per second","dam/s",Decametre, SecondTime);
		Decalitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decalitre","decalitre","dal",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		MolePerDecalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_decalitre","mole per decalitre","mol/dal",Mole, Decalitre);
		Microcoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microcoulomb","microcoulomb","μC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		KilocolonyFormingUnitPerMillilitre = null;
		Megamole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megamole","megamole","Mmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Petavolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petavolt","petavolt","PV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Nanometre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanometre","nanometre","nm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		WattPerNanometre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_per_nanometre","watt per nanometre","W/nm",Watt, Nanometre);
		Yoctoradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctoradian","yoctoradian","yrad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Decalumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decalumen","decalumen","dalm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		LiquidQuartUS =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/liquid_quart-US", "liquid quart (US)", "liq qt", CubicMetre, 9.463529E-4 );
		KilometrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilometre_per_second-time","kilometre per second","km/s",Kilometre, SecondTime);
		Parsec =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/parsec", "parsec", "pc", Metre, 3.08567802E16 );
		Megaparsec = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megaparsec","megaparsec","Mpc",(SingularUnit)Parsec, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		KilometrePerSecondTimePerMegaparsec = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilometre_per_second-time_per_megaparsec","kilometre per second per megaparsec","km s-1 Mpc-1",KilometrePerSecondTime, Megaparsec);
		MegaeuroPerMegawatt = null;
		CubicKilometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_kilometre","cubic kilometre","km3",Kilometre, 3.0);
		Centikatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centikatal","centikatal","ckat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Petacoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petacoulomb","petacoulomb","PC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Hectovolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectovolt","hectovolt","hV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Kilovolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilovolt","kilovolt","kV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Terasiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terasiemens","terasiemens","TS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Petalitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petalitre","petalitre","Pl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		GramPerPetalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_petalitre","gram per petalitre","g/Pl",Gram, Petalitre);
		SolarMass =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/solar_mass", "solar mass", "M_☉", Kilogram, 1.98892E30 );
		CubicParsec = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_parsec","cubic parsec","pc3",Parsec, 3.0);
		GigayearCubicParsec = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigayear_cubic_parsec","gigayear cubic parsec","Gyr pc3",Gigayear, CubicParsec);
		SolarMassPerGigayearCubicParsec = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/solar_mass_per_gigayear_cubic_parsec","solar mass per gigayear cubic parsec","M_☉/(Gyr pc3)",SolarMass, GigayearCubicParsec);
		Exagray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exagray","exagray","EGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Magnitude = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/magnitude", "magnitude", "mag", null);
		SecondPlaneAngle =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/second-plane_angle", "second (plane angle)", "\"", Radian, 4.848137E-6 );
		SecondPlaneAngleSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/second-plane_angle_squared","second (plane angle) squared","arcsec2",SecondPlaneAngle, 2.0);
		MagnitudePerSecondPlaneAngleSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/magnitude_per_second-plane_angle_squared","magnitude per second (plane angle) squared","mag/arcsec2",Magnitude, SecondPlaneAngleSquared);
		Centilitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centilitre","centilitre","cl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		MolePerCentilitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_centilitre","mole per centilitre","mol/cl",Mole, Centilitre);
		Megalitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megalitre","megalitre","Ml",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Attolumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attolumen","attolumen","alm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		KilosecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilosecond-time","kilosecond","ks",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		MetrePerKilosecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_kilosecond-time","metre per kilosecond","m/ks",Metre, KilosecondTime);
		Zettalux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettalux","zettalux","Zlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Exagram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exagram","exagram","Eg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		ThermEC =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/therm-EC", "therm (EC)", "null", Joule, 1.05506E8 );
		MolePerCubicMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_cubic_metre","mole per cubic metre","mol/m3",Mole, CubicMetre);
		Hectogram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectogram","hectogram","hg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		HectogramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectogram_per_litre","hectogram per litre","hg/l",Hectogram, Litre);
		Kilofarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilofarad","kilofarad","kF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		FluidOunceUS =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/fluid_ounce-US", "fluid ounce (US)", "fl oz", CubicMetre, 2.957353E-5 );
		Megamolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megamolair","megamolair","MM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Decawatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decawatt","decawatt","daW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Kilobit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilobit","kilobit","kbit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Examole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/examole","examole","Emol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		ExamolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/examole_per_metre","examole per metre","Emol/m",Examole, Metre);
		Terasievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terasievert","terasievert","TSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		SquareMetreKelvin = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_metre_kelvin","square metre kelvin","m2 K",SquareMetre, Kelvin);
		Petaweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petaweber","petaweber","PWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		CubicCentimetrePerCubicCentimetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_centimetre_per_cubic_centimetre","cubic centimetre per cubic centimetre","cm3/cm3",CubicCentimetre, CubicCentimetre);
		Zettawatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettawatt","zettawatt","ZW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		GramPerGram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_gram","gram per gram","g/g",Gram, Gram);
		DecametrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/decametre_per_second-time_squared","decametre per second squared","dam/s2",Decametre, SecondTimeSquared);
		Femtojoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtojoule","femtojoule","fJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Hectolux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectolux","hectolux","hlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		MolePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_second-time","mole per second","mol/s",Mole, SecondTime);
		MetrePerPetasecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_petasecond-time","metre per petasecond","m/Ps",Metre, PetasecondTime);
		Hectopascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectopascal","hectopascal","hPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		CandelaPerSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/candela_per_square_metre","candela per square metre","cd/m",Candela, SquareMetre);
		Yoctometre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctometre","yoctometre","ym",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		YoctometrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctometre_per_second-time","yoctometre per second","ym/s",Yoctometre, SecondTime);
		Milliradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/milliradian","milliradian","mrad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		ExasecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exasecond-time","exasecond","Es",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		WattPerSecondPlaneAngleSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_per_second-plane_angle_squared","watt per second (plane angle) squared","W/arcsec2",Watt, SecondPlaneAngleSquared);
		Megalux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megalux","megalux","Mlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		TerametrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/terametre_per_second-time","terametre per second","Tm/s",Terametre, SecondTime);
		SquareMetreSecondTime = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_metre_second-time","square metre second","m2 s",SquareMetre, SecondTime);
		GramPerSquareMetreSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_square_metre_second-time","gram per square metre second","g/(m2 s)",Gram, SquareMetreSecondTime);
		UnifiedAtomicMassUnit = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/unified_atomic_mass_unit", "unified atomic mass unit", "u", nl.wur.fbr.om.model.dimensions.SIBaseDimension.MASS);
		Yoctogram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctogram","yoctogram","yg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		YoctogramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctogram_per_litre","yoctogram per litre","yg/l",Yoctogram, Litre);
		Decamolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decamolair","decamolair","daM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		MegaeuroPerMegatonne = null;
		Hectomole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectomole","hectomole","hmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		HectomolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectomole_per_metre","hectomole per metre","hmol/m",Hectomole, Metre);
		Zettaweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettaweber","zettaweber","ZWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		SquareMetreDay = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_metre_day","square metre day","m2 d",SquareMetre, Day);
		JoulePerSquareMetreDay = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/joule_per_square_metre_day","joule per square metre day","J/(m2 d)",Joule, SquareMetreDay);
		MetrePerDecasecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_decasecond-time_squared","metre per decasecond squared","m/das2",Metre, DecasecondTimeSquared);
		Poise =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/poise", "poise", "P", PascalSecondTime, 0.1 );
		Microgram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microgram","microgram","μg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		MicrogramPerSquareMetreSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/microgram_per_square_metre_second-time","microgram per square metre second","mg/(m2 s)",Microgram, SquareMetreSecondTime);
		Nanohertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanohertz","nanohertz","nHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Hectoampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectoampere","hectoampere","hA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		AcreFoot =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/acre_foot", "acre foot", "null", CubicMetre, 1233.489 );
		CalorieThermochemical =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/calorie-thermochemical", "calorie (thermochemical)", "cal_th", Joule, 4.184 );
		MetreKilogram = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_kilogram","metre kilogram","m kg",Metre, Kilogram);
		MetreKilogramPerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_kilogram_per_second-time","metre kilogram per second","m kg/s",MetreKilogram, SecondTime);
		Kilocoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilocoulomb","kilocoulomb","kC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Hectofarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectofarad","hectofarad","hF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Millikatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millikatal","millikatal","mkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Decimetre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decimetre","decimetre","dm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		DecimetrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/decimetre_per_second-time_squared","decimetre per second squared","dm/s2",Decimetre, SecondTimeSquared);
		CentisecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centisecond-time","centisecond","cs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		CentisecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/centisecond-time_squared","centisecond squared","cs2",CentisecondTime, 2.0);
		IndianRupee = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/Indian_rupee", "Indian rupee", "null", null);
		BitPerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/bit_per_second-time","bit per second","bit/s",Bit, SecondTime);
		Ohm = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/ohm", "ohm", "Ω", null);
		Exaohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exaohm","exaohm","EΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Maxwell =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/maxwell", "maxwell", "Mx", Weber, 1.0E-8 );
		Hectojoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectojoule","hectojoule","hJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Picosievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picosievert","picosievert","pSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		SecondTimePerSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/second-time_per_square_metre","second per square metre","s/m2",SecondTime, SquareMetre);
		Millitesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millitesla","millitesla","mT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Yottafarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottafarad","yottafarad","YF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		ZeptosecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptosecond-time_squared","zeptosecond squared","zs2",ZeptosecondTime, 2.0);
		MetrePerZeptosecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_zeptosecond-time_squared","metre per zeptosecond squared","m/zs2",Metre, ZeptosecondTimeSquared);
		Abmho =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/abmho", "abmho", "null", Siemens, 1.0E9 );
		CentimetrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/centimetre_per_second-time_squared","centimetre per second squared","cm/s2",Centimetre, SecondTimeSquared);
		Kilojoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilojoule","kilojoule","kJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Decilitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decilitre","decilitre","dl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		MolePerDecilitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_decilitre","mole per decilitre","mol/dl",Mole, Decilitre);
		MetreKelvin = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_kelvin","metre kelvin","m K",Metre, Kelvin);
		WattPerMetreKelvin = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_per_metre_kelvin","watt per metre kelvin","W/(m K)",Watt, MetreKelvin);
		Centiampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centiampere","centiampere","cA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Hectogray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectogray","hectogray","hGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Picometre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picometre","picometre","pm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		PicometrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/picometre_per_second-time_squared","picometre per second squared","pm/s2",Picometre, SecondTimeSquared);
		Kilomole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilomole","kilomole","kmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Gauss =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gauss", "gauss", "G", Tesla, 1.0E-4 );
		Milligauss = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/milligauss","milligauss","mG",(SingularUnit)Gauss, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Petakatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petakatal","petakatal","Pkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Rod =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/rod", "rod", "rd", Metre, 5.02921 );
		Nanohenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanohenry","nanohenry","nH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		PicodegreeCelsius = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picodegree_Celsius","picodegree Celsius","p°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Zettagray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettagray","zettagray","ZGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		SquareMetrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_metre_per_second-time","square metre per second","m2/s",SquareMetre, SecondTime);
		Stokes =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/stokes", "stokes", "St", SquareMetrePerSecondTime, 1.0E-4 );
		Yoctokelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctokelvin","yoctokelvin","yK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		MolePerYoctometre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_yoctometre","mole per yoctometre","mol/ym",Mole, Yoctometre);
		Petabecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petabecquerel","petabecquerel","PBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Petawatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petawatt","petawatt","PW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Newton = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/newton", "newton", "N", null);
		Decinewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decinewton","decinewton","dN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Attolux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attolux","attolux","alx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Picomolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picomolair","picomolair","pM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		FemtosecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtosecond-time","femtosecond","fs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Zettamolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettamolair","zettamolair","ZM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Pennyweight =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/pennyweight", "pennyweight", "dwt", Kilogram, 0.001555174 );
		Teraampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teraampere","teraampere","TA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Centilux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centilux","centilux","clx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Decahenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decahenry","decahenry","daH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Gigamolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigamolair","gigamolair","GM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Millimagnitude = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millimagnitude","millimagnitude","mmag",(SingularUnit)Magnitude, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Picosiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picosiemens","picosiemens","pS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		MexicanPeso = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/Mexican_peso", "Mexican peso", "null", null);
		Femtofarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtofarad","femtofarad","fF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Kilowatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilowatt","kilowatt","kW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		VoltPerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/volt_per_metre","volt per metre","V/m",Volt, Metre);
		Decasiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decasiemens","decasiemens","daS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Decalux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decalux","decalux","dalx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Megatonne = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megatonne","megatonne","Mt",(SingularUnit)Tonne, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		SwedishKrona = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/Swedish_krona", "Swedish krona", "null", null);
		Phot =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/phot", "phot", "ph", Lux, 10000.0 );
		MetrePerNanosecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_nanosecond-time_squared","metre per nanosecond squared","m/ns2",Metre, NanosecondTimeSquared);
		Exawatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exawatt","exawatt","EW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Gigajoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigajoule","gigajoule","GJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		KilogramPerGigajoule = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_per_gigajoule","kikogram per gigajoule","kg/GJ",Kilogram, Gigajoule);
		Gigalitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigalitre","gigalitre","Gl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		GramPerGigalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_gigalitre","gram per gigalitre","g/Gl",Gram, Gigalitre);
		TerametrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/terametre_per_second-time_squared","terametre per second squared","Tm/s2",Terametre, SecondTimeSquared);
		Zeptonewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptonewton","zeptonewton","zN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Petakelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petakelvin","petakelvin","PK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		ZeptodegreeCelsius = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptodegree_Celsius","zeptodegree Celsius","z°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Femtosievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtosievert","femtosievert","fSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		CubicYoctometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_yoctometre","cubic yoctometre","ym3",Yoctometre, 3.0);
		KelvinMole = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/kelvin_mole","kelvin mole","K mol",Kelvin, Mole);
		Teramole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teramole","teramole","Tmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		TeramolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/teramole_per_metre","teramole per metre","Tmol/m",Teramole, Metre);
		MicromolePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/micromole_per_second-time","micromole per second","μmol/s",Micromole, SecondTime);
		MicromolePerSecondTimeGram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/micromole_per_second-time_gram","micromole per second gram","μmol/(s g)",MicromolePerSecondTime, Gram);
		NanometrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanometre_per_second-time","nanometre per second","nm/s",Nanometre, SecondTime);
		Zebibyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zebibyte","zebibyte","ZiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.ZEBI);
		CalorieMean =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/calorie-mean", "calorie (mean)", "cal", Joule, 4.19002 );
		KilocalorieMean = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilocalorie-mean","kilocalorie (mean)","kcal",(SingularUnit)CalorieMean, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Barye =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/barye", "barye", "ba", Pascal, 0.1 );
		MillidegreeCelsius = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millidegree_Celsius","millidegree Celsius","m°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Yoctonewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctonewton","yoctonewton","yN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Micronewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/micronewton","micronewton","μN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		MicronewtonMetre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/micronewton_metre","micronewton metre","μN m",Micronewton, Metre);
		ExametrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/exametre_per_second-time","exametre per second","Em/s",Exametre, SecondTime);
		Zeptometre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptometre","zeptometre","zm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		ZeptometrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptometre_per_second-time","zeptometre per second","zm/s",Zeptometre, SecondTime);
		DegreeCelsiusPerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/degree_Celsius_per_second-time","degree Celsius per second","°C/s",DegreeCelsius, SecondTime);
		DegreeReaumur =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/degree_Reaumur", "degree Réaumur", "°Ré", Kelvin, 1.25 );
		ReaumurScale = new ScaleImpl("http://www.wurvoc.org/vocabularies/om-1.8/Reaumur_scale","Réaumur scale","null",KelvinScale, -218.52, 1.0, DegreeReaumur);
		Faraday =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/faraday", "faraday", "null", Coulomb, 96485.31 );
		Terakelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terakelvin","terakelvin","TK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		MetrePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_metre","metre per metre","m/m",Metre, Metre);
		Franklin =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/franklin", "franklin", "Fr", Coulomb, 3.335641E-10 );
		MolePerFemtometre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_femtometre","mole per femtometre","mol/fm",Mole, Femtometre);
		GramPerSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_square_metre","gram per square metre","g/m2",Gram, SquareMetre);
		GramPerSquareMetreMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_square_metre_metre","gram per square metre metre","g/(m2 m)",GramPerSquareMetre, Metre);
		GigasecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigasecond-time","gigasecond","Gs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		GigasecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigasecond-time_squared","gigasecond squared","Gs2",GigasecondTime, 2.0);
		Femtohertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtohertz","femtohertz","fHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		CubicMicrometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_micrometre","cubic micrometre","μm3",Micrometre, 3.0);
		ReciprocalCubicCentimetre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_cubic_centimetre","reciprocal cubic centimetre","cm-3",Centimetre, -3.0);
		HongKongDollar = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/Hong_Kong_dollar", "Hong Kong dollar", "null", null);
		Exaweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exaweber","exaweber","EWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Femtotesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtotesla","femtotesla","fT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Centilumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centilumen","centilumen","clm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Tebibit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/tebibit","tebibit","Tibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.TEBI);
		Attomole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attomole","attomole","amol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		AttomolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/attomole_per_metre","attomole per metre","amol/m",Attomole, Metre);
		Zettavolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettavolt","zettavolt","ZV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Abohm =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/abohm", "abohm", "abΩ", Ohm, 1.0E-9 );
		Decigram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decigram","decigram","dg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		MolePerMole = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_mole","mole per mole","mol/mol",Mole, Mole);
		Zeptosievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptosievert","zeptosievert","zSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Femtocoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtocoulomb","femtocoulomb","fC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Zettabit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettabit","zettabit","Zbit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Gigahertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigahertz","gigahertz","GHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Megajoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megajoule","megajoule","MJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		MegajoulePerSquareMetreDay = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/megajoule_per_square_metre_day","megajoule per square metre day","MJ/(m2 d)",Megajoule, SquareMetreDay);
		GramPerExalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_exalitre","gram per exalitre","g/El",Gram, Exalitre);
		ZeptometrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptometre_per_second-time_squared","zeptometre per second squared","zm/s2",Zeptometre, SecondTimeSquared);
		Cup =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/cup", "cup", "null", CubicMetre, 2.365882E-4 );
		SquarePicometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_picometre","square picometre","pm2",Picometre, 2.0);
		MileUSSurvey =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/mile-US_survey", "mile (US survey)", "null", Metre, 1609.347 );
		Shake =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/shake", "shake", "null", SecondTime, 1.0E-8 );
		Teranewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teranewton","teranewton","TN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Decigray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decigray","decigray","dGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		CubicMetrePerMole = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_metre_per_mole","cubic metre per mole","m3/mol",CubicMetre, Mole);
		Nanogram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanogram","nanogram","ng",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		NanogramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanogram_per_litre","nanogram per litre","ng/l",Nanogram, Litre);
		Degree =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/degree", "degree", "°", Radian, 0.01745329 );
		HourHourAngle =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hour-hour_angle", "hour (hour angle)", "h", Degree, 15.0 );
		Millibecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millibecquerel","millibecquerel","mBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Picotesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picotesla","picotesla","pT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		MetrePerHectosecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_hectosecond-time","metre per hectosecond","m/hs",Metre, HectosecondTime);
		Microweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microweber","microweber","μWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		MetreToThePower2 = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_to_the_power_-2","metre to the power -2","m-2",Metre, -2.0);
		ReciprocalMetre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_metre","reciprocal metre","m-1",Metre, -1.0);
		MetreToThePower2ReciprocalMetre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_to_the_power_-2_reciprocal_metre","metre to the power -2 reciprocal metre","m-2 m-1",MetreToThePower2, ReciprocalMetre);
		MoleMicrometre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_micrometre","mole micrometre","mol μm",Mole, Micrometre);
		ReciprocalSquareCentimetre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_square_centimetre","reciprocal square centimetre","cm-2",Centimetre, -2.0);
		MoleMicrometreReciprocalSquareCentimetre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_micrometre_reciprocal_square_centimetre","mole micrometre reciprocal square centimetre","mol μm cm-2",MoleMicrometre, ReciprocalSquareCentimetre);
		Yottamole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottamole","yottamole","Ymol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Zeptosiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptosiemens","zeptosiemens","zS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Attoradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attoradian","attoradian","arad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Decisteradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decisteradian","decisteradian","dsr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Pebibyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/pebibyte","pebibyte","PiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.PEBI);
		MolePerHectometre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_hectometre","mole per hectometre","mol/hm",Mole, Hectometre);
		Megabyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megabyte","megabyte","MB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		MillisecondPlaneAngle = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millisecond-plane_angle","millisecond (plane angle)","mas",(SingularUnit)SecondPlaneAngle, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MillisecondPlaneAnglePerYear = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/millisecond-plane_angle_per_year","millisecond (plane_angle) per year","mas/yr",MillisecondPlaneAngle, Year);
		Decafarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decafarad","decafarad","daF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		GramPerZeptolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_zeptolitre","gram per zeptolitre","g/zl",Gram, Zeptolitre);
		UnitedStatesDollar = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/United_States_dollar", "United States dollar", "null", null);
		Tebibyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/tebibyte","tebibyte","TiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.TEBI);
		Picokelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picokelvin","picokelvin","pK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Petametre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petametre","petametre","Pm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		CoulombPerVolt = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/coulomb_per_volt","coulomb per volt","C/V",Coulomb, Volt);
		Hectowatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectowatt","hectowatt","hW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		WattPerCubicMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_per_cubic_metre","watt per cubic metre","W/m3",Watt, CubicMetre);
		MegametrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/megametre_per_second-time_squared","megametre per second squared","Mm/s2",Megametre, SecondTimeSquared);
		MolePerGigalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_gigalitre","mole per gigalitre","mol/Gl",Mole, Gigalitre);
		WattPerAmpere = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_per_ampere","watt per ampere","W/A",Watt, Ampere);
		Kibibyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kibibyte","kibibyte","KiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.KIBI);
		Microkatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microkatal","microkatal","μkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Petajoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petajoule","petajoule","PJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		HenryPerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/henry_per_metre","henry per metre","H/m",Henry, Metre);
		Picosteradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picosteradian","picosteradian","psr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		MillimolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/millimole_per_litre","millimole per litre","mmol/l",Millimole, Litre);
		PointATA =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/point-ATA", "point (ATA)", "pt", Metre, 3.514598E-4 );
		PicaATA =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/pica-ATA", "pica (ATA)", "null", PointATA, 12.0 );
		JoulePerKelvinMole = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/joule_per_kelvin_mole","joule per kelvin mole","J/(K mol)",Joule, KelvinMole);
		Decikatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decikatal","decikatal","dkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Megapascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megapascal","megapascal","MPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Millimolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millimolair","millimolair","mM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Teramolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teramolair","teramolair","TM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Picomole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picomole","picomole","pmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		PicomolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/picomole_per_metre","picomole per metre","pmol/m",Picomole, Metre);
		Deciweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/deciweber","deciweber","dWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Micromolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/micromolair","micromolair","μM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Decimole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decimole","decimole","dmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Exakatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exakatal","exakatal","Ekat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		JoulePerMole = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/joule_per_mole","joule per mole","J/mol",Joule, Mole);
		GramPerHectolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_hectolitre","gram per hectolitre","g/hl",Gram, Hectolitre);
		Attocandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attocandela","attocandela","acd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		ReciprocalSecondTime = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_second-time","reciprocal second","s-1",SecondTime, -1.0);
		MoleMicrometreReciprocalSquareCentimetreReciprocalSecondTime = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_micrometre_reciprocal_square_centimetre_reciprocal_second-time","mole micrometre reciprocal square centimetre reciprocal second","mol μm cm-2 s-1",MoleMicrometreReciprocalSquareCentimetre, ReciprocalSecondTime);
		Yottawatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottawatt","yottawatt","YW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Decabecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decabecquerel","decabecquerel","daBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Nanoampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanoampere","nanoampere","nA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		MetrePerMillisecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_millisecond-time","metre per millisecond","m/ms",Metre, MillisecondTime);
		Microlux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microlux","microlux","μlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Decanewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decanewton","decanewton","daN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Bar =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/bar", "bar", "bar", Pascal, 100000.0 );
		Microbar = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microbar","microbar","μbar",(SingularUnit)Bar, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Femtoampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtoampere","femtoampere","fA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		LitrePerHour = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/litre_per_hour","litre per hour","l/h",Litre, Hour);
		PartsPerMillionPerYear = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/parts_per_million_per_year","parts per million per year","ppm/a",PartsPerMillion, Year);
		WeberPerSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/weber_per_square_metre","weber per square metre","Wb/m2",Weber, SquareMetre);
		Knot = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/knot", "knot", "null", null);
		SquareMetreNanometre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_metre_nanometre","square metre nanometre","m2 nm",SquareMetre, Nanometre);
		WattPerSteradian = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_per_steradian","watt per steradian","W/sr",Watt, Steradian);
		Zeptojoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptojoule","zeptojoule","zJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Femtobecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtobecquerel","femtobecquerel","fBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		MetrePerExasecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_exasecond-time","metre per exasecond","m/Es",Metre, ExasecondTime);
		Gigacandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigacandela","gigacandela","Gcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Yottalumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottalumen","yottalumen","Ylm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		GramPerMegajoule = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_megajoule","gram per megajoule","g/MJ",Gram, Megajoule);
		Teracandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teracandela","teracandela","Tcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		MetrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_second-time","metre per second","m/s",Metre, SecondTime);
		MetrePerSecondTimePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_second-time_per_metre","metre per second per metre","m/s/m",MetrePerSecondTime, Metre);
		MetrePerDecisecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_decisecond-time","metre per decisecond","m/ds",Metre, DecisecondTime);
		HorsepowerWater =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/horsepower-water", "horsepower (water)", "null", Watt, 746.043 );
		CubicMetrePerCubicMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_metre_per_cubic_metre","cubic metre per cubic metre","m3/m3",CubicMetre, CubicMetre);
		KilomolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilomole_per_metre","kilomole per metre","kmol/m",Kilomole, Metre);
		MinuteSidereal =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/minute-sidereal", "minute (sidereal)", "null", SecondTime, 59.83617 );
		Abcoulomb =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/abcoulomb", "abcoulomb", "abC", Coulomb, 10.0 );
		ZettasecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettasecond-time","zettasecond","Zs",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		ZettasecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettasecond-time_squared","zettasecond squared","Zs2",ZettasecondTime, 2.0);
		Yoctolumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctolumen","yoctolumen","ylm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		ReciprocalGram = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_gram","reciprocal gram","g-1",Gram, -1.0);
		Microfarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microfarad","microfarad","μF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		KilowattHour = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilowatt_hour","kilowatt hour","kW h",Kilowatt, Hour);
		Petatesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petatesla","petatesla","PT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		CaratMass =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/carat-mass", "carat (mass)", "null", Kilogram, 2.0E-4 );
		MicrogramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/microgram_per_litre","microgram per litre","μg/l",Microgram, Litre);
		MolePerZeptometre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_zeptometre","mole per zeptometre","mol/zm",Mole, Zeptometre);
		Zettahenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettahenry","zettahenry","ZH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		HorsepowerBoiler =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/horsepower-boiler", "horsepower (boiler)", "null", Watt, 9809.5 );
		SolarRadius =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/solar_radius", "solar radius", "R_☉", Metre, 6.955E8 );
		MilligramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/milligram_per_litre","milligram per litre","mg/l",Milligram, Litre);
		Attometre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attometre","attometre","am",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		AttometrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/attometre_per_second-time","attometre per second","am/s",Attometre, SecondTime);
		Barn =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/barn", "barn", "b", SquareMetre, 1.0E-28 );
		HectareDay = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectare_day","hectare day","ha d",Hectare, Day);
		KilogramPerHectareDay = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_per_hectare_day","kilogram per hectare day","kg/(ha d)",Kilogram, HectareDay);
		MolePerKilolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_kilolitre","mole per kilolitre","mol/kl",Mole, Kilolitre);
		Millihenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millihenry","millihenry","mH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Terabit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terabit","terabit","Tbit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Nanotesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanotesla","nanotesla","nT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		JoulePerSquareMetreSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/joule_per_square_metre_second-time","joule per square metre second","J/(m2 s)",Joule, SquareMetreSecondTime);
		YearTropical =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/year-tropical", "year (tropical)", "null", SecondTime, 3.155693E7 );
		Yottapascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottapascal","yottapascal","YPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		LiquidPintUS =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/liquid_pint-US", "liquid pint (US)", "liq pt", CubicMetre, 4.731765E-4 );
		Attofarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attofarad","attofarad","aF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Decivolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decivolt","decivolt","dV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Picocandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picocandela","picocandela","pcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		N25Millilitre = null;
		Megacandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megacandela","megacandela","Mcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Kilosievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilosievert","kilosievert","kSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Nanomolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanomolair","nanomolair","nM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Megalumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megalumen","megalumen","Mlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Femtokelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtokelvin","femtokelvin","fK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Microcandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microcandela","microcandela","μcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		CentimetrePerDay = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/centimetre_per_day","centimetre per day","cm/d",Centimetre, Day);
		Nanomole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanomole","nanomole","nmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		NanomolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanomole_per_litre","nanomole per litre","nmol/l",Nanomole, Litre);
		MinuteTime =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/minute-time", "minute", "min", SecondTime, 60.0 );
		Abhenry =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/abhenry", "abhenry", "abH", Henry, 1.0E-9 );
		Teralitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teralitre","teralitre","Tl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		GramPerDecilitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_decilitre","gram per decilitre","g/dl",Gram, Decilitre);
		Nanolumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanolumen","nanolumen","nlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Zeptotesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptotesla","zeptotesla","zT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		SquareZeptometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_zeptometre","square zeptometre","zm2",Zeptometre, 2.0);
		Attolitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attolitre","attolitre","al",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		MolePerDecametre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_decametre","mole per decametre","mol/dam",Mole, Decametre);
		PintImperial =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/pint-Imperial", "pint (Imperial)", "null", Millilitre, 568.26125 );
		DecidegreeCelsius = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decidegree_Celsius","decidegree Celsius","d°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		MolePerMegalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_megalitre","mole per megalitre","mol/Ml",Mole, Megalitre);
		Yobibit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yobibit","yobibit","Yibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.YOBI);
		HorsepowerElectric =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/horsepower-electric", "horsepower (electric)", "null", Watt, 746.0 );
		Zeptosteradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptosteradian","zeptosteradian","zsr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		MegaeuroPerPetajoule = null;
		Millicandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millicandela","millicandela","mcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		ReciprocalWatt = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_watt","reciprocal watt","W-1",Watt, -1.0);
		Zettabyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettabyte","zettabyte","ZB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Gigametre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigametre","gigametre","Gm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		GigametrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigametre_per_second-time","gigametre per second","Gm/s",Gigametre, SecondTime);
		Millinewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millinewton","millinewton","mN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MetreToThePower2ReciprocalGram = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_to_the_power_-2_reciprocal_gram","metre to the power -2 reciprocal gram","m-2 g-1",MetreToThePower2, ReciprocalGram);
		WattPerSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_per_square_metre","watt per square metre","W/m2",Watt, SquareMetre);
		KilogramPerKilogram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_per_kilogram","kilogram per kilogram","kg/kg",Kilogram, Kilogram);
		Decaampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decaampere","decaampere","daA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		NewtonPerSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/newton_per_square_metre","newton per square metre","N/m2",Newton, SquareMetre);
		DeltaA450 = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/delta_A450", "delta A450", "null", null);
		DeltaA450PerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/delta_A450_per_second-time","delta A450 per second","null",DeltaA450, SecondTime);
		MetrePerDay = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_day","metre per day","m/d",Metre, Day);
		CoulombMetre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/coulomb_metre","coulomb metre","C m",Coulomb, Metre);
		MillimetrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/millimetre_per_second-time","millimetre per second","mm/s",Millimetre, SecondTime);
		GramPerSquareMetreCentimetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_square_metre_centimetre","gram per square metre centimetre","g/(m2 cm)",GramPerSquareMetre, Centimetre);
		DecimetrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/decimetre_per_second-time","decimetre per second","dm/s",Decimetre, SecondTime);
		Euro = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/euro", "euro", "null", null);
		Megagray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megagray","megagray","MGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Lambert =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/lambert", "lambert", "null", CandelaPerSquareMetre, 3183.099 );
		Baud = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/baud", "baud", "Bd", null);
		CubicDecimetre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_decimetre","cubic decimetre","dm3",Decimetre, 3.0);
		Femtovolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtovolt","femtovolt","fV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Megagram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megagram","megagram","Mg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		JoulePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/joule_per_second-time","joule per second","J/s",Joule, SecondTime);
		Centihertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centihertz","centihertz","cHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Gibibit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gibibit","gibibit","Gibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.GIBI);
		KilosecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilosecond-time_squared","kilosecond squared","ks2",KilosecondTime, 2.0);
		MetrePerKilosecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_kilosecond-time_squared","metre per kilosecond squared","m/ks2",Metre, KilosecondTimeSquared);
		Femtolumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtolumen","femtolumen","flm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Picoampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picoampere","picoampere","pA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		SquarePetametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_petametre","square petametre","Pm2",Petametre, 2.0);
		FluidOunceImperial =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/fluid_ounce-Imperial", "fluid ounce (Imperial)", "fl oz", CubicMetre, 2.841306E-5 );
		MegagramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/megagram_per_litre","megagram per litre","Mg/l",Megagram, Litre);
		Microsievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microsievert","microsievert","μSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Yoctolux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctolux","yoctolux","ylx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		GramPerKilolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_kilolitre","gram per kilolitre","g/kl",Gram, Kilolitre);
		CubicPetametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_petametre","cubic petametre","Pm3",Petametre, 3.0);
		Mebibyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/mebibyte","mebibyte","MiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.MEBI);
		Kilobecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilobecquerel","kilobecquerel","kBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		MillimetrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/millimetre_per_second-time_squared","millimetre per second squared","mm/s2",Millimetre, SecondTimeSquared);
		MolePerTerametre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_terametre","mole per terametre","mol/Tm",Mole, Terametre);
		Attopascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attopascal","attopascal","aPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Zettakatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettakatal","zettakatal","Zkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		DecimolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/decimole_per_litre","decimole per litre","dmol/l",Decimole, Litre);
		Gigahenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigahenry","gigahenry","GH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		MilligramPerHectogram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/milligram_per_hectogram","milligram per hectogram","mg/hg",Milligram, Hectogram);
		Microlitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microlitre","microlitre","μl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		GramPerMicrolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_microlitre","gram per microlitre","g/μl",Gram, Microlitre);
		Yottalitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottalitre","yottalitre","Yl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		MolePerYottalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_yottalitre","mole per yottalitre","mol/Yl",Mole, Yottalitre);
		MicrosecondPlaneAngle = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microsecond-plane_angle","microsecond (plane angle)","μas",(SingularUnit)SecondPlaneAngle, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Nanokelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanokelvin","nanokelvin","nK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		PointPostscript =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/point-Postscript", "point (Postscript)", "pt", Inch, 0.013888888888888888 );
		PicaPostscript =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/pica-Postscript", "pica (Postscript)", "null", PointPostscript, 12.0 );
		GrayPerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gray_per_second-time","gray per second","Gy/s",Gray, SecondTime);
		Zeptofarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptofarad","zeptofarad","zF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		HectomolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectomole_per_litre","hectomole per litre","hmol/l",Hectomole, Litre);
		Teraohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teraohm","teraohm","TΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Megavolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megavolt","megavolt","MV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		MicromolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/micromole_per_litre","micromole per litre","μmol/l",Micromole, Litre);
		Megahertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megahertz","megahertz","MHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		NanometrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanometre_per_second-time_squared","nanometre per second squared","nm/s2",Nanometre, SecondTimeSquared);
		Decamole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decamole","decamole","damol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		DecamolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/decamole_per_litre","decamole per litre","damol/l",Decamole, Litre);
		Femtomolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtomolair","femtomolair","fM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		PicosecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/picosecond-time_squared","picosecond squared","ps2",PicosecondTime, 2.0);
		MetrePerPicosecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_picosecond-time_squared","metre per picosecond squared","m/ps2",Metre, PicosecondTimeSquared);
		Gigakelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigakelvin","gigakelvin","GK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		CubicZeptometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_zeptometre","cubic zeptometre","zm3",Zeptometre, 3.0);
		SolarMassPerCubicParsec = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/solar_mass_per_cubic_parsec","solar mass per cubic parsec","M_☉/pc3",SolarMass, CubicParsec);
		MegamolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/megamole_per_metre","megamole per metre","Mmol/m",Megamole, Metre);
		BritishThermalUnit59F =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/British_thermal_unit-59_F", "British thermal unit (59 °F)", "Btu", Joule, 1054.8 );
		Centiohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centiohm","centiohm","cΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Attocoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attocoulomb","attocoulomb","aC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Mebibit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/mebibit","mebibit","Mibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.MEBI);
		Hectoohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectoohm","hectoohm","hΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Kilocandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilocandela","kilocandela","kcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Kilokelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilokelvin","kilokelvin","kK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Yottacoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottacoulomb","yottacoulomb","YC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Zettacoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettacoulomb","zettacoulomb","ZC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		MicrometrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/micrometre_per_second-time_squared","micrometre per second squared","μm/s2",Micrometre, SecondTimeSquared);
		Microampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microampere","microampere","μA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		AtmosphereTechnical =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/atmosphere-technical", "atmosphere (technical)", "at", Pascal, 98066.5 );
		Gigaampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigaampere","gigaampere","GA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Kilonewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilonewton","kilonewton","kN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Millihertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millihertz","millihertz","mHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Microsiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microsiemens","microsiemens","μS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Millisiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millisiemens","millisiemens","mS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Pebibit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/pebibit","pebibit","Pibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.PEBI);
		Femtolitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtolitre","femtolitre","fl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		ColonyFormingUnitPer25Millilitre = null;
		MetrePerMicrosecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_microsecond-time","metre per microsecond","m/μs",Metre, MicrosecondTime);
		ExasecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/exasecond-time_squared","exasecond squared","Es2",ExasecondTime, 2.0);
		DegreeFahrenheit =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/degree_Fahrenheit", "degree Fahrenheit", "°F", Kelvin, 0.5555556 );
		FahrenheitScale = new ScaleImpl("http://www.wurvoc.org/vocabularies/om-1.8/Fahrenheit_scale","Fahrenheit scale","null",KelvinScale, -459.67, 1.8, DegreeFahrenheit);
		HundredweightBritish =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hundredweight-British", "hundredweight (British)", "null", Kilogram, 50.80235 );
		HourSidereal =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hour-sidereal", "hour (sidereal)", "null", SecondTime, 3590.17 );
		YottametrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottametre_per_second-time_squared","yottametre per second squared","Ym/s2",Yottametre, SecondTimeSquared);
		Terahertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terahertz","terahertz","THz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		KilogramSecondTimeToThePower2 = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_second-time_to_the_power_-2","reciprocal metre kilogram","m-1 kg",Kilogram, SecondTimeToThePower2);
		DecigramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/decigram_per_litre","decigram per litre","dg/l",Decigram, Litre);
		Yoctocandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctocandela","yoctocandela","ycd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Cord =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/cord", "cord", "null", CubicMetre, 3.624556 );
		CoulombPerCubicMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/coulomb_per_cubic_metre","coulomb per cubic metre","C/m3",Coulomb, CubicMetre);
		MetrePerCubicMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_cubic_metre","metre per cubic metre","m/m3",Metre, CubicMetre);
		Picogram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picogram","picogram","pg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		PicogramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/picogram_per_litre","picogram per litre","pg/l",Picogram, Litre);
		Petafarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petafarad","petafarad","PF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Kilokatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilokatal","kilokatal","kkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Teralumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teralumen","teralumen","Tlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		GramPerKilogram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_kilogram","gram per kilogram","g/kg",Gram, Kilogram);
		SwissFranc = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/Swiss_franc", "Swiss franc", "null", null);
		MolePerYoctolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_yoctolitre","mole per yoctolitre","mol/yl",Mole, Yoctolitre);
		MetrePerZettasecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_zettasecond-time_squared","metre per zettasecond squared","m/Zs2",Metre, ZettasecondTimeSquared);
		Megahenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megahenry","megahenry","MH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		SouthKoreanWon = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/South_Korean_won", "South Korean won", "null", null);
		Decagram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decagram","decagram","dag",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		DecagramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/decagram_per_litre","decagram per litre","dag/l",Decagram, Litre);
		Millilumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millilumen","millilumen","mlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Zettaohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettaohm","zettaohm","ZΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		ReciprocalKelvin = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_kelvin","reciprocal kelvin","K-1",Kelvin, -1.0);
		KilogramPerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_per_second-time","kilogram per second","kg/s",Kilogram, SecondTime);
		Centiradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centiradian","centiradian","crad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Picovolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picovolt","picovolt","pV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		SteradianSquareMetre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/steradian_square_metre","steradian square metre","sr m2",Steradian, SquareMetre);
		SteradianSquareMetreHertz = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/steradian_square_metre_hertz","steradian square metre hertz","sr m2 Hz",SteradianSquareMetre, Hertz);
		WattPerSteradianSquareMetreHertz = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_per_steradian_square_metre_hertz","watt per steradian square metre hertz","W/(sr m2 Hz)",Watt, SteradianSquareMetreHertz);
		DegreeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/degree_squared","degree squared","null",Degree, 2.0);
		GramPerSquareMetreDay = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_square_metre_day","gram per square metre day","g/(m2 d)",Gram, SquareMetreDay);
		MilligramRAE = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/milligram_RAE", "milligram RAE", "null", nl.wur.fbr.om.model.dimensions.SIBaseDimension.MASS);
		PointTeX =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/point-TeX", "point (TeX)", "pt", Inch, 0.013837000138370002 );
		PascalSecondTimeSquareMetre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/pascal_second-time_square_metre","pascal second square metre","Pa s m2",PascalSecondTime, SquareMetre);
		KilogramPerPascalSecondTimeSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_per_pascal_second-time_square_metre","kilogram per pascal second square metre","kg Pa-1 s-1 m-2",Kilogram, PascalSecondTimeSquareMetre);
		Perm23C =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/perm-23_C", "perm (23 °C)", "null", KilogramPerPascalSecondTimeSquareMetre, 5.74525E-11 );
		Nanonewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanonewton","nanonewton","nN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		FaradPerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/farad_per_metre","farad per metre","F/m",Farad, Metre);
		Millisievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millisievert","millisievert","mSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		SquareHectometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_hectometre","square hectometre","hm2",Hectometre, 2.0);
		Milliampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/milliampere","milliampere","mA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		Hectoweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectoweber","hectoweber","hWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Kiloampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kiloampere","kiloampere","kA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		YoctosecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctosecond-time","yoctosecond","ys",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		MetrePerYoctosecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_yoctosecond-time","metre per yoctosecond","m/ys",Metre, YoctosecondTime);
		Millikelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millikelvin","millikelvin","mK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MicrogramPerCubicCentimetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/microgram_per_cubic_centimetre","microgram per cubic centimetre","μg/cm3",Microgram, CubicCentimetre);
		BritishThermalUnit39F =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/British_thermal_unit-39_F", "British thermal unit (39 °F)", "Btu", Joule, 1059.67 );
		HundredweightUS =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hundredweight-US", "hundredweight (US)", "null", Kilogram, 45.35924 );
		Microkelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microkelvin","microkelvin","μK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		MinuteHourAngle =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/minute-hour_angle", "minute (hour angle)", "m", Degree, 0.25 );
		TonForce =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/ton-force", "ton-force", "null", Newton, 8896.443 );
		BritishThermalUnit60F =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/British_thermal_unit-60_F", "British thermal unit (60 °F)", "Btu", Joule, 1054.68 );
		Femtokatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtokatal","femtokatal","fkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Microohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microohm","microohm","μΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		CubicNanometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_nanometre","cubic nanometre","nm3",Nanometre, 3.0);
		Electronvolt =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/electronvolt", "electronvolt", "eV", Joule, 1.602177E-19 );
		SquareMetreSteradian = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_metre_steradian","square metre steradian","m2 sr",SquareMetre, Steradian);
		WattPerSquareMetreSteradian = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_per_square_metre_steradian","watt per square metre steradian","W/(m2 sr)",Watt, SquareMetreSteradian);
		Yoctobecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctobecquerel","yoctobecquerel","yBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Attosteradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attosteradian","attosteradian","asr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		GramPerYottalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_yottalitre","gram per yottalitre","g/Yl",Gram, Yottalitre);
		Centicoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centicoulomb","centicoulomb","cC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Decicoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decicoulomb","decicoulomb","dC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		AttomolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/attomole_per_litre","attomole per litre","amol/l",Attomole, Litre);
		Picogray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picogray","picogray","pGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Exahertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exahertz","exahertz","EHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		ColonyFormingUnit = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/colony_forming_unit", "colony forming unit", "CFU", null);
		ColonyFormingUnitPerMillilitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/colony_forming_unit_per_millilitre","colony forming unit per millilitre","CFU/ml",ColonyFormingUnit, Millilitre);
		ReciprocalDay = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_day","reciprocal day","d-1",Day, -1.0);
		NanomolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanomole_per_metre","nanomole per metre","nmol/m",Nanomole, Metre);
		Deciampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/deciampere","deciampere","dA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		KilogramPerMole = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_per_mole","kilogram per mole","kg/mol",Kilogram, Mole);
		Yoctojoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctojoule","yoctojoule","yJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		PetametrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/petametre_per_second-time_squared","petametre per second squared","Pm/s2",Petametre, SecondTimeSquared);
		TonAssay =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/ton-assay", "ton (assay)", "null", Kilogram, 0.02916667 );
		Zeptoampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptoampere","zeptoampere","zA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		MillimetrePerDay = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/millimetre_per_day","millimetre per day","mm/d",Millimetre, Day);
		Yoctocoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctocoulomb","yoctocoulomb","yC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		CanadianDollar = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/Canadian_dollar", "Canadian dollar", "null", null);
		Millipascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millipascal","millipascal","mPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		TerasecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terasecond-time","terasecond","Ts",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		TerasecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/terasecond-time_squared","terasecond squared","Ts2",TerasecondTime, 2.0);
		Megacoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megacoulomb","megacoulomb","MC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		PetametrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/petametre_per_second-time","petametre per second","Pm/s",Petametre, SecondTime);
		Week =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/week", "week", "null", SecondTime, 604800.0 );
		Centifarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centifarad","centifarad","cF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		MolePerFemtolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_femtolitre","mole per femtolitre","mol/fl",Mole, Femtolitre);
		Zeptoohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptoohm","zeptoohm","zΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Yottabyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottabyte","yottabyte","YB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Fermi =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/fermi", "fermi", "null", Metre, 1.0E-15 );
		MicrodegreeCelsius = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microdegree_Celsius","microdegree Celsius","μ°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		SquareAttometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_attometre","square attometre","am2",Attometre, 2.0);
		Grain =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/grain", "grain", "gr", Kilogram, 6.479891E-5 );
		PoundApothecaries =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/pound-apothecaries", "pound (apthecaries')", "lb", Kilogram, 0.3732417 );
		CelsiusScale = new ScaleImpl("http://www.wurvoc.org/vocabularies/om-1.8/Celsius_scale","Celsius scale","null",KelvinScale, -273.15, 1.0, DegreeCelsius);
		MillimetrePerHour = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/millimetre_per_hour","millimetre per hour","mm/h",Millimetre, Hour);
		Microtesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microtesla","microtesla","μT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Gigabecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigabecquerel","gigabecquerel","GBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		MolePerHectolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_hectolitre","mole per hectolitre","mol/hl",Mole, Hectolitre);
		GillImperial =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gill-Imperial", "gill (Imperial)", "gi", CubicMetre, 1.420653E-4 );
		Piconewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/piconewton","piconewton","pN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		MolePerZeptolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_zeptolitre","mole per zeptolitre","mol/zl",Mole, Zeptolitre);
		Femtoohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtoohm","femtoohm","fΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Femtoweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtoweber","femtoweber","fWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		KilogramPerHectare = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_per_hectare","kilogram per hectare","kg/ha",Kilogram, Hectare);
		Petabit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petabit","petabit","Pbit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Decacoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decacoulomb","decacoulomb","daC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Attogram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attogram","attogram","ag",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		AttogramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/attogram_per_litre","attogram per litre","ag/l",Attogram, Litre);
		Picoradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picoradian","picoradian","prad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		KilogramSecondTimeToThePower2ReciprocalMetre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_second-time_to_the_power_-2_reciprocal_metre","reciprocal metre kilogram second to the power -2","m-1 kg s-2",KilogramSecondTimeToThePower2, ReciprocalMetre);
		BritishThermalUnitThermochemical =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/British_thermal_unit-thermochemical", "British thermal unit (thermochemical)", "Btu_th", Joule, 1054.35 );
		DecisecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/decisecond-time_squared","decisecond squared","ds2",DecisecondTime, 2.0);
		PicomolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/picomole_per_litre","picomole per litre","pmol/l",Picomole, Litre);
		Nanofarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanofarad","nanofarad","nF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Femtowatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtowatt","femtowatt","fW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		KilojoulePerSquareMetreDay = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilojoule_per_square_metre_day","kilojoule per square metre day","kJ/(m2 d)",Kilojoule, SquareMetreDay);
		MetrePerDecasecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_decasecond-time","metre per decasecond","m/das",Metre, DecasecondTime);
		Zettalumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettalumen","zettalumen","Zlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		MicrometrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/micrometre_per_second-time","micrometre per second","μm/s",Micrometre, SecondTime);
		MolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_metre","mole per metre","mol/m",Mole, Metre);
		Stathenry =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/stathenry", "stathenry", "statH", Henry, 8.987552E11 );
		AttosecondTime = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attosecond-time","attosecond","as",(SingularUnit)SecondTime, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		MolePerGigametre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_gigametre","mole per gigametre","mol/Gm",Mole, Gigametre);
		ReciprocalCubicMetre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_cubic_metre","reciprocal cubic metre","m-3",Metre, -3.0);
		GramPerMegalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_megalitre","gram per megalitre","g/Ml",Gram, Megalitre);
		Kilomolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilomolair","kilomolair","kM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		LumenPerSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/lumen_per_square_metre","lumen per square metre","lm/m2",Lumen, SquareMetre);
		MetrePerCentisecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_centisecond-time_squared","metre per centisecond squared","m/cs2",Metre, CentisecondTimeSquared);
		Decitesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decitesla","decitesla","dT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Attotesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attotesla","attotesla","aT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Nanowatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanowatt","nanowatt","nW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		SquareDecimetre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_decimetre","square decimetre","dm2",Decimetre, 2.0);
		Revolution =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/revolution", "revolution", "r", Radian, 6.283185 );
		Picowatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picowatt","picowatt","pW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Megohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megohm","megohm","MΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		CubicPicometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_picometre","cubic picometre","pm3",Picometre, 3.0);
		KilometrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilometre_per_second-time_squared","kilometre per second squared","km/s2",Kilometre, SecondTimeSquared);
		AmylaseUnit = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/amylase_unit", "amylase unit", "AU", null);
		NewtonMetre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/newton_metre","newton metre","N m",Newton, Metre);
		CubicMetrePerYear = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_metre_per_year","cubic metre per year","null",CubicMetre, Year);
		Kiloweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kiloweber","kiloweber","kWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Zeptoweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptoweber","zeptoweber","zWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Petalumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petalumen","petalumen","Plm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		ReciprocalDegreeCelsius = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_degree_Celsius","reciprocal degree Celsius","°C-1",DegreeCelsius, -1.0);
		CubicHectometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_hectometre","cubic hectometre","hm3",Hectometre, 3.0);
		Femtogram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtogram","femtogram","fg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		AtmosphereStandard =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/atmosphere-standard", "atmosphere (standard)", "atm", Pascal, 101325.0 );
		ReciprocalAtmosphereStandard = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_atmosphere-standard","reciprocal atmosphere (standard)","atm-1",AtmosphereStandard, -1.0);
		TonOfRefridgeration =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/ton_of_refridgeration", "ton of refridgeration", "null", Watt, 3516.853 );
		Petacandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petacandela","petacandela","Pcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		ReciprocalSquareMetre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_square_metre","reciprocal square metre","m-2",Metre, -2.0);
		CubicGigametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_gigametre","cubic gigametre","Gm3",Gigametre, 3.0);
		FemtometrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtometre_per_second-time_squared","femtometre per second squared","fm/s2",Femtometre, SecondTimeSquared);
		Decatesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decatesla","decatesla","daT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		DegreeCelsiusPerMinuteTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/degree_Celsius_per_minute-time","degree Celsius per minute","°C/min",DegreeCelsius, MinuteTime);
		Kibibit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kibibit","kibibit","Kibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.KIBI);
		Femtogray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtogray","femtogray","fGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Decijoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decijoule","decijoule","dJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Femtonewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtonewton","femtonewton","fN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		MetrePerExasecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_exasecond-time_squared","metre per exasecond squared","m/Es2",Metre, ExasecondTimeSquared);
		Megaeuro = null;
		Deciohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/deciohm","deciohm","dΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		MegametrePerKilojoule = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/megametre_per_kilojoule","megametre per kilojoule","Mm/kJ",Megametre, Kilojoule);
		Picofarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picofarad","picofarad","pF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		KilomolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilomole_per_litre","kilomole per litre","kmol/l",Kilomole, Litre);
		CoulombPerKilogram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/coulomb_per_kilogram","coulomb per kilogram","C/kg",Coulomb, Kilogram);
		Röntgen =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/röntgen", "röntgen", "R", CoulombPerKilogram, 2.58E-4 );
		Yottahertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottahertz","yottahertz","YHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		SecondSidereal =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/second-sidereal", "second (sidereal)", "null", SecondTime, 0.9972696 );
		Nanosiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanosiemens","nanosiemens","nS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		ReciprocalPartsPerMillion = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_parts_per_million","reciprocal parts per million","ppm-1",PartsPerMillion, -1.0);
		Yoctomole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctomole","yoctomole","ymol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		YoctomolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctomole_per_metre","yoctomole per metre","ymol/m",Yoctomole, Metre);
		GramPerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_metre","gram per metre","g/m",Gram, Metre);
		Centisteradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centisteradian","centisteradian","csr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Nanobecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanobecquerel","nanobecquerel","nBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Picocoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picocoulomb","picocoulomb","pC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		ReciprocalHectare = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_hectare","reciprocal hectare","ha-1",Hectare, -1.0);
		Exapascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exapascal","exapascal","EPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Zeptomolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptomolair","zeptomolair","zM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		PoundSterling = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/pound_sterling", "pound sterling", "null", null);
		Zettakelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettakelvin","zettakelvin","ZK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Nanosievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanosievert","nanosievert","nSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Hectokatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectokatal","hectokatal","hkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Zettalitre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettalitre","zettalitre","Zl",(SingularUnit)Litre, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		SquareYottametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_yottametre","square yottametre","Ym2",Yottametre, 2.0);
		Terawatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terawatt","terawatt","TW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		TerawattHour = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/terawatt_hour","terawatt hour","TW h",Terawatt, Hour);
		FemtosecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtosecond-time_squared","femtosecond squared","fs2",FemtosecondTime, 2.0);
		MetrePerFemtosecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_femtosecond-time_squared","metre per femtosecond squared","m/fs2",Metre, FemtosecondTimeSquared);
		Centijoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centijoule","centijoule","cJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Giganewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/giganewton","giganewton","GN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		JouleSecondTime = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/joule_second-time","joule second","J s",Joule, SecondTime);
		YearSidereal =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/year-sidereal", "year (sidereal)", "null", SecondTime, 3.155815E7 );
		Zettametre = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettametre","zettametre","Zm",(SingularUnit)Metre, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		MolePerZettametre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_zettametre","mole per zettametre","mol/Zm",Mole, Zettametre);
		JoulePerCubicMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/joule_per_cubic_metre","joule per cubic metre","J/m3",Joule, CubicMetre);
		JoulePerKelvin = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/joule_per_kelvin","joule per kelvin","J/K",Joule, Kelvin);
		AustralianDollar = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/Australian_dollar", "Australian dollar", "null", null);
		PetamolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/petamole_per_metre","petamole per metre","Pmol/m",Petamole, Metre);
		Attojoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attojoule","attojoule","aJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Decimolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decimolair","decimolair","dM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Yoctomolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctomolair","yoctomolair","yM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		GramPerJoule = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_joule","gram per joule","g/J",Gram, Joule);
		YottamolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottamole_per_metre","yottamole per metre","Ymol/m",Yottamole, Metre);
		Terahenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terahenry","terahenry","TH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Yottalux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottalux","yottalux","Ylx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Curie =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/curie", "curie", "Ci", Becquerel, 3.7E10 );
		Petasievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petasievert","petasievert","PSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Perm23C_1 = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/perm_23_C", "null", "null", null);
		MetrePerDecisecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_decisecond-time_squared","metre per decisecond squared","m/ds2",Metre, DecisecondTimeSquared);
		QuartImperial =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/quart-Imperial", "quart (Imperial)", "null", Litre, 1.1365 );
		MicrogramPerJoule = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/microgram_per_joule","microgram per joule","mg/J",Microgram, Joule);
		Statohm =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/statohm", "statohm", "statΩ", Ohm, 8.987552E11 );
		Exabecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exabecquerel","exabecquerel","EBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		KilogramPerCubicMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_per_cubic_metre","kilogram per cubic metre","kg/m3",Kilogram, CubicMetre);
		Exahenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exahenry","exahenry","EH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Calorie15C =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/calorie-15_C", "calorie (15 °C)", "cal_15", Joule, 4.1858 );
		Nanogray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanogray","nanogray","nGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Zeptomole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptomole","zeptomole","zmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		ZeptomolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptomole_per_metre","zeptomole per metre","zmol/m",Zeptomole, Metre);
		PicaTeX =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/pica-TeX", "pica (TeX)", "null", PointTeX, 12.0 );
		Nanosteradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanosteradian","nanosteradian","nsr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		MolePerNanometre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_nanometre","mole per nanometre","mol/nm",Mole, Nanometre);
		Exacoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exacoulomb","exacoulomb","EC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Kilosiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilosiemens","kilosiemens","kS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Gigacoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigacoulomb","gigacoulomb","GC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Megaerg = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megaerg","megaerg","Merg",(SingularUnit)Erg, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		MileStatute =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/mile-statute", "mile (statute)", "mi", Metre, 1609.344 );
		MileStatutePerHour = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mile-statute_per_hour","mile (statute) per hour","mi/h",MileStatute, Hour);
		Megaweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megaweber","megaweber","MWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Teracoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teracoulomb","teracoulomb","TC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		NewtonPerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/newton_per_metre","newton per metre","N/m",Newton, Metre);
		MetrePerZeptosecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_zeptosecond-time","metre per zeptosecond","m/zs",Metre, ZeptosecondTime);
		Petasiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petasiemens","petasiemens","PS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Dyne =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/dyne", "dyne", "dyn", Newton, 1.0E-5 );
		MegamolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/megamole_per_litre","megamole per litre","Mmol/l",Megamole, Litre);
		ZettametrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettametre_per_second-time","zettametre per second","Zm/s",Zettametre, SecondTime);
		MetrePerFemtosecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_femtosecond-time","metre per femtosecond","m/fs",Metre, FemtosecondTime);
		MolePerPetametre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_petametre","mole per petametre","mol/Pm",Mole, Petametre);
		Microjoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microjoule","microjoule","μJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Centigray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centigray","centigray","cGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		AttosecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/attosecond-time_squared","attosecond squared","as2",AttosecondTime, 2.0);
		MetrePerAttosecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_attosecond-time_squared","metre per attosecond squared","m/as2",Metre, AttosecondTimeSquared);
		Gigawatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigawatt","gigawatt","GW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Decifarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decifarad","decifarad","dF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Peck =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/peck", "peck", "pk", CubicMetre, 0.008809768 );
		UnitPole =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/unit_pole", "unit pole", "null", Weber, 1.256637E-7 );
		MicromolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/micromole_per_metre","micromole per metre","μmol/m",Micromole, Metre);
		Attowatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attowatt","attowatt","aW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Centitesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centitesla","centitesla","cT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Picojoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picojoule","picojoule","pJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Zeptovolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptovolt","zeptovolt","zV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		MetrePerTerasecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_terasecond-time","metre per terasecond","m/Ts",Metre, TerasecondTime);
		TonShort =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/ton-short", "ton (short)", "null", Kilogram, 907.1847 );
		Terapascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terapascal","terapascal","TPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Decibecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decibecquerel","decibecquerel","dBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		CubicYottametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_yottametre","cubic yottametre","Ym3",Yottametre, 3.0);
		Yottavolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottavolt","yottavolt","YV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Statweber =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/statweber", "statweber", "statWb", Weber, 299.79 );
		Yoctoohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctoohm","yoctoohm","yΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Hectosiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectosiemens","hectosiemens","hS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Exalumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exalumen","exalumen","Elm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Nanovolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanovolt","nanovolt","nV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		CubicMetrePerKilogram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_metre_per_kilogram","cubic metre per kilogram","m3/kg",CubicMetre, Kilogram);
		DecimolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/decimole_per_metre","decimole per metre","dmol/m",Decimole, Metre);
		Gigamole = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigamole","gigamole","Gmol",(SingularUnit)Mole, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		GigamolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigamole_per_litre","gigamole per litre","Gmol/l",Gigamole, Litre);
		Debye =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/debye", "debye", "D", CoulombMetre, 3.33564E-30 );
		Chain =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/chain", "chain", "ch", Metre, 20.11684 );
		Quad =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/quad", "quad", "null", BritishThermalUnitInternationalTable, 1.0E15 );
		SquareMetreHertz = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_metre_hertz","square metre hertz","m2 Hz",SquareMetre, Hertz);
		WattPerSquareMetreHertz = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_per_square_metre_hertz","watt per square metre hertz","W/(m2 Hz)",Watt, SquareMetreHertz);
		Abvolt =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/abvolt", "abvolt", "abV", Volt, 1.0E-8 );
		Darcy =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/darcy", "darcy", "null", SquareMetre, 9.869233E-13 );
		DecamolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/decamole_per_metre","decamole per metre","damol/m",Decamole, Metre);
		Micromagnitude = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/micromagnitude","micromagnitude","μmag",(SingularUnit)Magnitude, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Yoctopascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctopascal","yoctopascal","yPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		NauticalMile =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nautical_mile", "nautical mile", "nmi", Metre, 1852.0 );
		NauticalMilePerHour = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/nautical_mile_per_hour","nautical mile per hour","nmi/h",NauticalMile, Hour);
		MetrePerPicosecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_picosecond-time","metre per picosecond","m/ps",Metre, PicosecondTime);
		Decikelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decikelvin","decikelvin","dK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Terabyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terabyte","terabyte","TB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Nanolux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanolux","nanolux","nlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Yoctoampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctoampere","yoctoampere","yA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		MolePerTeralitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_teralitre","mole per teralitre","mol/Tl",Mole, Teralitre);
		Microsteradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microsteradian","microsteradian","μsr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		FootPoundal =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/foot_poundal", "foot poundal", "null", Joule, 0.04214011 );
		AttodegreeCelsius = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attodegree_Celsius","attodegree Celsius","a°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Statmho =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/statmho", "statmho", "null", Siemens, 1.11265E-12 );
		MetrePerGigasecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_gigasecond-time_squared","metre per gigasecond squared","m/Gs2",Metre, GigasecondTimeSquared);
		TonLong =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/ton-long", "ton (long)", "null", Kilogram, 1016.047 );
		Yottacandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottacandela","yottacandela","Ycd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		YottametrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottametre_per_second-time","yottametre per second","Ym/s",Yottametre, SecondTime);
		MolePerYottametre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_yottametre","mole per yottametre","mol/Ym",Mole, Yottametre);
		BritishThermalUnitMean =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/British_thermal_unit-mean", "British thermal unit (mean)", "Btu", Joule, 1055.87 );
		Picolux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picolux","picolux","plx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Centibecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centibecquerel","centibecquerel","cBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Milliohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/milliohm","milliohm","mΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		JoulePerKelvinKilogram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/joule_per_kelvin_kilogram","joule per kelvin kilogram","J/(K kg)",Joule, KelvinKilogram);
		MetrePerTerasecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_terasecond-time_squared","metre per terasecond squared","m/Ts2",Metre, TerasecondTimeSquared);
		Centiwatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centiwatt","centiwatt","cW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		SquareZettametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_zettametre","square zettametre","Zm2",Zettametre, 2.0);
		Decajoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decajoule","decajoule","daJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Gigalumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigalumen","gigalumen","Glm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Nanojoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanojoule","nanojoule","nJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Yoctotesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctotesla","yoctotesla","yT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		KilogramPerCubicDecimetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_per_cubic_decimetre","kilogram per cubic decimetre","kg/dm3",Kilogram, CubicDecimetre);
		Yoctofarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctofarad","yoctofarad","yF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Yottasiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottasiemens","yottasiemens","YS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		ColonyFormingUnitPerGram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/colony_forming_unit_per_gram","colony forming unit per gram","CFU/g",ColonyFormingUnit, Gram);
		Deciwatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/deciwatt","deciwatt","dW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Attosiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attosiemens","attosiemens","aS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		ZettametrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettametre_per_second-time_squared","zettametre per second squared","Zm/s2",Zettametre, SecondTimeSquared);
		Hectocandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectocandela","hectocandela","hcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Yottagram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottagram","yottagram","YG",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		YottagramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottagram_per_litre","yottagram per litre","Yg/l",Yottagram, Litre);
		MilligramPerCubicMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/milligram_per_cubic_metre","milligram per cubic metre","mg/m3",Milligram, CubicMetre);
		Megakatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megakatal","megakatal","Mkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Centipascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centipascal","centipascal","cPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		MolePerAttometre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_attometre","mole per attometre","mol/am",Mole, Attometre);
		Millicoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millicoulomb","millicoulomb","mC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		GramPerHectogram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_hectogram","gram per hectogram","g/hg",Gram, Hectogram);
		SquareNanometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_nanometre","square nanometre","nm2",Nanometre, 2.0);
		CubicMillimetrePerCubicMillimetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_millimetre_per_cubic_millimetre","cubic millimetre per cubic millimetre","mm3/mm3",CubicMillimetre, CubicMillimetre);
		Attobecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attobecquerel","attobecquerel","aBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Gigaelectronvolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigaelectronvolt","gigaelectronvolt","GeV",(SingularUnit)Electronvolt, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		CubicAttometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_attometre","cubic attometre","am3",Attometre, 3.0);
		MilLength =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/mil-length", "mil (length)", "null", Metre, 2.54E-5 );
		Kilohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilohm","kilohm","kΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Stilb =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/stilb", "stilb", "sb", CandelaPerSquareMetre, 10000.0 );
		FemtodegreeCelsius = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtodegree_Celsius","femtodegree Celsius","f°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Centivolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centivolt","centivolt","cV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		KatalPerCubicMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/katal_per_cubic_metre","katal per cubic metre","kat/m3",Katal, CubicMetre);
		SquareKilometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_kilometre","square kilometre","km2",Kilometre, 2.0);
		Petanewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petanewton","petanewton","PN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		CoulombPerSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/coulomb_per_square_metre","coulomb per square metre","C/m2",Coulomb, SquareMetre);
		Microbecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microbecquerel","microbecquerel","μBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Centistokes = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centistokes","centistokes","cSt",(SingularUnit)Stokes, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Attovolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attovolt","attovolt","aV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		MegajoulePerSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/megajoule_per_square_metre","megajoule per square metre","MJ/m2",Megajoule, SquareMetre);
		Centipoise = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centipoise","centipoise","cP",(SingularUnit)Poise, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Zeptokelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptokelvin","zeptokelvin","zK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Attogray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attogray","attogray","aGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Hectonewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectonewton","hectonewton","hN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		MolePerPicolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_picolitre","mole per picolitre","mol/pl",Mole, Picolitre);
		CubicFemtometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_femtometre","cubic femtometre","fm3",Femtometre, 3.0);
		MinutePlaneAngle =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/minute-plane_angle", "minute (plane angle)", "'", Radian, 2.908882E-4 );
		Yottasievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottasievert","yottasievert","YSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Gigalux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigalux","gigalux","Glx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Femtohenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtohenry","femtohenry","fH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Teralux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teralux","teralux","Tlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		SquareDecametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_decametre","square decametre","dam2",Decametre, 2.0);
		Hectotesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectotesla","hectotesla","hT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Hectosievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectosievert","hectosievert","hSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		GramPerZettalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_zettalitre","gram per zettalitre","g/Zl",Gram, Zettalitre);
		CentimetrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/centimetre_per_second-time","centimetre per second","cm/s",Centimetre, SecondTime);
		Footlambert =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/footlambert", "footlambert", "null", CandelaPerSquareMetre, 3.426259 );
		KilogramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_per_litre","kilogram per litre","kg/l",Kilogram, Litre);
		Teaspoon =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teaspoon", "teaspoon", "null", CubicMetre, 4.928922E-6 );
		DryQuartUS =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/dry_quart-US", "dry quart (US)", "dry qt", CubicMetre, 0.001101221 );
		Megaelectronvolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megaelectronvolt","megaelectronvolt","MeV",(SingularUnit)Electronvolt, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Acre =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/acre", "acre", "null", SquareMetre, 4046.873 );
		Barrel =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/barrel", "barrel", "bbl", CubicMetre, 0.1589873 );
		Zeptokatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptokatal","zeptokatal","zkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Kilohenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilohenry","kilohenry","kH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Petaohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petaohm","petaohm","PΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		SecondTimeAmpere = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/second-time_ampere","second ampere","s A",SecondTime, Ampere);
		Attosievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attosievert","attosievert","aSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Centigram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centigram","centigram","cg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		MetrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_second-time_squared","metre per second squared","m/s2",Metre, SecondTimeSquared);
		NanodegreeCelsius = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanodegree_Celsius","nanodegree Celsius","n°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Nanokatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanokatal","nanokatal","nkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		NanokatalPerMilligram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanokatal_per_milligram","nanokatal per milligram","nkat/mg",Nanokatal, Milligram);
		Yottahenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottahenry","yottahenry","YH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		RadianPerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/radian_per_second-time","radian per second","rad/s",Radian, SecondTime);
		Yottagray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottagray","yottagray","YGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Zettahertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettahertz","zettahertz","ZHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		Zeptolux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptolux","zeptolux","zlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		WattPerSquareMetreNanometre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_per_square_metre_nanometre","watt per square metre nanometre","W/(m2 nm)",Watt, SquareMetreNanometre);
		WattPerSteradianSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_per_steradian_square_metre","watt per steradian square metre","W/(sr m2)",Watt, SteradianSquareMetre);
		LightYear =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/light_year", "light year", "ly", Metre, 9.46073E15 );
		Zettacandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettacandela","zettacandela","Zcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		DryPintUS =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/dry_pint-US", "dry pint (US)", "dry pt", CubicMetre, 5.506105E-4 );
		Attokatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attokatal","attokatal","akat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		FemtomolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtomole_per_litre","femtomole per litre","fmol/l",Femtomole, Litre);
		Month = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/month", "month", "null", nl.wur.fbr.om.model.dimensions.SIBaseDimension.TIME);
		Statcoulomb =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/statcoulomb", "statcoulomb", "statC", Coulomb, 3.335641E-10 );
		Mho = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/mho", "mho", "null", null);
		Exbibit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exbibit","exbibit","Eibit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.BinaryPrefix.EXBI);
		Attoohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attoohm","attoohm","aΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		MilligramPerKilometre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/milligram_per_kilometre","milligram per kilometre","mg/km",Milligram, Kilometre);
		SquareFemtometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_femtometre","square femtometre","fm2",Femtometre, 2.0);
		Tablespoon =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/tablespoon", "tablespoon", "null", CubicMetre, 1.478676E-5 );
		Centiare = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centiare","centiare","ca",(SingularUnit)Are, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		ZeptomolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptomole_per_litre","zeptomole per litre","zmol/l",Zeptomole, Litre);
		NewZealandDollar = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/New_Zealand_dollar", "New Zealand dollar", "null", null);
		ReciprocalHour = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_hour","reciprocal hour","h-1",Hour, -1.0);
		CubicDecametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_decametre","cubic decametre","dam3",Decametre, 3.0);
		HorsepowerMetric =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/horsepower-metric", "horsepower (metric)", "PS", Watt, 735.4988 );
		Zettaampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettaampere","zettaampere","ZA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		SingaporeDollar = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/Singapore_dollar", "Singapore dollar", "null", null);
		Zeptocoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptocoulomb","zeptocoulomb","zC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Footcandle =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/footcandle", "footcandle", "null", Lux, 10.76391 );
		Gigatesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigatesla","gigatesla","GT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Teragray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teragray","teragray","TGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Picohertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picohertz","picohertz","pHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		SquareGigametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_gigametre","square gigametre","Gm2",Gigametre, 2.0);
		Femtosiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtosiemens","femtosiemens","fS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		Kayser =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kayser", "kayser", "null", ReciprocalMetre, 100.0 );
		Gigaohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigaohm","gigaohm","GΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Torr =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/torr", "torr", "Torr", Pascal, 133.322368421053 );
		Yoctogray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctogray","yoctogray","yGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		GramPerMillilitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_millilitre","gram per millilitre","g/ml",Gram, Millilitre);
		GallonImperial =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gallon-Imperial", "gallon (Imperial)", "gal", CubicMetre, 0.00454609 );
		Attonewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attonewton","attonewton","aN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		CentimetreOfMercury = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centimetre_of_mercury","centimetre of mercury","cm Hg",(SingularUnit)MetreOfMercury, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Gibibyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gibibyte","gibibyte","GiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.GIBI);
		HectometrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectometre_per_second-time","hectometre per second","hm/s",Hectometre, SecondTime);
		AmperePerWatt = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/ampere_per_watt","ampere per watt","A/W",Ampere, Watt);
		Yoctowatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctowatt","yoctowatt","yW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		CubicMetrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_metre_per_second-time","cubic metre per second","m3/s",CubicMetre, SecondTime);
		Microradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microradian","microradian","μrad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Petapascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petapascal","petapascal","PPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Teravolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teravolt","teravolt","TV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		MolePerMicrolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_microlitre","mole per microlitre","mol/μl",Mole, Microlitre);
		Attoweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attoweber","attoweber","aWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		FemtogramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtogram_per_litre","femtogram per litre","fg/l",Femtogram, Litre);
		CalorieInternationalTable =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/calorie-International_Table", "calorie (International Table)", "cal_IT", Joule, 4.1868 );
		MetreKilogramPerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_kilogram_per_second-time_squared","metre kilogram per second squared","m kg/s2",MetreKilogram, SecondTimeSquared);
		SquareMetreKelvinPerWatt = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_metre_kelvin_per_watt","square metre kelvin per watt","m2 K/W",SquareMetreKelvin, Watt);
		Attomolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attomolair","attomolair","aM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Hectokelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectokelvin","hectokelvin","hK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		Terakatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terakatal","terakatal","Tkat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Zeptohertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptohertz","zeptohertz","zHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Decavolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decavolt","decavolt","daV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		GramPerDecalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_decalitre","gram per decalitre","g/dal",Gram, Decalitre);
		VoltPerWatt = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/volt_per_watt","volt per watt","V/W",Volt, Watt);
		YoctometrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctometre_per_second-time_squared","yoctometre per second squared","ym/s2",Yoctometre, SecondTimeSquared);
		Nanocandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanocandela","nanocandela","ncd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		Gigavolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigavolt","gigavolt","GV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Zeptowatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptowatt","zeptowatt","zW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Zeptopascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptopascal","zeptopascal","zPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Exaampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exaampere","exaampere","EA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		MolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_litre","mole per litre","mol/l",Mole, Litre);
		WattPerHertz = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_per_hertz","watt per hertz","W/Hz",Watt, Hertz);
		Hectohertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectohertz","hectohertz","hHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		AmperePerSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/ampere_per_square_metre","ampere per square metre","A/m2",Ampere, SquareMetre);
		Terabecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/terabecquerel","terabecquerel","TBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		Kiloparsec = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kiloparsec","kiloparsec","kpc",(SingularUnit)Parsec, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		CubicKiloparsec = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_kiloparsec","cubic kiloparsec","kpc3",Kiloparsec, 3.0);
		GigayearCubicKiloparsec = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigayear_cubic_kiloparsec","gigayear cubic kiloparsec","Gyr kpc3",Gigayear, CubicKiloparsec);
		SolarMassPerGigayearCubicKiloparsec = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/solar_mass_per_gigayear_cubic_kiloparsec","solar mass per gigayear cubic kiloparsec","M_☉/(Gyr kpc3)",SolarMass, GigayearCubicKiloparsec);
		MolePerExametre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_exametre","mole per exametre","mol/Em",Mole, Exametre);
		KilojoulePerHectogram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilojoule_per_hectogram","kilojoule per hectogram","kJ/hg",Kilojoule, Hectogram);
		MillisecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/millisecond-time_squared","millisecond squared","ms2",MillisecondTime, 2.0);
		MilligramPerKilogram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/milligram_per_kilogram","milligram per kilogram","mg/kg",Milligram, Kilogram);
		Decicandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decicandela","decicandela","dcd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		MolePerMillimetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_millimetre","mole per millimetre","mol/mm",Mole, Millimetre);
		YoctomolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctomole_per_litre","yoctomole per litre","ymol/l",Yoctomole, Litre);
		SquareCentimetre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_centimetre","square centimetre","cm2",Centimetre, 2.0);
		CandelaPerSquareCentimetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/candela_per_square_centimetre","candela per square centimetre","cd/cm",Candela, SquareCentimetre);
		Yoctovolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctovolt","yoctovolt","yV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Gigagray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigagray","gigagray","GGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		GallonUS =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gallon-US", "gallon (US)", "gal", CubicMetre, 0.003785412 );
		Kilogray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogray","kilogray","kGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Gigagram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigagram","gigagram","Gg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		HorsepowerBritish =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/horsepower-British", "horsepower (British)", "null", Watt, 745.7 );
		Abfarad =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/abfarad", "abfarad", "abF", Farad, 1.0E9 );
		Exafarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exafarad","exafarad","EF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Petahertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petahertz","petahertz","PHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		CentimolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/centimole_per_litre","centimole per litre","cmol/l",Centimole, Litre);
		ZettamolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettamole_per_metre","zettamole per metre","Zmol/m",Zettamole, Metre);
		Kilohertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilohertz","kilohertz","kHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Decacandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decacandela","decacandela","dacd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		RussianRuble = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/Russian_ruble", "Russian_ruble", "null", null);
		GramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_litre","gram per litre","g/l",Gram, Litre);
		Millifarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millifarad","millifarad","mF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		SecondHourAngle =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/second-hour_angle", "second (hour angle)", "s", Degree, 0.0041666667 );
		Gal = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gal", "gal", "Gal", null);
		Kip =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kip", "kip", "null", Newton, 4448.222 );
		Kilotesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilotesla","kilotesla","kT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Centicandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centicandela","centicandela","ccd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Hectohenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectohenry","hectohenry","hH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		YoctosecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctosecond-time_squared","yoctosecond squared","ys2",YoctosecondTime, 2.0);
		Centinewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centinewton","centinewton","cN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Megabecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megabecquerel","megabecquerel","MBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Microwatt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microwatt","microwatt","μW",(SingularUnit)Watt, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Decagray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decagray","decagray","daGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Kiloelectronvolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kiloelectronvolt","kiloelectronvolt","keV",(SingularUnit)Electronvolt, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		GramPerFemtolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_femtolitre","gram per femtolitre","g/fl",Gram, Femtolitre);
		Millijoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millijoule","millijoule","mJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MetrePerNanosecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_nanosecond-time","metre per nanosecond","m/ns",Metre, NanosecondTime);
		PetamolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/petamole_per_litre","petamole per litre","Pmol/l",Petamole, Litre);
		Yobibyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yobibyte","yobibyte","YiB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.BinaryPrefix.YOBI);
		Decibar = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decibar","decibar","dbar",(SingularUnit)Bar, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Microgray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microgray","microgray","μGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Zeptogram = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptogram","zeptogram","zg",(SingularUnit)Gram, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		Zettanewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettanewton","zettanewton","ZN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		MolePerNanolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_nanolitre","mole per nanolitre","mol/nl",Mole, Nanolitre);
		Decilux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decilux","decilux","dlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		GramPerTeralitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_teralitre","gram per teralitre","g/Tl",Gram, Teralitre);
		YottamolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottamole_per_litre","yottamole per litre","Ymol/l",Yottamole, Litre);
		Gigabit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigabit","gigabit","Gbit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Millibar = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millibar","millibar","mbar",(SingularUnit)Bar, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MillinewtonMetre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/millinewton_metre","millinewton metre","mN m",Millinewton, Metre);
		MilPlaneAngle =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/mil-plane_angle", "mil (plane angle)", "null", Radian, 9.817477E-4 );
		DaySidereal =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/day-sidereal", "day (sidereal)", "null", SecondTime, 86164.09 );
		Millilux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/millilux","millilux","mlx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		MolePerKilogram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_kilogram","mole per kilogram","mol/kg",Mole, Kilogram);
		KilometrePerHour = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilometre_per_hour","kilometre per hour","km/h",Kilometre, Hour);
		YottasecondTimeSquared = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottasecond-time_squared","yottasecond squared","Ys2",YottasecondTime, 2.0);
		Decipascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decipascal","decipascal","dPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Yoctosteradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctosteradian","yoctosteradian","ysr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		Femtosteradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtosteradian","femtosteradian","fsr",(SingularUnit)Steradian, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		CubicZettametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_zettametre","cubic zettametre","Zm3",Zettametre, 3.0);
		Megatesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megatesla","megatesla","MT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Examolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/examolair","examolair","EM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Percent =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/percent", "percent", "%", One, 0.01 );
		MolePerZettalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_zettalitre","mole per zettalitre","mol/Zl",Mole, Zettalitre);
		Picohenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picohenry","picohenry","pH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Slug =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/slug", "slug", "slug", Kilogram, 14.5939 );
		Decaweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decaweber","decaweber","daWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		GramPerAttolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_attolitre","gram per attolitre","g/al",Gram, Attolitre);
		Zettajoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettajoule","zettajoule","ZJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		PicometrePerSecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/picometre_per_second-time","picometre per second","pm/s",Picometre, SecondTime);
		Zettafarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettafarad","zettafarad","ZF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		CubicExametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_exametre","cubic exametre","Em3",Exametre, 3.0);
		Zeptogray = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptogray","zeptogray","zGy",(SingularUnit)Gray, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		MolePerCentimetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_centimetre","mole per centimetre","mol/cm",Mole, Centimetre);
		NorwegianKrone = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/Norwegian_krone", "Norwegian krone", "null", null);
		GillUS =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gill-US", "gill (US)", "gi", CubicMetre, 1.182941E-4 );
		Nanoradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanoradian","nanoradian","nrad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		ReciprocalCubicParsec = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/reciprocal_cubic_parsec","reciprocal cubic parsec","pc-3",Parsec, -3.0);
		KilogramSquareMetre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_square_metre","kilogram square metre","kg m2",Kilogram, SquareMetre);
		PetagramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/petagram_per_litre","petagram per litre","Pg/l",Petagram, Litre);
		MolePerPetalitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_petalitre","mole per petalitre","mol/Pl",Mole, Petalitre);
		CubicTerametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/cubic_terametre","cubic terametre","Tm3",Terametre, 3.0);
		Micron =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/micron", "micron", "μ", Metre, 1.0E-6 );
		AmperePerVolt = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/ampere_per_volt","ampere per volt","A/V",Ampere, Volt);
		Decapascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decapascal","decapascal","daPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Yoctoweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctoweber","yoctoweber","yWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		RadianPerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/radian_per_second-time_squared","radian per second squared","rad/s2",Radian, SecondTimeSquared);
		ThermUS =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/therm-US", "therm (US)", "null", Joule, 1.054804E8 );
		Decilumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decilumen","decilumen","dlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Yottaweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottaweber","yottaweber","YWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Exacandela = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exacandela","exacandela","Ecd",(SingularUnit)Candela, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Hectocoulomb = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectocoulomb","hectocoulomb","hC",(SingularUnit)Coulomb, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		ExamolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/examole_per_litre","examole per litre","Emol/l",Examole, Litre);
		Centiweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centiweber","centiweber","cWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Exajoule = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exajoule","exajoule","EJ",(SingularUnit)Joule, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		MetrePerYoctosecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_yoctosecond-time_squared","metre per yoctosecond squared","m/ys2",Metre, YoctosecondTimeSquared);
		Angstrom =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/angstrom", "ångström", "Å", Metre, 1.0E-10 );
		Yottanewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottanewton","yottanewton","YN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Milliweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/milliweber","milliweber","mWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.MILLI);
		DeltaA450PerSecondTimePerMilligram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/delta_A450_per_second-time_per_milligram","delta A450 per second per milligram","null",DeltaA450PerSecondTime, Milligram);
		WattSquareMetre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/watt_square_metre","watt square metre","W m2",Watt, SquareMetre);
		Yottabecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottabecquerel","yottabecquerel","YBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Furlong =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/furlong", "furlong", "null", Metre, 201.168 );
		GigamolePerMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigamole_per_metre","gigamole per metre","Gmol/m",Gigamole, Metre);
		Gigabyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigabyte","gigabyte","GB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		WeberPerAmpere = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/weber_per_ampere","weber per ampere","Wb/A",Weber, Ampere);
		Petalux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petalux","petalux","Plx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		SquareYoctometre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_yoctometre","square yoctometre","ym2",Yoctometre, 2.0);
		MoleMicrometreReciprocalSquareCentimetreReciprocalSecondTimeReciprocalAtmosphereStandard = null;
		Yottakatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottakatal","yottakatal","Ykat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		Femtoradian = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtoradian","femtoradian","frad",(SingularUnit)Radian, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		MetrePerAttosecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_attosecond-time","metre per attosecond","m/as",Metre, AttosecondTime);
		Yottamolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottamolair","yottamolair","YM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		SquareMillimetre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_millimetre","square millimetre","mm2",Millimetre, 2.0);
		SquareTerametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_terametre","square terametre","Tm2",Terametre, 2.0);
		SecondTimePerDay = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/second-time_per_day","second per day","s/d",SecondTime, Day);
		Zettatesla = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zettatesla","zettatesla","ZT",(SingularUnit)Tesla, nl.wur.fbr.om.prefixes.DecimalPrefix.ZETTA);
		SolarLuminosity =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/solar_luminosity", "solar luminosity", "L_☉", Watt, 3.839E26 );
		Perm0C =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/perm-0_C", "perm (0 °C)", "null", KilogramPerPascalSecondTimeSquareMetre, 5.72135E-11 );
		MetrePerZettasecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_zettasecond-time","metre per zettasecond","m/Zs",Metre, ZettasecondTime);
		FootUSSurvey =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/foot-US_survey", "foot (US survey)", "ft", Metre, 0.3048006 );
		GramMetreToThePower2ReciprocalMetre = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_metre_to_the_power_-2_reciprocal_metre","gram metre to the power -2 reciprocal metre","g m-2 m-1",Gram, MetreToThePower2);
		CentigramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/centigram_per_litre","centigram per litre","cg/l",Centigram, Litre);
		Microvolt = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microvolt","microvolt","μV",(SingularUnit)Volt, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Yard =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yard", "yard", "yd", Metre, 0.9144 );
		KilocolonyFormingUnit = null;
		Yoctokatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yoctokatal","yoctokatal","ykat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.YOCTO);
		ExagramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/exagram_per_litre","exagram per litre","Eg/l",Exagram, Litre);
		Yottaohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottaohm","yottaohm","YΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		GigagramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigagram_per_litre","gigagram per litre","Gg/l",Gigagram, Litre);
		JoulePerKilogram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/joule_per_kilogram","joule per kilogram","J/kg",Joule, Kilogram);
		Megaampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megaampere","megaampere","MA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		TonnePerCubicMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/tonne_per_cubic_metre","tonne per cubic metre","t/m3",Tonne, CubicMetre);
		TonOfTNT =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/ton_of_TNT", "ton of TNT", "null", Joule, 4.184E9 );
		Picoohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picoohm","picoohm","pΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		CentidegreeCelsius = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centidegree_Celsius","centidegree Celsius","c°C",(SingularUnit)DegreeCelsius, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Shannon = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/shannon", "shannon", "Sh", null);
		Picobecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picobecquerel","picobecquerel","pBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		Decakatal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decakatal","decakatal","dakat",(SingularUnit)Katal, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Nanoohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanoohm","nanoohm","nΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		GramPerCentilitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_centilitre","gram per centilitre","g/cl",Gram, Centilitre);
		Gamma =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gamma", "gamma", "γ", Tesla, 1.0E-9 );
		Teraweber = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/teraweber","teraweber","TWb",(SingularUnit)Weber, nl.wur.fbr.om.prefixes.DecimalPrefix.TERA);
		TeramolePerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/teramole_per_litre","teramole per litre","Tmol/l",Teramole, Litre);
		Exanewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exanewton","exanewton","EN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Poundal =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/poundal", "poundal", "null", Newton, 0.138255 );
		Zeptobecquerel = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptobecquerel","zeptobecquerel","zBq",(SingularUnit)Becquerel, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		MolePerAttolitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_attolitre","mole per attolitre","mol/al",Mole, Attolitre);
		NanounifiedAtomicMassUnit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/nanounified_atomic_mass_unit","nanounified atomic mass unit","nu",(SingularUnit)UnifiedAtomicMassUnit, nl.wur.fbr.om.prefixes.DecimalPrefix.NANO);
		VoltSecondTime = new UnitMultiplicationImpl("http://www.wurvoc.org/vocabularies/om-1.8/volt_second-time","volt second","V s",Volt, SecondTime);
		Attoampere = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attoampere","attoampere","aA",(SingularUnit)Ampere, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Gigaparsec = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigaparsec","gigaparsec","Gpc",(SingularUnit)Parsec, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		SquareMetrePerGram = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_metre_per_gram","square metre per gram","m2/g",SquareMetre, Gram);
		Zeptohenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptohenry","zeptohenry","zH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.ZEPTO);
		ExametrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/exametre_per_second-time_squared","exametre per second squared","Em/s2",Exametre, SecondTimeSquared);
		KilogramPerSquareMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilogram_per_square_metre","kilogram per square metre","kg/m2",Kilogram, SquareMetre);
		MolePerDecimetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_decimetre","mole per decimetre","mol/dm",Mole, Decimetre);
		GramPerCubicMetre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gram_per_cubic_metre","gram per cubic metre","g/m3",Gram, CubicMetre);
		Fathom =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/fathom", "fathom", "null", Metre, 1.828804 );
		Meganewton = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/meganewton","meganewton","MN",(SingularUnit)Newton, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Exabyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exabyte","exabyte","EB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Micropascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/micropascal","micropascal","μPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Decaohm = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decaohm","decaohm","daΩ",(SingularUnit)Ohm, nl.wur.fbr.om.prefixes.DecimalPrefix.DECA);
		Gigapascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigapascal","gigapascal","GPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Statampere =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/statampere", "statampere", "statA", Ampere, 3.335641E-10 );
		Centisievert = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centisievert","centisievert","cSv",(SingularUnit)Sievert, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		MetrePerGigasecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_gigasecond-time","metre per gigasecond","m/Gs",Metre, GigasecondTime);
		Kilopascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilopascal","kilopascal","kPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Calorie20C =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/calorie-20_C", "calorie (20 °C)", "cal_20", Joule, 4.1819 );
		GigametrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigametre_per_second-time_squared","gigametre per second squared","Gm/s2",Gigametre, SecondTimeSquared);
		Attokelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/attokelvin","attokelvin","aK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.ATTO);
		Hectolumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hectolumen","hectolumen","hlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.HECTO);
		OunceAvoirdupois =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/ounce-avoirdupois", "ounce (avoirdupois)", "oz", Kilogram, 0.02834952 );
		MolePerPicometre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/mole_per_picometre","mole per picometre","mol/pm",Mole, Picometre);
		Picolumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picolumen","picolumen","plm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		ZeptogramPerLitre = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/zeptogram_per_litre","zeptogram per litre","zg/l",Zeptogram, Litre);
		MetrePerYottasecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_yottasecond-time_squared","metre per yottasecond squared","m/Ys2",Metre, YottasecondTimeSquared);
		LitrePerMole = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/litre_per_mole","litre per mole","l/mol",Litre, Mole);
		Decihertz = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decihertz","decihertz","dHz",(SingularUnit)Hertz, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Gigafarad = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/gigafarad","gigafarad","GF",(SingularUnit)Farad, nl.wur.fbr.om.prefixes.DecimalPrefix.GIGA);
		Microlumen = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/microlumen","microlumen","μlm",(SingularUnit)Lumen, nl.wur.fbr.om.prefixes.DecimalPrefix.MICRO);
		Yottabit = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/yottabit","yottabit","Ybit",(SingularUnit)Bit, nl.wur.fbr.om.prefixes.DecimalPrefix.YOTTA);
		VoltPerAmpere = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/volt_per_ampere","volt per ampere","V/A",Volt, Ampere);
		PointDidot =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/point-Didot", "point (Didot)", "pt", Metre, 3.759E-4 );
		AttometrePerSecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/attometre_per_second-time_squared","attometre per second squared","am/s2",Attometre, SecondTimeSquared);
		Megakelvin = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/megakelvin","megakelvin","MK",(SingularUnit)Kelvin, nl.wur.fbr.om.prefixes.DecimalPrefix.MEGA);
		Centimolair = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centimolair","centimolair","cM",(SingularUnit)Molair, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Kilotonne = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilotonne","kilotonne","kt",(SingularUnit)Tonne, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		Petabyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petabyte","petabyte","PB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Decisiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/decisiemens","decisiemens","dS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.DECI);
		Hartley =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/hartley", "hartley", "Hart", Bit, 3.321928095 );
		Exalux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/exalux","exalux","Elx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.EXA);
		Bushel =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/bushel", "bushel", "bu", CubicMetre, 0.03523907 );
		Picopascal = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/picopascal","picopascal","pPa",(SingularUnit)Pascal, nl.wur.fbr.om.prefixes.DecimalPrefix.PICO);
		MetrePerMillisecondTimeSquared = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_millisecond-time_squared","metre per millisecond squared","m/ms2",Metre, MillisecondTimeSquared);
		Centisiemens = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/centisiemens","centisiemens","cS",(SingularUnit)Siemens, nl.wur.fbr.om.prefixes.DecimalPrefix.CENTI);
		Petahenry = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/petahenry","petahenry","PH",(SingularUnit)Henry, nl.wur.fbr.om.prefixes.DecimalPrefix.PETA);
		Cicero =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/cicero", "cicero", "null", PointDidot, 12.0 );
		SquareMegametre = new UnitExponentiationImpl("http://www.wurvoc.org/vocabularies/om-1.8/square_megametre","square megametre","Mm2",Megametre, 2.0);
		Stere = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/stere", "stere", "null", null);
		Rad =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/rad", "rad", "rad", Gray, 0.01 );
		Kilobyte = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/kilobyte","kilobyte","kB",(SingularUnit)Byte, nl.wur.fbr.om.prefixes.DecimalPrefix.KILO);
		MetrePerCentisecondTime = new UnitDivisionImpl("http://www.wurvoc.org/vocabularies/om-1.8/metre_per_centisecond-time","metre per centisecond","m/cs",Metre, CentisecondTime);
		PoundForce =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/pound-force", "pound-force", "lbf", Newton, 4.448222 );
		TonRegister =  new SingularUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/ton-register", "ton (register)", "null", CubicMetre, 2.831658 );
		Femtolux = new PrefixedUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/femtolux","femtolux","flx",(SingularUnit)Lux, nl.wur.fbr.om.prefixes.DecimalPrefix.FEMTO);
		InternationalUnit = new BaseUnitImpl("http://www.wurvoc.org/vocabularies/om-1.8/International_Unit", "International Unit", "IU", nl.wur.fbr.om.model.dimensions.SIBaseDimension.MASS);
	}
}