package main.java.generics;

public class GenericMethods {
    public <T> void display(Array<? extends Number> obj) {
        obj.print();
    }
}
