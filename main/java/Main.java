package main.java;

import main.java.ExceptionHandling.DivideByZero;
import main.java.implementation.DemoInnerClass;
import main.java.implementation.DummyAutoCloseable;
import main.java.implementation.SubClass;
import main.java.implementation.SuperClass;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    //static FileInputStream fi;
    static public void main(String[] args) {
        try(
                //FileInputStream fi = new FileInputStream("/user/downloads");
                //Scanner sc = new Scanner(System.in);
                DummyAutoCloseable da = new DummyAutoCloseable();
                ){
            da.toString();
        }
        catch (Exception e){}
    }
}

/**
 * literals with same value refer to same memory address in pool
 * String is immutable, any operation performed returns new string stored in heap
 * String.valueOf() returns string of any datatype passed as param
 */