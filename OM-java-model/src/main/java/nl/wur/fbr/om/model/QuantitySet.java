package nl.wur.fbr.om.model;

import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.quantities.Quantity;
import nl.wur.fbr.om.model.quantities.QuantityClass;
import nl.wur.fbr.om.exceptions.QuantityCreationException;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/**
 * @author Don Willems on 04/10/15.
 */
public abstract class QuantitySet {

    /**
     * Returns all quantity classes in this set.
     * @return All quantity classes.
     */
    public abstract Set<QuantityClass> getAllQuantityClasses();

    /**
     * Returns The quantity class identified by the specified identifier.
     * @param identifier The identifier of the quantity class.
     * @return The quantity class.
     */
    public abstract QuantityClass getQuantityClass(String identifier);

    /**
     * Creates a new variable quantity  of the type specified by the quantity class identifier
     * by the specified quantity class identifier.
     * @param quantityClass The quantity class.
     * @return The quantity.
     * @throws QuantityCreationException Thrown when the quantity could not be created, for instance when the quantity
     * expects a point and not a measure.
     */
    public static Quantity createQuantity(QuantityClass quantityClass) throws QuantityCreationException {
        Class jclass = quantityClass.getClassForQuantityClass();
        try {
            Quantity quantity = (Quantity)jclass.getConstructor().newInstance();
            return quantity;
        } catch (NoSuchMethodException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' without" +
                    "a measure or a point on a measurement scale.",e);
        } catch (InvocationTargetException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' without a " +
                    "measure or a point on a measurement scale.",e);
        } catch (InstantiationException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' without a " +
                    "measure  or a point on a measurement scale because the java class could not be instantiated.",e);
        } catch (IllegalAccessException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' without a " +
                    "measure  or a point on a measurement scale because you don't have access to the quantity class.",e);
        }
    }

    /**
     * Creates a new quantity with the specified measure and of the type specified by the quantity class identifier
     * by the specified quantity class identifier.
     * @param quantityClass The quantity class.
     * @param measure The measure.
     * @return The quantity.
     * @throws QuantityCreationException Thrown when the quantity could not be created, for instance when the quantity
     * expects a point and not a measure.
     */
    public static Quantity createQuantity(QuantityClass quantityClass,Measure measure) throws QuantityCreationException {
        Class jclass = quantityClass.getClassForQuantityClass();
        try {
            Quantity quantity = (Quantity)jclass.getConstructor(Measure.class).newInstance(measure);
            return quantity;
        } catch (NoSuchMethodException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "measure because this quantity type does not accept measures.",e);
        } catch (InvocationTargetException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "measure.",e);
        } catch (InstantiationException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "measure because the java class could not be instantiated.",e);
        } catch (IllegalAccessException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "measure because you don't have access to the quantity class.",e);
        }
    }

    /**
     * Creates a new quantity with the specified point on a measurement scale and of the type specified by the quantity
     * class identifier by the specified quantity class identifier.
     * @param quantityClass The quantity class.
     * @param point The point of the measurement scale.
     * @return The quantity.
     * @throws QuantityCreationException Thrown when the quantity could not be created, for instance when the quantity
     * expects a measure and not a point.
     */
    public static Quantity createQuantity(QuantityClass quantityClass,Point point) throws QuantityCreationException {
        Class jclass = quantityClass.getClassForQuantityClass();
        try {
            Quantity quantity = (Quantity)jclass.getConstructor(Point.class).newInstance(point);
            return quantity;
        } catch (NoSuchMethodException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "point on a measurement scale because this quantity type does not accept points.",e);
        } catch (InvocationTargetException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "point on a measurement scale.",e);
        } catch (InstantiationException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "point on a measurement scale because the java class could not be instantiated.",e);
        } catch (IllegalAccessException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "point on a measurement scale because you don't have access to the quantity class.",e);
        }
    }

    /**
     * Creates a new quantity with the specified measure and of the type specified by the quantity class identifier
     * by the specified quantity class identifier. The name of the quantity and its symbol can also be specified.
     * @param name The name of the quantity to be created.
     * @param symbol The symbol used for the quantity to be created.
     * @param quantityClass The quantity class.
     * @return The quantity.
     * @throws QuantityCreationException Thrown when the quantity could not be created, for instance when the quantity
     * expects a point and not a measure.
     */
    public static Quantity createQuantity(String name, String symbol, QuantityClass quantityClass) throws QuantityCreationException {
        Class jclass = quantityClass.getClassForQuantityClass();
        try {
            Quantity quantity = (Quantity)jclass.getConstructor(String.class,String.class).newInstance(name,symbol);
            return quantity;
        } catch (NoSuchMethodException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' without a " +
                    "measure or point on a measurement scale.",e);
        } catch (InvocationTargetException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' without a " +
                    "measure or point on a measurement scale.",e);
        } catch (InstantiationException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' without a " +
                    "measure or point on a measurement scale because the java class could not be instantiated.",e);
        } catch (IllegalAccessException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' without a " +
                    "measure or point on a measurement scale because you don't have access to the quantity class.",e);
        }
    }

    /**
     * Creates a new quantity with the specified measure and of the type specified by the quantity class identifier
     * by the specified quantity class identifier. The name of the quantity and its symbol can also be specified.
     * @param name The name of the quantity to be created.
     * @param symbol The symbol used for the quantity to be created.
     * @param quantityClass The quantity class.
     * @param measure The measure.
     * @return The quantity.
     * @throws QuantityCreationException Thrown when the quantity could not be created, for instance when the quantity
     * expects a point and not a measure.
     */
    public static Quantity createQuantity(String name, String symbol, QuantityClass quantityClass,Measure measure) throws QuantityCreationException {
        Class jclass = quantityClass.getClassForQuantityClass();
        try {
            Quantity quantity = (Quantity)jclass.getConstructor(String.class,String.class,Measure.class).newInstance(name,symbol,measure);
            return quantity;
        } catch (NoSuchMethodException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "measure because this quantity type does not accept measures.",e);
        } catch (InvocationTargetException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "measure.",e);
        } catch (InstantiationException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "measure because the java class could not be instantiated.",e);
        } catch (IllegalAccessException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "measure because you don't have access to the quantity class.",e);
        }
    }

    /**
     * Creates a new quantity with the specified point on a measurement scale and of the type specified by the quantity
     * class identifier by the specified quantity class identifier. The name of the quantity and its symbol can also
     * be specified.
     * @param name The name of the quantity to be created.
     * @param symbol The symbol used for the quantity to be created.
     * @param quantityClass The quantity class.
     * @param point The point of the measurement scale.
     * @return The quantity.
     * @throws QuantityCreationException Thrown when the quantity could not be created, for instance when the quantity
     * expects a measure and not a point.
     */
    public static Quantity createQuantity(String name, String symbol, QuantityClass quantityClass,Point point) throws QuantityCreationException {
        Class jclass = quantityClass.getClassForQuantityClass();
        try {
            Quantity quantity = (Quantity)jclass.getConstructor(String.class,String.class,Point.class).newInstance(name,symbol,point);
            return quantity;
        } catch (NoSuchMethodException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "point on a measurement scale because this quantity type does not accept points.",e);
        } catch (InvocationTargetException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "point on a measurement scale.",e);
        } catch (InstantiationException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "point on a measurement scale because the java class could not be instantiated.",e);
        } catch (IllegalAccessException e) {
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with a " +
                    "point on a measurement scale because you don't have access to the quantity class.",e);
        } catch (ClassCastException e){
            throw new QuantityCreationException("Could not create quantity with class id '"+quantityClass.getIdentifier()+"' with  " +
                    "class '"+jclass.toString()+"' as this is not a subclass of Quantity.",e);
        }
    }
}
