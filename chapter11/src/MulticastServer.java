
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
//first run client file so that all the devices are joined in multicaste socket and can receive the msg 
/**
 *
 * @author Milan
 */
public class MulticastServer {

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
