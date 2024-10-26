package main.java;


import main.java.delta.StudentSerializable;
import main.java.stream.Serialization;
import main.java.utils.impl.ConfigFileReader;
import main.java.utils.interfaces.IServiceUtils;

public class Main {
    static public void main(String[] args) {
        String outputPath = IServiceUtils.getPath();
        Serialization serialization = new Serialization();
        StudentSerializable s = new StudentSerializable(123, "Rakesh", "First");
        try {
            serialization.write(s, outputPath);
            serialization.read(outputPath);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

/**
 * literals with same value refer to same memory address in pool
 * String is immutable, any operation performed returns new string stored in heap
 * String.valueOf() returns string of any datatype passed as param
 */