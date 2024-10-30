package main.java.generics;

public class GenericMethods {
    public <T> void display(T obj) {
        System.out.println("GenericMethods::display() :" + obj);
    }
}
