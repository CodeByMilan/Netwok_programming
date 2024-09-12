/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/* NOte: Remove package name from all files or simply execute file by running packagename.filename 
here it will be LabWork.Server
remeber that we haveto be outside of package folder while executing the command
*/
package LabWork;

import java.rmi.RemoteException;
import java.rmi.registry.*;

/**
 *
 * @author Milan
 */
public class Client {

    public static void main(String[] args) throws RemoteException {
        try {
            Registry registry = LocateRegistry.getRegistry();
            Adder stub = (Adder) registry.lookup("add");
            int Sum = stub.addition(10, 2);
            System.out.println("sum of two number is :" + Sum);
            int Mul = stub.multiply(10, 2);
            System.out.println("multiplication of two number is :" + Mul);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
