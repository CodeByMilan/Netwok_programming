
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Milan
 */
public class Server {

    public static void main(String[] args) {
        try {
            //creating object of implemented java class
            AdderImplements obj = new AdderImplements();
            //creating remote object and exporting using UnicastRemoteObject so that it can accept remote method calls
            //0 initializes the available port instead of 0 we can also give our custom port number 
            Adder skeleton = (Adder) UnicastRemoteObject.exportObject(obj, 0);
            //starting registry
            Registry registry = LocateRegistry.getRegistry();

            // binding remote obj and all its methods in add 
            registry.bind("add", skeleton);
            System.out.println("Server ready");
        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
