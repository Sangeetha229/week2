package week1;

/*Write a function that reverses a string.
        Examples:
        Input: "hello"
        Output: "olleh" */
public class reverseCharArray111 {

    public static String reverse(String s1) {

        char[] s = s1.toCharArray();
        int end = s.length - 1;
        int start = 0;
        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        String s3=new String(s);

        return s3;
    }
        // Driver Code

        public static void main (String[]args){
            String s = "hello";

            String result = reverse(s);
            System.out.println(result);
        }
    }