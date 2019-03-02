package data_structures.linked_list.singly.examples;

/* Node Class */
public class Node {
    public int data;
    public Node next, head;

    // Constructor to create a new node
    public Node(int d) {
        data = d;
        next = null;
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
    }

    /* This function is in LinkedList class. Inserts a
       new Node at front of the list. This method is
       defined inside LinkedList class shown above */
    public void pushInBeginning(int new_data) {
    /* 1 & 2: Allocate the Node &
              Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

}
