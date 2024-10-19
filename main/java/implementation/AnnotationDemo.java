package main.java.implementation;

import main.java.annotations.CustomAnnotation;

public class AnnotationDemo {
    @CustomAnnotation(annotationVersion = "2.3")
    public void show(){
        System.out.println("Welcome to annotations");
    }
}
