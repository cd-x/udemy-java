package main.java.ExceptionHandling;

public class StackOverflowExeception extends RuntimeException{
    @Override
    public String toString() {
        return "Stack is full, try removing something!";
    }
}
