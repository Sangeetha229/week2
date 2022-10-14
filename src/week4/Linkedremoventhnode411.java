package week4;

public class Linkedremoventhnode411 {
    public static class Node {
        Node next;
        int value;
        Node(int k) {
            value = k;
            next = null;
        }

        Node head = null;
    }

    public static Node removeNthFromEnd(Node head, int n)
    {

        Node list=head;
        Node list1=head;
        int length=0;
        while(list!=null){
            length++;
            list=list.next;
        }

        int count=length-n;
        if (count==0)
            return head.next;

        for(int i=1;i<count;i++)
        {
            list1=list1.next;

        }
        //while(list!=null &&list.next.next!=null)
            list1.next=list1.next.next;

        return head;


    }
    public static void main(String[] args) {
        Node newNode1 = new Node(1);
        Node newNode2 = new Node(2);
        Node newNode3 = new Node(2);
        Node newNode4 = new Node(3);
        Node newNode5 = new Node(4);
        Node newNode6 = new Node(5);

        Node head = newNode1;
        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;
        newNode4.next = newNode5;
        newNode5.next = newNode6;
       int k=2;
        Node returnlist=removeNthFromEnd(head,k);
        while(returnlist!=null){
            System.out.println  (returnlist.value);
            returnlist=returnlist.next;
        }
    }
}
