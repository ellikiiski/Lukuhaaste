
package lukuhaaste.main;

import java.util.ArrayList;
import java.util.HashMap;

public class Organizer {
    private HashMap<Integer, Book> bestMatches;
    
    public Organizer() {
        this.bestMatches = new HashMap<>();
    }
    
    public HashMap<Integer, Book> organize(ArrayList<Book> matches) {
        // alustava karvalakkiversio, parempi algo myöhemmin
        //bestMatches.put(1, matches.get(0));
        return bestMatches;
    }
}
