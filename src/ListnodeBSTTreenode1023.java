import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*class ListNode {
      int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }*/



  /* class Treenode {
      int val;
     Treenode left;
     Treenode right;
     Treenode() {}
     Treenode(int val) { this.val = val; }Treenode(int val, Treenode left, Treenode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

*/

public class ListnodeBSTTreenode1023 {
    public static Treenode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp=null;

        //find the mid node
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            temp = slow;
            slow = slow.next;
        }

        if(temp!=null)
            temp.next = null; //break the link
        else
            head=null;

        Treenode root = new Treenode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }

    static void levelorder(Treenode root) {
        if (root == null)
            return;

        Queue<Treenode> q1 = new LinkedList<>();

        q1.add(root);

        while (true) {

            int nodeCount = q1.size();
            if (nodeCount == 0)
                break;
            while (nodeCount>0) {

                Treenode tempnode = q1.peek();
                System.out.print(tempnode.val + " ");
                q1.remove();

                if (tempnode.left != null)
                    q1.add(tempnode.left);


                if (tempnode.right != null)
                    q1.add(tempnode.right);


                nodeCount--;

            }
        }
    }
    public static void main(String[] args) {
            ListNode newNode1 = new ListNode(-10);
            ListNode newNode2 = new ListNode(-3);
            ListNode newNode3 = new ListNode(0);
            ListNode newNode4 = new ListNode(5);
            ListNode newNode5 = new ListNode(9);

            ListNode head = newNode1;
            newNode1.next = newNode2;
            newNode2.next = newNode3;
            newNode3.next = newNode4;
            newNode4.next = newNode5;

        Treenode resulttree=sortedListToBST(head);
            levelorder(resulttree);

    }
}
