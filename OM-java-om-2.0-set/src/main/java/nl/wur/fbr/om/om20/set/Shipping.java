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
 * <code>om:shipping</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Thu Aug 13 21:23:59 CEST 2015.
 */
public class Shipping {

	/** The nautical mile is a unit of length defined as 1852 metre. */
	public static Unit NauticalMile = OM.NauticalMile;

	/** The knot is a unit of speed defined as nautical mile per hour. */
	public static Unit Knot = OM.Knot;

	/** Nautical mile per hour is a unit of speed defined as nautical mile divided by hour. */
	public static Unit NauticalMilePerHour = OM.NauticalMilePerHour;

}