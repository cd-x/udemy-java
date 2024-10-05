package main.java.threading;

public class Second implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<100;i++) {
            System.out.println("Second::run()");
        }
    }
}
