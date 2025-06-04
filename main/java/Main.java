package main.java;


import main.java.collections.implementation.VolatileTest;
import main.java.threading.jenkov.SynchronizeTest;
import main.java.threading.jenkov.VirtualThread;

import java.io.IOException;

public class Main {
    static public void main(String[] args) throws IOException, InterruptedException {
        VolatileTest volatileTest = new VolatileTest();
        Runnable r = () -> {
            for (int i = 1; i <= 10000; i++){
                volatileTest.update();
            }
            System.out.println(volatileTest.getCount());
        };
        Thread t1 = new Thread(r, "t1");
        Thread t2 = new Thread(r, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}