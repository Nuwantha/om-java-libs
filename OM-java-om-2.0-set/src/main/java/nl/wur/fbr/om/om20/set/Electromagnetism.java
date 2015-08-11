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
 * <code>om:electromagnetism</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Tue Aug 11 12:27:59 CEST 2015.
 */
public class Electromagnetism {

	/** The franklin is a unit of electric charge defined as 3.335641e-10 coulomb. */
	public static Unit Franklin = OM.Franklin;

	/** The statvolt is a unit of electric potential defined as 2.997925e2 volt. */
	public static Unit Statvolt = OM.Statvolt;

	public static Unit Microohm = OM.Microohm;

	/** The volt is a unit of electric potential defined as watt divided by ampere = joule divided by coulomb = newton times metre divided by ampere times second = kilogram times square metre divided by ampere times second to the power 3. */
	public static Unit Volt = OM.Volt;

	public static Unit Exaweber = OM.Exaweber;

	public static Unit Femtotesla = OM.Femtotesla;

	/** The abohm is a unit of electrical resistance defined as 1.0e-9 ohm. */
	public static Unit Abohm = OM.Abohm;

	public static Unit Gigasiemens = OM.Gigasiemens;

	/** The statcoulomb is a unit of electric charge defined as 3.335641e-10 coulomb. */
	public static Unit Statcoulomb = OM.Statcoulomb;

	/** The mho is a unit of electrical conductance defined as 1 siemens. */
	public static Unit Mho = OM.Mho;

	/** The femtocoulomb is a unit of electric charge defined as 1.0e-15 coulomb. */
	public static Unit Femtocoulomb = OM.Femtocoulomb;

	/** The weber is a unit of magnetic flux defined as kilogram times square metre divided by second squared times ampere = volt times second = joule divided by ampere. */
	public static Unit Weber = OM.Weber;

	public static Unit Attoohm = OM.Attoohm;

	/** The centicoulomb is a unit of electric charge defined as 1.0e-2 coulomb. */
	public static Unit Centicoulomb = OM.Centicoulomb;

	/** The decicoulomb is a unit of electric charge defined as 1.0e-1 coulomb. */
	public static Unit Decicoulomb = OM.Decicoulomb;

	/** The oersted is a unit of magnetic field defined as 7.957747e1 ampere per metre. */
	public static Unit Oersted = OM.Oersted;

	public static Unit Gigaweber = OM.Gigaweber;

	public static Unit Megasiemens = OM.Megasiemens;

	/** The deciampere is a unit of electric current defined as 1.0e-1 ampere. */
	public static Unit Deciampere = OM.Deciampere;

	/** The petaampere is a unit of electric current defined as 1.0e15 ampere. */
	public static Unit Petaampere = OM.Petaampere;

	public static Unit Gigatesla = OM.Gigatesla;

	/** The ampere is a unit of electric current defined as the constant current that produces an attractive force of 2e–7 newton per metre of length between two straight, parallel conductors of infinite length and negligible circular cross section placed one metre apart in a vacuum. */
	public static Unit Ampere = OM.Ampere;

	public static Unit Femtosiemens = OM.Femtosiemens;

	public static Unit Picotesla = OM.Picotesla;

	public static Unit Picoweber = OM.Picoweber;

	public static Unit Microweber = OM.Microweber;

	public static Unit Gigaohm = OM.Gigaohm;

	/** The tesla is a unit of magnetic flux density defined as volt times second divided by square metre = newton divided by ampere times metre = weber divided by square metre = kilogram divided by coulomb times second = kilogram divided by ampere times second squared. */
	public static Unit Tesla = OM.Tesla;

	/** The megacoulomb is a unit of electric charge defined as 1.0e6 coulomb. */
	public static Unit Megacoulomb = OM.Megacoulomb;

	/** The centifarad is a unit of capacitance defined as 1.0e-2 farad. */
	public static Unit Centifarad = OM.Centifarad;

	/** The decafarad is a unit of capacitance defined as 1.0e1 farad. */
	public static Unit Decafarad = OM.Decafarad;

	public static Unit Microtesla = OM.Microtesla;

	public static Unit CoulombPerVolt = OM.CoulombPerVolt;

	/** The gauss is a unit of magnetic flux density defined as 1.0e-4 tesla. */
	public static Unit Gauss = OM.Gauss;

	public static Unit Teravolt = OM.Teravolt;

