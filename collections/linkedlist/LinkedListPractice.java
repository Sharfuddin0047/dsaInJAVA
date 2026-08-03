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
    public static int size;

    // Add First in linkedlist
    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 - newNode next = head
        newNode.next = head; // link

        // step3 - head = newNode
        head = newNode;
    }

    // Add Last in linkedlist
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // print the linkedlist
    public void printLinkedList(Node head) { // O(n)
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add in the middle
    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i<idx-1) {
            temp= temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next=newNode;
    }

    // Remove First in linkedlist
    public int removeFirst() {

        if(size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head= head.next;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedListPractice ll = new LinkedListPractice();

        ll.printLinkedList(head);
        ll.addFirst(1);
        ll.addFirst(2);

        ll.printLinkedList(head);
        ll.addLast(3);
        ll.addLast(4);

        ll.add(2, 9);

        ll.printLinkedList(head);
        System.out.println(ll.size);

        ll.removeFirst();
        System.out.println(ll.printLinkedList(head));
    }
}
