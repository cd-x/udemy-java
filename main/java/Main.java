package main.java;


import main.java.delta.DummyClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static public void main(String[] args) {
        DummyClass d1 = new DummyClass();
        d1.x = 1;
        DummyClass d2 = new DummyClass();
        d2.x = 2;
        ArrayList<DummyClass> arrayList = new ArrayList<>();
        arrayList.addAll(List.of(d1, d2));
        DummyClass[] arr = {d1, d2};
        Arrays.sort(arr, (o1, o2) -> Integer.compare(o2.x, o1.x));
        for (DummyClass d : arr)
            System.out.println(d);
        int[] a = {1, 3, 3};
        int[] b = {1, 3, 3, 4};
        System.out.println(Arrays.compare(a, b));
    }
}