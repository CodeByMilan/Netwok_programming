/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.net.*;
/**
 *
 * @author Milan
 */
public class URLEncoderDecoder {
    public static void main(String[] args){
        try{
            //creating uri
            URI u=new URI("http://www.ibiblio.org");
            //urL encoding
            String email="milanacharya    @gmail.com";
            System.out.println("before Encoding:"+email);
            
            //after encoding 
            String encodeddata=URLEncoder.encode(email);
            System.out.println(""+encodeddata);
            //another method 
            String encodeddata1=URLEncoder.encode(email,"UTF-8");
            System.out.println(""+encodeddata1);
            
            //decoding 
              String decodeddata=URLDecoder.decode(encodeddata,"UTF-8");
            System.out.println(""+decodeddata);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
