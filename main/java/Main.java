package main.java;


import main.java.generics.MultiParam;

public class Main {
    static public void main(String[] args) {
        MultiParam<String, Integer> marry = new MultiParam<>();
        marry.getCertificate("ramesh", 12);
    }
}