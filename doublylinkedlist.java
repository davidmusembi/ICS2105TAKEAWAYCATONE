package ICS2105TAKEAWAYCATONE;

class DoublyLinkedListNode {
    public int data;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
        this.prev = null;
    }
}

public class doublylinkedlist {
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        // Create a new node with the given data value
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        // If the list is empty, return the new node as the head
        if (head == null)
            return newNode;
        // If the new node should be inserted at the head, update the head
        if (head.data >= data) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        // Find the proper location to insert the new node
        DoublyLinkedListNode current = head;
        while (current.next != null && current.next.data < data)
            current = current.next;
        // Insert the new node at the proper location
        newNode.next = current.next;
        if (current.next != null)
            current.next.prev = newNode;
        current.next = newNode;
        newNode.prev = current;
        // Return the head of the updated list
        return head;
    }

    public static void main(String[] args) {
        // Initialize the doubly-linked list
        DoublyLinkedListNode head = new DoublyLinkedListNode(1);
        head.next = new DoublyLinkedListNode(3);
        head.next.prev = head;
        head.next.next = new DoublyLinkedListNode(4);
        head.next.next.prev = head.next;
        head.next.next.next = new DoublyLinkedListNode(10);
        head.next.next.next.prev = head.next.next;
        // Insert a new node with data value 5
        head = sortedInsert(head, 5);
        // Print the updated list
        DoublyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
