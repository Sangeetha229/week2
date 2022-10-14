package week4;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }
}
    public class LinkedPalindrome4_2_2 {

        public static void main(String[] args) {

            ListNode n1_1 = new ListNode(1);
            System.out.println("Test cases 1 passed: " + isPalindrome(n1_1));

            ListNode n2_1 = new ListNode(1);
            ListNode n2_2 = new ListNode(2);
            n2_1.next = n2_2;
            System.out.println("test case 2 passed: " + !isPalindrome(n2_1));

            ListNode n3_1 = new ListNode(1);
            ListNode n3_2 = new ListNode(2);
            ListNode n3_3 = new ListNode(2);
            ListNode n3_4 = new ListNode(1);
            n3_1.next = n3_2;
            n3_2.next = n3_3;
            n3_3.next = n3_4;
            //boolean res = !isPalindrome(n3_1);
            System.out.println("test case 3 passed: " + !isPalindrome(n3_1));

            ListNode n4_1 = new ListNode(1);
            ListNode n4_2 = new ListNode(2);
            ListNode n4_3 = new ListNode(1);
            n4_1.next = n4_2;
            n4_2.next = n4_3;
            boolean res1 = isPalindrome(n4_1);
            System.out.println("test case 4 passed: " + isPalindrome(n4_1));
        }

        public static boolean isPalindrome(ListNode head) {
            ListNode temp1 = head;
            int fullLength = 0;
            while (temp1 != null) {
                fullLength++;
                temp1 = temp1.next;

            }
            ListNode temp = head;
            if (fullLength == 1)
                return true;
            int halflength = fullLength / 2;
            int[] firstHalf = new int[halflength];
            int count = 0;

            while (temp != null && count < halflength) {
                firstHalf[count] = temp.data;
                temp = temp.next;
                count++;
            }

            while (count>0) {
                if (fullLength % 2 == 0) {
                    if (temp.data != firstHalf[count - 1]) {
                        return false;
                    }
                } else {

                    if (temp.next.data != firstHalf[count - 1]) {
                        return false;
                    }

                }
                if (temp.next!=null)
                temp = temp.next;
                count--;
            }
            return true;
        }
    }

