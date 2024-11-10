package main.java;


import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    static public void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(3, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry e) {
                return size() > 3;
            }
        };
        linkedHashMap.put(23, "Hello");
        linkedHashMap.put(46, "world");
        linkedHashMap.put(1, "first");
        linkedHashMap.put(2, "second");
        linkedHashMap.get(46);
        System.out.println(linkedHashMap);
    }
}