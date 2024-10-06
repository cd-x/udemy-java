package main.java.threading;

public class Display {
    synchronized public void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.printf("%c ", str.charAt(i));
        }
    }
}
