
package lukuhaaste.main;

import java.util.ArrayList;
import java.util.HashMap;

public class Control {
    private ArrayList<Match> matches;
    private Organizer organizer;
    
    public Control() {
        this.matches = new ArrayList<>();
        this.organizer = new Organizer();
    }
    
    public void addMatch(String bookName, String bookAuthor, int categoryId, int match) {
        // pitää toteuttaa paremmin tietokantojen kanssa
        Book newBook = new Book(bookName, bookAuthor);
        Match newMatch = new Match(newBook, categoryId, 0);
        matches.add(newMatch);
    }
    
    private ArrayList<String> organizeList() {
        // pitää muokata vielä siten, että numerolla haetaan kategoria id:n mukaan
        HashMap<Integer, Match> bestMatches = organizer.organize(matches);
        ArrayList<String> rows = new ArrayList<>();
        int last = 0;
        for (int i : bestMatches.keySet()) {
            for (int j = i-1; j > last; j--) {
                String emptyRow = "Kategoria " + j + ": -";
                rows.add(emptyRow);
            }
            String newRow = "Kategoria " + i + ": " + bestMatches.get(i).getBook();
            rows.add(newRow);
        }
        return rows;
    }
    
    public String getList() {
        ArrayList<String> matchList = this.organizeList();
        StringBuilder sb = new StringBuilder("");
        for (String row : matchList) {
            sb.append(row + "\n");
        }
        return sb.toString();
    }
}