package main.java.implementation;

import java.io.Closeable;

public class DummyAutoCloseable implements Closeable {
    public DummyAutoCloseable(){
        System.out.println("DummyAutoCloseable::DummyAutoCloseable()");
    }
    @Override
    public void close(){
        System.out.println("DummyAutoCloseable::close()");
    }
}
