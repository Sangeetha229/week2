import java.util.*;

public class reversewordsString723 {

    public static void main(String args[]) {
       //String str = "the   sky    is          blue";
        String str ="The weather is amazing        today!";
        String res = reverseWords(str);
        System.out.println(res);
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] newArray = s.split(" ");
        for (int i = newArray.length - 1; i >= 0; i--) {
            if (!newArray[i].isEmpty()) {
                sb.append(newArray[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

}