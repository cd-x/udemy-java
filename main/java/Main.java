package main.java;

import main.java.exploreLang.Wrapper;
import main.java.implementation.Dept;
import main.java.threading.*;

public class Main {
    static public void main(String[] args) {
        Dept d = Dept.valueOf("MCA");
        System.out.println(d.ordinal()+ " Head->"+ d.getHead()+" location ->"+ d.getLocation());
    }
}

/**
 * literals with same value refer to same memory address in pool
 * String is immutable, any operation performed returns new string stored in heap
 * String.valueOf() returns string of any datatype passed as param
 */