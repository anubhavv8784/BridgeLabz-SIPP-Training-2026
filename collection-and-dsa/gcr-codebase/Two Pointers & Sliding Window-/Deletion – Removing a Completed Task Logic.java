class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteNode {

    static Node delete(Node head, int key) {

        if (head == null)
            return null;

        if (head.data == key)
            return head.next;

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;

        return head;
    }
}