package main.java.multithreading.concurrent;

import org.example.learn.multithreading.utils.BarrierTask;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    private static final int PARTIES = 3;
    private static final int STAGES = 5;
    private static final CyclicBarrier barrier = new CyclicBarrier(PARTIES, () ->{
        System.out.println("barrier has tripped.");
    });

    public static void main(String[] args) {
        for(int i=0;i<PARTIES;i++){
            new Thread(new BarrierTask(barrier, i, STAGES)).start();
        }
        System.out.println("Waiting for "+ barrier.getNumberWaiting() + " threads");
    }
}
