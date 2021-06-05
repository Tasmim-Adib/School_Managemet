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
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author adib
 */
public class MyResultController implements Initializable {
    StudentManager studentManager = new StudentManager();
    Admin admin = new Admin();
    @FXML
    private Color x1;
    @FXML
    private Label usernameLabel;
    @FXML
    private Color x2;
    @FXML
    private Label idLabel;
    @FXML
    private Label firstSubCode;
    
    @FXML
    private Label firstSubMark;
    @FXML
    private Label secondSubCode;
    @FXML
    private Label secondSubName;
    @FXML
    private Label secondsubMark;
    @FXML
    private Label thirdSubCode;
    @FXML
    private Label fourthSubCode;
    @FXML
    private Label fifthSubCode;
    @FXML
    private Label sixCode;
    @FXML
    private Label thirdSubName;
    @FXML
    private Label thirdSubmark;
    @FXML
    private Label fourthSubName;
    @FXML
    private Label fourSubmark;
    @FXML
    private Label fifthSubName;
    @FXML
    private Label fifthmark;
    @FXML
    private Label sixName;
    @FXML
    private Label sixMark;
    @FXML
    private Label firstSubName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setResult(){
        
        
        usernameLabel.setText(studentManager.lgetName());
        idLabel.setText(studentManager.lgetRoll());
        int id = Integer.parseInt(studentManager.lgetRoll());
        if(admin.matchLoginId(id)){
            int n = admin.mycourseNumber();
            for(int i = 0;i<=n;i++){
                if(i == 0){
                    firstSubCode.setText(admin.mySubjectCode(i));
                    firstSubName.setText(admin.mySubjectName(i));
                    firstSubMark.setText(admin.myMark(i));
                }
                else if(i == 1){
                    secondSubCode.setText(admin.mySubjectCode(i));
                    secondSubName.setText(admin.mySubjectName(i));
                    secondsubMark.setText(admin.myMark(i));
                }
                else if(i == 2){
                    thirdSubCode.setText(admin.mySubjectCode(i));
                    thirdSubName.setText(admin.mySubjectName(i));
                    thirdSubmark.setText(admin.myMark(i));
                }
                else if(i == 3){
                    fourthSubCode.setText(admin.mySubjectCode(i));
                    fourthSubName.setText(admin.mySubjectName(i));
                    fourSubmark.setText(admin.myMark(i));
                }
                else if(i == 4){
                    fifthSubCode.setText(admin.mySubjectCode(i));
                    fifthSubName.setText(admin.mySubjectName(i));
                    fifthmark.setText(admin.myMark(i));
                }
                else if(i == 5){
                    sixCode.setText(admin.mySubjectCode(i));
                    sixName.setText(admin.mySubjectName(i));
                    sixMark.setText(admin.myMark(i));
                }
            }
        }
        
      
    }
    public void setOtherResult(){
        
        
        usernameLabel.setText(studentManager.studentGetName());
        idLabel.setText(studentManager.studentGetRoll());
        int id = Integer.parseInt(studentManager.studentGetRoll());
        if(admin.matchId(id)){
            int n = admin.othercourseNumber();
            for(int i = 0;i<=n;i++){
                if(i == 0){
                    firstSubCode.setText(admin.otherSubjectCode(i));
                    firstSubName.setText(admin.otherSubjectName(i));
                    firstSubMark.setText(admin.otherMark(i));
                }
                else if(i == 1){
                    secondSubCode.setText(admin.otherSubjectCode(i));
                    secondSubName.setText(admin.otherSubjectName(i));
                    secondsubMark.setText(admin.otherMark(i));
                }
                else if(i == 2){
                    thirdSubCode.setText(admin.otherSubjectCode(i));
                    thirdSubName.setText(admin.otherSubjectName(i));
                    thirdSubmark.setText(admin.otherMark(i));
                }
                else if(i == 3){
                    fourthSubCode.setText(admin.otherSubjectCode(i));
                    fourthSubName.setText(admin.otherSubjectName(i));
                    fourSubmark.setText(admin.otherMark(i));
                }
                else if(i == 4){
                    fifthSubCode.setText(admin.otherSubjectCode(i));
                    fifthSubName.setText(admin.otherSubjectName(i));
                    fifthmark.setText(admin.otherMark(i));
                }
                else if(i == 5){
                    sixCode.setText(admin.otherSubjectCode(i));
                    sixName.setText(admin.otherSubjectName(i));
                    sixMark.setText(admin.otherMark(i));
                }
            }
        }
        
      
    }
    @FXML
    private void backAction(ActionEvent event) {
    }
    
}
