/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication15;

import java.io.*;
import java.net.*;

/**
 *
 * @author adib
 */
public class ReadThread implements Runnable{
    StudentManager studentManager = new StudentManager();
    //ChatroomController chatroom = new ChatroomController();
    private MulticastSocket socket;
    private InetAddress group;
    private int port;
    private static final int max_len = 1000;
    ReadThread(MulticastSocket socket, InetAddress group, int port){
        this.socket = socket;
        this.group = group;
        this.port = port;
    }

    @Override
    public void run() {
        while(!ChatroomController.finished){
            byte[] buffer = new byte[ReadThread.max_len];
            DatagramPacket datagram = new DatagramPacket(buffer,buffer.length,group,port);
            String message;
            try{
                socket.receive(datagram);
                message = new String(buffer,0,datagram.getLength(),"UTF-8");
               // chatroom.textArea.appendText(message);
                if(!message.startsWith(studentManager.lgetName())){
                    System.out.println(message);
                }
            }
            catch(IOException e) 
            { 
                System.out.println("Socket closed!"); 
            } 
        }
    }
    
}
