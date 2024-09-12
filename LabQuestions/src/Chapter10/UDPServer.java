/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Milan
 */
package Chapter10;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
  
    public static void main(String[] args) {
 
        try {
            // DatagramSocket to send and receive datagramPackets
            DatagramSocket socket = new DatagramSocket(1040);
            System.out.println("Server Ready");
        
            byte[] receiveData = new byte[1024];

            while (true) {
                // DatagramPacket to receive datagrams from client 
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket); 

                // the incomming data will be in byte so converting it to string
                String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received: " + receivedMessage);

                // Logic to check the data is even or odd 
                String responseMessage;
                try {
                    int number = Integer.parseInt(receivedMessage.trim());
                    if (number % 2 == 0) {
                        responseMessage = "The number " + number + " is even.";
                    } else {
                        responseMessage = "The number " + number + " is odd.";
                    }
                } catch (NumberFormatException e) {
                    responseMessage = "Invalid input. Please send a valid integer.";
                }

                //  response to client with result
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                //sending response in bytes
                byte[] responseData = responseMessage.getBytes();
                DatagramPacket responsePacket = new DatagramPacket(responseData, responseData.length, clientAddress, clientPort);
                socket.send(responsePacket);
                System.out.println("Sent response: " + responseMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        }
    }


    

