
import java.util.Arrays;
import java.util.Collections;

public class kthsmallelement821 {

    public static int findKthsmallest(int[] nums, int k) {
        k = k - 1;
        return quickselect(nums, 0, nums.length - 1, k);
    }

    //using quick sort
    public static int quickselect(int[] nums, int l, int r, int k) {


        int pos = partition(nums, l, r);

        if (pos == k)
            return nums[k];
        else if (k < pos) { //if kindex is less than pivot index sort  low to pivot-1 position
            return quickselect(nums, l, pos - 1, k);
        } else return quickselect(nums, pos + 1, r, k);


    }

    public static int partition(int[] arr, int l,
                                int r) {
        int pivot = arr[r], i = l;
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] <= pivot) {
                // Swapping arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        // Swapping arr[i] and arr[r]
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.print("K'th smallest element is " + findKthsmallest(arr, k));
    }
}