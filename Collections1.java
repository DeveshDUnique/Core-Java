import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections1 
{
    public static void main(String[] args) 
    {
		List<String> list = new ArrayList<>();
		
		Collections.addAll(list, "A", "B", "C", "D", "E", "F");
		System.out.println("Original List: " + list);
		
		Collections.shuffle(list);
		System.out.println("Shuffled List: " + list);
		
		Collections.sort(list);
		System.out.println("Sorted List: " + list);
		
		Collections.reverse(list);
		System.out.println("Reveresed List: " + list);
		
		List<String> unmodList = Collections.unmodifiableList(list);
		//unmodList.add("X"); // throw UnsupportedOperationException
		
		List<String> syncList = Collections.synchronizedList(list);
		// syncList is synchronized/thread-safe collection
		// i.e. can be accessed by multiple threads simultaneously
		
		String maxVal = Collections.max(list);
		System.out.println("Max Val: " + maxVal);
	}
        
}
    

