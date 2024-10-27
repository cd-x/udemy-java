package main.java.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public void write(Object object, String path) throws Exception{
        FileOutputStream fo = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(object);
        oos.close();
        fo.close();
    }
    public Object read(String path) throws Exception{
        FileInputStream fi = new FileInputStream(path);
        ObjectInputStream oi = new ObjectInputStream(fi);
        Object object = oi.readObject();
        oi.close();
        fi.close();
        return object;
    }
}
