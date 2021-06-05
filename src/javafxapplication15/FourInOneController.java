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
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author adib
 */
public class FourInOneController implements Initializable {
    public static Stage chatStage;
    Admin admin = new Admin();
   
    @FXML
    private BorderPane mainContent;
    @FXML
    private Insets x4;
    @FXML
    private Font x1;
    @FXML
    private Color x3;
    @FXML
    private Color x2;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowProfile.fxml"));
        Parent root = null; 
        try {
            root = loader.load();
        } catch (IOException ex) {
            Logger.getLogger(FourInOneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainContent.setCenter(root);
        ShowProfileController controller = loader.getController();
        controller.setData();
    }    

    @FXML
    private void profileAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowProfile.fxml"));
        Parent root = loader.load(); 
        mainContent.setCenter(root);
        ShowProfileController controller = loader.getController();
        controller.setData();
    }

    @FXML
    private void resultAction(ActionEvent event) throws IOException {
        if(admin.resultUpload()){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("MyResult.fxml"));
            Parent root = loader.load(); 
            mainContent.setCenter(root);
            MyResultController controller = loader.getController();
            controller.setResult();
        }
        else{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("BlankAnchor.fxml"));
            Parent root = loader.load(); 
            mainContent.setCenter(root);
        }
        
    }

    @FXML
    private void otherProfileAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("OtherProfileLogin.fxml"));
        Parent root = loader.load(); 
        mainContent.setCenter(root);
    }

    @FXML
    private void chatroomAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Chatroom.fxml"));
            Parent root = loader.load(); 
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            this.chatStage = stage;
            stage.show();
            ChatroomController controller = loader.getController();
            controller.connection();
            controller.setlabel();
            
    }

    @FXML
    private void logoutAction(ActionEvent event) {
        LoginController.loginSignupStage.show();
        LoginSceneController.fourinOneStage.close();
    }

    @FXML
    private void exitAction(ActionEvent event) {
       LoginSceneController.fourinOneStage.close();
        
    }
    
}
