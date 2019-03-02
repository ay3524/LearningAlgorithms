package data_structures.linked_list.singly.core;

public class Test {

    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList linkedList = new LinkedList();

        linkedList.head = new Node(1);

        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node

        linkedList.printList();

        /* Three nodes have been allocated  dynamically.
          We have references to these three blocks as first,
          second and third

          linkedList.head        second              third
             |                |                  |
             |                |                  |
         +----+------+     +----+------+     +----+------+
         | 1  | null |     | 2  | null |     |  3 | null |
         +----+------+     +----+------+     +----+------+ */

        /*  Now next of first Node refers to second.  So they
            both are linked.

         linkedList.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */

        /*  Now next of second Node refers to third.  So all three
            nodes are linked.

         linkedList.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */
    }
}
