package main.java.collections.interfaces;

public interface IMap<K, V> {
    public V get(K key);

    public void put(K key, V value);
}
