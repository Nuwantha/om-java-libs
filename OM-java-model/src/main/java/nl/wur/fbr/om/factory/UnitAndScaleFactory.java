package nl.wur.fbr.om.factory;

import nl.wur.fbr.om.exceptions.UnitOrScaleCreationException;
import nl.wur.fbr.om.model.dimensions.BaseDimension;
import nl.wur.fbr.om.model.scales.Scale;
import nl.wur.fbr.om.model.units.*;
import nl.wur.fbr.om.prefixes.Prefix;

/**
 * This factory method provides the preferred method for creating new instance of Units and Measurement scales.
 * Each library that implements the model classes should also provide an implementation of the
 * UnitAndScaleFactory to create instances from its own implementation classes. The factory can also be used
 * to reuse earlier created instances of units.
 * <p>
 * When using an implementation that used the OM ontology, for instance, each unit in OM has its own identifier (URI). The
 * factory should provide methods to create units from these URIs and use the data in the OM ontology to create the
 * units. If the same unit (i.e. with the same URI) is requested again, the factory should return the same unit object.
 * <p>
 * There are different types of units as there are units that are base units of a system of units, and there are units
 * that are defined as multiples or have prefixes attached. Other units are compound units consisting of a relation
 * between other units.
 * <p>
 * The different types of units are:
 *
 * <table summary="The Units types." style="border-spacing:0px;">
 *     <thead style="background-color: #BDF; font-weight: bold;">
 *          <tr><td style="width: 10%">Type</td><td>Interface</td><td style="width: 30%">description</td><td>examples</td><td style="width: 40%">methods</td></tr>
 *     </thead>
 *     <tbody style="padding:4px; margin:0px;vertical-align:top; font-size:8pt;">
 *          <tr><td>Singular Unit</td><td>{@link SingularUnit}</td><td>A unit that is a multiplication of some other unit.</td><td>inch ['] <br> Pascal [P]</td>
 *              <td>{@link #createBaseUnit(BaseDimension)} <br>
 *                  {@link #createBaseUnit(String, String, BaseDimension)} <br>
 *                  {@link #createBaseUnit(String, String, String, BaseDimension)} <br>
 *                  {@link #createSingularUnit(String, String, String, Unit, double)}<br>
 *                  {@link #createSingularUnit(String, String, Unit)}<br>
 *                  {@link #createSingularUnit(String, String, String, Unit)}<br>
 *                  {@link #createSingularUnit(String, String, Unit, double)}<br>
 *                  {@link #createSingularUnit(Unit)}<br>
 *                  {@link #createSingularUnit(Unit, double)}</td></tr>
 *          <tr><td>Unit Multiple</td><td>{@link UnitMultiple}</td><td>A prefixed unit.</td><td>kilometre [km]<br> Megaparsec [Mpc]</td>
 *              <td>
 *                  {@link #createUnitMultiple(Unit, double)}<br>
 *                  {@link #createPrefixedUnit(SingularUnit, Prefix)}<br>
 *                  {@link #createPrefixedUnit(String, String, SingularUnit, Prefix)}<br>
 *                  {@link #createUnitMultiple(String, String, String, Unit, double)}<br>
 *                  {@link #createPrefixedUnit(String, String, String, SingularUnit, Prefix)}<br>
 *                  {@link #createUnitMultiple(String, Unit, double)}<br>
 *                  {@link #createPrefixedUnit(String, SingularUnit, Prefix)}<br>
 *                  {@link #createUnitMultiple(String, String, Unit, double)}
 *              </td></tr>
 *          <tr><td>Unit Multiplication</td><td>{@link UnitMultiplication}</td><td>A compound unit created by multiplying two other units.</td><td>Newton metre [N.m]</td>
 *              <td>
 *                  {@link #createUnitMultiplication(String, String, String, Unit, Unit)} <br>
 *                  {@link #createUnitMultiplication(String, String, Unit, Unit)}<br>
 *                  {@link #createUnitMultiplication(Unit, Unit)}
 *              </td></tr>
 *          <tr><td>Unit Division</td><td>{@link UnitDivision}</td><td>A compound unit created by dividing one unit by another.</td><td>metre per second [m/s]</td>
 *              <td>
 *                  {@link #createUnitDivision(String, String, String, Unit, Unit)} <br>
 *                  {@link #createUnitDivision(String, String, Unit, Unit)}<br>
 *                  {@link #createUnitDivision(Unit, Unit)}
 *              </td></tr>
 *          <tr><td>Unit Exponentiation</td><td>{@link UnitExponentiation}</td><td>A unit that is the exponentiation of another unit.</td><td>cubic metre [m^3]</td>
 *              <td>
 *                  {@link #createUnitExponentiation(String, String, String, Unit, double)} <br>
 *                  {@link #createUnitExponentiation(String, String, Unit, double)}<br>
 *                  {@link #createUnitExponentiation(Unit, double)}
 *              </td></tr>
 *     </tbody>
 * </table>
 *
 * @author Don Willems on 15/07/15.
 */
