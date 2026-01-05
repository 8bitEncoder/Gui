package gui.Controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import util.Navigator;  // Add this import

public class MakeSessCTRL {
    
    @FXML
    private VBox card;  // Changed from 'emptyStateBox' to match FXML
    
    @FXML
    private Button addButton;
    
    @FXML
    private Label Label;
    
    @FXML
    private Label Label2;
    
    private Navigator navigator;  // Add navigator field
    
    @FXML
    private void initialize() {
        // Initialization code if needed
        System.out.println("MakeSess page loaded");
    }
    
     @FXML
    private void handleAddNewSession() {
        System.out.println("Add New Session button clicked");
        
        // Use the navigator injected by RootCtrl
        if (navigator != null) {
            navigator.navigateTo("/gui/view/AddSess.fxml");
        } else {
            System.err.println("ERROR: Navigator is null in MakeSessCTRL!");
            Label2.setText("Navigation error: No navigator available");
        }
    }
    

}