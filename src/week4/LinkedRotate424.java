package week4;

public class LinkedRotate424 {

    public static class ListNode {
        ListNode next;
        int val;

        ListNode(int k) {
            val = k;
            next = null;
        }

        ListNode head = null;
    }

    public static ListNode rotateRight(ListNode head, int k) {
        ListNode h = head;

        if (h == null || k == 0) {
            return h;
        }
        int count = 1;

        while (h.next != null) {
            h = h.next;
            count++;
        }
        if (count == k)
            return head;

       // h.next = head;
        k = k > count ? k % count : k;

        ListNode temp = head;

        for (int i = 1; i < count - k; i++) {
            temp = temp.next;
        }
        ListNode new_head = temp.next;
        temp.next = null;

        ListNode p=new_head;
        while(p.next!=null) {
            p=p.next;
             }
             p.next=head;
        return new_head;
    }

    public static void main(String[] args) {
        ListNode newNode1 = new ListNode(1);
        ListNode newNode2 = new ListNode(2);
        ListNode newNode3 = new ListNode(3);
        ListNode newNode4 = new ListNode(4);
        ListNode newNode5 = new ListNode(5);
        ListNode newNode6 = new ListNode(6);

        ListNode head = newNode1;
        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;
        newNode4.next = newNode5;
        newNode5.next = newNode6;

        ListNode returnlist = rotateRight(head, 2);
        while (returnlist != null) {
            System.out.println(returnlist.val);
            returnlist = returnlist.next;
        }

    }


}
   // Time Complexity – Best Case: O(N)

     //   Space Complexity – Best Case: O(1)