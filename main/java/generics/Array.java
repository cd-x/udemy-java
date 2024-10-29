package main.java.generics;

public class Array<T> {
    T[] arr = (T[]) new Object[10];
    private static int len = 0;

    public void add(T val) {
        arr[len++] = val;
    }

    public void print() {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
