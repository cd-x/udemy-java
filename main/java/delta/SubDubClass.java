package main.java.delta;

import main.java.implementation.SuperDuperClass;

public class SubDubClass extends SuperDuperClass {
    public void display(){
        SuperDuperClass sd = new SuperDuperClass();
        System.out.println("z: "+sd.z_public);
    }
}
