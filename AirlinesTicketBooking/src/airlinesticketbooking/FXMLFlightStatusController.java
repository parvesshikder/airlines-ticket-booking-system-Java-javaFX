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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admiin
 */
public class FXMLFlightStatusController implements Initializable {

    
    String[] flightNum = {"JC120","JC130"};
    String Flight1;
    String Flight2;
    
    
    public void setFlight(){
        Flight1 = flightNum[0];
        Flight2 = flightNum[1];
    }
    
    public String getFlight1(){
        return Flight1;
    }
    
    public String getFlight2(){
        return Flight2;
    }
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
    private Button searchflightstatus;
    
    @FXML
    private TextField getflightstatus;
    
        @FXML
    private Label showflightststus;
        @FXML
    private Label showflightststus1;
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
        else if(event.getSource()==home){
            stage = (Stage) home.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        }
        else if(event.getSource()==modify){
            stage = (Stage) modify.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLModify.fxml"));
        }
        else if(event.getSource()==support){
            stage = (Stage) support.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLSupport.fxml"));
        }
        else if(event.getSource()==login){
            stage = (Stage) login.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLLogIn.fxml"));
        }
        else if(event.getSource()==searchflightstatus){
                String h = getflightstatus.getText();
                int x=0;
            
                 if (h.equals(flightNum[0])) {
                    showflightststus1.setText("Oops!   Flight to be delayed 1 Hour");
                    showflightststus.setText(" ");
                    
                }
                 else if (h == null ? flightNum[1] == null : h.equals(flightNum[1])) {
                    showflightststus1.setText("The flight will be Departed on Time.  ");
                    showflightststus.setText(" ");
                    
                }
                 else {
                    showflightststus.setText("Oops!  We can't find any flights matching your request. Check your details and try again!");
                    showflightststus1.setText(" ");
                    
                }
                
               

  
            
        }
        else{
            stage = (Stage) flightstatus.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLFlightStatus.fxml"));
        }
        
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public static void main(String[] args){
        JavaFlightStatus JF = new JavaFlightStatus();
        JF.setFlight();
        
    }
    
}


