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
 * <code>om:geometry</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Tue Aug 11 12:27:59 CEST 2015.
 */
public class Geometry {

	/** The light year is a unit of length defined as 9.46073e15 metre. */
	public static Unit LightYear = OM.LightYear;

	public static Unit CubicKilometre = OM.CubicKilometre;

	/** The US gill is a unit of volume defined as 1.182941e-4 cubic metre. */
	public static Unit GillUS = OM.GillUS;

	public static Unit Nanoradian = OM.Nanoradian;

	public static Unit CubicNanometre = OM.CubicNanometre;

	/** The terametre is a unit of length defined as 1.0e12 metre. */
	public static Unit Terametre = OM.Terametre;

	public static Unit CubicMicrometre = OM.CubicMicrometre;

	/** The nanometre is a unit of length defined as 1.0e-9 metre. */
	public static Unit Nanometre = OM.Nanometre;

	/** The kilometre is a unit of length defined as 1.0e3 metre. */
	public static Unit Kilometre = OM.Kilometre;

	/** The US dry pint is a unit of volume defined as 5.506105e-4 cubic metre. */
	public static Unit DryPintUS = OM.DryPintUS;

	/** The second (angle) is a unit of angle defined as 4.848137e-6 radian. */
	public static Unit SecondAngle = OM.SecondAngle;

	public static Unit Megalitre = OM.Megalitre;

	public static Unit CubicTerametre = OM.CubicTerametre;

	public static Unit Nanolitre = OM.Nanolitre;

	public static Unit Attosteradian = OM.Attosteradian;

	/** The micron is a unit of length defined as 1.0e-6 metre. */
	public static Unit Micron = OM.Micron;

	/** The peck is a unit of volume defined as 8.809768e-3 cubic metre. */
	public static Unit Peck = OM.Peck;

	public static Unit Decalitre = OM.Decalitre;

	public static Unit SquareFemtometre = OM.SquareFemtometre;

	/** The centiare is a unit of area defined as 1.0e-2 are. */
	public static Unit Centiare = OM.Centiare;

	/** The statute mile is a unit of length defined as 1.609344e3 metre. */
	public static Unit MileStatute = OM.MileStatute;

	/** The tablespoon is a unit of volume defined as 1.478676e-5 cubic metre. */
	public static Unit Tablespoon = OM.Tablespoon;

	/** The cup is a unit of volume defined as 2.365882e-4 cubic metre. */
	public static Unit Cup = OM.Cup;

	/** The parsec is a unit of length defined as 3.08567802e16 metre. */
	public static Unit Parsec = OM.Parsec;

	public static Unit SquarePicometre = OM.SquarePicometre;

	public static Unit CubicDecametre = OM.CubicDecametre;

	/** The US survey mile is a unit of length defined as 1.609347e3 metre. */
	public static Unit MileUSSurvey = OM.MileUSSurvey;

	/** The degree is a unit of angle defined as 1.745329e-2 radian. */
	public static Unit Degree = OM.Degree;

	/** The millimetre is a unit of length defined as 1.0e-3 metre. */
	public static Unit Millimetre = OM.Millimetre;

	/** The US fluid ounce is a unit of volume defined as 2.957353e-5 cubic metre. */
	public static Unit FluidOunceUS = OM.FluidOunceUS;

	public static Unit CubicKiloparsec = OM.CubicKiloparsec;

	public static Unit SquareGigametre = OM.SquareGigametre;

	public static Unit SquareCentimetre = OM.SquareCentimetre;

	/** The radian is a unit of angle defined as the angle subtended at the center of a circle by an arc that is equal in length to the radius of the circle. */
	public static Unit Radian = OM.Radian;

	public static Unit CubicDecimetre = OM.CubicDecimetre;

	public static Unit SquareMicrometre = OM.SquareMicrometre;

	/** The are is a unit of area defined as 100 square metre. */
	public static Unit Are = OM.Are;

	/** The desserspoon is a unit of volume defined as 2 teaspoon. */
	public static Unit Dessertspoon = OM.Dessertspoon;

	public static Unit CubicMegametre = OM.CubicMegametre;

