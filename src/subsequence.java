import java.util.HashSet;
import java.util.*;

public class subsequence {
    public static int findLongestConseqSubseq(int array[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSequence = 0;


        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {

                map.put(array[i], map.get(array[i]) + 1);
            } else
                map.put(array[i], 1);

        }

        System.out.println("Elements in HashMap");
        for (Map.Entry<Integer, Integer> set :
                map.entrySet()) {

            // Printing all elements of a Map
            System.out.println(set.getKey() + " = "
                    + set.getValue());
            for (int i = 0; i < array.length; i++) {
                int length = 1;
                int y = array[i];
                while (map.containsKey(++y)) {
                    int x = map.get(y);
                    //length++;
                    length = length + map.get(y);


                    //continue;
                }
                maxSequence = Math.max(maxSequence, length);
            }


        }
        return maxSequence;
    }

    // Driver Code
    public static void main(String args[]) {
        int arr[] = {1, 9, 10, 4, 3, 20, 2};
        int n = arr.length;
        System.out.println(
                "Length of the Longest consecutive subsequence is "
                        + findLongestConseqSubseq(arr));
    }
}
