package main.java.threading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class MyData {
    private int val = 0;
    private boolean isAvaialable = false;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition producerLock = lock.newCondition();
    private final Condition consumerLock = lock.newCondition();
    synchronized public void set(int val){
        lock.lock();
        try {
            while(isAvaialable){
                try {
                    producerLock.await();
                }catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
            this.val = val;
            System.out.printf("MyData::set() produced: %d\n",val);
            isAvaialable = true;
            consumerLock.signal();
        }finally {
            lock.unlock();
        }

    }
    synchronized public void get(){
        lock.lock();
        try {
            while(!isAvaialable){
                try {
                    consumerLock.await();
                }catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
            System.out.printf("Mydata::get() consumed: %d\n", val);
            isAvaialable = false;
            producerLock.signal();
        }finally {
            lock.unlock();
        }
    }
}
