class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class InsertNode {

    static void insertAfter(Node current, int value) {

        if (current == null)
            return;

        Node newNode = new Node(value);

        newNode.next = current.next;
        current.next = newNode;
    }
}