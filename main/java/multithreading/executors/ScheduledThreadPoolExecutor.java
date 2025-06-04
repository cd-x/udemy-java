package main.java.multithreading.executors;

import org.example.learn.multithreading.factory.ThreadFactoryImpl;
import org.example.learn.multithreading.utils.Task;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutor {
    public static void main(String[] args) {
        try(ScheduledExecutorService service = Executors.newScheduledThreadPool(2, new ThreadFactoryImpl())){
            for(int i= 0;i<7;i++){
                service.scheduleAtFixedRate(new Task(i, String.format("T-%d", i)), 500,2000, TimeUnit.MILLISECONDS);
            }
            if(service.awaitTermination(14, TimeUnit.SECONDS))
                service.shutdownNow();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