public interface UnitAndScaleFactory {

    /**
     * Implementations should return a unit or scale identified by the specified
     * identifier. If the Unit or Scale with the same identifier has been created previously, this method should return the
     * same instance. If the Unit or Scale has not been created previously, this method should create the
     * unit or scale and set the identifier of the unit or scale to the specified identifier. The data needed to
     * create the unit (such as multiplication factors, prefixes, or base units) or scale may be available from other sources
     * such as the OM ontology. If the data for creating a new instance is not available, or the identifier does not
     * represent a unit or scale, this method will throw a {@link UnitOrScaleCreationException}.
     * @param identifier The identifier of the unit or scale.
     * @return The unit or scale identified by the specified identifier.
     * @throws UnitOrScaleCreationException When the unit could not be created from the specified identifier.
     */
    public Object getUnitOrScale(String identifier) throws UnitOrScaleCreationException;

    /**
     * Creates a new singular base unit. For prefixed base units (e.g. kilogram) see
     * {@link #createPrefixedBaseUnit(BaseDimension, SingularUnit, Prefix)}.
     * For instance the metre unit is a base unit in SI and does not have a definition unit.
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param baseDimension The base dimension of the unit. (see {@link BaseDimension})
     * @return The requested singular base unit.
     */
    public BaseUnit createBaseUnit(BaseDimension baseDimension);

    /**
     * Creates a new singular base unit. For prefixed base units (e.g. kilogram) see
     * {@link #createPrefixedBaseUnit(String,String, BaseDimension, SingularUnit, Prefix)}.
     * For instance the metre unit is a base unit in SI and does not have a definition unit.
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param baseDimension The base dimension of the unit. (see {@link BaseDimension})
     * @return The requested singular unit.
     */
    public BaseUnit createBaseUnit(String name, String symbol,BaseDimension baseDimension);

    /**
     * Creates a new singular base unit. For prefixed base units (e.g. kilogram) see
     * {@link #createPrefixedBaseUnit(String,String,String, BaseDimension, SingularUnit, Prefix)}.
     * For instance the metre unit is a base unit in SI and does not have a definition unit.
     * @param identifier A unique identifier for the unit.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param baseDimension The base dimension of the unit. (see {@link BaseDimension})
     * @return The requested singular unit.
     */
    public BaseUnit createBaseUnit(String identifier,String name, String symbol,BaseDimension baseDimension);

    /**
     * Creates a new prefixed base unit (e.g. kilogram) that has a unit (e.g. gram) and a
     * prefix (e.g. kilo). For non-prefixed base units see {@link #createBaseUnit(BaseDimension)}.
     * @param baseDimension The base dimension of the unit. (see {@link BaseDimension})
     * @param singularUnit The Unit that is prefixed.
     * @param prefix The prefix used for the unit.
     * @return The requested singular base unit.
     */
    public BaseUnit createPrefixedBaseUnit(BaseDimension baseDimension, SingularUnit singularUnit, Prefix prefix);

    /**
     * Creates a new prefixed base unit (e.g. kilogram) that has a unit (e.g. gram) and a
     * prefix (e.g. kilo). For non-prefixed base units see {@link #createBaseUnit(String,String, BaseDimension)}.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param baseDimension The base dimension of the unit. (see {@link BaseDimension})
     * @param singularUnit The Unit that is prefixed.
     * @param prefix The prefix used for the unit.
     * @return The requested singular unit.
     */
    public BaseUnit createPrefixedBaseUnit(String name, String symbol,BaseDimension baseDimension, SingularUnit singularUnit, Prefix prefix);

