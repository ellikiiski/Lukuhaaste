
package lukuhaaste.main;

public class Match {
    private Book book;
    private int categoryId;
    public int match;
    
    public Match(Book book, int categoryId, int match) {
        this.book = book;
        this.categoryId = categoryId;
        this.match = match;
    }
    
    public int getCategoryId() {
        return categoryId;
    }
    
    public Book getBook() {
        return book;
    }
    
    public int getMatchValue() {
        return match;
    }
}
