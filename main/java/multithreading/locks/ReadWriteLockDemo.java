package main.java.multithreading.locks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    private static final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    private static final Lock readLock = rwLock.readLock();
    private static final Lock writeLock = rwLock.writeLock();

    private static final List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        for(int i=0;i<2;i++){
            new Thread(() ->{
               for(int j=0;j<10;j++){
                   readLock.lock();
                   try {
                       Thread.sleep(1500);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   System.out.println(Thread.currentThread().getName() + " reading");
                   System.out.println("SharedResource: "+ list);
                   readLock.unlock();
               }
            }, "Reader").start();
        }

        for(int i=0;i<2;i++){
            new Thread(() ->{
                for(int j=0;j<2;j++){
                    writeLock.lock();
                    System.out.println(Thread.currentThread().getName() + " writing to shared list.");
                    list.add(12);
                    writeLock.unlock();
                }
            }, "Writer").start();
        }
    }
}
