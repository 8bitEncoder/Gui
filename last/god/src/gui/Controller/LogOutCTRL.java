package gui.Controller;

import util.Navigable;
import util.Navigator;

public class LogOutCTRL implements Navigable{
    //@FXML Button noBtn;
    //@FXML Button yesBtn;

    private Navigator navigator;
    //setter
    public void setNavigator(Navigator navigator) {
        this.navigator = navigator;
    }

    public void yes(){System.out.println("yes");}
    public void no() {
        if (navigator != null) navigator.navigateTo("/gui/view/dashboard.fxml");
        else {System.out.println("navigator is null");}
    }
}