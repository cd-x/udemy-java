package main.java.generics;

public class MultiParam<H, W> {
    public void getCertificate(H husband, W wife) {
        System.out.printf("This is to prove the merriage of %s and %s", husband, wife);
    }
}
