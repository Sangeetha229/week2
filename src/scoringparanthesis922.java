import java.util.*;

public class scoringparanthesis922 {
    public static int scoreOfParentheses(String s) {

        Stack<Integer> stk = new Stack<>();

        int score = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stk.push(score);
                score = 0;
            } else {
                score = stk.pop() + Math.max(score * 2, 1);
            }

        }
        return score;
    }

    public static void main(String[] args) {
        int result;
        String s = "(()(()))";
        result = scoreOfParentheses(s);

        System.out.print(result);
    }

}