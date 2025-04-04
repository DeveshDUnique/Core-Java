import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMaps 
{
    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<>(); // unordered hashmap
        // Map<Integer,String> mp1 = new LinkedHashMap<>(); // order as the user inputs
        // Map<Integer,String> mp2 = new TreeMap<>(); // ascending order 
        // Map<Integer,String> ht =  new Hashtable<>(); // Legacy since 1.0

        mp.put(400027, "Byculla Mumbai");
        mp.put(410028, "Sion Mumbai");

        mp.put(500077, "woroli Mumbai");

        mp.put(402227, "Dadar Mumbai");

        mp.put(403987, "juhu Mumbai");

        // Iterating and printing the map entries using a for-each loop
        for (Map.Entry<Integer, String> entry : mp.entrySet())
        {
            System.out.println("Pincode " + entry.getKey() + " Location " + entry.getValue());
        }
        System.out.println(mp.toString());

    }  
}
