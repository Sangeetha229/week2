package week2;

import java.util.*;

public class longestsubsequenceHashMapDuplicate212noneed {

    static int findLongestConseqSubseq(int array[]) {
        int n = array.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSequence = 0;
        Arrays.sort(array);
        System.out.print("Elements in array :");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {

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
        }
        System.out.println();
        for (int i = 0; i < n; i++) {

            int count = 1;
            //int mapcount=0;
            //int z=array[i]-1;
            //Takes first value from given array(sorted) { 1, 9, 3, 10, //4, 20, 2 } and checks in map
            //if(map.containsKey(array[i]-1))continue;
            int y = array[i];
            while (map.containsKey(++y)) {
                int x = map.get(y);
                count = count + map.get(y);
            }


            maxSequence = Math.max(maxSequence, count);
        }

        return maxSequence;
    }


    // Driver Code
    public static void main(String args[]) {
        int arr[] = {1, 9, 2, 3, 3, 10, 4, 20, 2};
        int n = arr.length;
        System.out.println("array length:" + n);
        System.out.println(
                "Length of the Longest consecutive subsequence is "
                        + findLongestConseqSubseq(arr));
    }
}
