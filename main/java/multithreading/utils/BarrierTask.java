package main.java.multithreading.utils;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarrierTask implements Runnable{
    private final CyclicBarrier barrier;
    private final int id;
    private final int stages;
    public BarrierTask(CyclicBarrier barrier, int taskId, int stages) {
        this.barrier = barrier;
        this.id = taskId;
        this.stages = stages;
    }

    @Override
    public void run(){
        for(int i=0;i<stages;i++){
            try {
                Thread.sleep(2000);
                System.out.println("Stage: "+ i+ " Task #"+id + " is completed.");
            } catch (InterruptedException  e) {
                throw new RuntimeException(e);
            }
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
