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
 * <code>om:typography</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Thu Aug 13 21:23:59 CEST 2015.
 */
public class Typography {

	/** The Postscript pica is a unit of length defined as 12 point (Postscript). */
	public static Unit PicaPostscript = OM.PicaPostscript;

	/** The Postscript point is a unit of length defined as 0.013888888888888888888888888888889 inch. */
	public static Unit PointPostscript = OM.PointPostscript;

	/** The TeX point is a unit of length defined as 0.01383700013837000138370001383 inch. */
	public static Unit PointTeX = OM.PointTeX;

	/** The ATA pica is a unit of length defined as 12 point (ATA). */
	public static Unit PicaATA = OM.PicaATA;

	/** The ATA point is a unit of length defined as 0.3514598e-3 metre. */
	public static Unit PointATA = OM.PointATA;

	/** The Didot point is a unit of length defined as 0.3759e-3 metre. */
	public static Unit PointDidot = OM.PointDidot;

	/** The cicero is a unit of length defined as 12 point (Didot). */
	public static Unit Cicero = OM.Cicero;

	/** The TeX pica is a unit of length defined as 12 point (TeX). */
	public static Unit PicaTeX = OM.PicaTeX;

}