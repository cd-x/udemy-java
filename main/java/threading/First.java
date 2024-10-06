package main.java.threading;

public class First extends Thread{
    @Override
    public void run(){
        while(!currentThread().isInterrupted()) {
            System.out.println("First::run()");
        }
    }
}
