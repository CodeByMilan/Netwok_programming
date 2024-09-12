/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8;

import java.io.File;
import javax.net.ssl.*;

/**
 *
 * @author Milan
 */
public class SSLServer {

    public static void main(String[] args) {
        try {
            System.setProperty("javax.net.ssl.keyStore", "./keystore.jks");
            System.setProperty("javax.net.ssl.keyStorePassword", "password");

            SSLServerSocketFactory sslServerSocketFactory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            SSLServerSocket sslServerSocket = (SSLServerSocket) sslServerSocketFactory.createServerSocket(1080);

            // Wait for a connection
            SSLSocket sslSocket = (SSLSocket) sslServerSocket.accept();
            System.out.println("Client Connected.");

            sslSocket.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
