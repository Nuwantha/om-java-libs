package nl.wur.fbr.om.om18.set;

import nl.wur.fbr.om.core.factory.DefaultUnitAndScaleFactory;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;

/**
 * This is an extension of the {@link DefaultUnitAndScaleFactory} that includes
 * the units and measurement scales defined in the OM ontology (v1.8). The Identifiers for these units and scales
 * are defined as URIs.
 * Use these identifiers as parameter to {@link #getUnitOrScale(String)} to access the
 * OM set of units and scales.
 * @author Don Willems on 03/08/15.
 */
public class OMUnitAndScaleFactory extends DefaultUnitAndScaleFactory{


    /**
     * Returns the Unit or Scale identified by the specified identifier within the OM ontology. <br>
     * If the Unit or Scale with the same identifier has been created previously, this method should return the
     * same instance.
     *
     * If the Unit or Scale has not been created previously, this method should create the
     * unit or scale and set the identifier (URI) of the unit or scale to the specified identifier.
     * If the data for creating a new instance is not available, e.g. is not part of the core set, or the identifier does not
     * represent a unit or scale, this method will throw a {@link UnitOrScaleCreationException}.
     * @param identifier The identifier of the unit or scale, in OM the string representation of a URI.
     * @return The unit or scale identified by the specified identifier.
     * @throws UnitOrScaleCreationException When the unit could not be created from the specified identifier.
     */
    @Override
    public Object getUnitOrScale(String identifier) throws UnitOrScaleCreationException {
        Object uos = super.getUnitOrScale(identifier);
        if(uos==null){

        }
        return uos;
    }
}
