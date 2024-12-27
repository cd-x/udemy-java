package main.java.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String delimiter = "end";
    public static void main(String args[]){
        try{
            Socket stk = new Socket("localhost", 2000);
            BufferedReader reader = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream printStream = new PrintStream(stk.getOutputStream());
            Scanner sc = new Scanner(System.in);
            String request;
            do{
                request = sc.nextLine();
                printStream.println(request);
                String output = reader.readLine();
                System.out.println("Server: "+output);
            }while(!request.equalsIgnoreCase(delimiter));
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
