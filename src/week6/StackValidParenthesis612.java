package week6;

import java.util.*;

public class StackValidParenthesis612 {


    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                // Push the element in the stack
                stack.push(c);
                //continue;
            }

            if (stack.isEmpty())
                return false;


            char check;
            switch (c) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;


                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());

    }

    // Driver code
    public static void main(String[] args) {
        String expr = "(([{}])";

        // Function call
        if (isValid(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}


