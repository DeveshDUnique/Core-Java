import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Queues2 
{
    public static void main(String[] args) 
    {    
    // Deque as Stack (LIFO)
        Deque<Integer> q1 = new ArrayDeque<>();

        q1.offerFirst(10);
        q1.offerFirst(20);
        q1.offerFirst(30);
        q1.offerFirst(40);
        q1.offerFirst(50);

        for (Integer integer : q1) 
        {
            
            System.out.println(integer);
            q1.pollFirst();
            
        }
        System.out.println(q1.peekFirst()); /// returns null if empty
        

        // Dequeue as queue
        Deque<Integer> q2 = new ArrayDeque<>();
        q2.offerLast(1);
        q2.offerLast(2);
        q2.offerLast(3);
        q2.offerLast(4);

        for (Integer integer : q2) 
        {
            System.out.println(integer);
            q2.pollFirst();

            
        }

        System.out.println(q2.peekFirst());



    }

    
}
