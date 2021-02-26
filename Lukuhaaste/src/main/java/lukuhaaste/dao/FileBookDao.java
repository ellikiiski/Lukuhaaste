
package lukuhaaste.dao;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import lukuhaaste.main.Book;

public class FileBookDao implements BookDao {
    
    private final ArrayList<Book> books;
    private final String fileName;
    
    public FileBookDao(String fileName) {
        this.books = new ArrayList<>();
        this.fileName = fileName;
        initBooks();
    }

    @Override
    public Book create(String name, String author) throws Exception {
        int id = books.size();
        Book book = new Book(id, name, author);
        books.add(book);
        save();
        return book;
    }

    @Override
    public Book findByName(String name) {
        return books.stream()
                .filter(b -> b.getName()
                .equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public ArrayList<Book> getAll() {
        return books;
    }
    
    private void initBooks() {
        try {
            Scanner reader = new Scanner(new File(fileName));
            while (reader.hasNextLine()) {
                String[] parts = reader.nextLine().split("\t");
                Book book = new Book(Integer.valueOf(parts[0]), parts[1], parts[2]);
                books.add(book);
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e);
        }
    }

    private void save() throws Exception {
        try (FileWriter writer = new FileWriter(new File(fileName))) {
            for (Book book : books) {
                writer.write(book.getId() + "\t" + book.getName() + "\t" + book.getAuthor() + "\n");
            }
        }
    }
}
