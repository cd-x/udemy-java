package main.java;

import main.java.generics.Array;
import main.java.generics.GenericMethods;

public class Main {
    static public void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        Array<Integer> integerArray = new Array<>();
        integerArray.add(1);
        integerArray.add(23);
        integerArray.add(11);
        Array<String> stringArray = new Array<>();
        stringArray.add("Hello");
        stringArray.add("world");
        stringArray.add("welcome");
        gm.display(integerArray);
        gm.display(stringArray);
    }
}