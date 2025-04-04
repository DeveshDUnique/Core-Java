package Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*Queue interface
Represents utility data structures (like Stack, Queue, ...) data structure.
Implementations: LinkedList, ArrayDeque, PriorityQueue.
Can be accessed using iterator, but no random access.
Methods
boolean add(E e) - throw IllegalStateException if full.
E remove() - throw NoSuchElementException if empty
E element() - throw NoSuchElementException if empty
boolean offer(E e) - return false if full.
E poll() - returns null if empty
E peek() - returns null if empty
In queue, addition and deletion is done from the different ends (rear and front). */
public class Queues {

    public static void main(String[] args) {

        // Create a LinkedList that implements the Queue interface.
        Queue<String> qs = new LinkedList<>();
        qs.offer("A"); qs.offer("B");qs.offer("C");qs.offer("D");
        System.out.println("Initial queue = "+qs);

        // Peek at the front of the queue (without removing)
        System.out.println("Peek at front = "+qs.peek());

        // Remove and return the element at the front of the queue (dequeue).
        System.out.println("Processed task = "+qs.poll());
        System.out.println(qs);

        // Check if the queue is empty.
        System.err.println("is queue empty = "+qs.isEmpty());

        // Process the remaining tasks
        while (!qs.isEmpty()) {
            System.out.println("Processing task = " + qs.poll());   
        }

        System.out.println(qs.isEmpty());

        /*Key Differences between LinkedList and PriorityQueue as Queues:

Order: LinkedList maintains the order in which elements were added (FIFO).
 PriorityQueue orders elements based on their priority (natural order or a custom comparator).
Use Cases:
Use LinkedList when you need a simple first-in, first-out queue, like for processing tasks in the order they were received.
Use PriorityQueue when you need to process elements based on their importance or priority, regardless of the order they were added.
Choose the implementation that best suits your specific needs!
PriorityQueue class
Internally PriorityQueue is a "binary heap" data structure.
Elements with highest priority is deleted first (NOT FIFO).
Elements should have natural ordering or need to provide comparator. */

        Queue<Integer> qi = new PriorityQueue<>();
        












    }

    
}
