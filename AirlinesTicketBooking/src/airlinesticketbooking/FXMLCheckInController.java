/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinesticketbooking;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admiin
 */
public class FXMLCheckInController {

    String[] BookingNum = {"12001","12002","12003","12004"};
    String Book1;
    String Book2;
    String Book3;
    String Book4;
    
    
    public void setFlight(){
        Book1 = BookingNum[0];
        Book2 = BookingNum[1];
        Book3 = BookingNum[2];
        Book4 = BookingNum[3];
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
    private TextField bookigNumber;

    @FXML
    private TextField surname;

    @FXML
    private ComboBox<String> checkDC;

    @FXML
    private Button checkinserch;

    @FXML
    private Label checkinmessagebox;

    
    ObservableList<String> list2 = FXCollections.observableArrayList("Kuala Lumpur", "Singapore");
    
    @FXML
    void changeScreenButtonPushed(ActionEvent event) {

    }
    
    public void initialize() {
        // TODO
         checkDC.setItems(list2);
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
         else if(event.getSource()==checkinserch){
                String h = bookigNumber.getText();
                String Name = surname.getText();
                int x=0;
            
                 if (h.equals(BookingNum[0])) {
                    checkinmessagebox.setText("Thank you " + Name + " your boarding pass is ready to print.");
                   
                    
                }
                 else if (h == null ? BookingNum[1] == null : h.equals(BookingNum[1])) {
                    checkinmessagebox.setText( "Thank you " + Name + " your boarding pass is ready to print.");
                    
                    
                }
                 else if (h == null ? BookingNum[2] == null : h.equals(BookingNum[2])) {
                    checkinmessagebox.setText( "Thank you " + Name + " your boarding pass is ready to print.");
                    
                    
                }
                 else if (h == null ? BookingNum[3] == null : h.equals(BookingNum[3])) {
                    checkinmessagebox.setText( "Thank you " + Name + " your boarding pass is ready to print.");
                    
                    
                }
                 else {
                    checkinmessagebox.setText("Oops!  We can't find any flights matching your request. Check your details and try again!");
                    
                    
                }
                
               

  
            
        }
        else{
            stage = (Stage) home.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        }
        
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
      
    public static void main(String[] args){
        FXMLCheckInController CC = new FXMLCheckInController();
        CC.setFlight();
        
    }
}


