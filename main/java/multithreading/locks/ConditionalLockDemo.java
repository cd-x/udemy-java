package main.java.multithreading.locks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionalLockDemo {
    private static final Lock lock = new ReentrantLock();
    private static final Condition computed = lock.newCondition();

    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();
        new Thread(() ->{
            System.out.println("Executing first thread");
            lock.lock();
            if(list.isEmpty()) {
                try {
                    computed.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Computed value: "+ list);
            lock.unlock();
        }).start();

        new Thread(() ->{
            System.out.println("Computing...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock.lock();
            list.add(4);
            computed.signal();
            lock.unlock();
        }).start();
    }
}
