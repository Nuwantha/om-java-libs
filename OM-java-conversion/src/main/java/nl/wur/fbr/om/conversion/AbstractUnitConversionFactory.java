package nl.wur.fbr.om.conversion;

import javafx.util.Pair;
import nl.wur.fbr.om.model.Measure;
import nl.wur.fbr.om.model.UnitOrMeasurementScale;

import java.util.HashMap;
import java.util.Map;

/**
 * Instances of this class can be used for unit conversion.
 * Each instance keeps a record of previously used unit conversions to make the conversion more efficient when
 * a particular conversion is repeated (say, metres to inches).
 *
 * @author Don Willems on 14/07/15.
 */
public abstract class AbstractUnitConversionFactory {

    /** A map with as key a tuple with the source and target unit and as value the conversion instance. */
    private Map<Pair<UnitOrMeasurementScale,UnitOrMeasurementScale>,UnitConversion> conversions = new HashMap<>();

    /**
     * The constructor to create the AbstractUnitConversionFactory.
     */
    protected AbstractUnitConversionFactory(){
        super();
    }


    /**
     * Converts a measure (a numerical value expressed in a specific unit) to a target unit (or measurement scale).
     * @param measure The measure to be converted to the target unit.
     * @param targetUnit The target unit to which the measurement is to be converted.
     * @return The converted measure.
     * @throws UnitConversionException When the measure could not be converted to the specified target unit.
     */
    public final Measure convertToUnit(Measure measure, UnitOrMeasurementScale targetUnit) throws UnitConversionException {
        if(measure==null)
            throw new UnitConversionException("Could not convert measure because the measure is null.",null,targetUnit);

        UnitConversion conversion = this.getUnitConversion(measure.getUnitOrMeasurementScale(),targetUnit);
        Measure convertedMeasure = this.createMeasureFromConversion(measure,targetUnit,conversion);
        return convertedMeasure;
    }

    /**
     * Creates a new measure with the converted value in the target unit.
     * This method should be implemented by subclasses. The implementation can use #convertDoubleValue to get
     * the converted double value for its numerical value. Multiple conversions may be needed for for instance
     * vector values.
     * The implementation should provide an instance of the appropriate type.
     *
     * This method should not be called except by the implementation of #convertToUnit in this abstract class.
     *
     * @param measure The measure to be converted.
     * @param targetUnit The target unit.
     * @param conversion The conversion. This is an instance of a private class that should only be used to pass to a
     *                   call to #convertDoubleValue.
     * @return The converted measure.
     */
    protected abstract Measure createMeasureFromConversion(Measure measure, UnitOrMeasurementScale targetUnit, UnitConversion conversion);

    /**
     * Converts a double value given the provided unit conversion.
     * @param conversion The unit conversion that can calculate the new double value.
     * @param value The value to be converted.
     * @return The converted value.
     */
    protected final double convertDoubleValue(UnitConversion conversion,double value){
        return conversion.convert(value);
    }


    /**
     * Creates an instance of the internal class that is able to convert between the two units.
     * @param sourceUnit The source unit.
     * @param targetUnit The target unit.
     * @return The conversion instance.
     * @throws UnitConversionException When no conversion could be created.
     */
    private UnitConversion getUnitConversion(UnitOrMeasurementScale sourceUnit, UnitOrMeasurementScale targetUnit) throws UnitConversionException{
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
