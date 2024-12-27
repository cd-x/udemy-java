package main.java.network;

import java.net.*;

public class UDPClient {
    public static void main(String args[]){
        try {
            DatagramSocket datagramSocket = new DatagramSocket(2000);
            String message = "Hello World!";
            DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getByName("localhost"), 2001);

            datagramSocket.send(packet);

            byte[] output = new byte[1024];
            DatagramPacket recievedpacket = new DatagramPacket(output, 1024, InetAddress.getByName("localhost"), 2001);
            datagramSocket.receive(recievedpacket);
            System.out.println("Server: "+ new String(recievedpacket.getData()).trim());
            datagramSocket.close();
        }catch (SocketException socketException){
            socketException.printStackTrace();
        }catch (UnknownHostException unknownHostException){
            unknownHostException.printStackTrace();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
