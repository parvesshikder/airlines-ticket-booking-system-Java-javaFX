/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinesticketbooking;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
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
public class FXMLTicketController {

    /**
     * Initializes the controller class.
     */
    String lastName;
    @FXML
    private Label label;
        
    @FXML
    private TextField SHOWNAME; 

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
    private TextField FlightNumber;

    @FXML
    private TextField BookibgId;

    @FXML
    public TextField ticketFare;

    @FXML
    private TextField gst;

    @FXML
    public TextField totalfare;
    
    @FXML
    private Button paynow;

    @FXML
    private TextField pn;
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
        else if(event.getSource()==support){
            stage = (Stage) support.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLSupport.fxml"));
        }
        else if(event.getSource()==login){
            stage = (Stage) login.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLLogIn.fxml"));
        }
        else if(event.getSource()==paynow){
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
                
            alert.setTitle("Thank You");
            alert.setContentText("Ticket Booked Successfully!! Please Check Your Email");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
        
            }
        });
        }

        else{
            stage = (Stage) home.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        }
        
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        
        
    }
   

    
    public void FirstName(String SHOWNAME){
        this.SHOWNAME.setText(SHOWNAME);
        FlightNumber.setText("JC130");
        gst.setText("6%");
    }
    
    public void PassportNumber(String pn){
        this.pn.setText(pn);
        BookibgId.setText("12001");
    }

    public void Price(String T){
        ticketFare.setText(T);  
        double num1 = Double.parseDouble(ticketFare.getText());
        if(num1==336){
             ticketFare.setText("336.00");
             totalfare.setText("356.00");
        }
        else{
            ticketFare.setText("168.00");
            totalfare.setText("178.00");
        }
    }
    
    
    

    
    public static void main(String[] args) {
        
      
        
        
    }
}
