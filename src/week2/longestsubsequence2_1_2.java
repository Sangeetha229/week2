package week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class longestsubsequence2_1_2 {
    static int findLongestConseqSubseq(int array[]) {
        int n = array.length;
        //HashMap<Integer, Integer> map = new HashMap<>();
        int maxSequence = 0;
        Arrays.sort(array);
        System.out.print("Elements in array :");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("Elements in array :");
       int  currentStreak1=1;
        for (int i = 1; i < n; i++) {

            int difference = array[i] - array[i - 1];

            if (array[i] == array[i - 1])
               // currentStreak1 += 1; //to count duplicates
                  continue; // not to count duplicates
            else if (difference == 1)
                currentStreak1 += 1;
            else {
                maxSequence = Math.max(maxSequence, currentStreak1);
                currentStreak1 = 1;
            }

        }
        return maxSequence;
    }

    // Driver Code
    public static void main(String args[]) {
        int arr[] = {1, 9, 2, 3, 10, 4, 20,11,12,13};
        int n = arr.length;
        System.out.println("array length:" + n);
        System.out.println(
                "Length of the Longest consecutive subsequence is "
                        + findLongestConseqSubseq(arr));
    }
}
    //Time Complexity: O(n log n)
    //    Space Complexity: O(1)
