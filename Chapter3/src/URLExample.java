/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

/**
 *
 * @author Milan
 */
public class URLExample {

    public static void main(String[] args)  {
        //basic concept of url 
        try{
        URL baseurl = new URL("http://wwww.google.com/");
        String relativeurl = "/home.html";
        URL resolvedurl = new URL(baseurl, relativeurl);
        System.out.println("baseurl :" + baseurl);
        System.out.println("relative :" + relativeurl);
        System.out.println("resolved :" + resolvedurl);

        //methods to retrive data from url 
        
            URL u = new URL("https://www.overcomingbias.com");
            //1.public InputStream OpenStream()
            InputStream in = u.openStream();
            int c;
            while ((c = in.read()) != -1) {
                System.out.println(c);

            }
            //2.public URLconnection openconnection()
            URLConnection con = u.openConnection();
            InputStream inp = con.getInputStream();
            while ((c = inp.read()) != -1) {
                System.out.println(c);

            }
            //3.public Object getContent()
            Object o = u.getContent();
            System.out.println("i got a " + o.getClass().getName());
            
            
            System.out.println("reading from Buffer reader");
            //retrieving data from url using buffered reader
            BufferedReader bf = new BufferedReader(new InputStreamReader(con.getInputStream()));
            
            String line;
            while ((line=bf.readLine())!=null){
                System.out.println(line);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
