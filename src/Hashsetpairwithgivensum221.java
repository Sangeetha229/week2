import java.util.HashSet;

public class Hashsetpairwithgivensum221 {
    static void arraySum(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        String S = "Null";
        if (arr == null)
            return;

        if (arr.length == 0)
            return;

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int rem = k - arr[i];
            if (set.contains(rem)) {
                System.out.println(arr[i] + "," + rem);
                break;
            }
        }

    }

    public static void main(String[] args) {
        int array[] = {3, 2, 6, 9, 6, 5};
        int X = 9;
        // int array[]={};
        //int[] array = null;
//int[]  array = new int[0];
        //String sum=new String();

        arraySum(array, X);
        //System.out.println(sum);

    }
}



