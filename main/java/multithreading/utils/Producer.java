package main.java.multithreading.utils;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    private final BlockingQueue<Integer> bq;

    public Producer(BlockingQueue<Integer> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        try {
            for(int i=0;i<10;i++){
                Thread.sleep(1000);
                bq.put(i);
                System.out.println("added to the queue: "+ i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
