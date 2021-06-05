/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication15;

import java.io.IOException;
import java.net.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class ChatroomController implements Initializable {
  
    private String message;
    public static boolean finished = false;
    StudentManager studentManager = new StudentManager();
    TeacherManager teacherManager = new TeacherManager();
    AlumniManager alumniManager = new AlumniManager();
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;
    private InetAddress group;
    private int port;
    MulticastSocket socket;
    @FXML
    private Label labelid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
    }    
    public void connection() throws UnknownHostException, IOException{
        try{
            group = InetAddress.getByName("239.0.0.0");
            port = 7999;
            Scanner sc = new Scanner(System.in);
            socket = new MulticastSocket(port);
            socket.setTimeToLive(0); 
            socket.joinGroup(group);
            Thread t = new Thread(new ReadThread(socket,group,port));
            t.start();
          
            

        }
        catch(SocketException se) 
            { 
                System.out.println("Error creating socket"); 
                se.printStackTrace(); 
            } 
            catch(IOException ie) 
            { 
                System.out.println("Error reading/writing from/to socket"); 
                ie.printStackTrace(); 
            } 
        
    }
    public class ReadThread implements Runnable{
    StudentManager studentManager = new StudentManager();
    TeacherManager teacherManager = new TeacherManager();
    AlumniManager alumniManager = new AlumniManager();
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
                if(!message.startsWith(studentManager.lgetName()) || !message.startsWith(teacherManager.lgetName()) || !message.startsWith(alumniManager.lgetName())){
                    textArea.appendText(message + "\n");
                }
            }
            catch(IOException e) 
            { 
                System.out.println("Socket closed!"); 
            } 
        }
    }
    
}

    @FXML
    private void sendButton(ActionEvent event) throws IOException{
        if(FirstStageController.getCategory().equals("Student")){
                message = textField.getText();
                 textArea.appendText("Me : "+message+"\n");
                    textField.clear();
                    if(message.equals("Exit")){
                        finished = true;
                        socket.leaveGroup(group); 
                        socket.close();
                        textArea.appendText("Socket is Closed !!! \n");
                        LoginSceneController.fourinOneStage.show();
                        FourInOneController.chatStage.close();

                    }
                    else{
                        message = studentManager.lgetName() + " : " + message;
                    byte[] buffer = message.getBytes();
                    DatagramPacket datagram = new DatagramPacket(buffer,buffer.length,group,port);
                    socket.send(datagram); 
                }
        }
       if(FirstStageController.getCategory().equals("Teacher")){
                message = textField.getText();
                 textArea.appendText("Me : "+message+"\n");
                    textField.clear();
                    if(message.equals("Exit")){
                        finished = true;
                        socket.leaveGroup(group); 
                        socket.close();
                        textArea.appendText("Socket is Closed !!! \n");
                        LoginSceneController.twoinone.show();
                        TwoInOneController.messageroom.close();
                    }
                    else{
                        message = teacherManager.lgetName() + " : " + message;
                    byte[] buffer = message.getBytes();
                    DatagramPacket datagram = new DatagramPacket(buffer,buffer.length,group,port);
                    socket.send(datagram); 
                }
        }
       if(FirstStageController.getCategory().equals("Alumni")){
                message = textField.getText();
                 textArea.appendText("Me : "+message+"\n");
                    textField.clear();
                    if(message.equals("Exit")){
                        finished = true;
                        socket.leaveGroup(group); 
                        socket.close();
                        textArea.appendText("Socket is Closed !!! \n");
                        LoginSceneController.twoinone.show();
                        TwoInOneController.messageroom.close();
                    }
                    else{
                        message = alumniManager.lgetName() + " : " + message;
                    byte[] buffer = message.getBytes();
                    DatagramPacket datagram = new DatagramPacket(buffer,buffer.length,group,port);
                    socket.send(datagram); 
                }
        }
       
                
    }

    
   public void setlabel(){
       if(FirstStageController.getCategory().equals("Student")){
           labelid.setText("Logged in as " + studentManager.lgetName());
       }
       else if(FirstStageController.getCategory().equals("Teacher")){
           labelid.setText("Logged in as " + teacherManager.lgetName());
       }
       else{
           labelid.setText("Logged in as " + alumniManager.lgetName());
       }
       
   }  
    
}
