import java.util.*;
public class nextLargerNode5 {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> A = new ArrayList<>();

        for (ListNode node = head; node != null; node = node.next)
            A.add(node.val);

        int[] res = new int[A.size()];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.size(); ++i) {
            while (!stack.isEmpty() && A.get(stack.peek()) < A.get(i)) {
                int num1 = stack.peek();
                int num2 = A.get(i);
                res[stack.pop()] = A.get(i);
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode newNode1 = new ListNode(2);
        ListNode newNode2 = new ListNode(7);
        ListNode newNode3 = new ListNode(3);
        ListNode newNode4 = new ListNode(3);
        ListNode newNode5 = new ListNode(5);
        // newNode6 = new ListNode(6);

        ListNode head = newNode1;
        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;
        newNode4.next = newNode5;
        //.next = newNode6;
        nextLargerNode5 obj=new nextLargerNode5();
        int[] returnlist = obj.nextLargerNodes(head);
        int i=0;
        while (i<returnlist.length) {
            System.out.println(returnlist[i]);
            i++;
        }
    }
    }

