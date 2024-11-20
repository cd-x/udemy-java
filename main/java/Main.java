package main.java;


import java.util.BitSet;

public class Main {
    static public void main(String[] args) {
        BitSet b1 = new BitSet();
        b1.set(0, true);
        b1.set(2, true);
        BitSet b2 = new BitSet(16);
        b2.set(1, true);
        System.out.println(b1);
        System.out.println(b2);
        b2.or(b1);
        System.out.println();
    }
}