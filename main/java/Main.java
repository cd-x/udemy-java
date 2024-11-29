package main.java;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    static public void main(String[] args) throws IOException {
        final boolean[] isRunning = {true};
        Thread keyListener = new Thread(() -> {
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
            isRunning[0] = false;
            sc.close();
        });
        keyListener.start();
        while (isRunning[0]) {
            System.out.println("printing...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
                break;
            }
        }
    }
}