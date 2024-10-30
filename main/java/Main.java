package main.java;


import main.java.generics.Apple;
import main.java.generics.Banana;
import main.java.generics.ExportFruits;
import main.java.generics.Fruits;

public class Main {
    static public void main(String[] args) {
        ExportFruits<Fruits> exportFruits = new ExportFruits<>();
        exportFruits.pack(new Apple());
        exportFruits.pack(new Banana());
    }
}