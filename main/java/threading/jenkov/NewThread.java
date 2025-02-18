package main.java.threading.jenkov;

public class NewThread {
    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("MyRunnable running");
        }
    }
    public static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("MyThread Running!");
        }
    }
}
