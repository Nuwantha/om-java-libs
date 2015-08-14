package nl.wur.fbr.om.factory;

import nl.wur.fbr.om.exceptions.ConversionException;
import nl.wur.fbr.om.exceptions.FactoryException;
import nl.wur.fbr.om.exceptions.FactoryNotSetException;
import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.model.UnitAndScaleSet;
import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.dimensions.Dimension;
import nl.wur.fbr.om.model.measures.Measure;
import nl.wur.fbr.om.model.points.Point;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.*;
import nl.wur.fbr.om.prefixes.Prefix;
import org.apache.commons.lang3.Range;

import java.util.ArrayList;
import java.util.List;

/**
 * This factory class is a wrapper that contains the different factory classes that are used to create and convert
 * units and measurement scales.
 * @author Don Willems on 05/08/15.
 */
public abstract class InstanceFactory implements UnitAndScaleFactory, MeasureAndPointFactory, UnitAndScaleConversionFactory {

    private UnitAndScaleFactory unitAndScaleFactory = null;
    private MeasureAndPointFactory measureAndPointFactory = null;
    private UnitAndScaleConversionFactory unitAndScaleConversionFactory = null;
    private Unit one = null;
    private Unit radian = null;

    /**
     * Creates a new InstanceFactory with the specified factory classes.
     * @param unitAndScaleFactory The unit and scale factory.
     * @param measureAndPointFactory The measure and point factory.
     * @param unitAndScaleConversionFactory The unit and scale conversion factory.
     */
    protected InstanceFactory(UnitAndScaleFactory unitAndScaleFactory, MeasureAndPointFactory measureAndPointFactory,UnitAndScaleConversionFactory unitAndScaleConversionFactory){
        this.unitAndScaleFactory = unitAndScaleFactory;
        this.measureAndPointFactory = measureAndPointFactory;
        this.unitAndScaleConversionFactory = unitAndScaleConversionFactory;
    }

    /**
     * Returns the unit and scale factory wrapped in this instance factory.
     * @return The unit and scale factory.
     */
    public UnitAndScaleFactory getUnitAndScaleFactory(){
        return unitAndScaleFactory;
    }

    /**
     * Sets the unit and scale factory wrapped in this instance factory.
     * Can only be used by subclasses.
     * @param unitAndScaleFactory The unit and scale factory.
     */
    protected void setUnitAndScaleFactory(UnitAndScaleFactory unitAndScaleFactory){
        this.unitAndScaleFactory = unitAndScaleFactory;
    }

    /**
     * Returns the unit and point factory wrapped in this instance factory.
     * @return The measure and point factory.
     */
    public MeasureAndPointFactory getMeasureAndPointFactory(){
        return measureAndPointFactory;
    }

    /**
     * Sets the measure and point factory wrapped in this instance factory.
     * Can only be used by subclasses.
     * @param measureAndPointFactory The measure and point factory.
     */
    protected void setMeasureAndPointFactory(MeasureAndPointFactory measureAndPointFactory){
        this.measureAndPointFactory = measureAndPointFactory;
    }

    /**
     * Returns the unit and scale conversion factory wrapped in this instance factory.
     * @return The unit and scale conversion factory.
     */
    public UnitAndScaleConversionFactory getUnitAndScaleConversionFactory(){
        return unitAndScaleConversionFactory;
    }

    /**
     * Sets the unit and scale conversion factory wrapped in this instance factory.
     * Can only be used by subclasses.
     * @param unitAndScaleConversionFactory The unit and scale conversion factory.
     */
    protected void setUnitAndScaleConversionFactory(UnitAndScaleConversionFactory unitAndScaleConversionFactory){
        this.unitAndScaleConversionFactory = unitAndScaleConversionFactory;
    }

    /**
     * Returns the unit in this set that is equal to the unit one.
     * @return The unit that is one.
     */
    public Unit getOne() throws FactoryException {
        if(one == null) throw new FactoryException("No unit one defined in the sets added to this factory.");
        return one;
    }

    /**
     * Returns the unit that defines the radian unit
     * The radian unit is needed to implement trigonometric functions.
     * @return The radian unit.
     */
    public Unit getRadianUnit() throws FactoryException {
        if(radian == null) throw new FactoryException("No radian unit defined in the sets added to this factory.");
        return radian;
    }


    /**
     * Adds a (large) set of units and scales to this factory. These units and scales are then added to the
     * full set in this factory so that these units and scales are also searched through when searching through
     * the full set in this factory.
     * @param unitAndScaleSetClass The class of set to be added that should override {@link UnitAndScaleSet}.
     * @throws UnitOrScaleCreationException When the methods in the <code>unitAndScaleSetClass</code> such
     * as when {@link UnitAndScaleSet#initialize(UnitAndScaleFactory)} do not exist.
     */
    public UnitAndScaleSet addUnitAndScaleSet(Class unitAndScaleSetClass) throws UnitOrScaleCreationException {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        UnitAndScaleSet set = unitAndScaleFactory.addUnitAndScaleSet(unitAndScaleSetClass);
        if(one==null) one = set.getOne();
        else{
            if(!one.getIdentifier().equals(set.getOne().getIdentifier()))
                unitAndScaleConversionFactory.setUnitsToBeEqual(one,set.getOne());
        }
        if(radian==null) radian = set.getRadianUnit();
        else{
            if(!radian.getIdentifier().equals(set.getRadianUnit().getIdentifier()))
                unitAndScaleConversionFactory.setUnitsToBeEqual(radian,set.getRadianUnit());
        }
        return set;
    }

