package main.java;

import main.java.exploreLang.Wrapper;
import main.java.threading.*;

public class Main {
    static public void main(String[] args) {
        String s = "Hello";
        StringBuffer sb = new StringBuffer("Hello");
        sb.chars();
        StringBuilder sbl = new StringBuilder("builder");
        System.out.println(sb);
    }
}

/**
 * literals with same value refer to same memory address in pool
 * String is immutable, any operation performed returns new string stored in heap
 * String.valueOf() returns string of any datatype passed as param
 */