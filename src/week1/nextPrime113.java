package week1;

import java.util.Scanner;
import java.lang.Math;

public class nextPrime113 {

    public static int nextPrime(int num) {

        if (num <= 1||num == 2 )
            return num+1;
        num++;
        while (true) {
            boolean flag = isPrime(num);
            if (flag ==true)
                return num;
            num++;
        }

    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
//        if (num == 2 || num == 3)
//            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if ((num % i) == 0)
                return false;

                 }
        return true;
    }

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        int num = sc.nextInt();

        System.out.println("Next prime number is: " + nextPrime(num));
    }
}
   /* Given a number, return the next smallest prime number

        Note: A prime number is greater than one and has no other factors other than 1 and itself.

        Examples:

        Input: 3
        Output: 5

        Time Complexity: O(√n)

The overall time complexity of the problem depends largely on the input value.
However, the best time complexity of is_prime is O(√n)
Space Complexity: O(1)

No data structures are needed in this problem

    */