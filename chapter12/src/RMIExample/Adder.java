/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RMIExample;
import java.rmi.*;
/**
 *
 * @author Milan
 */
public interface Adder extends Remote{
    public String ProvidedPrice(String ModelName) throws RemoteException;
    
    
}
