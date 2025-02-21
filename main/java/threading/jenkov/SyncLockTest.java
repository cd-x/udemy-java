package main.java.threading.jenkov;

public class SyncLockTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(int i=1;i<=10000;i++){
                Resource1.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=1;i<=4000;i++){
                Resource1.display();
            }
        });
        t1.start();
        t2.start();
        t1.join(); t2.join();
        System.out.println(Resource1.getCounter());
    }
}
