package main.java.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiSocketServer {
    private static int clients = 0;
    public static void main(String args[]){
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(2000);
            while (true){
                Socket socket = serverSocket.accept();
                clients = clients + 1;
                System.out.println("Connections: "+ clients);
                new ServerThread(socket).run();
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
