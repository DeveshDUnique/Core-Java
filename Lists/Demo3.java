package Lists;
/* fail-fast and fail-safe iterators. */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo3 {
    // while traversing the collection using iterator if the state of collection is modifies for eg: add/ delete operations
    // in between the traversing then its said to be fail fast iterators

    //Arraylist,linkedlist,vectors are fail-fast iterators.
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("a"); ls.add("b");ls.add("c");ls.add("d");
        Iterator<String> itr1 = ls.iterator();
        while (itr1.hasNext()) {
            String ele = itr1.next();
            System.out.print(ele);
            if (ele.equals("c")) {
               // ls.add("z"); // java.util.ConcurrentModificationException so its fail-fast.
            }
        }
        System.out.println();

        List<String> lss = new CopyOnWriteArrayList<>();
        lss.add("p");lss.add("q");lss.add("r");lss.add("s");
        Iterator<String> itr2 = lss.iterator();
        while (itr2.hasNext()) {
            String ele = itr2.next();
            if (ele.equals("q")) {
                lss.add("No ConcurrentModificationException");
            }
            System.out.println(ele);
        }
    }    
}
