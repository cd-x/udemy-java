package main.java.threading;

public class Producer extends Thread{
    private MyData d;
    public Producer(MyData data){
        d= data;
    }
    @Override
    public void run(){
        for(int i=200;i>0;i-=10){
          d.set(i);
        }
    }
}
