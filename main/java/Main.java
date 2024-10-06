package main.java;

import main.java.threading.Display;
import main.java.threading.First;
import main.java.threading.Second;

public class Main {
    static public void main(String[] args) {
        Display d = new Display();
        First t1 = new First(d);
        Second t2 = new Second(d);
        t1.start();
        t2.start();
    }
}

/**
 * literals with same value refer to same memory address in pool
 * String is immutable, any operation performed returns new string stored in heap
 * String.valueOf() returns string of any datatype passed as param
 */