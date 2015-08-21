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
 * <code>om:photometry</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Thu Aug 13 21:23:59 CEST 2015.
 */
public class Photometry {

	/** The millicandela is a unit of luminous intensity defined as 1.0e-3 candela. */
	public static Unit Millicandela = OM.Millicandela;

	/** The decicandela is a unit of luminous intensity defined as 1.0e-1 candela. */
	public static Unit Decicandela = OM.Decicandela;

	/** The kilocandela is a unit of luminous intensity defined as 1.0e3 candela. */
	public static Unit Kilocandela = OM.Kilocandela;

	/** The hectocandela is a unit of luminous intensity defined as 1.0e2 candela. */
	public static Unit Hectocandela = OM.Hectocandela;

	public static Unit Centilumen = OM.Centilumen;

	public static Unit CandelaPerSquareCentimetre = OM.CandelaPerSquareCentimetre;

	public static Unit Petalumen = OM.Petalumen;

	public static Unit Attolumen = OM.Attolumen;

	/** The petacandela is a unit of luminous intensity defined as 1.0e15 candela. */
	public static Unit Petacandela = OM.Petacandela;

	/** The gigacandela is a unit of luminous intensity defined as 1.0e9 candela. */
	public static Unit Gigacandela = OM.Gigacandela;

	/** The teracandela is a unit of luminous intensity defined as 1.0e12 candela. */
	public static Unit Teracandela = OM.Teracandela;

	public static Unit Decilumen = OM.Decilumen;

	/** The exacandela is a unit of luminous intensity defined as 1.0e18 candela. */
	public static Unit Exacandela = OM.Exacandela;

	public static Unit Kilolux = OM.Kilolux;

	/** The decacandela is a unit of luminous intensity defined as 1.0e1 candela. */
	public static Unit Decacandela = OM.Decacandela;

	/** The footcandle is a unit of illuminance defined as 1.076391e1 lux. */
	public static Unit Footcandle = OM.Footcandle;

	public static Unit Teralumen = OM.Teralumen;

	/** The lambert is a unit of luminance defined as 3.183099e3 candela per square metre. */
	public static Unit Lambert = OM.Lambert;

	public static Unit CandelaSteradian = OM.CandelaSteradian;

	/** The centicandela is a unit of luminous intensity defined as 1.0e-2 candela. */
	public static Unit Centicandela = OM.Centicandela;

	public static Unit Exalumen = OM.Exalumen;

	/** The stilb is a unit of luminance defined as 1.0e4 candela per square metre. */
	public static Unit Stilb = OM.Stilb;

	public static Unit Attolux = OM.Attolux;

	public static Unit Femtolumen = OM.Femtolumen;

	public static Unit Hectolux = OM.Hectolux;

	public static Unit LumenPerWatt = OM.LumenPerWatt;

	public static Unit Millilumen = OM.Millilumen;

	public static Unit Centilux = OM.Centilux;

	/** Candela per square metre is a unit of luminance defined as candela divided by square metre. */
	public static Unit CandelaPerSquareMetre = OM.CandelaPerSquareMetre;

	public static Unit Decilux = OM.Decilux;

	public static Unit Hectolumen = OM.Hectolumen;

	public static Unit Megalux = OM.Megalux;

	public static Unit Petalux = OM.Petalux;

	public static Unit Picolumen = OM.Picolumen;

	public static Unit Decalux = OM.Decalux;

	public static Unit Gigalux = OM.Gigalux;

	public static Unit Millilux = OM.Millilux;

	public static Unit Nanolux = OM.Nanolux;

	public static Unit Teralux = OM.Teralux;

	public static Unit Kilolumen = OM.Kilolumen;

	/** The phot is a unit of illuminance defined as 1.0e4 lux. */
	public static Unit Phot = OM.Phot;

	public static Unit Microlumen = OM.Microlumen;

	/** The picocandela is a unit of luminous intensity defined as 1.0e-12 candela. */
	public static Unit Picocandela = OM.Picocandela;

	/** The megacandela is a unit of luminous intensity defined as 1.0e6 candela. */
	public static Unit Megacandela = OM.Megacandela;

	/** The candela is a unit of luminous intensity defined as the luminous intensity, in a given direction, of a source that emits monochromatic radiation of frequency 540e12 hertz and that has a radiant intensity in that direction of 1/683 watt per steradian. */
	public static Unit Candela = OM.Candela;

	/** The footlambert is a unit of luminance defined as 3.426259 candela per square metre. */
	public static Unit Footlambert = OM.Footlambert;

	public static Unit Exalux = OM.Exalux;

	public static Unit Megalumen = OM.Megalumen;

	/** The lumen is a unit of luminous flux defined as candela times steradian = lux times square metre. */
	public static Unit Lumen = OM.Lumen;

	/** The microcandela is a unit of luminous intensity defined as 1.0e-6 candela. */
	public static Unit Microcandela = OM.Microcandela;

	/** The nanocandela is a unit of luminous intensity defined as 1.0e-9 candela. */
	public static Unit Nanocandela = OM.Nanocandela;

	public static Unit Picolux = OM.Picolux;

	/** The lux is a unit of illuminance defined as lumen divided by square metre = candela times steradian divided by square metre. */
	public static Unit Lux = OM.Lux;

	public static Unit LuxSecondTime = OM.LuxSecondTime;

	/** The attocandela is a unit of luminous intensity defined as 1.0e-18 candela. */
	public static Unit Attocandela = OM.Attocandela;

	public static Unit Nanolumen = OM.Nanolumen;

	public static Unit Decalumen = OM.Decalumen;

	public static Unit LumenSecondTime = OM.LumenSecondTime;

	public static Unit Gigalumen = OM.Gigalumen;

	public static Unit Femtolux = OM.Femtolux;

	public static Unit Microlux = OM.Microlux;

	public static Unit LumenPerSquareMetre = OM.LumenPerSquareMetre;

	/** The femtocandela is a unit of luminous intensity defined as 1.0e-15 candela. */
	public static Unit Femtocandela = OM.Femtocandela;

}