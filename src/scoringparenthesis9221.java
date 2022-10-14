import java.util.*;

public class scoringparenthesis9221 {
    public static int scoreOfParentheses(String s) {

        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(0);
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                stack.push(val2 + Math.max(val1 * 2, 1));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        int result;
        String s = "(()(()))";
        result = scoreOfParentheses(s);

        System.out.print(result);
    }

}
