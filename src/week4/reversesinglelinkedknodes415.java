package week4;
class ListNode1 {
    int val;
    ListNode1 next,prevptr;
    ListNode1() {}
    ListNode1(int val){
     this.val = val; }
     ListNode1(int val, ListNode1 next)
     {
     this.val = val; this.next = next; }
}


public class reversesinglelinkedknodes415 {
    public ListNode1 reverseKGroup(ListNode1 head, int k) {

            ListNode1 start = head;
            int size = 0;
            while (start != null) {
                start = start.next;
                size++;
            }
            if (size<k)
                return head;

        int count = 0;
        ListNode1 current = head;
        ListNode1 nextNode = null, prevNode = null;
        //usual linked list reversal

        while (current != null && count < k) {
           //for singly
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
            count++;
// for doubly
          /*
            nextNode = current.next;
            nextNode.prevptr=current;
            current.next = prevNode;
            //.prevptr=current;
            prevNode = current;
            current = nextNode;
            count++;*/
        }
        //the head of the original list will now be the tail of the reversed linked list of size k
        // and the next of that head is recursively assigned to what the function returns (prev)
        if (nextNode != null) {
            ListNode1 temp = reverseKGroup(nextNode, k);
            head.next = temp;
        }
        return prevNode;
    }


    public static void main(String... args) {
        ListNode1 newNode1 = new ListNode1(1);
        ListNode1 newNode2 = new ListNode1(2);
        ListNode1 newNode3 = new ListNode1(3);
        ListNode1 newNode4 = new ListNode1(4);
        ListNode1 newNode5 = new ListNode1(5);
       // ListNode newNode6 = new ListNode(6);

        ListNode1 head = newNode1;
        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;
        newNode4.next = newNode5;
        //newNode5.next = newNode6;
        reversesinglelinkedknodes415 obj=new reversesinglelinkedknodes415();
        ListNode1 returnlist = obj.reverseKGroup(head,3);
        while (returnlist != null) {
            System.out.println(returnlist.val);
            returnlist = returnlist.next;
        }
    }
}
