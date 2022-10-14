package week1;

import java.util.Scanner;

public class countPrime1131 {
    public static int countPrimes(int num) {
        boolean[] primeArray = new boolean[num];
        int count = 0;
        for (int i = 0; i < primeArray.length; i++) {
            primeArray[i] = true;

        }
        for (int i = 2; i < num; i++) {
            if (primeArray[i] == true) {
                count++;
                for (int j = 2; i * j < num; j++) {
                    primeArray[i * j] = false;

                }
            }
        }
        return count;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        int num = sc.nextInt();

        System.out.println(countPrimes(num));
    }
}