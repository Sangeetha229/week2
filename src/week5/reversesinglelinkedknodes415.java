package week5; class ListNode {
    int val;
    ListNode next,prevptr;
    ListNode() {}
    ListNode(int val){
     this.val = val; }
     ListNode(int val, ListNode next,ListNode prevptr)
     {
     this.val = val;
     this.next = next;
         this.prevptr = prevptr;}
}


public class reversesinglelinkedknodes415 {
    public ListNode reverseKGroup(ListNode head, int k) {

            ListNode start = head;
            int size = 0;
            while (start != null) {
                start = start.next;
                size++;
            }
            if (size<k)
                return head;

        int count = 0;
        ListNode current = head;
        ListNode nextNode = null, prevNode = null;
        //usual linked list reversal

        while (current != null && count < k) {
           //for singly
            /* nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
            count++;*/
// for doubly
            nextNode = current.next;
            nextNode.prevptr=current;
           current.next = prevNode;
           /*if (current.next.prevptr!=null)
            current.next.prevptr=current;
           if(prevNode.prevptr!=null)
               prevNode.prevptr=current;*/

            prevNode = current;
            current = nextNode;
            count++;
        }
        //the head of the original list will now be the tail of the reversed linked list of size k
        // and the next of that head is recursively assigned to what the function returns (prev)
        if (nextNode != null) {
            ListNode temp = reverseKGroup(nextNode, k);
            head.next = temp;
            head.next.prevptr = head;// added for doubly linked list
        }
        return prevNode;
    }


    public static void main(String... args) {
        ListNode newNode1 = new ListNode(1);
        ListNode newNode2 = new ListNode(2);
        ListNode newNode3 = new ListNode(3);
        ListNode newNode4 = new ListNode(4);
        ListNode newNode5 = new ListNode(5);
       // ListNode newNode6 = new ListNode(6);

        ListNode head = newNode1;
        newNode1.next = newNode2;
        newNode2.prevptr = newNode1;
        newNode2.next = newNode3;
        newNode3.prevptr = newNode2;
        newNode3.next = newNode4;
        newNode4.prevptr = newNode3;
        newNode4.next = newNode5;
        newNode5.prevptr = newNode4;
        //newNode5.next = newNode6;
        reversesinglelinkedknodes415 obj=new reversesinglelinkedknodes415();
        ListNode returnlist = obj.reverseKGroup(head,3);
        while (returnlist != null) {
            System.out.println(returnlist.val);
            returnlist = returnlist.next;
        }
    }
}
