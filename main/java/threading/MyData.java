package main.java.threading;

public class MyData {
    private int val = 0;
    synchronized public void set(int val){
        this.val = val;
    }
    synchronized public int get(){
        return val;
    }
}
