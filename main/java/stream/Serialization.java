package main.java.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public void write(Object object) throws Exception{
        FileOutputStream fo = new FileOutputStream("out/production/untitled/main/resources/seralized.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(object);
        oos.close();
        fo.close();
    }
    public void read() throws Exception{
        FileInputStream fi = new FileInputStream("out/production/untitled/main/resources/seralized.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);
        System.out.println(oi.readObject());
        oi.close();
        fi.close();
    }
}
