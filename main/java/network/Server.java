package main.java.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String args[]){
        try{
            ServerSocket socket = new ServerSocket(2000);
            Socket stk = socket.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream printStream = new PrintStream(stk.getOutputStream());
            StringBuilder stringBuilder;
            do {
                stringBuilder = new StringBuilder(reader.readLine());
                String reversed = stringBuilder.reverse().toString();
                printStream.println(reversed);
            }while (true);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
