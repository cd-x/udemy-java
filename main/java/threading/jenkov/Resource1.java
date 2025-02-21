package main.java.threading.jenkov;

public class Resource1 {
    private static int counter = 0;
    public static void increment(){
        synchronized (Resource1.class){
            counter++;
        }
    }
    public static void display(){
        System.out.println("Counter: "+counter);
    }

    public static int getCounter(){
        return counter;
    }
}
