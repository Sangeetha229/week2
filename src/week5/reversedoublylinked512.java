package week5;

public class reversedoublylinked512 {

    static class Node {
        Node next;
        int value;
        Node previous;

        Node(int k) {
            value = k;
            next = null;
            previous = null;
        }

        Node head;
    }

    static Node push(Node newHead, Node current) {
        Node head = newHead;
        Node new_node = current;
        new_node.previous = null;
        new_node.next = head;
        if (head != null) {
            head.previous = new_node;
        }
        head = new_node;
        return head;
    }

    static Node reverselist(Node head, int k) {
        Node current = head;
        Node next = null;
        Node newHead = null;
        int count = 0;

        while (current != null && count < k) {
            next = current.next;
            newHead = push(newHead, current);
            current = next;
            count++;
        }
        if (next != null) {
            head.next = reverselist(next, k);
            head.next.previous = head;
        }
        return newHead;
    }

    public static void main(String... args) {
        Node newNode1 = new Node(1);
        reversedoublylinked512 obj=new reversedoublylinked512();
        Node newNode2  = new Node(2);
        obj.push(newNode2, newNode1);

        Node newNode3 = new Node(3);
        Node newNode4 = new Node(4);
        Node newNode5 = new Node(5);
        Node newNode6 = new Node(6);
        Node newNode7 = new Node(7);

        Node head = newNode1;
        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;
        newNode4.next = newNode5;
        newNode5.next = newNode6;
        newNode6.next = newNode7;

        head = reverselist(head, 3);
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}
