/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
   import java.rmi.RemoteException;
/**
 *
 * @author Milan
 */
public class AdderImplements implements Adder{

	@Override
	public int sum(int a, int b) throws RemoteException {
		return a + b;
	}

    @Override
    public int sub(int a, int b) throws RemoteException {
       return a - b;
    }
}
  