    /**
     * Creates a new prefixed base unit (e.g. kilogram) that has a unit (e.g. gram) and a
     * prefix (e.g. kilo). For non-prefixed base units see {@link #createBaseUnit(String,String,String, BaseDimension)}.
     * @param identifier A unique identifier for the unit.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param baseDimension The base dimension of the unit. (see {@link BaseDimension})
     * @param singularUnit The Unit that is prefixed.
     * @param prefix The prefix used for the unit.
     * @return The requested singular unit.
     */
    public BaseUnit createPrefixedBaseUnit(String identifier,String name, String symbol,BaseDimension baseDimension, SingularUnit singularUnit, Prefix prefix);

    /**
     * Creates a new singular unit without any relation to other units. This creation method should be used when
     * the definition unit and factor are set by other means, for instance, when creating a dependent base unit such
     * as kilogram (depends on singular unit gram).
     * @return The requested singular unit.
     */
    public SingularUnit createSingularUnit();

    /**
     * Creates a new singular unit without any relation to other units. This creation method should be used when
     * the definition unit and factor are set by other means, for instance, when creating a dependent base unit such
     * as kilogram (depends on singular unit gram). Or, if a unit has no relation to existing units, such as the bit.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @return The requested singular unit.
     */
    public SingularUnit createSingularUnit(String name,String symbol);

    /**
     * Creates a new singular unit without any relation to other units. This creation method should be used when
     * the definition unit and factor are set by other means, for instance, when creating a dependent base unit such
     * as kilogram (depends on singular unit gram). Or, if a unit has no relation to existing units, such as the bit.
     * @param identifier A unique identifier for the unit.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @return The requested singular unit.
     */
    public SingularUnit createSingularUnit(String identifier, String name,String symbol);

    /**
     * Creates a new singular unit defined to be the same as the definition unit.
     * For instance the Pascal unit has as definition unit kilogram per metre second squared (kg m^-1 s^-1).
     * No multiplication (definitionFactor) factor is needed to convert between Pascal and kilogram per metre second
     * squared, i.e. 1 Pa = 1 kg m^-1 s^-1.
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param definitionUnit The unit relative to which this unit is defined.
     * @return The requested singular unit.
     */
    public SingularUnit createSingularUnit(Unit definitionUnit);

    /**
     * Creates a new singular unit defined to be the same as the definition unit.
     * For instance the Pascal unit has as definition unit kilogram per metre second squared (kg m^-1 s^-1).
     * No multiplication (definitionFactor) factor is needed to convert between Pascal and kilogram per metre second
     * squared, i.e. 1 Pa = 1 kg m^-1 s^-1.
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param definitionUnit The unit relative to which this unit is defined.
     * @return The requested singular unit.
     */
    public SingularUnit createSingularUnit(String name, String symbol,Unit definitionUnit);

    /**
     * Creates a new singular unit defined to be the same as the definition unit.
     * For instance the Pascal unit has as definition unit kilogram per metre second squared (kg m^-1 s^-1).
     * No multiplication (definitionFactor) factor is needed to convert between Pascal and kilogram per metre second
     * squared, i.e. 1 Pa = 1 kg m^-1 s^-1.
     * @param identifier A unique identifier for the unit.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param definitionUnit The unit relative to which this unit is defined.
     * @return The requested singular unit.
     */
    public SingularUnit createSingularUnit(String identifier,String name, String symbol, Unit definitionUnit);

    /**
     * Returns a singular unit that is defined relative to the provided definition unit and related with this definition
     * unit with a multiplication factor as specied by the parameter <code>definitionFactor</code>.
     * For instance the astronomical unit is defined relative to the metre with a definition factor of 1.495978707e11,
     * i.e. 1 AU = 1.495978707e11 m.
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param definitionUnit The unit relative to which this unit is defined.
     * @param definitionFactor The multiplication factor.
     * @return The requested singular unit.
     */
    public SingularUnit createSingularUnit(Unit definitionUnit, double definitionFactor);

