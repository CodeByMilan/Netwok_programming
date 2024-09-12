
import java.lang.reflect.Array;
import java.net.*;
import java.nio.*;
import java.nio.channels.ServerSocketChannel;
import java.util.Arrays;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Milan
 */
public class BufferExample {

    public static void main(String[] args) {
        try {

            ServerSocketChannel ch = ServerSocketChannel.open();
            InetSocketAddress address = new InetSocketAddress(8080);
            ch.bind(address);

            // Filling and draining
            ByteBuffer b1 = ByteBuffer.allocate(20);
            System.out.println("position of a buffer before filling:" + b1.position());

            // Filling /writting
            b1.put((byte) 'H');
            b1.put((byte) 'E');
            b1.put((byte) 'L');
            b1.put((byte) 'L');
            b1.put((byte) 'O');
            System.out.println("position of a buffer after filling:" + b1.position());

            /*
            Flip the buffer to switch from write mode to read mode and 
            it also switches the position to 0 so that we can read from the first 
            and it limit the buffer capacity to the current position ie after the filling position which is 5 here 
             */
            b1.flip();
            System.out.println("position of a buffer after fliping:" + b1.position());

            // Draining /reading 
            System.out.print("Data in buffer b1 :");
            while (b1.hasRemaining()) {
                System.out.print((char) b1.get());
            }

            /* Clear
            it switches the position to 0
            makes the limit to the original capacity that is 20
             */
            System.out.println("");
            b1.clear();
            System.out.println("position of a buffer b1 after clearing  :" + b1.position());

            /*Duplicating Buffer 
             inorder to duplicate data we should have data but after clearing our position is at 0 
            so there are no data to duplicate .
            so we can now either write over ride new data or just move the position to the last elemet so that the above data will be copied 
            
             */
            //moving position to 5 to add new data 
            b1.position(5);

            b1.put((byte) 'W');
            b1.put((byte) 'O');
            b1.put((byte) 'R');
            b1.put((byte) 'L');
            b1.put((byte) 'D');
            System.out.println("Position of buffer b1 after filling new data: " + b1.position());

            // Flip to move position to the 0
            b1.flip();
            System.out.print("Data in buffer b1 after new data: ");
            while (b1.hasRemaining()) {
                System.out.print((char) b1.get());
            }
            System.out.println();

            //Duplicating buffer
            ByteBuffer b2 = b1.duplicate();
            System.out.println("Position of buffer b2 after duplicating: " + b2.position());

            // Reset position of b2 and print its data
            b2.flip();
            System.out.print("Data in duplicate buffer b2: ");
            while (b2.hasRemaining()) {
                System.out.print((char) b2.get());
            }
            System.out.println();
            System.out.println("position after reading data :" + b2.position());

            /* Compacting Buffer
            it copies the preivious data and places in the begging and move position to the last element and writes new data 
            but if prrevious data have been already read then it override so we can move the position where we want to write
             */
            b1.compact();
            System.out.println("position after compacting:" + b1.position());
            b1.position(10);
            b1.put((byte) 'M');
            b1.put((byte) 'i');
            b1.put((byte) 'l');
            b1.put((byte) 'a');
            b1.put((byte) 'n');

            b1.flip();
            System.out.println("data after adding data :");
            while (b1.hasRemaining()) {
                System.out.print((char) b1.get());
            }
            System.out.println("position after reading data :" + b1.position());
            b1.clear();
           b1.position(15);
           
            
            System.out.println("capacity of b1:" + b1.capacity());

            /*Slicing
             creates new buffer with the limit its own new data and limit whose changes are seen in  the original buffer
             */
            ByteBuffer b3 = b1.slice();
           

            System.out.println("position after slicing :" + b3.position());
            System.out.println("capacity after slicing :" + b3.capacity());
            
            while (b3.hasRemaining()) {
                System.out.print((char) b3.get());
            }
            System.out.println("position after slicing read :" + b3.position());
            
            b3.flip();
            System.out.println("position after slicing flip:" + b3.position());
            b3.put((byte) 'A');
            b3.put((byte) 'c');
            b3.put((byte) 'h');
            b3.put((byte) 'a');
            b3.put((byte) 'r');

            System.out.println("position after slicing write:" + b3.position());
            
            b3.flip();
            System.out.println("position after slicing  flip:" + b3.position());
            while (b3.hasRemaining()) {
                System.out.print((char) b3.get());
            }
            System.out.println("");
            System.out.println("position after slicing read :" + b3.position());
            
            b1.position(15);
            b1.limit(20);
          b1.flip();
            System.out.println("data after slicing  :");
            while (b1.hasRemaining()) {
                System.out.print((char) b1.get());
            }
            System.out.println("");
            System.out.println("position at the end  :" + b1.position());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
