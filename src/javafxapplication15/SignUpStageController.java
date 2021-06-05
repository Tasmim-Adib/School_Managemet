/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication15;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author adib
 */
public class SignUpStageController implements Initializable {
    StudentManager studentManager = new StudentManager();
    @FXML
    private TextField usernameField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField useridField;
    @FXML
    private TextField bgField;
    @FXML
    private TextField contactField;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submit(ActionEvent event) {
         try{
            String username = usernameField.getText();
            usernameField.clear();
            String address = addressField.getText();
            addressField.clear();
            String blood = bgField.getText();
            bgField.clear();
            String contact = contactField.getText();
            contactField.clear();
            String email = emailField.getText();
            emailField.clear();
            String password = passwordField.getText();
            passwordField.clear();
            String idno = useridField.getText();
            useridField.clear();
            int id = Integer.parseInt(idno);
            String category = FirstStageController.getCategory();

            studentManager.createStudentAccount(username,category,blood,contact,address,email,password,id);
            label.setText(username +", Your Account Created Successfully !");
            
        }
        
        catch(NullPointerException e) {
            System.out.println("NullPointerException thrown!");
	}
        
        
    }
    
}
