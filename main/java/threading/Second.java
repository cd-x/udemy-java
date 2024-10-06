package main.java.threading;

public class Second extends Thread{
    private Display d;
    public Second(Display d){
        this.d = d;
    }
    @Override
    public void run(){
        d.display("Welcome to world!, this is second thread");
    }
}
