package week3;

public class LinkedCycle312 {
    Node head; // head of list

    /* Linked list Node*/
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }


    }

    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public boolean hasCycle(Node head) {
        if (head == null || head.next == null)
            return false;

        Node slow = head;
        Node fast = head;
        //  while(fast.next!= null && fast.next != null){
//(or)

        while (fast != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String args[]) {
        LinkedCycle312 obj = new LinkedCycle312();

        obj.push(20);
        obj.push(4);
        obj.push(15);
        obj.push(10);

        /*Create loop for testing */
        obj.head.next.next.next.next = obj.head;

        boolean result = obj.hasCycle(obj.head);
        System.out.println(result);
    }
}


