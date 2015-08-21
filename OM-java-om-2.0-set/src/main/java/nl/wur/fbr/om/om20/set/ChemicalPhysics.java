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
 * <code>om:chemicalPhysics</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Thu Aug 13 21:23:59 CEST 2015.
 */
public class ChemicalPhysics {

	public static Unit MolePerCentimetre = OM.MolePerCentimetre;

	public static Unit MolePerFemtometre = OM.MolePerFemtometre;

	/** Mole per petalitre is a unit of amount of substance concentration defined as mole divided by petalitre. */
	public static Unit MolePerPetalitre = OM.MolePerPetalitre;

	/** Megamole per litre is a unit of amount of substance concentration defined as megamole divided by litre. */
	public static Unit MegamolePerLitre = OM.MegamolePerLitre;

	/** Mole per centilitre is a unit of amount of substance concentration defined as mole divided by centilitre. */
	public static Unit MolePerCentilitre = OM.MolePerCentilitre;

	/** Femtomole per litre is a unit of amount of substance concentration defined as femtomole divided by litre. */
	public static Unit FemtomolePerLitre = OM.FemtomolePerLitre;

	public static Unit AttomolePerMetre = OM.AttomolePerMetre;

	public static Unit MolePerPetametre = OM.MolePerPetametre;

	public static Unit MolePerMole = OM.MolePerMole;

	public static Unit MicromolePerMetre = OM.MicromolePerMetre;

	/** Attomole per litre is a unit of amount of substance concentration defined as attomole divided by litre. */
	public static Unit AttomolePerLitre = OM.AttomolePerLitre;

	public static Unit NanomolePerMetre = OM.NanomolePerMetre;

	public static Unit Centimole = OM.Centimole;

	/** The megamolair is a unit of amount of substance concentration defined as 1.0e6 molair. */
	public static Unit Megamolair = OM.Megamolair;

	public static Unit CubicMetrePerMole = OM.CubicMetrePerMole;

	public static Unit KilogramPerMole = OM.KilogramPerMole;

	public static Unit ExamolePerMetre = OM.ExamolePerMetre;

	/** Examole per litre is a unit of amount of substance concentration defined as examole divided by litre. */
	public static Unit ExamolePerLitre = OM.ExamolePerLitre;

	public static Unit DecimolePerMetre = OM.DecimolePerMetre;

	public static Unit MoleMicrometreReciprocalSquareCentimetre = OM.MoleMicrometreReciprocalSquareCentimetre;

	/** Gigamole per litre is a unit of amount of substance concentration defined as gigamole divided by litre. */
	public static Unit GigamolePerLitre = OM.GigamolePerLitre;

	public static Unit FemtomolePerMetre = OM.FemtomolePerMetre;

	/** Mole per femtolitre is a unit of amount of substance concentration defined as mole divided by femtolitre. */
	public static Unit MolePerFemtolitre = OM.MolePerFemtolitre;

	public static Unit MolePerHectometre = OM.MolePerHectometre;

	/** Unit one is a unit of dimension one. */
	public static Unit One = OM.One;

	public static Unit DecamolePerMetre = OM.DecamolePerMetre;

	public static Unit GigamolePerMetre = OM.GigamolePerMetre;

	/** Mole per hectolitre is a unit of amount of substance concentration defined as mole divided by hectolitre. */
	public static Unit MolePerHectolitre = OM.MolePerHectolitre;

	/** Mole per microlitre is a unit of amount of substance concentration defined as mole divided by microlitre. */
	public static Unit MolePerMicrolitre = OM.MolePerMicrolitre;

	public static Unit Femtomole = OM.Femtomole;

	public static Unit MolePerTerametre = OM.MolePerTerametre;

	/** Mole per gigalitre is a unit of amount of substance concentration defined as mole divided by gigalitre. */
	public static Unit MolePerGigalitre = OM.MolePerGigalitre;

	/** Decimole per litre is a unit of amount of substance concentration defined as decimole divided by litre. */
	public static Unit DecimolePerLitre = OM.DecimolePerLitre;

	/** Mole per teralitre is a unit of amount of substance concentration defined as mole divided by teralitre. */
	public static Unit MolePerTeralitre = OM.MolePerTeralitre;

