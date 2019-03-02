package data_structures.linked_list.singly.examples;

public class LinkedListInsertion {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.pushInBeginning(2);
        node.pushInBeginning(3);
        node.pushInBeginning(4);
        node.pushInBeginning(5);

        node.printList();
    }
}
