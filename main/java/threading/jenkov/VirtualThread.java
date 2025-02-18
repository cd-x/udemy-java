package main.java.threading.jenkov;

import java.util.stream.IntStream;

public class VirtualThread {
    public void spawnVirtualThreads() throws InterruptedException {
        IntStream.range(0,10).forEach(count -> {
            Thread curThread =  Thread.startVirtualThread(() -> {
                System.out.println("Executing virtual:" + Thread.ofVirtual().name("VT-", 1));
            });
            try {
                curThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
    public void spawnVirtualThreads2() throws InterruptedException {
        IntStream.range(0,100).forEach(count -> Thread.ofVirtual().start(() ->{
            System.out.println("Executing virtual:"+Thread.ofVirtual().name("VT-", 1));
        }));
    }
}
