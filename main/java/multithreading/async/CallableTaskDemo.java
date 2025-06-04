package main.java.multithreading.async;

import org.example.learn.multithreading.utils.CallableTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class CallableTaskDemo {
    public static void main(String[] args) throws TimeoutException {
        try(ExecutorService service = Executors.newSingleThreadExecutor()) {
            Callable<Integer> c = new CallableTask();
            Future<Integer> res =  service.submit(c);
            System.out.println("result : " + res.get(5, TimeUnit.SECONDS));
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
