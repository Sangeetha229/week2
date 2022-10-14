import java.util.*;

public class Stacksort613 {
    // This function return the sorted stack
    public static Stack<Integer> sortstack(Stack<Integer> input) {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while (!input.isEmpty()) {
            // pop out the first element
            int mainstackvalue = input.pop();

            // while temporary stack is not empty and
            // top of stack is greater than temp
            while (!tmpStack.isEmpty() && tmpStack.peek()
                    < mainstackvalue) // to get small element on top  of stack ,it should be <tmp
            {
                // pop from temporary stack and
                // push it to the input stack
                input.push(tmpStack.pop());
            }

            // push temp in temporary of stack
            tmpStack.push(mainstackvalue);
        }
        return tmpStack;
    }

    // Driver Code
    public static void main(String args[]) {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        // This is the temporary stack
        Stack<Integer> tmpStack = sortstack(input);
        System.out.println("Sorted numbers are:");

        while (!tmpStack.empty()) {
            System.out.print(tmpStack.pop() + " ");
        }
    }
}