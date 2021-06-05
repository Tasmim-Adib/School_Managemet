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
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author adib
 */
public class TwoInOneController implements Initializable {
    public static Stage messageroom;
    @FXML
    private BorderPane Body;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(FirstStageController.getCategory().equals("Teacher")){
             FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ShowTeacherProfile.fxml"));
            Parent root = null; 
            try {
                root = loader.load();
            } catch (IOException ex) {
                Logger.getLogger(TwoInOneController.class.getName()).log(Level.SEVERE, null, ex);
            }
            Body.setCenter(root);
            ShowTeacherProfileController controller = loader.getController();
            controller.setData();
        }
        else if(FirstStageController.getCategory().equals("Alumni")){
             FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ShowAlumniProfile.fxml"));
            Parent root = null; 
            try {
                root = loader.load();
            } catch (IOException ex) {
                Logger.getLogger(TwoInOneController.class.getName()).log(Level.SEVERE, null, ex);
            }
            Body.setCenter(root);
            ShowAlumniProfileController controller = loader.getController();
            controller.setData();
        }
    }    

    @FXML
    private void profileAction(ActionEvent event) throws IOException {
        if(FirstStageController.getCategory().equals("Teacher")){
             FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ShowTeacherProfile.fxml"));
            Parent root = loader.load(); 
            Body.setCenter(root);
            ShowTeacherProfileController controller = loader.getController();
            controller.setData();
        }
        else if(FirstStageController.getCategory().equals("Alumni")){
             FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ShowAlumniProfile.fxml"));
            Parent root = loader.load(); 
            Body.setCenter(root);
            ShowAlumniProfileController controller = loader.getController();
            controller.setData();
        }
       
    }

    @FXML
    private void OtherProfileAcition(ActionEvent event) throws IOException {
        if(FirstStageController.getCategory().equals("Teacher")){
             FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("OtherProfileLogin.fxml"));
            Parent root = loader.load(); 
            Body.setCenter(root);
        }
        else if(FirstStageController.getCategory().equals("Alumni")){
             FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("OtherProfileLogin.fxml"));
            Parent root = loader.load(); 
            Body.setCenter(root);
        }
       
    }

    @FXML
    private void ChatroomAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Chatroom.fxml"));
            Parent root = loader.load(); 
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            this.messageroom = stage;
            stage.show();
            ChatroomController controller = loader.getController();
            controller.connection();
            controller.setlabel();
    }

    @FXML
    private void LogOutAction(ActionEvent event) {
        LoginController.loginSignupStage.show();
        LoginSceneController.twoinone.close();
    }

    @FXML
    private void ExitAction(ActionEvent event) {
        LoginSceneController.twoinone.close();
    }
    
}
