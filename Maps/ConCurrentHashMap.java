package Maps;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> chm = new ConcurrentHashMap<>();

        chm.put(1, "One");
        chm.put(2, "Two");

       // chm.put(null, "Three"); // Null key not allowed here will throw NullPointerException
       // chm.put(5, null);  // Null values not allowed will throw NullPointerException

       for(Map.Entry<Integer,String> s : chm.entrySet()){
        System.out.println(s.getKey() + " " + s.getValue());
       }
        
    }
    
}
