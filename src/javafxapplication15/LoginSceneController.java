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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author adib
 */
public class LoginSceneController implements Initializable {
    public static Stage fourinOneStage;
    public static Stage notValid;
    public static Stage twoinone;
    StudentManager studentManager = new StudentManager();
    TeacherManager teacherManager = new TeacherManager();
    AlumniManager alumniManager = new AlumniManager();
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField useridField;
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
    private void submitAction(ActionEvent event) throws IOException {
        String idno = useridField.getText();
        useridField.clear();
        int id = Integer.parseInt(idno);
        String password = passwordField.getText();
        passwordField.clear();
        if((FirstStageController.getCategory()).equals("Student")){
            if(studentManager.isValidStudentUserid(id)){
                
                if(studentManager.studentPasswordMatch(password)){
                    
                    Parent root = FXMLLoader.load(getClass().getResource("FourInOne.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Information");
                    this.fourinOneStage = stage;
                    stage.show();
                    LoginController.loginSignupStage.close();
                }
                else{
                    Parent root = FXMLLoader.load(getClass().getResource("NotValid.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    
                    this.notValid = stage;
                    stage.show();
                }
            }
            
        }
        
        else if((FirstStageController.getCategory()).equals("Teacher")){
            if(teacherManager.isValidUserId(id)){
                if(teacherManager.passwordMatch(password)){
                     Parent root = FXMLLoader.load(getClass().getResource("TwoInOne.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Information");
                    this.twoinone = stage;
                    stage.show();
                    LoginController.loginSignupStage.close();
                }
                else{
                    Parent root = FXMLLoader.load(getClass().getResource("NotValid.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    
                    this.notValid = stage;
                    stage.show();
                }
            }
        }
        
        else if((FirstStageController.getCategory()).equals("Alumni")){
            if(alumniManager.isValidUserId(id)){
                if(alumniManager.passwordMatch(password)){
                     Parent root = FXMLLoader.load(getClass().getResource("TwoInOne.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Information");
                    this.twoinone = stage;
                    stage.show();
                    LoginController.loginSignupStage.close();
                }
                else{
                    Parent root = FXMLLoader.load(getClass().getResource("NotValid.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    
                    this.notValid = stage;
                    stage.show();
                }
            }
        }
        
    }
    
}
