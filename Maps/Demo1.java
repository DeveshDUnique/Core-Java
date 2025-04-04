package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo1 {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();

        hashMap.put(null, null);  // only one null key allowed in hashmap
        System.out.println("value of null key = " +hashMap.get(null));

        hashMap.put(1, null); // multiple null values allowed in the hashmap
        System.out.println(hashMap.get(1));


        linkedHashMap.put(null, null); // only one null key allowed in linkedhashmap
        System.out.println("Only one null key allowed in linkedhashmap = "+ linkedHashMap.get(null));

        linkedHashMap.put(11, null); // multiple null allowed in the linkedhashmaps
        System.out.println("Multiple null allowed in linkedhashmap = "+ linkedHashMap.get(11));

        treeMap.put(null, null); //java.lang.NullPointerException // NOT allowed
        System.out.println("Null in treemap ="+treeMap.get(treeMap));


        
    }
    
}
