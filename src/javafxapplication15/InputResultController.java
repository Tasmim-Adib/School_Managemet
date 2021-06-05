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
public class InputResultController implements Initializable {
    public static Stage resultStage;
    @FXML
    private BorderPane updateborder;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Parent pare = null;
        try {
            pare = FXMLLoader.load(getClass().getResource("PutResult.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(InputResultController.class.getName()).log(Level.SEVERE, null, ex);
        }
        updateborder.setCenter(pare);
    }    

    @FXML
    private void logoutAction(ActionEvent event) {
        JavaFXApplication15.stage.show();
        AdminLoginController.adminLoginStage.close();
    }

    @FXML
    private void updateResult(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PutResult.fxml"));
        updateborder.setCenter(root);
    }
    
}
