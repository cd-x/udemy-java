package main.java;

import main.java.ExceptionHandling.DivideByZero;
import main.java.collections.implementation.Stack;
import main.java.collections.interfaces.IStack;
import main.java.implementation.DemoInnerClass;
import main.java.implementation.DummyAutoCloseable;
import main.java.implementation.SubClass;
import main.java.implementation.SuperClass;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    //static FileInputStream fi;
    static public void main(String[] args) {
        IStack st = new Stack(2);
        try{
            st.push(1);
            st.push(2);
            st.push(3);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

/**
 * literals with same value refer to same memory address in pool
 * String is immutable, any operation performed returns new string stored in heap
 * String.valueOf() returns string of any datatype passed as param
 */