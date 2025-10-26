package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Collections class
Helper class that contains all static methods.
We never create object of "Collections" class.
 */
public class Collectionss {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        Collections.addAll(ls,"A","B","C","D","E");
        System.out.println("Original list "+ ls);

        Collections.shuffle(ls);
        System.out.println("Shuffeled list "+ls);

        Collections.sort(ls);
        System.out.println("Sorted list "+ls);

        Collections.reverse(ls);
        System.out.println("Reverse list "+ls);

        List<String> unmodList = Collections.unmodifiableList(ls);
		//unmodList.add("X"); // throw UnsupportedOperationException

        /*Collection classes in collection framework (since 1.2) are non-synchronized (for better performance).
            Collection classes can be converted to synchronized collection using Collections class methods.
            syncList = Collections.synchronizedList(list)
            syncSet = Collections.synchronizedSet(set)
            syncMap = Collections.synchronizedMap(map) */

        // syncList is synchronized/thread-safe collection
		// i.e. can be accessed by multiple threads simultaneously
          List<String>  syncList = Collections.synchronizedList(ls);
          syncList.add("X");
          syncList.remove(3);
          System.out.println("Synchronized list = "+ syncList);

        String maxVal = Collections.max(ls);
		System.out.println("Max Val: " + maxVal);



    }
    
}
