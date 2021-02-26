
package lukuhaaste.main;

import java.util.ArrayList;
import java.util.HashMap;
import lukuhaaste.dao.FileBookDao;
import lukuhaaste.dao.FileCategoryDao;

public class Control {
    
    private ArrayList<Match> matches;
    private Organizer organizer;
    
    private FileBookDao bookDB;
    private FileCategoryDao categoryDB;
    
    public Control() {
        this.matches = new ArrayList<>();
        this.organizer = new Organizer();
        
        this.bookDB = new FileBookDao("bookDB.txt");
        this.categoryDB = new FileCategoryDao("lukuhaaste2021.txt");
    }
    
    public void addMatch(String bookName, String bookAuthor, int categoryId, int match) {
        // pitää testata
        try {
            Book book = bookDB.findByName(bookName);
            if (book == null) {
                book = bookDB.create(bookName, bookAuthor);                
            }
            Match newMatch = new Match(book, categoryId, match);
            matches.add(newMatch);
        } catch (Exception e) {
            System.out.println("Virhe: " + e);
        }
    }
    
    private ArrayList<String> organizeList() {
        // pitää testata
        HashMap<Integer, Match> bestMatches = organizer.organize(matches);
        ArrayList<String> rows = new ArrayList<>();
        int last = 0;
        for (int i : bestMatches.keySet()) {
            for (int j = i-1; j > last; j--) {
                String emptyRow = categoryDB.findById(j).getName() + ": -";
                rows.add(emptyRow);
            }
            String newRow = categoryDB.findById(i).getName() + ": " + bestMatches.get(i).getBook();
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