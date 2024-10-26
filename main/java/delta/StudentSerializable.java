package main.java.delta;

import main.java.stream.Serialization;

import java.io.Serializable;

public class StudentSerializable implements Serializable {
    private int rollNumber;
    private String name;
    private static int batch = 2024;
    transient private String position;

    @Override
    public String toString() {
        return "StudentSerializable{" +
                "rollNumber=" + rollNumber +
                ", Name='" + name + '\'' +
                ", Batch='" + batch + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public StudentSerializable(int rollNumber, String name, String position) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.position = position;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getBatch() {
        return batch;
    }

    public static void setBatch(int batch) {
        StudentSerializable.batch = batch;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
