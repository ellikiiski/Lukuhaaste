
package lukuhaaste.main;

import java.util.ArrayList;
import java.util.HashMap;

public class Organizer {
    private HashMap<Integer, Match> bestMatches;
    
    public Organizer() {
        this.bestMatches = new HashMap<>();
    }
    
    public HashMap<Integer, Match> organize(ArrayList<Match> matches) {
        for (Match match : matches) {
            int i = match.getCategoryId();
            if (!bestMatches.containsKey(i)) {
                bestMatches.put(i, match);
            } else if (match.getMatchValue() > bestMatches.get(i).getMatchValue()) {
                bestMatches.put(i, match);
            }
        }
        return bestMatches;
    }
}
