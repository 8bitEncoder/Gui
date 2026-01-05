package gui.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.Navigator;

public class AddSessCTRL implements Navigator {
    
    // Navigator for page switching
    private Navigator navigator;
    
    // FXML injections from your AddSess.fxml
    @FXML private TextField subjectField;
    @FXML private TextField locationField;
    @FXML private TextField descriptionField;
    @FXML private TextField timeField;
    @FXML private TextField capacityField;
    @FXML private Button createButton;
    @FXML private Label Label;
    @FXML private Label Label2;
    
    // Initialize method (optional)
    @FXML
    private void initialize() {
        System.out.println("AddSess page loaded");
        
        // You can set up initial values or listeners here
        // For example, validate inputs as user types
    }
    
    // Handle CREATE button click
    @FXML
    private void createSession() {
        System.out.println("Create Session button clicked");
        
       // Show success message
            Label2.setText("Session created successfully!");
            Label2.setStyle("-fx-text-fill: green;");
            
        
    }
    
    
    // Method to go back to MakeSess page
    public void goBackToMakeSess() {
        if (navigator != null) {
            navigator.navigateTo("/gui/view/MakeSess.fxml");
        } else {
            // Fallback if navigator not set
            try {
                Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("/gui/view/MakeSess.fxml"));
                Stage stage = (Stage) createButton.getScene().getWindow();
                stage.setScene(new Scene(root));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    // Add a back button handler (if you add a back button to your FXML)
    @FXML
    private void handleBackButton() {
        goBackToMakeSess();
    }
    
    // Setter for navigator (required for navigation)
    public void setNavigator(Navigator navigator) {
        this.navigator = navigator;
    }

    @Override
    public void navigateTo(String fxml) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'navigateTo'");
    }
}