package nl.wur.fbr.om.model;

/**
 * This enumeration specifies the common unit prefixes used for the metric system,
 * e.g. kilometre (km) with prefix {@link #KILO KILO}, centimetre (cm) with prefix {@link #CENTI CENTI},
 * and nanometer (nm) with prefix {@link #NANO NANO}.
 * @author Don Willems on 15/07/15.
 */
public enum UnitPrefix {
    /**
     * The tera prefix with a multiplication factor of 1e12.
     */
    TERA ("T",1e12),

    /**
     * The giga prefix with a multiplication factor of 1e9.
     */
    GIGA ("G",1e9),

    /**
     * The mega prefix with a multiplication factor of 1e6.
     */
    MEGA ("M",1e6),

    /**
     * The kilo prefix with a multiplication factor of 1000.
     */
    KILO ("k",1e3),

    /**
     * The hecto prefix with a multiplication factor of 100.
     */
    HECTO ("h",1e2),

    /**
     * The deca prefix with a multiplication factor of 10.
     */
    DECA ("da",1e1),

    /**
     * The dexi prefix with a multiplication factor of 0.1.
     */
    DECI ("d",1e-1),

    /**
     * The centi prefix with a multiplication factor of 0.01.
     */
    CENTI ("c",1e-2),

    /**
     * The milli prefix with a multiplication factor of 0.001.
     */
    MILLI ("m",1e-3),

    /**
     * The micro prefix with a multiplication factor of 1e-6.
     */
    MICRO ("μ",1e-6),

    /**
     * The nano prefix with a multiplication factor of 1e-9.
     */
    NANO ("n",1e-9),

    /**
     * The pico prefix with a multiplication factor of 1e-12.
     */
    PICO ("p",1e-12);

    /** The prefix multiplication factor. */
    private final double prefixFactor;

    /** The symbol used for the prefix. */
    private final String prefixSymbol;

    /**
     * Creates the prefix with the specified symbol and multiplication factor.
     * For instance, for the unit kilometre (km), the prefix is 'kilo', the symbol is 'k' and the multiplication factor
     * is 1000.
     * @param symbol The prefix symbol.
     * @param factor The multiplication factor.
     */
    UnitPrefix(String symbol, double factor){
        this.prefixFactor = factor;
        this.prefixSymbol = symbol;
    }

    /**
     * Returns the name of the prefix (all lower case characters).
     * @return The name of the prefix.
     */
    public String getPrefixName(){
        return this.toString().toLowerCase();
    }

    /**
     * Returns the symbol for the prefix. The prefix KILO has, for instance, the symbol 'k'.
     * @return The prefix symbol.
     */
    public String getPrefixSymbol(){
        return prefixSymbol;
    }

    /**
     * Returns the multiplication factor for the prefix. The prefix KILO has, for instance the multiplication factor
     * 1000.
     * @return The multiplication factor.
     */
    public double getPrefixFactor(){
        return prefixFactor;
    }
}
