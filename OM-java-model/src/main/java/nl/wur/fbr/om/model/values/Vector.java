package nl.wur.fbr.om.model.values;

/**
 * A representation of a vector that can be used as a numerical value in a measure or point in a
 * measurement scale. Vectors represent the values of numerical quantities that have both a direction
 * and a magnitude. A vector is a tensor with dimensionality 1.
 * @author Don Willems on 21/07/15.
 */
public interface Vector extends Tensor{

    /**
     * Returns the magnitude of the vector, which is a scalar.
     * This scalar is not expressed in units of measure.
     * @return The magnitude of the vector.
     */
    public double getMagnitude();

    /**
     * Returns the normalised (unit) vector of this vector, which represents the direction
     * of the vector. The unit vector should never have a unit of measure.
     * @return The unit vector.
     */
    public Vector getUnitVector();

    /**
     * Returns the size of the vector, i.e. the number of elements in the vector.
     * A 3D vector in Euclydian space has size 3.
     * @return
     */
    public int getSize();

    /**
     * Returns the element at the specified index in the vector.
     * @param index The index of the element.
     * @return The value of the element.
     */
    public double getElement(int index);
}
