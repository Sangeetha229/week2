package week4;/*public class Linkedmergelist313 {

        public static class ListNode {
            ListNode next;
            int val;
            ListNode() {
            }

            ListNode(int k) {
                val = k;
                next = null;
            }

            ListNode head = null;
        }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode();
        ListNode temp= dummy;
        // ListNode  dummy=new ListNode();

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                // temp=temp.next;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                // temp=temp.next;
                list2=list2.next;
            }
            temp=temp.next;
        }
        while(list1!=null){
            temp.next=list1;
            temp=temp.next;
            list1=list1.next;
        }
        while(list2!=null){
            temp.next=list2;
            temp=temp.next;
            list2=list2.next;
        }

        return dummy.next;
    }

    public static void main (String...args) {

        ListNode newNode1 = new ListNode(1);
        ListNode newNode2 = new ListNode(2);
        ListNode newNode3 = new ListNode(3);

        ListNode list1 = newNode1;
        newNode1.next = newNode2;
        newNode2.next = newNode3;


        ListNode newNode4 = new ListNode(2);
        ListNode newNode5 = new ListNode(4);
        ListNode newNode6 = new ListNode(5);

        ListNode list2 = newNode4;
        newNode4.next = newNode5;
        newNode5.next = newNode6;

        ListNode returnlist=mergeTwoLists(list1,list2);
        while(returnlist!=null){
            System.out.print (returnlist.val);
            System.out.print(" ");
            returnlist=returnlist.next;
        }
    }
}
*/