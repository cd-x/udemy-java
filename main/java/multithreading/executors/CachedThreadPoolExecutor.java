package main.java.multithreading.executors;

import org.example.learn.multithreading.utils.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExecutor {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newCachedThreadPool()){
            for(int i=0;i<50;i++){
                service.execute(new Task(i, "Task-"+i));
            }
        }
    }
}
