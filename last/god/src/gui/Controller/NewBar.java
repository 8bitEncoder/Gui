package gui.Controller;

import javafx.fxml.FXML;
import util.Navigator;

public class NewBar {
    private Navigator navigator;

    @FXML
    private void GoToDashboard() {
        //navigateTo("dashboard.fxml");
        System.out.println("dashboard");
    }
    
    @FXML
    private void GoToJoinSession() {
        //navigateTo("joinsession.fxml");
        // TODO: Implement register class
        System.out.println("join sess");
    }
    
    @FXML
    private void GoToPrivateSession() {
        //navigateTo("joinprivatesession.fxml");
        System.out.println("private");
    }
    
    @FXML
    private void GoToCreateSession() {
        //navigateTo("CreateSession.fxml");
        System.out.println("create");
    }
    
    @FXML
    private void GoToLogout() {
        //navigateTo("logout.fxml");
        System.out.println("logout");
    }

    //setter
    public void setNavigator(Navigator navigator) {
        this.navigator = navigator;
    }

}
