package main.java.utils.impl;

import main.java.delta.Student;

import java.util.Comparator;

public class Utils {
    class MyComp implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getRollNumber(), s2.getRollNumber());
        }
    }
}
