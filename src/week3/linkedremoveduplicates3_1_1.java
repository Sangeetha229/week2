package week3;


class Node {
    Node next;
    int val;

    Node(int k) {
        val = k;
        next = null;
    }

    Node head = null;
}
public class linkedremoveduplicates3_1_1 {
    public static Node deleteDuplicates(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else
                temp = temp.next;

        }
        return head;
    }
    public static void main(String[] args) {
        Node newNode1 = new Node(1);
        Node newNode2 = new Node(1);
        Node newNode3 = new Node(2);
        Node newNode4 = new Node(2);
        Node newNode5 = new Node(3);
        Node newNode6 = new Node(3);

        Node head = newNode1;
        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;
        newNode4.next = newNode5;
        newNode5.next = newNode6;

        Node returnlist = deleteDuplicates(head);
        while (returnlist != null) {
            System.out.println(returnlist.val);
            returnlist = returnlist.next;
        }

    }
}
