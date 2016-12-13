package nl.wur.fbr.util;

/**
 * Same functionality as the <code>javax.util.Pair</code> class, which has been deprecated.
 *
 * @author Don Willems on 13/12/2016.
 */
public class Pair<K,V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
