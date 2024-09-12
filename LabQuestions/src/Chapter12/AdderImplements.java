/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter12;

import java.rmi.RemoteException;

/**
 *
 * @author Milan
 */
public class AdderImplements implements Adder{

    @Override
    public int addition(int a, int b) throws RemoteException {
        return a+b;
    }

    @Override
    public int multiply(int a, int b) throws RemoteException {
       return a*b;
    }
    
    
}
