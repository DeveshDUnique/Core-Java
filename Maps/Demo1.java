package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo1 {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>(); // uses hashCode() + equals()
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>(); // uses hashCode() + equals()
        Map<Integer,String> treeMap = new TreeMap<>(); //compare() method of the Comparator 

        hashMap.put(null, null);  // only one null key allowed in hashmap
        hashMap.put(null, null);
        hashMap.put(1, null); // multiple null values allowed in the hashmap
        hashMap.put(2, null);


        System.out.println(hashMap);
        
        // hashMap.forEach((key,value)->{
        //     System.out.println("HashMap-Key :"+key + ",HashMap-Value :"+value);
        // });
        
       
        linkedHashMap.put(null, null); // only one null key allowed in linkedhashmap
        linkedHashMap.put(null, null);
        linkedHashMap.put(6, null); // multiple null value allowed in the linkedhashmaps
        linkedHashMap.put(7, null);
        linkedHashMap.forEach((key,value)->{
            System.out.println("LinkedHashMap-Key :"+key + ",LinkedHashMap-Value :"+value);
        });
      //  System.out.println("Multiple null value allowed in linkedhashmap = "+ linkedHashMap.get(11));

        treeMap.put(null, null); //java.lang.NullPointerException // Null key not allowed
        treeMap.put(9, null); 
        treeMap.put(10, null);
        treeMap.forEach((key,value)->{
            System.out.println("TreeHashMap :"+key + ",TreeHashMap :"+value);
        });        
    }
    
}
