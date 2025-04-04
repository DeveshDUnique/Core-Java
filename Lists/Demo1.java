package Lists;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Demo1 {

    public static void main(String[] args) {
		//List<String> list = new ArrayList<>();
		//List<String> list = new LinkedList<>();
		List<String> list = new Vector<>();
		
		list.add("Nilesh");
		list.add("Nitin");
		list.add("Vishal");
		list.add("Prashant");
		
		// Random Access: add at index, remove from index, get from index, set at index.
		list.add(2, "Rahul");
		System.out.println(list.toString());
		// [Nilesh, Nitin, Rahul, Vishal, Prashant]
		
		list.remove(3);
		System.out.println(list.toString());
		// [Nilesh, Nitin, Rahul, Prashant]

		String ele = list.get(1);
		System.out.println("At Index 1: " + ele);
		
		list.set(2, "Pratik");
		System.out.println(list.toString());
		// [Nilesh, Nitin, Pratik, Prashant]

        //Bi-directional traversal
        System.out.println("Fordward traversal");
        ListIterator<String> ls = list.listIterator();
        while (ls.hasNext()) {
            String e = ls.next();
            System.out.print(e + " ");  
        }
        System.out.println();
        System.out.println("Backward traversal");
        ls =list.listIterator(list.size());
        while (ls.hasPrevious()) {
            String s = ls.previous();
            System.out.print(s +",");
        }
        System.out.println();


        // searching in list
		String key = "Pratik";
		int index = list.indexOf(key);
		if(index == -1)
			System.out.println(key + " not found in list.");
		else
			System.out.println(key + " found at index: " + index);

    }
    
}
