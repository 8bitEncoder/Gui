package gui.Controller;

import util.Navigable;
import util.Navigator;

public class AddSessCTRL implements Navigable{

    //Data members
    private Navigator navigator;
    @Override
    public void setNavigator(Navigator navigator) {
        this.navigator = navigator;
    }
    
    public void createSession(){System.out.println("nigga");
        if (navigator != null) {
            navigator.navigateTo("/gui/view/MakeSess.fxml");
        } else{System.out.println("navigator is null");}
    }
}
