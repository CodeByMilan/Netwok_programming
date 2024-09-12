/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabWork;
/* NOte: Remove package name from all files or simply execute file by running packagename.filename 
here it will be LabWork.Server
remeber that we haveto be outside of package folder while executing the command
*/

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
