/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinesticketbooking;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admiin
 */
public class FXMLSupportController implements Initializable {

    /**
     * Initializes the controller class.
     */
        @FXML
    private Label label;

    @FXML
    private Button home;

    @FXML
    private Button checkin;

    @FXML
    private Button flightstatus;

    @FXML
    private Button modify;

    @FXML
    private Button support;

    @FXML
    private Button login;
    
    @FXML
    private TextField emailaddress;

    @FXML
    private Button sendbutton;
    
    @FXML
    void changeScreenButtonPushed(ActionEvent event) {

    }

     @FXML
    private void handleButtonAction (ActionEvent event) throws Exception {
        Stage stage = null;
        Parent root = null;

        
            

        if(event.getSource()==checkin){
            stage = (Stage)checkin.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLCheckIn.fxml"));
        }
        else if(event.getSource()==flightstatus){
            stage = (Stage) flightstatus.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLFlightStatus.fxml"));
        }
        else if(event.getSource()==modify){
            stage = (Stage) modify.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLModify.fxml"));
        }
        else if(event.getSource()==home){
            stage = (Stage) home.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        }
        else if(event.getSource()==login){
            stage = (Stage) login.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLLogIn.fxml"));
        }
        else if(event.getSource()==sendbutton){
            if(emailaddress.getText().trim().isEmpty()){
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Try Again");
            alert.setContentText("Email is Required");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
        
            }
        });
            }
            else{
                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Thanks");
            alert.setContentText("Thank you for sending us a Message ");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
        
            }
        });
                
        }
        }
        else{
            stage = (Stage) support.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLSupport.fxml"));
        }
        
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