    /**
     * Returns a singular unit that is defined relative to the provided definition unit and related with this definition
     * unit with a multiplication factor as specied by the parameter <code>definitionFactor</code>.
     * For instance the astronomical unit is defined relative to the metre with a definition factor of 1.495978707e11,
     * i.e. 1 AU = 1.495978707e11 m.
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param definitionUnit The unit relative to which this unit is defined.
     * @param definitionFactor The multiplication factor.
     * @return The requested singular unit.
     */
    public SingularUnit createSingularUnit(String name, String symbol,Unit definitionUnit, double definitionFactor);

    /**
     * Returns a singular unit that is defined relative to the provided definition unit and related with this definition
     * unit with a multiplication factor as specied by the parameter <code>definitionFactor</code>.
     * For instance the astronomical unit is defined relative to the metre with a definition factor of 1.495978707e11,
     * i.e. 1 AU = 1.495978707e11 m.
     * @param identifier A unique identifier for the unit.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param definitionUnit The unit relative to which this unit is defined.
     * @param definitionFactor The multiplication factor.
     * @return The requested singular unit.
     */
    public SingularUnit createSingularUnit(String identifier, String name, String symbol, Unit definitionUnit, double definitionFactor);

    /**
     * Creates a new Prefixed Unit that has a unit and a prefix.
     * The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for predefined prefixes. For non-predefined prefixes use:
     * {@link #createUnitMultiple(Unit, double)} where the multiplication factor can
     * be specified.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param singularUnit The Unit that is prefixed.
     * @param prefix The prefix used for the unit.
     * @return The unit multiple.
     */
    public PrefixedUnit createPrefixedUnit(SingularUnit singularUnit, Prefix prefix);

    /**
     * Creates a new Prefixed Unit that has a unit and a prefix.
     * The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for predefined prefixes. For non-predefined prefixes use:
     * {@link #createUnitMultiple(String, Unit, double)} where the multiplication factor can
     * be specified.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param name The preferred name of the unit.
     * @param singularUnit The Unit that is prefixed.
     * @param prefix The prefix used for the unit.
     * @return The unit multiple.
     */
    public PrefixedUnit createPrefixedUnit(String name, SingularUnit singularUnit, Prefix prefix);

    /**
     * Creates a new Prefixed Unit that has a unit and a prefix.
     * The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for predefined prefixes. For non-predefined prefixes use:
     * {@link #createUnitMultiple(String, String, Unit, double)} where the multiplication factor can
     * be specified.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param singularUnit The Unit that is prefixed.
     * @param prefix The prefix used for the unit.
     * @return The unit multiple.
     */
    public PrefixedUnit createPrefixedUnit(String name, String symbol, SingularUnit singularUnit, Prefix prefix);

    /**
     * Creates a new Prefixed Unit that has a unit and a prefix.
     * The prefix, kilo, for example has a prefix factor of 1000 and the prefix milli, has a
     * prefix factor of 0.001. This method should be used for predefined prefixes. For non-predefined prefixes use:
     * {@link #createUnitMultiple(String, String, String, Unit, double)} where the multiplication factor can
     * be specified.
     * @param identifier A unique identifier for the unit.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param singularUnit The Unit that is prefixed.
     * @param prefix The prefix used for the unit.
     * @return The unit multiple.
     */
    public PrefixedUnit createPrefixedUnit(String identifier, String name, String symbol, SingularUnit singularUnit, Prefix prefix);

    /**
     * Creates a new Unit multiple that has a unit and a multiplication factor.
     * For custom units like 125 g, the factor will be 125 and the unit g.
     * This method should be used for non-predefined multiplication factors. For predefined prefixes use:
     * {@link #createPrefixedUnit(SingularUnit, Prefix)}.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param unit The Unit used in the unit multiple.
     * @param factor The multiplication factor.
     * @return The unit multiple.
     */
    public UnitMultiple createUnitMultiple(Unit unit, double factor);

    /**
     * Creates a new Unit multiple that has a unit and a multiplication factor.
     * For custom units like 125 g, the factor will be 125 and the unit g.
     * This method should be used for non-predefined multiplication factors. For predefined prefixes use:
     * {@link #createPrefixedUnit(String, SingularUnit, Prefix)}.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param name The preferred name of the unit.
     * @param unit The Unit used in the unit multiple.
     * @param factor The multiplication factor.
     * @return The unit multiple.
     */
    public UnitMultiple createUnitMultiple(String name, Unit unit, double factor);

