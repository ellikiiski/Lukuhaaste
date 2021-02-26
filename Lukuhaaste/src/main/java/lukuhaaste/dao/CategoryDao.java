
package lukuhaaste.dao;

import java.util.ArrayList;
import lukuhaaste.main.Category;

public interface CategoryDao {
    
    Category findById(int id);

    ArrayList<Category> getAll();
    
}
