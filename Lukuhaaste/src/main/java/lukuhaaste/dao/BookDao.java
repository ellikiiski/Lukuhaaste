
package lukuhaaste.dao;

import java.util.ArrayList;
import lukuhaaste.main.Book;

public interface BookDao {
    
    Book create(Book book) throws Exception;
    
    Book findByName(String name);

    ArrayList<Book> getAll();
    
}
