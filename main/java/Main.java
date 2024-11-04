package main.java;


import main.java.collections.implementation.CustomHashMap;
import main.java.collections.interfaces.IMap;

public class Main {
    static public void main(String[] args) {
        IMap<String, String> map = new CustomHashMap<>();
        map.put("name", "rajrishi");
        map.put("place", "Gurugram");
        map.put("college", "NITT");
        System.out.println(map.get("college"));
    }
}