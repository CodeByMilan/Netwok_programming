/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMIExample;
import java.rmi.registry.*;
/**
 *
 * @author Milan
 */
public class Client {
    public static void main (String [] args ){
        try{
        Registry registry = LocateRegistry.getRegistry();
        
        Adder stub = (Adder) registry.lookup("price");
        
        String price = stub.ProvidedPrice("Mac");
        System.out.println("price ="+price);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
        
    
}
