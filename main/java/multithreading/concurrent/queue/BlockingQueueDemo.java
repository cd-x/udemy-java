package main.java.multithreading.concurrent.queue;

import org.example.learn.multithreading.utils.Consumer;
import org.example.learn.multithreading.utils.Producer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;

public class BlockingQueueDemo {
    private final int MAX_CAPACITY = 3;
    public static void main(String[] args) {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(3);
        new Thread(new Producer(bq)).start();
        new Thread(new Consumer(bq)).start();
    }
}
