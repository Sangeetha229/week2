/*public class LinkedRemoveDuplicates311 {
    public static class Node {
        Node next;
        int val;

        Node(int k) {
            val = k;
            next = null;
        }

        Node head = null;
    }

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

    public static void main(String... args) {

        Node newNode1 = new Node(2);
        Node newNode2 = new Node(7);
        Node newNode3 = new Node(4);
        Node newNode4 = new Node(3);
        Node newNode5 = new Node(5);
        //Node newNode6=new Node(6);
        //Node newNode7=new Node(7);

        Node head = newNode1;

        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;
        newNode4.next = newNode5;
        // newNode5.next=newNode6;
        // newNode6.next=newNode7;

        int[] result = nextLargerNodes(head);
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}*/



