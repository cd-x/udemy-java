package main.java.generics;

public class ExportFruits<T extends Fruits> {
    public static Integer count = 0;

    public void pack(T fruit) {
        if (fruit.isRipe())
            count++;
    }
}