	/** The steradian is a unit of solid angle defined as the solid angle subtended at the center of a sphere by a portion of the surface of the sphere that has an area equal to the square of the radius of the sphere. */
	public static Unit Steradian = OM.Steradian;

	public static Unit Attoradian = OM.Attoradian;

	public static Unit Petalitre = OM.Petalitre;

	/** The ångström is a unit of length defined as 1.0e-10 metre. The unit is often used for wavelengths of electromagnetic radiation or to express the sizes of atoms and molecules. */
	public static Unit Angstrom = OM.Angstrom;

	public static Unit SquarePetametre = OM.SquarePetametre;

	public static Unit Kilolitre = OM.Kilolitre;

	/** The imperial fluid ounce is a unit of volume defined as 2.841306e-5 cubic metre. */
	public static Unit FluidOunceImperial = OM.FluidOunceImperial;

	public static Unit Decisteradian = OM.Decisteradian;

	/** The chain is a unit of length defined as 2.011684e1 metre. */
	public static Unit Chain = OM.Chain;

	/** The imperial gallon is a unit of volume defined as 4.54609e-3 cubic metre. */
	public static Unit GallonImperial = OM.GallonImperial;

	/** The fermi is a unit of length defined as 1.0e-15 metre. */
	public static Unit Fermi = OM.Fermi;

	public static Unit SquareAttometre = OM.SquareAttometre;

	public static Unit CubicPetametre = OM.CubicPetametre;

	/** The inch is a unit of length defined as 2.54e-2 metre. */
	public static Unit Inch = OM.Inch;

	/** The millisecond (angle) is a unit of length defined as 1.0e-3 second (angle). Used in astronomy (measurements of positions of stars, galaxies, etc.) to represent the error. */
	public static Unit MillisecondAngle = OM.MillisecondAngle;

	/** The furlong is a unit of length defined as 201.168 metre. */
	public static Unit Furlong = OM.Furlong;

	/** The petametre is a unit of length defined as 1.0e15 metre. */
	public static Unit Petametre = OM.Petametre;

	public static Unit Microradian = OM.Microradian;

	public static Unit Milliradian = OM.Milliradian;

	/** The imperial gill is a unit of volume defined as 1.420653e-4 cubic metre. */
	public static Unit GillImperial = OM.GillImperial;

	/** The minute (angle) is a unit of angle defined as 2.908882e-4 radian. */
	public static Unit MinuteAngle = OM.MinuteAngle;

	public static Unit CubicCentimetre = OM.CubicCentimetre;

	public static Unit Hectolitre = OM.Hectolitre;

	public static Unit Femtoradian = OM.Femtoradian;

	/** The ATA point is a unit of length defined as 0.3514598e-3 metre. */
	public static Unit PointATA = OM.PointATA;

	public static Unit Picoradian = OM.Picoradian;

	public static Unit SquareMillimetre = OM.SquareMillimetre;

	public static Unit Microsteradian = OM.Microsteradian;

	public static Unit SquareTerametre = OM.SquareTerametre;

	public static Unit Picosteradian = OM.Picosteradian;

	/** The Postscript pica is a unit of length defined as 12 point (Postscript). */
	public static Unit PicaPostscript = OM.PicaPostscript;

	/** The hectometre is a unit of length defined as 1.0e2 metre. */
	public static Unit Hectometre = OM.Hectometre;

	/** The gon is a unit of angle defined as 1.570796e-2 radian. */
	public static Unit Gon = OM.Gon;

	/** The ATA pica is a unit of length defined as 12 point (ATA). */
	public static Unit PicaATA = OM.PicaATA;

	/** The acre foot is a unit of volume defined as 1.233489e3 cubic metre. */
	public static Unit AcreFoot = OM.AcreFoot;

	/** The US survey foot is a unit of length defined as 3.048006e-1 metre. */
	public static Unit FootUSSurvey = OM.FootUSSurvey;

	/** The nautical mile is a unit of length defined as 1852 metre. */
	public static Unit NauticalMile = OM.NauticalMile;

	/** The decametre is a unit of length defined as 1.0e1 metre. */
	public static Unit Decametre = OM.Decametre;

