package main.java.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread{
    private static final String delimiter = "dne";
    private Socket socket;
    public ServerThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            StringBuilder stringBuilder;
            String message;
            do {
                stringBuilder = new StringBuilder(reader.readLine());
                message = stringBuilder.reverse().toString();
                printStream.println(message);
            }while (!message.equalsIgnoreCase(delimiter));
            socket.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
