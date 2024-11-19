package main.java;


import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Main {
    static public void main(String[] args) {
        Hashtable<Integer, String> hash = new Hashtable<>();
        hash.put(1, "one");
        hash.put(1, "oneagain");
        hash.put(2, "two");
        Set<Map.Entry<Integer, String>> entries = hash.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.toString());
        }
    }
}