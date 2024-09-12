/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Chapter12;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Milan
 */
public interface Adder extends Remote {
    public int addition(int a , int b) throws RemoteException;
      public int multiply(int a , int b) throws RemoteException;
          
}

