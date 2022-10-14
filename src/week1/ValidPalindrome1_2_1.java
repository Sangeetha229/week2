package week1;

public class ValidPalindrome1_2_1 {
    public static boolean isPalindrome(String s) {
        if(s==null)
            return false;
        int startIndex=0, endIndex=s.length()-1;
        while (startIndex<endIndex){

            if (!Character.isLetterOrDigit(s.charAt(startIndex))){
                startIndex++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(endIndex))){
                endIndex--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(startIndex))!= Character.toLowerCase(s.charAt(endIndex)))
                return false;

            startIndex++;
            endIndex--;

        }
        return true;

    }

    public static void main(String[] args) {
        //String  s =  "A man, a plan, a canal: Panama";
        String  s = "a,b,b,a";
        System.out.println(isPalindrome(s));
    }
}

