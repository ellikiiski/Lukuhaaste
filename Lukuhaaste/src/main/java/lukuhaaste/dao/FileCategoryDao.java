
package lukuhaaste.dao;

import java.util.ArrayList;
import lukuhaaste.main.Category;

public class FileCategoryDao implements CategoryDao {
    
    private final ArrayList<Category> categories;
    private final String fileName;
    
    public FileCategoryDao(String fileName) {
        this.categories = new ArrayList<>();
        this.fileName = fileName;
    }

    @Override
    public Category findById(int id) {
        // lieköhän toimii
        return categories.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public ArrayList<Category> getAll() {
        return categories;
    }
    
}
