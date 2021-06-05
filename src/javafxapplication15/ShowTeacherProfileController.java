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

/**
 * FXML Controller class
 *
 * @author adib
 */
public class ShowTeacherProfileController implements Initializable {
    TeacherManager teacherManager = new TeacherManager();
    @FXML
    private Label username;
    @FXML
    private Label id;
    @FXML
    private Label category;
    @FXML
    private Label session;
    @FXML
    private Label dept;
    @FXML
    private Label address;
    @FXML
    private Label contact;
    @FXML
    private Label bg;
    @FXML
    private Label email;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    public void setData(){
        username.setText(teacherManager.lgetName());
        id.setText(teacherManager.lgetId());
        category.setText(teacherManager.lgetCategory());
        dept.setText(teacherManager.lgetDepartment());
        address.setText(teacherManager.lgetAddress());
        contact.setText(teacherManager.lgetContactNo());
        bg.setText(teacherManager.lgetBloodGroup());
        email.setText(teacherManager.lgetEmail());
        
    }
    public void setOtherData(){
        username.setText(teacherManager.getName());
        id.setText(teacherManager.getId());
        category.setText(teacherManager.getCategory());
        dept.setText(teacherManager.getDepartment());
        address.setText(teacherManager.getAddress());
        contact.setText(teacherManager.getContactNo());
        bg.setText(teacherManager.getBloodGroup());
        email.setText(teacherManager.getEmail());
        
    }
    
}
