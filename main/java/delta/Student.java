package main.java.delta;

public class Student implements Comparable {
    private int rollNumber;
    private String name;
    private String dept;

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (this.getRollNumber() == student.getRollNumber()) {
            return this.getName().compareToIgnoreCase(student.getName());
        }
        return Integer.compare(this.getRollNumber(), student.getRollNumber());
    }
}
