package main.java;


import main.java.delta.Student;

import java.util.TreeSet;

public class Main {
    static public void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student(1, "qd"));
        ts.add(new Student(23, "safd"));
        boolean x = ts.contains(new Student(24, "safd"));
        System.out.println(x);
    }
}