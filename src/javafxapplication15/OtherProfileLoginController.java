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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author adib
 */
public class OtherProfileLoginController implements Initializable {
    public static Stage otherProfileStage;
    public static Stage otherTeacherProfileStage;
    public static Stage otherAlumniProfileStage;
    StudentManager studentManager = new StudentManager();
    TeacherManager teacherManager = new TeacherManager();
    AlumniManager alumniManager = new AlumniManager();
    @FXML
    private Button submit;
    @FXML
    private Color x1;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField idNoField;
    @FXML
    private Label label;
    @FXML
    private Color x2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitAction(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        usernameField.clear();
        String idno = idNoField.getText();
        idNoField.clear();
        int id = Integer.parseInt(idno);
        if(FirstStageController.getCategory().equals("Student")){
            if(studentManager.isValidStudentRoll(username,id)){
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("OtherProfile.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Information");
                this.otherProfileStage = stage;
                stage.show();
            }
        }
        else if(FirstStageController.getCategory().equals("Teacher")){
            
            if(teacherManager.isValidRoll(id)){
               
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("OtherTeacherProfile.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Information");
                this.otherTeacherProfileStage = stage;
                stage.show();
            }
        }
        
         else if(FirstStageController.getCategory().equals("Alumni")){
            
            if(alumniManager.isValidRoll(id)){
               
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("ShowOtherAlumniProfile.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Information");
                this.otherAlumniProfileStage = stage;
                stage.show();
            }
        }
    }
    
}
