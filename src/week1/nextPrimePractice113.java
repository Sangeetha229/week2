package week1;

public class nextPrimePractice113 {
    public static int nextPrime1(int num) {

        if (num <= 1 || num == 2)
            return num + 1;
        num++;
        while (true) {
            boolean result= isPrime1(num);
            if (result == true)
                return num;
            else
            num++;
        }

    }

    public static boolean isPrime1(int num) {
        if (num < 2)
            return false;


        for (int i = 2; i <= Math.sqrt(num); i++) {
            if ((num % i) == 0)
                return false;

        }
        return true;
    }
}
