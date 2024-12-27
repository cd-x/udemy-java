package main.java.network;

import java.net.*;

public class UDPServer {
    public static void main(String args[]){
        try {
            DatagramSocket datagramSocket = new DatagramSocket(2001);
            byte[] output = new byte[1024];
            DatagramPacket recievedpacket = new DatagramPacket(output, 1024, InetAddress.getByName("localhost"), 2000);
            datagramSocket.receive(recievedpacket);

            String message = new String(recievedpacket.getData()).trim();
            StringBuilder stringBuilder = new StringBuilder(message);
            stringBuilder.reverse();
            message = stringBuilder.toString();
            DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getByName("localhost"), 2000);

            datagramSocket.send(packet);
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
