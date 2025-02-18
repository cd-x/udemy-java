package main.java.ExceptionHandling;

public class FinalizeException {
    @Override
    protected void finalize(){
        System.out.println("dividing by zero");
        double x = 1/0;
        System.out.println("This execution happened post exception");
    }
}
