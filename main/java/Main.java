package main.java;

import main.java.threading.*;

public class Main {
    static public void main(String[] args) {
        MyData d = new MyData();
        Producer p1 = new Producer(d);
        Producer p2 = new Producer(d);
        Producer p3 = new Producer(d);
        Consumer c1 = new Consumer(d);
        Consumer c2 = new Consumer(d);
        Consumer c3 = new Consumer(d);
        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
        c3.start();
        try{
            p1.join();
            p2.join();
            p3.join();
            c1.join();
            c2.join();
            c3.join();
        }catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

/**
 * literals with same value refer to same memory address in pool
 * String is immutable, any operation performed returns new string stored in heap
 * String.valueOf() returns string of any datatype passed as param
 */