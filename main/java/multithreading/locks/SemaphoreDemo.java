package main.java.multithreading.locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    private static final int MAX_CONNECTIONS = 4;
    private static final Semaphore connectionPool = new Semaphore(MAX_CONNECTIONS);

    public static void main(String[] args) {
        try (ExecutorService service = Executors.newCachedThreadPool()){
            for(int i=0;i<9;i++){
                Runnable request = () ->{
                    try {
                        connectionPool.acquire();
                        premiumApi(Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }finally {
                        connectionPool.release();
                    }
                };
                service.execute(request);
            }
        }

    }
    private static void premiumApi(String requestId){
        System.out.println(requestId +" has given access to premium API.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
