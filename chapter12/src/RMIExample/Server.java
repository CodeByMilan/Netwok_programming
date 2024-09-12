/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMIExample;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;


/**
 *
 * @author Milan
 */
public class Server {
    public static  void main (String [] args){
        try{
        AdderImplements obj = new AdderImplements();
        
        Adder skeleton = (Adder) UnicastRemoteObject.exportObject(obj,0);
        Registry registry = LocateRegistry.getRegistry();
        registry.bind("price",skeleton);
            System.out.println("server ready ");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
