/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMIExample;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Milan
 */
public class AdderImplements implements Adder{
    private Map<String,String> prices ;
    public AdderImplements(){
        prices=new HashMap<>();
        prices.put("DEll","1000000");
        prices.put("HP","1200000");
        prices.put("Mac","1300000");
    }

    @Override
    public String ProvidedPrice(String ModelName) throws RemoteException {
        return prices.get(ModelName);
    }
    
    
}
