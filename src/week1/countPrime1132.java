package week1;

public class countPrime1132 {

    // Function to print prime numbers in the range of a given number `n`
    public static void sieveOfEratosthenes(int n) {
        int[] a = new int[n + 1];

        for (int i = 0; i <= n; i++) {      // initialize all numbers as prime
            a[i] = 1;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (a[i] == 1)                  // checks if `i` is prime
            {
                for (int j = 2; i * j <= n; j++) {
                    a[i * j] = 0;           // multiples of `i` are not prime
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (a[i] == 1) {
                count++;
                System.out.print(i + " ");  // prints primes
            }
            // prints primes
        }
        System.out.print("COUNT:" + count);
    }

    public static void main(String[] args) {
        // print primes less than 100
        sieveOfEratosthenes(10);
    }
}