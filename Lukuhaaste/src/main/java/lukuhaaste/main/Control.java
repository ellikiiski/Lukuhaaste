
package lukuhaaste.main;

import java.util.ArrayList;
import java.util.HashMap;
import lukuhaaste.dao.FileBookDao;
import lukuhaaste.dao.FileCategoryDao;

public class Control {
    
    private FileBookDao bookDB;
    private FileCategoryDao categoryDB;
    private ArrayList<Book> books;
    private Organizer organizer;
    
    public Control(String bookFileName, String categoryFileName) {
        this.bookDB = new FileBookDao(bookFileName);
        this.categoryDB = new FileCategoryDao(categoryFileName);        
        this.books = bookDB.getAll();
        this.organizer = new Organizer();        
    }
    
    public void addBook(String bookName, String bookAuthor, HashMap<Integer, Integer> matches) throws Exception {
        Book book = bookDB.create(bookName, bookAuthor);
        for (int categoryId : matches.keySet()) {
            bookDB.addMatch(book.getId(), categoryId, matches.get(categoryId));
        }
    }
    
    private ArrayList<String> organizeList() {
        // pitää testata
        HashMap<Integer, Book> bestMatches = organizer.organize(books);
        ArrayList<String> rows = new ArrayList<>();
        int last = 0;
        for (int i : bestMatches.keySet()) {
            for (int j = i-1; j > last; j--) {
                String emptyRow = categoryDB.findById(j).getName() + ": -";
                rows.add(emptyRow);
            }
            String newRow = categoryDB.findById(i).getName() + ": " + bestMatches.get(i);
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