	public static Unit Attoweber = OM.Attoweber;

	public static Unit Femtoohm = OM.Femtoohm;

	public static Unit Femtoweber = OM.Femtoweber;

	public static Unit WattPerAmpere = OM.WattPerAmpere;

	/** The decacoulomb is a unit of electric charge defined as 1.0e1 coulomb. */
	public static Unit Decacoulomb = OM.Decacoulomb;

	public static Unit Exatesla = OM.Exatesla;

	public static Unit HenryPerMetre = OM.HenryPerMetre;

	public static Unit Decavolt = OM.Decavolt;

	/** The nanofarad is a unit of capacitance defined as 1.0e-9 farad. */
	public static Unit Nanofarad = OM.Nanofarad;

	public static Unit Deciweber = OM.Deciweber;

	public static Unit Gigavolt = OM.Gigavolt;

	public static Unit Millivolt = OM.Millivolt;

	public static Unit Exasiemens = OM.Exasiemens;

	/** The stathenry is a unit of inductance defined as 8.987552e11 henry. */
	public static Unit Stathenry = OM.Stathenry;

	/** The centihenry is a unit of inductance defined as 1.0e-2 henry. */
	public static Unit Centihenry = OM.Centihenry;

	/** The nanoampere is a unit of electric current defined as 1.0e-9 ampere. */
	public static Unit Nanoampere = OM.Nanoampere;

	/** The exaampere is a unit of electric current defined as 1.0e18 ampere. */
	public static Unit Exaampere = OM.Exaampere;

	/** The megafarad is a unit of capacitance defined as 1.0e6 farad. */
	public static Unit Megafarad = OM.Megafarad;

	/** Ampere per square metre is a unit of current density defined as ampere divided by square metre. */
	public static Unit AmperePerSquareMetre = OM.AmperePerSquareMetre;

	public static Unit Decitesla = OM.Decitesla;

	public static Unit ReciprocalHenry = OM.ReciprocalHenry;

	public static Unit Attotesla = OM.Attotesla;

	public static Unit Teratesla = OM.Teratesla;

	/** The femtoampere is a unit of electric current defined as 1.0e-15 ampere. */
	public static Unit Femtoampere = OM.Femtoampere;

	public static Unit Megohm = OM.Megohm;

	public static Unit WeberPerSquareMetre = OM.WeberPerSquareMetre;

	public static Unit Exavolt = OM.Exavolt;

	public static Unit Kiloweber = OM.Kiloweber;

	/** The decihenry is a unit of inductance defined as 1.0e-1 henry. */
	public static Unit Decihenry = OM.Decihenry;

	public static Unit Nanoweber = OM.Nanoweber;

	/** The biot is a unit of electric current defined as 10 ampere. */
	public static Unit Biot = OM.Biot;

	/** The abampere is a unit of electric current defined as 10 ampere. */
	public static Unit Abampere = OM.Abampere;

	public static Unit Decatesla = OM.Decatesla;

	/** The exafarad is a unit of capacitance defined as 1.0e18 farad. */
	public static Unit Exafarad = OM.Exafarad;

	/** The abfarad is a unit of capacitance defined as 1.0e9 farad. */
	public static Unit Abfarad = OM.Abfarad;

	public static Unit Deciohm = OM.Deciohm;

	/** The picofarad is a unit of capacitance defined as 1.0e-12 farad. */
	public static Unit Picofarad = OM.Picofarad;

	/** The abcoulomb is a unit of electric charge defined as 10 coulomb. */
	public static Unit Abcoulomb = OM.Abcoulomb;

	/** The millifarad is a unit of capacitance defined as 1.0e-3 farad. */
	public static Unit Millifarad = OM.Millifarad;

	/** The microfarad is a unit of capacitance defined as 1.0e-6 farad. */
	public static Unit Microfarad = OM.Microfarad;

	/** The nanocoulomb is a unit of electric charge defined as 1.0e-9 coulomb. */
	public static Unit Nanocoulomb = OM.Nanocoulomb;

	public static Unit Nanosiemens = OM.Nanosiemens;

	public static Unit Petatesla = OM.Petatesla;

	public static Unit Kilotesla = OM.Kilotesla;

	/** The statfarad is a unit of capacitance defined as 1.112650e-12 farad. */
	public static Unit Statfarad = OM.Statfarad;

	/** The hectohenry is a unit of inductance defined as 1.0e2 henry. */
	public static Unit Hectohenry = OM.Hectohenry;

