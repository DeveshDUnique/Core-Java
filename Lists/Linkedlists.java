package Lists;

import java.util.LinkedList;

public class Linkedlists {
    /*
        Internally LinkedList is doubly linked list.
        Elements can be traversed using Iterator, ListIterator, or using index.
        Primary use
        Add/remove elements (anywhere)
        Less contiguous memory available
        Inherited from List<>, Deque<>. 
*/
    public static void main(String[] args) {
        // Create a LinkedList to store Strings.
        LinkedList<String> ls = new LinkedList();

        // Add elements to the end of the list
        ls.add("One");
        ls.add("Two");
        ls.add("Three");

        System.out.println("Initial linked list ls = "+ls);

        // Add an element at a specific index
        ls.add(1,"orange");
        System.out.println("After adding element at index 1 = "+ls);

        // Add an element to the beginning of the list.
        ls.addFirst("Mango");
        System.out.println("After adding at the beginning "+ ls);

        // Access elements by index
        System.out.println(ls.get(0));

        // Iterate through the LinkedList using a for-each loop
        System.out.println("iterating linkedlist using the foreach");
        for (String ele : ls) {
            System.out.println(ele);
        }

         // Remove elements by value
         ls.remove("orange");
         System.out.println(ls);

         // Remove elements by index
         ls.remove(1);
         System.out.println(ls);

         // Check if an element exists
         System.out.println("checking if list contains Three =" + ls.contains("Three"));
         System.out.println("check if the list contains Orange = "+ls.contains("Orange"));

         //Get the size of the LinkedList
         System.out.println("The siz of linked list is ="+ ls.size());

        // Clear all elements from the LinkedList
        ls.clear();

        //check if the list is empty
        System.out.println(ls.isEmpty());







        
    }
    
}
