package main.java.threading;

public class Consumer extends Thread{
    private MyData d;
    public Consumer(MyData data){
        d = data;
    }

    @Override
    public void run(){
        for(int i=250;i>0;i-=10){
            d.get();
        }
    }
}
