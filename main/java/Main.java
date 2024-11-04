package main.java;


import main.java.delta.Point;

import java.util.TreeSet;

public class Main {
    static public void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1, 2));
        ts.add(new Point(4, 3));
        ts.add(new Point(1, 9));
        ts.forEach(System.out::println);
    }
}