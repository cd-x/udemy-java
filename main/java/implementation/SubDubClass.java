package main.java.implementation;

public class SubDubClass extends SuperDuperClass{
    public void display(){
        SuperDuperClass sd = new SuperDuperClass();
        System.out.println("x: "+sd.z_public);
    }

    public void changeIt(int x, int y){
        x=10;
    }
}
