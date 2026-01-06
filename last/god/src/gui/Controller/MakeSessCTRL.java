package gui.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import util.Navigable;
import util.Navigator;

public class MakeSessCTRL implements Navigable {
    
    @FXML private VBox emptyStateBox;
    @FXML private Button addButton;
    @FXML private Label Label;
    @FXML private Label Label2;

    private Navigator navigator;
    
    @FXML
    private void initialize() {
        // Initialization code if needed
        System.out.println("MakeSess page loaded");
        
    }
    
    @FXML
    private void handleAddNewSession() {
        System.out.println("Add New Session button clicked");
        if (navigator != null) {
            navigator.navigateTo("/gui/view/AddSess.fxml");
        }
        // This will be implemented later
        // For now, just show a message
        Label2.setText("Add Session feature coming soon!");
        Label2.setStyle("-fx-text-fill: blue;");
    }

    @Override
    public void setNavigator(Navigator navigator) {
        this.navigator = navigator;
    }
    
}