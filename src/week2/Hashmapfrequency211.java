import java.util.*;

public class Hashmapfrequency211 {

    public static int frequency(int[] array, int k) {
        if (array.length == 0 || k == 0 || k > array.length)
            return -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length - 1; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else
                map.put(array[i], 1);

            if (map.get(array[i]) == k) {
                return array[i];
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        //String  s =  "A man, a plan, a canal: Panama";
        int array[] = {8, 7, 9, 6, 7, 5, 1};
        int k = 2;
        System.out.println(frequency(array, k));
    }
}

