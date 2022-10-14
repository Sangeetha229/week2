package week1;

import java.lang.*;

public class substring1122 {

    public static boolean substring_func(String s1, String s2) {
        if (s1.equals("") || s2.equals(""))
            return false;
        if (s2.length() < 1)
            return true;

        boolean flag = false;


        loop1:
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                for (int j = 1, x = i + 1; j < s2.length(); j++, x++) {
                    if (s1.charAt(x) != s2.charAt(j))
                        // do not break loop, just continue from main
                        // outer loop, not inner loop, hence the label
                        continue loop1;
                    if (j == s2.length() - 1) {
                        flag = true;
                        return flag;

                    }
                }
            }

        }
        return flag;
    }

    // Driver Code
    public static void main(String[] args) {
        String s1 = "laboratory";
        String s2 = "rat";
        //String s1="cat";
        //String s2="meow";
        boolean result = substring_func(s1, s2);
        System.out.println(result);
    }

}