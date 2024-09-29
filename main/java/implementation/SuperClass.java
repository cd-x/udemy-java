package main.java.implementation;

public interface SuperClass {
    public abstract void display();
    public void add(int x, int y);
    public static void pingMe(){
        System.out.println("SuperClass::pingMe()");
    }
}
