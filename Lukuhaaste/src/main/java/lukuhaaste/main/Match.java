
package lukuhaaste.main;

public class Match implements Comparable<Match>{
    private Book book;
    private Category category;
    public int match;
    
    public Match(Book book, Category category, int match) {
        this.book = book;
        this.category = category;
        this.match = match;
    }

    @Override
    public int compareTo(Match m) {
        return this.match - m.match;
    }
}
