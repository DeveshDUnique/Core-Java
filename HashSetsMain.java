import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetsMain 
{

    public static void main(String[] args) {
    
    //Set<Product> set = new HashSet<>(); // duplicate based on Product's hashCode() + equals()
		Set<Products> set = new LinkedHashSet<>(); // duplicate based on Product's hashCode() + equals()
		//Set<Products> set = new TreeSet<>(); // duplicate based on Book's compareTo()

        set.add(new Products(3,"pen",26.5));
        set.add(new Products(5, "Pencil", 5.0));
		set.add(new Products(1, "Eraser", 3.0));
		set.add(new Products(4, "Notebook", 80.0));
		set.add(new Products(2, "Marker", 50.0));
		set.add(new Products(5, "scale", 5.0)); // returns false if duplicate as duplicate keys not allowed

        for (Products products : set) 
        {
            System.out.println(products);
            
        }

    }
    
}
