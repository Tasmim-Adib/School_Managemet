/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication15;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author adib
 */
public class AdminLoginController implements Initializable {
    public static Stage adminLoginStage;
    public static Stage adminPassword;
    @FXML
    private PasswordField passwordField;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitAction(ActionEvent event) throws IOException {
        
        if(passwordField.getText().equals("iamadmin")){
            passwordField.clear();
             Parent root = FXMLLoader.load(getClass().getResource("InputResult.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin");
            this.adminLoginStage = stage;
            stage.show();
            JavaFXApplication15.stage.close();
        }
        else{
            passwordField.clear();
             Parent root = FXMLLoader.load(getClass().getResource("AdminPasswordIncorrect.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            
            this.adminPassword= stage;
            stage.show();
            
        }
    }
    
}
