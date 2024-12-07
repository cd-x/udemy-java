package main.java.factory;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {
    private Integer threadCount = 0;
    private String prefix;

    public CustomThreadFactory(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setDaemon(false);
        thread.setName(prefix + "-Thread-" + threadCount++);
        thread.setPriority(Thread.NORM_PRIORITY);
        return thread;
    }

}
