package Maps;

import Lists.Node;

public class CustomHashMap<K,V> {

    static class Node<K,V> {
        K key;
        V value;
        Node<K,V> next;

        Node(K key, V value){
            this.key = key;
            this.value = value;
        }       
    }

    private final int SIZE = 16;

    private Node<K,V>[] buckets; // array named bucket of type Node<K,V>

    /*Node: This specifies the base type of the elements that the array will hold.
     Even though your Node class is generic (Node<K, V>), 
     Java has a limitation with generics and arrays called "type erasure."
    At runtime, Node<K, V> effectively becomes just Node (or its raw type).
    This is why you cannot write new Node<K, V>[SIZE] directly in Java. 
    The compiler won't allow it. You must use the raw type Node when creating the array. */

    public CustomHashMap() // constructor of CustomHashMap
    {
        buckets = new Node[SIZE]; // bucket of size 16
    }

    private int getBucketIndex(K key){
        return Math.abs(key.hashCode()) % SIZE;

    }

    // Insert the key,value

    public void put(K key, V value){
        int index = getBucketIndex(key);
        Node<K,V> head = buckets[index];

        //check if key exists in the bucket linkedList its a collision 
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
            
        }

        //// This indicates we need to add a brand new key-value pair its new "first item" is now your newNode.
        Node<K,V> newNode = new Node<>(key,value);
        newNode.next = buckets[index];
        buckets[index] = newNode;

    }

    // get the value at that index
    public V get(K key){
        int index = getBucketIndex(key);
        Node<K,V> head = buckets[index];
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
            
        }
        return null;

    }

    // remove value at that index

    public void remove(K key){
        int index = getBucketIndex(key);
        Node<K,V> head = buckets[index];
        Node<K,V> prev = null; /*It starts out holding nothing (null). As head moves through the line of items 
in the locker, this prev hand will follow right behind it, always pointing to the item just before head. This is crucial for "unlinking" an item later. */

        while (head !=null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = head.next; //Your item is the VERY FIRST one (buckets[index]) to now point 
                    //to the next item in the line (head.next). Your item is now completely bypassed and effectively removed from the beginning of the line.
                }else{
                    
                    prev.next = head.next; // 
                }
                return;
            }
            prev = head;
            head = head.next;
            
        }
    }


    public static void main(String[] args) {

        CustomHashMap<String,Integer> csm = new CustomHashMap<>();
        csm.put("apple", 20);
        csm.put("orange", 10);
        csm.put("banana", 5);


        System.out.println(csm.get("apple"));
        csm.remove("banana"); // removed banana

        System.out.println(csm.get("banana"));

        
    }
    
}
