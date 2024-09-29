package main.java.implementation;

import java.util.List;
public class Student {
    String name;
    String roll;
    String course;
    List<Integer> marks;
    public Integer getTotalmarks(){
        return marks.stream().reduce(0, Integer::sum);
    }
    public double getAverage(){
        return (double) getTotalmarks() /marks.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public Student(String name, String roll, String course, List<Integer> marks) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.marks = marks;
    }
}
