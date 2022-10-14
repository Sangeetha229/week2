package week2;

import java.util.*;

public class longestsubsequenceHashSetNoDuplicate212 {
    // Returns length of the longest
    // consecutive subsequence

    static int findLongestConseqSubseq(int array[]) {
        HashSet<Integer> set = new HashSet<>();
        int maxSequence = 0;

        for (int x : array)
            set.add(x);

        for (int x : set) {
            int count = 1;

            //if(set.contains(x-1))
            // continue;

            while (set.contains(++x)) {
                count++;
                // x++;
            }

            maxSequence = Math.max(maxSequence, count);
        }

        return maxSequence;
    }


    // Driver Code
    public static void main(String args[]) {
        //int arr[] = {1, 9, 3, 10, 4, 20, 2};
        int arr[]={3, 9, 50, 2, 8, 4, 1};
        //int n = arr.length;
        System.out.println(
                "Length of the Longest consecutive subsequence is "
                        + findLongestConseqSubseq(arr));
    }
}
  //  Time Complexity: O(n). At the first glance, the while loop inside the for loop may seem like the time complexity is O(n * n). However, the while loop is only reached when the currentNum is the first of a subsequence, the while loop can only run for n iterations throughout the entire runtime of the function. So the runtime is actually O(n+n) = O(n).
     //   Space Complexity: O(n)