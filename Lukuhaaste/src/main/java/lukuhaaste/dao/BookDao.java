
package lukuhaaste.dao;

import java.util.ArrayList;
import lukuhaaste.main.Book;

public interface BookDao {
    
    Book create(String name, String author) throws Exception;
    
    Book findByName(String name);
    
    Book findById(int id);

    ArrayList<Book> getAll();
    
}
