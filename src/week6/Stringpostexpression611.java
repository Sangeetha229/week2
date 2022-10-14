package week6;

import java.util.Stack;
import java.lang.*;

public class Stringpostexpression611 {
    public static int evalRPN(String[] tokens) {

        if (tokens.length == 1) {
            int number = Integer.parseInt(tokens[0]);
            return number;
        }

        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")) {


                int number2 = stack.pop();
                int number1 = stack.pop();


                switch (tokens[i]) {
                    case "+":
                        result = number1 + number2;
                        break;
                    case "-":
                        result = number1 - number2;
                        break;
                    case "*":
                        result = number1 * number2;
                        break;
                    case "/":
                        result = number1 / number2;
                        break;
                }
                stack.push(result);
            } else {
                int number = Integer.parseInt(tokens[i]);
                stack.push(number);
            }

        } //for
        return result;
    }

    public static void main(String[] args) {
//creating an instance of Stack class
        String[] arr = {"5", "1", "2", "+", "4", "*", "+", "3", "-"};
        //String str= "512+4*+3-";
        int result = evalRPN(arr);
        System.out.println(result);
    }


}//class