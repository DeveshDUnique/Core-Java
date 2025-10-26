package Queue;
/*Deque interface
Represents double ended queue data structure i.e. add/delete can be done from both the ends.
Two sets of methods
Throwing exception on failure: addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast().
Returning special value on failure: offerFirst(), offerLast(), pollFirst(), pollLast(), peekFirst(), peekLast().
Can used as Queue as well as Stack.
Methods
boolean offerFirst(E e)
E pollFirst()
E peekFirst()
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeues {
    public static void main(String[] args) {
        /*Deque interface provides a more complete and consistent set of LIFO stack operations*/

          Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front.
        deque.addFirst("A");
        System.out.println(deque);

        // Add elements to the back
        deque.addLast("Z");
        System.out.println(deque);

        // Peek at the first and last elements
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        // Remove elements from the front and back
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        //check if deque is empty
        System.out.println(deque.isEmpty());

        /*LinkedList might be preferred if you need to perform frequent insertions or deletions in the middle
         of the deque, as it doesn't require shifting elements like ArrayDeque. However,
          for typical deque usage (operations at the ends), ArrayDeque is usually the better 
          choice for performance. */





        
    }
    
}
