/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication15;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author adib
 */
public class ShowProfileController implements Initializable {
    StudentManager studentManager = new StudentManager();
    @FXML
    private Color x2;
    @FXML
    private Font x1;
    @FXML
    private Label usernameField;
    @FXML
    private Font x3;
    @FXML
    private Label categoryField;
    @FXML
    private Label idField;
    @FXML
    private Label addressField;
    @FXML
    private Label contactField;
    @FXML
    private Label emailField;
    @FXML
    private Label bgField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setData(){
        usernameField.setText(studentManager.lgetName());
        categoryField.setText(studentManager.lgetcategory());
        idField.setText(studentManager.lgetRoll());
        addressField.setText(studentManager.lgetAddress());
        contactField.setText(studentManager.lgetContactNo());
        emailField.setText(studentManager.lgetEmail());
        bgField.setText(studentManager.lgetBloodGroup());
    }
     public void setOtherData(){
        usernameField.setText(studentManager.studentGetName());
        categoryField.setText(studentManager.studentGetCategory());
        idField.setText(studentManager.studentGetRoll());
        addressField.setText(studentManager.studentGetAddress());
        contactField.setText(studentManager.studentGetContactNo());
        emailField.setText(studentManager.studentGetEmail());
        bgField.setText(studentManager.studentGetBloodGroup());
    }
    
}
