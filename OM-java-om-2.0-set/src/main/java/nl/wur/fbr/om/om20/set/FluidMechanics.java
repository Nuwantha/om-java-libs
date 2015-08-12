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
 * <code>om:fluidMechanics</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Wed Aug 12 01:57:46 CEST 2015.
 */
public class FluidMechanics {

	/** The centimetre of mercury is a unit of pressure defined as 1.0e-2 metre of mercury. */
	public static Unit CentimetreOfMercury = OM.CentimetreOfMercury;

	public static Unit Centiradian = OM.Centiradian;

	public static Unit Nanoradian = OM.Nanoradian;

	/** The millimetre of mercury is a unit of pressure defined as 1.0e-3 metre of mercury. */
	public static Unit MillimetreOfMercury = OM.MillimetreOfMercury;

	public static Unit Hectopascal = OM.Hectopascal;

	/** The decibar is a unit of pressure defined as 1.0e-1 bar. */
	public static Unit Decibar = OM.Decibar;

	/** The technical atmosphere is a unit of pressure defined as 9.80665e4 pascal. */
	public static Unit AtmosphereTechnical = OM.AtmosphereTechnical;

	public static Unit Microradian = OM.Microradian;

	public static Unit Milliradian = OM.Milliradian;

	public static Unit Petapascal = OM.Petapascal;

	public static Unit Nanopascal = OM.Nanopascal;

	/** The metre of mercury is a unit of pressure defined as 133 322 pascal. */
	public static Unit MetreOfMercury = OM.MetreOfMercury;

	/** The millibar is a unit of pressure defined as 1.0e-3 bar. */
	public static Unit Millibar = OM.Millibar;

	public static Unit Centipascal = OM.Centipascal;

	public static Unit Attopascal = OM.Attopascal;

	public static Unit Decapascal = OM.Decapascal;

	public static Unit Femtoradian = OM.Femtoradian;

	public static Unit Decipascal = OM.Decipascal;

	/** The pascal is a unit of pressure and stress defined as newton divided by square metre = joule divided by cubic metre = kilogram divided by metre second squared. */
	public static Unit Pascal = OM.Pascal;

	public static Unit Picoradian = OM.Picoradian;

	public static Unit KilogramSecondTimeToThePower2ReciprocalMetre = OM.KilogramSecondTimeToThePower2ReciprocalMetre;

	public static Unit NewtonPerSquareMetre = OM.NewtonPerSquareMetre;

	public static Unit Megapascal = OM.Megapascal;

	public static Unit Picopascal = OM.Picopascal;

	public static Unit Terapascal = OM.Terapascal;

	/** The barye is a unit of pressure defined as 0.1 pascal. */
	public static Unit Barye = OM.Barye;

	/** The bar is a unit of pressure defined as 100 000 pascal. */
	public static Unit Bar = OM.Bar;

	public static Unit Micropascal = OM.Micropascal;

	/** The standard atmosphere is a unit of pressure defined as 1.01325e5 pascal. */
	public static Unit AtmosphereStandard = OM.AtmosphereStandard;

	public static Unit Femtopascal = OM.Femtopascal;

	public static Unit Gigapascal = OM.Gigapascal;

	public static Unit Millipascal = OM.Millipascal;

	public static Unit Deciradian = OM.Deciradian;

	public static Unit Exapascal = OM.Exapascal;

	/** The torr is a unit of pressure defined as 1.333224e2 pascal. */
	public static Unit Torr = OM.Torr;

	public static Unit Attoradian = OM.Attoradian;

	/** The microbar is a unit of pressure defined as 1.0e-6 bar. */
	public static Unit Microbar = OM.Microbar;

	public static Unit Kilopascal = OM.Kilopascal;

}