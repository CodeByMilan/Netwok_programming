/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter9;

import java.net.Socket;
import java.net.SocketOption;
import java.nio.channels.SocketChannel;

/**
 *
 * @author Milan
 */
public class SocketOptions {

    public static void main(String[] args) throws Exception {
        SocketChannel channel = SocketChannel.open();
        System.out.println(channel.getClass().getSimpleName() + " supports:");
        for (SocketOption<?> option : channel.supportedOptions()) {
            System.out.println(option.name() + ": " + channel.getOption(option));
        }
        System.out.println();
        channel.close();
    }

}
