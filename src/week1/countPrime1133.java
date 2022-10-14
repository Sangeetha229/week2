package week1;

public class countPrime1133 {

    // Function to print prime numbers in the range of a given number `n`
    public static int sieveOfEratosthenes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // print primes less than 100
        System.out.println(sieveOfEratosthenes(7));
    }
}