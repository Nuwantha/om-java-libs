package nl.wur.fbr.om.model.values;

//TODO IMPLEMENT!

/**
 * A representation of a tensor that can be used as a numerical value in a measure or point in a
 * measurement scale.
 *
 * @author Don Willems on 21/07/15.
 */
public interface Tensor {

    /**
     * Returns the dimensionality of the tensor. A vector, for instance, has dimensionality 1, and a
     * matrix has dimensionality 2.
     * @return The number of dimensions of the tensor.
     */
    public int getDimensionality();
}
