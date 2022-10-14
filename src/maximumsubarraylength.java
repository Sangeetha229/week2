
// to find maximum length of sub array having sum 0

import java.io.*;
import java.util.HashMap;

public class maximumsubarraylength {

    public static int maxSubArrayLen(int[] arr)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 0);
        int length = -1;
        int cumSum = 0;
       // int max_sum=0;

        for (int i = 0; i < arr.length; i++) {
            cumSum = cumSum + arr[i];

            if (hm.containsKey(cumSum)) {
                length = Math.max(length,
                        i + 1 - hm.get(cumSum));
            }
            else {
                hm.put(cumSum, i + 1);
            }
         //   max_sum= Math.max(max_sum,cumSum) ;

        }
     //   System.out.println(max_sum);
        return length;
    }
    public static void main(String[] args)
    {
        int[] arr
                = new int[] { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(maxSubArrayLen(arr));
    }
}
// Contributed by Bibhu Parambrahma Patra (bibhup)