	/** The picocoulomb is a unit of electric charge defined as 1.0e-12 coulomb. */
	public static Unit Picocoulomb = OM.Picocoulomb;

	/** The attohenry is a unit of inductance defined as 1.0e-18 henry. */
	public static Unit Attohenry = OM.Attohenry;

	/** The millihenry is a unit of inductance defined as 1.0e-3 henry. */
	public static Unit Millihenry = OM.Millihenry;

	public static Unit Nanotesla = OM.Nanotesla;

	/** The terafarad is a unit of capacitance defined as 1.0e12 farad. */
	public static Unit Terafarad = OM.Terafarad;

	/** The terahenry is a unit of inductance defined as 1.0e12 henry. */
	public static Unit Terahenry = OM.Terahenry;

	/** The stattesla is a unit of magnetic flux density defined as 2.9979e6 tesla. */
	public static Unit Stattesla = OM.Stattesla;

	/** The attofarad is a unit of capacitance defined as 1.0e-18 farad. */
	public static Unit Attofarad = OM.Attofarad;

	public static Unit Decivolt = OM.Decivolt;

	/** The henry is a unit of inductance defined as square metre times kilogram divided by second squared times ampere squared = weber divided by ampere = volt second divided by ampere = (joule divided by coulomb) times second divided by (coulomb divided by second) = joule times second squared divided by coulomb squared = square metre times kilogram divided by coulomb squared. */
	public static Unit Henry = OM.Henry;

	/** The microhenry is a unit of inductance defined as 1.0e-6 henry. */
	public static Unit Microhenry = OM.Microhenry;

	public static Unit Megatesla = OM.Megatesla;

	/** The statohm is a unit of electrical resistance defined as 8.987552e11 ohm. */
	public static Unit Statohm = OM.Statohm;

	/** The exahenry is a unit of inductance defined as 1.0e18 henry. */
	public static Unit Exahenry = OM.Exahenry;

	/** The microcoulomb is a unit of electric charge defined as 1.0e-6 coulomb. */
	public static Unit Microcoulomb = OM.Microcoulomb;

	/** The picohenry is a unit of inductance defined as 1.0e-12 henry. */
	public static Unit Picohenry = OM.Picohenry;

	public static Unit Decaweber = OM.Decaweber;

	/** The abhenry is a unit of inductance defined as 1.0e-9 henry. */
	public static Unit Abhenry = OM.Abhenry;

	public static Unit Petavolt = OM.Petavolt;

	/** The exacoulomb is a unit of electric charge defined as 1.0e18 coulomb. */
	public static Unit Exacoulomb = OM.Exacoulomb;

	public static Unit Kilosiemens = OM.Kilosiemens;

	/** The gigacoulomb is a unit of electric charge defined as 1.0e9 coulomb. */
	public static Unit Gigacoulomb = OM.Gigacoulomb;

	public static Unit Megaweber = OM.Megaweber;

	/** The petacoulomb is a unit of electric charge defined as 1.0e15 coulomb. */
	public static Unit Petacoulomb = OM.Petacoulomb;

	public static Unit CoulombPerCubicmetre = OM.CoulombPerCubicmetre;

	public static Unit Hectovolt = OM.Hectovolt;

	public static Unit Kilovolt = OM.Kilovolt;

	/** The teracoulomb is a unit of electric charge defined as 1.0e12 coulomb. */
	public static Unit Teracoulomb = OM.Teracoulomb;

	public static Unit Terasiemens = OM.Terasiemens;

	public static Unit Petasiemens = OM.Petasiemens;

	/** The coulomb is a unit of electric charge defined as ampere times second = farad times volt. */
	public static Unit Coulomb = OM.Coulomb;

	public static Unit AmperePerVolt = OM.AmperePerVolt;

	/** The decifarad is a unit of capacitance defined as 1.0e-1 farad. */
	public static Unit Decifarad = OM.Decifarad;

	/** The siemens is a unit of electrical conductance defined as 1 divided by ohm = ampere divided by volt = coulomb squared times second divided by kilogram times square metre = ampere squared times second to the power 3 divided by kilogram times square metre. */
	public static Unit Siemens = OM.Siemens;

	/** The unit pole is a unit of magnetic flux defined as 1.256637e-7 weber. */
	public static Unit UnitPole = OM.UnitPole;

