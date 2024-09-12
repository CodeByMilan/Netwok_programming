
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author Milan
 */

public class UDPClient {
  
    public static void main(String[] args) {
        try {
    
            DatagramSocket socket = new DatagramSocket();
            InetSocketAddress serverAddress = new InetSocketAddress("localhost", 1040);
          
          
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number to send to the server (type 'e' to quit): ");
                String input = sc.nextLine();

                if (input.equalsIgnoreCase("e")) {
                    break;  
                }
                //as the data is sent in byte so it is a must to convert the user input data into byte before sending data to server
                byte[] sendData = input.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress);
                socket.send(sendPacket);

                // response from  server
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server response: " + response);
            }
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
            
        }
    }


    

