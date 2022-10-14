public class LinkedremoveduplicateonlyDistinct314 {

    public static class Node {
        Node next;
        int value;
        Node(int k) {
            value = k;
            next = null;
        }

        Node head = null;
    }

    public static Node removeDuplicate(Node head) {
        Node dummyHead = new Node(0);
        dummyHead.next = head;
        Node prev = dummyHead;
        Node current = prev.next;

        while (current != null)
        {

            //when 2 values are equal move current pointer to next position so that prev.next !=current

            while (current.next != null && current.value == current.next.value)
            {

                current = current.next;
            }

            if (prev.next!=current)// remove duplicates
                prev.next = current.next;//current=2 and current.next=3(move prev 2 positions)
            else
                prev = prev.next;//else move one poistion

            current = current.next; //move current in both cases
        }
        return dummyHead.next;
    }
    public static void main(String[] args) {
        Node newNode1 = new Node(1);
        Node newNode2 = new Node(2);
        Node newNode3 = new Node(2);
        Node newNode4 = new Node(3);
        Node newNode5 = new Node(4);
        Node newNode6 = new Node(5);

        Node head = newNode1;
       newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;
        newNode4.next = newNode5;
        newNode5.next = newNode6;

        Node returnlist=removeDuplicate(head);
        while(returnlist!=null){
            System.out.println  (returnlist.value);
            returnlist=returnlist.next;
        }
    }
}