	/** The yard is a unit of length defined as 9.144e-1 metre. */
	public static Unit Yard = OM.Yard;

	/** Cubic metre is a unit of volume defined as the volume of a cube whose sides measure exactly one metre. */
	public static Unit CubicMetre = OM.CubicMetre;

	/** The megametre is a unit of length defined as 1.0e6 metre. */
	public static Unit Megametre = OM.Megametre;

	public static Unit SquareDecimetre = OM.SquareDecimetre;

	/** The revolution is a unit of angle defined as 6.283185 radian. */
	public static Unit Revolution = OM.Revolution;

	/** The metre is a unit of length defined as the length of the path travelled by light in vacuum during a time interval of 1/299 792 458 of a second. */
	public static Unit Metre = OM.Metre;

	public static Unit CubicPicometre = OM.CubicPicometre;

	public static Unit SquareExametre = OM.SquareExametre;

	/** The hectare is a unit of area defined as 1.0e2 are. */
	public static Unit Hectare = OM.Hectare;

	/** The cicular mil is a unit of area defined as 5.067075e-10 square metre. */
	public static Unit CircularMil = OM.CircularMil;

	/** The picometre is a unit of length defined as 1.0e-12 metre. */
	public static Unit Picometre = OM.Picometre;

	/** The litre is a unit of volume defined as 1.0e-3 cubic metre. */
	public static Unit Litre = OM.Litre;

	/** The atronomical unit is a unit of length defined as 149 597 870 700 metre (IAU 2012 Resolution). */
	public static Unit AstronomicalUnit = OM.AstronomicalUnit;

	public static Unit Gigalitre = OM.Gigalitre;

	public static Unit CubicHectometre = OM.CubicHectometre;

	public static Unit Millisteradian = OM.Millisteradian;

	public static Unit Femtolitre = OM.Femtolitre;

	/** The attometre is a unit of length defined as 1.0e-18 metre. */
	public static Unit Attometre = OM.Attometre;

	public static Unit Centilitre = OM.Centilitre;

	/** The Postscript point is a unit of length defined as 0.013888888888888888888888888888889 inch. */
	public static Unit PointPostscript = OM.PointPostscript;

	/** The US gallon is a unit of volume defined as 3.785412e-3 cubic metre. */
	public static Unit GallonUS = OM.GallonUS;

	public static Unit CubicGigametre = OM.CubicGigametre;

	public static Unit Exalitre = OM.Exalitre;

	/** The gigametre is a unit of length defined as 1.0e9 metre. */
	public static Unit Gigametre = OM.Gigametre;

	/** The cord is a unit of volume defined as 3.624556 cubic metre. */
	public static Unit Cord = OM.Cord;

	public static Unit SquareNanometre = OM.SquareNanometre;

	/** Square metre is a unit of area defined as the area of a square whose sides measure exactly one metre. */
	public static Unit SquareMetre = OM.SquareMetre;

	/** The rod is a unit of length defined as 5.029210 metre. */
	public static Unit Rod = OM.Rod;

	/** The centimetre is a unit of length defined as 1.0e-2 metre. */
	public static Unit Centimetre = OM.Centimetre;

	/** The femtometre is a unit of length defined as 1.0e-15 metre. */
	public static Unit Femtometre = OM.Femtometre;

	/** The fathom is a unit of length defined as 1.828804 metre. */
	public static Unit Fathom = OM.Fathom;

	/** The US dry gallon is a unit of volume defined as 4.40488377086e-3 cubic metre. */
	public static Unit DryGallonUS = OM.DryGallonUS;

	/** The foot is a unit of foot defined as 3.048e-1 metre. */
	public static Unit Foot = OM.Foot;

	public static Unit CubicAttometre = OM.CubicAttometre;

	/** The microsecond (angle) is a unit of length defined as 1.0e-6 second (angle). Used in astronomy (measurements of positions of stars, galaxies, etc.) to represent the error. */
	public static Unit MicrosecondAngle = OM.MicrosecondAngle;

	public static Unit Picolitre = OM.Picolitre;

	/** The mil (length) is a unit of length defined as 2.54e-5 metre. */
	public static Unit MilLength = OM.MilLength;

