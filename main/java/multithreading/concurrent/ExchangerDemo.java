package main.java.multithreading.concurrent;

import org.example.learn.multithreading.utils.ExchangerTask;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
    private static final Exchanger<Integer> exchanger = new Exchanger<>();
    public static void main(String[] args) {
        new Thread(new ExchangerTask(exchanger, 0, 2000)).start();
        new Thread(new ExchangerTask(exchanger, 2, 5000)).start();
    }
}
