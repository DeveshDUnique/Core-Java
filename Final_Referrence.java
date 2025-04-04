import java.util.ArrayList;
import java.util.List;

public class Final_Referrence {
    /*In Java, we can declare reference final.
• But we can not declare instance final. */

public static void main(String[] args) {
    String anotherMessage = "Initial";
    final String finalMessageRef = anotherMessage; // 'finalMessageRef' points to the object 'anotherMessage' refers to
    System.out.println(finalMessageRef);
    
    anotherMessage = "Changed";
    System.out.println(anotherMessage);
    System.out.println(finalMessageRef);


    final List<String> names = new ArrayList<>(); // 'names' is a final reference to a mutable ArrayList
        System.out.println(names); // Output: []

        names.add("Alice"); // Valid: We are modifying the *object* that 'names' refers to
        names.add("Bob");   // Valid: Modifying the object again
        System.out.println(names); // Output: [Alice, Bob]
        //we can not declare instance final.
         //names = new ArrayList<>(); // Compile-time error! Cannot reassign 'names' (final reference)

}
    
}
