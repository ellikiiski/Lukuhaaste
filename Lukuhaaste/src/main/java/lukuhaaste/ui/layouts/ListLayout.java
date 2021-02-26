
package lukuhaaste.ui.layouts;

import java.util.ArrayList;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ListLayout implements Layout {
    
    private Text list;
    private VBox layout;
    
    public ListLayout(String rows) {
        this.list = new Text(rows);
        refresh();
    }

    @Override
    public void refresh() {
        layout = new VBox();
        layout.getChildren().add(list);
    }

    @Override
    public Pane getLayout() {
        refresh();
        return layout;
    }
    
}
