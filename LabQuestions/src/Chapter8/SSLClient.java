/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8;

import javax.net.ssl.*;
import java.io.*;

/**
 *
 * @author Milan
 */
public class SSLClient {

    public static void main(String[] args) {
        try {
            System.setProperty("javax.net.ssl.trustStore", "./truststore.jks");
            System.setProperty("javax.net.ssl.trustStorePassword", "password");

            SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket sslSocket = (SSLSocket) sslSocketFactory.createSocket("localhost", 1080);

            System.out.println("Server Connected.");

            sslSocket.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
