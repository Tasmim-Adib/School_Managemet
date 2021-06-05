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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author adib
 */
public class LoginController implements Initializable {
    public static String input;
    public static Stage loginSignupStage;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    public void setlabel(){
        switch (FirstStageController.getCategory()) {
            case "Student":
                label.setText("-----Student is Selected-----");
                break;
            case "Teacher":
                label.setText("-----Teacher is Selected-----");
                break;
            case "Alumni":
                label.setText("-----Alumni is Selected------");
                break;
            default:
                break;
        }
        
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginAction(ActionEvent event) throws IOException {
        input = "login";
        Parent root = FXMLLoader.load(getClass().getResource("LoginSignUpTogether.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Login or SignUp");
        this.loginSignupStage = stage;
        stage.show();
        JavaFXApplication15.stage.close();
    }

    @FXML
    private void signupAction(ActionEvent event) throws IOException {
        input = "signup";
        Parent root = FXMLLoader.load(getClass().getResource("LoginSignUpTogether.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Login or SignUp");
        this.loginSignupStage = stage;
        stage.show();
        JavaFXApplication15.stage.close();
    }
    public static String getInput(){
        return input;
    }
    
}
