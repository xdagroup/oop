public class DoublyLinkedList {

    // Represent a node of the doubly linked list

    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Represent the head and tail of the doubly linked list
    Node head, tail = null;

    // addNode() will add a node to the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            // Both head and tail will point to newNode
            head = tail = newNode;
            // head's previous will point to null
            head.previous = null;
            // tail's next will point to null, as it is the last node of the list
            tail.next = null;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode's previous will point to tail
            newNode.previous = tail;
            // newNode will become new tail
            tail = newNode;
            // As it is last node, tail's next will point to null
            tail.next = null;
        }
    }

    public void delete_node(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                if (current == head) {
                    head = head.next;
                }
                if (current == tail) {
                    tail = tail.previous;
                }
                if (current.previous != null) {
                    current.previous.next = current.next;
                }
                if (current.next != null) {
                    current.next.previous = current.previous;
                }
                System.out.println("\n" + current.data + " has been removed");
                current.previous = null;
                current.next = null;
                break;
            } else {
                current = current.next;
            }
        }

    }

    // display() will print out the nodes of the list
    public void display() {
        // Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current.next != null) {
            // Prints each node by incrementing the pointer.

            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print(current.data);

        // to display in reverse order
        System.out.println("\n");
        while (current.previous != null) {
            System.out.print(current.data + "-->");
            current = current.previous;
        }
        System.out.print(current.data);
    }

    public static void main(String[] args) {

        DoublyLinkedList dList = new DoublyLinkedList();
        // Add nodes to the list
        dList.addNode(5);
        dList.addNode(6);
        dList.addNode(7);
        dList.addNode(8);
        dList.addNode(9);

        // Displays the nodes present in the list
        dList.display();

        dList.delete_node(9);
        
        dList.display();
    }
}