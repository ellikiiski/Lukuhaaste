
package lukuhaaste.ui.views;

import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import lukuhaaste.ui.layouts.ListLayout;

public class ClearView implements View {
    
    private VBox layout;
    private ListLayout listLO;
    private final Label welcome;
    private final Text instructions;
    private final Button clear;
    private Scene scene;
    
    public ClearView(String rows) {
        this.listLO = new ListLayout(rows);
        this.welcome = new Label("LUKUHAASTE 2021");
        this.instructions = new Text("Ohjeet tähän");
        this.clear = new Button("Tyhennä kaikki");
        refresh();
    }

    @Override
    public void refresh() {
        layout = new VBox();
        layout.setSpacing(20);
        layout.getChildren().addAll(welcome, instructions, listLO.getLayout(), clear);
        scene = new Scene(layout, 600, 400);
    }

    @Override
    public Scene getScene() {
        refresh();
        return scene;
    }
    
}
