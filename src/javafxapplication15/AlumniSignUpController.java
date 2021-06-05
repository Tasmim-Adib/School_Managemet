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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author adib
 */
public class AlumniSignUpController implements Initializable {
    AlumniManager alumniManager = new AlumniManager();
    @FXML
    private Button submit;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField contactField;
    @FXML
    private TextField bgField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField sessionField;
    @FXML
    private TextField idField;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField workField;
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
    private void submitAction(ActionEvent event) {
        String username = usernameField.getText();
        usernameField.clear();
        String idno = idField.getText();
        idField.clear();
        int id = Integer.parseInt(idno);
        String session = sessionField.getText();
        sessionField.clear();
        String address = addressField.getText();
        addressField.clear();
        String contact = contactField.getText();
        contactField.clear();
        String email = emailField.getText();
        emailField.clear();
        String bg = bgField.getText();
        bgField.clear();
        String work = workField.getText();
        workField.clear();
        String password = passwordField.getText();
        passwordField.clear();
        
        String category = FirstStageController.getCategory();
        alumniManager.createAccount(username,category,bg, contact,address, email, password, id, session, work);
        label.setText(username + ", your account is Created!!");
    }
    
}