	/** The exametre is a unit of length defined as 1.0e18 metre. */
	public static Unit Exametre = OM.Exametre;

	/** The megaparsec is a unit of length defined as 1.0e6 parsec. Gebruikt voor afstanden op de schaal van clusters. */
	public static Unit Megaparsec = OM.Megaparsec;

	public static Unit Microlitre = OM.Microlitre;

	/** The micrometre is a unit of length defined as 1.0e-6 metre. */
	public static Unit Micrometre = OM.Micrometre;

	public static Unit Centisteradian = OM.Centisteradian;

	/** The mil (angle) is a unit of angle defined as 9.817477e-4 radian. */
	public static Unit MilAngle = OM.MilAngle;

	public static Unit Deciradian = OM.Deciradian;

	public static Unit SquareKilometre = OM.SquareKilometre;

	/** The decimetre is a unit of length defined as 1.0e-1 metre. */
	public static Unit Decimetre = OM.Decimetre;

	public static Unit Centiradian = OM.Centiradian;

	/** The barn is a unit of area defined as 1.0e-28 square metre. */
	public static Unit Barn = OM.Barn;

	public static Unit CubicParsec = OM.CubicParsec;

	public static Unit CubicMillimetre = OM.CubicMillimetre;

	public static Unit DegreeSquared = OM.DegreeSquared;

	public static Unit CubicFemtometre = OM.CubicFemtometre;

	/** The TeX point is a unit of length defined as 0.01383700013837000138370001383 inch. */
	public static Unit PointTeX = OM.PointTeX;

	/** The US liquid pint is a unit of volume defined as 4.731765e-4 cubic metre. */
	public static Unit LiquidPintUS = OM.LiquidPintUS;

	public static Unit SquareDecametre = OM.SquareDecametre;

	/** The Didot point is a unit of length defined as 0.3759e-3 metre. */
	public static Unit PointDidot = OM.PointDidot;

	/** The imperial quart is a unit of volume defined as 1.1365 litre. */
	public static Unit QuartImperial = OM.QuartImperial;

	public static Unit Femtosteradian = OM.Femtosteradian;

	public static Unit Millilitre = OM.Millilitre;

	/** The teaspoon is a unit of volume defined as 4.928922e-6 cubic metre. */
	public static Unit Teaspoon = OM.Teaspoon;

	/** The US dry quart is a unit of volume defined as 1.101221e-3 cubic metre. */
	public static Unit DryQuartUS = OM.DryQuartUS;

	/** The bushel is a unit of volume defined as 3.523907e-2 cubic metre. */
	public static Unit Bushel = OM.Bushel;

	/** The acre is a unit of area defined as 4.046873e3 square metre. */
	public static Unit Acre = OM.Acre;

	/** The barrel is a unit of volume defined as 1.589873e-1 cubic metre. */
	public static Unit Barrel = OM.Barrel;

	public static Unit SquareHectometre = OM.SquareHectometre;

	/** The cicero is a unit of length defined as 12 point (Didot). */
	public static Unit Cicero = OM.Cicero;

	/** The TeX pica is a unit of length defined as 12 point (TeX). */
	public static Unit PicaTeX = OM.PicaTeX;

	public static Unit SquareMegametre = OM.SquareMegametre;

	public static Unit Teralitre = OM.Teralitre;

	/** The stere is a unit of volume defined as cubic metre. */
	public static Unit Stere = OM.Stere;

	public static Unit Nanosteradian = OM.Nanosteradian;

	public static Unit Attolitre = OM.Attolitre;

	/** The register ton is a unit of volume defined as 2.831658 cubic metre. */
	public static Unit TonRegister = OM.TonRegister;

	/** The US liquid quart is a unit of volume defined as 9.463529e-4 cubic metre. */
	public static Unit LiquidQuartUS = OM.LiquidQuartUS;

	/** The pint is a unit of volume defined as 568.26125 millilitre. */
	public static Unit PintImperial = OM.PintImperial;

	public static Unit CubicExametre = OM.CubicExametre;

	public static Unit MetrePerMetre = OM.MetrePerMetre;

	public static Unit Decilitre = OM.Decilitre;

}