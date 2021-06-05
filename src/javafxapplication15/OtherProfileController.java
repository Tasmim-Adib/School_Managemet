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
public class OtherProfileController implements Initializable {
    Admin admin = new Admin();
    @FXML
    private BorderPane border;
    @FXML
    private Font x1;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowProfile.fxml"));
        Parent pane = null; 
        try {
            pane = loader.load();
        } catch (IOException ex) {
            Logger.getLogger(OtherProfileController.class.getName()).log(Level.SEVERE, null, ex);
        }
        border.setCenter(pane);
        ShowProfileController controller = loader.getController();
        controller.setOtherData();
    }    

    @FXML
    private void friendProfile(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowProfile.fxml"));
        Parent root = loader.load(); 
        border.setCenter(root);
        ShowProfileController controller = loader.getController();
        controller.setOtherData();
    }

    @FXML
    private void friendResult(ActionEvent event) throws IOException {
        if(admin.resultUpload()){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("MyResult.fxml"));
            Parent root = loader.load(); 
            border.setCenter(root);
            MyResultController controller = loader.getController();
            controller.setOtherResult();
        }
        else{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("BlankAnchor.fxml"));
            Parent root = loader.load(); 
            border.setCenter(root);
        }
        
    }

    @FXML
    private void backAction(ActionEvent event) {
        OtherProfileLoginController.otherProfileStage.close();
    }
    
}
