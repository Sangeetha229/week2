public class isPalindrome1241 {


    public static boolean palindrome_func(String s) {
        if (s == null)
            return false;
        s = s.toLowerCase();
        int end = s.length() - 1;
        char[] charArray = s.toCharArray();
        int start = 0;
        while (start < end) {

            while (start < end && !Character.isLetterOrDigit(charArray[start]))
                start++;
            while (end >= 0 && !Character.isLetterOrDigit(charArray[end]))
                end--;
            if (start < end && charArray[start++] != charArray[end--])
                return false;

        }
        return true;
    }

    // Driver Code
    public static void main(String[] args) {
        //String  s =  "A man, a plan, a canal: Panama";
        String s = "race a car";
        System.out.println(palindrome_func(s));
    }

}