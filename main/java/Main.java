package main.java;


import main.java.annotations.CustomAnnotation;
import main.java.implementation.AnnotationDemo;

import java.lang.annotation.Annotation;

public class Main {
    static public void main(String[] args) {
        AnnotationDemo ad = new AnnotationDemo();
        try {
            CustomAnnotation customAnnotation = ad.getClass().getMethod("show").getAnnotation(CustomAnnotation.class);
            System.out.printf("Author: %s, Version: %s", customAnnotation.name(), customAnnotation.annotationVersion());
        }catch (NoSuchMethodException nse){
            nse.printStackTrace();
        }

    }
}

/**
 * literals with same value refer to same memory address in pool
 * String is immutable, any operation performed returns new string stored in heap
 * String.valueOf() returns string of any datatype passed as param
 */