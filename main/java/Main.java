package main.java;

import main.java.threading.First;
import main.java.threading.Second;

public class Main {
    static public void main(String[] args) {
        Thread t1 = new First();
        Thread t2 = new Thread(new Second(),"Second Thread");
        t1.start();
        t2.start();
    }
}

/**
 * literals with same value refer to same memory address in pool
 * String is immutable, any operation performed returns new string stored in heap
 * String.valueOf() returns string of any datatype passed as param
 */