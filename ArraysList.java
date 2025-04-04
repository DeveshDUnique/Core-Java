import java.util.ArrayList;

/*Can only hold objects (references). Primitives are automatically boxed (e.g., Integer, Double).
 (e.g., ArrayList<String>, ArrayList<Integer>) */

public class ArraysList {
    public static void main(String[] args) 
    { /*Use ArrayLists When:

        You don't know the size of the collection in advance, or it will change frequently.
        You need to add or remove elements dynamically.
        You want to use the rich set of built-in methods for collection manipulation (searching, sorting, etc.).
        You need to store objects (and using the object-oriented features of Java is important).
        You prefer ease of use and readability over marginal performance gains in basic operations (in most typical application scenarios). */
        ArrayList<String> names = new ArrayList<>(); // dynamic arraylist
        names.add("dev");
        names.add("shiv");
        names.add("bub");
        names.remove("bub");

        for (String string : names) {
            System.out.println(names);
        
        }

    }
    
}
