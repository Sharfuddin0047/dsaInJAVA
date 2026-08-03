package collections.linkedlist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedListPractice {
    public static Node head;
    public static Node tail;

    //  Add First in linkedlist
    public void addFirst(int data) {
        //step 1 = create new node
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next = head; //link

        //step3 - head = newNode
        head = newNode;
    } 


    // Add Last in linkedlist
    public void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    public static void main(String[] args) {
        LinkedListPractice ll = new LinkedListPractice();

        ll.addFirst(1);
        ll.addFirst(2); 

        ll.addLast(3);
        ll.addLast(4);

    }
}
