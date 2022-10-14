package week4;

public class Linkedaddnumbers4_1_3 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // int sum = 0;
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode curr=dummy;
        if(l1 == null && l2 == null)
            return null;
        while (l1 != null || l2 != null) {
            int x;
            int y;

            if (l1 != null)
                x = l1.val;
            else
                x = 0;

            if (l2 != null)
                y = l2.val;
            else
                y = 0;

            int sum = carry + x + y;

            //if (sum>9)
            carry = sum / 10;


            ListNode newnode=new ListNode(sum%10);
            curr.next = newnode;
            curr = curr.next;

            if(l1!=null)
                l1 = l1.next;

            if(l2!=null)
                l2 = l2.next;

        }

        if( l1 == null && l2 == null && carry>0)
            //ListNode  newnode=new ListNode(carry);
            curr.next = new ListNode(carry);

        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode newNode1 = new ListNode(1);
        ListNode newNode2 = new ListNode(2);
        ListNode newNode3 = new ListNode(5);

        ListNode list1 = newNode1;
        newNode1.next = newNode2;
        newNode2.next = newNode3;


        ListNode newNode4 = new ListNode(2);
        ListNode newNode5 = new ListNode(4);
        ListNode newNode6 = new ListNode(8);

        ListNode list2 = newNode4;
        newNode4.next = newNode5;
        newNode5.next = newNode6;

        ListNode returnlist = addTwoNumbers(list1, list2);
        while (returnlist != null) {
            System.out.print(returnlist.val);
            System.out.print(" ");
            returnlist = returnlist.next;
        }

    }
}
