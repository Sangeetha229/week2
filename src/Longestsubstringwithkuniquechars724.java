import java.util.*;

public class Longestsubstringwithkuniquechars724 {

    public static void main(String[] args) {
        String s = "araaci";
        int k = 1;
        int lastresult = lengthOfLongestSubstringKDistinct(s, k);
        System.out.println(lastresult);

    }

    static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int result = 0;
        int i = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

            if (map.size() <= k) {
                result = Math.max(result, j - i + 1);
            } else {
                while (map.size() > k) {
                    char l = s.charAt(i);
                    int count = map.get(l);
                    if (count == 1) {
                        map.remove(l);
                       // System.out.println("In if part");
                        //  for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                        //     System.out.println(entry.getKey()+" : "+entry.getValue());}
                    } else {
                        map.put(l, map.get(l) - 1);
                       // System.out.println("In else part");
                        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {

                        //   System.out.println(entry.getKey()+" : "+entry.getValue());
                    }
                    i++;
                }

            }

        }


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

            return result;



    }
}