	public static Unit Centitesla = OM.Centitesla;

	/** The decaampere is a unit of electric current defined as 1.0e1 ampere. */
	public static Unit Decaampere = OM.Decaampere;

	public static Unit CoulombMetre = OM.CoulombMetre;

	/** The kilofarad is a unit of capacitance defined as 1.0e3 farad. */
	public static Unit Kilofarad = OM.Kilofarad;

	/** The statweber is a unit of magnetic flux defined as 2.9979e2 weber. */
	public static Unit Statweber = OM.Statweber;

	public static Unit Petaweber = OM.Petaweber;

	/** The hectocoulomb is a unit of electric charge defined as 1.0e2 coulomb. */
	public static Unit Hectocoulomb = OM.Hectocoulomb;

	public static Unit Femtovolt = OM.Femtovolt;

	public static Unit Hectosiemens = OM.Hectosiemens;

	public static Unit Centiweber = OM.Centiweber;

	public static Unit Nanovolt = OM.Nanovolt;

	/** The picoampere is a unit of electric current defined as 1.0e-12 ampere. */
	public static Unit Picoampere = OM.Picoampere;

	/** The debye is a unit of electric dipole moment defined as 3.33564e-30 coulomb metre. */
	public static Unit Debye = OM.Debye;

	public static Unit Milliweber = OM.Milliweber;

	/** The abvolt is a unit of electric potential defined as 1.0e-8 volt. */
	public static Unit Abvolt = OM.Abvolt;

	/** The gilbert is a unit of electric current defined as 7.957747e-1 ampere. */
	public static Unit Gilbert = OM.Gilbert;

	public static Unit WeberPerAmpere = OM.WeberPerAmpere;

	/** The farad is a unit of capacitance defined as ampere times second divided by volt = coulomb divided by volt = coulomb squared divided by joule = coulomb squared divided by newton times metre = second squared times coulomb squared divided by square metre times kilogram = second to the power 4 times ampere squared divided by square metre times kilogram. */
	public static Unit Farad = OM.Farad;

	/** The gigahenry is a unit of inductance defined as 1.0e9 henry. */
	public static Unit Gigahenry = OM.Gigahenry;

	/** The statmho is a unit of electrical conductance defined as 1.112650e-12 siemens. */
	public static Unit Statmho = OM.Statmho;

	/** The hectoampere is a unit of electric current defined as 1.0e2 ampere. */
	public static Unit Hectoampere = OM.Hectoampere;

	public static Unit Teraohm = OM.Teraohm;

	public static Unit Microvolt = OM.Microvolt;

	public static Unit Milliohm = OM.Milliohm;

	public static Unit Megavolt = OM.Megavolt;

	/** The kilocoulomb is a unit of electric charge defined as 1.0e3 coulomb. */
	public static Unit Kilocoulomb = OM.Kilocoulomb;

	/** The hectofarad is a unit of capacitance defined as 1.0e2 farad. */
	public static Unit Hectofarad = OM.Hectofarad;

	public static Unit Centiohm = OM.Centiohm;

	/** The attocoulomb is a unit of electric charge defined as 1.0e-18 coulomb. */
	public static Unit Attocoulomb = OM.Attocoulomb;

	/** The megaampere is a unit of electric current defined as 1.0e6 ampere. */
	public static Unit Megaampere = OM.Megaampere;

	public static Unit Exaohm = OM.Exaohm;

	public static Unit SiemensPerMetre = OM.SiemensPerMetre;

	public static Unit Hectoohm = OM.Hectoohm;

	public static Unit Attosiemens = OM.Attosiemens;

	public static Unit Picoohm = OM.Picoohm;

	/** The maxwell is a unit of magnetic flux defined as 1.0e-8 weber. */
	public static Unit Maxwell = OM.Maxwell;

	/** The microampere is a unit of electric current defined as 1.0e-6 ampere. */
	public static Unit Microampere = OM.Microampere;

	public static Unit Millitesla = OM.Millitesla;

	public static Unit Nanoohm = OM.Nanoohm;

	/** The gigaampere is a unit of electric current defined as 1.0e9 ampere. */
	public static Unit Gigaampere = OM.Gigaampere;

	/** The abmho is a unit of electrical conductance defined as 1.0e9 siemens. */
	public static Unit Abmho = OM.Abmho;

	/** The gamma is a unit of magnetic flux density defined as 1.0e-9 tesla. */
	public static Unit Gamma = OM.Gamma;

