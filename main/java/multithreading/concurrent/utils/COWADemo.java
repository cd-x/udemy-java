package main.java.multithreading.concurrent.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWADemo {
    public static void main(String[] args) {
        final CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(
                new ArrayList<>(List.of(0,0,0,0,0,0))
        );
        Thread reader = new Thread(new Reader(list));
        Thread writer = new Thread(new Writer(list));
        reader.start();
        writer.start();
    }

    static class Reader implements Runnable{
        private final CopyOnWriteArrayList<Integer> list;

        public Reader(CopyOnWriteArrayList<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            for(int i=0;i<20;i++){
                try{
                    Thread.sleep(1000);
                    System.out.println(list);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
    static class Writer implements Runnable{
        private final CopyOnWriteArrayList<Integer> list;

        public Writer(CopyOnWriteArrayList<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            Random random = new Random();
            for(int i=0;i<20;i++){
                try {
                    Thread.sleep(1200);
                    list.set(random.nextInt(6), random.nextInt(100));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
