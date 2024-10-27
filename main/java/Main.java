package main.java;


import main.java.delta.StudentSerializable;
import main.java.stream.Serialization;
import main.java.utils.interfaces.IServiceUtils;

import java.util.List;

public class Main {
    static public void main(String[] args) {
        String outputPath = IServiceUtils.getPath();
        Serialization serialization = new Serialization();
        StudentSerializable s = new StudentSerializable(123, "Rakesh", "First");
        StudentSerializable s2 = new StudentSerializable(234, "Ramesh", "2");
        StudentSerializable s3 = new StudentSerializable(345, "Aakash", "3");
        List<StudentSerializable> arr = List.of(s, s2, s3);
        try {
            serialization.write(arr, outputPath);
            for (StudentSerializable studentSerializable : (List<StudentSerializable>) serialization.read(outputPath)) {
                System.out.println(studentSerializable);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}