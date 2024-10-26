package main.java.stream;

import main.java.delta.Student;
import main.java.utils.interfaces.IServiceUtils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamDemo {
    public void write(Student student) throws Exception{
        FileOutputStream fo = new FileOutputStream(IServiceUtils.getPath());
        DataOutputStream dos = new DataOutputStream(fo);
        dos.writeInt(student.getRollNumber());
        dos.writeUTF(student.getName());
        dos.writeUTF(student.getDept());
        dos.close();
        fo.close();
    }

    public void read() throws Exception{
        FileInputStream fi = new FileInputStream(IServiceUtils.getPath());
        DataInputStream di = new DataInputStream(fi);
        System.out.printf("Roll: %d, Name: %s, Dept: %s", di.readInt(), di.readUTF(), di.readUTF());
        di.close();
        fi.close();
    }
}
