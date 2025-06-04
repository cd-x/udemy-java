package main.java.multithreading.executors;

import org.example.learn.multithreading.utils.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExecutor {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newFixedThreadPool(2)){
            for(int i= 0; i<5; i ++){
                service.execute(new Task(i, "Task-"+i));
            }
        }
    }
}
