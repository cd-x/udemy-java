package main.java;

import main.java.implementation.DemoInnerClass;
import main.java.implementation.SubClass;
import main.java.implementation.SuperClass;

public class Main {
    public static void main(String[] args) throws Exception {
        DemoInnerClass.Inner inner = new DemoInnerClass().new Inner();
        inner.innerDisplay();
    }
}

/**
 * literals with same value refer to same memory address in pool
 * String is immutable, any operation performed returns new string stored in heap
 * String.valueOf() returns string of any datatype passed as param
 */