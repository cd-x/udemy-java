package main.java;


import main.java.threading.jenkov.SynchronizeTest;
import main.java.threading.jenkov.VirtualThread;

import java.io.IOException;

public class Main {
    static public void main(String[] args) throws IOException, InterruptedException {
        SynchronizeTest synchronizeTest = new SynchronizeTest();
        Thread t1 = new Thread(synchronizeTest, "t1");
        Thread t2 = new Thread(synchronizeTest, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}