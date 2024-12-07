package main.java.delta;

public class Counter implements ICounter {
    private static Integer count = 0;

    @Override
    public Integer increment() {
        return ++count;
    }
}
