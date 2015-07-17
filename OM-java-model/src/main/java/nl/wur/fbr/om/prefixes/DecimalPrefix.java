package nl.wur.fbr.om.prefixes;

/**
 * This enumeration specifies the common unit (SI) prefixes used for the metric system,
 * e.g. kilometre (km) with prefix {@link #KILO KILO}, centimetre (cm) with prefix {@link #CENTI CENTI},
 * and nanometer (nm) with prefix {@link #NANO NANO}.
 * @author Don Willems on 15/07/15.
 */
public enum DecimalPrefix implements Prefix{
    /**
     * The yotta prefix with a multiplication factor of 1e24.
     */
    YOTTA ("Y",24),

    /**
     * The zetta prefix with a multiplication factor of 1e21.
     */
    ZETTA ("Z",21),

    /**
     * The exa prefix with a multiplication factor of 1e18.
     */
    EXA ("E",18),

    /**
     * The peta prefix with a multiplication factor of 1e15.
     */
    PETA ("P",15),

    /**
     * The tera prefix with a multiplication factor of 1e12.
     */
    TERA ("T",12),

    /**
     * The giga prefix with a multiplication factor of 1e9.
     */
    GIGA ("G",9),

    /**
     * The mega prefix with a multiplication factor of 1e6.
     */
    MEGA ("M",6),

    /**
     * The kilo prefix with a multiplication factor of 1000.
     */
    KILO ("k",3),

    /**
     * The hecto prefix with a multiplication factor of 100.
     */
    HECTO ("h",2),

    /**
     * The deca prefix with a multiplication factor of 10.
     */
    DECA ("da",1),

    /**
     * The dexi prefix with a multiplication factor of 0.1.
     */
    DECI ("d",-1),

    /**
     * The centi prefix with a multiplication factor of 0.01.
     */
    CENTI ("c",-2),

    /**
     * The milli prefix with a multiplication factor of 0.001.
     */
    MILLI ("m",-3),

    /**
     * The micro prefix with a multiplication factor of 1e-6.
     */
    MICRO ("μ",-6),

    /**
     * The nano prefix with a multiplication factor of 1e-9.
     */
    NANO ("n",-9),

    /**
     * The pico prefix with a multiplication factor of 1e-12.
     */
    PICO ("p",-12),

    /**
     * The femto prefix with a multiplication factor of 1e-15.
     */
    FEMTO ("f",-15),

    /**
     * The atto prefix with a multiplication factor of 1e-18.
     */
    ATTO ("a",-18),

    /**
     * The zepto prefix with a multiplication factor of 1e-21.
     */
    ZEPTO ("z",-21),

    /**
     * The yocta prefix with a multiplication factor of 1e-24.
     */
    YOCTA ("y",-24);

    /** The prefix multiplication factor. */
    private final double prefixFactor;

    /** The symbol used for the prefix. */
    private final String prefixSymbol;

    /**
     * Creates the prefix with the specified symbol and multiplication factor that is equal to 10^exponent.
     * For instance, for the unit kilometre (km), the prefix is 'kilo', the symbol is 'k' and the multiplication factor
     * is 1000 and the exponent = 3.
     * @param symbol The prefix symbol.
     * @param exponent The multiplication factor exponent.
     */
    DecimalPrefix(String symbol, int exponent){
        this.prefixFactor = Math.pow(10,exponent);
        this.prefixSymbol = symbol;
    }

    /**
     * Returns the name of the prefix (all lower case characters).
     * @return The name of the prefix.
     */
    public String getName(){
        return this.toString().toLowerCase();
    }

    /**
     * Returns the symbol for the prefix. The prefix KILO has, for instance, the symbol 'k'.
     * @return The prefix symbol.
     */
    public String getSymbol(){
        return prefixSymbol;
    }

    /**
     * Returns the multiplication factor for the prefix. The prefix KILO has, for instance the multiplication factor
     * 1000.
     * @return The multiplication factor.
     */
    public double getFactor(){
        return prefixFactor;
    }
}
