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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author adib
 */
public class PutResultController implements Initializable {
    Admin admin = new Admin();
    int l = -1;
    private int subjectCode[] = new int[20];
    private String subjectName[] = new String[20];
    private int mark[] = new int[20];
    @FXML
    private TextField idField;
    @FXML
    private TextField subjectCodeField;
    @FXML
    private TextField markField;
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
    private void moreAction(ActionEvent event) {
        l++;
        subjectCode[l] = Integer.parseInt(subjectCodeField.getText());
        subjectCodeField.clear();
        subjectName[l] = admin.setSubjectName(subjectCode[l]);
        mark[l] = Integer.parseInt(markField.getText());
        markField.clear();
    }

    @FXML
    private void doneAction(ActionEvent event) {
        String idno = idField.getText();
        int id = Integer.parseInt(idno);
        idField.clear();
        l++;
        subjectCode[l] = Integer.parseInt(subjectCodeField.getText());
        subjectCodeField.clear();
        subjectName[l] = admin.setSubjectName(subjectCode[l]);
        mark[l] = Integer.parseInt(markField.getText());
        markField.clear();
        admin.createResult(id,subjectCode, subjectName, mark, l);
        l = -1;
        label.setText("Result is set for Id : "+ id);
    }
    
    
}
