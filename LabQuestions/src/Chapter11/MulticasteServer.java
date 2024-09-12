/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter11;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author Milan
 */
public class MulticasteServer {
        public static void main(String[] args) {

        try {
            //datagram socket to send data 
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("224.0.0.1");
            
            for (int i = 0; i < 5; i++) {
                //sending multiple message to multiple clients 
                String msg = "Sent message to: " + i;
                DatagramPacket sendPacket = new DatagramPacket(msg.getBytes(), msg.getBytes().length, address, 1010);
                socket.send(sendPacket);
                System.out.println("Server sent packet with msg: " + msg);
                //delay created to send the msg at the same rate so that there will not be any load to the client 
                Thread.sleep(1000);
            }
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
