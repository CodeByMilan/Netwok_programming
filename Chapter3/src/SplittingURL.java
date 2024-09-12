
import java.net.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Milan
 */
public class SplittingURL {
    public static void main (String[]args){
        try{
            URL u = new URL("http://milan:123@www.example.com:123/path/res/index.html?category=books#reference");
            
            System.out.println(""+u.getFile());
            System.out.println(""+u.getHost());
            System.out.println(""+u.getPath());
            System.out.println(""+u.getProtocol());
            System.out.println(""+u.getQuery());
            System.out.println(""+u.getRef());
            System.out.println(""+u.getUserInfo());
            System.out.println(""+u.getAuthority());
            System.out.println(""+u.getPort());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
