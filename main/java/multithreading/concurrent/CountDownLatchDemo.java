package main.java.multithreading.concurrent;

import org.example.learn.multithreading.utils.CountDownTask;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException{
        CountDownLatch latch = new CountDownLatch(2);
        Thread t1 = new Thread(new CountDownTask("Repair", 1000, latch));
        Thread t2 = new Thread(new CountDownTask("Oil change", 2000, latch));
        t1.start(); t2.start();
        latch.await();
    }
}
