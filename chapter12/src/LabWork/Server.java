/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabWork;
/* NOte: Remove package name from all files or simply execute file by running packagename.filename 
here it will be LabWork.Server
remeber that we haveto be outside of package folder while executing the command
*/

import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Milan
 */
public class Server {

    public static void main(String[] args) {
        try {
            AdderImplements obj = new AdderImplements();
            Adder Skeleton = (Adder) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.getRegistry();

            registry.bind("add", Skeleton);
            System.out.println("server Ready");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
