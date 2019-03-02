package data_structures.linked_list.singly.examples;

import java.util.*;

public class LinkedList {

    private Node head;  // head of list

    /* Linked list Node*/
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
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

    // Returns true if there is a loop in linked
    // list else returns false.
    private boolean detectLoopBrute() {
        Node h = head;
        HashSet<Node> s = new HashSet<>();
        long x = System.nanoTime();
        while (h != null) {
            // If we have already has this node
            // in HashMap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if (s.contains(h)){
                return true;
            }
            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);

            h = h.next;
        }

        return false;
    }

    // This is the fastest method. Traverse linked list using two pointers.
    // Move one pointer by one and other pointer by two.
    // If these pointers meet at same node then there is a loop.
    // If pointers do not meet then linked list does'nt have loop.
    private boolean detectLoopOptimize() {
        Node slow_p = head, fast_p = head;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                return true;
            }
        }
        return false;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.push(1);
        llist.push(1);
        llist.push(1);
        llist.push(1);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        if (llist.detectLoopBrute())
            System.out.println("Loop found Using Brute");
        else
            System.out.println("No Loop Using Brute");

        if (llist.detectLoopOptimize())
            System.out.println("Loop found Using Floyd Cycle Algorithm");
        else
            System.out.println("No Loop Using Floyd Cycle Algorithm");

    }
}