	/** The attomolair is a unit of amount of substance concentration defined as 1.0e-18 molair. */
	public static Unit Attomolair = OM.Attomolair;

	/** Picomole per litre is a unit of amount of substance concentration defined as picomole divided by litre. */
	public static Unit PicomolePerLitre = OM.PicomolePerLitre;

	public static Unit HectomolePerMetre = OM.HectomolePerMetre;

	/** Millimole per litre is a unit of amount of substance concentration defined as millimole divided by litre. */
	public static Unit MillimolePerLitre = OM.MillimolePerLitre;

	public static Unit MillimolePerMetre = OM.MillimolePerMetre;

	public static Unit JoulePerKelvinMole = OM.JoulePerKelvinMole;

	public static Unit MolePerMicrometre = OM.MolePerMicrometre;

	/** Hectomole per litre is a unit of amount of substance concentration defined as hectomole divided by litre. */
	public static Unit HectomolePerLitre = OM.HectomolePerLitre;

	public static Unit Attomole = OM.Attomole;

	/** The millimolair is a unit of amount of substance concentration defined as 1.0e-3 molair. */
	public static Unit Millimolair = OM.Millimolair;

	public static Unit Picomole = OM.Picomole;

	public static Unit MolePerYottametre = OM.MolePerYottametre;

	public static Unit PicomolePerMetre = OM.PicomolePerMetre;

	/** The micromolair is a unit of amount of substance concentration defined as 1.0e-6 molair. */
	public static Unit Micromolair = OM.Micromolair;

	public static Unit Decimole = OM.Decimole;

	public static Unit JoulePerMole = OM.JoulePerMole;

	public static Unit MolePerMetre = OM.MolePerMetre;

	public static Unit MoleMicrometreReciprocalSquareCentimetreReciprocalSecondTime = OM.MoleMicrometreReciprocalSquareCentimetreReciprocalSecondTime;

	public static Unit Petamole = OM.Petamole;

	/** Micromole per litre is a unit of amount of substance concentration defined as micromole divided by litre. */
	public static Unit MicromolePerLitre = OM.MicromolePerLitre;

	public static Unit MolePerGigametre = OM.MolePerGigametre;

	/** Mole per litre is a unit of amount of substance concentration defined as mole divided by litre. */
	public static Unit MolePerLitre = OM.MolePerLitre;

	/** Decamole per litre is a unit of amount of substance concentration defined as decamole divided by litre. */
	public static Unit DecamolePerLitre = OM.DecamolePerLitre;

	/** The femtomolair is a unit of amount of substance concentration defined as 1.0e-15 molair. */
	public static Unit Femtomolair = OM.Femtomolair;

	public static Unit MegamolePerMetre = OM.MegamolePerMetre;

	public static Unit MolePerExametre = OM.MolePerExametre;

	/** Mole per exalitre is a unit of amount of substance concentration defined as mole divided by exalitre. */
	public static Unit MolePerExalitre = OM.MolePerExalitre;

	public static Unit MolePerMillimetre = OM.MolePerMillimetre;

	/** Mole per cubic metre is a unit of amount of substance concentration defined as mole divided by cubic metre. */
	public static Unit MolePerCubicmetre = OM.MolePerCubicmetre;

	public static Unit Millimole = OM.Millimole;

	/** Molair is a unit of amount of substance concentration defined as 1 mole per litre. */
	public static Unit Molair = OM.Molair;

	public static Unit MolePerAttometre = OM.MolePerAttometre;

	/** Teramole per litre is a unit of amount of substance concentration defined as teramole divided by litre. */
	public static Unit TeramolePerLitre = OM.TeramolePerLitre;

	/** Mole per decilitre is a unit of amount of substance concentration defined as mole divided by decilitre. */
	public static Unit MolePerDecilitre = OM.MolePerDecilitre;

	/** Parts per million is a unit of dimension one defined as 1/1 000 000. */
	public static Unit PartsPerMillion = OM.PartsPerMillion;

	/** Mole per attolitre is a unit of amount of substance concentration defined as mole divided by attolitre. */
	public static Unit MolePerAttolitre = OM.MolePerAttolitre;

