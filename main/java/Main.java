package main.java;


import java.util.StringTokenizer;

public class Main {
    static public void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("any;time;anywhere.call;me.aytime", ";.");
        Integer token = tokenizer.countTokens();
        System.out.println(token);
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}