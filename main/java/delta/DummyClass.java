package main.java.delta;

import main.java.implementation.SuperDuperClass;

public class DummyClass {
    public int x;

    public void display() {
        SuperDuperClass sd = new SuperDuperClass();
        System.out.println("z: " + sd.z_public);
    }

    @Override
    public String toString() {
        return "DummyClass{" + "x=" + x + '}';
    }
}
