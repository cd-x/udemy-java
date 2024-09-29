package main.java.implementation;
import main.java.constants.Constants;
public class Cylinder {
    private double radius;
    private double height;
    public double getLidArea(){
        return 2*Constants.PI*radius*radius;
    }
    public double getTotalSurfaceArea(){
        return 2*Constants.PI*radius*(radius + height);
    }
    public double getCircumference(){
        return 2*Constants.PI*radius;
    }
    public double getVolume(){
        return Constants.PI*radius*radius*height;
    }
}
