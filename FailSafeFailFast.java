import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeFailFast {

    public static void main(String[] args) {
		
		// fail-fast iterator
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		Iterator<String> itr1 = list1.iterator();
		while(itr1.hasNext()) {
			String ele = itr1.next(); // throws ConcurrentModificationException after adding "X".
			System.out.println(ele);
			if(ele.equals("C"))
				list1.add("X");
		}
		
		
		// fail-safe iterator.
		List<String> list2 = new CopyOnWriteArrayList<>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");
		Iterator<String> itr2 = list2.iterator();
		while(itr2.hasNext()) 
        {
			String ele = itr2.next(); // doesn't throw ConcurrentModificationException
			if(ele.equals("C"))
				list2.add("X");
            System.out.println(ele);
		}
	}
}
