/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinesticketbooking;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admiin
 */
public class FXMLRoundTripController {

    /**
     * Initializes the controller class.
     */

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
    private Label label;
    
    @FXML
    private Button roundtripbookingnow;
    
    @FXML
    private Button confirmbookingbutton;
    
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
         else if(event.getSource()==roundtripbookingnow){
             loadSceneAndSendMessage();
//            stage = (Stage) roundtripbookingnow.getScene().getWindow();
//            root = FXMLLoader.load(getClass().getResource("FXMLBookNow.fxml"));
        }
        else{
            stage = (Stage) flightstatus.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLFlightStatus.fxml"));
        }
        
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    private void loadSceneAndSendMessage() {
        try {
            //Load second scene
            Stage stage = new Stage();
            stage = null;
            stage = (Stage) roundtripbookingnow.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLBookNow.fxml"));
            Parent root = loader.load();
             
            //Get controller of scene2
            FXMLBookNowController scene2Controller = loader.getController();
            //Pass whatever data you want. You can have multiple method calls here
            scene2Controller.Multi();
            

 
            //Show scene 2 in new window            
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    
    
    public static void main(String[] args){
        
        
    }



    private static class actionBtn {

        public actionBtn() {
        }
    }
    
}
