package nl.wur.fbr.om.conversion;

import javafx.util.Pair;
import nl.wur.fbr.om.model.Measure;
import nl.wur.fbr.om.model.UnitOrMeasurementScale;

import java.util.HashMap;
import java.util.Map;

/**
 * This abstract class provides a default implementation of unit conversion using the algorithm developed at
 * Wageningen UR/Food &amp; Biobased research. This algorithm is described in: \\todo provide reference.
 * Any model implementation for the Unit and Measurement scale can be injected but will also need to provide a
 * non-abstract implementation of a unit conversion factory. If the implementation uses the default algorithm,
 * extend this class, or provide a new implementation of the {@link UnitConversionFactory UnitConversionFactory}
 * interface implementing a different algorithm.
 * <p>
 * Non-abstract extensions of this abstract class need to implement two methods:
 * {@link UnitConversionFactory#convertToUnit(Measure, UnitOrMeasurementScale)  UnitConversionFactory.convertToUnit(Measure, UnitOrMeasurementScale)}
 * and {@link #convertNumericalValueToUnit(Measure, UnitOrMeasurementScale) convertNumericalValueToUnit(Measure, UnitOrMeasurementScale)}.
 * </p>
 * <p>
 * Each instance keeps a record of previously used unit conversions to make the conversion more efficient when
 * a particular conversion is repeated (say, metres to inches).
 * </p>
 * @author Don Willems on 14/07/15.
 */
public abstract class AbstractUnitConversionFactory implements UnitConversionFactory{

    /** A map with as key a tuple with the source and target unit and as value the conversion instance. */
    private Map<Pair<UnitOrMeasurementScale,UnitOrMeasurementScale>,UnitConversion> conversions = new HashMap<>();

    /**
     * The constructor to create the AbstractUnitConversionFactory.
     */
    protected AbstractUnitConversionFactory(){
        super();
    }

    /**
     * Converts the numerical value of the specified measure to a numerical value expressed in the
     * specified target unit. The type of numerical value cannot be specified yet as it is not required
     * to be a scalar of type {@link java.lang.Number Number}, but may also be of custom numerical types that
     * represent, for instance, vectors or tensors.
     *
     * This method should only be called from implementations of a unit conversion factory, i.e.
     * by implementations of @{link #convertToUnit convertNumericalValueToUnit(Measure,UnitOrMeasurementScale}.
     * @param measure The measure containing the numerical value and its unit.
     * @param targetUnit The unit to which the numerical value needs to be converted.
     * @return The converted numerical value.
     * @throws UnitConversionException When the numerical value could not be converted to the specified target unit.
     */
    protected abstract Object convertNumericalValueToUnit(Measure measure, UnitOrMeasurementScale targetUnit) throws UnitConversionException;

    /**
     * Converts a numerical value of double type expressed in the specified source unot to a double value expressed in the
     * specified target unit. This method should only be called from implementations of a unit conversion factory, i.e.
     * by implementations of @{link #convertNumericalValueToUnit convertNumericalValueToUnit(Measure,UnitOrMeasurementScale}.
     * @param value The double value to be converted.
     * @param sourceUnit The source unit in which the specified double value is expressed.
     * @param targetUnit The target unit in which the return value is expressed.
     * @return The converted double value expressed in the target unit.
     * @throws UnitConversionException When the numerical value could not be converted to the specified target unit.
     */
    protected double convertDoubleValueToUnit(double value, UnitOrMeasurementScale sourceUnit, UnitOrMeasurementScale targetUnit) throws UnitConversionException {
        UnitConversion conversion = this.getUnitConversion(sourceUnit,targetUnit);
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
