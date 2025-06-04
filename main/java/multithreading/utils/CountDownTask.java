package main.java.multithreading.utils;

import java.util.concurrent.CountDownLatch;

public class CountDownTask implements Runnable{
    private final String service;
    private final long duration;
    private final CountDownLatch countDownLatch;

    public CountDownTask(String service, long duration, CountDownLatch countDownLatch) {
        this.service = service;
        this.duration = duration;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Task: "+ service+ " is under execution.");
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            countDownLatch.countDown();
        }
        System.out.println("Task: "+ service+ " is completed.");
    }
}
