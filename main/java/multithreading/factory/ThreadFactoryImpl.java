package main.java.multithreading.factory;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryImpl implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }
}
