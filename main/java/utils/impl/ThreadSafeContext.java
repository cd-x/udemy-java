package main.java.utils.impl;

import main.java.utils.interfaces.IContext;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeContext<K, V> implements IContext<K, V> {
    private Map<K, V> map;

    public ThreadSafeContext() {
        map = new ConcurrentHashMap<>();
    }

    @Override
    public void setValue(K key, V value) {
        map.put(key, value);
    }

    @Override
    public V getValue(K key) {
        return map.getOrDefault(key, null);
    }
}
