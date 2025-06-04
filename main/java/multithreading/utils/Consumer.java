package main.java.multithreading.utils;


import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private final BlockingQueue<Integer> bq;

    public Consumer(BlockingQueue<Integer> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(5000);
                Integer val = bq.take();
                System.out.println("Consumed val: "+ val);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
