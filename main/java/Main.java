package main.java;

import main.java.generics.GenericMethods;

public class Main {
    static public void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.display(123);
        gm.display("hello");
    }
}