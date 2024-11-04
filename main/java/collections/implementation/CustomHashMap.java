package main.java.collections.implementation;

import main.java.collections.interfaces.IMap;

import java.util.LinkedList;

public class CustomHashMap<K, V> implements IMap<K, V> {
    private Integer size = 0;
    private Integer TABLE_SIZE = 0;
    private final Integer DEFAULT_TABLE_SIZE = 16;
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

    private LinkedList<Node>[] hashTable;

    public CustomHashMap() {
        hashTable = new LinkedList[DEFAULT_TABLE_SIZE];
        TABLE_SIZE = DEFAULT_TABLE_SIZE;
    }

    public CustomHashMap(int initCap, float loadFactor) {
        hashTable = new LinkedList[initCap];
        TABLE_SIZE = initCap;
        this.loadFactor = loadFactor;
    }

    @Override
    public V get(K key) {
        for (Node node : hashTable[bucketIndex(key)]) {
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
        safeAppend(hashTable, new Node(getHash(key), key, value));
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

    private int bucketIndex(int hash) {
        return hash & (TABLE_SIZE - 1);
    }

    private void safeAppend(LinkedList<Node>[] hashTable, Node node) {
        int bktIndex = bucketIndex(node.hash);
        if (hashTable[bktIndex] == null) {
            hashTable[bktIndex] = new LinkedList<>();
        }
        hashTable[bktIndex].addLast(node);
    }

    private LinkedList<Node>[] resizeTable(LinkedList<Node>[] hashTable, Integer newSize) {
        LinkedList<Node>[] newHashTable = new LinkedList[newSize];
        TABLE_SIZE = newSize;
        for (LinkedList<Node> bucket : hashTable) {
            for (Node node : bucket) {
                safeAppend(newHashTable, node);
            }
        }
        return newHashTable;
    }
}
