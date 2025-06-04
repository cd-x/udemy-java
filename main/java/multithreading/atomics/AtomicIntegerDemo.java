package main.java.multithreading.atomics;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
    private static final AtomicInteger val = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->{
            for(int i=0; i<1000;i++){
                val.incrementAndGet();
            }
        }, "thread A");

        Thread t2 = new Thread(() ->{
            for(int i=0; i<1000;i++){
                val.incrementAndGet();
            }
        }, "thread B");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Val is: "+val.get());
    }
}
