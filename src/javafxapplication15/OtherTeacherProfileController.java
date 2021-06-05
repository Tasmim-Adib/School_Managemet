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
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author adib
 */
public class OtherTeacherProfileController implements Initializable {
    @FXML
    private BorderPane border;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ShowTeacherProfile.fxml"));
            Parent root = null; 
            try {
                root = loader.load();
            } catch (IOException ex) {
                Logger.getLogger(OtherTeacherProfileController.class.getName()).log(Level.SEVERE, null, ex);
            }
            border.setCenter(root);
            ShowTeacherProfileController controller = loader.getController();
            controller.setOtherData();
       
        
        
    }    

    @FXML
    private void BackAction(ActionEvent event) {
        OtherProfileLoginController.otherTeacherProfileStage.close();
    }
    
}
