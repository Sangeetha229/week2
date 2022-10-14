import java.io.*;
import java.util.HashSet;

public class Hashsetpairwithgivensum2211 {
    static String arraySum(int[] array, int k) {
        HashSet<Integer> set = new HashSet<>();
        String S = "Null";
        if (array == null)
            return S;

        if (array.length == 0)
            return S;

        for (int i = 0; i < array.length; i++) {
            int rem = k - array[i];
            if (set.contains(rem)) {
                S = rem + " " + array[i];
            } else {
                set.add(array[i]);
            }
        }//for loop
        return S;
    }//method arraySum

    public static void main(String[] args) {
        int array[] = {3, 2, 6, 9, 5};
        int X = 9;
        // int array[]={};
        //nt[] array = null;
//int[]  array = new int[0];
        //String sum=new String();

        String sum = arraySum(array, X);
        System.out.println(sum);

    }
}


