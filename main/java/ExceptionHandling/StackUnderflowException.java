package main.java.ExceptionHandling;

public class StackUnderflowException extends RuntimeException{
    @Override
    public String toString() {
        return "Stack is empty, there is nothing to remove!";
    }
}
