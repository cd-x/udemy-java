package main.java;


import main.java.threading.jenkov.VirtualThread;

import java.io.IOException;

public class Main {
    static public void main(String[] args) throws IOException, InterruptedException {
        VirtualThread virtualThread = new VirtualThread();
        virtualThread.spawnVirtualThreads();
    }
}