    /**
     * Creates a new Unit multiple that has a unit and a multiplication factor.
     * For custom units like 125 g, the factor will be 125 and the unit g.
     * This method should be used for non-predefined multiplication factors. For predefined prefixes use:
     * {@link #createPrefixedUnit(String, String, String, SingularUnit, Prefix)}.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param unit The Unit used in the unit multiple.
     * @param factor The multiplication factor.
     * @return The unit multiple.
     */
    public UnitMultiple createUnitMultiple(String name, String symbol, Unit unit, double factor);

    /**
     *Creates a new Unit multiple that has a unit and a multiplication factor.
     * For custom units like 125 g, the factor will be 125 and the unit g.
     * This method should be used for non-predefined multiplication factors. For predefined prefixes use:
     * {@link #createPrefixedUnit(String, String, String, SingularUnit, Prefix)}.
     * @param identifier A unique identifier for the unit.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param unit The Unit used in the unit multiple.
     * @param factor The multiplication factor.
     * @return The unit multiple.
     */
    public UnitMultiple createUnitMultiple(String identifier, String name, String symbol, Unit unit, double factor);

    /**
     * Creates a unit that consists of a multiplication of two units, such as Newton metre (N.m).
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param unit1 The first unit in the unit multiplication.
     * @param unit2 The second unit in the unit multiplication.
     * @return The unit multiplication.
     */
    public UnitMultiplication createUnitMultiplication(Unit unit1, Unit unit2);

    /**
     * Creates a unit that consists of a multiplication of two units, such as Newton metre (N.m).
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param unit1 The first unit in the unit multiplication.
     * @param unit2 The second unit in the unit multiplication.
     * @return The unit multiplication.
     */
    public UnitMultiplication createUnitMultiplication(String name, String symbol, Unit unit1, Unit unit2);

    /**
     * Creates a unit that consists of a multiplication of two units, such as Newton metre (N.m).
     * @param identifier A unique identifier for the unit.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param unit1 The first unit in the unit multiplication.
     * @param unit2 The second unit in the unit multiplication.
     * @return The unit multiplication.
     */
    public UnitMultiplication createUnitMultiplication(String identifier, String name, String symbol, Unit unit1, Unit unit2);

    /**
     * Creates a unit that consists of a division of two units, such as metre per second (m/s).
     * In the unit metre per second, metre is the numerator unit and second is the denominator unit.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param numerator The unit used as numerator in the unit division.
     * @param denominator The unit used as denominator in the unit division.
     * @return The unit division.
     */
    public UnitDivision createUnitDivision(Unit numerator, Unit denominator);

    /**
     * Creates a unit that consists of a division of two units, such as metre per second (m/s).
     * In the unit metre per second, metre is the numerator unit and second is the denominator unit.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param numerator The unit used as numerator in the unit division.
     * @param denominator The unit used as denominator in the unit division.
     * @return The unit division.
     */
    public UnitDivision createUnitDivision(String name, String symbol, Unit numerator, Unit denominator);

    /**
     * Creates a unit that consists of a division of two units, such as metre per second (m/s).
     * In the unit metre per second, metre is the numerator unit and second is the denominator unit.
     * @param identifier A unique identifier for the unit.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param numerator The unit used as numerator in the unit division.
     * @param denominator The unit used as denominator in the unit division.
     * @return The unit division.
     */
    public UnitDivision createUnitDivision(String identifier, String name, String symbol, Unit numerator, Unit denominator);

    /**
     * Creates a unit that consists of a exponentiation of its base unit.
     * For instance cubic metre (m^2) is a unit exponentiation with base unit metre (m) and exponent 2.
     *
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param base The base unit.
     * @param exponent The exponent.
     * @return The unit exponentiation.
     */
    public UnitExponentiation createUnitExponentiation(Unit base, double exponent);

