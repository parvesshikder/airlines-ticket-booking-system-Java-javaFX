package airlinesticketbooking;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FXMLDocumentController {

    @FXML
    private Label label;

    @FXML
    private Button sesrchButton;
    
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
    private ComboBox<String> from;

    @FXML
    private ComboBox<String> to;
    
    @FXML
    private CheckBox oneway;

    @FXML
    private DatePicker returndate;
    
    @FXML
    private CheckBox bothway;
    
        @FXML
    private ImageView sigtoklshow;

    @FXML
    private ImageView sigtoklflighttime;

    @FXML
    private Button sgtoklbookb;
    
    ObservableList<String> list1 = FXCollections.observableArrayList("Kuala Lumpur", "Singapore");
    ObservableList<String> list2 = FXCollections.observableArrayList("Kuala Lumpur", "Singapore");

   

    public void initialize() {
        // TODO
       from.setItems(list1);
       to.setItems(list2);
    }
    
   
    


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
        else if(oneway.isSelected()){
            returndate.setVisible(false);
            String c1 = from.getValue();
            
            if(event.getSource()==sesrchButton){
            stage = (Stage) sesrchButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLDispalyFlightDetails.fxml"));
        }
        }
        else if(!oneway.isSelected()){
            if(event.getSource()==sesrchButton){
            stage = (Stage) sesrchButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLRoundTrip.fxml"));
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
    
     public void handle(ActionEvent event) throws IOException 
                {
                     
                    
                }

   

   
    
}