	public static Unit Microsiemens = OM.Microsiemens;

	public static Unit Millisiemens = OM.Millisiemens;

	public static Unit Teraweber = OM.Teraweber;

	/** The ohm is a unit of electrical resistance defined as volt divided by ampere = square metre times kilogram divided by second to the power 3 times ampere squared. */
	public static Unit Ohm = OM.Ohm;

	/** The centiampere is a unit of electric current defined as 1.0e-2 ampere. */
	public static Unit Centiampere = OM.Centiampere;

	public static Unit VoltSecondTime = OM.VoltSecondTime;

	/** The attoampere is a unit of electric current defined as 1.0e-18 ampere. */
	public static Unit Attoampere = OM.Attoampere;

	/** The millicoulomb is a unit of electric charge defined as 1.0e-3 coulomb. */
	public static Unit Millicoulomb = OM.Millicoulomb;

	/** The milligauss is a unit of magnetic flux density defined as 1.0e-3 gauss. */
	public static Unit Milligauss = OM.Milligauss;

	/** The petafarad is a unit of capacitance defined as 1.0e15 farad. */
	public static Unit Petafarad = OM.Petafarad;

	/** The nanohenry is a unit of inductance defined as 1.0e-9 henry. */
	public static Unit Nanohenry = OM.Nanohenry;

	public static Unit OhmMetre = OM.OhmMetre;

	/** Ampere per metre is a unit of magnetic field defined as ampere divided by metre. */
	public static Unit AmperePerMetre = OM.AmperePerMetre;

	public static Unit Kilohm = OM.Kilohm;

	public static Unit Decaohm = OM.Decaohm;

	/** The statampere is a unit of electric current defined as 3.335641e-10 ampere. */
	public static Unit Statampere = OM.Statampere;

	/** The megahenry is a unit of inductance defined as 1.0e6 henry. */
	public static Unit Megahenry = OM.Megahenry;

	public static Unit Centivolt = OM.Centivolt;

	/** The teraampere is a unit of electric current defined as 1.0e12 ampere. */
	public static Unit Teraampere = OM.Teraampere;

	public static Unit CoulombPerSquareMetre = OM.CoulombPerSquareMetre;

	/** The decahenry is a unit of inductance defined as 1.0e1 henry. */
	public static Unit Decahenry = OM.Decahenry;

	public static Unit Picovolt = OM.Picovolt;

	public static Unit Attovolt = OM.Attovolt;

	public static Unit Picosiemens = OM.Picosiemens;

	/** The femtofarad is a unit of capacitance defined as 1.0e-15 farad. */
	public static Unit Femtofarad = OM.Femtofarad;

	public static Unit VoltPerMetre = OM.VoltPerMetre;

	public static Unit Decasiemens = OM.Decasiemens;

	/** The femtohenry is a unit of inductance defined as 1.0e-15 henry. */
	public static Unit Femtohenry = OM.Femtohenry;

	/** The gigafarad is a unit of capacitance defined as 1.0e9 farad. */
	public static Unit Gigafarad = OM.Gigafarad;

	public static Unit VoltPerAmpere = OM.VoltPerAmpere;

	public static Unit Hectotesla = OM.Hectotesla;

	public static Unit FaradPerMetre = OM.FaradPerMetre;

	public static Unit Decisiemens = OM.Decisiemens;

	public static Unit Centisiemens = OM.Centisiemens;

	/** The kilohenry is a unit of inductance defined as 1.0e3 henry. */
	public static Unit Kilohenry = OM.Kilohenry;

	/** The petahenry is a unit of inductance defined as 1.0e15 henry. */
	public static Unit Petahenry = OM.Petahenry;

	/** The milliampere is a unit of electric current defined as 1.0e-3 ampere. */
	public static Unit Milliampere = OM.Milliampere;

	public static Unit Petaohm = OM.Petaohm;

	public static Unit SecondTimeAmpere = OM.SecondTimeAmpere;

	public static Unit Hectoweber = OM.Hectoweber;

	/** The kiloampere is a unit of electric current defined as 1.0e3 ampere. */
	public static Unit Kiloampere = OM.Kiloampere;

	public static Unit NewtonPerCoulomb = OM.NewtonPerCoulomb;

	/** The faraday is a unit of electric charge defined as 9.648531e4 coulomb. */
	public static Unit Faraday = OM.Faraday;

}