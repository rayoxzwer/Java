package csci235;

/**
 * A generic map
 * @param <K, V>
 */

public interface Map<K, V> {
    
    /**
     * Adds the given key-value pair to the map.  If the key is
     * already in the map, the new pair replaces the old, and the
     * previous associated value is returned; otherwise null is
     * returned.  Key equality is checked using equals().
     *
     * @param key of the key-value pair to be added
     * @param value of the key-value pair to be added
     * @return the previous value associated with the given key, or
     *    null if the key was not present
     */
    public V put(K key, V value);

    /**
     * Returns the value associated with the given key in the map, or
     * null if the key is not present.  Key equality is checked using
     * equals().
     *
     * @param key whose associated value we are looking up
     * @return the value associated with the given key, or null
     *    if the key is not present
     */
    public V get(K key);

    /**
     * Returns true if the given key occurs in a key-value pair in the
     * map.  Key equality is checked using equals().
     *
     * @param key that we are looking for in the map
     * @return true iff the key occurs in the map
     */
    public boolean containsKey(K key);

    /**
     * @return the number of key-value pairs in the map.
     */
    public int size();
    
    /**
     * Removes all key-value pairs from the map.
     */
    public void clear();

}

