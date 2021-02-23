
package lukuhaaste.main;

import java.util.ArrayList;

public class Control {
    private ArrayList<Read> reads;
    private Organizer organizer;
    
    public Control() {
        this.reads = new ArrayList<>();
        this.organizer = new Organizer();
    }
}
