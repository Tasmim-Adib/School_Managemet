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
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author adib
 */
public class FirstStageController implements Initializable {
       
    private static String category;
    @FXML
    private Font x1;
    @FXML
    private Font x2;
    @FXML
    private BorderPane borderCenter;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void alumniAction(ActionEvent event) throws IOException {
        category = "Alumni";
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Login.fxml"));
        Parent root = loader.load(); 
        borderCenter.setCenter(root);
        LoginController controller = loader.getController();
        controller.setlabel();
        
    }

    @FXML
    private void teacherAction(ActionEvent event) throws IOException {
        category = "Teacher";
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Login.fxml"));
        Parent root = loader.load(); 
        borderCenter.setCenter(root);
        LoginController controller = loader.getController();
        controller.setlabel();
       
    }

    @FXML
    private void adminAction(ActionEvent event) throws IOException {
        category = "Admin";
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("AdminLogin.fxml"));
        Parent root = loader.load(); 
        borderCenter.setCenter(root);
        
        
        
    }

    @FXML
    private void exitAction(ActionEvent event) {
        JavaFXApplication15.stage.close();
    }

    @FXML
    private void studentAction(ActionEvent event) throws IOException {
        category = "Student";
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Login.fxml"));
        Parent root = loader.load(); 
        borderCenter.setCenter(root);   
        LoginController controller = loader.getController();
        controller.setlabel();
    }
    
    public static String getCategory(){
        return category;
    }
}
