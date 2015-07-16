package nl.wur.fbr.om.prefixes;

/**
 * This enumeration specifies the binary prefixes used according to the International Electrotechnical Commission (IEC),
 * e.g. kibibyte (KiB) with prefix {@link #KIBI KIBI}, zebibyte (ZiB) with prefix {@link #ZEBI ZEBI},
 * and gibibyte (GiB) with prefix {@link #GIBI GIBI}. These prefixes use a binary base, i.e. 1 KiB = 1024 bytes and
 * 1 MiB = 1024^2 = 1,048,576 bytes.
 *
 * The IEC defines the common usages of the prefixes of kilobyte, megabyte and gigabyte,
 * as a decimal prefix (use {@link DecimalPrefix DecimalPrefix}), i.e. a kilobyte is 1000 bytes, where a kibibyte is 1024 bytes.
 *
 * The kilobyte is, however, sometimes defined as 1024 bytes (and the megabyte as 1024^2 bytes), this use is defined in
 * by the microelectronics industry standards body JEDEC, but is deprecated (use {@link JEDECBinaryPrefix JEDECBinaryPrefix}).
 *
 * @author Don Willems on 16/07/15.
 */
public enum BinaryPrefix implements Prefix {
    /**
     * The yobi prefix with a multiplication factor of 1024^8.
     */
    YOBI ("Yi",8),

    /**
     * The zebi prefix with a multiplication factor of 1024^7.
     */
    ZEBI ("Zi",7),

    /**
     * The exbi prefix with a multiplication factor of 1024^6.
     */
    EXBI ("Ei",6),

    /**
     * The pebi prefix with a multiplication factor of 1024^5.
     */
    PEBI ("Pi",5),

    /**
     * The tebi prefix with a multiplication factor of 1024^4.
     */
    TEBI ("Ti",4),

    /**
     * The gibi prefix with a multiplication factor of 1024^3.
     */
    GIBI ("Gi",3),

    /**
     * The mebi prefix with a multiplication factor of 1024^2.
     */
    MEBI ("Mi",2),

    /**
     * The kibi prefix with a multiplication factor of 1024.
     */
    KIBI ("Ki",1);

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
    BinaryPrefix(String prefixSymbol, int exponent){
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
