package nl.wur.fbr.om.factory;

import nl.wur.fbr.om.model.*;

/**
 * @author Don Willems on 15/07/15.
 */
public interface UnitAndMeasureFactory {

    public SingularUnit createSingularUnit(UnitOrMeasurementScale definitionUnit);
    public SingularUnit createSingularUnit(UnitOrMeasurementScale definitionUnit, double definitionFactor);

    public UnitMultiple createUnitMultiple(Unit base, double prefixFactor);

    public UnitMultiplication createUnitMultiplication(Unit unit1, Unit unit2);

    public UnitDivision createUnitDivision(Unit numerator, Unit denominator);

    public UnitExponentiation createUnitExponentiation(Unit base, double exponent);


    public Measure createMeasure(Quantity quantity, Object numericalValue, UnitOrMeasurementScale unit);
    public Measure createMeasure(Object numericalValue, UnitOrMeasurementScale unit);


}
