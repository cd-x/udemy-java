package main.java;


import main.java.delta.Student;
import main.java.stream.DataStreamDemo;

public class Main {
    static public void main(String[] args) {
        DataStreamDemo ds = new DataStreamDemo();
        Student s = new Student();
        s.setRollNumber(123);
        s.setName("Rakesh");
        s.setDept("ECD");
        try {
            ds.write(s);
            ds.read();
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