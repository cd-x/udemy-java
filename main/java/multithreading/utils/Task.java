package main.java.multithreading.utils;

public class Task implements Runnable{
    private final int id;
    private final String name;
    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("Executing task with id: %d by thread: %s \n", id, Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Task %s completed.\n", name);
    }
}
