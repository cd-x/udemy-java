package main.java.multithreading.executors;

import org.example.learn.multithreading.utils.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolExecutor {
    public static void main(String[] args) {
        try(ExecutorService singleThread = Executors.newSingleThreadExecutor()){
            for(int i=0;i<5;i++){
                singleThread.execute(new Task(i, "Thread" + i));
            }
        }
    }
}
