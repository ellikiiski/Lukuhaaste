
package lukuhaaste.dao;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import lukuhaaste.main.Book;
import lukuhaaste.main.Category;

public class FileCategoryDao implements CategoryDao {
    
    private final ArrayList<Category> categories;
    private final String fileName;
    
    public FileCategoryDao(String fileName) {
        this.categories = new ArrayList<>();
        this.fileName = fileName;
        initCategories();
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
    
    private void initCategories() {
        try {
            Scanner reader = new Scanner(new File(fileName));
            while (reader.hasNextLine()) {
                String[] parts = reader.nextLine().split("\t");
                Category category = new Category(Integer.valueOf(parts[0]), parts[1]);
                categories.add(category);
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e);
        }
    }
    
    // tTOISTASEKSI TURHA, KOSKA KÄYTTÖLIITTYMÄSSÄ EI OLE MAHDOLLISUUTTA PÄIVITTÄÄ LUKUHAASTELISTAA
    /*private void save() throws Exception {
        try (FileWriter writer = new FileWriter(new File(fileName))) {
            for (Category category : categories) {
                writer.write(category.getId() + "\t" + category.getName() + "\n");
            }
        }
    }*/
    
}
