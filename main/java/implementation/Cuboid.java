package main.java.implementation;

import main.java.interfaces.IShape;

public class Cuboid implements IShape {
    int l,b,h;
    public void Cuboid(int l, int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    @Override
    public String getShape() {
        return "Cuboid";
    }

    @Override
    public double getArea() {
        return 0;
    }
}
