/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.rmi.registry.*;

/**
 *
 * @author Milan
 */
public class Client {

    public static void main(String[] args) {
        try {
            //starting registry
            Registry registry = LocateRegistry.getRegistry();
            //looking for remote object 
            Adder stub = (Adder) registry.lookup("add");
            //calling the remote method 
            int Sum = stub.sum(10, 5);
            System.out.println("sum of two number is :" + Sum);
            int Sub = stub.sub(10, 5);
             System.out.println("Difference of two number is :" + Sub);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
