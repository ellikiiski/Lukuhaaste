
package lukuhaaste.ui;

import java.util.HashMap;
import lukuhaaste.main.Control;
import javafx.application.Application;
import javafx.stage.Stage;
import javax.print.attribute.HashAttributeSet;
import lukuhaaste.ui.views.ClearView;

public class GUI extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        Control control = new Control("bookDB.txt", "lukuhaaste2021.txt");
        
        ClearView clear = new ClearView(control.getList());
        
        HashMap<Integer, Integer> matches = new HashMap<>();
        matches.put(1, 1);
        control.addBook("Harri Potteri", "JK Rowlingi", matches);
        
        stage.setScene(clear.getScene());
        stage.setTitle("Tervetuloa");
        stage.show();
        
    }
    
}
