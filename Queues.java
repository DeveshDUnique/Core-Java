import java.util.ArrayDeque;
import java.util.Queue;

public class Queues 
{
    public static void main(String[] args) 
    {
        //offer(), poll(),peek() return null in failure

        Queue<Integer>q1 = new ArrayDeque<>() ; //

        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);
        q1.offer(50);
        q1.offer(60);
   
        for (Integer integer : q1) 
        {
            q1.poll(); // removing the elements inthe queue
            System.out.println(integer);
            
        }
        System.out.println(q1.peek());//
        

    // add(), remove(), element() throws exception in case of failure.
    Queue<Integer>q2 = new ArrayDeque<Integer>();
    q2.add(1);
    q2.add(2);
    q2.add(3);
    q2.add(4);

    for (Integer integer : q2) {
        q2.remove();
        System.out.println(integer);
        
    }

    System.out.println(q2.element()); //.NoSuchElementException
    
    

    }
}
