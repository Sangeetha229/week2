package week1;

public class pow1_2_3 {
    public static double pow(double x, int n) {
        double result;
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        if (n%2 == 0){
            result=pow(x, n/2)*pow(x, n/2); //2^5 *2^5
        }
        else
             result=x*pow(x, n/2)*pow(x, n/2);  // if odd like 2^3 then 2* 2^1 *2^1

        return result;
    }

    public static void main (String[]args){

        double result = pow(2,-2); // 2^-2 or (1/2)^2
        System.out.println(result);
    }
}

   /* Time Complexity: O(logN), because we used fast modulo exponentiation that takes logarithmic time to compute the exponent over a base.
        We can also intuitively find the time complexity. Since we have divided the exponent until it became 0.
        Thus the time required is dependent on logN, where N is the exponent.

        Space Complexity: O(1), since we have used a single variable to store the answer, the space complexity is constant.*/