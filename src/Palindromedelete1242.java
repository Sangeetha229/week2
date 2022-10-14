/*public class Palindromedelete1242 {

    public static boolean validPalindrome(String s) {
        if (s == null)
            return false;
        int startIndex = 0, endIndex = s.length() - 1;
        while (startIndex < endIndex) {
            if (s.charAt(startIndex) == s.charAt(endIndex)) {
                startIndex++;
                endIndex--;
            } else
                return isPalindrome(s, startIndex + 1, endIndex) || isPalindrome(s, startIndex, endIndex - 1);


        }
        return true;

    }

    public static boolean isPalindrome(String s, int i, int j) {
        int startIndex = i, endIndex = j;

        while (startIndex < endIndex) {
            if (s.charAt(startIndex) == s.charAt(endIndex)) {
                startIndex++;
                endIndex--;
            } else
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        //String  s =  "A man, a plan, a canal: Panama";
        // s = "abca";
        System.out.println(validPalindrome(s));
    }
}
*/
