
public class linkedrevknode425 {
    public  static class Node {
        Node next;
        int value;
        Node previous;

        Node(int k) {
            value = k;
            next = null;
            previous = null;
        }

        Node head = null;
    }

    public static Node push(Node head, Node new_node) {
        new_node.previous = null;
        new_node.next = head;
        if (head != null) {
            head.previous = new_node;
        }
        head = new_node;
        return head;
    }
    public static Node reverselist(Node head, int k) {
        Node current = head;
        Node next = null;
        Node newHead = null;
        int count = 0;

        while (current != null && count < k) {
            next = current.next;
            newHead = push(newHead, current);// or you can reverse the list
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
        Node newNode2 = new Node(2);
        Node newNode3 = new Node(3);
        Node newNode4 = new Node(4);
        Node newNode5 = new Node(5);
        Node newNode6 = new Node(6);
        Node newNode7 = new Node(7);

        Node head = newNode1;
//        head=push(newNode1,newNode2);
//        head=push(newNode2,newNode3);
//        head=push(newNode3,newNode4);
//        head=push(newNode5,newNode6);
//        head=push(newNode6,newNode7);


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
