/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter5;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author Milan
 */
public class Chapter5 {

    public static void main(String[] args) {
        
        try {
              
            URL url = new URL("https://www.overcomingbias.com");
            URLConnection con = url.openConnection();
            
            //Reading Data from Server 
            InputStream in = con.getInputStream();
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            
            //reading header file 
            Map<String ,List <String>> map = con.getHeaderFields();
            System.out.println("header fields :"+map);
            
            //specific header field 
            
           String contentype = con.getContentType();
           int contentlength = con.getContentLength();
           String contentencoding= con.getContentEncoding();
           long expire = con.getExpiration();
            System.out.println("contenttype :"+contentype);
            System.out.println("contentlength :"+contentlength);
            System.out.println("contentencoding :"+contentencoding);
            
            //similarly we can get different header field indivisually 
            
            //we can also get these using arbitary header fields 
            System.out.println("contenttype:"+con.getHeaderField("content-type"));
            System.out.println("date:"+con.getHeaderField("date"));
            
            //using headerfield key
            
             System.out.println("contenttype:"+con.getHeaderFieldKey(1));
             System.out.println("contenttype:"+con.getHeaderFieldKey(2));
             System.out.println("contenttype:"+con.getHeaderFieldKey(3));
             System.out.println("contenttype:"+con.getHeaderFieldKey(4));
             System.out.println("contenttype:"+con.getHeaderFieldKey(5));

             //setting default value if the header isnot present
             System.out.println("contenttype:"+con.getHeaderFieldInt("content-length",-1));
             
             //checking if the connection is allows or not 
             System.out.println("is connection allowed or not?"+con.getPermission());
             
           //HttpURLConnection :subclass of URLConnection which provides fields and methods specific to an HTTP URL
           
           URL httpurl = new URL ("http://www.ambition.edu.np/contact");
            HttpURLConnection htpcon= (HttpURLConnection) httpurl.openConnection();
            
            //reading header fields using httpurlconnection
            for (int i =1;i<=8;i++){
                System.out.println(""+htpcon.getHeaderFieldKey(i)+"="+htpcon.getHeaderField(i));
            }
            
           
           
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
