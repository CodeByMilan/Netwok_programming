
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
//first run client file so that all the devices are joined in multicaste socket and can receive the msg 
/**
 *
 * @author Milan
 */
public class MulticasteClient {

    public static void main(String[] args) {

        try {
            //address to connect to 
            InetAddress address = InetAddress.getByName("224.0.0.1"); 
            //multicastSocket to connect to address
            MulticastSocket ms = new MulticastSocket(1010);
            ms.joinGroup(address);
            System.out.println("Joined multicast group");

            byte[] receiveData = new byte[256];

            while (true) {
                //receive data sent by the server
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                ms.receive(receivePacket);
                //converting byte data into string
                String msg = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received message: " + msg);
                //delay created in receiving the msg so that it will ensure the rate at which the data is coming from and work will be visible and there  will be no load to the client also
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
