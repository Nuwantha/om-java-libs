package nl.wur.fbr.om.conversion;

import javafx.util.Pair;
import nl.wur.fbr.om.exceptions.ConversionException;
import nl.wur.fbr.om.exceptions.ScaleConversionException;
import nl.wur.fbr.om.exceptions.UnitConversionException;
import nl.wur.fbr.om.factory.UnitAndScaleConversionFactory;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.Unit;

import java.util.HashMap;
import java.util.Map;

/**
 * This abstract class provides a default implementation of unit conversion using the algorithm developed at
 * Wageningen UR/Food &amp; Biobased research.
 * Any model implementation for the Unit and Measurement scale can be injected but will also need to provide a
 * non-abstract implementation of a unit conversion factory. If the implementation uses the default algorithm,
 * extend this class, or provide a new implementation of the
 * {@link UnitAndScaleConversionFactory UnitAndScaleConversionFactory}
 * interface implementing a different algorithm.
 * <p>
 * Each instance keeps a record of previously used unit conversions to make the conversion more efficient when
 * a particular conversion is repeated (say, metres to inches).
 * </p>
 * @author Don Willems on 14/07/15.
 */
public abstract class AbstractUnitConversionFactory implements UnitAndScaleConversionFactory {

    /** A map with as key a tuple with the source and target unit or scale identifiers and as value the conversion instance. */
    private Map<Pair<String,String>,UnitConversion> conversions = new HashMap<>();

    /**
     * The constructor to create the AbstractUnitConversionFactory.
     */
    protected AbstractUnitConversionFactory(){
        super();
    }

    /**
     * Converts a numerical value of double type expressed in the specified source unit to a double value expressed in the
     * specified target unit. This method should only be called from implementations of a unit conversion factory.
     * @param value The double value to be converted.
     * @param sourceUnit The source unit in which the specified double value is expressed.
     * @param targetUnit The target unit in which the return value is expressed.
     * @return The converted double value expressed in the target unit.
     * @throws UnitConversionException When the numerical value could not be converted to the specified target unit.
     */
    protected double convertDoubleValueToUnit(double value, Unit sourceUnit, Unit targetUnit) throws ConversionException {
        UnitConversion conversion = this.getUnitConversion(sourceUnit,targetUnit);
        return this.convertDoubleValue(conversion,value);
    }

    /**
     * Converts a numerical value of double type specified in a specific scale to a double value in the
     * specified target scale. This method should only be called from implementations of a unit conversion factory.
     * @param value The double value to be converted.
     * @param sourceScale The source scale in which the specified double value is specified.
     * @param targetScale The target scale in which the return value is specified.
     * @return The converted double value in the target scale.
     * @throws UnitConversionException When the numerical value could not be converted to the specified target scale.
     */
    protected double convertDoubleValueToScale(double value, Scale sourceScale, Scale targetScale) throws ConversionException {
        UnitConversion conversion = this.getScaleConversion(sourceScale, targetScale);
        return this.convertDoubleValue(conversion,value);
    }

    /**
     * Converts a double value given the provided unit conversion.
     * @param conversion The unit conversion that can calculate the new double value.
     * @param value The value to be converted.
     * @return The converted value.
     */
    private final double convertDoubleValue(UnitConversion conversion,double value){
        return conversion.convert(value);
    }


    /**
     * Creates an instance of the internal class that is able to convert between the two units.
     * @param sourceUnit The source unit.
     * @param targetUnit The target unit.
     * @return The conversion instance.
     * @throws ConversionException When no conversion could be created.
     */
    private UnitConversion getUnitConversion(Unit sourceUnit, Unit targetUnit) throws ConversionException{
        if(sourceUnit==null)
            throw new UnitConversionException("Could not convert measure because the unit of the measure is null."
                    ,null, targetUnit);
        if(targetUnit==null)
            throw new UnitConversionException("Could not convert measure with unit '"+sourceUnit+
                    "' because the target unit is null.", sourceUnit,targetUnit);

        try {
            // Check whether a previous conversion request with the same units was done.
            UnitConversion conversion = conversions.get(new Pair<>(sourceUnit, targetUnit));
            if(conversion!=null) return conversion;
            conversion = conversions.get(new Pair<>(targetUnit, sourceUnit));
            if(conversion!=null) return conversion.invert();

            // TODO Implement unit conversion.

            return conversion;
        } catch (Throwable e) {
            throw new UnitConversionException("Could not convert from measure with Unit or MeasurementScale '"+
                    sourceUnit+"' to '"+targetUnit+"'.", sourceUnit,targetUnit,e);
        }
    }

    /**
     * Creates an instance of the internal class that is able to convert between the two scales.
     * @param sourceScale The source scale.
     * @param targetScale The target scale.
     * @return The conversion instance.
     * @throws ConversionException When no conversion could be created.
     */
    private UnitConversion getScaleConversion(Scale sourceScale, Scale targetScale) throws ConversionException{
        if(sourceScale==null)
            throw new ScaleConversionException("Could not convert measure because the unit of the measure is null."
                    ,null, targetScale);
        if(targetScale==null)
            throw new ScaleConversionException("Could not convert measure with unit '"+sourceScale+
                    "' because the target unit is null.", sourceScale,targetScale);

        try {
            // Check whether a previous conversion request with the same units was done.
            UnitConversion conversion = conversions.get(new Pair<>(sourceScale, targetScale));
            if(conversion!=null) return conversion;
            conversion = conversions.get(new Pair<>(targetScale, sourceScale));
            if(conversion!=null) return conversion.invert();

            // TODO Implement unit conversion.

            return conversion;
        } catch (Throwable e) {
            throw new ScaleConversionException("Could not convert from measure with Unit or MeasurementScale '"+
                    sourceScale+"' to '"+targetScale+"'.", sourceScale,targetScale,e);
        }
    }


    /**
     * This private class encapsulates the conversion from one unit to another.
     */
    private class UnitConversion {

        /** The multiplication factor of the unit conversion. */
        private double factor=1;
        /** The offset for the unit (scale) conversion */
        private double offset=0;

        /**
         * Creates a Unit conversion with the specified factor
         * @param factor The multiplication factor of the unit conversion.
         * @param offset The offset for the unit (scale) conversion.
         */
        public UnitConversion(double factor, double offset){
            this.factor = factor;
            this.offset = offset;
        }

        /**
         * Inverts the unit conversion. If this is a unit conversion between km and yards, the inverted conversion
         * can convert between yards and km.
         * @return The inverted conversion.
         */
        public UnitConversion invert(){
            return new UnitConversion(1/factor,-offset/factor);
        }

        /**
         * Converts the specified double value expressed in the source unit to a new value expressed in the target unit.
         * @param value The value to be converted.
         * @return The converted value.
         */
        public double convert(double value){
            return (value-offset)*factor;
        }
    }
}
