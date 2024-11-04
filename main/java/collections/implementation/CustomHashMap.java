package main.java.collections.implementation;

import main.java.collections.interfaces.IMap;

import java.util.LinkedList;
import java.util.Vector;

public class CustomHashMap<K, V> implements IMap<K, V> {
    private Integer size = 0;
    private Integer TABLE_SIZE = 0;
    private float loadFactor = 0.75f;

    private final class Node {
        int hash;
        K key;
        V value;

        Node(int hash, K key, V value) {
            this.hash = hash;
            this.value = value;
            this.key = key;
        }
    }

    private Vector<LinkedList<Node>> hashTable;

    public CustomHashMap() {
        TABLE_SIZE = 16;
    }

    public CustomHashMap(int initCap, float loadFactor) {
        hashTable = new Vector<>(initCap);
        TABLE_SIZE = initCap;
        this.loadFactor = loadFactor;
    }

    @Override
    public V get(K key) {
        for (Node node : hashTable.get(bucketIndex(key))) {
            if (node.hash == getHash(key)) {
                return node.value;
            }
        }
        return null;
    }

    @Override
    public void put(K key, V value) {
        if (size >= loadFactor * TABLE_SIZE) {
            hashTable = resizeTable(hashTable, 2 * TABLE_SIZE);
        }
        hashTable.get(bucketIndex(key)).addLast(new Node(getHash(key), key, value));
        size++;
    }

    public Integer getSize() {
        return size;
    }

    private int getHash(K key) {
        return key.hashCode() ^ (key.hashCode() >>> 16);
    }

    private int bucketIndex(K key) {
        return getHash(key) & (TABLE_SIZE - 1);
    }

    private int rehashBucketIndex(int hash) {
        return hash & (TABLE_SIZE - 1);
    }

    private Vector<LinkedList<Node>> resizeTable(Vector<LinkedList<Node>> hashTable, Integer newSize) {
        Vector<LinkedList<Node>> newHashTable = new Vector<>(newSize);
        TABLE_SIZE = newSize;
        for (LinkedList<Node> bucket : hashTable) {
            for (Node node : bucket) {
                newHashTable.get(rehashBucketIndex(node.hash)).addLast(node);
            }
        }
        return newHashTable;
    }
}
