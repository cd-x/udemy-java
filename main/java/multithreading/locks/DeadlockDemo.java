package main.java.multithreading.locks;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockDemo {
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        new Thread(() ->{
            lock1.lock();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock2.lock();
            System.out.println("lock 2 acquired in threadA");
            lock2.unlock();
            lock1.unlock();
        }).start();

        new Thread(() ->{
            lock2.lock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock1.lock();
            System.out.println("lock 1 acquired in ThreadB");
            lock1.unlock();
            lock2.unlock();

        }).start();

        // one more thread for deadlock detection
        new Thread(() ->{
            while (true){
                ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
                long[] ids = threadMXBean.getAllThreadIds();
                ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(ids);
                System.out.println("====== Deadlock Details =======");
                for(ThreadInfo info : threadInfos){
                    System.out.println(info);
                }
                if(threadInfos.length > 0){
                    threadMXBean.dumpAllThreads(true, true);
                    break;
                }
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
