
package lukuhaaste.main;

public class Category {
    private int id;
    private String name;
    
    public Category(String name) {
        this.id = 0;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}
