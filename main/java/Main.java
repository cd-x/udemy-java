package main.java;


import main.java.annotations.CustomAnnotation;
import main.java.implementation.AnnotationDemo;
import main.java.interfaces.LambdaInterface;

import java.lang.annotation.Annotation;

public class Main {
    static public void main(String[] args) {
        LambdaInterface l = () -> {
                System.out.println("This is lambda method");
        };
        l.display();
    }
}

/**
 * literals with same value refer to same memory address in pool
 * String is immutable, any operation performed returns new string stored in heap
 * String.valueOf() returns string of any datatype passed as param
 */