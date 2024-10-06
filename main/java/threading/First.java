package main.java.threading;

public class First extends Thread{
    private Display d;
    public First(Display d){
        this.d = d;
    }
    @Override
    public void run(){
        d.display("Hello World!, this is first thread");
    }
}
