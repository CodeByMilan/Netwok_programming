/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter12;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Milan
 */
public class Server {
     public static void main(String[] args) {
        try {
            AdderImplements  obj = new AdderImplements();
            Adder Skeleton = (Adder) UnicastRemoteObject.exportObject(obj, 1080);
            Registry registry = LocateRegistry.getRegistry();

            registry.bind("add", Skeleton);
            System.out.println("server Ready");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

