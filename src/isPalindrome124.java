public class isPalindrome124 {
    public static boolean palindrome_func(String s) {
        if (s == null)
            return false;
        int startIndex = 0, endIndex = s.length() - 1;
        while (startIndex < endIndex) {

            if (!Character.isLetterOrDigit(s.charAt(startIndex))) {
                startIndex++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(endIndex))) {
                endIndex--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(startIndex)) != Character.toLowerCase(s.charAt(endIndex)))
                return false;

            startIndex++;
            endIndex--;

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