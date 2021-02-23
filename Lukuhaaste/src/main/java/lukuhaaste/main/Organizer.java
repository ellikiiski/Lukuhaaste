
package lukuhaaste.main;

import java.util.ArrayList;

public class Organizer {
    private ArrayList<Category> allCategories;
    private ArrayList<Read> reads;
    private ArrayList<Match> bestMatches;
    
    public Organizer() {
        this.allCategories = new ArrayList<>();
        this.reads = new ArrayList<>();
        this.bestMatches = new ArrayList<>();
    }
}
