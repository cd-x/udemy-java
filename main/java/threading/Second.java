package main.java.threading;

public class Second implements Runnable{
    @Override
    public void run(){
        while (!Thread.currentThread().isInterrupted()){
            System.out.println("Second::run(), name: "+ Thread.currentThread().getName());
        }
    }
}
