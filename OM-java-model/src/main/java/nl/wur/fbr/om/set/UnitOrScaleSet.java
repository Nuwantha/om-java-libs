package nl.wur.fbr.om.set;

import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.factory.UnitAndScaleFactory;

/**
 * This interface defines the set of methods that should be implemented by classes that provide a standard set of
 * units or measurement scales.
 *
 * @author Don Willems on 29/07/15.
 */
public interface UnitOrScaleSet {

    /**
     * Initialises the set by creating the different units and/or measurement scales using the provided
     * {@link UnitAndScaleFactory}.
     * @param factory The factory used for the creation of units or measurement scales.
     * @throws UnitOrScaleCreationException When one of the units or scales in the set could not be created.
     */
    public void initialiseSet(UnitAndScaleFactory factory) throws UnitOrScaleCreationException;
}
