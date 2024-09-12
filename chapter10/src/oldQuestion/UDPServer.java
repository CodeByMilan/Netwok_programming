/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oldQuestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.stream.Stream;

/**
 *
 * @author Milan
 */
public class UDPServer {
    public static void main (String []args){
        try{
            DatagramSocket socket = new DatagramSocket(1010);
              //Since the Server response to the Client so in server code we usually receive message from Client and then response
            System.out.println("Server is ready to listen");
            
            //assuming that the client is sending the request to server at port 1010
            byte[] receiveData = new byte[1024];
            DatagramPacket receivepacket= new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivepacket);
            // converting received packet message byte into string 
            
            String message = new String(receivepacket.getData(),0,receivepacket.getLength());
            System.out.println("received message  from client is :"+message);
            
             //Sending message to Client 
            System.out.println("Enter a message to send to Client:");
            byte[] sendData = new byte[1024];
            BufferedReader serverinput = new BufferedReader(new InputStreamReader(System.in));
            String responsemessage= serverinput.readLine();
            sendData = responsemessage.getBytes();
            InetAddress clientaddress = receivepacket.getAddress();
            int clientport=receivepacket.getPort();
            DatagramPacket sendpacket = new DatagramPacket(sendData, sendData.length, clientaddress, clientport);
            socket.send(sendpacket);     
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
