package main.java.multithreading.executors;

import java.util.concurrent.CompletableFuture;

public class ForkJoinPoolDemo {
    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() ->{
            return 4;
        });
    }
}
