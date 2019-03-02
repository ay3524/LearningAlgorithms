package data_structures.linked_list.singly.core;

// A simple Java program for traversal of a linked list
class LinkedList {
    // head of list
    Node head;

    /* This function prints contents of linked list starting from head */
    void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    /* Function to get the nth node from end of list */
    private void printNthFromLast(int n) {
        Node main_ptr = head;
        Node ref_ptr = head;

        int count = 0;
        if (head != null) {
            //First move reference pointer to n nodes from head
            while (count < n) {
                if (ref_ptr == null) {
                    System.out.println(n + " is greater than the no " +
                            " of nodes in the list");
                    return;
                }
                ref_ptr = ref_ptr.next;
                count++;
            }
            //move both pointers one by one until reference pointer reaches end
            while (ref_ptr != null) {
                main_ptr = main_ptr.next;
                ref_ptr = ref_ptr.next;
            }
            System.out.println("Node no. " + n + " from last is " +
                    main_ptr.data);
        }
    }

    /* Inserts a new Node at front of the list. */
    private void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /*Drier program to test above methods */
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        for (int i = 50; i >= 0; i--) {
            linkedList.push(i);
        }

        linkedList.printNthFromLast(3);
        linkedList.printMiddle();
    }

     private void printMiddle() {
        Node slow_ptr = head;
        Node fast_ptr = head;
        if (head != null) {
            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" +
                    slow_ptr.data + "] \n");
        }
    }
}
