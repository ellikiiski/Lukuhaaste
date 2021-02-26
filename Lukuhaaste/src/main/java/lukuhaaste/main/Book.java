
package lukuhaaste.main;

import java.util.ArrayList;
import java.util.HashMap;

public class Book {
    private int id;
    private String name;
    private String author;
    private HashMap<Integer, Integer> matches;
    
    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.matches = new HashMap<>();
    }
    
    public void addMatch(int categoryId, int matchValue) {
        matches.put(categoryId, matchValue);
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public HashMap<Integer, Integer> getMatches() {
        return matches;
    }
    
    public String getMatchesForDB() {
        StringBuilder sb = new StringBuilder("");
        for (int categoryId : matches.keySet()) {
            sb.append(":" + categoryId + "," + matches.get(categoryId));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return name + " - " + author;
    }
    
    
}
