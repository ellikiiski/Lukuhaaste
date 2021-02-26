
package lukuhaaste.ui;

import lukuhaaste.main.Control;
import javafx.application.Application;
import javafx.stage.Stage;
import lukuhaaste.ui.views.ClearView;

public class GUI extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        Control control = new Control();
        
        ClearView clear = new ClearView(control.getList());
        
        stage.setScene(clear.getScene());
        stage.setTitle("Tervetuloa");
        stage.show();
        
    }
    
}
