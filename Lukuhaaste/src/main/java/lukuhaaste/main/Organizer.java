
package lukuhaaste.main;

import java.util.ArrayList;

public class Organizer {
    private ArrayList<Category> allCategories;
    private ArrayList<Match> allMatches;
    private ArrayList<Match> bestMatches;
    
    public Organizer() {
        this.allCategories = new ArrayList<>();
        this.allMatches = new ArrayList<>();
        this.bestMatches = new ArrayList<>();
    }
}