	public static Unit Hectomole = OM.Hectomole;

	public static Unit Kilomole = OM.Kilomole;

	/** The mole is a unit of amount of substance defined as the amount of substance of a system that contains as many elementary entities as there are atoms in 0.012 kilogram of carbon 12. */
	public static Unit Mole = OM.Mole;

	/** Centimole per litre is a unit of amount of substance concentration defined as centimole divided by litre. */
	public static Unit CentimolePerLitre = OM.CentimolePerLitre;

	public static Unit KilomolePerMetre = OM.KilomolePerMetre;

	public static Unit MolePerDecimetre = OM.MolePerDecimetre;

	/** Kilomole per litre is a unit of amount of substance concentration defined as kilomole divided by litre. */
	public static Unit KilomolePerLitre = OM.KilomolePerLitre;

	public static Unit MolePermegametre = OM.MolePermegametre;

	public static Unit Nanomole = OM.Nanomole;

	public static Unit MolePerYoctometre = OM.MolePerYoctometre;

	public static Unit MolePerZeptometre = OM.MolePerZeptometre;

	public static Unit CentimolePerMetre = OM.CentimolePerMetre;

	/** The picomolair is a unit of amount of substance concentration defined as 1.0e-12 molair. */
	public static Unit Picomolair = OM.Picomolair;

	public static Unit MicromolePerMole = OM.MicromolePerMole;

	/** Mole per millilitre is a unit of amount of substance concentration defined as mole divided by millilitre. */
	public static Unit MolePerMillilitre = OM.MolePerMillilitre;

	public static Unit Decamole = OM.Decamole;

	/** Petamole per litre is a unit of amount of substance concentration defined as petamole divided by litre. */
	public static Unit PetamolePerLitre = OM.PetamolePerLitre;

	/** Mole per kilolitre is a unit of amount of substance concentration defined as mole divided by kilolitre. */
	public static Unit MolePerKilolitre = OM.MolePerKilolitre;

	/** Mole per nanolitre is a unit of amount of substance concentration defined as mole divided by nanolitre. */
	public static Unit MolePerNanolitre = OM.MolePerNanolitre;

	/** Mole per picolitre is a unit of amount of substance concentration defined as mole divided by picolitre. */
	public static Unit MolePerPicolitre = OM.MolePerPicolitre;

	public static Unit MolePerPicometre = OM.MolePerPicometre;

	public static Unit Teramole = OM.Teramole;

	public static Unit MolePerZettametre = OM.MolePerZettametre;

	public static Unit PetamolePerMetre = OM.PetamolePerMetre;

	public static Unit Examole = OM.Examole;

	public static Unit MolePerKilogram = OM.MolePerKilogram;

	public static Unit LitrePerMole = OM.LitrePerMole;

	public static Unit MolePerKilometre = OM.MolePerKilometre;

	public static Unit Gigamole = OM.Gigamole;

	/** The percent is a unit of dimension one defined as 1/100. */
	public static Unit Percent = OM.Percent;

	public static Unit KelvinMole = OM.KelvinMole;

	public static Unit TeramolePerMetre = OM.TeramolePerMetre;

	/** The nanomolair is a unit of amount of substance concentration defined as 1.0e-9 molair. */
	public static Unit Nanomolair = OM.Nanomolair;

	public static Unit MicromolePerSecondTimeGram = OM.MicromolePerSecondTimeGram;

	/** Mole per decalitre is a unit of amount of substance concentration defined as mole divided by decalitre. */
	public static Unit MolePerDecalitre = OM.MolePerDecalitre;

	public static Unit MoleMicrometre = OM.MoleMicrometre;

	/** Nanomole per litre is a unit of amount of substance concentration defined as nanomole divided by litre. */
	public static Unit NanomolePerLitre = OM.NanomolePerLitre;

	public static Unit Micromole = OM.Micromole;

	public static Unit Megamole = OM.Megamole;

	public static Unit MolePerNanometre = OM.MolePerNanometre;

	public static Unit MolePerDecametre = OM.MolePerDecametre;

	/** Mole per megalitre is a unit of amount of substance concentration defined as mole divided by megalitre. */
	public static Unit MolePerMegalitre = OM.MolePerMegalitre;

}