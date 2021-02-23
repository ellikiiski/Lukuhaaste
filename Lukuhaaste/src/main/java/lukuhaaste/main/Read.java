
package lukuhaaste.main;

import java.util.ArrayList;

public class Read {
    private int id;
    private Book book;
    private ArrayList<Match> matches;
    private boolean listened;
    
    public Read(Book book, boolean listened) {
        this.id = 0;
        this.book = book;
        this.matches = new ArrayList<>();
        this.listened = listened;
    }
}
