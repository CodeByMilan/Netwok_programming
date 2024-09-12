/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import java.rmi.*;
/**
 *
 * @author Milan
 */
public interface Adder extends Remote{
	public int sum(int a, int b) throws RemoteException;
        public int sub(int a , int b )throws RemoteException;
}
   
