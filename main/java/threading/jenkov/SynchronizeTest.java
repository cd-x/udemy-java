package main.java.threading.jenkov;

public class SynchronizeTest implements Runnable{
    private int count  = 0;

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            synchronized (this){
                this.count++;
            }
        }
        System.out.println(Thread.currentThread().getName()+"-Count: "+count);
    }
}
