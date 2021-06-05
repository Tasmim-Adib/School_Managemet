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
public class TeacherSignUpController implements Initializable {
    TeacherManager teacherManager = new TeacherManager();
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
    private TextField departmentField;
    @FXML
    private TextField idField;
    @FXML
    private TextField usernameField;
    @FXML
    private Label labelId;

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
        int id = Integer.parseInt(idno);
        idField.clear();
        String dept = departmentField.getText();
        departmentField.clear();
        String address = addressField.getText();
        addressField.clear();
        String bg = bgField.getText();
        bgField.clear();
        String contact = contactField.getText();
        contactField.clear();
        String email = emailField.getText();
        emailField.clear();
        String password = passwordField.getText();
        passwordField.clear();
        String category = FirstStageController.getCategory();
        
        teacherManager.createAccount(username,category, bg, contact, address, email, password, dept, id);
        labelId.setText(username + ", your account is Created!!");
    }
    
}
