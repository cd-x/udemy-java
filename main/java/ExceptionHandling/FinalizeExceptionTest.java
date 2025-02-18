package main.java.ExceptionHandling;

public class FinalizeExceptionTest {
    public static void main(String[] args){
        FinalizeException fe = new FinalizeException();
        fe = null;
        System.gc();
    }
}
