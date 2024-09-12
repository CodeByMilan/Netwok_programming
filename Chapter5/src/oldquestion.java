
import java.net.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Milan
 */
public class oldquestion {

    public static void main(String[] args) {
        //show parts of the url (splitting url)
        try {
            //url is given in such a way that we can look at all the fields 
            URL url = new URL("https://www.milanacharya.com:10/path/resource?query=hello#urlreference");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Ref (Anchor): " + url.getRef());
            //file gives whole path + query
            System.out.println("File: " + url.getFile());
            System.out.println("User Info: " + url.getUserInfo());
            
            
        } catch (MalformedURLException e) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
