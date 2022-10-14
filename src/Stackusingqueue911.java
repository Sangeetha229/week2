import java.util.*;

public class Stackusingqueue911 {

    private static Queue<Integer> q1;

    public Stackusingqueue911() {
        q1 = new LinkedList<>();
        //sz = q1.size();

    }


    public static void push(int x) {
        q1.add(x);

        int sz = q1.size();
        System.out.println("queue value before" + q1);
        while (sz > 1) {
            q1.add(q1.remove());
            sz--;

        }
        System.out.println("queue value After" + q1);
    }

    public static int pop() {
        if (!q1.isEmpty())

            return (q1.remove());
        else return -1;
    }

    public static int top() {
        if (!q1.isEmpty())
            return q1.peek();
        else return -1;
    }

    /* public boolean empty () {
         return(q1.isEmpty());
     }*/
    public static boolean empty() {
        if (q1.size() == 0)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Stackusingqueue911 mystack = new Stackusingqueue911();

        Stackusingqueue911.push(1);
        Stackusingqueue911.push(2);
        Stackusingqueue911.push(3);
        //Stackusingqueue911.push(4);
        // Stackusingqueue911.push(5);
        int p = Stackusingqueue911.top(); // return 3
        System.out.println("Top value " + p);
        int popvalue = Stackusingqueue911.pop(); // return 3, queue is [2]
        System.out.println("Pop value " + popvalue);

        boolean emptyornot = Stackusingqueue911.empty(); // return false
        System.out.println("Stack empty? " + emptyornot);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */