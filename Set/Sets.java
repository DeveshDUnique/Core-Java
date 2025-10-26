package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    /*Set interface
Collection of unique elements (NO duplicates allowed).
Implementations: HashSet, LinkedHashSet, TreeSet.
Elements can be accessed using an Iterator.
Abstract methods (same as Collection interface)
add() returns false if element is duplicate

HashSet class
Non-ordered set (elements stored in any order)
Elements must implement equals() and hashCode()
Fast execution

LinkedHashSet class
Ordered set (preserves order of insertion)
Elements must implement equals() and hashCode()
Slower than HashSet

TreeSet class
Sorted navigable set (stores elements in sorted order)
Elements must implement Comparable or provide Comparator
Slower than HashSet and LinkedHashSet*/

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>(); // duplicate based on Product's hashCode() + equals(), [any-order]
        Set<String> linkedSet = new LinkedHashSet<>();// duplicate based on Product's hashCode() + equals() [Insertion order is not maintained]
        Set<String> treeSet = new TreeSet<>();// does not overide the equals and the hashcode method as its based on the compareTo method

        hashSet.add("A");hashSet.add("B");hashSet.add("C");
        hashSet.add(null); // null allowed in hashset
        hashSet.add(null);// multiple nulls will be considered as one null only
        System.out.println("Hashset = "+hashSet);

        linkedSet.add("A");linkedSet.add("B");linkedSet.add("C");
        linkedSet.add(null); // null allowed in linkedset
        linkedSet.add(null); // multiple nulls will be considered as one null only
        System.out.println("LinkedHashSet = "+linkedSet);

        treeSet.add("A");treeSet.add("B");treeSet.add("C");
       // treeSet.add(null); // java.lang.NullPointerException // not allowed
        System.out.println("Treeset = "+treeSet);
      
    }
    
}
