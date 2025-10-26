package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        //Set<Products> set = new HashSet<>(); // duplicate based on Product's hashCode() + equals(), [any-order]
		Set<Products> set = new LinkedHashSet<>(); // duplicate based on Product's hashCode() + equals() [Insertion order is not maintained]
		//Set<Products> set = new TreeSet<>(); // duplicate based on Book's compareTo()
		
		set.add(new Products(3 , " Pen", 20.0));
		set.add(new Products(5, " Pencil", 5.0));
		set.add(new Products(1, " Eraser", 3.0));
		set.add(new Products(4, " Notebook", 80.0));
		set.add(new Products(2, " Marker", 50.0));
		set.add(new Products(5, " Pencil", 5.0)); // returns false if duplicate
		
		// for (Products p : set)
		// 	System.out.println(p);
		System.out.println(set);
	}
    }
    

