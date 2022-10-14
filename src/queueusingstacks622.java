import java.util.Stack;

public class queueusingstacks622 {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public queueusingstacks622() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        queueusingstacks622 myQueue = new queueusingstacks622();
//        int[] keys = { 1, 2, 3, 4, 5 };
//        for (int key: keys) {
//            myQueue.push(key);
//        }

        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(5);
        int p = myQueue.peek(); // return 1
        System.out.println("Peek value " + p);
        int popvalue = myQueue.pop(); // return 1, queue is [2]
        System.out.println("Pop value " + popvalue);
        boolean emptyornot = myQueue.empty(); // return false
        System.out.println("Stack empty? " + emptyornot);
    }
}
//q.push(5) -> No Return
//        q.push(2) -> No Return
//        q.peek() -> 5
//        q.pop() -> 5
//        q.empty() -> False
//        q.pop() -> 2

//    HAPPY CASE
//q = Queue()
//        q.push(1) -> No Return
//        q.pop() -> 1
//        q.empty() -> True
//        q.empty() -> True
//
//        EDGE CASE
//        q = Queue()
//        q.empty() -> True