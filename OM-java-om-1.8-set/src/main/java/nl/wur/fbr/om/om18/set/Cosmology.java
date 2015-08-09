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
 * <code>om:cosmology</code> application area in the OM ontology.
 * The identifiers are all defined as <code>final static String</code> and contain the
 * URIs of the concepts as strings.
 * <br>NB. This code has been automatically generated.
 * @author OM Vocabulary Creation tool at Mon Aug 10 00:27:25 CEST 2015.
 */
public class Cosmology {

	/** The megaparsec is a unit of length defined as 1.0e6 parsec. Gebruikt voor afstanden op de schaal van clusters. */
	public final static Unit Megaparsec = OM.Megaparsec;

	/** The megaelectronvolt is a unit of energy defined as 1.0e6 electronvolt. */
	public final static Unit Megaelectronvolt = OM.Megaelectronvolt;

	/** The gigaelectronvolt is a unit of energy defined as 1.0e9 electronvolt. */
	public final static Unit Gigaelectronvolt = OM.Gigaelectronvolt;

	/** The gigaparsec is a unit of length defined as 1.0e9 parsec. Gebruikt voor de afstand op de schaal van het heelal. */
	public final static Unit Gigaparsec = OM.Gigaparsec;

	/** The kiloelectronvolt is a unit of energy defined as 1.0e3 electronvolt. */
	public final static Unit Kiloelectronvolt = OM.Kiloelectronvolt;

}