    /**
     * Creates a unit that consists of a exponentiation of its base unit.
     * For instance cubic metre (m^2) is a unit exponentiation with base unit metre (m) and exponent 2.
     * The identifier for the unit should be generated by the factory and should be unique.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param base The base unit.
     * @param exponent The exponent.
     * @return The unit exponentiation.
     */
    public UnitExponentiation createUnitExponentiation(String name, String symbol, Unit base, double exponent);

    /**
     * Creates a unit that consists of a exponentiation of its base unit.
     * For instance cubic metre (m^2) is a unit exponentiation with base unit metre (m) and exponent 2.
     * @param identifier A unique identifier for the unit.
     * @param name The preferred name of the unit.
     * @param symbol The symbol used for the unit.
     * @param base The base unit.
     * @param exponent The exponent.
     * @return The unit exponentiation.
     */
    public UnitExponentiation createUnitExponentiation(String identifier, String name, String symbol, Unit base, double exponent);

    /**
     * Creates a new measurement scale that does not refer to any other measurement scale.
     * The identifier for the scale should be generated by the factory and should be unique.
     * @param unit The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    public Scale createScale(Unit unit);

    /**
     * Creates a new measurement scale that does not refer to any other measurement scale.
     * The identifier for the scale should be generated by the factory and should be unique.
     * @param name The preferred name of the scale.
     * @param symbol The symbol used for the scale.
     * @param unit The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    public Scale createScale(String name, String symbol, Unit unit);

    /**
     * Creates a new measurement scale that does not refer to any other measurement scale.
     * @param identifier A unique identifier for the scale.
     * @param name The preferred name of the scale.
     * @param symbol The symbol used for the scale.
     * @param unit The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    public Scale createScale(String identifier, String name, String symbol, Unit unit);

    /**
     * Creates a new measurement scale that is defined by a transformation (using an offset and a multiplication factor)
     * of the specified definition scale.
     * The Fahrenheit measurement scale, for instance, has an offset of -459.67 and a multiplication factor of 1.8
     * relative to its definition scale which is the Kelvin scale. It uses the unit Fahrenheit.
     * The identifier for the scale should be generated by the factory and should be unique.
     * @param definitionScale The definition scale.
     * @param definitionOffset The offset of this scale with the definition scale.
     * @param definitionFactor The multiplication factor by which values in this scale need to be multiplied to
     *                             calculate the value in the definition scale.
     * @param unit The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    public Scale createScale(Scale definitionScale, double definitionOffset, double definitionFactor, Unit unit);

    /**
     * Creates a new measurement scale that is defined by a transformation (using an offset and a multiplication factor)
     * of the specified definition scale.
     * The Fahrenheit measurement scale, for instance, has an offset of -459.67 and a multiplication factor of 1.8
     * relative to its definition scale which is the Kelvin scale. It uses the unit Fahrenheit.
     * The identifier for the scale should be generated by the factory and should be unique.
     * @param name The preferred name of the scale.
     * @param symbol The symbol used for the scale.
     * @param definitionScale The definition scale.
     * @param definitionOffset The offset of this scale with the definition scale.
     * @param definitionFactor The multiplication factor by which values in this scale need to be multiplied to
     *                             calculate the value in the definition scale.
     * @param unit The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    public Scale createScale(String name, String symbol, Scale definitionScale, double definitionOffset, double definitionFactor, Unit unit);

    /**
     * Creates a new measurement scale that is defined by a transformation (using an offset and a multiplication factor)
     * of the specified definition scale.
     * The Fahrenheit measurement scale, for instance, has an offset of -459.67 and a multiplication factor of 1.8
     * relative to its definition scale which is the Kelvin scale. It uses the unit Fahrenheit.
     * @param identifier A unique identifier for the scale.
     * @param name The preferred name of the scale.
     * @param symbol The symbol used for the scale.
     * @param definitionScale The definition scale.
     * @param definitionOffset The offset of this scale with the definition scale.
     * @param definitionFactor The multiplication factor by which values in this scale need to be multiplied to
     *                             calculate the value in the definition scale.
     * @param unit The unit associated with this measurement scale, i.e. the unit in which it is expressed.
     * @return The measurement scale.
     */
    public Scale createScale(String identifier, String name, String symbol, Scale definitionScale, double definitionOffset, double definitionFactor, Unit unit);


}
