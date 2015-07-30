package nl.wur.fbr.om.model.units;


import nl.wur.fbr.om.model.NamedObject;

/**
 * A unit of measure is defined in terms of a quantity, directly or indirectly via other units.
 * It is used as a standard for measurement of the same quantity, where any other value of the quantity can be
 * expressed as a simple multiple of the unit of measure. For example, length is a quantity; the metre is a unit of
 * length that represents a definite predetermined length. When we say 10 metre (or 10 m), we actually mean 10 times
 * the definite predetermined length called "metre".
 * @author Don Willems on 14/07/15.
 */
public interface Unit extends NamedObject {
}
