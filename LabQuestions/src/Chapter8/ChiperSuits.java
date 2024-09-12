/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8;

import java.net.*;
import javax.net.ssl.*;

/**
 *
 * @author Milan
 */
public class ChiperSuits {

    public static void main(String[] args) {
        try {

            Socket socket = null;
            SSLSocketFactory f = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket secureSocket = (SSLSocket) f.createSocket();
            secureSocket.connect(new InetSocketAddress("www.tufohss.edu.np", 443));

            for (int i = 0; i < 5; i++) {

                System.out.println("Enabled Cipher Suites = " + secureSocket.getEnabledCipherSuites()[i]);

                System.out.println("Supported Cipher Suites=" + secureSocket.getSupportedCipherSuites()[i]);

                socket.close();

            }

        } catch (Exception e) {
        }

    }
}


