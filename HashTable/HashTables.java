package HashTable;
import java.util.Hashtable;
import java.util.Map;


public class HashTables {

    public static void main(String[] args){
        Hashtable<String,Integer> htab = new Hashtable<>(); 
            
        htab.put("One",1);
        htab.put("One",9); //duplicate key will overide the previous value
        htab.put("Two",2);
        htab.put("Three",3);

       // htab.put(null, 7); // Null key not alllowed will give nullPointer Exception.
       // htab.put("key", null); // Null value not allowed.

        for(Map.Entry<String,Integer> e : htab.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }   
}
