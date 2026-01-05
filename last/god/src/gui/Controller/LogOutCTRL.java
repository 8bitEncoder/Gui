package gui.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LogOutCTRL {
    @FXML private Button noBtn;
    @FXML private Button yesBtn;
    
    @FXML
    public void yes() {
        try {
            System.out.println("Logging out...");
            
            // Load login page
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/view/login.fxml"));
            Parent loginRoot = loader.load();
            
            // Get current stage
            Stage stage = (Stage) yesBtn.getScene().getWindow();
            stage.getScene().setRoot(loginRoot);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void no() {
        try {
            System.out.println("Returning to dashboard...");
            
            // Load dashboard/main page
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/view/Root.fxml"));
            Parent dashboardRoot = loader.load();
            
            // Get current stage
            Stage stage = (Stage) noBtn.getScene().getWindow();
            stage.getScene().setRoot(dashboardRoot);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}