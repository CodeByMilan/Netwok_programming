package oldQuestion;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class UDPClient {

    public static void main(String[] args) {
       
        
        try {
            // Datagram socket to send and receive DatagramPackets
            DatagramSocket socket = new DatagramSocket();
       
            //ipaddress of a client
            InetAddress IPAddress = InetAddress.getByName("localhost");
            
            
            // Read input from user
            System.out.print("Enter message: ");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String message = input.readLine();
  //         Scanner sc =new Scanner (System.in);
//            String message = sc.nextLine();



           //sending data to server Assuming that the servercode is already written and is listening at port 9876  and sending a response 
            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 1010);
            socket.send(sendPacket);

            
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);

            
            String responsemessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Response from server: " + responsemessage);


        } catch (Exception e) {
            e.printStackTrace();
        } 
        }
    }

