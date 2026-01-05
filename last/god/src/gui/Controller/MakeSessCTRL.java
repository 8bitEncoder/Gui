package gui.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MakeSessCTRL {
    
    @FXML
    private VBox emptyStateBox;
    
    @FXML
    private Button addButton;
    
    @FXML
    private Label Label;
    
    @FXML
    private Label Label2;
    
    @FXML
    private void initialize() {
        // Initialization code if needed
        System.out.println("MakeSess page loaded");
        
    }
    
    @FXML
    private void handleAddNewSession() {
        System.out.println("Add New Session button clicked");
        // This will be implemented later
        // For now, just show a message
        Label2.setText("Add Session feature coming soon!");
        Label2.setStyle("-fx-text-fill: blue;");
    }
    
}