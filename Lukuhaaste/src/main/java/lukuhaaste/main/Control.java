
package lukuhaaste.main;

import java.util.ArrayList;

public class Control {
    private ArrayList<Match> matches;
    private Organizer organizer;
    
    public Control() {
        this.matches = new ArrayList<>();
        this.organizer = new Organizer();
    }
}
