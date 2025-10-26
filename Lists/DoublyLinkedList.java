package Lists;

public class DoublyLinkedList<T> {
    /*Node Structure:

Each node contains: data, next , prev 
Bidirectional navigation capability 

*/

    private Node<T> head;
    private Node<T> tail;
    private int size;


    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size(){
        return size;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    private void addFirst(T data){
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            head = tail = newNode;
        }
        else{
            newNode.next = head; //Creates a forward link from new node to the old first node
            head.prev = newNode; // Creates a backward link from old first node to the new node
            head = newNode; // head now points to first node
        }
        size++;
    }

    private void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            head = tail = newNode;
        }else{
            newNode.prev = tail; // newNode previous to current tail
            tail.next = newNode; // current last node next to newNode
            tail = newNode;
        }
        size++;
    }



    public void addinLinkedList(int index,T data){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + "Size "+ size);
        }
         if (index == 0) {
            addFirst(data);
         }
         else if (index == size) {
            addLast(data);
         }
         else{
            Node<T> newNode = new Node<>(data);
            Node<T> current = getNode(index);

            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
         }
    }

    private Node<T> getNode(int index) {
        Node<T>current;

        if (index < size/2) {
            current = head;
            for(int i = 0; i< index; i++){
                current = current.next;
            }
        }else{
            current = tail;
            for(int i = size - 1; i>index ;i--){
                current = current.prev;
            }
        }
        return current;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> current = head; // head in specific Node format.
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append("<->");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }




    public static void main(String[] args) {

        DoublyLinkedList<Integer> dbl = new DoublyLinkedList<>();
        dbl.addFirst(10);
        dbl.addFirst(20);
        dbl.addFirst(30);
        dbl.addLast(40);

        System.out.println("Doubli-list = "+ dbl);

        
    }
    
}
