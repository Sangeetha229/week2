package programs1;

/*public class mergelist {
    public ListNode sortList(ListNode head) {
        //perform merge sort on heads
        //divide linked list into two parts
        //divide into two halfes
        //call sort recursively
        //merge them

        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;//to divide the linked list
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null; //making the next node null breaks the linked list

        ListNode leftPart = sortList(head);
        ListNode rightPart = sortList(slow);

        return merge_util(leftPart, rightPart);

    }

    public ListNode merge_util(ListNode left, ListNode right) {
        ListNode dummy_head = new ListNode(0);
        ListNode temp_head = dummy_head;

        while (left != null && right != null) {
            if (left.val < right.val) {
                temp_head.next = left;
                left = left.next;
            } else {
                temp_head.next = right;
                right = right.next;
            }
            temp_head = temp_head.next;
        }

        //check for remained nodes
        while (left != null) {
            temp_head.next = left;
            left = left.next;
            temp_head = temp_head.next;
        }
        while (right != null) {
            temp_head.next = right;
            right = right.next;
            temp_head = temp_head.next;
        }

        return dummy_head.next;
    }

    public static void main(String[] args) {
        Linkedremoventhnode411.Node newNode1 = new Linkedremoventhnode411.Node(1);
        Linkedremoventhnode411.Node newNode2 = new Linkedremoventhnode411.Node(2);
        Linkedremoventhnode411.Node newNode3 = new Linkedremoventhnode411.Node(2);
        Linkedremoventhnode411.Node newNode4 = new Linkedremoventhnode411.Node(3);
        Linkedremoventhnode411.Node newNode5 = new Linkedremoventhnode411.Node(4);
        Linkedremoventhnode411.Node newNode6 = new Linkedremoventhnode411.Node(5);

        Linkedremoventhnode411.Node head = newNode1;
        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;
        newNode4.next = newNode5;
        newNode5.next = newNode6;
        int k = 2;
        Linkedremoventhnode411.Node returnlist = removeNthFromEnd(head, k);
        while (returnlist != null) {
            System.out.println(returnlist.value);
            returnlist = returnlist.next;
        }
    }
}*/