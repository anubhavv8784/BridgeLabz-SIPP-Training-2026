class Solution {

    public static Node deleteNode(Node head, int key) {

        if (head == null)
            return null;

        if (head.val == key)
            return head.next;

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.val != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }
}