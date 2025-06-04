package main.java.collections.implementation;

import main.java.generics.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class VolatileTest {
    private volatile AtomicInteger count;
    public VolatileTest(){
        count = new AtomicInteger(0);
    }
    public void update(){
        count.set(count.incrementAndGet());
    }
    public AtomicInteger getCount(){
        int[] arr = {1,2,3};
        HashSet<Integer> s = Arrays.stream(arr).boxed().collect(Collectors.toCollection(HashSet::new));
        return count;
    }
}
