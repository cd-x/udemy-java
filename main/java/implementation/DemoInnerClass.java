package main.java.implementation;

public class DemoInnerClass {
    int x = 10;
    public class Inner{
        int y=20;
        public void innerDisplay(){
            System.out.println("X: "+x);
            System.out.println("Y: "+y);
        }
    }
    void outerDisplay(){
        Inner in = new Inner();
        in.innerDisplay();
    }
}
