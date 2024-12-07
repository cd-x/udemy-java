package main.java.utils.interfaces;

public interface IContext<K, V> {
    public void setValue(K key, V value);

    public V getValue(K key);
}
