public class maximumsubarraysum {
    // Returns length of the maximum length subarray with 0 sum
    static int maxLen(int arr[])
    {
        //Assign first value of an array
        int maxSum = arr[0];
        int current_sum = arr[0];
//Traverse an array
        for(int i = 1; i < arr.length; i++) {
//            if(sum < 0) {
//                    sum = arr[i];
//            } else {
//                sum = sum + arr[i];
//            }
            current_sum=Math.max(arr[i]+current_sum,arr[i]);
//get maxsum
            maxSum = Math.max(current_sum, maxSum);
        }
        return maxSum;
    }

    // Drive method
    public static void main(String arg[])
    {
        int arr[] = {1,2,-5,4,3,8,5};
        System.out.println("Maximum sum of  subarray is "
                + maxLen(arr));
    }
}