    /**
     * If the Unit or Scale with the same identifier has been created previously, this method should return the
     * same instance. If the Unit or Scale has not been created previously, this method should create the
     * unit or scale and set the identifier of the unit or scale to the specified identifier. The data needed to
     * create the unit (such as multiplication factors, prefixes, or base units) or scale may be available from other sources
     * such as the OM ontology. If the data for creating a new instance is not available, or the identifier does not
     * represent a unit or scale, this method will throw a {@link UnitOrScaleCreationException}.
     *
     * @param identifier The identifier of the unit or scale.
     * @return The unit or scale identified by the specified identifier.
     * @throws UnitOrScaleCreationException When the unit could not be created from the specified identifier.
     */
    @Override
    public final Object getUnitOrScale(String identifier) throws UnitOrScaleCreationException {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.getUnitOrScale(identifier);
    }

    /**
     * Creates a new singular base unit. For prefixed base units (e.g. kilogram) see
     * {@link #createPrefixedBaseUnit(BaseDimension, SingularUnit, Prefix)}.
     * For instance the metre unit is a base unit in SI and does not have a definition unit.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param dimension The base dimension of the unit. (see {@link Dimension})
     * @return The requested singular base unit.
     */
    @Override
    public final BaseUnit createBaseUnit(BaseDimension dimension) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createBaseUnit(dimension);
    }

    /**
     * Creates a new singular base unit. For prefixed base units (e.g. kilogram) see
     * {@link #createPrefixedBaseUnit(String, String, BaseDimension, SingularUnit, Prefix)}.
     * For instance the metre unit is a base unit in SI and does not have a definition unit.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name      The preferred name of the unit.
     * @param symbol    The symbol used for the unit.
     * @param dimension The base dimension of the unit. (see {@link Dimension})
     * @return The requested singular unit.
     */
    @Override
    public final BaseUnit createBaseUnit(String name, String symbol, BaseDimension dimension) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createBaseUnit(name, symbol, dimension);
    }

    /**
     * Creates a new singular base unit. For prefixed base units (e.g. kilogram) see
     * {@link #createPrefixedBaseUnit(String, String, String, BaseDimension, SingularUnit, Prefix)}.
     * For instance the metre unit is a base unit in SI and does not have a definition unit.
     *
     * @param identifier A unique identifier for the unit.
     * @param name       The preferred name of the unit.
     * @param symbol     The symbol used for the unit.
     * @param dimension  The base dimension of the unit. (see {@link Dimension})
     * @return The requested singular unit.
     */
    @Override
    public final BaseUnit createBaseUnit(String identifier, String name, String symbol, BaseDimension dimension) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createBaseUnit(identifier, name, symbol, dimension);
    }

    /**
     * Creates a new prefixed base unit (e.g. kilogram) that has a unit (e.g. gram) and a
     * prefix (e.g. kilo). For non-prefixed base units see {@link #createBaseUnit(BaseDimension)}.
     *
     * @param dimension    The base dimension of the unit. (see {@link Dimension})
     * @param singularUnit The Unit that is prefixed.
     * @param prefix       The prefix used for the unit.
     * @return The requested singular base unit.
     */
    @Override
    public final BaseUnit createPrefixedBaseUnit(BaseDimension dimension, SingularUnit singularUnit, Prefix prefix) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createPrefixedBaseUnit(dimension, singularUnit, prefix);
    }

    /**
     * Creates a new prefixed base unit (e.g. kilogram) that has a unit (e.g. gram) and a
     * prefix (e.g. kilo). For non-prefixed base units see {@link #createBaseUnit(String, String, BaseDimension)}.
     *
     * @param name         The preferred name of the unit.
     * @param symbol       The symbol used for the unit.
     * @param dimension    The basedimension of the unit. (see {@link Dimension})
     * @param singularUnit The Unit that is prefixed.
     * @param prefix       The prefix used for the unit.
     * @return The requested singular unit.
     */
    @Override
    public final BaseUnit createPrefixedBaseUnit(String name, String symbol, BaseDimension dimension, SingularUnit singularUnit, Prefix prefix) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createPrefixedBaseUnit(name, symbol, dimension, singularUnit, prefix);
    }

    /**
     * Creates a new prefixed base unit (e.g. kilogram) that has a unit (e.g. gram) and a
     * prefix (e.g. kilo). For non-prefixed base units see {@link #createBaseUnit(String, String, String, BaseDimension)}.
     *
     * @param identifier   A unique identifier for the unit.
     * @param name         The preferred name of the unit.
     * @param symbol       The symbol used for the unit.
     * @param dimension    The base dimension of the unit. (see {@link Dimension})
     * @param singularUnit The Unit that is prefixed.
     * @param prefix       The prefix used for the unit.
     * @return The requested singular unit.
     */
    @Override
    public final BaseUnit createPrefixedBaseUnit(String identifier, String name, String symbol, BaseDimension dimension, SingularUnit singularUnit, Prefix prefix) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createPrefixedBaseUnit(identifier, name, symbol, dimension, singularUnit, prefix);
    }

    /**
     * Creates a new singular unit without any relation to other units. This creation method should be used when
     * the definition unit and factor are set by other means, for instance, when creating a dependent base unit such
     * as kilogram (depends on singular unit gram).
     *
     * @return The requested singular unit.
     */
    @Override
    public final SingularUnit createSingularUnit() {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createSingularUnit();
    }

    /**
     * Creates a new singular unit without any relation to other units. This creation method should be used when
     * the definition unit and factor are set by other means, for instance, when creating a dependent base unit such
     * as kilogram (depends on singular unit gram).
     *
     * @param name   The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @return The requested singular unit.
     */
    @Override
    public final SingularUnit createSingularUnit(String name, String symbol) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createSingularUnit(name, symbol);
    }

    /**
     * Creates a new singular unit without any relation to other units. This creation method should be used when
     * the definition unit and factor are set by other means, for instance, when creating a dependent base unit such
     * as kilogram (depends on singular unit gram).
     *
     * @param identifier A unique identifier for the unit.
     * @param name       The preferred name of the unit.
     * @param symbol     The symbol used for the unit.
     * @return The requested singular unit.
     */
    @Override
    public final SingularUnit createSingularUnit(String identifier, String name, String symbol) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createSingularUnit(identifier, name, symbol);
    }

    /**
     * Creates a new singular unit defined to be the same as the definition unit.
     * For instance the Pascal unit has as definition unit kilogram per metre second squared (kg m^-1 s^-1).
     * No multiplication (definitionFactor) factor is needed to convert between Pascal and kilogram per metre second
     * squared, i.e. 1 Pa = 1 kg m^-1 s^-1.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param definitionUnit The unit relative to which this unit is defined.
     * @return The requested singular unit.
     */
    @Override
    public final SingularUnit createSingularUnit(Unit definitionUnit) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createSingularUnit(definitionUnit);
    }

    /**
     * Creates a new singular unit defined to be the same as the definition unit.
     * For instance the Pascal unit has as definition unit kilogram per metre second squared (kg m^-1 s^-1).
     * No multiplication (definitionFactor) factor is needed to convert between Pascal and kilogram per metre second
     * squared, i.e. 1 Pa = 1 kg m^-1 s^-1.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name           The preferred name of the unit.
     * @param symbol         The symbol used for the unit.
     * @param definitionUnit The unit relative to which this unit is defined.
     * @return The requested singular unit.
     */
    @Override
    public final SingularUnit createSingularUnit(String name, String symbol, Unit definitionUnit) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createSingularUnit(name, symbol, definitionUnit);
    }

    /**
     * Creates a new singular unit defined to be the same as the definition unit.
     * For instance the Pascal unit has as definition unit kilogram per metre second squared (kg m^-1 s^-1).
     * No multiplication (definitionFactor) factor is needed to convert between Pascal and kilogram per metre second
     * squared, i.e. 1 Pa = 1 kg m^-1 s^-1.
     *
     * @param identifier     A unique identifier for the unit.
     * @param name           The preferred name of the unit.
     * @param symbol         The symbol used for the unit.
     * @param definitionUnit The unit relative to which this unit is defined.
     * @return The requested singular unit.
     */
    @Override
    public final SingularUnit createSingularUnit(String identifier, String name, String symbol, Unit definitionUnit) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createSingularUnit(identifier, name, symbol, definitionUnit);
    }

    /**
     * Returns a singular unit that is defined relative to the provided definition unit and related with this definition
     * unit with a multiplication factor as specied by the parameter <code>definitionFactor</code>.
     * For instance the astronomical unit is defined relative to the metre with a definition factor of 1.495978707e11,
     * i.e. 1 AU = 1.495978707e11 m.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param definitionUnit   The unit relative to which this unit is defined.
     * @param definitionFactor The multiplication factor.
     * @return The requested singular unit.
     */
    @Override
    public final SingularUnit createSingularUnit(Unit definitionUnit, double definitionFactor) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createSingularUnit(definitionUnit, definitionFactor);
    }

    /**
     * Returns a singular unit that is defined relative to the provided definition unit and related with this definition
     * unit with a multiplication factor as specied by the parameter <code>definitionFactor</code>.
     * For instance the astronomical unit is defined relative to the metre with a definition factor of 1.495978707e11,
     * i.e. 1 AU = 1.495978707e11 m.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name             The preferred name of the unit.
     * @param symbol           The symbol used for the unit.
     * @param definitionUnit   The unit relative to which this unit is defined.
     * @param definitionFactor The multiplication factor.
     * @return The requested singular unit.
     */
    @Override
    public final SingularUnit createSingularUnit(String name, String symbol, Unit definitionUnit, double definitionFactor) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createSingularUnit(name, symbol, definitionUnit, definitionFactor);
    }

    /**
     * Returns a singular unit that is defined relative to the provided definition unit and related with this definition
     * unit with a multiplication factor as specied by the parameter <code>definitionFactor</code>.
     * For instance the astronomical unit is defined relative to the metre with a definition factor of 1.495978707e11,
     * i.e. 1 AU = 1.495978707e11 m.
     *
     * @param identifier       A unique identifier for the unit.
     * @param name             The preferred name of the unit.
     * @param symbol           The symbol used for the unit.
     * @param definitionUnit   The unit relative to which this unit is defined.
     * @param definitionFactor The multiplication factor.
     * @return The requested singular unit.
     */
    @Override
    public final SingularUnit createSingularUnit(String identifier, String name, String symbol, Unit definitionUnit, double definitionFactor) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createSingularUnit(identifier, name, symbol, definitionUnit, definitionFactor);
    }

    /**
     * Creates a new Prefixed Unit that has a unit and a prefix.
     * The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for predefined prefixes. For non-predefined prefixes use:
     * {@link #createUnitMultiple(Unit, double)} where the multiplication factor can
     * be specified.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param singularUnit The Unit that is prefixed.
     * @param prefix       The prefix used for the unit.
     * @return The unit multiple.
     */
    @Override
    public final PrefixedUnit createPrefixedUnit(SingularUnit singularUnit, Prefix prefix) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createPrefixedUnit(singularUnit, prefix);
    }

    /**
     * Creates a new Prefixed Unit that has a unit and a prefix.
     * The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for predefined prefixes. For non-predefined prefixes use:
     * {@link #createUnitMultiple(String, Unit, double)} where the multiplication factor can
     * be specified.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name         The preferred name of the unit.
     * @param singularUnit The Unit that is prefixed.
     * @param prefix       The prefix used for the unit.
     * @return The unit multiple.
     */
    @Override
    public final PrefixedUnit createPrefixedUnit(String name, SingularUnit singularUnit, Prefix prefix) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createPrefixedUnit(name, singularUnit, prefix);
    }

    /**
     * Creates a new Prefixed Unit that has a unit and a prefix.
     * The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for predefined prefixes. For non-predefined prefixes use:
     * {@link #createUnitMultiple(String, String, Unit, double)} where the multiplication factor can
     * be specified.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name         The preferred name of the unit.
     * @param symbol       The symbol used for the unit.
     * @param singularUnit The Unit that is prefixed.
     * @param prefix       The prefix used for the unit.
     * @return The unit multiple.
     */
    @Override
    public final PrefixedUnit createPrefixedUnit(String name, String symbol, SingularUnit singularUnit, Prefix prefix) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createPrefixedUnit(name, symbol, singularUnit, prefix);
    }

    /**
     * Creates a new Prefixed Unit that has a unit and a prefix.
     * The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for predefined prefixes. For non-predefined prefixes use:
     * {@link #createUnitMultiple(String, String, String, Unit, double)} where the multiplication factor can
     * be specified.
     *
     * @param identifier   A unique identifier for the unit.
     * @param name         The preferred name of the unit.
     * @param symbol       The symbol used for the unit.
     * @param singularUnit The Unit that is prefixed.
     * @param prefix       The prefix used for the unit.
     * @return The unit multiple.
     */
    @Override
    public final PrefixedUnit createPrefixedUnit(String identifier, String name, String symbol, SingularUnit singularUnit, Prefix prefix) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createPrefixedUnit(identifier, name, symbol, singularUnit, prefix);
    }

    /**
     * Creates a new Unit multiple that has a unit and a multiplication factor.
     * For custom units like 125 g, the factor will be 125 and the unit g.
     * This method should be used for non-predefined multiplication factors. For predefined prefixes use:
     * {@link #createPrefixedUnit(SingularUnit, Prefix)}.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param unit   The Unit used in the unit multiple.
     * @param factor The multiplication factor.
     * @return The unit multiple.
     */
    @Override
    public final UnitMultiple createUnitMultiple(Unit unit, double factor) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createUnitMultiple(unit, factor);
    }

    /**
     * Creates a new Unit multiple that has a unit and a multiplication factor.
     * For custom units like 125 g, the factor will be 125 and the unit g.
     * This method should be used for non-predefined multiplication factors. For predefined prefixes use:
     * {@link #createPrefixedUnit(String, SingularUnit, Prefix)}.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name   The preferred name of the unit.
     * @param unit   The Unit used in the unit multiple.
     * @param factor The multiplication factor.
     * @return The unit multiple.
     */
    @Override
    public final UnitMultiple createUnitMultiple(String name, Unit unit, double factor) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createUnitMultiple(name, unit, factor);
    }

    /**
     * Creates a new Unit multiple that has a unit and a multiplication factor.
     * For custom units like 125 g, the factor will be 125 and the unit g.
     * This method should be used for non-predefined multiplication factors. For predefined prefixes use:
     * {@link #createPrefixedUnit(String, String, String, SingularUnit, Prefix)}.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name   The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param unit   The Unit used in the unit multiple.
     * @param factor The multiplication factor.
     * @return The unit multiple.
     */
    @Override
    public final UnitMultiple createUnitMultiple(String name, String symbol, Unit unit, double factor) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createUnitMultiple(name, symbol, unit, factor);
    }

    /**
     * Creates a new Unit multiple that has a unit and a multiplication factor.
     * For custom units like 125 g, the factor will be 125 and the unit g.
     * This method should be used for non-predefined multiplication factors. For predefined prefixes use:
     * {@link #createPrefixedUnit(String, String, String, SingularUnit, Prefix)}.
     *
     * @param identifier A unique identifier for the unit.
     * @param name       The preferred name of the unit.
     * @param symbol     The symbol used for the unit.
     * @param unit       The Unit used in the unit multiple.
     * @param factor     The multiplication factor.
     * @return The unit multiple.
     */
    @Override
    public final UnitMultiple createUnitMultiple(String identifier, String name, String symbol, Unit unit, double factor) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createUnitMultiple(identifier, name, symbol, unit, factor);
    }

    /**
     * Creates a unit that consists of a multiplication of two units, such as Newton metre (N.m).
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param term1 The first unit in the unit multiplication.
     * @param term2 The second unit in the unit multiplication.
     * @return The unit multiplication.
     */
    @Override
    public final UnitMultiplication createUnitMultiplication(Unit term1, Unit term2) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createUnitMultiplication(term1, term2);
    }

    /**
     * Creates a unit that consists of a multiplication of two units, such as Newton metre (N.m).
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name   The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param term1  The first unit in the unit multiplication.
     * @param term2  The second unit in the unit multiplication.
     * @return The unit multiplication.
     */
    @Override
    public final UnitMultiplication createUnitMultiplication(String name, String symbol, Unit term1, Unit term2) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createUnitMultiplication(name, symbol, term1, term2);
    }

    /**
     * Creates a unit that consists of a multiplication of two units, such as Newton metre (N.m).
     *
     * @param identifier A unique identifier for the unit.
     * @param name       The preferred name of the unit.
     * @param symbol     The symbol used for the unit.
     * @param term1      The first unit in the unit multiplication.
     * @param term2      The second unit in the unit multiplication.
     * @return The unit multiplication.
     */
    @Override
    public final UnitMultiplication createUnitMultiplication(String identifier, String name, String symbol, Unit term1, Unit term2) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createUnitMultiplication(identifier, name, symbol, term1, term2);
    }

    /**
     * Creates a unit that consists of a division of two units, such as metre per second (m/s).
     * In the unit metre per second, metre is the numerator unit and second is the denominator unit.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param numerator   The unit used as numerator in the unit division.
     * @param denominator The unit used as denominator in the unit division.
     * @return The unit division.
     */
    @Override
    public final UnitDivision createUnitDivision(Unit numerator, Unit denominator) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createUnitDivision(numerator, denominator);
    }

    /**
     * Creates a unit that consists of a division of two units, such as metre per second (m/s).
     * In the unit metre per second, metre is the numerator unit and second is the denominator unit.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name        The preferred name of the unit.
     * @param symbol      The symbol used for the unit.
     * @param numerator   The unit used as numerator in the unit division.
     * @param denominator The unit used as denominator in the unit division.
     * @return The unit division.
     */
    @Override
    public final UnitDivision createUnitDivision(String name, String symbol, Unit numerator, Unit denominator) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createUnitDivision(name, symbol, numerator, denominator);
    }

    /**
     * Creates a unit that consists of a division of two units, such as metre per second (m/s).
     * In the unit metre per second, metre is the numerator unit and second is the denominator unit.
     *
     * @param identifier  A unique identifier for the unit.
     * @param name        The preferred name of the unit.
     * @param symbol      The symbol used for the unit.
     * @param numerator   The unit used as numerator in the unit division.
     * @param denominator The unit used as denominator in the unit division.
     * @return The unit division.
     */
    @Override
    public final UnitDivision createUnitDivision(String identifier, String name, String symbol, Unit numerator, Unit denominator) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createUnitDivision(identifier, name, symbol, numerator, denominator);
    }

    /**
     * Creates a unit that consists of a exponentiation of its base unit.
     * For instance cubic metre (m^2) is a unit exponentiation with base unit metre (m) and exponent 2.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param base     The base unit.
     * @param exponent The exponent.
     * @return The unit exponentiation.
     */
    @Override
    public final UnitExponentiation createUnitExponentiation(Unit base, double exponent) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createUnitExponentiation(base, exponent);
    }

    /**
     * Creates a unit that consists of a exponentiation of its base unit.
     * For instance cubic metre (m^2) is a unit exponentiation with base unit metre (m) and exponent 2.
     * The identifier for the unit should be generated by the factory and should be unique.
     *
     * @param name     The preferred name of the unit.
     * @param symbol   The symbol used for the unit.
     * @param base     The base unit.
     * @param exponent The exponent.
     * @return The unit exponentiation.
     */
    @Override
    public final UnitExponentiation createUnitExponentiation(String name, String symbol, Unit base, double exponent) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createUnitExponentiation(name, symbol, base, exponent);
    }

    /**
     * Creates a unit that consists of a exponentiation of its base unit.
     * For instance cubic metre (m^2) is a unit exponentiation with base unit metre (m) and exponent 2.
     *
     * @param identifier A unique identifier for the unit.
     * @param name       The preferred name of the unit.
     * @param symbol     The symbol used for the unit.
     * @param base       The base unit.
     * @param exponent   The exponent.
     * @return The unit exponentiation.
     */
    @Override
    public final UnitExponentiation createUnitExponentiation(String identifier, String name, String symbol, Unit base, double exponent) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createUnitExponentiation(identifier, name, symbol, base, exponent);
    }

    /**
     * Creates a new measurement scale that does not refer to any other measurement scale.
     * The identifier for the scale should be generated by the factory and should be unique.
     *
     * @param unit The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    @Override
    public final Scale createScale(Unit unit) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createScale(unit);
    }

    /**
     * Creates a new measurement scale that does not refer to any other measurement scale.
     * The identifier for the scale should be generated by the factory and should be unique.
     *
     * @param name   The preferred name of the scale.
     * @param symbol The symbol used for the scale.
     * @param unit   The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    @Override
    public final Scale createScale(String name, String symbol, Unit unit) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createScale(name, symbol, unit);
    }

    /**
     * Creates a new measurement scale that does not refer to any other measurement scale.
     *
     * @param identifier A unique identifier for the scale.
     * @param name       The preferred name of the scale.
     * @param symbol     The symbol used for the scale.
     * @param unit       The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    @Override
    public final Scale createScale(String identifier, String name, String symbol, Unit unit) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createScale(identifier, name, symbol, unit);
    }

    /**
     * Creates a new measurement scale that is defined by a transformation (using an offset and a multiplication factor)
     * of the specified definition scale.
     * The Fahrenheit measurement scale, for instance, has an offset of -459.67 and a multiplication factor of 1.8
     * relative to its definition scale which is the Kelvin scale. It uses the unit Fahrenheit.
     * The identifier for the scale should be generated by the factory and should be unique.
     *
     * @param definitionScale  The definition scale.
     * @param definitionOffset The offset of this scale with the definition scale.
     * @param definitionFactor The multiplication factor by which values in this scale need to be multiplied to
     *                         calculate the value in the definition scale.
     * @param unit             The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    @Override
    public final Scale createScale(Scale definitionScale, double definitionOffset, double definitionFactor, Unit unit) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createScale(definitionScale, definitionOffset, definitionFactor, unit);
    }

    /**
     * Creates a new measurement scale that is defined by a transformation (using an offset and a multiplication factor)
     * of the specified definition scale.
     * The Fahrenheit measurement scale, for instance, has an offset of -459.67 and a multiplication factor of 1.8
     * relative to its definition scale which is the Kelvin scale. It uses the unit Fahrenheit.
     * The identifier for the scale should be generated by the factory and should be unique.
     *
     * @param name             The preferred name of the scale.
     * @param symbol           The symbol used for the scale.
     * @param definitionScale  The definition scale.
     * @param definitionOffset The offset of this scale with the definition scale.
     * @param definitionFactor The multiplication factor by which values in this scale need to be multiplied to
     *                         calculate the value in the definition scale.
     * @param unit             The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    @Override
    public final Scale createScale(String name, String symbol, Scale definitionScale, double definitionOffset, double definitionFactor, Unit unit) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createScale(name, symbol, definitionScale, definitionOffset, definitionFactor, unit);
    }

    /**
     * Creates a new measurement scale that is defined by a transformation (using an offset and a multiplication factor)
     * of the specified definition scale.
     * The Fahrenheit measurement scale, for instance, has an offset of -459.67 and a multiplication factor of 1.8
     * relative to its definition scale which is the Kelvin scale. It uses the unit Fahrenheit.
     *
     * @param identifier       A unique identifier for the scale.
     * @param name             The preferred name of the scale.
     * @param symbol           The symbol used for the scale.
     * @param definitionScale  The definition scale.
     * @param definitionOffset The offset of this scale with the definition scale.
     * @param definitionFactor The multiplication factor by which values in this scale need to be multiplied to
     *                         calculate the value in the definition scale.
     * @param unit             The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    @Override
    public final Scale createScale(String identifier, String name, String symbol, Scale definitionScale, double definitionOffset, double definitionFactor, Unit unit) {
        if(unitAndScaleFactory == null) throw new FactoryNotSetException("The unit and scale creation factory is not set in the InstanceFactory.");
        return unitAndScaleFactory.createScale(identifier, name, symbol, definitionScale, definitionOffset, definitionFactor, unit);
    }


    /**
     * Creates a new measure with the specified numerical value expressed in the specified unit.
     * If the numerical value is of type Number, a ScalarMeasure will be created, if the numerical
     * value is an array of numbers, a VectorMeasure will be created.
     *
     * @param numericalValue The numerical value.
     * @param unit           The unit.
     * @return A measure with the specified value expressed in the specified unit.
     */
    @Override
    public final Measure createMeasure(Object numericalValue, Unit unit) {
        if(measureAndPointFactory == null) throw new FactoryNotSetException("The measure and point creation factory is not set in the InstanceFactory.");
        return measureAndPointFactory.createMeasure(numericalValue, unit);
    }


    /**
     * Creates a new scalar measure with the specified numerical value expressed in the specified unit.
     *
     * @param value The scalar value of the measure.
     * @param unit  The unit in which the scalar is expressed.
     * @return The scalar measure.
     */
    @Override
    public final Measure createScalarMeasure(double value, Unit unit) {
        if(measureAndPointFactory == null) throw new FactoryNotSetException("The measure and point creation factory is not set in the InstanceFactory.");
        return measureAndPointFactory.createScalarMeasure(value, unit);
    }


    /**
     * Creates a new vector measure with the specified vector value expressed int the specified unit.
     *
     * @param vector The vector value of the measure expressed as an array of numbers.
     * @param unit   The unit in which the vector is expressed.
     * @return The vector measure.
     */
    @Override
    public final Measure createVectorMeasure(double[] vector, Unit unit) {
        if(measureAndPointFactory == null) throw new FactoryNotSetException("The measure and point creation factory is not set in the InstanceFactory.");
        return measureAndPointFactory.createVectorMeasure(vector, unit);
    }


    /**
     * Creates a new scalar point on a measurement scale with the specified numerical value on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param value The value of the scale.
     * @param scale The scale in which this point is defined.
     * @return The point.
     */
    @Override
    public final Point createPoint(Object value, Scale scale) {
        if(measureAndPointFactory == null) throw new FactoryNotSetException("The measure and point creation factory is not set in the InstanceFactory.");
        return measureAndPointFactory.createPoint(value, scale);
    }

    /**
     * Creates a new scalar point on a measurement scale with the specified scalar value on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param value The scalar value of the point.
     * @param scale The scale in which this point is defined.
     * @return The scalar point.
     */
    @Override
    public final Point createScalarPoint(double value, Scale scale) {
        if(measureAndPointFactory == null) throw new FactoryNotSetException("The measure and point creation factory is not set in the InstanceFactory.");
        return measureAndPointFactory.createScalarPoint(value, scale);
    }


    /**
     * Creates a new vector point on a measurement scale with the specified vector value on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param vector The vector value of the point expressed as an array of numbers.
     * @param scale  The scale in which this point is defined.
     * @return The vector point.
     */
    @Override
    public final Point createVectorPoint(double[] vector, Scale scale) {
        if(measureAndPointFactory == null) throw new FactoryNotSetException("The measure and point creation factory is not set in the InstanceFactory.");
        return measureAndPointFactory.createVectorPoint(vector, scale);
    }

    /**
     * Creates a new scalar measure with a range with the specified minimum and maximum values
     * expressed in the specified unit.
     *
     * @param minimumValue The minimum value of the measure.
     * @param maximumValue The maximum value of the measure.
     * @param unit         The unit in which the scalar is expressed.
     * @return The scalar measure.
     */
    @Override
    public Measure createScalarRangeMeasure(double minimumValue, double maximumValue, Unit unit) {
        if(measureAndPointFactory == null) throw new FactoryNotSetException("The measure and point creation factory is not set in the InstanceFactory.");
        return measureAndPointFactory.createScalarRangeMeasure(minimumValue, maximumValue, unit);
    }

    /**
     * Creates a new scalar measure with the specified range in the specified unit.
     *
     * @param range The scalar range of the measure.
     * @param unit  The unit in which the scalar is expressed.
     * @return The scalar measure.
     */
    @Override
    public Measure createScalarRangeMeasure(Range range, Unit unit) {
        if(measureAndPointFactory == null) throw new FactoryNotSetException("The measure and point creation factory is not set in the InstanceFactory.");
        return measureAndPointFactory.createScalarRangeMeasure(range,unit);
    }

    /**
     * Creates a new scalar point with a range with the specified minimum and maximum values
     * expressed on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param minimumValue The minimum value of the point.
     * @param maximumValue The maximum value of the point.
     * @param scale        The scale in which this point is defined.
     * @return The scalar range point.
     */
    @Override
    public Point createScalarRangePoint(double minimumValue, double maximumValue, Scale scale) {
        if(measureAndPointFactory == null) throw new FactoryNotSetException("The measure and point creation factory is not set in the InstanceFactory.");
        return measureAndPointFactory.createScalarRangePoint(minimumValue, maximumValue, scale);
    }

    /**
     * Creates a new scalar point with the specified range on the specified measurement
     * scale and using the unit associated with that scale.
     *
     * @param range The scalar range of the point.
     * @param scale The scale in which this point is defined.
     * @return The scalar range point.
     */
    @Override
    public Point createScalarRangePoint(Range range, Scale scale) {
        if(measureAndPointFactory == null) throw new FactoryNotSetException("The measure and point creation factory is not set in the InstanceFactory.");
        return measureAndPointFactory.createScalarRangePoint(range,scale);
    }

    /**
     * Converts a double value expressed in the specified unit to the target unit.
     *
     * @param value      The double value.
     * @param unit       The unit in which the double is expressed.
     * @param targetUnit The target unit into which the double should be converted.
     * @return The converted value expressed in the target unit.
     * @throws ConversionException When the double could not be converted to the specified target unit.
     */
    @Override
    public final double convert(double value, Unit unit, Unit targetUnit) throws ConversionException {
        if(unitAndScaleConversionFactory == null) throw new FactoryNotSetException("The conversion factory is not set in the InstanceFactory.");
        return unitAndScaleConversionFactory.convert(value, unit, targetUnit);
    }

    /**
     * Converts a double value on the specified measurement scale to the target measurement scale.
     *
     * @param value       The double value.
     * @param scale       The scale in which the double is expressed.
     * @param targetScale The target scale into which the double should be converted.
     * @return The converted value expressed in the target scale.
     * @throws ConversionException When the double could not be converted to the specified target scale.
     */
    @Override
    public final double convert(double value, Scale scale, Scale targetScale) throws ConversionException {
        if(unitAndScaleConversionFactory == null) throw new FactoryNotSetException("The conversion factory is not set in the InstanceFactory.");
        return unitAndScaleConversionFactory.convert(value, scale, targetScale);
    }


    /**
     * Converts a measure (a numerical value expressed in a specific unit) to a target unit.
     *
     * @param measure    The measure to be converted to the target unit.
     * @param targetUnit The target unit to which the measurement is to be converted.
     * @return The converted measure.
     * @throws ConversionException When the measure could not be converted to the specified target unit.
     */
    @Override
    public final Measure convertToUnit(Measure measure, Unit targetUnit) throws ConversionException {
        if(unitAndScaleConversionFactory == null) throw new FactoryNotSetException("The conversion factory is not set in the InstanceFactory.");
        return unitAndScaleConversionFactory.convertToUnit(measure, targetUnit);
    }


    /**
     * Converts a point (a numerical value expressed on a specific scale) to a target scale.
     * This method can be used to convert, for instance, between degrees Celsius and Fahrenheit if the temperature
     * is absolute (i.e. not a temperature difference).
     *
     * @param point       The point to be converted to the target scale.
     * @param targetScale The target scale to which the point is to be converted.
     * @return The converted point.
     * @throws ConversionException When the point could not be converted to the specified target scale.
     */
    @Override
    public final Point convertToScale(Point point, Scale targetScale) throws ConversionException {
        if(unitAndScaleConversionFactory == null) throw new FactoryNotSetException("The conversion factory is not set in the InstanceFactory.");
        return unitAndScaleConversionFactory.convertToScale(point, targetScale);
    }

    /**
     * Compares the two scalar measures and returns a negative integer if the first measure is smaller than the
     * second measure, 0 if the two measures are equal, or a positive integer if the first measure is
     * larger than the second measure.
     *
     * @param measure1 The first measure to compare.
     * @param measure2 The second measure to compare.
     * @return A negative integer if the first measure is smaller than the second measure, 0 if the measures
     * are equal, and a positive integer if the first measure is larger.
     * @throws ConversionException When the units of the measures are in different dimensions.
     */
    @Override
    public final int compare(Measure measure1, Measure measure2) throws ConversionException {
        if(unitAndScaleConversionFactory == null) throw new FactoryNotSetException("The conversion factory is not set in the InstanceFactory.");
        return unitAndScaleConversionFactory.compare(measure1, measure2);
    }

    /**
     * Compares the two measures and returns true when they are equal. This includes the conversion of units,
     * e.g. 1 km is equal to 1000000 mm. If the compared measures are vectors
     * each of the components of the vector should be equal to the same component of the other vector (including
     * unit conversion). When the measures cannot be compared because the units cannot be converted into each other,
     * this method returns false.
     *
     * @param measure1 The first measure to compare.
     * @param measure2 The second measure to compare.
     * @param diff     The maximum difference between the two values for the method to return true, e.g. if the first measure
     *                 has value 12.002 and the second 12.003 and diff is 0.002, this method will return true.
     * @return True when the measures are equal, or false otherwise.
     */
    @Override
    public final boolean equals(Measure measure1, Measure measure2, double diff) {
        if(unitAndScaleConversionFactory == null) throw new FactoryNotSetException("The conversion factory is not set in the InstanceFactory.");
        return unitAndScaleConversionFactory.equals(measure1, measure2, diff);
    }

    /**
     * Compares the two points and returns a negative integer if the first point is smaller than the
     * second point, 0 if the two points are equal, or a positive integer if the first point is
     * larger than the second point.
     *
     * @param point1 The first point to compare.
     * @param point2 The second point to compare.
     * @return A negative integer if the first point is smaller than the second point, 0 if the points
     * are equal, and a positive integer if the first point is larger.
     * @throws ConversionException When the units of the points are in different dimensions, or if the measures
     *                             have incompatible numerical values, e.g. a scalar and a vector.
     */
    @Override
    public final int compare(Point point1, Point point2) throws ConversionException {
        if(unitAndScaleConversionFactory == null) throw new FactoryNotSetException("The conversion factory is not set in the InstanceFactory.");
        return unitAndScaleConversionFactory.compare(point1, point2);
    }

    /**
     * Compares the two points and returns true when they are equal. This includes the conversion of units,
     * e.g. 1 K is equal to 1.8 F. If the compared points are vectors
     * each of the components of the vector should be equal to the same component of the other vector (including
     * unit conversion and scale conversion). When the points cannot be compared because the units cannot be converted into each other,
     * this method returns false.
     *
     * @param point1 The first point to compare.
     * @param point2 The second point to compare.
     * @param diff   The maximum difference between the two values for the method to return true, e.g. if the first point
     *               has value 12.002 and the second 12.003 and diff is 0.002, this method will return true.
     * @return True when the points are equal, or false otherwise.
     */
    @Override
    public final boolean equals(Point point1, Point point2, double diff) {
        if(unitAndScaleConversionFactory == null) throw new FactoryNotSetException("The conversion factory is not set in the InstanceFactory.");
        return unitAndScaleConversionFactory.equals(point1, point2, diff);
    }

    /**
     * Defines two units two be equal to each other, for instance when they define the same unit but are in
     * different sets.
     *
     * @param unit1 The first unit set to be equal to the second.
     * @param unit2 The second unit set to be equal to the first.
     */
    @Override
    public void setUnitsToBeEqual(Unit unit1, Unit unit2) {
        unitAndScaleConversionFactory.setUnitsToBeEqual(unit1,unit2);
    }

    /**
     * Tests whether the specified unit is equal to One.
     * Some units are defined with respect to the unit One, other units are compound units that equate to One.
     * For instance the unit m/m equates to one, but km/m does not.
     *
     * @param unit The unit to be tested.
     * @return True when the unit equates to one.
     */
    public boolean unitIsEqualToOne(Unit unit) {
        if(!unit.isDimensionless()) return false;
        return unitAndScaleConversionFactory.unitIsEqualToOne(unit);
    }
}
