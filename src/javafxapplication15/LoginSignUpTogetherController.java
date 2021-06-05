/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication15;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

import javafx.scene.control.Label;

import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;



/**
 * FXML Controller class
 *
 * @author adib
 */
public class LoginSignUpTogetherController implements Initializable {

    StudentManager studentManager = new StudentManager();
    @FXML
    private Font x1;
    
    @FXML
    private Label label;
    @FXML
    private BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        if(LoginController.getInput().equals("login")){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("LoginScene.fxml"));
            Parent root = null; 
            try {
                root = loader.load();
            } catch (IOException ex) {
                Logger.getLogger(LoginSignUpTogetherController.class.getName()).log(Level.SEVERE, null, ex);
            }
            borderPane.setCenter(root);
        }
        else{
            if(FirstStageController.getCategory().equals("Student")){
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("SignUpStage.fxml"));
                Parent root = null; 
                try {
                    root = loader.load();
                } catch (IOException ex) {
                    Logger.getLogger(LoginSignUpTogetherController.class.getName()).log(Level.SEVERE, null, ex);
                }
                borderPane.setCenter(root);
            }
            else if(FirstStageController.getCategory().equals("Teacher")){
                 FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("TeacherSignUp.fxml"));
                Parent root = null; 
                try {
                    root = loader.load();
                } catch (IOException ex) {
                    Logger.getLogger(LoginSignUpTogetherController.class.getName()).log(Level.SEVERE, null, ex);
                }
                borderPane.setCenter(root);
            }
            else if(FirstStageController.getCategory().equals("Alumni")){
                 FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("AlumniSignUp.fxml"));
                Parent root = null; 
                try {
                    root = loader.load();
                } catch (IOException ex) {
                    Logger.getLogger(LoginSignUpTogetherController.class.getName()).log(Level.SEVERE, null, ex);
                }
                borderPane.setCenter(root);
            }
            
        }
    }    


    @FXML
    private void signUpButton(ActionEvent event) throws IOException {
       if(FirstStageController.getCategory().equals("Student")){
           FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("SignUpStage.fxml"));
            Parent root = loader.load(); 
            borderPane.setCenter(root);
       }
       else if(FirstStageController.getCategory().equals("Teacher")){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("TeacherSignUp.fxml"));
            Parent root = loader.load(); 
            borderPane.setCenter(root);
       }
        else if(FirstStageController.getCategory().equals("Alumni")){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("AlumniSignUp.fxml"));
            Parent root = loader.load(); 
            borderPane.setCenter(root);
       }
       
        
        
    }

    

    @FXML
    private void backAction(ActionEvent event) {
        JavaFXApplication15.stage.show();
        LoginController.loginSignupStage.close();
        
    }

    @FXML
    private void loginButton(ActionEvent event) throws IOException {
      /* 
        */
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginScene.fxml"));
        Parent root = loader.load(); 
        borderPane.setCenter(root);
        
        
    }
    
}
