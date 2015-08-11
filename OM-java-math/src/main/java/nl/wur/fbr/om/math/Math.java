package nl.wur.fbr.om.math;

/**
 * This class provides static access to mathematical operators which can handle measures and points on a measurement
 * scale. The actual mathematical processing should be done in implementations of {@link MathProcessor}. An instance of
 * a {@link MathProcessor} needs to be provided with {@link #setMathProcessor(MathProcessor)}.
 * @author Don Willems on 11/08/15.
 */
public class Math {

    /** The math processor used in the calculations. */
    private static MathProcessor processor;

    /**
     * Returns the math processor currently used when performing mathematical operations on measures or points on a
     * measurement scale.
     * @return The math processor.
     */
    public static MathProcessor getMathProcessor(){
        return processor;
    }

    /**
     * Sets the math processor to be used when performing mathematical operations on measures or points on a
     * measurement scale.
     * @param mathProcessor The math processor.
     */
    public static void setMathProcessor(MathProcessor mathProcessor){
        Math.processor = mathProcessor;
    }
}
