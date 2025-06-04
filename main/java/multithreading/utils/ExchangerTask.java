package main.java.multithreading.utils;

import java.util.concurrent.Exchanger;

public class ExchangerTask implements Runnable{
    private final Exchanger<Integer> exchanger;
    private final int id;
    private final long duration;

    public ExchangerTask(Exchanger<Integer> exchanger, int id, long duration) {
        this.exchanger = exchanger;
        this.id = id;
        this.duration  = duration;
    }

    @Override
    public void run() {
        System.out.println("simulatiion for task #"+ id);
        try {
            Thread.sleep(duration);
            int received =  exchanger.exchange(id);
            System.out.println("Thread "+Thread.currentThread().getName() + " received "+ received);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
