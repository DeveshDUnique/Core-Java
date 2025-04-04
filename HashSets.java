import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSets 
{
    public static void main(String[] args) 
    {
        Set<String> hs = new HashSet<>(); //must implement equals and hashcode() // no order
        Set<String> hs1 = new LinkedHashSet<>(); //must implement equals and hashcode() //preserves insertion order
        Set<String> hs2 = new TreeSet<>(); //must implement comparable or comparator // sorting in ascending order

        hs.add("dev");
        hs.add("mon"); hs.add("rac");
        hs.add("phe"); hs.add("joy");
        hs.add("dev"); // duplicates not allowed

        for (String set : hs) 
        {
            System.out.println(set); //Hashset
            
        } 

        //
        System.out.println("\n Linkedhashset");
        hs1.add("shiv");
        hs1.add("patil");hs1.add("borse");hs1.add("patil");
        for(String set1: hs1)
        {
            System.out.println(set1); // order is preserved in linkedhashset
        }

        System.out.println("\n TreehashSet");
        hs2.add("no");hs2.add("yes");hs2.add("no");hs2.add("yes");hs2.add("can't say");

        for (String set2 : hs2) {
            System.out.println(set2); //order is sorted in ascending
            
        }
    }

}
