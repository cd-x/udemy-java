package main.java;


import main.java.utils.impl.ConfigFileReader;

public class Main {
    static public void main(String[] args) {
        String outputPath = ConfigFileReader.getProperty("targetPath");

    }
}

/**
 * literals with same value refer to same memory address in pool
 * String is immutable, any operation performed returns new string stored in heap
 * String.valueOf() returns string of any datatype passed as param
 */