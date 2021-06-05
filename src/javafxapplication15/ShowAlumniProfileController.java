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
public class ShowAlumniProfileController implements Initializable {
    AlumniManager alumniManager = new AlumniManager();
    @FXML
    private Label username;
    @FXML
    private Label category;
    @FXML
    private Label userId;
    @FXML
    private Label session;
    @FXML
    private Label address;
    @FXML
    private Label bg;
    @FXML
    private Label emailId;
    @FXML
    private Label contactId;
    @FXML
    private Label workId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setData(){
        username.setText(alumniManager.lgetName());
        category.setText(alumniManager.lgetCategory());
        userId.setText(alumniManager.lgetId());
        session.setText(alumniManager.lgetSession());
        address.setText(alumniManager.lgetAddress());
        bg.setText(alumniManager.lgetBloodGroup());
        emailId.setText(alumniManager.lgetEmail());
        contactId.setText(alumniManager.lgetEmail());
        workId.setText(alumniManager.lgetWorkingPlace());
    }
    public void setOtherData(){
        username.setText(alumniManager.getName());
        category.setText(alumniManager.getCategory());
        userId.setText(alumniManager.getId());
        session.setText(alumniManager.getSession());
        address.setText(alumniManager.getAddress());
        bg.setText(alumniManager.getBloodGroup());
        emailId.setText(alumniManager.getEmail());
        contactId.setText(alumniManager.getEmail());
        workId.setText(alumniManager.getWorkingPlace());
    }
}
