package main.java.implementation;

public class SubClass implements SuperClass{
    public void showMe(){
        System.out.println("SubClass::showMe()");
    }
    public int add(int x, int y, int z){
        System.out.println("SubClass::add()");
        return x+y+z;
    }
    public int add(int...x){
        System.out.println("SubClass::add([...args])");
        return 0;
    }

    @Override
    public void display() {
        System.out.println("SubClass::display()");
    }
    @Override
    public void add(int x, int y){
        System.out.println("SubClass::add()");
    }
}
