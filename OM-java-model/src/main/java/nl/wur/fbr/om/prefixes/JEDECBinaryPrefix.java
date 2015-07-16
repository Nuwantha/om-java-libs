package nl.wur.fbr.om.prefixes;

/**
 * This enumeration specifies the binary prefixes used according to the microelectronics industry standards body (JEDEC),
 * e.g. kilobyte (KB) with prefix {@link #KILO KILO}, zettabyte (ZB) with prefix {@link #ZETTA ZETTA},
 * and gigabyte (GB) with prefix {@link #GIGA GIGA}. These prefixes use a binary base, i.e. 1 KB = 1024 bytes and
 * 1 MB = 1024^2 = 1,048,576 bytes.
 *
 * The use of these prefixes is, however deprecated.  The International Electrotechnical Commission (IEC)
 * defines the common usages of the prefixes of kilobyte, megabyte and gigabyte,
 * as a decimal prefix (use {@link DecimalPrefix DecimalPrefix}), i.e. a kilobyte is 1000 bytes, where a kibibyte is 1024 bytes.
 * Binary prefixes are defined by the IEC with different names. The JEDEC kilobyte is equal to IEC kibibyte.
 * The IEC prefixes are preferred (use {@link BinaryPrefix BinaryPrefix}.
 *
 * @author Don Willems on 16/07/15.
 */
public enum JEDECBinaryPrefix implements Prefix {

    /**
     * The yotta prefix with a multiplication factor of 1e24.
     */
    YOTTA ("Y",8),

    /**
     * The zetta prefix with a multiplication factor of 1e21.
     */
    ZETTA ("Z",7),

    /**
     * The exa prefix with a multiplication factor of 1e18.
     */
    EXA ("E",6),

    /**
     * The peta prefix with a multiplication factor of 1e15.
     */
    PETA ("P",5),

    /**
     * The tera prefix with a multiplication factor of 1e12.
     */
    TERA ("T",4),

    /**
     * The giga prefix with a multiplication factor of 1e9.
     */
    GIGA ("G",3),

    /**
     * The mega prefix with a multiplication factor of 1e6.
     */
    MEGA ("M",2),

    /**
     * The kilo prefix with a multiplication factor of 1000.
     */
    KILO ("K",1);

    /** The prefix multiplication factor. */
    private final double prefixFactor;

    /** The symbol used for the prefix. */
    private final String prefixSymbol;

    /**
     * Creates the prefix with the specified symbol and exponent specifying the multiplication factor.
     * The multiplication factor is equal to 1024^e, where e is the exponent.
     * For instance, for the unit kilobyte (KB), the prefix is 'kilo', the symbol is 'K' and the multiplication factor
     * is 1024.
     * @param prefixSymbol The prefix symbol.
     * @param exponent The multiplication factor.
     */
    JEDECBinaryPrefix(String prefixSymbol, int exponent){
        this.prefixFactor = Math.pow(1024,exponent);
        this.prefixSymbol = prefixSymbol;
    }

    /**
     * Returns the name of the prefix (all lower case characters).
     * @return The name of the prefix.
     */
    public String getName(){
        return this.toString().toLowerCase();
    }

    /**
     * Returns the symbol for the prefix. The prefix KILO has, for instance, the symbol 'K'.
     * @return The prefix symbol.
     */
    public String getSymbol(){
        return prefixSymbol;
    }

    /**
     * Returns the multiplication factor for the prefix. The prefix KILO has, for instance the multiplication factor
     * 1024.
     * @return The multiplication factor.
     */
    public double getFactor(){
        return prefixFactor;
    }
}
