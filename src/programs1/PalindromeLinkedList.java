package programs1;

public class PalindromeLinkedList {
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

    public static boolean isPalindrome(ListNode head) {
        int fullLength = getLength(head);
        if (fullLength == 1)
            return true;
        int[] firstHalf = new int[fullLength / 2];
        int currentIndex = 0;
        while (currentIndex < (fullLength / 2)) {
            firstHalf[currentIndex] = head.val;
            head = head.next;
            currentIndex++;
        }

        while (currentIndex > 0) {
            if (fullLength % 2 == 0) {
                if (head.val != firstHalf[currentIndex - 1]) {
                    return false;
                }
            } else {
                //currentNode--;
                if (head.next.val != firstHalf[currentIndex - 1]) {
                    return false;
                }
            }

            head = head.next;
            currentIndex--;
        }

        if (currentIndex != 0) {
            return false;
        }

        return true;
    }

    public static int getLength(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            if (node.next == null) {
                return length;
            }
            node = node.next;
        }
        return length;
    }

    public static void main(String[] args) {
        ListNode newNode1 = new ListNode(1);
        ListNode newNode2 = new ListNode(2);
        ListNode newNode3 = new ListNode(2);
        ListNode newNode4 = new ListNode(3);
        ListNode newNode5 = new ListNode(4);
        ListNode newNode6 = new ListNode(5);

        ListNode head = newNode1;
        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;
        newNode4.next = newNode5;
        newNode5.next = newNode6;

        boolean returnlist = isPalindrome(head);
        //while(head!=null){
        System.out.println(returnlist);
//    }
    }
}
